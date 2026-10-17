package ic7;

import aim.e;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.retail.savings.api.SavingsApi$Toggles;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f160216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j30.c f160217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f160218c;

    public b(gte.a featureToggleInteractor, j30.c chatFeatureToggles, n8b.a countryInteractor, r57.a freelancerFeedWidgetCatalogueOrderFactory, yc7.a juniorWidgetCatalogueOrderProvider) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(freelancerFeedWidgetCatalogueOrderFactory, "freelancerFeedWidgetCatalogueOrderFactory");
        Intrinsics.checkNotNullParameter(juniorWidgetCatalogueOrderProvider, "juniorWidgetCatalogueOrderProvider");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f160216a = countryInteractor;
        this.f160217b = chatFeatureToggles;
        this.f160218c = featureToggleInteractor;
    }

    @Override // csh.j
    public final List a(WidgetContext widgetContext) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        if (widgetContext instanceof HomeFeedWidgetContext.Pro) {
            String accountId = ((HomeFeedWidgetContext.Pro) widgetContext).getAccountId();
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            e eVarB = u.b();
            if (Intrinsics.f(accountId, "PENDING_PRO_ACCOUNT_ID")) {
                String[] elements = {"pro_sales_analytics", "pro_cashflow_analytics", "pro_pockets", "pro_toolbox", "pro_tax_hub", "pro_perks"};
                Intrinsics.checkNotNullParameter(elements, "elements");
                eVarB.addAll(kotlin.collections.d.L(elements));
            } else {
                String[] elements2 = {"pro_sales_analytics", "pro_cashflow_analytics", "pro_pockets", "pro_toolbox", "pro_tax_hub", "pro_perks"};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                eVarB.addAll(kotlin.collections.d.L(elements2));
                eVarB.add("esim");
                eVarB.add("contacts");
                eVarB.add("cards");
                eVarB.add("analytics");
                eVarB.add("net_worth");
            }
            return u.a(eVarB);
        }
        if (widgetContext instanceof HomeFeedWidgetContext.ProPocket) {
            return v.k("vault_goals", "net_worth");
        }
        if (widgetContext instanceof HomeFeedWidgetContext.ProTaxPocket) {
            return u.c("net_worth");
        }
        if (widgetContext instanceof HomeFeedWidgetContext.JointCurrency) {
            String[] elements3 = {"esim", "contacts", "cards", "rev_points", "rev_points_rim", "analytics", "net_worth", "watchlist-symbol", "savings", "scheduled_payments", "watchlist", "alerts", "atms_map", "nearby_rewards", "trending_rewards"};
            Intrinsics.checkNotNullParameter(elements3, "elements");
            return kotlin.collections.d.L(elements3);
        }
        if (widgetContext instanceof HomeFeedWidgetContext.Loan) {
            return v.k("LoanProgressWidget", "LoanInterestRateWidget");
        }
        if (widgetContext instanceof HomeFeedWidgetContext.Junior) {
            e eVarB2 = u.b();
            eVarB2.addAll(v.k("JUNIOR_CHALLENGES_ID", "JUNIOR_TOTAL_WEALTH", "JUNIOR_CARDS", "APP_ACCESS_CATALOGUE_ID"));
            eVarB2.add("JUNIOR_SPENDING_ANALYTICS");
            eVarB2.add("JUNIOR_PAYMENT_LINK");
            return u.a(eVarB2);
        }
        if (widgetContext instanceof HomeFeedWidgetContext.CreditCard) {
            return v.k("CREDIT_CARD_ADDITIONAL_CARDHOLDERS_ID", "CREDIT_CARD_MSI_ID", "esim", "contacts", "cards", "analytics", "net_worth", "watchlist-symbol", "savings", "scheduled_payments", "watchlist", "alerts", "atms_map", "nearby_rewards", "trending_rewards", "rev_points_rim");
        }
        if (!(widgetContext instanceof HomeFeedWidgetContext.PersonalPocket) && !(widgetContext instanceof HomeFeedWidgetContext.JointPocket) && !(widgetContext instanceof HomeFeedWidgetContext.GroupPocket)) {
            if (widgetContext instanceof HomeFeedWidgetContext.JuniorPocket) {
                return u.c("vault_goals");
            }
            if (widgetContext instanceof HomeFeedWidgetContext.Savings) {
                String[] elements4 = {"net_worth", "total_savings", "vault_goals", ((jte.d) this.f160218c).c(SavingsApi$Toggles.SavingsAutomationsHomeEntry.f83077c) ? "automations" : null, "savings_cashflow"};
                Intrinsics.checkNotNullParameter(elements4, "elements");
                return kotlin.collections.d.L(elements4);
            }
            if (widgetContext instanceof HomeFeedWidgetContext.JuniorSavings) {
                return v.k("vault_goals", "earned_interest", "savings_saved_this_month", "savings_cashflow");
            }
            if (widgetContext instanceof HomeFeedWidgetContext.TeenSavings) {
                return v.k("earned_interest", "savings_saved_this_month", "savings_cashflow");
            }
            if (widgetContext instanceof HomeFeedWidgetContext.Personal) {
                return b();
            }
            if (widgetContext instanceof HomeFeedWidgetContext.Linked) {
                return v.k("net_worth", "analytics");
            }
            if (widgetContext instanceof HomeFeedWidgetContext.JointSavings) {
                return v.k("savings_cashflow", "total_savings", "vault_goals", "net_worth");
            }
            if (!(widgetContext instanceof HomeFeedWidgetContext.TotalWealth)) {
                return f0.f322471a;
            }
            List listB = b();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listB) {
                if (!Intrinsics.f((String) obj2, "net_worth")) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        return v.k("net_worth", "vault_goals");
    }

    public final List b() {
        if (((o8b.c) this.f160216a).g()) {
            return v.k("cards", "analytics", "net_worth");
        }
        String[] elements = {((rf3.d) this.f160217b).d() ? "assistant" : null, "esim", "contacts", "cards", "rev_points", "rev_points_rim", "analytics", "net_worth", "junior_account", "scheduled_payments", "add_new_product", "watchlist", "watchlist-symbol", "alerts", "atms_map", "nearby_rewards", "rewards_hub", "rev_pay_delivery_tracking", "trending_rewards", "savings", "donations", "cobrands", "insurance"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }
}
