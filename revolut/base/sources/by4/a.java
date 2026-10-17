package by4;

import aw0.n6;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes22.dex */
public final class a {
    public static n6 a(BottomSheet.ActionBlockItem actionBlockItem) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton;
        Clause clause = actionBlockItem.f69820a;
        BottomSheet.ActionStyle actionStyle = actionBlockItem.f69821b;
        if (actionStyle instanceof BottomSheet.ActionStyle.Accent) {
            defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        } else {
            if (!(actionStyle instanceof BottomSheet.ActionStyle.SemiAccent)) {
                throw new NoWhenBranchMatchedException();
            }
            defaultFilledButton = LargeActionButton.ButtonStyle.f58726b;
        }
        return new n6(clause, defaultFilledButton, null, null, false, null, null, 1020);
    }
}
