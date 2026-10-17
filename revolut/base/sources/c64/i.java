package c64;

import com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CalculatorScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(CalculatorScreen calculatorScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = calculatorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.v, continuation, 0);
            default:
                return new i(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CalculatorScreen calculatorScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0Var = (b0) calculatorScreen.d();
                b0Var.getClass();
                b0Var.n2(new x(b0Var, null), new whi.b(6));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0Var2 = (b0) calculatorScreen.d();
                eu3.c cVarC = b0Var2.J2().c();
                if (cVarC != null) {
                    b0Var2.C2(new m(new eu3.e(cVarC, b0Var2.J2().f21632c)));
                }
                break;
        }
        return Unit.f186387a;
    }
}
