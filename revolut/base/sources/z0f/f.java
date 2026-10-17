package z0f;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.topup_screen.impl.screens.topup_methods.TopupMethodsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ TopupMethodsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TopupMethodsScreen topupMethodsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = topupMethodsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f0 f0Var = (f0) this.u.d();
        f0Var.H2(f0Var.A, new yy9.s(21));
        return Unit.f186387a;
    }
}
