package vch;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 extends gim.i implements Function1 {
    public final /* synthetic */ CellDetailsDelegate.Model u;
    public final /* synthetic */ x0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(CellDetailsDelegate.Model model, x0 x0Var, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = x0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k0(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = this.u.o;
        if (obj3 instanceof t1h.m) {
            this.v.f287749y.Z2((t1h.m) obj3);
        }
        return Unit.f186387a;
    }
}
