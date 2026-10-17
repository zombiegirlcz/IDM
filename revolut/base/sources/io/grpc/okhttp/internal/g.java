package io.grpc.okhttp.internal;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes13.dex */
public final class g extends l {
    public final jpf.a e;
    public final jpf.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jpf.a f163006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jpf.a f163007h;
    public final k i;

    public g(jpf.a aVar, jpf.a aVar2, jpf.a aVar3, jpf.a aVar4, Provider provider, k kVar) {
        super(provider);
        this.e = aVar;
        this.f = aVar2;
        this.f163006g = aVar3;
        this.f163007h = aVar4;
        this.i = kVar;
    }

    @Override // io.grpc.okhttp.internal.l
    public final void c(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.e.s(sSLSocket, Boolean.TRUE);
            this.f.s(sSLSocket, str);
        }
        Class<?> cls = sSLSocket.getClass();
        jpf.a aVar = this.f163007h;
        if (aVar.n(cls) != null) {
            aVar.t(sSLSocket, l.b(list));
        }
    }

    @Override // io.grpc.okhttp.internal.l
    public final String d(SSLSocket sSLSocket) {
        byte[] bArr;
        Class<?> cls = sSLSocket.getClass();
        jpf.a aVar = this.f163006g;
        if (aVar.n(cls) == null || (bArr = (byte[]) aVar.t(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, p.f163020b);
    }

    @Override // io.grpc.okhttp.internal.l
    public final k e() {
        return this.i;
    }
}
