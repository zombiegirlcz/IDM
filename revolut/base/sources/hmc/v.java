package hmc;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class v extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ w v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, Continuation continuation) {
        super(2, continuation);
        this.v = wVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v vVar = new v(this.v, continuation);
        vVar.u = obj2;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (list.isEmpty()) {
            return new go.g(zi0.c.P(r0.g(), false, null, 3), 2);
        }
        List<TradingAccount.Portfolio> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (TradingAccount.Portfolio portfolio : list2) {
            w wVar = this.v;
            zjh.f fVar = wVar.f153668c;
            String string = portfolio.f105210a.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            vkm.d dVarB = rd0.e.b(fVar.B(string, w4l.h.f294642c));
            emc.e eVar = wVar.f153667b;
            String string2 = portfolio.f105210a.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            arrayList.add(nim.a.v(u0.m(dVarB, eVar.e(string2)), new a(4)));
        }
        return nim.a.v(u0.k(arrayList), new a(5));
    }
}
