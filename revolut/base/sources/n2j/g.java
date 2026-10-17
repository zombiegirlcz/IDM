package n2j;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.shared.feature.wealth.models.holding.CashHoldingAvailability;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ TradingAccount B;
    public final /* synthetic */ CashHoldingAvailability C;
    public final /* synthetic */ j D;
    public final /* synthetic */ AccountId E;
    public TradingAccount u;
    public CashHoldingAvailability v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AccountId f211567w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CashHoldingAvailability f211568x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TradingAccount f211569y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TradingAccount tradingAccount, CashHoldingAvailability cashHoldingAvailability, j jVar, AccountId accountId, Continuation continuation) {
        super(2, continuation);
        this.B = tradingAccount;
        this.C = cashHoldingAvailability;
        this.D = jVar;
        this.E = accountId;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.B, this.C, this.D, this.E, continuation);
        gVar.A = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        CashHoldingAvailability cashHoldingAvailability;
        TradingAccount tradingAccount;
        CashHoldingAvailability cashHoldingAvailability2;
        AccountId accountId;
        TradingAccount tradingAccount2;
        k1j.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.z;
        try {
            if (i == 0) {
                o.b(obj2);
                TradingAccount tradingAccount3 = this.B;
                cashHoldingAvailability = this.C;
                j jVar = this.D;
                AccountId accountId2 = this.E;
                m.Companion companion = m.INSTANCE;
                kel.b bVar = cashHoldingAvailability.f105108a;
                this.A = null;
                this.u = tradingAccount3;
                this.v = cashHoldingAvailability;
                this.f211567w = accountId2;
                this.f211568x = cashHoldingAvailability;
                this.f211569y = tradingAccount3;
                this.z = 1;
                Object objA2 = j.a(jVar, bVar, this);
                if (objA2 == aVar2) {
                    return aVar2;
                }
                tradingAccount = tradingAccount3;
                cashHoldingAvailability2 = cashHoldingAvailability;
                accountId = accountId2;
                tradingAccount2 = tradingAccount;
                obj2 = objA2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                TradingAccount tradingAccount4 = this.f211569y;
                CashHoldingAvailability cashHoldingAvailability3 = this.f211568x;
                AccountId accountId3 = this.f211567w;
                CashHoldingAvailability cashHoldingAvailability4 = this.v;
                TradingAccount tradingAccount5 = this.u;
                o.b(obj2);
                tradingAccount2 = tradingAccount4;
                tradingAccount = tradingAccount5;
                cashHoldingAvailability2 = cashHoldingAvailability3;
                cashHoldingAvailability = cashHoldingAvailability4;
                accountId = accountId3;
            }
            dj0.d dVar = (dj0.d) obj2;
            String str = cashHoldingAvailability.f105108a.f183148a.f;
            int i2 = f.f211566a[tradingAccount.getE().ordinal()];
            if (i2 == 1) {
                aVar = k1j.a.TRADING_ACCOUNTS;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Youth holder type is not supported");
                }
                aVar = k1j.a.JOINT_TRADING_ACCOUNTS;
            }
            objA = new BalanceWrapper.TradingAccountBalanceWrapper(tradingAccount2, cashHoldingAvailability2, dVar, str, accountId, aVar, null);
            m.Companion companion2 = m.INSTANCE;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion3 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof n) {
            return null;
        }
        return objA;
    }
}
