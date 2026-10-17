package l2j;

import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import com.revolut.retail.feature.balance.picker.impl.new_picker.CurrencyChooserFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public final CurrencyChooserFlow a(CurrencyChooserFlowDestination.InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new CurrencyChooserFlow(inputData);
    }
}
