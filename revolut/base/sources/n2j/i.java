package n2j;

import com.revolut.core.model.account.AccountId;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import skm.e0;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TradingAccount f211573w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f211574x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AccountId f211575y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TradingAccount tradingAccount, j jVar, AccountId accountId, Continuation continuation) {
        super(2, continuation);
        this.f211573w = tradingAccount;
        this.f211574x = jVar;
        this.f211575y = accountId;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.f211573w, this.f211574x, this.f211575y, continuation);
        iVar.v = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.v;
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
        h hVar = new h(list, this.f211573w, this.f211574x, this.f211575y, null);
        this.v = null;
        this.u = 1;
        Object objO = e0.o(hVar, this);
        return objO == aVar ? aVar : objO;
    }
}
