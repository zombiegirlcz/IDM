package asa;

import com.revolut.data.model.Data;
import com.revolut.feature.wallets.api.module.WalletLimit;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.c0;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.i implements Function3 {
    public /* synthetic */ Data u;
    public /* synthetic */ List v;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        k kVar = new k(3, (Continuation) obj4);
        kVar.u = (Data) obj2;
        kVar.v = (List) obj3;
        return kVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        hrf.e eVar;
        Data data2 = this.u;
        List list = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Intrinsics.h(data2);
        try {
            Object content = data2.getContent();
            if (content != null) {
                hra.a aVar2 = (hra.a) content;
                hra.b bVar = aVar2.f154798b;
                eVar = new hrf.e(new hrf.d(bVar.f154800a, bVar.f154801b), aVar2.f154797a, aVar2.f154799c);
            } else {
                eVar = null;
            }
            data = new Data(eVar, data2.getError(), data2.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data2.getLoading());
        }
        Intrinsics.h(list);
        return new g(c0.N(list, WalletLimit.CounterLimit.class), data);
    }
}
