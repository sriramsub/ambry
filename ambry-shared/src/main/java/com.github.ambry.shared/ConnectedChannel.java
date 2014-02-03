package com.github.ambry.shared;

import com.github.ambry.network.Send;

import java.io.IOException;
import java.io.InputStream;

/**
 * A channel that is connected to a specific remote host and port.
 * The connected channel can be used to send a request and receive a response.
 * All connection management is done by the connection pool
 */
public interface ConnectedChannel {

  /**
   * Sends the request to a remote host
   * @param request The request that needs to be sent
   * @throws IOException
   */
  void send(Send request) throws IOException;

  /**
   * Receives a response from the remote host
   * @return The input stream that can be used to consume data from the remote host
   * @throws IOException
   */
  InputStream receive() throws IOException;

  /**
   * Gets the remote host that is channel is connected to
   * @return The remote host the channel is connected to
   */
  String getRemoteHost();

  /**
   * Gets the remote port that this channel is connected to
   * @return The remote port that this channel is connected to
   */
  int getRemotePort();
}