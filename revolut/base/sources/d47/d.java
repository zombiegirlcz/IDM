package d47;

import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.category_picker.TaxHubTransactionExportCategoryPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.i3;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxHubTransactionExportCategoryPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TaxHubTransactionExportCategoryPickerScreen taxHubTransactionExportCategoryPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxHubTransactionExportCategoryPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((IconDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        IconDelegate.Model model = (IconDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVarE3 = this.v.d();
        Object obj3 = model.i;
        if (obj3 instanceof i3) {
            lVarE3.H2(lVarE3.o, new av8.o(obj3, 5));
        } else {
            lVarE3.getClass();
        }
        return Unit.f186387a;
    }
}
