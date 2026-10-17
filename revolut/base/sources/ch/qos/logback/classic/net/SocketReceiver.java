package ch.qos.logback.classic.net;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.net.server.HardenedLoggingEventInputStream;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.DefaultSocketConnector;
import ch.qos.logback.core.net.SocketConnector;
import ch.qos.logback.core.util.CloseUtil;
import j6.a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes16.dex */
public class SocketReceiver extends ReceiverBase implements Runnable, SocketConnector.ExceptionHandler {
    private static final int DEFAULT_ACCEPT_CONNECTION_DELAY = 5000;
    private int acceptConnectionTimeout = 5000;
    private InetAddress address;
    private Future<Socket> connectorTask;
    private int port;
    private String receiverId;
    private int reconnectionDelay;
    private String remoteHost;
    private volatile Socket socket;

    private Future<Socket> activateConnector(SocketConnector socketConnector) {
        try {
            return getContext().getScheduledExecutorService().submit(socketConnector);
        } catch (RejectedExecutionException unused) {
            return null;
        }
    }

    private SocketConnector createConnector(InetAddress inetAddress, int i, int i2, int i3) {
        SocketConnector socketConnectorNewConnector = newConnector(inetAddress, i, i2, i3);
        socketConnectorNewConnector.setExceptionHandler(this);
        socketConnectorNewConnector.setSocketFactory(getSocketFactory());
        return socketConnectorNewConnector;
    }

    private void dispatchEvents(LoggerContext loggerContext) throws Throwable {
        HardenedLoggingEventInputStream hardenedLoggingEventInputStream;
        StringBuilder sb6;
        try {
            try {
                this.socket.setSoTimeout(this.acceptConnectionTimeout);
                hardenedLoggingEventInputStream = new HardenedLoggingEventInputStream(this.socket.getInputStream());
                try {
                    this.socket.setSoTimeout(0);
                    addInfo(this.receiverId + "connection established");
                    while (true) {
                        ILoggingEvent iLoggingEvent = (ILoggingEvent) hardenedLoggingEventInputStream.readObject();
                        Logger logger = loggerContext.getLogger(iLoggingEvent.getLoggerName());
                        if (logger.isEnabledFor(iLoggingEvent.getLevel())) {
                            logger.callAppenders(iLoggingEvent);
                        }
                    }
                } catch (EOFException unused) {
                    addInfo(this.receiverId + "end-of-stream detected");
                    CloseUtil.closeQuietly(hardenedLoggingEventInputStream);
                    CloseUtil.closeQuietly(this.socket);
                    this.socket = null;
                    sb6 = new StringBuilder();
                    sb6.append(this.receiverId);
                    sb6.append("connection closed");
                    addInfo(sb6.toString());
                } catch (IOException e) {
                    e = e;
                    addInfo(this.receiverId + "connection failed: " + e);
                    CloseUtil.closeQuietly(hardenedLoggingEventInputStream);
                    CloseUtil.closeQuietly(this.socket);
                    this.socket = null;
                    sb6 = new StringBuilder();
                    sb6.append(this.receiverId);
                    sb6.append("connection closed");
                    addInfo(sb6.toString());
                } catch (ClassNotFoundException e2) {
                    e = e2;
                    addInfo(this.receiverId + "unknown event class: " + e);
                    CloseUtil.closeQuietly(hardenedLoggingEventInputStream);
                    CloseUtil.closeQuietly(this.socket);
                    this.socket = null;
                    sb6 = new StringBuilder();
                    sb6.append(this.receiverId);
                    sb6.append("connection closed");
                    addInfo(sb6.toString());
                }
            } catch (Throwable th10) {
                th = th10;
                CloseUtil.closeQuietly((Closeable) null);
                CloseUtil.closeQuietly(this.socket);
                this.socket = null;
                addInfo(this.receiverId + "connection closed");
                throw th;
            }
        } catch (EOFException unused2) {
            hardenedLoggingEventInputStream = null;
        } catch (IOException e4) {
            e = e4;
            hardenedLoggingEventInputStream = null;
        } catch (ClassNotFoundException e5) {
            e = e5;
            hardenedLoggingEventInputStream = null;
        } catch (Throwable th11) {
            th = th11;
            CloseUtil.closeQuietly((Closeable) null);
            CloseUtil.closeQuietly(this.socket);
            this.socket = null;
            addInfo(this.receiverId + "connection closed");
            throw th;
        }
    }

    private Socket waitForConnectorToReturnASocket() throws InterruptedException {
        try {
            Socket socket = this.connectorTask.get();
            this.connectorTask = null;
            return socket;
        } catch (ExecutionException unused) {
            return null;
        }
    }

    @Override // ch.qos.logback.core.net.SocketConnector.ExceptionHandler
    public void connectionFailed(SocketConnector socketConnector, Exception exc2) {
        StringBuilder sb6;
        String string;
        if (exc2 instanceof InterruptedException) {
            string = "connector interrupted";
        } else {
            if (exc2 instanceof ConnectException) {
                sb6 = new StringBuilder();
                sb6.append(this.receiverId);
                sb6.append("connection refused");
            } else {
                sb6 = new StringBuilder();
                sb6.append(this.receiverId);
                sb6.append(exc2);
            }
            string = sb6.toString();
        }
        addInfo(string);
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public Runnable getRunnableTask() {
        return this;
    }

    public SocketFactory getSocketFactory() {
        return SocketFactory.getDefault();
    }

    public SocketConnector newConnector(InetAddress inetAddress, int i, int i2, int i3) {
        return new DefaultSocketConnector(inetAddress, i, i2, i3);
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public void onStop() {
        if (this.socket != null) {
            CloseUtil.closeQuietly(this.socket);
        }
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            LoggerContext loggerContext = (LoggerContext) getContext();
            while (!Thread.currentThread().isInterrupted()) {
                Future<Socket> futureActivateConnector = activateConnector(createConnector(this.address, this.port, 0, this.reconnectionDelay));
                this.connectorTask = futureActivateConnector;
                if (futureActivateConnector == null) {
                    break;
                }
                this.socket = waitForConnectorToReturnASocket();
                if (this.socket == null) {
                    break;
                } else {
                    dispatchEvents(loggerContext);
                }
            }
        } catch (InterruptedException unused) {
        }
        addInfo("shutting down");
    }

    public void setAcceptConnectionTimeout(int i) {
        this.acceptConnectionTimeout = i;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public void setReconnectionDelay(int i) {
        this.reconnectionDelay = i;
    }

    public void setRemoteHost(String str) {
        this.remoteHost = str;
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public boolean shouldStart() {
        int i;
        if (this.port == 0) {
            addError("No port was configured for receiver. For more information, please visit http://logback.qos.ch/codes.html#receiver_no_port");
            i = 1;
        } else {
            i = 0;
        }
        if (this.remoteHost == null) {
            i++;
            addError("No host name or address was configured for receiver. For more information, please visit http://logback.qos.ch/codes.html#receiver_no_host");
        }
        if (this.reconnectionDelay == 0) {
            this.reconnectionDelay = 30000;
        }
        if (i == 0) {
            try {
                this.address = InetAddress.getByName(this.remoteHost);
            } catch (UnknownHostException unused) {
                addError("unknown host: " + this.remoteHost);
                i++;
            }
        }
        if (i == 0) {
            StringBuilder sb6 = new StringBuilder("receiver ");
            sb6.append(this.remoteHost);
            sb6.append(":");
            this.receiverId = a.v(sb6, ": ", this.port);
        }
        return i == 0;
    }
}
