package nya;

import com.revolut.feature.referrals.shared.ui.api.SharedReferralsUiApi$Toggles$ReferralsShareInviteForceCompletion;
import com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.InviteCampaignHomeController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InviteCampaignHomeController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(InviteCampaignHomeController inviteCampaignHomeController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = inviteCampaignHomeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InviteCampaignHomeController inviteCampaignHomeController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d) inviteCampaignHomeController.R2()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d) inviteCampaignHomeController.R2()).B2();
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d dVar = (com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d) inviteCampaignHomeController.R2();
                Continuation continuation = null;
                if (((jte.d) dVar.u).c(SharedReferralsUiApi$Toggles$ReferralsShareInviteForceCompletion.f81819c)) {
                    cli.y yVar = dVar.E;
                    if (!((k) ((j2) yVar.f22677a).getValue()).e) {
                        dVar.H2(yVar, new nxa.v(15));
                        dVar.l2(new f0(dVar, continuation, 1), new yi5.b(26));
                    }
                }
                dVar.l2(new f0(dVar, continuation, 2), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
