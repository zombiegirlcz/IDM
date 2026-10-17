package uj9;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_later.api.R$plurals;
import com.revolut.feature.pay_later.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import dj0.d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.i;
import rp0.l;
import rp0.t;
import rp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static LargeActionButtonDelegate.Model a() {
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_GOT_IT_BUTTON", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, 0, R$attr.uikit_dp8, 0, 0, 7152);
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        yp0.b.r(model, 0, i, i2, i2, 1);
        return model;
    }

    public static final MoneyClause c(long j2, xi0.b bVar) {
        return new MoneyClause(new d(j2, bVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
    }

    public final y b(xi0.b currency, BannerDelegate.Model model, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        long j2 = 9000 / ((long) 3);
        t tVar = new t(new TextLocalisedClause(R$string.pay_later_max_purchase_amount_title, null, null, 14), new TextLocalisedClause(R$string.pay_later_max_purchase_amount_description, null, null, 14), null, 28);
        ListCellDelegate.Model model2 = new ListCellDelegate.Model("id_max_purchase_amount_description", new j8(new ResourceImage(R$drawable.uikit_icn_24_lightbulb, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), null, new TextLocalisedClause(R$string.pay_later_max_purchase_amount_example, v.k(c(9000L, currency), new TextLocalisedQuantityClause(R$plurals.pay_later_account_details_n_instalments, (Number) 3, (List) null, (Style) null, 28), c(j2, currency), new CurrencyClause(currency, CurrencyClause.Format.Ticker.f57756a, null, 4), c(9000 - j2, currency)), null, 12), false, null, null, 0, 0, 0, 0, 4068);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        i[] elements = {model2, model, a()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new y(kotlin.collections.d.L(elements), tVar, l.WINDOW, null, null, null, null, null, analyticsContext, null, 2808);
    }
}
