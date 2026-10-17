package d78;

import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.i7;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends gim.i implements Function2 {
    public /* synthetic */ Object u;

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        w wVar = new w(2, continuation);
        wVar.u = obj2;
        return wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (i7) d0.b0(list);
        }
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = (i7[]) list.toArray(new i7[0]);
        i7[] i7VarArr2 = (i7[]) Arrays.copyOf(i7VarArr, i7VarArr.length);
        cVar.getClass();
        return i7.c.b(i7VarArr2);
    }
}
