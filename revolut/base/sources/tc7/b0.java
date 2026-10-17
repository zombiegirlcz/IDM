package tc7;

import com.revolut.chat.ui.assistant.widget.AssistantWidgetContext;
import com.revolut.feature.freelancer_widgets.api.FreelancerWidgetContext;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.home_feed.api.widget.NetworthWidgetContext;
import com.revolut.feature.home_feed.api.widget.VaultWidgetContext;
import com.revolut.feature.home_feed.impl.widgets.cards.CardsWidgetContext;
import com.revolut.feature.home_feed.impl.widgets.scheduled_payments.ScheduledPaymentsWidgetContext;
import com.revolut.feature.nearby.rewards.api.widget.NearbyRewardsWidgetContext;
import com.revolut.feature.retail.cobranded_cards.api.widgets.CobrandsWidgetContext;
import com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext;
import com.revolut.feature.revolutpay.order_tracking.api.widgets.RevolutPayWidgetContext;
import com.revolut.feature.separate_favourites.api.widget.FavouritesWidgetContext;
import com.revolut.feature.spending_analytics.api.widget.CashflowWidgetContext;
import com.revolut.feature.spending_analytics.api.widget.SpendingWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.esim.api.widgets.EsimWidgetContext;
import com.revolut.retail.feature.payments.bank_transfer.api.widgets.p2p_international.P2PInternationalWidgetContext;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b0 implements bsh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269580a;

    @Override // bsh.a
    public final WidgetContext b(WidgetContext widgetContext) {
        switch (this.f269580a) {
            case 0:
                HomeFeedWidgetContext.Personal personalContext = (HomeFeedWidgetContext.Personal) widgetContext;
                Set set = c0.f269581a;
                Intrinsics.checkNotNullParameter(personalContext, "personalContext");
                return new RevPointsRimWidgetContext.HomeTab(personalContext.getContextKey());
            case 1:
                HomeFeedWidgetContext.Personal personalContext2 = (HomeFeedWidgetContext.Personal) widgetContext;
                Set set2 = c0.f269581a;
                Intrinsics.checkNotNullParameter(personalContext2, "personalContext");
                return new FavouritesWidgetContext(personalContext2.getContextKey());
            case 2:
                HomeFeedWidgetContext.ProPocket proPocketContext = (HomeFeedWidgetContext.ProPocket) widgetContext;
                Intrinsics.checkNotNullParameter(proPocketContext, "proPocketContext");
                return new NetworthWidgetContext(proPocketContext.getContextKey(), new NetworthWidgetContext.Type.ProPocket(proPocketContext.getSubaccountId()));
            case 3:
                HomeFeedWidgetContext.ProPocket proPocketContext2 = (HomeFeedWidgetContext.ProPocket) widgetContext;
                Intrinsics.checkNotNullParameter(proPocketContext2, "proPocketContext");
                return new VaultWidgetContext(proPocketContext2.getContextKey(), new VaultWidgetContext.Type.ProRegularPockets(proPocketContext2.getSubaccountId()));
            case 4:
                HomeFeedWidgetContext.ProTaxPocket proTaxPocketContext = (HomeFeedWidgetContext.ProTaxPocket) widgetContext;
                Intrinsics.checkNotNullParameter(proTaxPocketContext, "proTaxPocketContext");
                return new FreelancerWidgetContext(proTaxPocketContext.getContextKey(), proTaxPocketContext.getSubaccountId());
            case 5:
                HomeFeedWidgetContext.ProTaxPocket proTaxPocketContext2 = (HomeFeedWidgetContext.ProTaxPocket) widgetContext;
                Intrinsics.checkNotNullParameter(proTaxPocketContext2, "proTaxPocketContext");
                return new NetworthWidgetContext(proTaxPocketContext2.getContextKey(), new NetworthWidgetContext.Type.ProTaxPocket(proTaxPocketContext2.getSubaccountId()));
            case 6:
                HomeFeedWidgetContext.ProTaxPocket proTaxPocketContext3 = (HomeFeedWidgetContext.ProTaxPocket) widgetContext;
                Intrinsics.checkNotNullParameter(proTaxPocketContext3, "proTaxPocketContext");
                return new VaultWidgetContext(proTaxPocketContext3.getContextKey(), new VaultWidgetContext.Type.ProTaxPockets(proTaxPocketContext3.getSubaccountId()));
            case 7:
                HomeFeedWidgetContext.Pro proContext = (HomeFeedWidgetContext.Pro) widgetContext;
                Set set3 = g0.f269707a;
                Intrinsics.checkNotNullParameter(proContext, "proContext");
                return new NetworthWidgetContext(proContext.getContextKey(), new NetworthWidgetContext.Type.Pro(proContext.getAccountId()));
            case 8:
                HomeFeedWidgetContext.Pro proContext2 = (HomeFeedWidgetContext.Pro) widgetContext;
                Set set4 = g0.f269707a;
                Intrinsics.checkNotNullParameter(proContext2, "proContext");
                return new FreelancerWidgetContext(proContext2.getContextKey(), proContext2.getAccountId());
            case 9:
                HomeFeedWidgetContext.Pro proContext3 = (HomeFeedWidgetContext.Pro) widgetContext;
                Set set5 = g0.f269707a;
                Intrinsics.checkNotNullParameter(proContext3, "proContext");
                HomeFeedWidgetContext.Personal.INSTANCE.getClass();
                return HomeFeedWidgetContext.Personal.Companion.a().copy(proContext3.getContextKey());
            case 10:
                HomeFeedWidgetContext.Pro proContext4 = (HomeFeedWidgetContext.Pro) widgetContext;
                Set set6 = g0.f269707a;
                Intrinsics.checkNotNullParameter(proContext4, "proContext");
                return new CashflowWidgetContext(proContext4.getContextKey(), AnalyticsAccount.Pro.All.f99196a);
            case 11:
                HomeFeedWidgetContext.Pro proContext5 = (HomeFeedWidgetContext.Pro) widgetContext;
                Set set7 = g0.f269707a;
                Intrinsics.checkNotNullParameter(proContext5, "proContext");
                return new SpendingWidgetContext(proContext5.getContextKey(), SpendingWidgetContext.AccountType.Pro.f87501a);
            case 12:
                HomeFeedWidgetContext.Pro proContext6 = (HomeFeedWidgetContext.Pro) widgetContext;
                Set set8 = g0.f269707a;
                Intrinsics.checkNotNullParameter(proContext6, "proContext");
                return new CardsWidgetContext(proContext6.getContextKey(), b93.d.FREELANCER);
            case 13:
                HomeFeedWidgetContext.Pro proContext7 = (HomeFeedWidgetContext.Pro) widgetContext;
                Set set9 = g0.f269707a;
                Intrinsics.checkNotNullParameter(proContext7, "proContext");
                return new EsimWidgetContext(proContext7.getContextKey());
            case 14:
                HomeFeedWidgetContext.Savings savingsContext = (HomeFeedWidgetContext.Savings) widgetContext;
                Intrinsics.checkNotNullParameter(savingsContext, "savingsContext");
                return new VaultWidgetContext(savingsContext.getContextKey(), new VaultWidgetContext.Type.Savings(savingsContext.getType().getF74700a()));
            case 15:
                HomeFeedWidgetContext.Savings savingsContext2 = (HomeFeedWidgetContext.Savings) widgetContext;
                Intrinsics.checkNotNullParameter(savingsContext2, "savingsContext");
                return new NetworthWidgetContext(savingsContext2.getContextKey(), new NetworthWidgetContext.Type.Savings(savingsContext2.getType().getF74700a()));
            case 16:
                HomeFeedWidgetContext.TeenPocket context = (HomeFeedWidgetContext.TeenPocket) widgetContext;
                Set set10 = j0.f269738a;
                Intrinsics.checkNotNullParameter(context, "context");
                return new VaultWidgetContext(context.getContextKey(), new VaultWidgetContext.Type.TeenPockets(context.getVaultId()));
            case 17:
                HomeFeedWidgetContext.TeenSavings teenSavingsContext = (HomeFeedWidgetContext.TeenSavings) widgetContext;
                Intrinsics.checkNotNullParameter(teenSavingsContext, "teenSavingsContext");
                HomeFeedWidgetContext.Savings.Companion companion = HomeFeedWidgetContext.Savings.INSTANCE;
                HomeFeedWidgetContext.Savings.Type.Teen teen = new HomeFeedWidgetContext.Savings.Type.Teen(teenSavingsContext.f74703b, teenSavingsContext.f74704c);
                companion.getClass();
                return HomeFeedWidgetContext.Savings.copy$default(HomeFeedWidgetContext.Savings.Companion.a(teen), teenSavingsContext.f74702a, null, 2, null);
            case 18:
                HomeFeedWidgetContext.TotalWealth totalWealthContext = (HomeFeedWidgetContext.TotalWealth) widgetContext;
                Set set11 = n0.f269756a;
                Intrinsics.checkNotNullParameter(totalWealthContext, "totalWealthContext");
                HomeFeedWidgetContext.Personal.INSTANCE.getClass();
                return HomeFeedWidgetContext.Personal.Companion.a().copy(totalWealthContext.getContextKey());
            case 19:
                HomeFeedWidgetContext.TotalWealth totalWealthContext2 = (HomeFeedWidgetContext.TotalWealth) widgetContext;
                Set set12 = n0.f269756a;
                Intrinsics.checkNotNullParameter(totalWealthContext2, "totalWealthContext");
                return new EsimWidgetContext(totalWealthContext2.getContextKey());
            case 20:
                HomeFeedWidgetContext.TotalWealth totalWealthContext3 = (HomeFeedWidgetContext.TotalWealth) widgetContext;
                Set set13 = n0.f269756a;
                Intrinsics.checkNotNullParameter(totalWealthContext3, "totalWealthContext");
                HomeFeedWidgetContext.Savings.Companion companion2 = HomeFeedWidgetContext.Savings.INSTANCE;
                nib.c.Companion.getClass();
                HomeFeedWidgetContext.Savings.Type.Personal personal = new HomeFeedWidgetContext.Savings.Type.Personal(nib.b.f215667b);
                companion2.getClass();
                return HomeFeedWidgetContext.Savings.copy$default(HomeFeedWidgetContext.Savings.Companion.a(personal), totalWealthContext3.getContextKey(), null, 2, null);
            case 21:
                HomeFeedWidgetContext.TotalWealth totalWealthContext4 = (HomeFeedWidgetContext.TotalWealth) widgetContext;
                Set set14 = n0.f269756a;
                Intrinsics.checkNotNullParameter(totalWealthContext4, "totalWealthContext");
                return new AssistantWidgetContext(totalWealthContext4.getContextKey());
            case 22:
                HomeFeedWidgetContext.TotalWealth totalWealthContext5 = (HomeFeedWidgetContext.TotalWealth) widgetContext;
                Set set15 = n0.f269756a;
                Intrinsics.checkNotNullParameter(totalWealthContext5, "totalWealthContext");
                return new RevolutPayWidgetContext(totalWealthContext5.getContextKey());
            case 23:
                HomeFeedWidgetContext.TotalWealth totalWealthContext6 = (HomeFeedWidgetContext.TotalWealth) widgetContext;
                Set set16 = n0.f269756a;
                Intrinsics.checkNotNullParameter(totalWealthContext6, "totalWealthContext");
                return new CobrandsWidgetContext(totalWealthContext6.getContextKey());
            case 24:
                HomeFeedWidgetContext.TotalWealth totalWealthContext7 = (HomeFeedWidgetContext.TotalWealth) widgetContext;
                Set set17 = n0.f269756a;
                Intrinsics.checkNotNullParameter(totalWealthContext7, "totalWealthContext");
                return new P2PInternationalWidgetContext(totalWealthContext7.getContextKey());
            case 25:
                HomeFeedWidgetContext.TotalWealth totalWealthContext8 = (HomeFeedWidgetContext.TotalWealth) widgetContext;
                Set set18 = n0.f269756a;
                Intrinsics.checkNotNullParameter(totalWealthContext8, "totalWealthContext");
                return new NearbyRewardsWidgetContext(totalWealthContext8.getContextKey());
            case 26:
                HomeFeedWidgetContext.TotalWealth totalWealthContext9 = (HomeFeedWidgetContext.TotalWealth) widgetContext;
                Set set19 = n0.f269756a;
                Intrinsics.checkNotNullParameter(totalWealthContext9, "totalWealthContext");
                return new RevPointsRimWidgetContext.HomeTab(totalWealthContext9.getContextKey());
            case 27:
                HomeFeedWidgetContext.TotalWealth totalWealthContext10 = (HomeFeedWidgetContext.TotalWealth) widgetContext;
                Set set20 = n0.f269756a;
                Intrinsics.checkNotNullParameter(totalWealthContext10, "totalWealthContext");
                return new FavouritesWidgetContext(totalWealthContext10.getContextKey());
            case 28:
                HomeFeedWidgetContext.TotalWealth totalWealthContext11 = (HomeFeedWidgetContext.TotalWealth) widgetContext;
                Set set21 = n0.f269756a;
                Intrinsics.checkNotNullParameter(totalWealthContext11, "totalWealthContext");
                return new SpendingWidgetContext(totalWealthContext11.getContextKey(), SpendingWidgetContext.AccountType.Personal.f87500a);
            default:
                HomeFeedWidgetContext.TotalWealth totalWealthContext12 = (HomeFeedWidgetContext.TotalWealth) widgetContext;
                Set set22 = n0.f269756a;
                Intrinsics.checkNotNullParameter(totalWealthContext12, "totalWealthContext");
                return new ScheduledPaymentsWidgetContext(totalWealthContext12.getContextKey(), cd7.m.Personal, null, 4, null);
        }
    }
}
