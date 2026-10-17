package ch.qos.logback.core.net.server;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.CloseUtil;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.BlockingQueue;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
class RemoteReceiverStreamClient extends ContextAwareBase implements RemoteReceiverClient {
    private final String clientId;
    private final OutputStream outputStream;
    private BlockingQueue<Serializable> queue;
    private final Socket socket;

    public RemoteReceiverStreamClient(String str, OutputStream outputStream) {
        this.clientId = a.p("client ", str, ": ");
        this.socket = null;
        this.outputStream = outputStream;
    }

    private ObjectOutputStream createObjectOutputStream() throws IOException {
        return this.socket == null ? new ObjectOutputStream(this.outputStream) : new ObjectOutputStream(this.socket.getOutputStream());
    }

    @Override // ch.qos.logback.core.net.server.Client, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Socket socket = this.socket;
        if (socket == null) {
            return;
        }
        CloseUtil.closeQuietly(socket);
    }

    @Override // ch.qos.logback.core.net.server.RemoteReceiverClient
    public boolean offer(Serializable serializable) {
        BlockingQueue<Serializable> blockingQueue = this.queue;
        if (blockingQueue != null) {
            return blockingQueue.offer(serializable);
        }
        throw new IllegalStateException("client has no event queue");
    }

    @Override // java.lang.Runnable
    public void run() {
        StringBuilder sb6;
        addInfo(this.clientId + "connected");
        ObjectOutputStream objectOutputStreamCreateObjectOutputStream = null;
        try {
            try {
                try {
                    try {
                        objectOutputStreamCreateObjectOutputStream = createObjectOutputStream();
                        loop0: while (true) {
                            int i = 0;
                            while (!Thread.currentThread().isInterrupted()) {
                                try {
                                    objectOutputStreamCreateObjectOutputStream.writeObject(this.queue.take());
                                    objectOutputStreamCreateObjectOutputStream.flush();
                                    i++;
                                } catch (InterruptedException unused) {
                                }
                                if (i >= 70) {
                                    try {
                                        objectOutputStreamCreateObjectOutputStream.reset();
                                        break;
                                    } catch (InterruptedException unused2) {
                                        i = 0;
                                        Thread.currentThread().interrupt();
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        if (objectOutputStreamCreateObjectOutputStream != null) {
                            CloseUtil.closeQuietly(objectOutputStreamCreateObjectOutputStream);
                        }
                        close();
                        sb6 = new StringBuilder();
                    } catch (SocketException e) {
                        addInfo(this.clientId + e);
                        if (objectOutputStreamCreateObjectOutputStream != null) {
                            CloseUtil.closeQuietly(objectOutputStreamCreateObjectOutputStream);
                        }
                        close();
                        sb6 = new StringBuilder();
                    }
                } catch (IOException e2) {
                    addError(this.clientId + e2);
                    if (objectOutputStreamCreateObjectOutputStream != null) {
                        CloseUtil.closeQuietly(objectOutputStreamCreateObjectOutputStream);
                    }
                    close();
                    sb6 = new StringBuilder();
                }
            } catch (RuntimeException e4) {
                addError(this.clientId + e4);
                if (objectOutputStreamCreateObjectOutputStream != null) {
                    CloseUtil.closeQuietly(objectOutputStreamCreateObjectOutputStream);
                }
                close();
                sb6 = new StringBuilder();
            }
            sb6.append(this.clientId);
            sb6.append("connection closed");
            addInfo(sb6.toString());
        } catch (Throwable th10) {
            if (objectOutputStreamCreateObjectOutputStream != null) {
                CloseUtil.closeQuietly(objectOutputStreamCreateObjectOutputStream);
            }
            close();
            addInfo(this.clientId + "connection closed");
            throw th10;
        }
    }

    @Override // ch.qos.logback.core.net.server.RemoteReceiverClient
    public void setQueue(BlockingQueue<Serializable> blockingQueue) {
        this.queue = blockingQueue;
    }

    public RemoteReceiverStreamClient(String str, Socket socket) {
        this.clientId = a.p("client ", str, ": ");
        this.socket = socket;
        this.outputStream = null;
    }
}
