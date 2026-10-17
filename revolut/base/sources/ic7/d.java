package ic7;

import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.retail.savings.api.SavingsApi$Toggles;
import com.revolut.feature.subaccount.api.SubaccountApi$Toggles;
import csh.g;
import dsh.e;
import dsh.i;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f160219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f160220b;

    public d(gte.a featureToggleInteractor, n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f160219a = countryInteractor;
        this.f160220b = featureToggleInteractor;
    }

    @Override // csh.g
    public final List a(Class contextClass) {
        Intrinsics.checkNotNullParameter(contextClass, "contextClass");
        if (contextClass.equals(HomeFeedWidgetContext.Pro.class)) {
            e.Companion.getClass();
            return v.k(new i("ProSales", dsh.d.a()), new i("ProCashback", dsh.d.a()), new i("ProToolbox", dsh.d.a()));
        }
        if (contextClass.equals(HomeFeedWidgetContext.ProPocket.class)) {
            e.Companion.getClass();
            return u.c(new i("VaultAutomationsList", dsh.d.a()));
        }
        if (contextClass.equals(HomeFeedWidgetContext.ProTaxPocket.class)) {
            e.Companion.getClass();
            return v.k(new i("ProVATReminder", dsh.d.a()), new i("VaultAutomationsList", dsh.d.a()));
        }
        if (contextClass.equals(HomeFeedWidgetContext.CreditCard.class)) {
            e.Companion.getClass();
            return v.k(new i("CreditCardStatement", dsh.d.a()), new i("CreditCardInstalment", dsh.d.a()), new i("CreditCardRewards", dsh.d.a()), new i("CreditCardRevPoints", dsh.d.a()), new i("CreditCardFeeWaiver", dsh.d.a()));
        }
        if (contextClass.equals(HomeFeedWidgetContext.Collateral.class)) {
            e.Companion.getClass();
            return u.c(new i("CollateralAvailableToWithdraw", dsh.d.a()));
        }
        if (contextClass.equals(HomeFeedWidgetContext.GroupPocket.class)) {
            e.Companion.getClass();
            return v.k(new i("GroupPocketMembersList", dsh.d.a()), new i("VaultAutomationsList", dsh.d.a()));
        }
        if (contextClass.equals(HomeFeedWidgetContext.Junior.class)) {
            e.Companion.getClass();
            return v.k(new i("AutomationsList", dsh.d.a()), new i("JuniorPartnershipsMedium", dsh.d.a()));
        }
        if (contextClass.equals(HomeFeedWidgetContext.JointPocket.class)) {
            e.Companion.getClass();
            return v.k(new i("LinkedCard", dsh.d.a()), new i("BillsList", dsh.d.a()), new i("VaultAutomationsList", dsh.d.a()));
        }
        boolean zEquals = contextClass.equals(HomeFeedWidgetContext.PersonalPocket.class);
        i iVar = null;
        gte.a aVar = this.f160220b;
        if (zEquals) {
            if (((jte.d) aVar).c(SubaccountApi$Toggles.PersonalPocketLink.f88945c)) {
                e.Companion.getClass();
                iVar = new i("PocketLinkQR", dsh.d.a());
            }
            e.Companion.getClass();
            i[] elements = {iVar, new i("LinkedCard", dsh.d.a()), new i("BillsList", dsh.d.a()), new i("VaultAutomationsList", dsh.d.a())};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return kotlin.collections.d.L(elements);
        }
        if (contextClass.equals(HomeFeedWidgetContext.Savings.class)) {
            e.Companion.getClass();
            i[] elements2 = {new i("SavingsFixedTermAccountInterestEarnedWidget", dsh.d.a()), new i("SavingsFixedTermAccountProgressWidget", dsh.d.a()), new i("EarnedInterestSmall", dsh.d.a()), new i("SavingsSavedThisMonthSmall", dsh.d.a()), new i("SavingsChallengeGoal", dsh.d.a()), aVar.a(SavingsApi$Toggles.SavingsAutomationsHomeEntry.f83077c) ? new i("VaultAutomationsList", dsh.d.a()) : null};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            return kotlin.collections.d.L(elements2);
        }
        if (contextClass.equals(HomeFeedWidgetContext.JuniorSavings.class)) {
            e.Companion.getClass();
            return u.c(new i("VaultAutomationsList", dsh.d.a()));
        }
        if (contextClass.equals(HomeFeedWidgetContext.JuniorPocket.class)) {
            e.Companion.getClass();
            return u.c(new i("VaultAutomationsList", dsh.d.a()));
        }
        if (contextClass.equals(HomeFeedWidgetContext.JointSavings.class)) {
            e.Companion.getClass();
            return v.k(new i("SavingsSavedThisMonthSmall", dsh.d.a()), new i("EarnedInterestSmall", dsh.d.a()), new i("VaultAutomationsList", dsh.d.a()), new i("Goals", dsh.d.a()));
        }
        if (!contextClass.equals(HomeFeedWidgetContext.TeenPocket.class)) {
            return contextClass.equals(HomeFeedWidgetContext.TotalWealth.class) ? f0.f322471a : f0.f322471a;
        }
        e.Companion.getClass();
        return u.c(new i("VaultAutomationsList", dsh.d.a()));
    }

    @Override // csh.g
    public final List b(Class cls) {
        i iVar;
        if (cls.equals(HomeFeedWidgetContext.Personal.class)) {
            if (((o8b.c) this.f160219a).g()) {
                e.Companion.getClass();
                return v.k(new i("CardsSmall", dsh.d.a()), new i("AnalyticsMedium", dsh.d.a()), new i("TotalWealthItems", dsh.d.a()));
            }
            e.Companion.getClass();
            return v.k(new i("CardsMedium", dsh.d.a()), new i("AnalyticsMedium", dsh.d.a()), new i("WatchlistItems", dsh.d.a()), new i("InsuranceMedium", dsh.d.a()), new i("RewardsHubMedium", dsh.d.a()));
        }
        if (cls.equals(HomeFeedWidgetContext.Pro.class)) {
            e.Companion.getClass();
            return v.k(new i("ProSales", dsh.d.a()), new i("ProCashback", dsh.d.a()), new i("ProSalesAnalytics", dsh.d.a()), new i("ProPocketsSmall", dsh.d.a()), new i("ProPerks", dsh.d.a()), new i("ProToolbox", dsh.d.a()));
        }
        if (cls.equals(HomeFeedWidgetContext.ProPocket.class)) {
            e.Companion.getClass();
            return v.k(new i("VaultAutomationsList", dsh.d.a()), new i("Goals", dsh.d.a()));
        }
        if (cls.equals(HomeFeedWidgetContext.ProTaxPocket.class)) {
            e.Companion.getClass();
            return v.k(new i("ProVATReminder", dsh.d.a()), new i("VaultAutomationsList", dsh.d.a()), new i("ProTaxHub", dsh.d.a()));
        }
        if (cls.equals(HomeFeedWidgetContext.CreditCard.class)) {
            e.Companion.getClass();
            return v.k(new i("CreditCardStatement", dsh.d.a()), new i("CreditCardInstalment", dsh.d.a()), new i("CreditCardRewards", dsh.d.a()), new i("CreditCardAdditionalCardholders", dsh.d.a()), new i("CreditCardRevPoints", dsh.d.a()), new i("CreditCardFeeWaiver", dsh.d.a()), new i("CreditCardMsiShops", dsh.d.a()));
        }
        if (cls.equals(HomeFeedWidgetContext.GroupPocket.class)) {
            e.Companion.getClass();
            return v.k(new i("VaultAutomationsList", dsh.d.a()), new i("Goals", dsh.d.a()), new i("GroupPocketMembersList", dsh.d.a()), new i("TotalWealthItems", dsh.d.a()));
        }
        if (cls.equals(HomeFeedWidgetContext.PersonalPocket.class)) {
            if (((jte.d) this.f160220b).c(SubaccountApi$Toggles.PersonalPocketLink.f88945c)) {
                e.Companion.getClass();
                iVar = new i("PocketLinkQR", dsh.d.a());
            } else {
                iVar = null;
            }
            i iVar2 = iVar;
            e.Companion.getClass();
            i[] elements = {iVar2, new i("LinkedCard", dsh.d.a()), new i("BillsList", dsh.d.a()), new i("VaultAutomationsList", dsh.d.a()), new i("Goals", dsh.d.a()), new i("TotalWealthItems", dsh.d.a())};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return kotlin.collections.d.L(elements);
        }
        if (cls.equals(HomeFeedWidgetContext.JointPocket.class)) {
            e.Companion.getClass();
            return v.k(new i("LinkedCard", dsh.d.a()), new i("BillsList", dsh.d.a()), new i("VaultAutomationsList", dsh.d.a()), new i("Goals", dsh.d.a()), new i("TotalWealthItems", dsh.d.a()));
        }
        if (cls.equals(HomeFeedWidgetContext.Linked.class)) {
            e.Companion.getClass();
            return v.k(new i("AnalyticsMedium", dsh.d.a()), new i("TotalWealthItems", dsh.d.a()));
        }
        if (cls.equals(HomeFeedWidgetContext.JointCurrency.class)) {
            e.Companion.getClass();
            return v.k(new i("CardsSmall", dsh.d.a()), new i("AnalyticsSmall", dsh.d.a()), new i("UpcomingPaymentsList", dsh.d.a()), new i("TotalWealthItems", dsh.d.a()));
        }
        if (cls.equals(HomeFeedWidgetContext.Savings.class)) {
            e.Companion.getClass();
            return v.k(new i("SavingsFixedTermAccountInterestEarnedWidget", dsh.d.a()), new i("SavingsFixedTermAccountProgressWidget", dsh.d.a()), new i("EarnedInterestSmall", dsh.d.a()), new i("SavingsSavedThisMonthSmall", dsh.d.a()), new i("VaultAutomationsList", dsh.d.a()), new i("Goals", dsh.d.a()), new i("TotalWealthItems", dsh.d.a()), new i("SavingsChallengeGoal", dsh.d.a()));
        }
        if (cls.equals(HomeFeedWidgetContext.JointSavings.class)) {
            e.Companion.getClass();
            return v.k(new i("EarnedInterestSmall", dsh.d.a()), new i("SavingsSavedThisMonthSmall", dsh.d.a()), new i("VaultAutomationsList", dsh.d.a()), new i("Goals", dsh.d.a()), new i("TotalWealthItems", dsh.d.a()));
        }
        if (!cls.equals(HomeFeedWidgetContext.TeenPocket.class)) {
            return cls.equals(HomeFeedWidgetContext.TotalWealth.class) ? f0.f322471a : f0.f322471a;
        }
        e.Companion.getClass();
        return u.c(new i("VaultAutomationsList", dsh.d.a()));
    }
}
