package tfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class n3 extends efm.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final efm.c0 f270672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270673h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f270674j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TimeUnit f270675l;

    public n3(long j2, long j3, long j5, long j16, TimeUnit timeUnit, efm.c0 c0Var) {
        this.f270674j = j5;
        this.k = j16;
        this.f270675l = timeUnit;
        this.f270672g = c0Var;
        this.f270673h = j2;
        this.i = j3;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        m3 m3Var = new m3(yVar, this.f270673h, this.i);
        yVar.onSubscribe(m3Var);
        efm.c0 c0Var = this.f270672g;
        boolean z = c0Var instanceof wfm.a0;
        TimeUnit timeUnit = this.f270675l;
        if (!z) {
            lfm.d.e(m3Var, c0Var.e(m3Var, this.f270674j, this.k, timeUnit));
            return;
        }
        wfm.z zVar = new wfm.z();
        lfm.d.e(m3Var, zVar);
        zVar.c(m3Var, this.f270674j, this.k, timeUnit);
    }
}
