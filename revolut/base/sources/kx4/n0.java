package kx4;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class n0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ r0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(r0 r0Var, Continuation continuation) {
        super(2, continuation);
        this.v = r0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n0 n0Var = new n0(this.v, continuation);
        n0Var.u = obj2;
        return n0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n0) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r0.R(this.v).d1(textData.f52597a, textData.f52598b.toString());
        return Unit.f186387a;
    }
}
