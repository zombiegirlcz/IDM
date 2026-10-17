package qc3;

import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import qa9.r;
import qc0.l0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends oki.h implements i {
    public final nb3.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w39.b f244547p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f244548q;

    public k(n stateMapper, nb3.b cashTopUpInteractor, w39.b locationInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cashTopUpInteractor, "cashTopUpInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        this.o = cashTopUpInteractor;
        this.f244547p = locationInteractor;
        this.f244548q = mra.d.b(this, new e(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        sfm.b bVar = new sfm.b(new ufm.i(((z39.b) this.f244547p).f319221b.e(), new l0(18, new qb5.a(23)), 1), new l0(19, new r(this, 14)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        yji.l.a1(this, rd0.e.b(rd0.e.p(ue0.e.q(m70.a.g(bVar, null, null, 3), h0.f322473a), 0L, 0L, 31)), null, null, new c(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f244548q;
    }
}
