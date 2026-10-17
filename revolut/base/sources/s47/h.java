package s47;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.TaxHubTransactionExportReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.a3;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxHubTransactionExportReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TaxHubTransactionExportReviewScreen taxHubTransactionExportReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxHubTransactionExportReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        Object obj3 = ((RowDelegate.Model) model.f53305b).u;
        com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.a aVar2 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.a) nVarE3;
        if (obj3 instanceof a3) {
            aVar2.H2(aVar2.f74434s, new ib6.j(obj3, 22));
        } else {
            aVar2.getClass();
        }
        return Unit.f186387a;
    }
}
