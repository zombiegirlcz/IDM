package hl6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.ClientsListScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.ClientsListScreenContract$ModalStep;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.joint_data_sharing.JointDataSharingScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ClientsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ClientsListScreen clientsListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = clientsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVar = (k) this.v.Q.getValue();
        Intrinsics.h(model);
        com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.b bVar = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.b) kVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        RowDelegate.Model.c cVar = model.k;
        vf vfVar = cVar instanceof vf ? (vf) cVar : null;
        if (vfVar != null) {
            boolean z = vfVar.f54880a;
            String str = model.f53228a;
            if (Intrinsics.f(str, "JOINT_DATA_SHARING_ITEM_ID")) {
                oki.h.v2(bVar.v, new ClientsListScreenContract$ModalStep.JointDataSharing(z ? JointDataSharingScreenContract$InputData.DisableDataSharing.f72768a : JointDataSharingScreenContract$InputData.EnableDataSharing.f72769a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            } else if (Intrinsics.f(str, "JOINT_AUTHORISATION_NOTIFICATIONS_ITEM_ID")) {
                bVar.l2(new af3.f(bVar, !z, (Continuation) null, 18), new yi5.b(26));
            }
        }
        return Unit.f186387a;
    }
}
