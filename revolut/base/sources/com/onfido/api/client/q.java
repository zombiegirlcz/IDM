package com.onfido.api.client;

import defpackage.v1;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes17.dex */
public final class q extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SSLSocketFactory f50148b;

    public q(KeyManagerFactory keyManagerFactory) {
        this.f50147a = 1;
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
            KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
            if (defpackage.q.d == null) {
                defpackage.q.d = new defpackage.q();
            }
            sSLContext.init(keyManagers, new TrustManager[]{defpackage.q.d}, null);
            this.f50148b = sSLContext.getSocketFactory();
        } catch (Exception e) {
            v1.b("load keystore error", e);
        }
    }

    public static Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.2"});
        }
        return socket;
    }

    public static void b(Socket socket) {
        if (socket == null || !(socket instanceof SSLSocket)) {
            return;
        }
        ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.2"});
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        switch (this.f50147a) {
            case 1:
                return a(this.f50148b.createSocket());
            default:
                return super.createSocket();
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        switch (this.f50147a) {
        }
        return this.f50148b.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        switch (this.f50147a) {
        }
        return this.f50148b.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        switch (this.f50147a) {
            case 0:
                Socket socketCreateSocket = this.f50148b.createSocket(socket, str, i, z);
                b(socketCreateSocket);
                return socketCreateSocket;
            default:
                return a(this.f50148b.createSocket(socket, str, i, z));
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        switch (this.f50147a) {
            case 0:
                Socket socketCreateSocket = this.f50148b.createSocket(str, i);
                b(socketCreateSocket);
                return socketCreateSocket;
            default:
                return a(this.f50148b.createSocket(str, i));
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        switch (this.f50147a) {
            case 0:
                Socket socketCreateSocket = this.f50148b.createSocket(str, i, inetAddress, i2);
                b(socketCreateSocket);
                return socketCreateSocket;
            default:
                return a(this.f50148b.createSocket(str, i, inetAddress, i2));
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        switch (this.f50147a) {
            case 0:
                Socket socketCreateSocket = this.f50148b.createSocket(inetAddress, i);
                b(socketCreateSocket);
                return socketCreateSocket;
            default:
                return a(this.f50148b.createSocket(inetAddress, i));
        }
    }

    public q(int i) throws NoSuchAlgorithmException, KeyManagementException {
        this.f50147a = i;
        switch (i) {
            case 1:
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                    if (defpackage.q.d == null) {
                        defpackage.q.d = new defpackage.q();
                    }
                    sSLContext.init(null, new TrustManager[]{defpackage.q.d}, null);
                    this.f50148b = sSLContext.getSocketFactory();
                } catch (Exception e) {
                    v1.b("load keystore error", e);
                    return;
                }
                break;
            default:
                SSLContext sSLContext2 = SSLContext.getInstance("TLS");
                sSLContext2.init(null, null, null);
                this.f50148b = sSLContext2.getSocketFactory();
                break;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        switch (this.f50147a) {
            case 0:
                Socket socketCreateSocket = this.f50148b.createSocket(inetAddress, i, inetAddress2, i2);
                b(socketCreateSocket);
                return socketCreateSocket;
            default:
                return a(this.f50148b.createSocket(inetAddress, i, inetAddress2, i2));
        }
    }
}
