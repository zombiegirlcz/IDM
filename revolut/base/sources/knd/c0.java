package knd;

import com.revolut.feature.spending_analytics.api.models.GroupingExtraData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 extends gim.i implements Function3 {
    public /* synthetic */ List u;
    public /* synthetic */ List v;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        c0 c0Var = new c0(3, (Continuation) obj4);
        c0Var.u = (List) obj2;
        c0Var.v = (List) obj3;
        return c0Var.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = this.u;
        List list2 = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return new GroupingExtraData.Card(list, list2);
    }
}
