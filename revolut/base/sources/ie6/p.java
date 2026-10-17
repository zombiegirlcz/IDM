package ie6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f160646w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(r rVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f160646w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f160646w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            case 1:
                p pVar2 = new p(this.f160646w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
            case 2:
                p pVar3 = new p(this.f160646w, continuation, 2);
                pVar3.v = obj2;
                return pVar3;
            case 3:
                p pVar4 = new p(this.f160646w, continuation, 3);
                pVar4.v = obj2;
                return pVar4;
            default:
                p pVar5 = new p(this.f160646w, continuation, 4);
                pVar5.v = obj2;
                return pVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n1 n1Var = (n1) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(n1Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        aii.q qVar = aii.q.f5292a;
        r rVar = this.f160646w;
        switch (i) {
            case 0:
                n1 n1Var = (n1) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((n1Var instanceof k1) || (n1Var instanceof l1)) {
                    rVar.C2(qVar);
                } else {
                    int i2 = jli.h.f175850a;
                }
                break;
            case 1:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((n1Var2 instanceof k1) || (n1Var2 instanceof l1)) {
                    rVar.C2(qVar);
                } else {
                    int i3 = jli.h.f175850a;
                }
                break;
            case 2:
                n1 n1Var3 = (n1) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var3 instanceof l1) {
                    rVar.n2(new o(rVar, null), new whi.b(6));
                } else if ((n1Var3 instanceof m1) || (n1Var3 instanceof k1)) {
                    rVar.C2(qVar);
                }
                break;
            case 3:
                n1 n1Var4 = (n1) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((n1Var4 instanceof k1) || (n1Var4 instanceof l1)) {
                    rVar.C2(qVar);
                } else {
                    int i5 = jli.h.f175850a;
                }
                break;
            default:
                n1 n1Var5 = (n1) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((n1Var5 instanceof k1) || (n1Var5 instanceof l1)) {
                    rVar.C2(qVar);
                } else {
                    int i6 = jli.h.f175850a;
                }
                break;
        }
        return Unit.f186387a;
    }
}
