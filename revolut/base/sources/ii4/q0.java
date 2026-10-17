package ii4;

import hs3.s1;
import hs3.u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import skm.a2;

/* JADX INFO: loaded from: classes22.dex */
public final class q0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ s0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, Continuation continuation) {
        super(2, continuation);
        this.v = s0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q0 q0Var = new q0(this.v, continuation);
        q0Var.u = obj2;
        return q0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q0) create((n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n nVar = (n) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean z = nVar instanceof j;
        s0 s0Var = this.v;
        if (z) {
            s0Var.C2(new m0(((j) nVar).f161531a));
        } else if (nVar instanceof m) {
            m mVar = (m) nVar;
            s0Var.C2(new l0(mVar.f161537b, mVar.f161536a));
        } else {
            if (!(nVar instanceof k)) {
                throw new NoWhenBranchMatchedException();
            }
            u1 u1Var = ((k) nVar).f161532a;
            List list = u1Var.f154955c;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(com.revolut.feature.credit.application.plugins.api.models.config.c.a((s1) it8.next()));
            }
            long j2 = u1Var.f154954b;
            a2 a2Var = s0Var.f161555q;
            if (a2Var != null) {
                a2Var.f(null);
            }
            s0Var.f161555q = s0Var.n2(new r0(arrayList, s0Var, j2, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
