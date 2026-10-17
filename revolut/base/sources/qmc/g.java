package qmc;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zh9.u0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ h v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (list.isEmpty()) {
            return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            String string = ((TradingAccount.Portfolio) it8.next()).f105210a.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            arrayList.add(glc.a.a(this.v, string));
        }
        return u0.k(arrayList);
    }
}
