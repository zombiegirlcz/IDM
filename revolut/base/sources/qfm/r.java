package qfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f245518c;
    public final TimeUnit d;
    public final efm.c0 e;

    public r(efm.i iVar, long j2, TimeUnit timeUnit, efm.c0 c0Var) {
        super(iVar);
        this.f245518c = j2;
        this.d = timeUnit;
        this.e = c0Var;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        this.f245362b.n(new q(new jhm.a(aVar), this.f245518c, this.d, this.e.b()));
    }
}
