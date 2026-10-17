package buf;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class o0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ CenteredAmountDelegate.Model v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f18822w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(a1 a1Var, CenteredAmountDelegate.Model model, Continuation continuation) {
        super(1, continuation);
        this.v = model;
        this.f18822w = a1Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new o0(this.f18822w, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((o0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            Object obj3 = this.v.f51981p;
            if (obj3 instanceof yof.b) {
                boolean z = ((yof.b) obj3).f315673b instanceof i1l.f;
                a1 a1Var = this.f18822w;
                if (z) {
                    ((s5k.d) a1Var.E).Z2();
                } else {
                    n5k.b bVar = a1Var.f18779y;
                    n60.a aVar2 = a1Var.A;
                    this.u = 1;
                    if (((n5k.p) bVar).k3(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
