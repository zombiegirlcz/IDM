package n47;

import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.TaxHubTransactionExportPeriodPickerScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.TaxHubTransactionExportPeriodPickerScreenContract$DomainState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TaxHubTransactionExportPeriodPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(TaxHubTransactionExportPeriodPickerScreen taxHubTransactionExportPeriodPickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = taxHubTransactionExportPeriodPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TaxHubTransactionExportPeriodPickerScreen taxHubTransactionExportPeriodPickerScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f) taxHubTransactionExportPeriodPickerScreen.e3()).B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f fVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f) taxHubTransactionExportPeriodPickerScreen.e3();
                i iVar = ((TaxHubTransactionExportPeriodPickerScreenContract$DomainState) ((j2) fVar.v.f22677a).getValue()).f74403b;
                if (!(iVar instanceof com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.e)) {
                    throw new IllegalArgumentException("If not Selected, the button which triggers this callback won't be enabled.");
                }
                com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.e eVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.e) iVar;
                fVar.C2(new k(eVar.a().f74404a, eVar.a().f74405b));
                return Unit.f186387a;
        }
    }
}
