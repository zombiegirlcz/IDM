package kkf;

import aw0.o9;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.data.model.Data;
import com.revolut.feature.pay_later.api.PayLaterApi$Toggles;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import tof.s9;

/* JADX INFO: loaded from: classes8.dex */
public final class n4 extends yji.n implements elf.s0 {

    @NotNull
    public static final c4 Companion = new c4();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xh9.a f184844m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gte.a f184845n;
    public final yh9.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yh9.h f184846p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tsk.t f184847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yh9.f f184848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yh9.a f184849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ky4.e f184850t;
    public final vkm.j2 u;

    public n4(klf.h0 commonDataSource, xh9.a payLaterInteractor, gte.a featureToggleInteractor, yh9.d payLaterPlanDetailsInstalmentInfoMapper, yh9.h payLaterPlanDetailsPurchaseInfoMapper, tsk.t payLaterPlanDetailsInfoWarningMapper, yh9.f payLaterPlanDetailsPaymentHistoryMapper, yh9.a payLaterDocumentsSectionMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(payLaterPlanDetailsInstalmentInfoMapper, "payLaterPlanDetailsInstalmentInfoMapper");
        Intrinsics.checkNotNullParameter(payLaterPlanDetailsPurchaseInfoMapper, "payLaterPlanDetailsPurchaseInfoMapper");
        Intrinsics.checkNotNullParameter(payLaterPlanDetailsInfoWarningMapper, "payLaterPlanDetailsInfoWarningMapper");
        Intrinsics.checkNotNullParameter(payLaterPlanDetailsPaymentHistoryMapper, "payLaterPlanDetailsPaymentHistoryMapper");
        Intrinsics.checkNotNullParameter(payLaterDocumentsSectionMapper, "payLaterDocumentsSectionMapper");
        this.f184843l = commonDataSource;
        this.f184844m = payLaterInteractor;
        this.f184845n = featureToggleInteractor;
        this.o = payLaterPlanDetailsInstalmentInfoMapper;
        this.f184846p = payLaterPlanDetailsPurchaseInfoMapper;
        this.f184847q = payLaterPlanDetailsInfoWarningMapper;
        this.f184848r = payLaterPlanDetailsPaymentHistoryMapper;
        this.f184849s = payLaterDocumentsSectionMapper;
        this.f184850t = new ky4.e(0);
        this.u = vkm.q.c(3);
    }

    public static final List Z2(n4 n4Var, Data data, Function3 function3) {
        n4Var.getClass();
        return (List) iii.c.f(data, new kjk.x(17), new b4(0), function3);
    }

    public final cmf.p b3() {
        return new cmf.p(c3(this.f184843l, new k65.d(1, this, n4.class, "observePayLaterPlanBlockContent", "observePayLaterPlanBlockContent(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", 0, 17)), new i0(20), zhm.u.c(this), "PayLaterPlanPaymentBlockProvider_Payment");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        vkm.j2 j2Var;
        Object value;
        if (obj2 instanceof zh9.v0) {
            zh9.v0 v0Var = (zh9.v0) obj2;
            Intrinsics.checkNotNullParameter(v0Var, "<this>");
            List list = v0Var.f322357b;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(((tof.a3) it8.next()).f272581b);
            }
            A2(new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(new s9(zhm.d0.i1(arrayList)), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (tof.q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65519)));
        } else if (obj2 instanceof tof.a3) {
            A2(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(ofm.q.P((tof.a3) obj2), null, null, null, 126))));
        } else if (obj2 instanceof bi9.f) {
            A2(PayLaterKompotFeatureConfig.RepayAmountNavigationDestination.f78836b);
        } else if (obj2 instanceof ux4.d) {
            ux4.d dVar = (ux4.d) obj2;
            A2(new BridgeDestination(new FeatureCommand(new PdfViewFeatureConfiguration(dVar.d, new TextClause(dVar.f283867c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), true, false, 56))));
        } else if (Intrinsics.f(str, "PayLaterPlanDetailsInstalmentInfoMapper.SEE_ALL_INSTALMENTS_BUTTON")) {
            do {
                j2Var = this.u;
                value = j2Var.getValue();
                ((Number) value).intValue();
            } while (!j2Var.h(value, new Integer(Integer.MAX_VALUE)));
        } else {
            if (!Intrinsics.f(str, "PAY_LATER_PLAN_DETAILS_INSTALMENT_INFO_MAPPER_ERROR_STATE_ID")) {
                return Boolean.FALSE;
            }
            this.f184850t.a();
        }
        return Boolean.TRUE;
    }

    public final Flow c3(klf.h0 h0Var, Function1 function1) {
        if (!((jte.d) this.f184845n).c(PayLaterApi$Toggles.TransactionDetailsAsPlanDetails.f78807c)) {
            return new go.g(zhm.f0.f322471a, 2);
        }
        return vkm.q.Q(h0Var.h(new kjk.x(16)), new i4h.o0(3, null, function1));
    }
}
