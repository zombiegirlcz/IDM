package a1g;

import a1g.b;
import aw0.i9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.models.TravelExperienceRatings;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c {
    public static final TextLocalisedClause a(int i) {
        return new TextLocalisedClause(R$string.experiences_details_no_reviews, null, new Custom(Integer.valueOf(i), false, null, false, null, 254), 10);
    }

    public static final NumberClause b(double d, b style) {
        Custom custom;
        Intrinsics.checkNotNullParameter(style, "style");
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
        NumberClause.Format.FixedDigitsAfterDot fixedDigitsAfterDot = new NumberClause.Format.FixedDigitsAfterDot(2, 14, null, null, null);
        if (style instanceof b.a) {
            custom = new Custom(Integer.valueOf((0.0d > d || d > 1.99d) ? (2.0d > d || d > 3.99d) ? (4.0d > d || d > 5.0d) ? R$attr.uikit_colorGreyTone50 : R$attr.uikit_colorTeal : R$attr.uikit_colorOrange : R$attr.uikit_colorRed), false, null, false, null, 254);
        } else {
            if (!(style instanceof b.C0001b)) {
                throw new NoWhenBranchMatchedException();
            }
            custom = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
        }
        return new NumberClause(bigDecimal, fixedDigitsAfterDot, custom, null, 8);
    }

    public static final i9 c(TravelExperienceRatings travelExperienceRatings, int i) {
        return travelExperienceRatings != null ? new i9(b(travelExperienceRatings.f93192b, b.a.f632a), d.a(travelExperienceRatings.f93191a, Integer.valueOf(i)), null) : new i9(a(i), null, null);
    }
}
