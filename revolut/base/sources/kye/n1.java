package kye;

import com.revolut.feature.topup_screen.common.TopUpTarget;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class n1 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f190798w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(k3 k3Var, Continuation continuation) {
        super(2, continuation);
        this.f190798w = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n1 n1Var = new n1(this.f190798w, continuation);
        n1Var.v = obj2;
        return n1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n1) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str = (String) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        k3 k3Var = this.f190798w;
        if (i == 0) {
            yhm.o.b(obj2);
            q3 q3Var = k3Var.f190766r;
            TopUpTarget topUpTarget = k3Var.f190767s.f190795a;
            this.v = null;
            this.u = 1;
            obj2 = ((w3) q3Var).a(str, topUpTarget, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        k3Var.H2(k3Var.f190763d0, new ar3.a(16, (dj0.d) obj2));
        return Unit.f186387a;
    }
}
