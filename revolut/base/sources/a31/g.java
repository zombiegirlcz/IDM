package a31;

import aw0.c7;
import aw0.o9;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i1;
import com.revolut.core.ui_kit.delegates.widgets.n1;
import com.revolut.core.ui_kit.delegates.widgets.p1;
import com.revolut.core.ui_kit.delegates.widgets.q1;
import com.revolut.core.ui_kit.delegates.widgets.r1;
import com.revolut.core.ui_kit.delegates.widgets.s1;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.network.models.recurringpayment.ActivateManualCardMandateRequest;
import com.revolut.data.network.models.recurringpayment.ActivateSubscriptionRequest;
import com.revolut.data.network.models.recurringpayment.mapper.RecurringPaymentDtoMapperKt;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.CreditAgreementsV2FlowContract$State;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanState;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import com.revolut.shared.feature.wealth.domain.api.interactors.InstrumentTickerInteractor$Companion;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nel.a0;
import org.jmrtd.PassportService;
import zhm.a1;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f965b;

    public /* synthetic */ g(int i, String str, Object obj2) {
        this.f964a = i;
        this.f965b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws InstrumentTickerInteractor$Companion.NoTradeInstrumentException {
        boolean zContains;
        CompositeClause compositeClauseM;
        int i = this.f964a;
        boolean z = false;
        z = false;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        String str = this.f965b;
        switch (i) {
            case 0:
                String transactionId = (String) obj2;
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                return new ActivateSubscriptionRequest(null, transactionId, str == null ? null : str, 1, null);
            case 1:
                int i2 = 1;
                List subscriptions = (List) obj2;
                Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                Iterator it8 = subscriptions.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (Intrinsics.f(((qua.p) next).f249314a.f160150a, str)) {
                            obj3 = next;
                        }
                    }
                }
                qua.p pVar = (qua.p) obj3;
                if (pVar != null) {
                    List list = qua.u.f249338a;
                    Intrinsics.checkNotNullParameter(pVar, "<this>");
                    ibd.h[] elements = {ibd.h.CARD_MANDATE, ibd.h.BIZUM_MANDATE};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    zContains = kotlin.collections.d.y0(elements).contains(pVar.f249314a.f160152c);
                } else {
                    zContains = false;
                }
                if (zContains) {
                    ufm.c cVar = new ufm.c(new j(subscriptions, str, z ? 1 : 0), 2);
                    Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                    return cVar;
                }
                ufm.c cVar2 = new ufm.c(new j(subscriptions, str, i2), 2);
                Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
                return cVar2;
            case 2:
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                ArrayList arrayList = new ArrayList();
                Iterator it9 = items.iterator();
                while (it9.hasNext()) {
                    qua.p pVarM3758toDomainSafeE67O_EE = RecurringPaymentDtoMapperKt.m3758toDomainSafeE67O_EE((o9l.r) it9.next(), str);
                    if (pVarM3758toDomainSafeE67O_EE != null) {
                        arrayList.add(pVarM3758toDomainSafeE67O_EE);
                    }
                }
                return arrayList;
            case 3:
                List list2 = (List) obj2;
                Intrinsics.checkNotNullParameter(list2, "list");
                Iterator it10 = list2.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        Object next2 = it10.next();
                        if (Intrinsics.f(((qua.p) next2).getId(), str)) {
                            obj11 = next2;
                        }
                    }
                }
                return (qua.p) obj11;
            case 4:
                String it11 = (String) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new ActivateManualCardMandateRequest(it11, str != null ? str : null);
            case 5:
                List list3 = (List) obj2;
                Intrinsics.checkNotNullParameter(list3, "list");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj12 : list3) {
                    if (Intrinsics.f(((qua.p) obj12).b(), str)) {
                        arrayList2.add(obj12);
                    }
                }
                return arrayList2;
            case 6:
                CreditAgreementsV2FlowContract$State update = (CreditAgreementsV2FlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                List<du3.b> list4 = update.f67011a;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                for (du3.b bVar : list4) {
                    boolean z3 = bVar.f117558h || Intrinsics.f(bVar.f117554a, str);
                    String id10 = bVar.f117554a;
                    String displayName = bVar.f117555b;
                    String str2 = bVar.f117556c;
                    String htmlUrl = bVar.d;
                    String pdfUrl = bVar.e;
                    String buttonText = bVar.f;
                    String str3 = bVar.f117557g;
                    List checkboxes = bVar.i;
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(displayName, "displayName");
                    Intrinsics.checkNotNullParameter(htmlUrl, "htmlUrl");
                    Intrinsics.checkNotNullParameter(pdfUrl, "pdfUrl");
                    Intrinsics.checkNotNullParameter(buttonText, "buttonText");
                    Intrinsics.checkNotNullParameter(checkboxes, "checkboxes");
                    arrayList3.add(new du3.b(id10, displayName, str2, htmlUrl, pdfUrl, buttonText, str3, z3, checkboxes));
                }
                return CreditAgreementsV2FlowContract$State.a(update, arrayList3, null, 2);
            case 7:
                List juniorProfiles = (List) obj2;
                Intrinsics.checkNotNullParameter(juniorProfiles, "juniorProfiles");
                Iterator it12 = juniorProfiles.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        Object next3 = it12.next();
                        if (Intrinsics.f(((JuniorBankingProfile) next3).f77103j, str)) {
                            obj10 = next3;
                        }
                    }
                }
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) obj10;
                if (juniorBankingProfile != null) {
                    return juniorBankingProfile;
                }
                throw new NoSuchElementException("Cannot find junior account by id");
            case 8:
                Iterator it13 = ((List) obj2).iterator();
                while (true) {
                    if (it13.hasNext()) {
                        Object next4 = it13.next();
                        if (Intrinsics.f(((JuniorBankingProfile) next4).f77101g, str)) {
                            obj9 = next4;
                        }
                    }
                }
                JuniorBankingProfile juniorBankingProfile2 = (JuniorBankingProfile) obj9;
                if (juniorBankingProfile2 != null) {
                    return juniorBankingProfile2;
                }
                throw new NoSuchElementException(j6.a.q("Cannot find junior account for activation with code ", str));
            case 9:
                a6g.g update2 = (a6g.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                List fareOptions = update2.f1687a;
                Intrinsics.checkNotNullParameter(fareOptions, "fareOptions");
                return new a6g.g(fareOptions, str);
            case 10:
                NaviCommand onboardingAwareActionCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(onboardingAwareActionCommand, "onboardingAwareActionCommand");
                xi0.b.Companion.getClass();
                NaviCommand featureCommand = new FeatureCommand(new CryptoCommodityDetailsFeatureConfig(xi0.a.a(str), null, null, null, 62));
                if (!Intrinsics.f(onboardingAwareActionCommand, DummyCommand.f98635a)) {
                    featureCommand = com.revolut.retail.core.navigation.a.c(featureCommand, onboardingAwareActionCommand);
                }
                return new q06.h(new BridgeDestination(featureCommand), new q06.b(ibb.c.f160141b, null));
            case 11:
                LoanDetails loanDetails = (LoanDetails) obj2;
                Intrinsics.checkNotNullParameter(loanDetails, "it");
                String widgetId = this.f965b;
                Intrinsics.checkNotNullParameter(widgetId, "widgetId");
                Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
                boolean z4 = loanDetails.f70144a.i instanceof LoanState.Repaid;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.loan_management_widget_progress_title, null, null, 14);
                Loan loan = loanDetails.f70144a;
                double d = loan.f70116n;
                double d5 = 100;
                r1 r1Var = new r1(new q1(new PercentageClause(d * d5, new PercentageClause.Format.Custom((d == 0.0d || d == 1.0d || ((0.0d > d || d > 0.01d) && (0.99d > d || d > 1.0d))) ? 0 : 1, 14, null, null, null), (Custom) null, 4), null), new p1(new TextLocalisedClause(R$string.loan_management_widget_progress_description, null, null, 14), null));
                s1 s1Var = new s1(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_repayment, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null);
                Intrinsics.checkNotNullParameter(loanDetails, "<this>");
                double d6 = loan.f70116n;
                int i3 = d6 == 0.0d ? 0 : (0.0d > d6 || d6 > 0.01d) ? (int) (d6 * d5) : 1;
                n1 n1Var = z4 ? n1.Success : n1.Accent;
                LoanState loanState = loan.i;
                if ((loanState instanceof LoanState.Cancelled) || (loanState instanceof LoanState.Terminated) || (loanState instanceof LoanState.Repaid)) {
                    compositeClauseM = null;
                } else {
                    if (!(loanState instanceof LoanState.Forbearance) && !(loanState instanceof LoanState.Healthy) && !(loanState instanceof LoanState.Outstanding) && !(loanState instanceof LoanState.Overdue) && !(loanState instanceof LoanState.Planned)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_loan_account_final_repayment, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
                    com.revolut.core.ui_kit.models.j jVar = c7.Companion;
                    LocalDate localDate = loan.e;
                    LocalDateClause$DateFormat.INSTANCE.getClass();
                    LocalDateClause$DateFormat.DateMedium dateMedium = LocalDateClause$DateFormat.Companion.f57815b;
                    Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
                    jVar.getClass();
                    compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(textLocalisedClause2, com.revolut.core.ui_kit.models.j.a(localDate, dateMedium, custom)));
                }
                return new GoalProgressWidgetDelegate.Model(widgetId, textLocalisedClause, r1Var, new i1(i3, n1Var, compositeClauseM, null), s1Var, true, null, CaptureActivity.RESULT_EXIT_USER_FLOW);
            case 12:
                zdd.i it14 = (zdd.i) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return ydd.b.i(it14, str);
            case 13:
                List instruments = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                Iterator it15 = instruments.iterator();
                while (true) {
                    if (it15.hasNext()) {
                        Object next5 = it15.next();
                        if (Intrinsics.f(str, ((nel.n) next5).f214596b)) {
                            obj8 = next5;
                        }
                    }
                }
                nel.n nVar = (nel.n) obj8;
                if (nVar != null) {
                    return nVar;
                }
                throw new InstrumentTickerInteractor$Companion.NoTradeInstrumentException(str);
            case 14:
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                Iterator it17 = it16.iterator();
                while (true) {
                    if (it17.hasNext()) {
                        Object next6 = it17.next();
                        if (Intrinsics.f(((a0) next6).f214560a.f214596b, str)) {
                            obj7 = next6;
                        }
                    }
                }
                return (a0) obj7;
            case 15:
                List it18 = (List) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                Iterator it19 = it18.iterator();
                while (true) {
                    if (it19.hasNext()) {
                        Object next7 = it19.next();
                        if (Intrinsics.f(((InstrumentTicker) next7).f105112b, str)) {
                            obj6 = next7;
                        }
                    }
                }
                return (InstrumentTicker) obj6;
            case 16:
                TradingAccounts tradingAccounts = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(tradingAccounts, "tradingAccounts");
                List list5 = tradingAccounts.f105278a;
                ArrayList createdAccounts = new ArrayList();
                for (Object obj13 : list5) {
                    if (Intrinsics.f(((TradingAccount) obj13).getF105264c(), str)) {
                        createdAccounts.add(obj13);
                    }
                }
                List list6 = tradingAccounts.f105279b;
                ArrayList availableToOnboard = new ArrayList();
                for (Object obj14 : list6) {
                    if (Intrinsics.f(((TradingAccountAvailableToOnboard) obj14).f105267c, str)) {
                        availableToOnboard.add(obj14);
                    }
                }
                Intrinsics.checkNotNullParameter(createdAccounts, "createdAccounts");
                Intrinsics.checkNotNullParameter(availableToOnboard, "availableToOnboard");
                return new TradingAccounts(createdAccounts, availableToOnboard);
            case 17:
                TradingAccounts tradingAccounts2 = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(tradingAccounts2, "tradingAccounts");
                Iterator it20 = tradingAccounts2.f105278a.iterator();
                while (true) {
                    if (it20.hasNext()) {
                        Object next8 = it20.next();
                        if (Intrinsics.f(((TradingAccount) next8).getF105262a().toString(), str)) {
                            obj5 = next8;
                        }
                    }
                }
                od0.i.Companion.getClass();
                return od0.h.a((TradingAccount) obj5);
            case 18:
                TradingAccounts tradingAccounts3 = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(tradingAccounts3, "tradingAccounts");
                Iterator it21 = tradingAccounts3.f105278a.iterator();
                while (true) {
                    if (it21.hasNext()) {
                        Object next9 = it21.next();
                        List listJ = ((TradingAccount) next9).J();
                        if (!(listJ instanceof Collection) || !listJ.isEmpty()) {
                            Iterator it22 = listJ.iterator();
                            while (it22.hasNext()) {
                                if (Intrinsics.f(((TradingAccount.Portfolio) it22.next()).f105210a.toString(), str)) {
                                    obj4 = next9;
                                }
                            }
                        }
                    }
                }
                od0.i.Companion.getClass();
                return od0.h.a((TradingAccount) obj4);
            case 19:
                af9.f update3 = (af9.f) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                f0 f0Var = f0.f322471a;
                String str4 = update3.f3965b;
                String str5 = this.f965b;
                return af9.f.a(update3, str5, null, false, f0Var, false, af9.j.I2(str5, str4), false, 22);
            case 20:
                af9.f update4 = (af9.f) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                f0 f0Var2 = f0.f322471a;
                String str6 = update4.f3965b;
                String str7 = this.f965b;
                return af9.f.a(update4, str7, null, false, f0Var2, false, af9.j.I2(str7, str6), str7.equals(update4.f3965b), 22);
            case 21:
                af9.f update5 = (af9.f) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                String str8 = update5.f3964a;
                String str9 = this.f965b;
                boolean zI2 = af9.j.I2(str8, str9);
                if (update5.d.isEmpty() && Intrinsics.f(update5.f3964a, str9)) {
                    z = true;
                }
                return af9.f.a(update5, null, str9, false, null, false, zI2, z, 29);
            case 22:
                afa.g update6 = (afa.g) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return afa.g.a(update6, null, null, null, null, null, this.f965b, null, null, PassportService.DEFAULT_MAX_BLOCKSIZE);
            case 23:
                ah4.m update7 = (ah4.m) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return ah4.m.a(update7, null, null, null, this.f965b, 7);
            case 24:
                ahd.n update8 = (ahd.n) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return ahd.n.a(update8, null, null, this.f965b, null, 11);
            case 25:
                ahf.l update9 = (ahf.l) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                String str10 = this.f965b;
                Intrinsics.h(str10);
                return ahf.l.a(update9, null, null, str10, false, null, null, null, 0, 0, null, 2039);
            case 26:
                ai4.e update10 = (ai4.e) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return ai4.e.a(update10, false, str, 3);
            case 27:
                aj6.i update11 = (aj6.i) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                Set set = update11.f5408c;
                return aj6.i.a(update11, null, null, set.contains(str) ? a1.j(set, str) : a1.m(set, str), null, null, null, null, false, null, null, 1019);
            case 28:
                aj6.i update12 = (aj6.i) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                Set set2 = update12.d;
                return aj6.i.a(update12, null, null, null, set2.contains(str) ? a1.j(set2, str) : a1.m(set2, str), null, null, null, false, null, null, 1015);
            default:
                ajd.h updateState = (ajd.h) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return ajd.h.a(updateState, null, null, this.f965b, false, null, 27);
        }
    }

    public /* synthetic */ g(String str, int i) {
        this.f964a = i;
        this.f965b = str;
    }

    public /* synthetic */ g(String str, af9.j jVar, int i) {
        this.f964a = i;
        this.f965b = str;
    }
}
