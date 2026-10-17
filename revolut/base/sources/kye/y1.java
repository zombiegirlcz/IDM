package kye;

import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class y1 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f190880w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(k3 k3Var, Continuation continuation) {
        super(2, continuation);
        this.f190880w = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        y1 y1Var = new y1(this.f190880w, continuation);
        y1Var.v = obj2;
        return y1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y1) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        k3 k3Var = this.f190880w;
        cli.y yVar = k3Var.f190763d0;
        String str = (String) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            if (((m) ((vkm.j2) yVar.f22677a).getValue()).A) {
                k3Var.H2(yVar, new m0(11));
            } else {
                u51.a aVar2 = k3Var.I;
                n nVar = k3Var.f190767s;
                yte.n nVarK = pw5.a.K(nVar.f190796b, nVar.f190795a);
                this.v = null;
                this.u = 1;
                Object objJ = ((hve.o) ((e0f.r1) aVar2).f121679a).j(new TopUpMethodsContext(str, nVarK), this);
                if (objJ != aVar) {
                    objJ = Unit.f186387a;
                }
                if (objJ == aVar) {
                    return aVar;
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
