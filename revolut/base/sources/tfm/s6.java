package tfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class s6 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270820h;
    public final TimeUnit i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final efm.c0 f270821j;
    public final boolean k;

    public s6(efm.r rVar, long j2, TimeUnit timeUnit, efm.c0 c0Var, boolean z) {
        super(rVar);
        this.f270820h = j2;
        this.i = timeUnit;
        this.f270821j = c0Var;
        this.k = z;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        this.f270328g.subscribe(new r6(yVar, this.f270820h, this.i, this.f270821j.b(), this.k));
    }
}
