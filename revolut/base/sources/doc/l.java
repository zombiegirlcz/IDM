package doc;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.delegates.li;
import com.revolut.core.ui_kit.delegates.mi;
import ip0.jm0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((TrendViewDelegate.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        hw0.k kVar;
        t tVar = this.v.f116510c;
        TrendViewDelegate.a aVar = (TrendViewDelegate.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (!Intrinsics.f(aVar, TrendViewDelegate.a.C0428a.f53562a)) {
            int i = 5;
            if (aVar instanceof li) {
                if (((li) aVar).f54446a.E instanceof c0) {
                    tVar.d3(new dmj.e0(d0Var, i));
                }
            } else if (aVar instanceof mi) {
                mi miVar = (mi) aVar;
                jm0 jm0Var = miVar.f54484a;
                if ((jm0Var.E instanceof c0) && (list = jm0Var.f164881c) != null && (kVar = (hw0.k) list.get(miVar.f54485b)) != null) {
                    Object obj3 = kVar.e;
                    d0Var = obj3 instanceof d0 ? (d0) obj3 : null;
                    if (d0Var != null) {
                        tVar.d3(new dmj.e0(d0Var.f116494a, i));
                    }
                }
            }
        }
        return Unit.f186387a;
    }
}
