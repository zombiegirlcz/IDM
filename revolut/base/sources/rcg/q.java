package rcg;

import cli.y;
import i9g.u;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import rp0.g1;
import rp0.k1;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends oki.h implements l {
    public final u o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g1 f253263p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dyb.a f253264q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f253265r;

    public q(s stateMapper, u travelHotelsFavoritesInteractor, g1 shotDialogDisplayer, dyb.a revPointsKycCheckExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(travelHotelsFavoritesInteractor, "travelHotelsFavoritesInteractor");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(revPointsKycCheckExtension, "revPointsKycCheckExtension");
        this.o = travelHotelsFavoritesInteractor;
        this.f253263p = shotDialogDisplayer;
        this.f253264q = revPointsKycCheckExtension;
        this.f253265r = mra.d.b(this, new g(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(ue0.e.p(this.o.f159841a.N.f(Unit.f186387a, false), h0.f322473a)), null, null, new r5e.e(this, null, 17), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, rd0.e.b(((k1) this.f253263p).d), null, new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid.b(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f253265r;
    }
}
