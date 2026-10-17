package hl6;

import com.revolut.domain.models.openbanking.OutboundOpenBankingClient;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.ClientsListScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.ClientsListScreenContract$ModalStep;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.a;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.joint_data_sharing.JointDataSharingScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ClientsListScreen f152989w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ClientsListScreen clientsListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f152989w = clientsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f152989w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f152989w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ClientsListScreen clientsListScreen = this.f152989w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String listId = (String) pair.f186385a;
                Object obj3 = pair.f186386b;
                com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.b bVar = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.b) ((k) clientsListScreen.Q.getValue());
                bVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "IDEAL_ITEM_ID")) {
                    bVar.C2(a.C0484a.f72762a);
                } else if (obj3 instanceof OutboundOpenBankingClient) {
                    bVar.C2(new j((OutboundOpenBankingClient) obj3));
                }
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVar = (k) clientsListScreen.Q.getValue();
                Intrinsics.h(clickData);
                com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.b bVar2 = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.b) kVar;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "LEARN_MORE_CLICK_ID")) {
                    oki.h.v2(bVar2.v, new ClientsListScreenContract$ModalStep.JointDataSharing(JointDataSharingScreenContract$InputData.LearnDataSharing.f72770a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
