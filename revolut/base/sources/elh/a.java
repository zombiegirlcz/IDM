package elh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.ui.impl.R$string;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import o97.d0;
import o97.e0;
import o97.f0;
import o97.r;
import o97.y;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static List a(boolean z) {
        List listC = u.c(new RowDelegate.Model("ADVANCED_SEARCH_ITEM_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_controls, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, false, null, false, 62), new TextLocalisedClause(R$string.wealth_invest_trade_advanced_search_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.search_block_screener_cell_subtitle_placeholder, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, new y(r.WEALTH_STOCKS_SCREENER, null, null, 60), null, 0, 0, 0, 0, 532676568));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        f0 f0Var = new f0(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.search_block_screener_name, null, null, 14), "SCREENER_HEADER_LIST_ID");
        if (!z) {
            f0Var = null;
        }
        d0[] elements = {f0Var, new e0(listC)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d.L(elements);
    }
}
