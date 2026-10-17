package nya;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.InviteCampaignHomeController;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListScreenCampaignType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InviteCampaignHomeController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InviteCampaignHomeController inviteCampaignHomeController, Continuation continuation) {
        super(2, continuation);
        this.v = inviteCampaignHomeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarF3 = this.v.R2();
        String id10 = model.f52613a;
        com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d dVar = (com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d) jVarF3;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        if (Intrinsics.f(id10, "SEE_ALL_INVITES_V4_LIST_ID")) {
            com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.a aVar2 = ((k) ((j2) dVar.E.f22677a).getValue()).f220738a;
            if (aVar2 instanceof l) {
                if (((l) aVar2).f220744b instanceof lya.h) {
                    dVar.K2(InvitesListScreenCampaignType.SeparateDeadline.f81895a);
                } else {
                    dVar.K2(new InvitesListScreenCampaignType.General(pwa.i.ACTIVE));
                }
            }
        }
        return Unit.f186387a;
    }
}
