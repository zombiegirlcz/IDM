package m9d;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import m9d.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class d1 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ g1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(g1 g1Var, Continuation continuation) {
        super(1, continuation);
        this.v = g1Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d1(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d1) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        g1 g1Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ie.a aVar2 = g1Var.f203700r;
            this.u = 1;
            obj2 = aVar2.e(false, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        List list = (List) obj2;
        if (list.size() == 1) {
            g1Var.v2(new b0((String) zhm.d0.b0(list)));
        } else {
            g1Var.v2(a0.a.f203683a);
        }
        return Unit.f186387a;
    }
}
