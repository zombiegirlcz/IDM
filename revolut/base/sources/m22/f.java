package m22;

import c12.p0;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDraft;
import com.revolut.feature.apm.core.ui.impl.ui.list.ApmListScreen;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ApmListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ApmListScreen apmListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = apmListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.T.getValue();
        Object obj3 = model.u;
        mc2.b bVar = (mc2.b) gVar.o;
        bVar.getClass();
        ApmPaymentDraft apmPaymentDraft = obj3 instanceof ApmPaymentDraft ? (ApmPaymentDraft) obj3 : null;
        if (apmPaymentDraft == null) {
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(obj3, "QvikApmListExtension can't handle item: "));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        } else {
            bVar.f204249n.getClass();
            p0 p0VarA = mc2.c.a(apmPaymentDraft);
            if (p0VarA != null) {
                bVar.A2(new com.revolut.kompot.common.b(bVar.o2(p0VarA), (ModalDestination.Style) null, 6));
            }
        }
        return Unit.f186387a;
    }
}
