package pc1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.m1;
import nii.n1;
import pc1.c;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, Continuation continuation) {
        super(2, continuation);
        this.v = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVar = this.v;
        qVar.v.d.onNext(xc1.d.f);
        boolean z = n1Var instanceof l1;
        c.a aVar2 = c.a.f234781a;
        if (z) {
            ea1.b.a("Button click: ".concat("New payment"), fa1.k.INFO);
            qVar.v2(aVar2);
        } else if (n1Var instanceof m1) {
            ea1.b.a("Button click: ".concat("Done"), fa1.k.INFO);
            qVar.v2(c.b.f234782a);
        } else {
            qVar.v2(aVar2);
        }
        return Unit.f186387a;
    }
}
