package kye;

import com.revolut.feature.topup_screen.common.TopUpTarget;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class g1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ k3 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(k3 k3Var, Continuation continuation) {
        super(2, continuation);
        this.v = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g1(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
            String str = nVar.f190797c.f306286a;
            TopUpTarget topUpTarget = nVar.f190795a;
            this.u = 1;
            obj2 = ((w3) q3Var).d(str, topUpTarget, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        k3Var.H2(k3Var.f190763d0, new ar3.a(15, (dj0.d) obj2));
        return Unit.f186387a;
    }
}
