package o7e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.subaccount.impl.ui.bill.screen.BillAccountDetailScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import qua.p;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BillAccountDetailScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BillAccountDetailScreen billAccountDetailScreen, Continuation continuation) {
        super(2, continuation);
        this.v = billAccountDetailScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarI3 = this.v.T2();
        Object obj3 = model.u;
        k kVar = (k) hVarI3;
        if (obj3 instanceof p) {
            j60.a aVar2 = kVar.f222782t;
            n nVar = kVar.f222781s;
            String str = kVar.f222780r.f89002a;
            nVar.getClass();
            aVar2.x(n.a((p) obj3, str));
        } else {
            kVar.getClass();
        }
        return Unit.f186387a;
    }
}
