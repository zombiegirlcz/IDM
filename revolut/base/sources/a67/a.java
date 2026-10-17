package a67;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import ct6.w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements csh.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1548a;

    public a(wr5.a catalogueConfigProvider) {
        this.f1548a = 3;
        Intrinsics.checkNotNullParameter(catalogueConfigProvider, "catalogueConfigProvider");
    }

    @Override // csh.d
    public final Clause a() {
        switch (this.f1548a) {
            case 0:
                return new TextLocalisedClause(R$string.freelancer_widget_tax_hub_catalogue_title, null, null, 14);
            case 1:
                return new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_widget_title, null, null, 14);
            case 2:
                return new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_widget_title, null, null, 14);
            case 3:
                return new TextLocalisedClause(com.revolut.feature.crypto_feed.dependencies.R$string.crypto_feed_widget_catalog_most_traded_title, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.freelancer_widget_cashflow_catalogue_title, null, null, 14);
            case 5:
                return new TextLocalisedClause(R$string.freelancer_widget_perks_catalogue_title, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.freelancer_widget_pockets_catalogue_title, null, null, 14);
            default:
                return new TextLocalisedClause(R$string.freelancer_widget_sales_analytics_catalogue_title, null, null, 14);
        }
    }

    @Override // csh.d
    public final List c() {
        switch (this.f1548a) {
            case 0:
                return u.c("ProTaxHub");
            case 1:
                return v.k("EsimHomeSmall", "EsimHomeMedium");
            case 2:
                return u.c("EsimHomeMedium");
            case 3:
                return u.c("MostTradedDynamic");
            case 4:
                return u.c("CashflowSmall");
            case 5:
                return u.c("ProPerks");
            case 6:
                return v.k("ProPocketsSmall", "ProPockets");
            default:
                return v.k("ProSalesAnalyticsSmall", "ProSalesAnalytics");
        }
    }

    @Override // csh.d
    public final Clause d(String widgetType) {
        switch (this.f1548a) {
            case 0:
                Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                return new TextLocalisedClause(R$string.freelancer_widget_tax_hub_catalogue_description, null, null, 14);
            case 1:
                Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                return new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_widget_catalogue_description, null, null, 14);
            case 2:
                Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                return new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_widget_catalogue_description, null, null, 14);
            case 3:
                Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                return new TextLocalisedClause(com.revolut.feature.crypto_feed.dependencies.R$string.crypto_home_feed_widget_catalog_mosttraded_subtitle, null, null, 14);
            case 4:
                Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                return new TextLocalisedClause(R$string.freelancer_widget_cashflow_catalogue_subtitle, null, null, 14);
            case 5:
                Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                return new TextLocalisedClause(R$string.freelancer_widget_perks_catalogue_description, null, null, 14);
            case 6:
                Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                return new TextLocalisedClause(R$string.freelancer_widget_pockets_catalogue_description, null, null, 14);
            default:
                Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                return new TextLocalisedClause(R$string.freelancer_widget_sales_analytics_catalogue_description, null, null, 14);
        }
    }

    @Override // csh.d
    public final String e(List availableWidgetTypes) {
        switch (this.f1548a) {
            case 0:
                Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
                String str = availableWidgetTypes.contains("ProTaxHub") ? "ProTaxHub" : null;
                if (str == null) {
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
                String str2 = availableWidgetTypes.contains("EsimHomeSmall") ? "EsimHomeSmall" : null;
                if (str2 == null) {
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
                String str3 = availableWidgetTypes.contains("CashflowSmall") ? "CashflowSmall" : null;
                if (str3 == null) {
                }
                break;
            case 5:
                Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
                String str4 = availableWidgetTypes.contains("ProPerks") ? "ProPerks" : null;
                if (str4 == null) {
                }
                break;
            case 6:
                Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
                String str5 = availableWidgetTypes.contains("ProPocketsSmall") ? "ProPocketsSmall" : null;
                if (str5 == null) {
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
                String str6 = availableWidgetTypes.contains("ProSalesAnalyticsSmall") ? "ProSalesAnalyticsSmall" : null;
                if (str6 == null) {
                }
                break;
        }
        return (String) d0.b0(availableWidgetTypes);
    }

    public a(w clauseFactory, int i) {
        this.f1548a = i;
        switch (i) {
            case 4:
                Intrinsics.checkNotNullParameter(clauseFactory, "clauseFactory");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(clauseFactory, "clauseFactory");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(clauseFactory, "clauseFactory");
                break;
            case 7:
                Intrinsics.checkNotNullParameter(clauseFactory, "clauseFactory");
                break;
            default:
                Intrinsics.checkNotNullParameter(clauseFactory, "clauseFactory");
                break;
        }
    }

    public a(ioj.a esimWidgetCatalogueHeaderProvider, int i) {
        this.f1548a = i;
        switch (i) {
            case 2:
                Intrinsics.checkNotNullParameter(esimWidgetCatalogueHeaderProvider, "esimWidgetCatalogueHeaderProvider");
                break;
            default:
                Intrinsics.checkNotNullParameter(esimWidgetCatalogueHeaderProvider, "esimWidgetCatalogueHeaderProvider");
                break;
        }
    }
}
