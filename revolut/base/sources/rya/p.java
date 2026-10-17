package rya;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.DetailsScope;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InviteDetailsCampaignType;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListContract$ModalStep;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListController;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListScreenCampaignType;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvitesListController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(InvitesListController invitesListController, Continuation continuation) {
        super(2, continuation);
        this.v = invitesListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InviteDetailsCampaignType inviteDetailsCampaignType;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.a aVar2 = (com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.a) hVarE3;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.f81901w;
        Intrinsics.checkNotNullParameter(model, "model");
        InvitesListContract$InputData invitesListContract$InputData = aVar2.o;
        InvitesListScreenCampaignType invitesListScreenCampaignType = invitesListContract$InputData.f81887a;
        if (invitesListScreenCampaignType instanceof InvitesListScreenCampaignType.General) {
            inviteDetailsCampaignType = InviteDetailsCampaignType.General.f81866a;
        } else {
            if (!(invitesListScreenCampaignType instanceof InvitesListScreenCampaignType.SeparateDeadline)) {
                throw new NoWhenBranchMatchedException();
            }
            inviteDetailsCampaignType = InviteDetailsCampaignType.SeparateDeadline.f81867a;
        }
        InviteDetailsCampaignType inviteDetailsCampaignType2 = inviteDetailsCampaignType;
        Object obj3 = model.u;
        boolean z = obj3 instanceof pwa.j;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z) {
            pwa.j jVar = (pwa.j) obj3;
            if (jVar.e == pwa.b.INELIGIBLE) {
                oki.h.v2(aVar3, new InvitesListContract$ModalStep.IneligibilityDialog(jVar.f240363g), bottom_dialog);
            } else {
                aVar2.C2(new g(new e(new InvitesDetailsContract$InputData.ByInviteId(jVar.f240360a, false, inviteDetailsCampaignType2, invitesListContract$InputData.f81888b, 6))));
            }
        } else if (a0.H(model.f53228a, "INVITES_LIST_ID_", false)) {
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails");
            ActiveOrPastInviteeDetails activeOrPastInviteeDetails = (ActiveOrPastInviteeDetails) obj3;
            if (activeOrPastInviteeDetails.f81695m == pwa.b.INELIGIBLE) {
                oki.h.v2(aVar3, new InvitesListContract$ModalStep.IneligibilityDialog(activeOrPastInviteeDetails.u), bottom_dialog);
            } else {
                aVar2.C2(new g(new d(new InvitesDetailsContract$InputData.ByInviteeDetails(activeOrPastInviteeDetails, DetailsScope.Default.f81864a, inviteDetailsCampaignType2, invitesListContract$InputData.f81888b))));
            }
        }
        return Unit.f186387a;
    }
}
