package k0b;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.advanced_charts.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.trading_advanced_chart_add_title, null, null, 14), null, null, null, false, 30);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trading_advanced_chart_add_indicators, null, null, 14);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        List listK = v.k(new RowDelegate.Model("ADD_ITEM_CHARTS_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_16_timeline, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), new RowDelegate.Model("ADD_ITEM_COMPARATOR_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_duplicate, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), new TextLocalisedClause(R$string.trading_advanced_chart_add_compare_symbol, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        yp0.b.k(listK, 0, R$attr.uikit_dp24, 0, 0, 29);
        return new cii.b(null, listK, aVar);
    }
}
