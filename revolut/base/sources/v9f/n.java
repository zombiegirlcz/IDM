package v9f;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ FullScreenStateDelegate.Model u;
    public final /* synthetic */ p v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(FullScreenStateDelegate.Model model, p pVar, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = pVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (!Intrinsics.f(this.u.f52373a, "ERROR_STATE_ID")) {
            return Unit.f186387a;
        }
        p pVar = this.v;
        return pVar.n2(new uwe.f(pVar, null, 13), new whi.b(6));
    }
}
