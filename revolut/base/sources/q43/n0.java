package q43;

import ael.u0;
import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class n0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ o0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, Continuation continuation) {
        super(2, continuation);
        this.v = o0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n0 n0Var = new n0(this.v, continuation);
        n0Var.u = obj2;
        return n0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n0) create((vf0.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vf0.k kVar = (vf0.k) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Data data = (Data) kVar.f288454a;
        Set set = (Set) kVar.f288455b;
        sh5.c cVar = (sh5.c) kVar.f288456c;
        Data data2 = (Data) kVar.d;
        o0 o0Var = this.v;
        o0Var.x2(new u0(o0Var, data, set, cVar, (Data) kVar.e, data2, 12));
        return Unit.f186387a;
    }
}
