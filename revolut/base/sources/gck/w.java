package gck;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingClaimingExitRule;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.intro.PlanGiftingReceiverIntroScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class w extends oki.h implements s {
    public final PlanGiftingReceiverIntroScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wli.x f142519p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cl3.a f142520q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ffk.t f142521r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yik.h f142522s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tbk.g f142523t;
    public final j60.a u;
    public final ibk.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yfk.a f142524w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vii.b f142525x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final cli.y f142526y;

    public w(PlanGiftingReceiverIntroScreenContract$InputData inputData, wli.x deeplinkHandler, cli.n stateMapper, cl3.a contactsInteractor, ffk.t plansInteractor, yik.h pricingPlanStringMapper, tbk.g planGiftingReceiverInteractor, j60.a bottomDialogController, ibk.b refundConfirmationDialogProvider, yfk.a planReferralSwitchNoticeExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(plansInteractor, "plansInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        Intrinsics.checkNotNullParameter(planGiftingReceiverInteractor, "planGiftingReceiverInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogController, "bottomDialogController");
        Intrinsics.checkNotNullParameter(refundConfirmationDialogProvider, "refundConfirmationDialogProvider");
        Intrinsics.checkNotNullParameter(planReferralSwitchNoticeExtension, "planReferralSwitchNoticeExtension");
        this.o = inputData;
        this.f142519p = deeplinkHandler;
        this.f142520q = contactsInteractor;
        this.f142521r = plansInteractor;
        this.f142522s = pricingPlanStringMapper;
        this.f142523t = planGiftingReceiverInteractor;
        this.u = bottomDialogController;
        this.v = refundConfirmationDialogProvider;
        this.f142524w = planReferralSwitchNoticeExtension;
        this.f142525x = new vii.b();
        this.f142526y = mra.d.b(this, new l(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), zi0.c.P(inputData.f102501c, false, null, 3)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f142525x, new g6f.l(continuation, this, 3)), null, null, new gaa.g(this, continuation, 8), 3);
        I2();
    }

    public final void I2() {
        PlanGiftingClaimingExitRule planGiftingClaimingExitRule = this.o.f102500b;
        if (planGiftingClaimingExitRule instanceof PlanGiftingClaimingExitRule.LeaveFlow) {
            H2(this.f142526y, new gaf.l(18));
        } else {
            if (!(planGiftingClaimingExitRule instanceof PlanGiftingClaimingExitRule.OpenChatWithSender)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new g23.q(this, ((PlanGiftingClaimingExitRule.OpenChatWithSender) planGiftingClaimingExitRule).f102434a, (Continuation) null, 17), new yi5.b(26));
        }
    }

    public final void J2() {
        String str = this.o.f102499a;
        cli.y yVar = this.f142526y;
        C2(new r(str, ((kbk.j) zi0.c.I(((l) ((j2) yVar.f22677a).getValue()).f142501a)).f182628b, ((kbk.j) zi0.c.I(((l) ((j2) yVar.f22677a).getValue()).f142501a)).k));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f142526y;
    }
}
