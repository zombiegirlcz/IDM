package b6d;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.subaccount.impl.R$string;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.PortfolioInsightsPerformanceController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealScreenContract$ModalStep;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import ip0.pb0;
import ip0.zf0;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12707a;

    public /* synthetic */ a(int i) {
        this.f12707a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f12707a) {
            case 0:
                Throwable error = (Throwable) obj2;
                String str = (String) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (str == null) {
                    return error;
                }
                return null;
            case 1:
                Throwable error2 = (Throwable) obj2;
                String str2 = (String) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (str2 == null) {
                    return error2;
                }
                return null;
            case 2:
                Throwable error3 = (Throwable) obj2;
                String str3 = (String) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (str3 == null) {
                    return error3;
                }
                return null;
            case 3:
                Throwable error4 = (Throwable) obj2;
                String str4 = (String) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (str4 == null) {
                    return error4;
                }
                return null;
            case 4:
                Throwable error5 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list == null) {
                    return error5;
                }
                return null;
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new b73.f(f0.f322471a);
            case 6:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(6, "ManagedPortfolioPerformanceExtensionContract", true, false, null));
            case 7:
                Throwable error6 = (Throwable) obj2;
                e7l.f fVar = (e7l.f) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (fVar == null) {
                    return error6;
                }
                return null;
            case 8:
                Throwable error7 = (Throwable) obj2;
                Set set = (Set) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (set == null) {
                    return error7;
                }
                return null;
            case 9:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null));
            case 10:
                Throwable th10 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th10;
                }
                return null;
            case 11:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return (List) defaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 15:
                Throwable th11 = (Throwable) obj2;
                Function1 defaultProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultProvider, "defaultProvider");
                if (th11 != null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th11, h0Var);
                }
                return new b8e.j(null, new TextLocalisedClause(R$string.subaccounts_details_settings_header, null, null, 14), (List) defaultProvider.invoke(new iii.d(14, null, false, false, null)));
            case 16:
                Throwable error8 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (bool == null) {
                    return error8;
                }
                return null;
            case 17:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
            case 18:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PortfolioRevealScreenContract$ModalStep step = (PortfolioRevealScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof PortfolioRevealScreenContract$ModalStep.PortfolioInsight) {
                    return new PortfolioInsightsPerformanceController(((PortfolioRevealScreenContract$ModalStep.PortfolioInsight) step).f91429a);
                }
                throw new NoWhenBranchMatchedException();
            case 19:
                Intrinsics.checkNotNullParameter((OrderQuoteParams) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((OrderQuote) obj3, "<unused var>");
                return Unit.f186387a;
            case 20:
                Throwable error9 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (list2 == null) {
                    return error9;
                }
                return null;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new b9c.g(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new pb0("ERROR_AMOUNT_ITEM_EDIT_LIST_ID"), new pb0("ERROR_CASHBACK_ITEM_EDIT_LIST_ID")), false, new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_common_action_pay, null, null, 14));
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zf0.f167457a;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 27:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                m70.a.c(t0.f186434a);
                return "";
            case 28:
                Throwable error10 = (Throwable) obj2;
                String str5 = (String) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (str5 == null) {
                    return error10;
                }
                return null;
            default:
                Throwable error11 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (list3 == null) {
                    return error11;
                }
                return null;
        }
    }
}
