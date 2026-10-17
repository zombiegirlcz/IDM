package ft2;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.business.referrals.ui.screens.eligibility_criteria.EligibilityCriteriaScreen;
import com.revolut.feature.business.referrals.ui.screens.eligibility_criteria.EligibilityCriteriaScreenContract$InputData;
import com.revolut.feature.business.referrals.ui.screens.referral_invitee_details.ReferralInviteeDetailsScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;
import ru.v;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends oki.h implements g {
    public final ReferralInviteeDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vu.d f137791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h60.d f137792q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f137793r;

    public i(ReferralInviteeDetailsScreenContract$InputData inputData, vu.d referralWithIncentiveCampaignRepository, h60.d lottieAnimationControllerExtension, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(referralWithIncentiveCampaignRepository, "referralWithIncentiveCampaignRepository");
        Intrinsics.checkNotNullParameter(lottieAnimationControllerExtension, "lottieAnimationControllerExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f137791p = referralWithIncentiveCampaignRepository;
        this.f137792q = lottieAnimationControllerExtension;
        this.f137793r = mra.d.b(this, new e(new Data(null, null, true, 3, null), false), stateMapper, null, false, 12);
    }

    public final void I2() {
        String businessId = this.o.f64363a;
        rs2.n nVar = (rs2.n) this.f137791p;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(businessId, "businessId");
        l.b1(this, nVar.f256957g.c(businessId, true), null, new fna.f(this, null, 11), 3);
    }

    public final void J2(Object obj2, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        if (obj2 instanceof v) {
            l.j2(this, new EligibilityCriteriaScreen(new EligibilityCriteriaScreenContract$InputData(((v) obj2).e)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        I2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f137793r;
    }
}
