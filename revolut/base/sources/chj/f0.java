package chj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import dej.j1;
import dfj.k4;
import dfj.t3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ u0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dej.k f24246w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(u0 u0Var, dej.k kVar, Continuation continuation) {
        super(1, continuation);
        this.v = u0Var;
        this.f24246w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f0(this.v, this.f24246w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        u0 u0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            t3 t3Var = u0Var.f24310n;
            dej.k kVar = this.f24246w;
            PaymentMethod.Pocket pocket = kVar.f113576c.f113639c;
            j1 j1Var = kVar.e;
            k0 k0VarI3 = u0.i3(u0Var, pocket, j1Var != null ? j1Var.f113568a : null);
            this.u = 1;
            obj2 = ((k4) t3Var).d(kVar, k0VarI3, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        u0Var.f24313r.k(new z(null, false));
        return obj2;
    }
}
