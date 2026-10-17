package jx2;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cards_core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final CompositeClause a(dj0.d originalPrice, dj0.d finalPrice, dj0.d points) {
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        Intrinsics.checkNotNullParameter(points, "points");
        MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
        o9 o9Var = o9.NON_SENSITIVE;
        MoneyClause moneyClause = new MoneyClause(finalPrice, defaults, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), o9Var);
        dj0.d dVar = dj0.d.e;
        if (!finalPrice.f(dVar)) {
            moneyClause = null;
        }
        TextClause textClause = new TextClause(" + ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (!finalPrice.f(dVar)) {
            textClause = null;
        }
        Clause[] elements = {moneyClause, textClause, a13.a.a(points, Integer.valueOf(R$attr.uikit_colorForeground)), new TextLocalisedClause(R$string.card_catalogue_pricing_separator, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new MoneyClause(originalPrice, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), o9Var)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14);
    }
}
