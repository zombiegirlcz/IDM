package s6f;

import com.revolut.feature.robo.api.navigation.RoboFeatureConfig;
import com.revolut.feature.wealth.api.declaration.DualAddMoneyDestination;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.feature.wealth.ui.api.navigation.InvestDocumentsDetailsDestination;
import com.revolut.feature.wealth.ui.api.navigation.InvestDocumentsType;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import gim.i;
import i6f.u;
import i6f.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends i implements Function1 {
    public int u;
    public final /* synthetic */ v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a f260340w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v vVar, com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = vVar;
        this.f260340w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, this.f260340w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            u uVar = (u) this.v;
            int i2 = e.f260339a[uVar.f158983b.ordinal()];
            com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a aVar2 = this.f260340w;
            if (i2 == 1) {
                TransferSubjectId.Portfolio portfolio = new TransferSubjectId.Portfolio(uVar.f158982a);
                WealthAccountType wealthAccountType = WealthAccountType.ROBO;
                dj0.d.Companion.getClass();
                dj0.d dVar = dj0.d.e;
                return aVar2.C1(new DualAddMoneyDestination(portfolio, wealthAccountType, dVar, dVar, null, null, true));
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    aVar2.C1(new InvestDocumentsDetailsDestination(InvestDocumentsType.ROBO.f95912a));
                    return Unit.f186387a;
                }
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2.C1(new RoboFeatureConfig.EditPortfolioDestination(uVar.f158982a));
                return Unit.f186387a;
            }
            String str = uVar.f158982a;
            this.u = 1;
            if (com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a.I2(aVar2, str, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
