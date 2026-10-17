package nmb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.SavingsCurrencySelectionScreen;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        g gVar = (g) this.receiver;
        KProperty[] kPropertyArr = SavingsCurrencySelectionScreen.W;
        com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.a aVar = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.a) gVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.u;
        SavingsProductData savingsProductData = obj4 instanceof SavingsProductData ? (SavingsProductData) obj4 : null;
        if (savingsProductData != null) {
            aVar.H2(aVar.f83325w, new u(savingsProductData, 0));
        }
        return Unit.f186387a;
    }
}
