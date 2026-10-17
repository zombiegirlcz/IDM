package n1j;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class z extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f211411w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c cVar, Object obj2, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f211411w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new z(this.v, this.f211411w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((z) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c cVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            s1j.b bVar = cVar.f99510s;
            TradingAccount tradingAccount = ((j1j.e) this.f211411w).f170620a;
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
        yji.l.j2(cVar, cVar.e1(fVar), null, null, 3);
        return Unit.f186387a;
    }
}
