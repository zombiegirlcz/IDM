package wj8;

import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends gim.i implements Function1 {
    public final /* synthetic */ ProductSelectionDelegate.Model u;
    public final /* synthetic */ c0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ProductSelectionDelegate.Model model, c0 c0Var, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b0(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = this.u.i;
        if (obj3 instanceof xc8.c) {
            this.v.C2(new q((xc8.c) obj3));
        }
        return Unit.f186387a;
    }
}
