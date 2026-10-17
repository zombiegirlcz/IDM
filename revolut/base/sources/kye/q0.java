package kye;

import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kye.u;

/* JADX INFO: loaded from: classes8.dex */
public final class q0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ SelectedMethod v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f190817w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(SelectedMethod selectedMethod, k3 k3Var, Continuation continuation) {
        super(2, continuation);
        this.v = selectedMethod;
        this.f190817w = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q0(this.v, this.f190817w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        k3 k3Var = this.f190817w;
        cli.y yVar = k3Var.f190763d0;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            SelectedMethod selectedMethod = this.v;
            boolean z = selectedMethod instanceof SelectedMethod.StoredMethod.Card;
            boolean z3 = (selectedMethod instanceof vye.d) && ((vye.d) selectedMethod).e == vye.c.GOOGLE_PAY;
            if (!z && !z3) {
                k3Var.H2(yVar, new m0(5));
                return Unit.f186387a;
            }
            y51.a aVar2 = k3Var.A;
            this.u = 1;
            obj2 = ((e0f.z) aVar2).h(false, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            k3Var.H2(yVar, new m0(4));
            k3Var.C2(u.b.f190843a);
        }
        return Unit.f186387a;
    }
}
