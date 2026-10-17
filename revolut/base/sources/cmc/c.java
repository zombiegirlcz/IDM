package cmc;

import androidx.sqlite.SQLiteConnection;
import aw0.m6;
import aw0.n6;
import cfl.f0;
import cmh.n;
import cnc.s;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.database.models.beneficiary.BeneficiaryDao_Impl;
import com.revolut.data.database.models.openbanking.ConsentsDao_Impl;
import com.revolut.data.database.models.openbanking.ExternalInstitutionsDao_Impl;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.splitbill.SplitBillRepositoryImpl;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerClient;
import com.revolut.feature.insurance_car.impl.ui.flow.policy.CarPolicyFlowContract$Step;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.api.domain.model.balance.WealthAccountsBalanceBreakdown;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.oauth.impl.ui.consent.screen.a;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import dfl.r0;
import ip0.nb0;
import ip0.pb0;
import ip0.u20;
import ip0.w20;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import k4l.c0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25196a;

    public /* synthetic */ c(int i) {
        this.f25196a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        c0 c0Var;
        Object obj3 = null;
        switch (this.f25196a) {
            case 0:
                FeatureCommand it8 = (FeatureCommand) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new i(it8);
            case 1:
                NaviCommand it9 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new i(it9);
            case 2:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return j.f25211a;
            case 4:
                NaviCommand it10 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new i(it10);
            case 5:
                NaviCommand it11 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new i(it11);
            case 6:
                r0 page = (r0) obj2;
                Intrinsics.checkNotNullParameter(page, "page");
                return Boolean.valueOf(page.f114451b > 0);
            case 7:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                od0.h hVar = od0.i.Companion;
                Iterator it13 = it12.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        Object next = it13.next();
                        if (next instanceof WealthAccount.Securities) {
                            obj3 = next;
                        }
                    }
                }
                hVar.getClass();
                return od0.h.a(obj3);
            case 8:
                Map it14 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(t1.b(it14, n.i));
            case 9:
                return ((fo3.c) ((Pair) obj2).f186385a).d;
            case 10:
                return (WealthAccountsBalanceBreakdown) ((Data) obj2).getContent();
            case 11:
                String failedUrl = (String) obj2;
                Intrinsics.checkNotNullParameter(failedUrl, "failedUrl");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "DeeplinkCoordinator", j6.a.q("processExternal: Error on deep link parsing ", failedUrl), null, h0Var);
                return Unit.f186387a;
            case 12:
                FlowStep it15 = (FlowStep) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(it15 instanceof CarPolicyFlowContract$Step.PolicySummary);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                s.Companion.getClass();
                Intrinsics.checkNotNullParameter("add-money", "listId");
                return u.c(new u20("add-money", w20.ICON_60DP));
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                s.Companion.getClass();
                Intrinsics.checkNotNullParameter("adjust-recurring-deposit", "listId");
                return u.c(new u20("adjust-recurring-deposit", w20.ICON_60DP));
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 16:
                f0.a it16 = (f0.a) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.b();
            case 17:
                alc.n it17 = (alc.n) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f6215n;
            case 18:
                List orders = (List) obj2;
                Intrinsics.checkNotNullParameter(orders, "orders");
                return m72.b.x(orders, od0.i.Companion);
            case 19:
                od0.i it18 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                PortfolioRecurringOrder portfolioRecurringOrder = (PortfolioRecurringOrder) it18.f224257a;
                return (portfolioRecurringOrder == null || (c0Var = portfolioRecurringOrder.e) == null) ? com.revolut.feature.robo.impl.ui.screen.manage_goal.a.B : c0Var;
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                nb0 nb0Var = pb0.Companion;
                List listK = v.k(nb0.a(nb0Var, "SCOPE_LOADING_1", false, 6), nb0.a(nb0Var, "SCOPE_LOADING_2", false, 6), nb0.a(nb0Var, "SCOPE_LOADING_3", false, 6), nb0.a(nb0Var, "SCOPE_LOADING_4", false, 6));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                n6.Companion.getClass();
                return new cni.n(a.b.f98494a, listK, new aw0.e(false, null, null, m6.a(), null, null, 55));
            case 21:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var2);
                return zhm.f0.f322471a;
            case 22:
                List counterparties = (List) obj2;
                Intrinsics.checkNotNullParameter(counterparties, "counterparties");
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : counterparties) {
                    if (((PaymentCounterpartyInfo) obj4).f79062c == ho9.c.ACTIVE) {
                        arrayList.add(obj4);
                    }
                }
                return arrayList;
            case 23:
                return BeneficiaryDao_Impl.lambda$deleteAll$8((SQLiteConnection) obj2);
            case 24:
                return ConsentsDao_Impl.lambda$deleteAllInactive$6((SQLiteConnection) obj2);
            case 25:
                return ConsentsDao_Impl.lambda$deleteAllActive$5((SQLiteConnection) obj2);
            case 26:
                return ExternalInstitutionsDao_Impl.lambda$deleteAll$4((SQLiteConnection) obj2);
            case 27:
                return SplitBillRepositoryImpl.getSplitBillDetailsForPayerObservableDelegate$lambda$0$0((List) obj2);
            case 28:
                return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$0$0((List) obj2);
            default:
                return APMPMWebContainerClient._init_$lambda$0((String) obj2);
        }
    }

    public /* synthetic */ c(com.revolut.oauth.impl.ui.consent.screen.b bVar) {
        this.f25196a = 20;
    }
}
