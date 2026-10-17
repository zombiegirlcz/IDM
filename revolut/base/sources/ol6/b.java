package ol6;

import com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.OpenFinanceFlow;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.OpenBankingConsentsFlow;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_facade.FacadeOpenBankingConsentsFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.LinkedAccountsConsentFlow;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListController;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$Disclaimers;
import com.revolut.retail.core.navigation.NaviCommand;
import hha.d;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import omh.g;
import oo2.n;
import yw4.p;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226340a;

    public /* synthetic */ b(int i) {
        this.f226340a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f226340a) {
            case 0:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                FacadeOpenBankingConsentsFlowContract$Step step = (FacadeOpenBankingConsentsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof FacadeOpenBankingConsentsFlowContract$Step.DefaultConsents) {
                    return new OpenBankingConsentsFlow();
                }
                if (step instanceof FacadeOpenBankingConsentsFlowContract$Step.BrazilConsents) {
                    return new OpenFinanceFlow();
                }
                if (step instanceof FacadeOpenBankingConsentsFlowContract$Step.LinkedAccountsConsent) {
                    return new LinkedAccountsConsentFlow();
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                Throwable error = (Throwable) obj2;
                d dVar = (d) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (dVar == null) {
                    return error;
                }
                return null;
            case 2:
                ((Boolean) obj2).getClass();
                return InvestOrdersListFeatureContract$Disclaimers.None.f91750a;
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 4:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 5:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 6:
                Throwable error2 = (Throwable) obj2;
                io3.d dVar2 = (io3.d) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (dVar2 == null) {
                    return error2;
                }
                return null;
            case 7:
                Throwable error3 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (bool == null) {
                    return error3;
                }
                return null;
            case 8:
                Throwable error4 = (Throwable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (bool2 == null) {
                    return error4;
                }
                return null;
            case 9:
                Throwable error5 = (Throwable) obj2;
                Boolean bool3 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (bool3 == null) {
                    return error5;
                }
                return null;
            case 10:
                Throwable error6 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list == null) {
                    return error6;
                }
                return null;
            case 11:
                Throwable error7 = (Throwable) obj2;
                Boolean bool4 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (bool4 == null) {
                    return error7;
                }
                return null;
            case 12:
                Throwable error8 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (list2 == null) {
                    return error8;
                }
                return null;
            case 13:
                Throwable error9 = (Throwable) obj2;
                Boolean bool5 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (bool5 == null) {
                    return error9;
                }
                return null;
            case 14:
                Throwable error10 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (list3 == null) {
                    return error10;
                }
                return null;
            case 15:
                Throwable error11 = (Throwable) obj2;
                p pVar = (p) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (pVar == null) {
                    return error11;
                }
                return null;
            case 16:
                Throwable th10 = (Throwable) obj2;
                if (((p) obj3) == null) {
                    return th10;
                }
                return null;
            case 17:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 18:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 19:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return yp0.b.g((List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null)), g.a(null), null, 0, 0, 126);
            case 20:
                Throwable th11 = (Throwable) obj3;
                if (((Boolean) obj2).booleanValue() && th11 == null) {
                    return null;
                }
                return Boolean.FALSE;
            case 21:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 22:
                Throwable th12 = (Throwable) obj2;
                if (((NaviCommand) obj3) == null) {
                    return th12;
                }
                return null;
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 24:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null));
            case 25:
                Function1 defaultErrorItem = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItem, "defaultErrorItem");
                return new n((List) defaultErrorItem.invoke(new iii.d(14, null, true, false, null)), null, null);
            case 26:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 27:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            default:
                String errorMessage = (String) obj2;
                String errorContext = (String) obj3;
                TripsListController.Companion aVar = TripsListController.INSTANCE;
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                Intrinsics.checkNotNullParameter(errorContext, "errorContext");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "globe_html", a0.d.s("Globe error. Context: ", errorContext, ". Msg: ", errorMessage), null, h0Var);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f226340a = i;
    }
}
