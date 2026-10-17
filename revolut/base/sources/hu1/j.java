package hu1;

import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.feature.apm.blik.impl.ui.code.BlikCodeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import skm.a2;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ BlikCodeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(BlikCodeScreen blikCodeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = blikCodeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((HeaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e0 e0Var = (e0) this.u.T2();
        e0Var.x2(new hqk.a(22));
        a2 a2Var = e0Var.G;
        if (a2Var != null) {
            a2Var.f(null);
        }
        return Unit.f186387a;
    }
}
