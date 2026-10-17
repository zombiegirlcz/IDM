package dhk;

import com.revolut.feature.pricingplans.models.SubscriptionPreviewId;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.GlobalPlanSubscriptionPreview$InputData;
import dce.l0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lhk.d0;
import lhk.p;
import vkm.q;
import vkm.z1;
import zfk.n;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends wfk.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f114827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z1 f114828m;

    public e(l globalPlansInteractor) {
        Intrinsics.checkNotNullParameter(globalPlansInteractor, "globalPlansInteractor");
        this.f114827l = globalPlansInteractor;
        this.f114828m = q.b(0, 2, ukm.f.DROP_OLDEST);
    }

    @Override // wfk.a
    public final Object Z2(SubscriptionPreviewId.GiftedPlan giftedPlan, n nVar, d0 d0Var) throws Throwable {
        this.f114828m.i();
        return p.b(this, nVar, new c(this, giftedPlan, null), d0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // wfk.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature.pricingplans.models.SubscriptionPreviewId r5, gim.c r6) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dhk.e.b3(com.revolut.feature.pricingplans.models.SubscriptionPreviewId, gim.c):java.lang.Object");
    }

    @Override // wfk.a
    public final void c3(SubscriptionPreviewId subscriptionsPreviewId, jeg.g onResult) {
        Intrinsics.checkNotNullParameter(subscriptionsPreviewId, "subscriptionsPreviewId");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        d3(subscriptionsPreviewId, new l0(onResult, 13));
    }

    public final void d3(SubscriptionPreviewId subscriptionPreviewId, Function1 function1) {
        ViewController viewControllerO2 = o2(new igk.a(new GlobalPlanSubscriptionPreview$InputData(subscriptionPreviewId)));
        viewControllerO2.l2(new b(0, function1));
        N2(viewControllerO2, ModalDestination.Style.FULLSCREEN_FADE.f98307a, new a31.k(12, function1));
    }
}
