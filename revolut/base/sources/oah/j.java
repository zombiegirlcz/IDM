package oah;

import com.revolut.feature.wealth.api.navigation.models.DepositInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ lah.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a f223650w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(lah.c cVar, com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f223650w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f223650w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            DepositInfo depositInfo = this.v.f193397a;
            com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a aVar2 = this.f223650w;
            if (depositInfo == null) {
                oki.h.D2(aVar2.f95561s);
            } else if (depositInfo instanceof DepositInfo.RecurringDeposit) {
                this.u = 1;
                if (com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a.I2(aVar2, (DepositInfo.RecurringDeposit) depositInfo, this) == aVar) {
                    return aVar;
                }
            } else {
                if (!(depositInfo instanceof DepositInfo.OneOffDeposit)) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.D2(aVar2.f95561s);
                DepositInfo.OneOffDeposit oneOffDeposit = (DepositInfo.OneOffDeposit) depositInfo;
                dj0.d dVar = oneOffDeposit.f95319a;
                long j2 = dVar.f115082a;
                String str = dVar.f115083b.f306286a;
                String f104477a = oneOffDeposit.f95320b.getF104477a();
                StringBuilder sb6 = new StringBuilder("Expected RecurringDeposit, but got OneOffDeposit(amountAmount=");
                sb6.append(j2);
                sb6.append(", amountCurrency=");
                sb6.append(str);
                hx7.e.n(new IllegalStateException(a0.d.u(sb6, ", pocketId=", f104477a, ")")));
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
