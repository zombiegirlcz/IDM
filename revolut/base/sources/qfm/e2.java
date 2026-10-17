package qfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class e2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f245404c;
    public final TimeUnit d;
    public final efm.c0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(b1 b1Var, long j2, efm.c0 c0Var) {
        super(b1Var);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f245404c = j2;
        this.d = timeUnit;
        this.e = c0Var;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        this.f245362b.n(new d2(new jhm.a(aVar), this.f245404c, this.d, this.e));
    }
}
