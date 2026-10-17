package fmm;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes13.dex */
public interface q {
    boolean a(SSLSocket sSLSocket);

    String b(SSLSocket sSLSocket);

    void c(SSLSocket sSLSocket, String str, List list);

    boolean isSupported();
}
