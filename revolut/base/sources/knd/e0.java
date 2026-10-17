package knd;

import com.revolut.feature.spending_analytics.api.models.GroupingExtraData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e0 e0Var = new e0(2, continuation);
        e0Var.u = obj2;
        return e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return new GroupingExtraData.JointAccountParticipants(list);
    }
}
