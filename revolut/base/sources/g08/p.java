package g08;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.common.ui.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f139370a;

    public p(g incompleteProfileUIBuilder, c fullProfileUIBuilder) {
        Intrinsics.checkNotNullParameter(incompleteProfileUIBuilder, "incompleteProfileUIBuilder");
        Intrinsics.checkNotNullParameter(fullProfileUIBuilder, "fullProfileUIBuilder");
        this.f139370a = incompleteProfileUIBuilder;
    }

    public final List a() {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_action_got_it, null, null, 14);
        int i = R$attr.uikit_dp16;
        return u.c(new LargeActionButtonDelegate.Model("INFO_DIALOG_LARGE_BUTTON_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i, i, i, i, 496));
    }
}
