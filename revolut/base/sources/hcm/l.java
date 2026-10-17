package hcm;

import com.google.common.base.Preconditions;
import gcm.c6;
import gcm.d6;
import gcm.f2;
import gcm.i0;
import gcm.j6;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes13.dex */
public final class l implements gcm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d6 f151279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f151280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d6 f151281c;
    public final ScheduledExecutorService d;
    public final j6 e;
    public final SSLSocketFactory f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final io.grpc.okhttp.internal.c f151282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f151283h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gcm.f f151284j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f151285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f151286m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f151287n;

    public l(d6 d6Var, d6 d6Var2, SSLSocketFactory sSLSocketFactory, io.grpc.okhttp.internal.c cVar, int i, boolean z, long j2, long j3, int i2, int i3, j6 j6Var) {
        this.f151279a = d6Var;
        this.f151280b = (Executor) c6.a(d6Var.f142618a);
        this.f151281c = d6Var2;
        this.d = (ScheduledExecutorService) c6.a(d6Var2.f142618a);
        this.f = sSLSocketFactory;
        this.f151282g = cVar;
        this.f151283h = i;
        this.i = z;
        this.f151284j = new gcm.f(j2);
        this.k = j3;
        this.f151285l = i2;
        this.f151286m = i3;
        this.e = (j6) Preconditions.checkNotNull(j6Var, "transportTracerFactory");
    }

    @Override // gcm.f0
    public final i0 E5(SocketAddress socketAddress, gcm.e0 e0Var, f2 f2Var) {
        if (this.f151287n) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        gcm.f fVar = this.f151284j;
        long j2 = fVar.f142636b.get();
        t tVar = new t(this, (InetSocketAddress) socketAddress, e0Var.f142621a, e0Var.f142622b, e0Var.f142623c, new com.bumptech.glide.k(new gcm.e(fVar, j2), 11));
        if (this.i) {
            tVar.G = true;
            tVar.H = j2;
            tVar.I = this.k;
        }
        return tVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f151287n) {
            return;
        }
        this.f151287n = true;
        c6.b(this.f151279a.f142618a, this.f151280b);
        c6.b(this.f151281c.f142618a, this.d);
    }

    @Override // gcm.f0
    public final ScheduledExecutorService getScheduledExecutorService() {
        return this.d;
    }
}
