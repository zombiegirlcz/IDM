package kye;

import com.revolut.feature.topup_screen.common.TopUpTarget;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class f1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ k3 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(k3 k3Var, Continuation continuation) {
        super(2, continuation);
        this.v = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f1(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        k3 k3Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            q3 q3Var = k3Var.f190766r;
            n nVar = k3Var.f190767s;
            xi0.b bVar = nVar.f190797c;
            TopUpTarget topUpTarget = nVar.f190795a;
            this.u = 1;
            obj2 = ((w3) q3Var).b(bVar, topUpTarget, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        k3Var.H2(k3Var.f190763d0, new kp0.q(k3Var, (p3) obj2, 27));
        return Unit.f186387a;
    }
}
