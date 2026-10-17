package ljd;

import afj.l0;
import androidx.window.core.Version;
import com.revolut.RevolutApplication;
import com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView;
import com.revolut.feature.credit.application.plugins.impl.ui.address.screen.main.CreditAddressScreen;
import com.revolut.feature.credit.autopay.ui.screen.amount.select_type.SelectAmountTypeScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_list.BenefitListScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.manage.ManagePolicyScreen;
import com.revolut.feature.pay_later.impl.ui.repaymentdetails.PayLaterRepaymentDetailsScreen;
import com.revolut.feature.payments.groups.impl.ui_new.flow.create.PaymentsGroupsCreateFlow;
import com.revolut.feature.revolutpay.impl.ui.deferred_payment.DeferredPaymentScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.pigeon.content.PigeonContentScreen;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.edit.EditCycleScreen;
import com.revolut.feature.transactions.api.TransactionApi$Toggles$EarlyReversalRedesign;
import com.revolut.feature.transfer.core.impl.ui.reason.flow_v2.ReasonForTransferFlow;
import com.revolut.feature.transport.impl.ui.hub.transit_section.TransitSectionScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreen;
import com.revolut.feature.workflow.engine.rfi.impl.ui.documents.ChooseDocumentsScreen;
import com.revolut.network.AppHeaderVersionProvider;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_porting_cancellation.EsimMobilePlanPortingCancellationScreen;
import com.revolut.trading.orders.TradingOrdersApi$Toggles;
import dw3.u0;
import ihm.j;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import jm4.n3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kr9.k;
import lk4.h;
import lk9.o;
import lkf.f0;
import lq7.g;
import lq7.l;
import m3g.r;
import m8c.q;
import oi9.n;
import ppd.b0;
import ql7.o0;
import rfm.u;
import yki.i;
import z0g.p;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f195657b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f195656a = i;
        this.f195657b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v114, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v131, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f195656a;
        Object obj2 = this.f195657b;
        switch (i) {
            case 0:
                return new DateFormatSymbols(((s80.b) ((g) obj2).f195659b).b());
            case 1:
                KProperty[] kPropertyArr = SelectAmountTypeScreen.f68614b0;
                return (h) ((n3) ((SelectAmountTypeScreen) obj2).Z.getValue()).f176220c.get();
            case 2:
                i iVar = ((com.revolut.feature.crypto.remittance.impl.ui.commonfields.flow.a) obj2).f70959q;
                if (iVar.d() == null) {
                    oki.h.D2(iVar);
                }
                return Unit.f186387a;
            case 3:
                KProperty[] kPropertyArr2 = PayLaterRepaymentDetailsScreen.f78910k0;
                return (o) ((n) ((PayLaterRepaymentDetailsScreen) obj2).f78915h0.getValue()).f225549n.get();
            case 4:
                RevolutApplication.a aVar = RevolutApplication.Companion;
                return Boolean.valueOf(((AppHeaderVersionProvider) obj2).version100ToggleEnabled());
            case 5:
                oki.h.D2(((com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a) obj2).B);
                return Unit.f186387a;
            case 6:
                KProperty[] kPropertyArr3 = EsimMobilePlanPortingCancellationScreen.U;
                return (lmj.d) ((l0) ((EsimMobilePlanPortingCancellationScreen) obj2).S.getValue()).f4326c.get();
            case 7:
                KProperty[] kPropertyArr4 = BenefitListScreen.f75512a0;
                return (ln7.g) ((ql7.g) ((BenefitListScreen) obj2).W.getValue()).f247305c.get();
            case 8:
                return Boolean.valueOf(((jte.d) ((lnf.n) obj2).f197247a).c(TransactionApi$Toggles$EarlyReversalRedesign.f91954c));
            case 9:
                return (lpd.n) ((b0) ((EditCycleScreen) obj2).f87671d0.getValue()).f238378b.get();
            case 10:
                lpi.b bVar = (lpi.b) obj2;
                j jVar = bVar.f199141m;
                od0.h hVar = od0.i.Companion;
                String str = bVar.k;
                hVar.getClass();
                jVar.onNext(od0.h.a(str));
                bVar.f199139j = null;
                bVar.k = null;
                lpi.d dVar = lpi.e.Companion;
                return Unit.f186387a;
            case 11:
                KProperty[] kPropertyArr5 = ManagePolicyScreen.c0;
                return (lq7.i) ((o0) ((ManagePolicyScreen) obj2).X.getValue()).i.get();
            case 12:
                ((l) obj2).v2(g.a.f199197a);
                return Unit.f186387a;
            case 13:
                return (lqf.a) ((lpf.d) ((ReasonForTransferFlow) obj2).P.getValue()).d.get();
            case 14:
                return Boolean.valueOf(((jte.d) ((lsl.l) obj2).f199711b).c(TradingOrdersApi$Toggles.InvestOrderDetailsRedesign.f106789c));
            case 15:
                MultiTargetFanChartView multiTargetFanChartView = (MultiTargetFanChartView) obj2;
                multiTargetFanChartView.H = true;
                multiTargetFanChartView.invalidate();
                return Unit.f186387a;
            case 16:
                return (lt9.a) ((k) ((PaymentsGroupsCreateFlow) obj2).P.getValue()).d.get();
            case 17:
                Set setC = ((lu5.d) obj2).f200025a.c(td0.a.LISTED);
                xi0.a aVar2 = xi0.b.Companion;
                ArrayList arrayList = new ArrayList(w.t(setC, 10));
                Iterator it8 = setC.iterator();
                while (it8.hasNext()) {
                    t61.a.A(aVar2, (String) it8.next(), arrayList);
                }
                return arrayList;
            case 18:
                int i2 = ChooseDocumentsScreen.U;
                return (luh.c) ((euh.h) ((muh.b) ((ChooseDocumentsScreen) obj2).R.getValue())).f129604r.get();
            case 19:
                KProperty[] kPropertyArr6 = TransitSectionScreen.f92548d0;
                return (lwf.d) ((hvf.k) ((TransitSectionScreen) obj2).X.getValue()).d.get();
            case 20:
                return ((lx2.d) obj2).f200519a.a();
            case 21:
                ((lyb.d) obj2).Z2();
                return Unit.f186387a;
            case 22:
                lk0.g gVar = (lk0.g) ((m0k.c) obj2).f201158a.f();
                if (gVar != null) {
                    u uVarG = efm.k.g(gVar);
                    Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                    return uVarG;
                }
                rfm.h hVar2 = rfm.h.f253943a;
                Intrinsics.checkNotNullExpressionValue(hVar2, "empty(...)");
                return hVar2;
            case 23:
                KProperty[] kPropertyArr7 = TravelExperiencesSearchResultsScreen.i0;
                return (r) ((p) ((TravelExperiencesSearchResultsScreen) obj2).g0.getValue()).e.get();
            case 24:
                return (oyf.b) obj2;
            case 25:
                KProperty[] kPropertyArr8 = CreditAddressScreen.c0;
                return (m44.u) ((u0) ((CreditAddressScreen) obj2).W.getValue()).f119881l.get();
            case 26:
                return Version.bigInteger_delegate$lambda$0((Version) obj2);
            case 27:
                ((com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a) obj2).C2(m6g.j.f203096a);
                return Unit.f186387a;
            case 28:
                KProperty[] kPropertyArr9 = DeferredPaymentScreen.c0;
                return (q) ((p7c.e) ((DeferredPaymentScreen) obj2).Z.getValue()).i.get();
            default:
                KProperty[] kPropertyArr10 = PigeonContentScreen.f86281k0;
                return (m8d.u) ((r7d.q) ((PigeonContentScreen) obj2).g0.getValue()).k.get();
        }
    }

    public /* synthetic */ e(lpi.b bVar, f0 f0Var) {
        this.f195656a = 10;
        this.f195657b = bVar;
    }
}
