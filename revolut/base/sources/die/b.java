package die;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.e4;
import mx0.d;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public b(wqi.a tabHeaderCommonActionsProvider) {
        Intrinsics.checkNotNullParameter(tabHeaderCommonActionsProvider, "tabHeaderCommonActionsProvider");
    }

    public static ActionsView.Item a(ProductAccountWidgetAction productAccountWidgetAction) {
        d dVar;
        String str = productAccountWidgetAction.f89538a;
        Clause clause = productAccountWidgetAction.f89539b;
        Image image = productAccountWidgetAction.e;
        int i = a.f115057a[productAccountWidgetAction.f89540c.ordinal()];
        if (i == 1) {
            dVar = d.CONTEXTUAL;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = d.NEGATIVE;
        }
        return new ActionsView.Item(str, dVar, false, productAccountWidgetAction.f89541g ? e4.EnabledClickable : e4.DisabledNonClickable, clause, clause, image, productAccountWidgetAction.f ? new NewBadgeContent.Dot(null, null, 3) : null, null, productAccountWidgetAction.f89542h, productAccountWidgetAction.i, 3716);
    }
}
