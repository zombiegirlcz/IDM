package e0e;

import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelectorBottomSheetProvider$InputData;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import com.revolut.feature.statements.impl.ui.documents_hub.period.bottom_sheet.StatementPeriodSelectorBottomSheet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {
    public static StatementPeriodSelectorBottomSheet a(StatementPeriodSelectorBottomSheetProvider$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (inputData.f88221c.contains(StatementPeriodType.TAX_YEAR) && inputData.d == null) {
            throw new IllegalArgumentException("Tax period is required when Tax Year selection is supported");
        }
        return new StatementPeriodSelectorBottomSheet(inputData);
    }
}
