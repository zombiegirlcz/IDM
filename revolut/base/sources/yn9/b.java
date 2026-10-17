package yn9;

import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KTypeProjection;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        c cVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list = (List) p.a.j(wn9.a.class, KTypeProjection.INSTANCE, List.class, cVar.f315272b, "KEY_COUNTERPARTY");
                if (list == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    PaymentCounterpartyInfo paymentCounterpartyInfoA = xn9.a.a((wn9.a) it8.next());
                    if (paymentCounterpartyInfoA != null) {
                        arrayList.add(paymentCounterpartyInfoA);
                    }
                }
                return arrayList;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cVar.f315273c.remove("KEY_COUNTERPARTY");
                cVar.f315272b.I0("KEY_COUNTERPARTY");
                return Unit.f186387a;
        }
    }
}
