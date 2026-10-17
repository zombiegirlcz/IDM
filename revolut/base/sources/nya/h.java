package nya;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import com.revolut.feature.referrals.common.data.api.domain.model.common.Upsell;
import com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.InviteCampaignHomeController;
import com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.InviteCampaignHomeControllerContract$ModalStep;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.DetailsScope;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InviteDetailsCampaignType;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.reward_details.RewardDetailsScreenContract$Input;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InviteCampaignHomeController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InviteCampaignHomeController inviteCampaignHomeController, Continuation continuation) {
        super(2, continuation);
        this.v = inviteCampaignHomeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarF3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d dVar = (com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d) jVarF3;
        cli.y yVar = dVar.E;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = dVar.F;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        Object obj3 = model.u;
        if (kotlin.text.a0.H(str, "INVITES_LIST_ID_", false) && (((k) ((j2) yVar.f22677a).getValue()).f220738a instanceof l)) {
            com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.a aVar3 = ((k) ((j2) yVar.f22677a).getValue()).f220738a;
            Intrinsics.i(aVar3, "null cannot be cast to non-null type com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.InviteCampaignHomeControllerContract.HomeScreenDomainState.Result");
            l lVar = (l) aVar3;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails");
            ActiveOrPastInviteeDetails activeOrPastInviteeDetails = (ActiveOrPastInviteeDetails) obj3;
            if (activeOrPastInviteeDetails.f81695m == pwa.b.INELIGIBLE) {
                oki.h.v2(aVar2, new InviteCampaignHomeControllerContract$ModalStep.IneligibilityDialog(activeOrPastInviteeDetails.u), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            } else {
                dVar.C2(new s(new o(new InvitesDetailsContract$InputData.ByInviteeDetails(activeOrPastInviteeDetails, DetailsScope.Default.f81864a, lVar.f220744b instanceof lya.h ? InviteDetailsCampaignType.SeparateDeadline.f81867a : InviteDetailsCampaignType.General.f81866a, dVar.o.f81844c))));
            }
        } else if (str.equals("C2B_REFERRAL_REWARD_LIST_ID")) {
            dVar.C2(new s(m.f220746a));
        } else if (obj3 instanceof Upsell) {
            oki.h.v2(aVar2, new InviteCampaignHomeControllerContract$ModalStep.RewardDetails(new RewardDetailsScreenContract$Input((Upsell) obj3)), ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
