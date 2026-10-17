package s0m;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class g extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f259029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SSLSocketFactory f259030b;

    public g(String[] versions) throws NoSuchAlgorithmException, KeyManagementException {
        Intrinsics.checkNotNullParameter(versions, "versions");
        this.f259029a = versions;
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "context.socketFactory");
        this.f259030b = socketFactory;
    }

    public final void a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(this.f259029a);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        Socket socketCreateSocket = this.f259030b.createSocket();
        Intrinsics.checkNotNullExpressionValue(socketCreateSocket, "internalSSLSocketFactory.createSocket()");
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.f259030b.getDefaultCipherSuites();
        Intrinsics.checkNotNullExpressionValue(defaultCipherSuites, "internalSSLSocketFactory.defaultCipherSuites");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.f259030b.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "internalSSLSocketFactory.supportedCipherSuites");
        return supportedCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket s2, String host, int i, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(s2, "s");
        Intrinsics.checkNotNullParameter(host, "host");
        Socket socketCreateSocket = this.f259030b.createSocket(s2, host, i, z);
        Intrinsics.checkNotNullExpressionValue(socketCreateSocket, "internalSSLSocketFactory…s, host, port, autoClose)");
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String host, int i) throws IOException {
        Intrinsics.checkNotNullParameter(host, "host");
        Socket socketCreateSocket = this.f259030b.createSocket(host, i);
        Intrinsics.checkNotNullExpressionValue(socketCreateSocket, "internalSSLSocketFactory.createSocket(host, port)");
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String host, int i, InetAddress localHost, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(localHost, "localHost");
        Socket socketCreateSocket = this.f259030b.createSocket(host, i, localHost, i2);
        Intrinsics.checkNotNullExpressionValue(socketCreateSocket, "internalSSLSocketFactory…  localPort\n            )");
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress host, int i) throws IOException {
        Intrinsics.checkNotNullParameter(host, "host");
        Socket socketCreateSocket = this.f259030b.createSocket(host, i);
        Intrinsics.checkNotNullExpressionValue(socketCreateSocket, "internalSSLSocketFactory.createSocket(host, port)");
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress address, int i, InetAddress localAddress, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(localAddress, "localAddress");
        Socket socketCreateSocket = this.f259030b.createSocket(address, i, localAddress, i2);
        Intrinsics.checkNotNullExpressionValue(socketCreateSocket, "internalSSLSocketFactory…  localPort\n            )");
        a(socketCreateSocket);
        return socketCreateSocket;
    }
}
