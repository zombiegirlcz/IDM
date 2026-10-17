package tc7;

import com.revolut.chat.ui.assistant.widget.AssistantWidgetContext;
import com.revolut.feature.credit.loan.api.widget.LoanWidgetContext;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.home_feed.api.widget.NetworthWidgetContext;
import com.revolut.feature.home_feed.api.widget.VaultWidgetContext;
import com.revolut.feature.home_feed.impl.widgets.cards.CardsWidgetContext;
import com.revolut.feature.home_feed.impl.widgets.scheduled_payments.ScheduledPaymentsWidgetContext;
import com.revolut.feature.insurance_home.api.widget.models.InsuranceWidgetContext;
import com.revolut.feature.nearby.rewards.api.widget.NearbyRewardsWidgetContext;
import com.revolut.feature.retail.cobranded_cards.api.widgets.CobrandsWidgetContext;
import com.revolut.feature.revolutpay.order_tracking.api.widgets.RevolutPayWidgetContext;
import com.revolut.feature.separate_favourites.api.widget.FavouritesWidgetContext;
import com.revolut.feature.spending_analytics.api.widget.SpendingWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.api.rewards_hub.widget.RewardsHubWidgetContext;
import com.revolut.retail.feature.esim.api.widgets.EsimWidgetContext;
import com.revolut.retail.feature.payments.bank_transfer.api.widgets.p2p_international.P2PInternationalWidgetContext;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class o implements bsh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269757a;

    @Override // bsh.a
    public final WidgetContext b(WidgetContext widgetContext) {
        switch (this.f269757a) {
            case 0:
                HomeFeedWidgetContext.JointCurrency jointContext = (HomeFeedWidgetContext.JointCurrency) widgetContext;
                Set set = p.f269758a;
                Intrinsics.checkNotNullParameter(jointContext, "jointContext");
                HomeFeedWidgetContext.Personal.INSTANCE.getClass();
                return HomeFeedWidgetContext.Personal.Companion.a().copy(jointContext.getContextKey());
            case 1:
                HomeFeedWidgetContext.JointCurrency jointContext2 = (HomeFeedWidgetContext.JointCurrency) widgetContext;
                Set set2 = p.f269758a;
                Intrinsics.checkNotNullParameter(jointContext2, "jointContext");
                return new FavouritesWidgetContext(jointContext2.getContextKey());
            case 2:
                HomeFeedWidgetContext.JointCurrency jointContext3 = (HomeFeedWidgetContext.JointCurrency) widgetContext;
                Set set3 = p.f269758a;
                Intrinsics.checkNotNullParameter(jointContext3, "jointContext");
                return new SpendingWidgetContext(jointContext3.getContextKey(), SpendingWidgetContext.AccountType.Joint.f87496a);
            case 3:
                HomeFeedWidgetContext.JointCurrency jointContext4 = (HomeFeedWidgetContext.JointCurrency) widgetContext;
                Set set4 = p.f269758a;
                Intrinsics.checkNotNullParameter(jointContext4, "jointContext");
                return new ScheduledPaymentsWidgetContext(jointContext4.getContextKey(), cd7.m.Joint, null, 4, null);
            case 4:
                HomeFeedWidgetContext.JointCurrency jointContext5 = (HomeFeedWidgetContext.JointCurrency) widgetContext;
                Set set5 = p.f269758a;
                Intrinsics.checkNotNullParameter(jointContext5, "jointContext");
                return new CardsWidgetContext(jointContext5.getContextKey(), b93.d.JOINT);
            case 5:
                HomeFeedWidgetContext.JointCurrency context = (HomeFeedWidgetContext.JointCurrency) widgetContext;
                Set set6 = p.f269758a;
                Intrinsics.checkNotNullParameter(context, "context");
                return new EsimWidgetContext(context.getContextKey());
            case 6:
                HomeFeedWidgetContext.Junior juniorContext = (HomeFeedWidgetContext.Junior) widgetContext;
                Set set7 = r.f269759a;
                Intrinsics.checkNotNullParameter(juniorContext, "juniorContext");
                HomeFeedWidgetContext.Personal.INSTANCE.getClass();
                return HomeFeedWidgetContext.Personal.Companion.a().copy(juniorContext.getContextKey());
            case 7:
                HomeFeedWidgetContext.Junior juniorContext2 = (HomeFeedWidgetContext.Junior) widgetContext;
                Set set8 = r.f269759a;
                Intrinsics.checkNotNullParameter(juniorContext2, "juniorContext");
                return new SpendingWidgetContext(juniorContext2.getContextKey(), new SpendingWidgetContext.AccountType.Junior(juniorContext2.getJuniorId()));
            case 8:
                HomeFeedWidgetContext.JuniorPocket context2 = (HomeFeedWidgetContext.JuniorPocket) widgetContext;
                Set set9 = t.f269760a;
                Intrinsics.checkNotNullParameter(context2, "context");
                return new VaultWidgetContext(context2.f74691a, new VaultWidgetContext.Type.JuniorPockets(context2.f74692b));
            case 9:
                HomeFeedWidgetContext.JuniorSavings savingsContext = (HomeFeedWidgetContext.JuniorSavings) widgetContext;
                Set set10 = v.f269761a;
                Intrinsics.checkNotNullParameter(savingsContext, "savingsContext");
                return new VaultWidgetContext(savingsContext.f74693a, new VaultWidgetContext.Type.JuniorSavings(savingsContext.f74694b));
            case 10:
                HomeFeedWidgetContext.JuniorSavings savingsContext2 = (HomeFeedWidgetContext.JuniorSavings) widgetContext;
                Set set11 = v.f269761a;
                Intrinsics.checkNotNullParameter(savingsContext2, "savingsContext");
                HomeFeedWidgetContext.Savings.Companion companion = HomeFeedWidgetContext.Savings.INSTANCE;
                HomeFeedWidgetContext.Savings.Type.Youth youth = new HomeFeedWidgetContext.Savings.Type.Youth(savingsContext2.f74694b, savingsContext2.f74695c);
                companion.getClass();
                return HomeFeedWidgetContext.Savings.copy$default(HomeFeedWidgetContext.Savings.Companion.a(youth), savingsContext2.f74693a, null, 2, null);
            case 11:
                HomeFeedWidgetContext.Linked linkedContext = (HomeFeedWidgetContext.Linked) widgetContext;
                Set set12 = x.f269762a;
                Intrinsics.checkNotNullParameter(linkedContext, "linkedContext");
                HomeFeedWidgetContext.Personal.INSTANCE.getClass();
                return HomeFeedWidgetContext.Personal.Companion.a().copy(linkedContext.getContextKey());
            case 12:
                HomeFeedWidgetContext.Linked linkedContext2 = (HomeFeedWidgetContext.Linked) widgetContext;
                Set set13 = x.f269762a;
                Intrinsics.checkNotNullParameter(linkedContext2, "linkedContext");
                return new NetworthWidgetContext(linkedContext2.getContextKey(), new NetworthWidgetContext.Type.Linked(linkedContext2.getPocketId()));
            case 13:
                HomeFeedWidgetContext.Linked linkedContext3 = (HomeFeedWidgetContext.Linked) widgetContext;
                Set set14 = x.f269762a;
                Intrinsics.checkNotNullParameter(linkedContext3, "linkedContext");
                return new SpendingWidgetContext(linkedContext3.getContextKey(), new SpendingWidgetContext.AccountType.Linked(linkedContext3.getPocketId(), linkedContext3.getInstitutionName()));
            case 14:
                HomeFeedWidgetContext.Loan context3 = (HomeFeedWidgetContext.Loan) widgetContext;
                Intrinsics.checkNotNullParameter(context3, "context");
                return new LoanWidgetContext(context3.getContextKey(), context3.getLoanId());
            case 15:
                HomeFeedWidgetContext.PersonalPocket personalPocketContext = (HomeFeedWidgetContext.PersonalPocket) widgetContext;
                Intrinsics.checkNotNullParameter(personalPocketContext, "personalPocketContext");
                return new VaultWidgetContext(personalPocketContext.getContextKey(), new VaultWidgetContext.Type.Pockets(personalPocketContext.getSubaccountId()));
            case 16:
                HomeFeedWidgetContext.PersonalPocket personalPocketContext2 = (HomeFeedWidgetContext.PersonalPocket) widgetContext;
                Intrinsics.checkNotNullParameter(personalPocketContext2, "personalPocketContext");
                return new NetworthWidgetContext(personalPocketContext2.getContextKey(), new NetworthWidgetContext.Type.PersonalPocket(personalPocketContext2.getSubaccountId()));
            case 17:
                HomeFeedWidgetContext.Personal personalContext = (HomeFeedWidgetContext.Personal) widgetContext;
                Set set15 = c0.f269581a;
                Intrinsics.checkNotNullParameter(personalContext, "personalContext");
                return new NetworthWidgetContext(personalContext.getContextKey(), NetworthWidgetContext.Type.Personal.f74714a);
            case 18:
                HomeFeedWidgetContext.Personal personalContext2 = (HomeFeedWidgetContext.Personal) widgetContext;
                Set set16 = c0.f269581a;
                Intrinsics.checkNotNullParameter(personalContext2, "personalContext");
                return new SpendingWidgetContext(personalContext2.getContextKey(), SpendingWidgetContext.AccountType.Personal.f87500a);
            case 19:
                HomeFeedWidgetContext.Personal personalContext3 = (HomeFeedWidgetContext.Personal) widgetContext;
                Set set17 = c0.f269581a;
                Intrinsics.checkNotNullParameter(personalContext3, "personalContext");
                return new ScheduledPaymentsWidgetContext(personalContext3.getContextKey(), cd7.m.Personal, null, 4, null);
            case 20:
                HomeFeedWidgetContext.Personal personalContext4 = (HomeFeedWidgetContext.Personal) widgetContext;
                Set set18 = c0.f269581a;
                Intrinsics.checkNotNullParameter(personalContext4, "personalContext");
                return new CardsWidgetContext(personalContext4.getContextKey(), b93.d.ALL);
            case 21:
                HomeFeedWidgetContext.Personal personalContext5 = (HomeFeedWidgetContext.Personal) widgetContext;
                Set set19 = c0.f269581a;
                Intrinsics.checkNotNullParameter(personalContext5, "personalContext");
                return new EsimWidgetContext(personalContext5.getContextKey());
            case 22:
                HomeFeedWidgetContext.Personal personalContext6 = (HomeFeedWidgetContext.Personal) widgetContext;
                Set set20 = c0.f269581a;
                Intrinsics.checkNotNullParameter(personalContext6, "personalContext");
                HomeFeedWidgetContext.Savings.Companion companion2 = HomeFeedWidgetContext.Savings.INSTANCE;
                nib.c.Companion.getClass();
                HomeFeedWidgetContext.Savings.Type.Personal personal = new HomeFeedWidgetContext.Savings.Type.Personal(nib.b.f215667b);
                companion2.getClass();
                return HomeFeedWidgetContext.Savings.copy$default(HomeFeedWidgetContext.Savings.Companion.a(personal), personalContext6.getContextKey(), null, 2, null);
            case 23:
                HomeFeedWidgetContext.Personal personalContext7 = (HomeFeedWidgetContext.Personal) widgetContext;
                Set set21 = c0.f269581a;
                Intrinsics.checkNotNullParameter(personalContext7, "personalContext");
                return new AssistantWidgetContext(personalContext7.getContextKey());
            case 24:
                HomeFeedWidgetContext.Personal personalContext8 = (HomeFeedWidgetContext.Personal) widgetContext;
                Set set22 = c0.f269581a;
                Intrinsics.checkNotNullParameter(personalContext8, "personalContext");
                return new RevolutPayWidgetContext(personalContext8.getContextKey());
            case 25:
                HomeFeedWidgetContext.Personal personalContext9 = (HomeFeedWidgetContext.Personal) widgetContext;
                Set set23 = c0.f269581a;
                Intrinsics.checkNotNullParameter(personalContext9, "personalContext");
                return new CobrandsWidgetContext(personalContext9.getContextKey());
            case 26:
                HomeFeedWidgetContext.Personal personalContext10 = (HomeFeedWidgetContext.Personal) widgetContext;
                Set set24 = c0.f269581a;
                Intrinsics.checkNotNullParameter(personalContext10, "personalContext");
                return new P2PInternationalWidgetContext(personalContext10.getContextKey());
            case 27:
                HomeFeedWidgetContext.Personal personalContext11 = (HomeFeedWidgetContext.Personal) widgetContext;
                Set set25 = c0.f269581a;
                Intrinsics.checkNotNullParameter(personalContext11, "personalContext");
                return new InsuranceWidgetContext(personalContext11.getContextKey());
            case 28:
                HomeFeedWidgetContext.Personal personalContext12 = (HomeFeedWidgetContext.Personal) widgetContext;
                Set set26 = c0.f269581a;
                Intrinsics.checkNotNullParameter(personalContext12, "personalContext");
                return new NearbyRewardsWidgetContext(personalContext12.getContextKey());
            default:
                HomeFeedWidgetContext.Personal personalContext13 = (HomeFeedWidgetContext.Personal) widgetContext;
                Set set27 = c0.f269581a;
                Intrinsics.checkNotNullParameter(personalContext13, "personalContext");
                return new RewardsHubWidgetContext(personalContext13.getContextKey(), "home");
        }
    }
}
