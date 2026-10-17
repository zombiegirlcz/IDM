package st1;

import com.revolut.feature.wallets.api.module.WalletLimit;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        c cVar;
        ArrayList arrayList;
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j2 j2Var = this.v.u;
        do {
            value = j2Var.getValue();
            cVar = (c) value;
            Intrinsics.h(list);
            arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof WalletLimit.CounterLimit) {
                    arrayList.add(obj3);
                }
            }
        } while (!j2Var.h(value, c.a(cVar, null, arrayList, 1)));
        return Unit.f186387a;
    }
}
