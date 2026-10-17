package fkh;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.insurance_home.api.widget.models.ActiveInsuranceProduct;
import com.revolut.feature.profile.api.DocumentsPage;
import com.revolut.feature.profile.api.InsuranceDocumentItem;
import com.revolut.feature.robo.impl.comms.RoboSpareChangeProductArticleKey;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.cash_selector.CashHoldingsSelectorScreen;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import fmb.i0;
import fmb.p;
import fmc.y;
import ip0.a3;
import ip0.nb0;
import ip0.og;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l71.a;
import ofm.q;
import xzg.r0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135830a;

    public /* synthetic */ f(int i) {
        this.f135830a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f135830a) {
            case 0:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Optional.of(it8);
            case 1:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e.a(update, new Data(Optional.empty(), null, false, 6, null), null, null, Boolean.FALSE, 6);
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new cii.b(null, u.c(new og("ExpandableCellLoadingDelegate")), new lw0.h(lw0.i.TITLE_SUBTITLE));
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                int i = R$attr.uikit_dp8;
                List listC = u.c(new s7("ID_PAC_CODE", i, i, 0, 0, false, null, SyslogConstants.LOG_CLOCK));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            case 4:
                RowDelegate.Model it9 = (RowDelegate.Model) obj2;
                int i2 = CashHoldingsSelectorScreen.U;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj3 = it9.u;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.holding.CashHolding");
                return (kel.b) obj3;
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return fmb.u.f136305a;
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return p.f136292a;
            case 7:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 8:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.h.a(i0.f136273a);
            case 9:
                WealthAccount it10 = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return ((WealthAccount.Robo) it10).f95237c;
            case 10:
                ilc.a roboContext = (ilc.a) obj2;
                Intrinsics.checkNotNullParameter(roboContext, "roboContext");
                int i3 = y.f136367a[roboContext.ordinal()];
                if (i3 == 1) {
                    return RoboSpareChangeProductArticleKey.US;
                }
                if (i3 == 2 || i3 == 3) {
                    return RoboSpareChangeProductArticleKey.EEA;
                }
                if (i3 == 4) {
                    return RoboSpareChangeProductArticleKey.SG;
                }
                throw new NoWhenBranchMatchedException();
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new s7("ID_EXCHANGE_AMOUNT_ITEM", 0, 0, 0, 0, false, null, 126);
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listK = v.k(new a3("loading_1"), new a3("loading_2"), new a3("loading_3"));
                yp0.b.k(listK, R$attr.uikit_dp24, 0, 0, 0, 30);
                return listK;
            case 13:
                List rates = (List) obj2;
                Intrinsics.checkNotNullParameter(rates, "rates");
                List list = rates;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it11 = list.iterator();
                while (it11.hasNext()) {
                    arrayList.add(q.f0((qta.c) it11.next()));
                }
                return arrayList;
            case 14:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return Boolean.valueOf(((Boolean) pair.f186385a).booleanValue() || com.revolut.feature.freelancer.common.models.a.b((FreelancerAccountOnboardingState) pair.f186386b));
            case 15:
                l71.d it12 = (l71.d) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12.b().equals(a.t.f192490a));
            case 16:
                r0 tradingAccountsWithTradingLegalEntity = (r0) obj2;
                Intrinsics.checkNotNullParameter(tradingAccountsWithTradingLegalEntity, "tradingAccountsWithTradingLegalEntity");
                List list2 = tradingAccountsWithTradingLegalEntity.f310025a;
                ArrayList accounts = new ArrayList();
                for (Object obj4 : list2) {
                    if (((WealthAccount) obj4).Q2()) {
                        accounts.add(obj4);
                    }
                }
                TradingLegalEntityInformation tradingLegalEntityInformation = tradingAccountsWithTradingLegalEntity.f310026b;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
                return new r0(accounts, tradingLegalEntityInformation);
            case 17:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list3 = (List) pair2.f186385a;
                List list4 = (List) pair2.f186386b;
                DocumentsPage.SavingsDocumentsType savingsDocumentsType = DocumentsPage.SavingsDocumentsType.Personal;
                if (list3.isEmpty()) {
                    savingsDocumentsType = null;
                }
                DocumentsPage.SavingsDocumentsType[] elements = {savingsDocumentsType, list4.isEmpty() ? null : DocumentsPage.SavingsDocumentsType.Joint};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.L(elements);
            case 18:
                ec5.b it13 = (ec5.b) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                ec5.f fVar = it13.d;
                return Boolean.valueOf(fVar != null ? fVar.f124440a : false);
            case 19:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 20:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(!it14.isEmpty());
            case 21:
                Map it15 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return d0.d1(it15.values());
            case 22:
                List products = (List) obj2;
                Intrinsics.checkNotNullParameter(products, "products");
                List<ActiveInsuranceProduct> list5 = products;
                ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                for (ActiveInsuranceProduct activeInsuranceProduct : list5) {
                    arrayList2.add(new InsuranceDocumentItem(activeInsuranceProduct.f76155a, activeInsuranceProduct.f76156b, activeInsuranceProduct.f76157c));
                }
                return arrayList2;
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 25:
                RoboPortfolioInfo it16 = (RoboPortfolioInfo) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f95701a;
            case 26:
                RoboPortfolioInfo it17 = (RoboPortfolioInfo) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(it17.i);
            case 27:
                List instruments = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                List<qi7.h> list6 = instruments;
                ArrayList arrayList3 = new ArrayList(w.t(list6, 10));
                for (qi7.h hVar : list6) {
                    arrayList3.add(new enh.a(hVar.f246671a, hVar.f246672b));
                }
                return arrayList3;
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                nb0 nb0Var = pb0.Companion;
                List listK2 = v.k(nb0.b(nb0Var, "PLAN_PREVIEW_ITEM_ID_0", false, 0, false, 30), nb0.b(nb0Var, "PLAN_PREVIEW_ITEM_ID_1", false, 0, false, 30));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                return new fnk.k(null, null, null, listK2);
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
        }
    }

    public /* synthetic */ f(Object obj2, int i) {
        this.f135830a = i;
    }
}
