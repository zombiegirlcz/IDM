package yna;

import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class t0 extends gim.i implements Function1 {
    public final /* synthetic */ c1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(c1 c1Var, Continuation continuation) {
        super(1, continuation);
        this.u = c1Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t0(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c1 c1Var = this.u;
        c1Var.l0.getClass();
        yji.l.j2(c1Var, c1Var.e1(h9b.a.f150222a), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        return Unit.f186387a;
    }
}
