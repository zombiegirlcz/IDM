package m35;

import com.revolut.feature.credit.core.ui.bottom_sheet.list.CreditBottomSheetListItemsController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditBottomSheetListItemsController f202289a;

    public m(CreditBottomSheetListItemsController dialogController) {
        Intrinsics.checkNotNullParameter(dialogController, "dialogController");
        this.f202289a = dialogController;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f202289a.equals(((m) obj2).f202289a);
    }

    public final int hashCode() {
        return this.f202289a.hashCode();
    }
}
