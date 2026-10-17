package ar1;

import a08.l;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import ara.i;
import ara.m;
import ara.o;
import ard.e0;
import ard.s;
import ard.y;
import au6.d0;
import au6.m2;
import au6.m3;
import au6.n0;
import au6.p1;
import au6.q2;
import au6.r1;
import au6.u1;
import au6.x1;
import au6.z1;
import auj.n;
import aw0.i3;
import aw0.w8;
import com.revolut.core.ui_kit.internal.views.navbar.ConstraintHeaderLayout;
import com.revolut.core.ui_kit.internal.views.navbar.HeaderWithBigTileLayout;
import com.revolut.core.ui_kit.internal.views.navbar.VersatileTitleView;
import com.revolut.core.ui_kit.internal.views.navbar.WallpaperView;
import com.revolut.feature.apm.bills.pagopa.impl.ui.confirmation.PagoPABillConfirmationScreenContract$InputData;
import com.revolut.feature.apm.bills.pagopa.impl.ui.flow.PagoPAFlowContract$Step;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery;
import com.revolut.feature.freelancer.common.models.payments.FreelancerPaymentReceipt;
import com.revolut.feature.payments.profile.api.navigation.PaymentProfileFeatureConfig;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionController;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_history.RewardsHubChallengeHistoryScreen;
import ip0.v7;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import lk0.g;
import lr6.w;
import pfm.h;
import wq1.j;
import wq1.k;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8499b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f8498a = i;
        this.f8499b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ZonedDateTime zonedDateTime;
        int i = this.f8498a;
        int i2 = 1;
        Continuation continuation = null;
        Object obj3 = this.f8499b;
        switch (i) {
            case 0:
                com.revolut.feature.apm.bills.pagopa.impl.ui.flow.a aVar = (com.revolut.feature.apm.bills.pagopa.impl.ui.flow.a) obj3;
                j outputData = (j) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof k) {
                    aVar.E2(new PagoPAFlowContract$Step.BillConfirmation(new PagoPABillConfirmationScreenContract$InputData(((k) outputData).f299392a)), true, null, false);
                } else if (outputData instanceof j.b) {
                    aVar.C1(new BridgeDestination(new FeatureCommand(new PaymentProfileFeatureConfig(ew9.a.QR_SCANNER))));
                } else {
                    if (!(outputData instanceof j.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.I2();
                }
                return Unit.f186387a;
            case 1:
                i update = (i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return i.a(update, null, null, (o) obj3, null, 11);
            case 2:
                return i.a((i) obj2, null, (m) obj3, null, null, 13);
            case 3:
                SelectTransactionController.Companion aVar2 = SelectTransactionController.INSTANCE;
                ((com.revolut.feature.spending_analytics.impl.ui.rev10.select.a) ((SelectTransactionController) obj3).d()).B2();
                return Unit.f186387a;
            case 4:
                ard.a update2 = (ard.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return ard.a.a(update2, null, null, false, null, null, null, null, (ZonedDateTime) obj3, 511);
            case 5:
                g pagedData = (g) obj2;
                Intrinsics.checkNotNullParameter(pagedData, "pagedData");
                h hVar = new h(new l((s) obj3, pagedData, 5), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 6:
                e dateProvider = (e) obj3;
                lk0.e upperPage = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(upperPage, "it");
                e0.Companion.getClass();
                Intrinsics.checkNotNullParameter(upperPage, "upperPage");
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                if (upperPage.e != null) {
                    return null;
                }
                y yVar = (y) upperPage.f196172b;
                ZonedDateTime zonedDateTime2 = yVar.d;
                if (zonedDateTime2 == null || (zonedDateTime = yVar.e) == null) {
                    ZonedDateTime zonedDateTime3 = yVar.f8685b;
                    ZonedDateTime zonedDateTimePlusMonths = zonedDateTime3.plusMonths(1L);
                    ZonedDateTime zonedDateTimeG = jli.b.g(((f) dateProvider).h());
                    if (zonedDateTime3.compareTo((ChronoZonedDateTime<?>) zonedDateTimeG) >= 0 || zonedDateTimePlusMonths.compareTo((ChronoZonedDateTime<?>) zonedDateTimeG) >= 0) {
                        return null;
                    }
                    return y.b(yVar, zonedDateTime3, zonedDateTimePlusMonths);
                }
                ZonedDateTime zonedDateTime4 = yVar.f8684a;
                if (zonedDateTime2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (zonedDateTime == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (zonedDateTime4.compareTo((ChronoZonedDateTime<?>) zonedDateTime2) <= 0) {
                    return null;
                }
                ZonedDateTime zonedDateTimePlusMonths2 = zonedDateTime2.plusMonths(1L);
                if (zonedDateTimePlusMonths2.compareTo((ChronoZonedDateTime<?>) zonedDateTime) >= 0) {
                    zonedDateTimePlusMonths2 = zonedDateTime;
                }
                while (zonedDateTime2.compareTo((ChronoZonedDateTime<?>) zonedDateTime4) < 0) {
                    if (zonedDateTimePlusMonths2.compareTo((ChronoZonedDateTime<?>) zonedDateTime4) >= 0) {
                        return y.b(yVar, zonedDateTime2, zonedDateTimePlusMonths2);
                    }
                    ZonedDateTime zonedDateTimePlusMonths3 = zonedDateTimePlusMonths2.plusMonths(1L);
                    if (zonedDateTimePlusMonths3.compareTo((ChronoZonedDateTime<?>) zonedDateTime) >= 0) {
                        zonedDateTimePlusMonths3 = zonedDateTime;
                    }
                    ZonedDateTime zonedDateTime5 = zonedDateTimePlusMonths2;
                    zonedDateTimePlusMonths2 = zonedDateTimePlusMonths3;
                    zonedDateTime2 = zonedDateTime5;
                }
                return null;
            case 7:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (List) ((are.b) obj3).f8691b.get("TEEN_PROFILE_CACHE_KEY");
            case 8:
                ((arh.a) obj3).f8717a.f8718a = (Bitmap) obj2;
                return Unit.f186387a;
            case 9:
                com.revolut.feature.credit.card.impl.ui.instalment.repay.future_instalments.a aVar3 = (com.revolut.feature.credit.card.impl.ui.instalment.repay.future_instalments.a) obj3;
                xs4.g output = (xs4.g) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof xs4.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar3.C2(at4.d.f8998a);
                return Unit.f186387a;
            case 10:
                return Boolean.valueOf(Intrinsics.f(((fo3.f) obj3).f136806a, (String) obj2));
            case 11:
                fo3.d dVar = (fo3.d) obj3;
                Map allWalletsWithPockets = (Map) obj2;
                Intrinsics.checkNotNullParameter(allWalletsWithPockets, "allWalletsWithPockets");
                List list = (List) allWalletsWithPockets.get(dVar);
                if (list == null && dVar == fo3.d.PERSONAL) {
                    ArrayList arrayList = new ArrayList(allWalletsWithPockets.size());
                    Iterator it9 = allWalletsWithPockets.entrySet().iterator();
                    while (it9.hasNext()) {
                        arrayList.add((fo3.d) ((Map.Entry) it9.next()).getKey());
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("PERSONAL wallet not found. Found wallets: " + arrayList);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return list == null ? f0.f322471a : list;
            case 12:
                wtl.d output2 = (wtl.d) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                ((com.revolut.trading.orders.ui.flows.investment_plan.projection.a) obj3).C2(new atl.b(output2.f300036a));
                return Unit.f186387a;
            case 13:
                ConstraintHeaderLayout constraintHeaderLayout = (ConstraintHeaderLayout) obj3;
                View it10 = (View) obj2;
                ConstraintHeaderLayout.Companion aVar4 = ConstraintHeaderLayout.INSTANCE;
                Intrinsics.checkNotNullParameter(it10, "it");
                constraintHeaderLayout.l0();
                ihm.f fVar = constraintHeaderLayout.f57243b;
                Unit unit = Unit.f186387a;
                fVar.onNext(unit);
                return unit;
            case 14:
                Configuration it11 = (Configuration) obj2;
                int i3 = HeaderWithBigTileLayout.f57263w0;
                Intrinsics.checkNotNullParameter(it11, "it");
                ((HeaderWithBigTileLayout) obj3).f0();
                return Unit.f186387a;
            case 15:
                TextView applyToTitleTextViews = (TextView) obj2;
                int i5 = VersatileTitleView.f57360l;
                Intrinsics.checkNotNullParameter(applyToTitleTextViews, "$this$applyToTitleTextViews");
                g4i.a.j(applyToTitleTextViews).a((i3) obj3);
                return Unit.f186387a;
            case 16:
                WallpaperView wallpaperView = (WallpaperView) obj3;
                w8 w8Var = (w8) obj2;
                wallpaperView.v.a(w8Var.f10591a.d, wallpaperView.k != null);
                wallpaperView.k = w8Var;
                wallpaperView.e(w8Var);
                return Unit.f186387a;
            case 17:
                com.revolut.feature.credit.card.impl.ui.repay.boleto.flow.a aVar5 = (com.revolut.feature.credit.card.impl.ui.repay.boleto.flow.a) obj3;
                zt4.d result = (zt4.d) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof zt4.c) {
                    aVar5.C2(au4.d.f9487a);
                } else {
                    if (!(result instanceof zt4.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar5.C2(au4.c.f9486a);
                }
                return Unit.f186387a;
            case 18:
                Unit it12 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (FreelancerAccountOnboardingState) ((au6.f) obj3).f9524b.get("CACHE_KEY_ACCOUNT_DETAILS");
            case 19:
                AcquiringPaymentsQuery query = (AcquiringPaymentsQuery) obj2;
                Intrinsics.checkNotNullParameter(query, "query");
                return ((d0) obj3).d(query);
            case 20:
                Unit it13 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return (List) ((n0) obj3).f9577b.get("CACHE_KEY_CURRENCY_SETTINGS");
            case 21:
                ur6.b topic = (ur6.b) obj2;
                Intrinsics.checkNotNullParameter(topic, "topic");
                return (List) ((p1) obj3).f9596b.get(p1.a(topic));
            case 22:
                Unit it14 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return (List) ((r1) obj3).f9609c.get("CACHE_KEY_BUSINESS_CATEGORIES_V2");
            case 23:
                String paymentId = (String) obj2;
                Intrinsics.checkNotNullParameter(paymentId, "paymentId");
                return (FreelancerPaymentReceipt) v7.r("MEMORY_CACHE_KEY_RECEIPT_", paymentId, ((u1) obj3).f9630b);
            case 24:
                Unit it15 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return (zr6.a) ((x1) obj3).f9657b.get("CACHE_KEY_FREELANCER_PRICING_PLAN");
            case 25:
                ir6.c it16 = (ir6.c) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return (String) ((z1) obj3).f9674a.get(it16.getId());
            case 26:
                Unit it17 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return (Boolean) ((m2) obj3).f9571b.get("CACHE_KEY_TRADING_NAME_ENABLED");
            case 27:
                Unit it18 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return (w) ((q2) obj3).f9603b.get("CACHE_KEY_SETTLEMENT_SETTINGS");
            case 28:
                Unit it19 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return (List) ((m3) obj3).f9574b.get("MEMORY_CACHE_KEY_TAX_POCKETS");
            default:
                RewardsHubChallengeHistoryScreen rewardsHubChallengeHistoryScreen = (RewardsHubChallengeHistoryScreen) obj3;
                Integer num = (Integer) obj2;
                int i6 = rewardsHubChallengeHistoryScreen.L.f98535a;
                if (num != null && num.intValue() == i6) {
                    n nVar = (n) rewardsHubChallengeHistoryScreen.R2();
                    nVar.getClass();
                    nVar.l2(new auj.m(nVar, continuation, i2), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }
}
