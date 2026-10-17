package h9g;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.core.api.R$string;
import com.revolut.feature.travel.hotels.api.R$plurals;
import com.revolut.feature_travel_hotels_models.property.HotelsInventoryProviderLogos;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyAttributes;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyGuestReviewScore;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyGuestsReviews;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyRatings;
import com.revolut.feature_travel_hotels_models.property.PointsRewardRate;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.jmrtd.lds.LDSFile;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public abstract class e {
    public static final HotelsPropertyGuestReviewScore a(List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((HotelsPropertyGuestReviewScore) next).e == ufi.c.OVERALL) {
                break;
            }
        }
        return (HotelsPropertyGuestReviewScore) next;
    }

    public static final String b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iT = d0.T(str, "::", 0, false, 6);
        if (iT == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iT);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final ResourceImage c(HotelsProperty hotelsProperty, Set set) {
        Intrinsics.checkNotNullParameter(hotelsProperty, "<this>");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_tab_favourites_title, null, null, 14);
        if (set != null) {
            return new ResourceImage(set.contains(b(hotelsProperty.f97981a)) ? R$drawable.uikit_icn_24_heart : R$drawable.uikit_icn_24_heart_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, textLocalisedClause, LDSFile.EF_DG4_TAG);
        }
        HotelsPropertyAttributes hotelsPropertyAttributes = hotelsProperty.f97992r;
        if (hotelsPropertyAttributes != null) {
            return new ResourceImage(hotelsPropertyAttributes.f97999a ? R$drawable.uikit_icn_24_heart : R$drawable.uikit_icn_24_heart_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, textLocalisedClause, LDSFile.EF_DG4_TAG);
        }
        return new ResourceImage(R$drawable.uikit_icn_24_heart_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, textLocalisedClause, LDSFile.EF_DG4_TAG);
    }

    public static final UrlImage d(HotelsInventoryProviderLogos hotelsInventoryProviderLogos, boolean z) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(hotelsInventoryProviderLogos, "<this>");
        if (z && (str2 = hotelsInventoryProviderLogos.f97974b) != null) {
            return new UrlImage(str2, null, null, null, 0L, null, null, null, ez0.h.FitCenter, null, false, null, null, null, false, false, 523774);
        }
        if (z || (str = hotelsInventoryProviderLogos.f97973a) == null) {
            return null;
        }
        return new UrlImage(str, null, null, null, 0L, null, null, null, ez0.h.FitCenter, null, false, null, null, null, false, false, 523774);
    }

    public static final TextClause e(HotelsProperty hotelsProperty) {
        HotelsPropertyGuestsReviews hotelsPropertyGuestsReviews;
        List list;
        HotelsPropertyGuestReviewScore hotelsPropertyGuestReviewScoreA;
        Intrinsics.checkNotNullParameter(hotelsProperty, "<this>");
        HotelsPropertyRatings hotelsPropertyRatings = hotelsProperty.f97984g;
        if (hotelsPropertyRatings == null || (hotelsPropertyGuestsReviews = hotelsPropertyRatings.f98045b) == null || (list = hotelsPropertyGuestsReviews.f98034b) == null || (hotelsPropertyGuestReviewScoreA = a(list)) == null) {
            m70.a.c(t0.f186434a);
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        double d = hotelsPropertyGuestReviewScoreA.f98026b;
        return new TextClause(String.valueOf(d), (Style) new Custom(Integer.valueOf(f(d)), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
    }

    public static final int f(double d) {
        boolean z = false;
        if (d >= 0.0d && d < 4.0d) {
            return R$attr.uikit_colorRed;
        }
        if (d >= 4.0d && d < 8.0d) {
            z = true;
        }
        return z ? R$attr.uikit_colorOrange : (8.0d > d || d > 10.0d) ? R$attr.uikit_colorGreyTone50 : R$attr.uikit_colorTeal;
    }

    public static final Clause g(HotelsProperty hotelsProperty, int i) {
        HotelsPropertyGuestsReviews hotelsPropertyGuestsReviews;
        Intrinsics.checkNotNullParameter(hotelsProperty, "<this>");
        HotelsPropertyRatings hotelsPropertyRatings = hotelsProperty.f97984g;
        if (hotelsPropertyRatings == null || (hotelsPropertyGuestsReviews = hotelsPropertyRatings.f98045b) == null) {
            return null;
        }
        int i2 = hotelsPropertyGuestsReviews.f98033a;
        return i2 == 0 ? new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_stays_search_guest_reviews_no_reviews, null, new Custom(Integer.valueOf(i), false, null, false, null, 254), 10) : new CompositeClause(v.k(new TextClause("(", (Style) null, Integer.valueOf(i), false, (o9) null, (List) null, 122), new TextLocalisedQuantityClause(R$plurals.hotels_common_reviews_count, Integer.valueOf(i2), u.c(new NumberClause(i2, (NumberClause.Format) new NumberClause.Format.Compact(true), (Style) new Custom(Integer.valueOf(i), false, null, false, null, 254))), new Custom(Integer.valueOf(i), false, null, false, null, 254), 8), new TextClause(")", (Style) null, Integer.valueOf(i), false, (o9) null, (List) null, 122)), null, null, null, 14);
    }

    public static CompositeClause h(PointsRewardRate pointsRewardRate) {
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorWhite), false, null, false, null, 254);
        Intrinsics.checkNotNullParameter(pointsRewardRate, "<this>");
        RevPoints revPoints = pointsRewardRate.f98060a;
        o9 o9Var = o9.NON_SENSITIVE;
        return new CompositeClause(v.k(nub.a.i(revPoints, null, nub.d.f219277a, o9Var, 1), new MoneyClause(pointsRewardRate.f98061b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4)), new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), custom, null, 8);
    }
}
