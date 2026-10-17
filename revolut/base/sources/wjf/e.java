package wjf;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.domain.models.transactions.CategoryColor;
import com.revolut.domain.models.transactions.CategoryImage;
import com.revolut.feature.transactions.impl.R$drawable;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jmrtd.lds.LDSFile;
import t70.g;
import tof.i3;
import tof.j3;
import tof.k3;
import tof.l2;
import tof.l3;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements thf.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f298086a;

    public e(g localization) {
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f298086a = localization;
    }

    public static ResourceImage b(e eVar, int i) {
        return new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, gz0.b.CenterInside, null, null, null, LDSFile.EF_SOD_TAG), (Clause) null, 182);
    }

    public static Integer d(l2 l2Var) {
        switch (d.f298085a[l2Var.ordinal()]) {
            case 1:
                return Integer.valueOf(R$drawable.icon_40_feed_services_deep_grey);
            case 2:
                return Integer.valueOf(R$drawable.icon_40_feed_entertainment_red);
            case 3:
                return Integer.valueOf(R$drawable.icon_40_feed_groceries_lime);
            case 4:
                return Integer.valueOf(R$drawable.icon_40_feed_health_teal);
            case 5:
                return Integer.valueOf(R$drawable.icon_40_feed_restaurants_light_green);
            case 6:
                return Integer.valueOf(R$drawable.icon_40_feed_shopping_pink);
            case 7:
                return Integer.valueOf(R$drawable.icon_40_feed_transport_indigo);
            case 8:
                return Integer.valueOf(R$drawable.icon_40_feed_travel_blue);
            case 9:
                return Integer.valueOf(R$drawable.icon_40_feed_utilities_brown);
            case 10:
                return Integer.valueOf(R$drawable.icon_40_feed_atm_deep_grey);
            case 11:
                return Integer.valueOf(R$drawable.icon_40_feed_transfer_deep_grey);
            case 12:
                return Integer.valueOf(R$drawable.icon_40_feed_wealth);
            case 13:
                return Integer.valueOf(R$drawable.icon_40_feed_insurance);
            case 14:
                return Integer.valueOf(R$drawable.icon_40_feed_general_grey);
            default:
                return null;
        }
    }

    public static int e(l2 l2Var) {
        switch (d.f298085a[l2Var.ordinal()]) {
            case 1:
                return R$attr.uikit_colorIndigo;
            case 2:
                return R$attr.uikit_colorRed;
            case 3:
                return R$attr.uikit_colorLightGreen;
            case 4:
                return R$attr.uikit_colorCyan;
            case 5:
                return R$attr.uikit_colorTerracotta;
            case 6:
                return R$attr.uikit_colorPink;
            case 7:
                return R$attr.uikit_colorDeepPurple;
            case 8:
                return R$attr.uikit_colorLightBlue;
            case 9:
                return R$attr.uikit_colorBrown;
            case 10:
                return R$attr.uikit_colorTeal;
            case 11:
                return R$attr.uikit_colorBlue;
            case 12:
                return R$attr.uikit_colorGreen;
            case 13:
                return R$attr.uikit_colorYellow;
            case 14:
                return R$attr.uikit_colorLightGreen;
            case 15:
                return R$attr.uikit_colorCyan;
            case 16:
                return R$attr.uikit_colorLime;
            case 17:
                return R$attr.uikit_colorDeepPink;
            case 18:
                return R$attr.uikit_colorDeepPurple;
            case 19:
                return R$attr.uikit_colorTeal;
            case 20:
                return R$attr.uikit_colorTeal;
            case 21:
                return R$attr.uikit_colorTerracotta;
            case 22:
                return R$attr.uikit_colorRed;
            case 23:
                return R$attr.uikit_colorDeepGrey;
            case 24:
                return R$attr.uikit_colorDeepPurple;
            case 25:
                return R$attr.uikit_colorLightBlue;
            case 26:
                return R$attr.uikit_colorTeal;
            case 27:
                return R$attr.uikit_colorLime;
            case 28:
                return R$attr.uikit_colorGreen;
            case 29:
                return R$attr.uikit_colorBlue;
            case 30:
                return R$attr.uikit_colorBrown;
            case 31:
                return R$attr.uikit_colorDeepPurple;
            case 32:
                return R$attr.uikit_colorTerracotta;
            case 33:
                return R$attr.uikit_colorBlue;
            case 34:
                return R$attr.uikit_colorLime;
            case 35:
                return R$attr.uikit_colorBlue;
            case 36:
                return R$attr.uikit_colorYellow;
            case 37:
                return R$attr.uikit_colorPink;
            case 38:
                return R$attr.uikit_colorDeepGrey;
            case 39:
                return R$attr.uikit_colorDeepPurple;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static int g(l2 l2Var) {
        switch (d.f298085a[l2Var.ordinal()]) {
            case 1:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_services;
            case 2:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_entertainment;
            case 3:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_groceries;
            case 4:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_spa;
            case 5:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_restaurants;
            case 6:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_shopping;
            case 7:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_transport;
            case 8:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_travel;
            case 9:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_utilities;
            case 10:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_cash;
            case 11:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_arrow_right_left;
            case 12:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_coins;
            case 13:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_insurance;
            case 14:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_coins;
            case 15:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_16_status_refund;
            case 16:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_cashback;
            case 17:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_children;
            case 18:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_wealth;
            case 19:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_credit;
            case 20:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_card;
            case 21:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_vault;
            case 22:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_heart;
            case 23:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_cash_income;
            case 24:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_gift;
            case 25:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_plus;
            case 26:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_cash_income;
            case 27:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_percent;
            case 28:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_coins;
            case 29:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_card;
            case 30:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_utilities;
            case 31:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_wealth;
            case 32:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_lounges;
            case 33:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_laptop;
            case 34:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_driving_licence;
            case 35:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_materials;
            case 36:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_megaphone;
            case 37:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_children;
            case 38:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_bank;
            case 39:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_globe;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static int l(l2 l2Var) {
        switch (d.f298085a[l2Var.ordinal()]) {
            case 1:
                return R.string.transaction_tag_name_services;
            case 2:
                return R.string.transaction_tag_name_entertainment;
            case 3:
                return R.string.transaction_tag_name_groceries;
            case 4:
                return R.string.transaction_tag_name_health;
            case 5:
                return R.string.transaction_tag_name_restaurants;
            case 6:
                return R.string.transaction_tag_name_shopping;
            case 7:
                return R.string.transaction_tag_name_transport;
            case 8:
                return R.string.transaction_tag_name_travel;
            case 9:
                return R.string.transaction_tag_name_utilities;
            case 10:
                return R.string.transaction_tag_name_cash;
            case 11:
                return R.string.transaction_tag_name_transfers;
            case 12:
                return R.string.transaction_tag_name_wealth;
            case 13:
                return R.string.transaction_tag_name_insurance;
            case 14:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                return R.string.transaction_tag_name_general;
            case 15:
                return R.string.transaction_tag_name_refund;
            case 16:
                return R.string.transaction_tag_name_cashback;
            case 17:
                return R.string.transaction_tag_name_child_allowance;
            case 18:
                return R.string.transaction_tag_name_investment;
            case 19:
                return R.string.transaction_tag_name_loan;
            case 20:
                return R.string.transaction_tag_name_credit;
            case 21:
                return R.string.transaction_tag_name_savings;
            case 22:
                return R.string.transaction_tag_name_donation;
            case 23:
                return R.string.transaction_tag_name_salary;
            case 24:
                return R.string.transaction_tag_name_gift;
            case 25:
                return R.string.transaction_tag_name_topup;
            case 26:
                return R.string.transaction_tag_name_net_sales;
            case 27:
                return R.string.transaction_tag_name_interest;
            case 39:
                return R.string.transaction_tag_name_remittances;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int c(i3 category) {
        a aVarO;
        Intrinsics.checkNotNullParameter(category, "category");
        if (category instanceof k3) {
            return e(((k3) category).f272879a);
        }
        if (!(category instanceof j3)) {
            throw new NoWhenBranchMatchedException();
        }
        CategoryColor categoryColor = ((j3) category).e;
        return (categoryColor == null || (aVarO = s.o(categoryColor)) == null) ? e(l2.GENERAL) : aVarO.a();
    }

    public final ResourceImage f(String str) {
        ResourceImage resourceImageB;
        l2 l2VarC;
        if (str == null || (l2VarC = l3.c(str)) == null) {
            resourceImageB = null;
        } else {
            Integer numD = d(l2VarC);
            resourceImageB = b(this, numD != null ? numD.intValue() : R$drawable.icon_40_feed_general_grey);
        }
        if (resourceImageB != null) {
            return resourceImageB;
        }
        Integer numD2 = d(l2.GENERAL);
        if (numD2 != null) {
            return b(this, numD2.intValue());
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final LayeredImage h(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        l2 l2VarC = l3.c(categoryId);
        if (l2VarC == null) {
            l2VarC = l2.GENERAL;
        }
        return LayeredImage.INSTANCE.i(g(l2VarC), R$attr.uikit_colorWhite, e(l2VarC));
    }

    public final LayeredImage i(i3 category, Integer num, Integer num2) {
        int iG;
        b bVarP;
        Intrinsics.checkNotNullParameter(category, "category");
        if (category instanceof k3) {
            iG = g(((k3) category).f272879a);
        } else {
            if (!(category instanceof j3)) {
                throw new NoWhenBranchMatchedException();
            }
            CategoryImage categoryImage = ((j3) category).d;
            iG = (categoryImage == null || (bVarP = s.p(categoryImage)) == null) ? g(l2.GENERAL) : bVarP.a();
        }
        return LayeredImage.Companion.c(LayeredImage.INSTANCE, iG, Integer.valueOf(num2 != null ? num2.intValue() : R$attr.uikit_colorWhite), new Color.Solid(num != null ? num.intValue() : c(category)), 8.0f, Float.valueOf(24.0f), 32);
    }

    public final int j(i3 category) {
        b bVarP;
        Intrinsics.checkNotNullParameter(category, "category");
        if (!(category instanceof k3)) {
            if (!(category instanceof j3)) {
                throw new NoWhenBranchMatchedException();
            }
            CategoryImage categoryImage = ((j3) category).d;
            return (categoryImage == null || (bVarP = s.p(categoryImage)) == null) ? R$drawable.icon_16_general_grey : bVarP.b();
        }
        switch (d.f298085a[((k3) category).f272879a.ordinal()]) {
            case 1:
                return R$drawable.icon_16_services_deep_grey;
            case 2:
                return R$drawable.icon_16_entertainment_red;
            case 3:
                return R$drawable.icon_16_groceries_lime;
            case 4:
                return R$drawable.icon_16_health_teal;
            case 5:
                return R$drawable.icon_16_restaurants_light_green;
            case 6:
                return R$drawable.icon_16_shopping_pink;
            case 7:
                return R$drawable.icon_16_transport_indigo;
            case 8:
                return R$drawable.icon_24_travel_blue;
            case 9:
                return R$drawable.icon_16_utilities_brown;
            case 10:
                return R$drawable.icon_24_cash_deep_grey;
            case 11:
                return R$drawable.icon_16_transfer_deep_grey;
            case 12:
                return R$drawable.icon_16_wealth_purple;
            case 13:
                return R$drawable.icon_16_insurance_cyan;
            case 14:
                return R$drawable.icon_16_general_grey;
            case 15:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_16_status_refund;
            case 16:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_cashback;
            case 17:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_backpack;
            case 18:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_16_chart_bar_with_arrow;
            case 19:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_credit;
            case 20:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_20_credit_card;
            case 21:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_percent;
            case 22:
                return R$drawable.icon_16_health_teal;
            case 23:
                return R$drawable.icon_24_cash_deep_grey;
            case 24:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_present;
            case 25:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_credit;
            case 26:
                return R$drawable.icon_24_cash_deep_grey;
            case 27:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_percent;
            case 28:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_fees;
            case 29:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_card;
            case 30:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_utilities;
            case 31:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_invest;
            case 32:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_vault;
            case 33:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_laptop;
            case 34:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_flag;
            case 35:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_rocket;
            case 36:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_lightbulb;
            case 37:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_children;
            case 38:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_medkit;
            case 39:
                return com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_globe;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String k(i3 category) {
        Intrinsics.checkNotNullParameter(category, "category");
        if (category instanceof k3) {
            return this.f298086a.getString(l(((k3) category).f272879a));
        }
        if (category instanceof j3) {
            return ((j3) category).f272845c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
