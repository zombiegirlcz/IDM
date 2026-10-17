package xcg;

import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.promotions.TravelHotelsPromotion;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m1c.u1;
import org.jetbrains.annotations.NotNull;
import rp0.s;
import rp0.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f304131a;

    public d(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f304131a = dateProvider;
    }

    public static y a(TravelHotelsPromotion travelHotelsPromotion, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, u1 u1Var) {
        RowDelegate.Model model;
        TravelHotelsPromotion travelHotelsPromotion2 = travelHotelsPromotion;
        RowDelegate.Model model2 = null;
        if (travelHotelsPromotion2.f97961b != tfi.a.PACKAGE_RATE || travelHotelsPromotion2.f == null) {
            travelHotelsPromotion2 = null;
        }
        if (travelHotelsPromotion2 == null) {
            return null;
        }
        s sVar = new s(new com.revolut.core.ui_kit.views.f(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D171", null, null, null, 30)), textLocalisedClause, null, 28);
        RowDelegate.Model model3 = new RowDelegate.Model("PACKAGE_RATES_DETAILS_BOOK_A_FLIGHT_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_check_success, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreen), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.hotels_package_rates_details_book_flight_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.hotels_package_rates_details_book_flight_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        TravelHotelsPromotion.Requirements requirements = travelHotelsPromotion2.f;
        if (requirements != null) {
            int i = R$string.hotels_package_rates_details_book_stay_description;
            long millis = requirements.f97964a.getMillis();
            ka kaVar = ka.SHORT;
            model = new RowDelegate.Model("PACKAGE_RATES_DETAILS_EARN_STAYS_DISCOUNT_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_resort, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), textLocalisedClause2, null, 0, new TextLocalisedClause(i, v.k(new TimeClause(millis, new TimeClause.Format.DayAndMonth(kaVar), null, null, 12), new TimeClause(requirements.f97965b.getMillis(), new TimeClause.Format.DayAndMonth(kaVar), null, null, 12)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        } else {
            model = null;
        }
        if (u1Var != null) {
            int i2 = R$string.hotels_package_rates_details_rev_points_title;
            String str = String.format("%.0f", Arrays.copyOf(new Object[]{Double.valueOf(u1Var.f201461b.f84037c)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            model2 = new RowDelegate.Model("PACKAGE_RATES_DETAILS_EARN_MORE_POINTS_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_rev_points_mono, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(i2, u.c(str), null, 12), null, 0, new TextLocalisedClause(R$string.hotels_package_rates_details_rev_points_description, u.c(new MoneyClause(u1Var.e, new MoneyClause.Format.Shorts(false, 63), null, o9.NON_SENSITIVE, 4)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        }
        RowDelegate.Model[] elements = {model3, model, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new y(listL, sVar, null, null, null, null, 1020);
    }

    public final TextLocalisedClause b(TravelHotelsPromotion travelHotelsPromotion, int i, long j2) {
        TextLocalisedQuantityClause textLocalisedQuantityClauseA = j9g.c.a(travelHotelsPromotion, ((l80.f) this.f304131a).g());
        if (textLocalisedQuantityClauseA != null) {
            return new TextLocalisedClause(i, v.k(textLocalisedQuantityClauseA, ch.qos.logback.core.util.a.p(j2, "%")), null, 12);
        }
        return null;
    }
}
