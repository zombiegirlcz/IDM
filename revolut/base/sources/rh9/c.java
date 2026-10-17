package rh9;

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

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        ArrayList counterLimits;
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j2 j2Var = this.v.f254389s;
        do {
            value = j2Var.getValue();
            b bVar = (b) value;
            Intrinsics.h(list);
            counterLimits = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof WalletLimit.CounterLimit) {
                    counterLimits.add(obj3);
                }
            }
            bVar.getClass();
            Intrinsics.checkNotNullParameter(counterLimits, "counterLimits");
        } while (!j2Var.h(value, new b(counterLimits)));
        return Unit.f186387a;
    }
}
