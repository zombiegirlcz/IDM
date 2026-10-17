package ufm;

import efm.c0;
import efm.d0;
import efm.f0;
import efm.h0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class p extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f279904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f279905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f279906c;
    public final c0 d;
    public final h0 e;

    public p(d0 d0Var, long j2, TimeUnit timeUnit, c0 c0Var, h0 h0Var) {
        this.f279904a = d0Var;
        this.f279905b = j2;
        this.f279906c = timeUnit;
        this.d = c0Var;
        this.e = h0Var;
    }

    @Override // efm.d0
    public final void r(f0 f0Var) {
        o oVar = new o(f0Var, this.e, this.f279905b, this.f279906c);
        f0Var.onSubscribe(oVar);
        lfm.d.c(oVar.f279902b, this.d.d(oVar, this.f279905b, this.f279906c));
        this.f279904a.q(oVar);
    }
}
