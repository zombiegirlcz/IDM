package unb;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nz8.d;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static ProductAccountWidgetAction a(Object obj2, boolean z) {
        AnalyticsContext analyticsContext = null;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        return new ProductAccountWidgetAction(300, analyticsContext, new TextLocalisedClause(R$string.savings_home_header_actions_add_money, null, null, 14), resourceImage, obj2, "ADD_MONEY_ACTION_ID", null, null, false, z);
    }

    public static ProductAccountWidgetAction b(Object obj2, boolean z) {
        AnalyticsContext analyticsContext = null;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_arrow_shuffle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        return new ProductAccountWidgetAction(300, analyticsContext, new TextLocalisedClause(com.revolut.feature.tab.accounts.api.R$string.revolut_accounts_action_move_money, null, null, 14), resourceImage, obj2, "ACTION_MOVE_ID", null, null, false, z);
    }

    public static ProductAccountWidgetAction c(a aVar, Object obj2) {
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        return new ProductAccountWidgetAction(300, null, new TextLocalisedClause(R$string.savings_home_header_actions_rename, null, null, 14), resourceImage, obj2, "ACTION_RENAME_ID", null, null, false, true);
    }

    public static ProductAccountWidgetAction d(a aVar, Object obj2, uib.a config, int i) {
        Object obj3 = (i & 2) != 0 ? null : obj2;
        Intrinsics.checkNotNullParameter(config, "config");
        return new ProductAccountWidgetAction(300, null, d.s(config.f280367b), new ResourceImage(R$drawable.uikit_icn_24_statement, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), obj3, "ACTION_STATEMENT_ID", null, null, false, true);
    }

    public static ProductAccountWidgetAction e() {
        AnalyticsContext analyticsContext = null;
        Object obj2 = null;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_face_id, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        return new ProductAccountWidgetAction(492, analyticsContext, new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_title, null, null, 14), resourceImage, obj2, "ACTION_WEALTH_PROTECTION_ID", null, null, false, false);
    }
}
