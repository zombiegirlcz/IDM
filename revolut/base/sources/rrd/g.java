package rrd;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.spending_analytics.api.R$string;
import ip0.ak0;
import ip0.yj0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static koi.j a(i disclaimer) {
        int i;
        String str;
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        int i2 = j.f256816a[disclaimer.ordinal()];
        if (i2 == 1) {
            i = R$string.analytics_total_wealth_custom_assets_disclaimer_total_assets_include_values_you;
        } else if (i2 == 2) {
            i = R$string.analytics_total_wealth_custom_assets_disclaimer_total_assets_include_values;
        } else if (i2 == 3) {
            i = R$string.analytics_total_wealth_custom_assets_disclaimer_please_note_we_wont_verify;
        } else if (i2 == 4) {
            i = R$string.analytics_total_wealth_custom_assets_disclaimer_values_not_verified;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.analytics_total_wealth_custom_assets_disclaimer_values_not_verified_property;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        int i3 = R$string.analytics_income_sorter_submit_common_disclaimer_learn_more;
        int i5 = h.f256815a[disclaimer.ordinal()];
        if (i5 == 1 || i5 == 2) {
            str = "revolut://app/faq?key=75e6e5ff-f5a1-497e-93a6-3dd21cb7c7f3";
        } else {
            if (i5 != 3 && i5 != 4 && i5 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str = "revolut://app/faq?key=question.how-smart-estimation-for-custom-assets-works";
        }
        List listK = v.k(textLocalisedClause, new TextLocalisedClause(i3, null, new Click(28, (Integer) null, (Object) str, "custom_assets_learn_more", false), 10));
        m70.a.t(t0.f186434a);
        TextDelegate.Model model = new TextDelegate.Model("custom_assets_disclaimer", new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, new ak0(yj0.CENTER_HORIZONTAL, null, 2), null, null, 0, 0, 0, 0, 2036);
        int i6 = R$attr.uikit_dp0;
        yp0.b.r(model, i6, i6, 0, 0, 12);
        return model;
    }

    public static koi.j b(vzi.d customAssetsState) {
        i iVar;
        Intrinsics.checkNotNullParameter(customAssetsState, "customAssetsState");
        int i = j.f256817b[customAssetsState.ordinal()];
        if (i == 1) {
            iVar = null;
        } else if (i == 2) {
            iVar = i.TOTAL_ASSETS_AI;
        } else {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            iVar = i.TOTAL_ASSETS;
        }
        if (iVar != null) {
            return a(iVar);
        }
        return null;
    }
}
