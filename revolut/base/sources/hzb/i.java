package hzb;

import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.rev_points.impl.ui.bottom_sheet.RevPointsBottomSheetScreen;
import com.revolut.feature.rev_points.impl.ui.bottom_sheet.RevPointsBottomSheetScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import ft3.a1;
import ft3.q0;
import grl.r2;
import kotlin.jvm.internal.Intrinsics;
import m1c.f1;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends yji.n implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ldi.f f157105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p9g.g f157106m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a61.a f157107n;
    public final edi.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b6c.c f157108p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f157109q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h30.q f157110r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final nyb.k f157111s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a2c.e f157112t;

    public i(ldi.f pointsPocketInteractor, p9g.g staysFeatureEntryPointCommandFactory, a61.a travelExperiencesFeatureLauncher, edi.a revPointsPocketDestinationProvider, b6c.c revolutPayInfoInteractor, gte.a featureToggleInteractor, h30.q storeAvailabilityInteractor, nyb.k revPointsInteractor, a2c.e spareChangeNavigationResolver) {
        Intrinsics.checkNotNullParameter(pointsPocketInteractor, "pointsPocketInteractor");
        Intrinsics.checkNotNullParameter(staysFeatureEntryPointCommandFactory, "staysFeatureEntryPointCommandFactory");
        Intrinsics.checkNotNullParameter(travelExperiencesFeatureLauncher, "travelExperiencesFeatureLauncher");
        Intrinsics.checkNotNullParameter(revPointsPocketDestinationProvider, "revPointsPocketDestinationProvider");
        Intrinsics.checkNotNullParameter(revolutPayInfoInteractor, "revolutPayInfoInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(storeAvailabilityInteractor, "storeAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(spareChangeNavigationResolver, "spareChangeNavigationResolver");
        this.f157105l = pointsPocketInteractor;
        this.f157106m = staysFeatureEntryPointCommandFactory;
        this.f157107n = travelExperiencesFeatureLauncher;
        this.o = revPointsPocketDestinationProvider;
        this.f157108p = revolutPayInfoInteractor;
        this.f157109q = featureToggleInteractor;
        this.f157110r = storeAvailabilityInteractor;
        this.f157111s = revPointsInteractor;
        this.f157112t = spareChangeNavigationResolver;
    }

    public final void Z2(q0 product) {
        Intrinsics.checkNotNullParameter(product, "product");
        A2(new BridgeDestination(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(new a1(r2.REV_POINTS_EARN_HUB, null, null, md6.s.A(product.getF137851b()), null, 22), product, null, null, null, null, null, null, null, null, 2044))));
    }

    public final void b3(f1 product) {
        m1c.e0 e0Var;
        Intrinsics.checkNotNullParameter(product, "product");
        int i = b.f157084a[product.ordinal()];
        if (i == 1) {
            e0Var = m1c.e0.EARN_HUB_DEBIT_CARD;
        } else {
            if (i != 2) {
                throw new UnsupportedOperationException();
            }
            e0Var = m1c.e0.EARN_HUB_CREDIT_CARD;
        }
        yji.n.P2(this, new RevPointsBottomSheetScreen(new RevPointsBottomSheetScreenContract$InputData(e0Var)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
    }
}
