package paf;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TradingAccount.GIA f234557w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.d dVar, TradingAccount.GIA gia, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f234557w = gia;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, this.f234557w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        TradingAccount.GIA gia = this.f234557w;
        com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.d dVar = this.v;
        g gVar = new g(dVar, gia, null);
        this.u = 1;
        Object objP2 = dVar.p2(this, gVar);
        return objP2 == aVar ? aVar : objP2;
    }
}
