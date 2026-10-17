package hn5;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.zj;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final FullScreenStateDelegate.Model a(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new FullScreenStateDelegate.Model("SEARCH_CLEAR_LIST_ITEM_ID", new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_no_results_title, null, null, 14), new TextLocalisedClause(R$string.wealth_details_customize_key_stats_search_placeholder_subtitle, u.c(query), null, 12), new ComplexImage.Regular(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_search, R$attr.uikit_colorForeground, R$attr.uikit_colorTransparent)), new l6(12, new TextLocalisedClause(R.string.common_action_clear, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1984);
    }
}
