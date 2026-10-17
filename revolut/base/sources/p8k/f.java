package p8k;

import com.revolut.feature.wallets.api.module.WalletLimit;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        d dVar;
        ArrayList arrayList;
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j2 j2Var = this.v.f234180w;
        do {
            value = j2Var.getValue();
            dVar = (d) value;
            Intrinsics.h(list);
            arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof WalletLimit.CounterLimit) {
                    arrayList.add(obj3);
                }
            }
        } while (!j2Var.h(value, d.a(dVar, arrayList, null, 2)));
        return Unit.f186387a;
    }
}
