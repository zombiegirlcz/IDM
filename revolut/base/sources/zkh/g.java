package zkh;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ od0.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f322993w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n9l.b f322994x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(od0.i iVar, h hVar, n9l.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
        this.f322993w = hVar;
        this.f322994x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, this.f322993w, this.f322994x, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xi0.b bVar = (xi0.b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        TradingAccount.Portfolio portfolioL = com.revolut.shared.feature.wealth.models.trading_accounts.d.l((TradingAccount) this.v.c());
        ael.t tVar = this.f322993w.f322996a;
        String string = portfolioL.f105210a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return rd0.e.b(nim.a.w(ael.t.d(tVar, string, false, this.f322994x, bVar, false, null, 32), new rsd.h(portfolioL, 2)));
    }
}
