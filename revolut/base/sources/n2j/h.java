package n2j;

import com.revolut.core.model.account.AccountId;
import com.revolut.shared.feature.wealth.models.holding.CashHoldingAvailability;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import yhm.o;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f211570w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TradingAccount f211571x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f211572y;
    public final /* synthetic */ AccountId z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List list, TradingAccount tradingAccount, j jVar, AccountId accountId, Continuation continuation) {
        super(2, continuation);
        this.f211570w = list;
        this.f211571x = tradingAccount;
        this.f211572y = jVar;
        this.z = accountId;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.f211570w, this.f211571x, this.f211572y, this.z, continuation);
        hVar.v = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            List list = this.f211570w;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(e0.g(coroutineScope, null, null, new g(this.f211571x, (CashHoldingAvailability) it8.next(), this.f211572y, this.z, null), 3));
            }
            this.v = null;
            this.u = 1;
            obj2 = e0.h(arrayList, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return d0.Z((Iterable) obj2);
    }
}
