package e2d;

import ael.t;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import e1d.h;
import gim.i;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        od0.i iVar = (od0.i) pair.f186385a;
        xi0.b bVar = (xi0.b) pair.f186386b;
        if (!iVar.d()) {
            return zi0.c.i(r0.g());
        }
        TradingAccount.Portfolio portfolioL = com.revolut.shared.feature.wealth.models.trading_accounts.d.l((TradingAccount) iVar.c());
        t tVar = this.v.f122051b;
        String string = portfolioL.f105210a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return nim.a.v(rd0.e.b(t.d(tVar, string, false, null, bVar, false, null, 32)), new h(3));
    }
}
