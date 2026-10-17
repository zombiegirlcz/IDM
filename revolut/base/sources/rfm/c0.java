package rfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class c0 extends efm.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f253923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.c0 f253924b;

    public c0(long j2, efm.c0 c0Var) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f253923a = j2;
        this.f253924b = c0Var;
    }

    @Override // efm.k
    public final void j(efm.l lVar) {
        b0 b0Var = new b0(lVar, 0);
        lVar.onSubscribe(b0Var);
        lfm.d.c(b0Var, this.f253924b.d(b0Var, this.f253923a, TimeUnit.MILLISECONDS));
    }
}
