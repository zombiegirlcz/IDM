package hm3;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.plan_gifting.api.navigation.PricingPlanSenderFlow$InputData;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends n implements f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zja.a f153533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qbk.b f153534m;

    public j(zja.a productArticleInteractor, qbk.b planGiftingEligibilityErrorDialogProvider) {
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(planGiftingEligibilityErrorDialogProvider, "planGiftingEligibilityErrorDialogProvider");
        this.f153533l = productArticleInteractor;
        this.f153534m = planGiftingEligibilityErrorDialogProvider;
    }

    public final void Z2(zm3.l lVar) {
        ViewController viewControllerO2 = o2(new lbk.b(new PricingPlanSenderFlow$InputData(lVar, kbk.l.DEFAULT)));
        hg4.a block = new hg4.a(this, 16);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerO2.H = block;
        n.P2(this, viewControllerO2, ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a, null, 2);
    }
}
