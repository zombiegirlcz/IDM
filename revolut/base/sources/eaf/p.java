package eaf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.i implements Function1 {
    public final /* synthetic */ RowDelegate.Model u;
    public final /* synthetic */ q v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(RowDelegate.Model model, q qVar, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = qVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new p(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((p) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = this.u.u;
        if (obj3 instanceof e) {
            this.v.C2(new i(((e) obj3).f124229a));
        }
        return Unit.f186387a;
    }
}
