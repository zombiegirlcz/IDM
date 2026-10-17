package fce;

import aw0.n6;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.SubscriptionDetailsDialogController;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SubscriptionDetailsDialogController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SubscriptionDetailsDialogController subscriptionDetailsDialogController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = subscriptionDetailsDialogController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fva.e eVar;
        int i = this.u;
        SubscriptionDetailsDialogController subscriptionDetailsDialogController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.b bVar = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.b) subscriptionDetailsDialogController.m3();
                y yVar = (y) ((j2) bVar.o.f22677a).getValue();
                boolean z = yVar instanceof t;
                aii.r zVar = a.b.f89299a;
                if (z && (eVar = ((t) yVar).f133719a) != null) {
                    zVar = new z(eVar);
                }
                bVar.C2(zVar);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.b) subscriptionDetailsDialogController.m3()).C2(a.C0554a.f89298a);
                break;
        }
        return Unit.f186387a;
    }
}
