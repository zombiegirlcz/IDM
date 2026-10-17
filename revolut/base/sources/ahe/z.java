package ahe;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes8.dex */
public final class z extends gim.i implements Function3 {
    public /* synthetic */ Data u;
    public /* synthetic */ Data v;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        z zVar = new z(3, (Continuation) obj4);
        zVar.u = (Data) obj2;
        zVar.v = (Data) obj3;
        return zVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = this.u;
        Data data2 = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return data2.getContent() == null ? Data.copy$default(data2, data.getContent(), null, false, 6, null) : data2;
    }
}
