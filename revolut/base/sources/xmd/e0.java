package xmd;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.spending_analytics.impl.ui.budget.setup_budget.SetupBudgetController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 extends gim.i implements Function2 {
    public final /* synthetic */ SetupBudgetController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(SetupBudgetController setupBudgetController, Continuation continuation) {
        super(2, continuation);
        this.u = setupBudgetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e0(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s0 s0VarR2 = this.u.R2();
        s0VarR2.getClass();
        o oVarI2 = s0VarR2.I2();
        if (oVarI2 != null) {
            dj0.d money = oVarI2.f307185a;
            Intrinsics.checkNotNullParameter(money, "money");
            long j2 = money.f115082a;
            long jK2 = s0.K2(money);
            long j3 = money.f115082a;
            long j5 = j3 - jK2;
            if (j5 < 0) {
                j5 = 0;
            }
            long jK22 = s0.K2(dj0.d.c(money, j5, null, 2));
            long j16 = j3 - jK22;
            if (j16 < 0) {
                j16 = 0;
            }
            if (s0.K2(dj0.d.c(money, j16, null, 2)) < jK2) {
                jK2 = jK22;
            }
            long j22 = j2 - jK2;
            s0VarR2.L2(o.a(oVarI2, dj0.d.c(money, j22 >= 0 ? j22 : 0L, null, 2), null, 2));
        }
        return Unit.f186387a;
    }
}
