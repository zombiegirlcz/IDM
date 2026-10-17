package i47;

import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.TaxHubTransactionExportFilterScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.i3;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxHubTransactionExportFilterScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TaxHubTransactionExportFilterScreen taxHubTransactionExportFilterScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxHubTransactionExportFilterScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((IconDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        IconDelegate.Model model = (IconDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        Object obj3 = model.i;
        com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.a aVar2 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.a) jVarE3;
        if (obj3 instanceof i3) {
            aVar2.H2(aVar2.f74381r, new av8.o(obj3, 27));
        } else {
            aVar2.getClass();
        }
        return Unit.f186387a;
    }
}
