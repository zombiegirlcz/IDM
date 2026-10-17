package wlh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.ui.impl.R$string;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(Object obj2, boolean z) {
        return new RowDelegate.Model("GIA_MARGIN_PRODUCT_LIST_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_coins_earning, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, false, null, false, 62), new TextLocalisedClause(R$string.trading_settings_margin_trading_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.trading_settings_margin_trading_subtitle, null, null, 14), null, null, 0, new vf(z, true), false, null, false, null, null, null, null, null, null, obj2, null, 0, 0, 0, 0, 532673496);
    }
}
