package fcg;

import aw0.o9;
import aw0.t0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.hotels.api.R$plurals;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.model.points.Points;
import com.revolut.feature_travel_hotels_models.property.PriceFee;
import ip0.ak0;
import ip0.yj0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsDelegate.Model a(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        return new CellDetailsDelegate.Model("AMENDMENT_COST_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.hotels_amendment_confirmation_section_payment_summary_amendment_cost, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(money, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    public static CellDetailsDelegate.Model b(dj0.d money, boolean z) {
        Intrinsics.checkNotNullParameter(money, "money");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_amendment_confirmation_section_refund_breakdown_amendment_refund, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        if (!z) {
            resourceImage = null;
        }
        return new CellDetailsDelegate.Model("AMENDMENT_REFUND_ITEM_ID", new t0(textLocalisedClause, resourceImage, 0, z, 20), new MoneyClause(money, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    public static TextDelegate.Model c(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        return new TextDelegate.Model("EXTRA_PERSON_FEES_ITEM_ID", new TextLocalisedClause(R$string.hotels_price_breakdown_extra_person_fee_included_in_price_title, u.c(new MoneyClause(money, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), false, new ak0(yj0.START, null, 2), null, null, 0, 0, 0, 0, 2036);
    }

    public static CellDetailsDelegate.Model d(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        return new CellDetailsDelegate.Model("NEW_PRICE_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.hotels_amendment_confirmation_section_payment_summary_new_price, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(money, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    public static CellDetailsDelegate.Model e(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        return new CellDetailsDelegate.Model("OLD_PRICE_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.hotels_price_breakdown_old_price, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(money, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    public static CellDetailsDelegate.Model f(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        return new CellDetailsDelegate.Model("PAY_AT_PROPERTY_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.hotels_price_breakdown_pay_at_property, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(money, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    public static TextDelegate.Model g(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        return new TextDelegate.Model("PAY_AT_PROPERTY_CONVERSION_DISCLAIMER_ITEM_ID", new TextLocalisedClause(R$string.hotels_price_breakdown_currency_conversion_disclaimer, u.c(new MoneyClause(money, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12), false, new ak0(yj0.START, null, 2), null, null, 0, 0, 0, 0, 2036);
    }

    public static CellDetailsDelegate.Model h(dj0.d money, boolean z) {
        Intrinsics.checkNotNullParameter(money, "money");
        int i = R$string.hotels_price_breakdown_pay_now;
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
        if (!z) {
            custom = null;
        }
        return new CellDetailsDelegate.Model("PAY_NOW_ITEM_ID", new t0((Clause) new TextLocalisedClause(i, null, custom, 10), (Image) null, 0, false, 30), new MoneyClause(money, new MoneyClause.Format.Defaults(null, null, false, false, 15), z ? new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254) : null, o9.NON_SENSITIVE), null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    public static CellDetailsDelegate.Model i(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        return new CellDetailsDelegate.Model("POINTS_DISCOUNT_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.hotels_price_breakdown_points_discount, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(money, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    public static CellDetailsDelegate.Model j(RevPoints pointsReward) {
        Intrinsics.checkNotNullParameter(pointsReward, "pointsReward");
        return new CellDetailsDelegate.Model("REV_POINTS_REWARD_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.hotels_price_breakdown_points_title, null, null, 14), (Image) null, 0, false, 30), nub.a.l(pointsReward, o9.NON_SENSITIVE, nub.d.f219277a, null, BitmapDescriptorFactory.HUE_RED, 58), null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    public static List k(Points points, dj0.d payNowMoney, cgi.e ratesType) {
        RevPoints revPointsA;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        List listK;
        Intrinsics.checkNotNullParameter(payNowMoney, "payNowMoney");
        Intrinsics.checkNotNullParameter(ratesType, "ratesType");
        if (points == null || (revPointsA = points.f93669b) == null) {
            RevPoints.INSTANCE.getClass();
            revPointsA = RevPoints.Companion.a(0L);
        }
        boolean zK = payNowMoney.k();
        CdnImage cdnImage = null;
        if (ratesType == cgi.e.PAY_LATER) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.hotels_price_breakdown_points_pay_later_subtitle, null, null, 14);
        } else if (revPointsA.e()) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.hotels_price_breakdown_points_pay_now_points_reward_subtitle, null, null, 14);
        } else {
            if (!revPointsA.f83960a.k() || !zK) {
                textLocalisedClause = null;
                return (textLocalisedClause != null || (listK = v.k(new CellDetailsDelegate.Model("POINTS_YOU_EARN_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.hotels_price_breakdown_points_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (Image) null, 0, false, 30), nub.a.l(revPointsA, o9.NON_SENSITIVE, nub.d.f219277a, Integer.valueOf(R$attr.uikit_colorForeground), BitmapDescriptorFactory.HUE_RED, 50), null, null, null, null, null, 0, null, false, false, null, null, null, null, 0, R$attr.uikit_dp12, 0, 0, 58720248), new TextDelegate.Model("POINTS_YOU_EARN_MESSAGE_ITEM_ID", textLocalisedClause, false, new ak0(yj0.START, cdnImage, 2), null, null, R$attr.uikit_dp0, 0, 0, 0, 1908))) == null) ? f0.f322471a : listK;
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.hotels_price_breakdown_points_pay_now_no_reward_subtitle, null, null, 14);
        }
        textLocalisedClause = textLocalisedClause2;
        if (textLocalisedClause != null) {
        }
    }

    public static CellDetailsDelegate.Model l(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        return m(R$string.hotels_price_breakdown_pay_at_property, money, "PAY_AT_PROPERTY_ITEM_ID");
    }

    public static CellDetailsDelegate.Model m(int i, dj0.d dVar, String str) {
        return new CellDetailsDelegate.Model(str, new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), o9.NON_SENSITIVE), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static CellDetailsDelegate.Model n(PriceFee priceFee) {
        int i;
        String str;
        Intrinsics.checkNotNullParameter(priceFee, "priceFee");
        ufi.b bVar = priceFee.f98063a;
        int[] iArr = c.f133743a;
        switch (iArr[bVar.ordinal()]) {
            case 1:
                i = R$string.hotels_price_breakdown_taxes_and_fees;
                break;
            case 2:
                i = R$string.hotels_price_breakdown_mandatory_tax;
                break;
            case 3:
                i = R$string.hotels_price_breakdown_extra_person_fees;
                break;
            case 4:
                i = R$string.hotels_price_breakdown_property_fee;
                break;
            case 5:
                i = R$string.hotels_price_breakdown_partner_service_fee;
                break;
            case 6:
                i = R$string.hotels_price_breakdown_damage_deposit;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (iArr[bVar.ordinal()]) {
            case 1:
                str = "TAXES_AND_FEES_PAY_AT_PROPERTY_ITEM_ID";
                break;
            case 2:
                str = "MANDATORY_TAX_ITEM_ID";
                break;
            case 3:
                str = "EXTRA_PERSON_FEES_ITEM_ID";
                break;
            case 4:
                str = "PROPERTY_FEE_ITEM_ID";
                break;
            case 5:
                str = "TRAVELLER_SERVICE_FEE_ITEM_ID";
                break;
            case 6:
                str = "REFUNDABLE_DAMAGE_DEPOSIT_ITEM_ID";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        boolean z = bVar == ufi.b.TRAVELLER_SERVICE_FEE || bVar == ufi.b.REFUNDABLE_DAMAGE_DEPOSIT;
        return new CellDetailsDelegate.Model(str, new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new MoneyClause(priceFee.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), o9.NON_SENSITIVE), null, z ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, z, 0, null, priceFee, null, null, 0, null, false, null, 0, 0, 0, 0, 1048008);
    }

    public static CellDetailsDelegate.Model o(int i, dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        return new CellDetailsDelegate.Model("ROOMS_NIGHTS_ITEM_ID", new TextLocalisedQuantityClause(R$plurals.hotels_common_nights_count, Integer.valueOf(i), u.c(Integer.valueOf(i)), (Style) null, 24), new MoneyClause(money, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static CellDetailsDelegate.Model p(dj0.d money, fgi.a aVar) {
        Intrinsics.checkNotNullParameter(money, "money");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_price_breakdown_taxes_and_fees, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        if (aVar == null) {
            resourceImage = null;
        }
        return new CellDetailsDelegate.Model("TAXES_AND_FEES_ITEM_ID", new t0(textLocalisedClause, resourceImage, 0, aVar != null, 20), new MoneyClause(money, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), null, aVar, null, null, 0, null, false, false, null, null, 32696);
    }
}
