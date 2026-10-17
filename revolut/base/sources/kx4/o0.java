package kx4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import dx4.l2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class o0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ r0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r0 r0Var, Continuation continuation) {
        super(2, continuation);
        this.v = r0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o0 o0Var = new o0(this.v, continuation);
        o0Var.u = obj2;
        return o0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o0) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        if (obj3 instanceof l2) {
            r0.R(this.v).Z((l2) obj3);
        }
        return Unit.f186387a;
    }
}
