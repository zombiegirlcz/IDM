package lnd;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.spending_analytics.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.gu;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class x {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f197207a;

    public x(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f197207a = ((jte.d) featureToggleInteractor).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c);
    }

    public static TextLocalisedClause a(amd.i iVar) {
        int i;
        switch (v.f197206a[iVar.ordinal()]) {
            case 1:
                i = R$string.analytics_spendings_filter_categories;
                break;
            case 2:
                i = R$string.analytics_spendings_filter_merchants;
                break;
            case 3:
                i = R$string.analytics_spendings_filter_transactions;
                break;
            case 4:
                i = R$string.analytics_spendings_filter_countries;
                break;
            case 5:
                i = R$string.analytics_spendings_filter_currencies;
                break;
            case 6:
                i = R$string.analytics_spendings_filter_cardholders;
                break;
            case 7:
                i = R$string.analytics_spendings_filter_joint_spent;
                break;
            case 8:
                i = R$string.analytics_spendings_filter_accounts;
                break;
            case 9:
                i = R$string.analytics_spendings_filter_cards;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public final koi.j b(amd.i filter, boolean z, Set popMenuOptionSet, boolean z3, boolean z4) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(popMenuOptionSet, "popMenuOptionSet");
        if (z4 && this.f197207a) {
            List<amd.i> listP0 = zhm.d0.P0(popMenuOptionSet, new w());
            ArrayList arrayList = new ArrayList(zhm.w.t(listP0, 10));
            for (amd.i iVar : listP0) {
                arrayList.add(new com.revolut.core.ui_kit.views.q(iVar.name(), new com.revolut.core.ui_kit.views.t(a(iVar)), z, 18));
            }
            return new TabsDelegate.Model("FILTERS_CHIPS_ID", arrayList, filter.name(), null, null, null, R$attr.uikit_dp16, R$attr.uikit_dp0, null, 7800);
        }
        switch (v.f197206a[filter.ordinal()]) {
            case 1:
                i = R$string.analytics_spendings_group_by_category;
                break;
            case 2:
                i = R$string.analytics_spendings_group_by_merchant;
                break;
            case 3:
                i = com.revolut.feature.transactions.api.R$string.transaction_list_navbar_title_default;
                break;
            case 4:
                i = R$string.analytics_spendings_group_by_country;
                break;
            case 5:
                i = R$string.analytics_spendings_group_by_currency;
                break;
            case 6:
                i = R$string.analytics_spendings_group_by_cardholder;
                break;
            case 7:
                i = R$string.analytics_spendings_filter_joint_spent;
                break;
            case 8:
                i = R$string.analytics_spendings_group_by_account;
                break;
            case 9:
                i = R$string.analytics_spendings_group_by_card;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        ResourceImage resourceImage = z ? new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null;
        ListSubheaderDelegate.Model.a.b bVar = new ListSubheaderDelegate.Model.a.b(z, z, true);
        TextLocalisedClause textLocalisedClause2 = (filter == amd.i.CATEGORIES && z3) ? new TextLocalisedClause(R$string.analytics_spendings_manage_categories, null, new Click(30, (Integer) null, (Object) null, "MANAGE_CATEGORIES_ID", false), 10) : null;
        int i3 = R$attr.uikit_dp0;
        Set<amd.i> set = popMenuOptionSet;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(set, 10));
        for (amd.i iVar2 : set) {
            String strName = iVar2.name();
            TextLocalisedClause textLocalisedClauseA = a(iVar2);
            switch (v.f197206a[iVar2.ordinal()]) {
                case 1:
                    i2 = R$drawable.uikit_icn_24_view_list;
                    break;
                case 2:
                    i2 = R$drawable.uikit_icn_24_merchant;
                    break;
                case 3:
                    i2 = R$drawable.uikit_icn_24_view_list;
                    break;
                case 4:
                    i2 = R$drawable.uikit_icn_24_globe;
                    break;
                case 5:
                    i2 = R$drawable.uikit_icn_24_rates_converter;
                    break;
                case 6:
                    i2 = R$drawable.uikit_icn_24_people;
                    break;
                case 7:
                    i2 = R$drawable.uikit_icn_24_people;
                    break;
                case 8:
                    i2 = R$drawable.uikit_icn_24_coins;
                    break;
                case 9:
                    i2 = R$drawable.uikit_icn_24_card;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList2.add(com.revolut.core.ui_kit.models.popup.a.a(strName, textLocalisedClauseA, new ResourceImage(i2, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, iVar2, null, null, Constants.TAG_EMV_L2_CHECKSUM));
        }
        return new ListSubheaderDelegate.Model("FILTERS_DROPDOWN_ID", (Image) null, (Clause) textLocalisedClause, (Image) resourceImage, (Clause) textLocalisedClause2, (String) null, (ListSubheaderDelegate.Model.a) bVar, false, false, (Object) arrayList2, (Parcelable) null, 0, i3, 0, 0, 56226);
    }

    public final qv0.i c(boolean z) {
        if (!z || !this.f197207a) {
            return new gu("FILTERS_DROPDOWN_ID", 0, 0, 30);
        }
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            arrayList.add(new com.revolut.core.ui_kit.views.q(a0.d.n("FILTERS_CHIPS_ID", i), Tabs.c.a.f58897a, 50));
        }
        return new TabsDelegate.Model("FILTERS_CHIPS_ID", arrayList, null, null, null, null, R$attr.uikit_dp16, R$attr.uikit_dp0, null, 7804);
    }
}
