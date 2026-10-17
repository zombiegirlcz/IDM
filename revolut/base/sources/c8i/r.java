package c8i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BalanceWrapper f22216w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x5i.d f22217x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AccountWrapper f22218y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, BalanceWrapper balanceWrapper, x5i.d dVar, AccountWrapper accountWrapper, Continuation continuation) {
        super(2, continuation);
        this.v = sVar;
        this.f22216w = balanceWrapper;
        this.f22217x = dVar;
        this.f22218y = accountWrapper;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new r(this.v, this.f22216w, this.f22217x, this.f22218y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        r7i.p pVar = this.v.i;
        BalanceWrapper.TradingAccountBalanceWrapper tradingAccountBalanceWrapper = (BalanceWrapper.TradingAccountBalanceWrapper) this.f22216w;
        TradingAccount tradingAccount = tradingAccountBalanceWrapper.f99447h;
        kel.b bVar = tradingAccountBalanceWrapper.i.f105108a;
        this.u = 1;
        Object objD = pVar.d(tradingAccount, bVar, this.f22217x, this.f22218y, this);
        return objD == aVar ? aVar : objD;
    }
}
