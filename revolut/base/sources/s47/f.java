package s47;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.TaxHubTransactionExportReviewScreen;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.a3;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxHubTransactionExportReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TaxHubTransactionExportReviewScreen taxHubTransactionExportReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxHubTransactionExportReviewScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        Object obj3 = model.u;
        com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.a aVar2 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.a) nVarE3;
        aVar2.getClass();
        if (obj3 instanceof a3) {
            aVar2.C1(u0.c(new TransactionsFeatureConfig.Details(ofm.q.P((a3) obj3), null, null, null, 126)));
        }
        return Unit.f186387a;
    }
}
