package y45;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f310807w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List list, Continuation continuation) {
        super(2, continuation);
        this.f310807w = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.f310807w, continuation);
        lVar.v = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = (FlowCollector) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            List list = this.f310807w;
            ArrayList arrayList = new ArrayList();
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                k1j.b bVar = (k1j.b) it8.next();
                List list2 = bVar.f180284c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    BalanceWrapper balanceWrapper = (BalanceWrapper) obj3;
                    if (balanceWrapper instanceof BalanceWrapper.CreditCardBalanceWrapper ? ((BalanceWrapper.CreditCardBalanceWrapper) balanceWrapper).i.f69802q.contains(yw4.f.POCKET_TRANSFER) : true) {
                        arrayList2.add(obj3);
                    }
                }
                k1j.b bVarA = arrayList2.isEmpty() ? null : k1j.b.a(bVar, arrayList2);
                if (bVarA != null) {
                    arrayList.add(bVarA);
                }
            }
            Data dataP = zi0.c.P(arrayList, false, null, 3);
            this.v = null;
            this.u = 1;
            if (flowCollector.emit(dataP, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
