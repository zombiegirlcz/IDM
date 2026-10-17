package nya;

import com.revolut.feature.referrals.common.data.api.domain.model.common.AdditionalInfo;
import com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.InviteCampaignHomeController;
import com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.InviteCampaignHomeControllerContract$ModalStep;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListScreenCampaignType;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InviteCampaignHomeController f220728w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(InviteCampaignHomeController inviteCampaignHomeController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f220728w = inviteCampaignHomeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f220728w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f220728w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d(this.f220728w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            default:
                d dVar4 = new d(this.f220728w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InviteCampaignHomeController inviteCampaignHomeController = this.f220728w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarF3 = inviteCampaignHomeController.R2();
                Intrinsics.h(id10);
                com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d dVar = (com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d) jVarF3;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                int iHashCode = id10.hashCode();
                if (iHashCode != -1046396098) {
                    if (iHashCode != -493759118) {
                        if (iHashCode == 922758447 && id10.equals("ALL_INVITES_MENU_LIST_ID")) {
                            dVar.K2(dVar.D ? new InvitesListScreenCampaignType.General(pwa.i.ACTIVE) : InvitesListScreenCampaignType.SeparateDeadline.f81895a);
                        }
                    } else if (id10.equals("C2B_REFERRAL_MENU_LIST_ID")) {
                        dVar.C2(new s(m.f220746a));
                    }
                } else if (id10.equals("PAST_INVITES_MENU_LIST_ID")) {
                    dVar.K2(new InvitesListScreenCampaignType.General(pwa.i.PAST));
                }
                break;
            case 1:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarF32 = inviteCampaignHomeController.R2();
                Intrinsics.h(clickData);
                com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d dVar2 = (com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d) jVarF32;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                dVar2.n2(new i0(dVar2, clickData, null, 0), new whi.b(6));
                break;
            case 2:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarF33 = inviteCampaignHomeController.R2();
                String itemId = aVar3.f275445a;
                Object obj3 = aVar3.d;
                com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d dVar3 = (com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d) jVarF33;
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (Intrinsics.f(itemId, "LEARN_MORE_ID")) {
                    AdditionalInfo additionalInfo = obj3 instanceof AdditionalInfo ? (AdditionalInfo) obj3 : null;
                    if (additionalInfo != null) {
                        oki.h.v2(dVar3.F, new InviteCampaignHomeControllerContract$ModalStep.LearnMore(additionalInfo), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    } else {
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "InviteCampaignHomeControllerModel", "Expected non nullable AdditionalInfo parcel", null, h0Var);
                    }
                }
                break;
            default:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarF34 = inviteCampaignHomeController.R2();
                Intrinsics.h(clickData2);
                com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d dVar4 = (com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d) jVarF34;
                dVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                dVar4.n2(new i0(dVar4, clickData2, null, 0), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
