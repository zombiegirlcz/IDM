package vkh;

import com.revolut.feature.statements.api.navigation.AccountStatementProduct;
import com.revolut.feature.statements.api.navigation.AccountsStatementFeatureConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ q v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, Continuation continuation) {
        super(1, continuation);
        this.v = qVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        q qVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            obj2 = q.y2(qVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        List list = (List) obj2;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(z92.f.l((io3.d) it8.next()));
        }
        return qVar.C1(new AccountsStatementFeatureConfig.AccountsStatementDestination(d0.i1(arrayList), AccountStatementProduct.Commodities.f88234a));
    }
}
