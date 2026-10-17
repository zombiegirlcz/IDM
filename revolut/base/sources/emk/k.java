package emk;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_gift.PlanGiftBenefitsScreenContract$InputData;
import ffk.t;
import kjk.f0;
import kotlin.jvm.internal.Intrinsics;
import wli.x;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends oki.h implements g {
    public final PlanGiftBenefitsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f127687p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f127688q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final egk.e f127689r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f127690s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ibk.b f127691t;
    public final ajk.b u;
    public final yfk.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f127692w;

    public k(PlanGiftBenefitsScreenContract$InputData inputData, x deeplinkHandler, n stateMapper, t pricingPlansInteractor, egk.e pricingPlansUiInteractor, j60.a bottomDialogController, ibk.b refundConfirmationDialogProvider, ajk.b outOfAppNavigationProvider, yfk.a planReferralSwitchNoticeExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pricingPlansInteractor, "pricingPlansInteractor");
        Intrinsics.checkNotNullParameter(pricingPlansUiInteractor, "pricingPlansUiInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogController, "bottomDialogController");
        Intrinsics.checkNotNullParameter(refundConfirmationDialogProvider, "refundConfirmationDialogProvider");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        Intrinsics.checkNotNullParameter(planReferralSwitchNoticeExtension, "planReferralSwitchNoticeExtension");
        this.o = inputData;
        this.f127687p = deeplinkHandler;
        this.f127688q = pricingPlansInteractor;
        this.f127689r = pricingPlansUiInteractor;
        this.f127690s = bottomDialogController;
        this.f127691t = refundConfirmationDialogProvider;
        this.u = outOfAppNavigationProvider;
        this.v = planReferralSwitchNoticeExtension;
        this.f127692w = mra.d.b(this, new f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String planGiftId = this.o.f103527a;
        wik.t tVar = (wik.t) this.f127689r;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(planGiftId, "planGiftId");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        f0 f0Var = (f0) tVar.f297935a;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(planGiftId, "planGiftId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, boh.f.e(rd0.e.b(((w4l.f) f0Var.f184441n.getValue()).e(planGiftId, loadingStrategy)), new ei8.d(this, 19)), null, null, new ea4.d(this, null, 28), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f127692w;
    }
}
