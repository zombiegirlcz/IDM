package fm6;

import aw0.h;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.feature.external_accounts.impl.R$string;
import ez0.e;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static dii.a a(AnalyticsProduct analyticsProduct, String countryName, String countryCode) {
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        int i = R$string.external_institutions_cross_border_select_user_country_institution_prompt_title;
        String lowerCase = countryCode.toLowerCase(Locale.ROOT);
        return new dii.a(new lw0.a(new TextLocalisedClause(i, u.c(new TextLocalisedClause(t61.a.p(lowerCase, "toLowerCase(...)", "country_name_with_article.", lowerCase), (List) null, (Clause) new TextClause(countryName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 22)), null, 12), null, new lw0.b(new CountryImage(countryCode, (Integer) null, (e) null, 14), null), null, false, 26), new h(false, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_yes, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_no, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), analyticsProduct, null, null, 24);
    }
}
