package knd;

import com.revolut.data.model.Data;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.i implements Function3 {
    public /* synthetic */ Data u;
    public /* synthetic */ Set v;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        b bVar = new b(3, (Continuation) obj4);
        bVar.u = (Data) obj2;
        bVar.v = (Set) obj3;
        return bVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = this.u;
        Set set = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        try {
            Object content = data.getContent();
            return new Data(content != null ? new Pair((List) content, set) : null, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            return new Data(null, th10, data.getLoading());
        }
    }
}
