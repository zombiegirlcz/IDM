package d47;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.category_picker.TaxHubTransactionExportCategoryPickerScreen;
import ip0.qd0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxHubTransactionExportCategoryPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TaxHubTransactionExportCategoryPickerScreen taxHubTransactionExportCategoryPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxHubTransactionExportCategoryPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVarE3 = this.v.d();
        String listId = model.f53304a;
        Object obj3 = model.k;
        lVarE3.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if ((obj3 instanceof qd0) && Intrinsics.f(listId, "LIST_ID_CATEGORY_SECTION_HEADER")) {
            lVarE3.H2(lVarE3.o, new d3i.k(obj3, lVarE3, 5));
        }
        return Unit.f186387a;
    }
}
