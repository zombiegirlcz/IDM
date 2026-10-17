package lzb;

import com.revolut.kompot.common.ModalDestination;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import m1c.e0;
import nyb.k;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends n implements mub.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k f200958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final eub.a f200959m;

    public a(k revPointsInteractor, eub.a revPointsAvailabilityInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f200958l = revPointsInteractor;
        this.f200959m = revPointsAvailabilityInteractor;
    }

    public final r Z2() {
        if (((nyb.b) this.f200959m).f()) {
            return nim.a.w(this.f200958l.c(false), new lyd.b(this));
        }
        r rVarEmpty = r.empty();
        Intrinsics.h(rVarEmpty);
        return rVarEmpty;
    }

    public final boolean b3(String menuId, e0 context) {
        Intrinsics.checkNotNullParameter(menuId, "menuId");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!Intrinsics.f(menuId, "NAV_BAR_ACTION_ID_REV_POINTS")) {
            return false;
        }
        n.P2(this, o2(new hub.c(context)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        return true;
    }
}
