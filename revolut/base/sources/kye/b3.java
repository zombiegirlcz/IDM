package kye;

import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b3 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f190712w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(k3 k3Var, Continuation continuation) {
        super(2, continuation);
        this.f190712w = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b3 b3Var = new b3(this.f190712w, continuation);
        b3Var.v = obj2;
        return b3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b3) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        k3 k3Var = this.f190712w;
        cli.y yVar = k3Var.f190763d0;
        yhm.r rVar = (yhm.r) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            SelectedMethod selectedMethod = (SelectedMethod) rVar.f314201a;
            String str = (String) rVar.f314202b;
            xi0.b bVar = (xi0.b) rVar.f314203c;
            if ((((selectedMethod instanceof vye.d) && ((vye.d) selectedMethod).e == vye.c.GOOGLE_PAY) || (selectedMethod instanceof SelectedMethod.StoredMethod.Card) || ((selectedMethod instanceof vye.b) && ((vye.b) selectedMethod).e != null)) && ((Boolean) k3Var.f190761a0.getValue()).booleanValue()) {
                if (!Intrinsics.f(str, bVar.f306286a) || ((m) ((vkm.j2) yVar.f22677a).getValue()).C == null) {
                    vte.b bVar2 = k3Var.K;
                    this.v = null;
                    this.u = 1;
                    obj2 = ((xve.d) bVar2).c(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    k3Var.H2(yVar, new m0(16));
                }
            } else if (((m) ((vkm.j2) yVar.f22677a).getValue()).C != null) {
                k3Var.H2(yVar, new m0(17));
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yhm.o.b(obj2);
        k3Var.H2(yVar, new a3(0, (aue.a) obj2));
        return Unit.f186387a;
    }
}
