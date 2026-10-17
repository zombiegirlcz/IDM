package czc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.impl.ui.summary.SummaryController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SummaryController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(SummaryController summaryController, Continuation continuation) {
        super(2, continuation);
        this.v = summaryController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        z zVar = obj3 instanceof z ? (z) obj3 : null;
        if (zVar == null) {
            return Unit.f186387a;
        }
        p pVar = (p) this.v.R.getValue();
        DocumentType documentType = zVar.a();
        c0 c0Var = (c0) pVar;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        c0Var.C2(new t(documentType));
        return Unit.f186387a;
    }
}
