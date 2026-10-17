package v9f;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.i implements Function1 {
    public final /* synthetic */ RowDelegate.Model u;
    public final /* synthetic */ p v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(RowDelegate.Model model, p pVar, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = pVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new o(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((o) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = this.u.u;
        if (obj3 instanceof f) {
            this.v.C2(new h(((f) obj3).f287032a));
        }
        return Unit.f186387a;
    }
}
