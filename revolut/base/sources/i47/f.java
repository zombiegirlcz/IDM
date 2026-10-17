package i47;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.TaxHubTransactionExportFilterScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxHubTransactionExportFilterScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TaxHubTransactionExportFilterScreen taxHubTransactionExportFilterScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxHubTransactionExportFilterScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        Object obj3 = model.k;
        com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.a aVar2 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.a) jVarE3;
        if (obj3 instanceof xi0.b) {
            aVar2.H2(aVar2.f74381r, new av8.o(obj3, 28));
        } else {
            aVar2.getClass();
        }
        return Unit.f186387a;
    }
}
