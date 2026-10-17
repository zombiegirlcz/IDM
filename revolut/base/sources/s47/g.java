package s47;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.TaxHubTransactionExportReviewScreen;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxHubTransactionExportReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TaxHubTransactionExportReviewScreen taxHubTransactionExportReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxHubTransactionExportReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        Object obj3 = model.k;
        com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.a aVar2 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.a) nVarE3;
        if (obj3 instanceof LocalDate) {
            aVar2.H2(aVar2.f74434s, new ib6.j(obj3, 21));
        } else {
            aVar2.getClass();
        }
        return Unit.f186387a;
    }
}
