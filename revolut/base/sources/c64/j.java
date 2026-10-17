package c64;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ CalculatorScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CalculatorScreen calculatorScreen, Continuation continuation) {
        super(2, continuation);
        this.u = calculatorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((b0) this.u.d()).I2();
        return Unit.f186387a;
    }
}
