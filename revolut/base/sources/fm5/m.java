package fm5;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.strategies.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        RowDelegate.Model model;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = R$drawable.uikit_icn_24_coins;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        RowDelegate.Model model2 = new RowDelegate.Model("CRYPTO_SPARE_CHANGE_STRATEGY_ID", new RowDelegate.Model.MainImage.Image40(companion.i(i, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), new TextLocalisedClause(R$string.crypto_strategies_spare_change_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.crypto_strategies_spare_change_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        RowDelegate.Model model3 = new RowDelegate.Model("CRYPTO_RECURRING_BUY_STRATEGY_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_calendar_recurring, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), new TextLocalisedClause(R$string.crypto_strategies_recurring_buy_title, null, null, 14), null, 0, new TextLocalisedClause(Intrinsics.f(domainState.f136024a, Boolean.TRUE) ? R$string.crypto_strategies_recurring_buy_subtitle_buy_variant : R$string.crypto_strategies_recurring_buy_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        RowDelegate.Model model4 = new RowDelegate.Model("CRYPTO_TPSL_STRATEGY_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_credit, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), new TextLocalisedClause(R$string.crypto_strategies_take_profit_stop_loss_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.crypto_strategies_take_profit_stop_loss_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
        if (Intrinsics.f(domainState.f136024a, Boolean.FALSE)) {
            RowDelegate.Model model5 = new RowDelegate.Model("CRYPTO_COLLECTIONS_STRATEGY_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_carousel, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), new TextLocalisedClause(R$string.crypto_strategies_collections_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.crypto_strategies_collections_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
            yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
            model = model5;
        } else {
            model = null;
        }
        qv0.i[] elements = {model2, model3, model4, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new e(kotlin.collections.d.L(elements));
    }
}
