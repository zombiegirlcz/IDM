package ocg;

import cli.y;
import i9g.u;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rp0.g1;
import rp0.k1;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends oki.h implements l {
    public final u o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g1 f224243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dyb.a f224244q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a29.b f224245r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f224246s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f224247t;

    public r(qcg.g stateMapper, u travelHotelsFavoritesInteractor, g1 shotDialogDisplayer, dyb.a revPointsKycCheckExtension, a29.b lifestyleBorderlessFooterFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(travelHotelsFavoritesInteractor, "travelHotelsFavoritesInteractor");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(revPointsKycCheckExtension, "revPointsKycCheckExtension");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooterFactory, "lifestyleBorderlessFooterFactory");
        this.o = travelHotelsFavoritesInteractor;
        this.f224243p = shotDialogDisplayer;
        this.f224244q = revPointsKycCheckExtension;
        this.f224245r = lifestyleBorderlessFooterFactory;
        this.f224246s = new vii.b();
        this.f224247t = mra.d.b(this, new g(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f224246s, new ns9.h(continuation, this, 24)), null, null, new n(this, continuation, 0), 3);
        yji.l.a1(this, ((x29.b) this.f224245r).a(), null, null, new n(this, continuation, 1), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, rd0.e.b(((k1) this.f224243p).d), null, new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favoritesV2.b(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f224247t;
    }
}
