package v4e;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f0 f0Var, Continuation continuation) {
        super(2, continuation);
        this.v = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c0 c0Var = new c0(this.v, continuation);
        c0Var.u = obj2;
        return c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f0 f0Var = this.v;
        f0Var.X2(f0Var.f286048r, new uz7.d(data, 7));
        return Unit.f186387a;
    }
}
