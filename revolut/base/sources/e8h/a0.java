package e8h;

import a8h.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ c0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, Continuation continuation) {
        super(2, continuation);
        this.v = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a0 a0Var = new a0(this.v, continuation);
        a0Var.u = obj2;
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a0) create((Set) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Set set = (Set) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            b.a aVar2 = (b.a) j6.a.k(b.a.class, this.v.f123675b, c0.a(y0.b((c0h.b) it8.next())));
            c0h.a aVarA = aVar2 != null ? a8h.a.a(aVar2) : null;
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        return ue0.e.M(arrayList);
    }
}
