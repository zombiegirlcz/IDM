package g22;

import aii.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.breakdown.PaymentsBreakdownController;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import k5k.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import n5k.r;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PaymentsBreakdownController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PaymentsBreakdownController paymentsBreakdownController, Continuation continuation) {
        super(2, continuation);
        this.v = paymentsBreakdownController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        a aVar2 = (a) this.v.S.getValue();
        Object obj3 = model.f51787l;
        g gVar = (g) aVar2;
        if (obj3 instanceof x) {
            ((r) gVar.f139770r).Z2();
        } else {
            gVar.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "PaymentsBreakdownControllerModel", a0.d.m(obj3, "No handler: "), null, null, 16);
        }
        gVar.C2(q.f5292a);
        return Unit.f186387a;
    }
}
