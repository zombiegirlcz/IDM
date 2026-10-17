package sdi;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature_rev_points_pocket_api.RevPointsPocketApi$Toggles;
import com.revolut.feature_rev_points_pocket_api.navigation.RevPointsPocketDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements adi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ldi.f f261899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tdi.a f261900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eub.a f261901c;
    public final ldi.d d;
    public final gte.a e;

    public d(ldi.f revPointsPocketInteractor, tdi.a revPointsPocketBannerMapper, eub.a revPointsAvailabilityInteractor, ldi.d coolDownInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(revPointsPocketInteractor, "revPointsPocketInteractor");
        Intrinsics.checkNotNullParameter(revPointsPocketBannerMapper, "revPointsPocketBannerMapper");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(coolDownInteractor, "coolDownInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f261899a = revPointsPocketInteractor;
        this.f261900b = revPointsPocketBannerMapper;
        this.f261901c = revPointsAvailabilityInteractor;
        this.d = coolDownInteractor;
        this.e = featureToggleInteractor;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return Intrinsics.f(data.f54722b.f51590a, "REV_POINTS_POCKET_PRODUCT_ACCOUNT_ITEM_ID");
    }

    @Override // i49.c
    public final Flow f(j49.i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (Intrinsics.f(params.f171328a, ProductId.SUBACCOUNT.getId())) {
            if (!((jte.d) this.e).c(RevPointsPocketApi$Toggles.RevPointsPocketSlotManager.f97778c)) {
                return vkm.q.Q(mo3.a.g(((nyb.b) this.f261901c).d(), null, null, 3), new a(null, this, params, 0));
            }
        }
        return new go.g(f0.f322471a, 2);
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        if (Intrinsics.f(tVar.f54722b.f51590a, "REV_POINTS_POCKET_PRODUCT_ACCOUNT_ITEM_ID")) {
            ActionWidgetDelegate.a aVar = tVar.f54721a;
            if (Intrinsics.f(aVar, ActionWidgetDelegate.a.c.f51609a)) {
                return new j49.b(u0.c(u0.d(new RevPointsPocketDestination.Onboarding(RevPointsPocketDestination.Onboarding.Mode.Boost.f97800a, null))));
            }
            if (Intrinsics.f(aVar, ActionWidgetDelegate.a.C0395a.f51607a)) {
                com.google.android.gms.internal.mlkit_vision_face.a.B(Long.TYPE, this.d.f194132a, "REV_POINTS_BANNER_COOL_DOWN_TIME_ID", Long.valueOf(System.currentTimeMillis()));
                return j49.a.f171320a;
            }
        }
        return j49.c.f171322a;
    }
}
