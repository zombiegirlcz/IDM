package pc1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.m1;
import nii.n1;
import pc1.c;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, Continuation continuation) {
        super(2, continuation);
        this.v = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVar = this.v;
        qVar.v.d.onNext(xc1.d.f);
        if (n1Var instanceof l1) {
            ea1.b.a("Button click: ".concat("Update"), fa1.k.INFO);
            qVar.A2();
        } else {
            boolean z = n1Var instanceof m1;
            c.b bVar = c.b.f234782a;
            if (z) {
                ea1.b.a("Button click: ".concat("Not now"), fa1.k.INFO);
                qVar.v2(bVar);
            } else {
                qVar.v2(bVar);
            }
        }
        return Unit.f186387a;
    }
}
