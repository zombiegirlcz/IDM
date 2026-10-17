package hcm;

import com.google.common.base.Preconditions;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f151248a = Collections.unmodifiableList(Arrays.asList(io.grpc.okhttp.internal.m.HTTP_2));

    public static SSLSocket a(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i, io.grpc.okhttp.internal.c cVar) throws SSLPeerUnverifiedException {
        Preconditions.checkNotNull(sSLSocketFactory, "sslSocketFactory");
        Preconditions.checkNotNull(socket, "socket");
        Preconditions.checkNotNull(cVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        String[] strArr = cVar.f162997b;
        String[] strArr2 = strArr != null ? (String[]) io.grpc.okhttp.internal.p.a(strArr, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr3 = (String[]) io.grpc.okhttp.internal.p.a(cVar.f162998c, sSLSocket.getEnabledProtocols());
        io.grpc.okhttp.internal.b bVar = new io.grpc.okhttp.internal.b(cVar);
        if (!bVar.f162993a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr2 == null) {
            bVar.f162994b = null;
        } else {
            bVar.f162994b = (String[]) strArr2.clone();
        }
        if (!bVar.f162993a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr3 == null) {
            bVar.f162995c = null;
        } else {
            bVar.f162995c = (String[]) strArr3.clone();
        }
        io.grpc.okhttp.internal.c cVar2 = new io.grpc.okhttp.internal.c(bVar);
        sSLSocket.setEnabledProtocols(cVar2.f162998c);
        String[] strArr4 = cVar2.f162997b;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
        x xVar = x.f151335c;
        boolean z = cVar.d;
        List list = f151248a;
        String strD = xVar.d(sSLSocket, str, z ? list : null);
        Preconditions.checkState(list.contains(io.grpc.okhttp.internal.m.a(strD)), "Only " + list + " are supported, but negotiated protocol is %s", strD);
        if (io.grpc.okhttp.internal.f.f163004a.verify((str.startsWith("[") && str.endsWith("]")) ? a0.d.o(str, 1, 1) : str, sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(str));
    }
}
