package e8e;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.subaccount.impl.ui.edit.billl.screen.edit.BillSelectorScreen;
import com.revolut.feature.subscriptions.api.navigation.SubscriptionsFlowDestination;
import com.revolut.feature.subscriptions.impl.flow.SubscriptionsFlow;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import h93.f0;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BillSelectorScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(BillSelectorScreen billSelectorScreen, Continuation continuation) {
        super(2, continuation);
        this.v = billSelectorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        k kVar;
        h6e.c cVar;
        f0 f0Var;
        Set set;
        k kVar2;
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarT2 = this.v.T2();
        Object obj3 = model.f52715m;
        x xVar = (x) pVarT2;
        xVar.getClass();
        if (obj3 == o.LINKED_CARD) {
            l lVar = (l) ((m) xVar.t2()).f123643b.getContent();
            if (lVar == null || (kVar = lVar.f123641c) == null || (cVar = kVar.f123637a) == null || (f0Var = cVar.f149628a) == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Card is missed");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            } else {
                l lVar2 = (l) ((m) xVar.t2()).f123643b.getContent();
                if (lVar2 == null || (kVar2 = lVar2.f123641c) == null || (set = kVar2.f123638b) == null) {
                    set = h0.f322473a;
                }
                g9e.b bVar = xVar.u;
                String cardId = f0Var.f150110a;
                ((ice.p) bVar).getClass();
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                xVar.f2(new SubscriptionsFlow(new SubscriptionsFlowDestination.InputData(new SubscriptionsFlowDestination.StartType.CardSubscriptionList(cardId, b9e.d.Unlink))), ModalDestination.Style.POPUP.f98311a, new r(xVar, set, 0));
            }
        } else if (obj3 == o.RECURRING) {
            xVar.z2();
        } else if (obj3 == o.SUBSCRIPTION) {
            xVar.C1(new BridgeDestination(((rae.d) xVar.f123662t).n(AccountId.Personal.f51414a, null)));
        }
        return Unit.f186387a;
    }
}
