package s47;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.TaxHubTransactionExportReviewScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.TaxHubTransactionExportReviewScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxHubTransactionExportReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TaxHubTransactionExportReviewScreen taxHubTransactionExportReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxHubTransactionExportReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CounterTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CounterTextDelegate.Model model = (CounterTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        String listId = model.f52159a;
        com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.a aVar2 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.a) nVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "LIST_ID_VAT_INFO")) {
            oki.h.v2(aVar2.f74435t, TaxHubTransactionExportReviewScreenContract$ModalStep.VatSummaryInfo.f74430a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
