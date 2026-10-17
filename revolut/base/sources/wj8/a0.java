package wj8;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends gim.i implements Function1 {
    public final /* synthetic */ FullScreenStateDelegate.Model u;
    public final /* synthetic */ c0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(FullScreenStateDelegate.Model model, c0 c0Var, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a0(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(this.u.f52373a, "ERROR_STATE_ID")) {
            this.v.u.a();
        }
        return Unit.f186387a;
    }
}
