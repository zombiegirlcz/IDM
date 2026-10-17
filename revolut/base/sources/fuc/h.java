package fuc;

import cli.y;
import fjd.g0;
import ha3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wtc.t;
import wtc.u;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends oki.h implements dli.b {
    public final l93.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f138176p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u f138177q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f138178r;

    public h(a3e.u stateMapper, l93.f cardInteractor, t securityHubCardInteractor, u securityHubChecklistInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cardInteractor, "cardInteractor");
        Intrinsics.checkNotNullParameter(securityHubCardInteractor, "securityHubCardInteractor");
        Intrinsics.checkNotNullParameter(securityHubChecklistInteractor, "securityHubChecklistInteractor");
        this.o = cardInteractor;
        this.f138176p = securityHubCardInteractor;
        this.f138177q = securityHubChecklistInteractor;
        this.f138178r = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        I2();
        l.a1(this, mo3.a.g(this.f138177q.f299909a.d.b(Unit.f186387a, w4l.h.f294642c), null, null, 3), null, null, new g0(this, (Continuation) null, 19), 3);
    }

    public final void I2() {
        l93.f fVar = this.o;
        Continuation continuation = null;
        l.a1(this, nim.a.u(new g(this, continuation, 0), rd0.e.b(kli.a.h(l93.f.d(fVar, null, true, 5), ((x) fVar).y()))), null, null, new g(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f138178r;
    }
}
