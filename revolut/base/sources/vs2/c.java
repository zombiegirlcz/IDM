package vs2;

import bt2.g;
import com.revolut.feature.business.referrals.ui.flow.referral_with_incentive.ReferralWithIncentiveFlowContract$Step;
import com.revolut.feature.business.referrals.ui.screens.referral_account.ReferralAccountScreen;
import com.revolut.feature.business.referrals.ui.screens.referral_account.ReferralAccountScreenContract$InputData;
import com.revolut.feature.business.referrals.ui.screens.referral_campaign_state.ReferralCampaignStateScreenContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import dt2.f;
import ht2.j;
import ht2.k;
import ht2.l;
import ht2.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import uu.a;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.business.referrals.ui.flow.referral_with_incentive.a f291715b;

    public /* synthetic */ c(com.revolut.feature.business.referrals.ui.flow.referral_with_incentive.a aVar, int i) {
        this.f291714a = i;
        this.f291715b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f291714a) {
            case 0:
                f output = (f) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                com.revolut.feature.business.referrals.ui.flow.referral_with_incentive.a aVar = this.f291715b;
                h.t2(aVar, aVar.f64341s, new ReferralWithIncentiveFlowContract$Step.InviteeDetails(output.f117348a), true, null, false, 12);
                return Unit.f186387a;
            case 1:
                j output2 = (j) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                boolean zF = Intrinsics.f(output2, j.a.f155226a);
                com.revolut.feature.business.referrals.ui.flow.referral_with_incentive.a aVar2 = this.f291715b;
                if (zF) {
                    h.t2(aVar2, aVar2.f64341s, new ReferralWithIncentiveFlowContract$Step.CampaignState(ReferralCampaignStateScreenContract$InputData.Active.f64356a), true, null, false, 12);
                } else if (Intrinsics.f(output2, j.b.f155227a)) {
                    h.t2(aVar2, aVar2.f64341s, new ReferralWithIncentiveFlowContract$Step.CampaignState(ReferralCampaignStateScreenContract$InputData.Inactive.f64357a), true, null, false, 12);
                } else if (output2 instanceof k) {
                    h.t2(aVar2, aVar2.f64341s, new ReferralWithIncentiveFlowContract$Step.InviteeDetails(((k) output2).f155229a), true, null, false, 12);
                } else if (output2 instanceof l) {
                    l lVar = (l) output2;
                    aVar2.J2(lVar.f155230a, lVar.f155231b, lVar.f155232c);
                } else if (output2 instanceof m) {
                    aVar2.f2(new ReferralAccountScreen(new ReferralAccountScreenContract$InputData(((m) output2).f155233a)), ModalDestination.Style.POPUP.f98311a, new c(aVar2, 2));
                } else {
                    if (!Intrinsics.f(output2, j.c.f155228a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.C2(a.AbstractC1562a.C1563a.f283124a);
                }
                return Unit.f186387a;
            default:
                g outputData = (g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                boolean z = outputData instanceof g.b;
                com.revolut.feature.business.referrals.ui.flow.referral_with_incentive.a aVar3 = this.f291715b;
                if (z) {
                    aVar3.C1(new ExternalDestination.ByIntent(aVar3.f64340r.t("com.revolut.revolut"), null));
                } else if (outputData instanceof g.a) {
                    aVar3.n2(new vmf.k(aVar3, null, 5), new whi.b(6));
                } else {
                    int i = jli.h.f175850a;
                }
                return Unit.f186387a;
        }
    }
}
