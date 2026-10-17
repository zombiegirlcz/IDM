package h2j;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f148850w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a aVar, Object obj2, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f148850w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new q(this.v, this.f148850w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((q) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            s1j.b bVar = aVar2.u;
            TradingAccount tradingAccount = ((j1j.e) this.f148850w).f170620a;
            this.u = 1;
            obj2 = bVar.a(tradingAccount, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        qih.f fVar = (qih.f) obj2;
        if (fVar == null) {
            return null;
        }
        yji.l.j2(aVar2, aVar2.e1(fVar), null, null, 3);
        return Unit.f186387a;
    }
}
