package gac;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.revolutpay.management.impl.R$string;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ListSubheaderDelegate.Model a(boolean z) {
        return new ListSubheaderDelegate.Model("ID_SECTION_SHOPS", (Image) null, (Clause) new TextLocalisedClause(R$string.revolut_pay_management_home_promoted_merchants_title, null, null, 14), (ResourceImage) null, false, false, (Clause) (z ? new TextLocalisedClause(R$string.revolut_pay_management_home_promoted_merchants_see_all, null, null, 14) : null), z, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946);
    }
}
