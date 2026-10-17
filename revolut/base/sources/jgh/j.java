package jgh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.private_equity.impl.R$string;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.FundDetailsScreenContract$Action;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.FundDetailsScreenContract$ExpandableAllocationItemIdentifier;
import d9.e1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jel.u0;
import jel.v0;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static final RowDelegate.Model a(j jVar, String str, TextLocalisedClause textLocalisedClause, BigDecimal bigDecimal) {
        return new RowDelegate.Model(j6.a.q("FUND_DETAILS_ALLOCATION_SECTOR_ROW_SUB_ITEM", str), null, textLocalisedClause, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new PercentageClause(e1.Z(bigDecimal), (PercentageClause.Format) null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 2), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867834);
    }

    public static int b(int i) {
        List listK = v.k(Integer.valueOf(R$attr.uikit_colorTeal_80), Integer.valueOf(R$attr.uikit_colorLightBlue_80), Integer.valueOf(R$attr.uikit_colorIndigo_80), Integer.valueOf(R$attr.uikit_colorTerracotta_80), Integer.valueOf(R$attr.uikit_colorYellow_80));
        return ((Number) listK.get(i % listK.size())).intValue();
    }

    public static k c(List list) {
        if (list == null) {
            list = f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            v0 v0Var = (v0) obj2;
            if (v0Var.f173574a != null && v0Var.f173576c != null) {
                arrayList.add(obj2);
            }
        }
        List listP0 = d0.P0(arrayList, new m());
        List listV0 = d0.V0(listP0, 4);
        List listV = d0.V(listP0, 4);
        List list2 = listV0;
        List list3 = listV.size() <= 1 ? listV : null;
        if (list3 == null) {
            list3 = f0.f322471a;
        }
        ArrayList arrayListE0 = d0.E0(list3, list2);
        if (listV.size() <= 1) {
            listV = null;
        }
        if (listV == null) {
            listV = f0.f322471a;
        }
        return new k(arrayListE0, listV);
    }

    public static RowDelegate.Model d(u0 u0Var, BigDecimal bigDecimal, int i, boolean z, boolean z3) {
        int i2;
        FundDetailsScreenContract$ExpandableAllocationItemIdentifier.Sector sector = new FundDetailsScreenContract$ExpandableAllocationItemIdentifier.Sector(u0Var);
        String str = "FUND_DETAILS_ALLOCATION_SECTOR_ROW_ITEM" + u0Var;
        TextLocalisedClause textLocalisedClauseE = e(u0Var);
        PercentageClause percentageClause = new PercentageClause(e1.Z(bigDecimal), (PercentageClause.Format) null, (Style) null, 6);
        yy0.i iVar = yy0.l.Companion;
        ResourceImage resourceImageG = x5d.b.g(z);
        iVar.getClass();
        tf tfVar = z3 ? new tf(yy0.i.a(resourceImageG)) : null;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        switch (u0Var == null ? -1 : l.f174054b[u0Var.ordinal()]) {
            case -1:
                i2 = R$drawable.uikit_icn_24_more_ios;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                i2 = R$drawable.uikit_icn_24_merchant;
                break;
            case 2:
                i2 = R$drawable.uikit_icn_24_cart;
                break;
            case 3:
                i2 = R$drawable.uikit_icn_24_lightning;
                break;
            case 4:
                i2 = R$drawable.uikit_icn_24_cash;
                break;
            case 5:
                i2 = R$drawable.uikit_icn_24_heart;
                break;
            case 6:
                i2 = R$drawable.uikit_icn_24_industrial_gear;
                break;
            case 7:
                i2 = R$drawable.uikit_icn_24_tech;
                break;
            case 8:
                i2 = R$drawable.uikit_icn_24_materials;
                break;
            case 9:
                i2 = R$drawable.uikit_icn_24_communication;
                break;
            case 10:
                i2 = R$drawable.uikit_icn_24_mortgage;
                break;
            case 11:
                i2 = R$drawable.uikit_icn_24_plug;
                break;
            case 12:
                i2 = R$drawable.uikit_icn_24_company_filled;
                break;
        }
        return new RowDelegate.Model(str, companion.i(i2, R$attr.uikit_colorWhite, i), null, null, textLocalisedClauseE, percentageClause, null, null, 0, tfVar, z3, false, null, null, null, null, null, z3 ? z ? new FundDetailsScreenContract$Action.CollapseAllocation(sector) : new FundDetailsScreenContract$Action.ExpandAllocation(sector) : null, null, 0, 0, 0, 0, 1056941932);
    }

    public static TextLocalisedClause e(u0 u0Var) {
        switch (u0Var == null ? -1 : l.f174054b[u0Var.ordinal()]) {
            case -1:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_details_exposure_sector_other, null, null, 14);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_sector_consumer_discretionary, null, null, 14);
            case 2:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_sector_consumer_staples, null, null, 14);
            case 3:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_sector_energy, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_sector_financials, null, null, 14);
            case 5:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_sector_health_care, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_sector_industrials, null, null, 14);
            case 7:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_sector_technology, null, null, 14);
            case 8:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_sector_materials, null, null, 14);
            case 9:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_sector_communication_services, null, null, 14);
            case 10:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_sector_real_estate, null, null, 14);
            case 11:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_sector_utilities, null, null, 14);
            case 12:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_sector_infrastructure, null, null, 14);
        }
    }
}
