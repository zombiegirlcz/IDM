package tfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class f1 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270450h;
    public final TimeUnit i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final efm.c0 f270451j;

    public f1(efm.r rVar, long j2, TimeUnit timeUnit, efm.c0 c0Var) {
        super(rVar);
        this.f270450h = j2;
        this.i = timeUnit;
        this.f270451j = c0Var;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        this.f270328g.subscribe(new e1(new bgm.d(yVar), this.f270450h, this.i, this.f270451j.b()));
    }
}
