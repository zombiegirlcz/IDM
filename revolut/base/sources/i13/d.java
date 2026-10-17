package i13;

import android.os.Parcelable;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.ui.impl.ui.registration.terms.uri.ApmRegistrationTermsScreen;
import com.revolut.feature.card_order_new.common.setpin.kompot.SetPinController;
import com.revolut.feature.card_order_new.common.setpin.kompot.SetPinScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.TaxHubTransactionExportFilterScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.TaxHubTransactionExportFilterScreenContract$ModalStep;
import com.revolut.feature.retail.cfd.impl.screens.review.CfdOrderReviewScreen;
import com.revolut.feature.revolutpay.impl.ui.bottom_sheet.cashback.CashbackExplainerScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.upcoming.UpcomingTransactionsScreen;
import com.revolut.feature.street_mode.payments.location.impl.R$string;
import com.revolut.feature.travel.experiences.impl.ui.screen.reviews.TravelExperiencesReviewsScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.location_picker.TravelFlightsLocationPickerScreen;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui.PriceComparisonScreen;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import ds6.d0;
import hzb.e0;
import i1e.s;
import i23.n;
import i4b.g0;
import i4b.q;
import i4h.p0;
import i4h.t;
import i6f.u;
import i6j.p;
import ip0.ja0;
import ip0.la0;
import ip0.na0;
import ip0.oa0;
import ip0.yo0;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.c0;
import nii.n1;
import nii.y0;
import vkm.j2;
import yhm.o;
import yhm.r;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f157530w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.trading.managed_portfolios.impl.ui.details.c cVar, alc.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = 17;
        this.v = cVar;
        this.f157530w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d((SetPinController) this.f157530w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d((s) this.f157530w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d((n) this.f157530w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            case 3:
                d dVar4 = new d((i26.c) this.f157530w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
            case 4:
                d dVar5 = new d((com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.b) this.f157530w, continuation, 4);
                dVar5.v = obj2;
                return dVar5;
            case 5:
                d dVar6 = new d((PriceComparisonScreen) this.f157530w, continuation, 5);
                dVar6.v = obj2;
                return dVar6;
            case 6:
                d dVar7 = new d((com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui.a) this.f157530w, continuation, 6);
                dVar7.v = obj2;
                return dVar7;
            case 7:
                d dVar8 = new d((i35.g) this.f157530w, continuation, 7);
                dVar8.v = obj2;
                return dVar8;
            case 8:
                d dVar9 = new d((TravelExperiencesReviewsScreen) this.f157530w, continuation, 8);
                dVar9.v = obj2;
                return dVar9;
            case 9:
                d dVar10 = new d((ApmRegistrationTermsScreen) this.f157530w, continuation, 9);
                dVar10.v = obj2;
                return dVar10;
            case 10:
                d dVar11 = new d((TaxHubTransactionExportFilterScreen) this.f157530w, continuation, 10);
                dVar11.v = obj2;
                return dVar11;
            case 11:
                d dVar12 = new d((com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.a) this.f157530w, continuation, 11);
                dVar12.v = obj2;
                return dVar12;
            case 12:
                d dVar13 = new d((CfdOrderReviewScreen) this.f157530w, continuation, 12);
                dVar13.v = obj2;
                return dVar13;
            case 13:
                d dVar14 = new d((i4e.b) this.f157530w, continuation, 13);
                dVar14.v = obj2;
                return dVar14;
            case 14:
                d dVar15 = new d((p0) this.f157530w, continuation, 14);
                dVar15.v = obj2;
                return dVar15;
            case 15:
                d dVar16 = new d((com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a) this.f157530w, continuation, 15);
                dVar16.v = obj2;
                return dVar16;
            case 16:
                d dVar17 = new d((i65.s) this.f157530w, continuation, 16);
                dVar17.v = obj2;
                return dVar17;
            case 17:
                return new d((com.revolut.feature.trading.managed_portfolios.impl.ui.details.c) this.v, (alc.d) this.f157530w, continuation);
            case 18:
                d dVar18 = new d((TravelFlightsLocationPickerScreen) this.f157530w, continuation, 18);
                dVar18.v = obj2;
                return dVar18;
            case 19:
                d dVar19 = new d((i79.k) this.f157530w, continuation, 19);
                dVar19.v = obj2;
                return dVar19;
            case 20:
                d dVar20 = new d((i7e.d) this.f157530w, continuation, 20);
                dVar20.v = obj2;
                return dVar20;
            case 21:
                d dVar21 = new d((i7f.g) this.f157530w, continuation, 21);
                dVar21.v = obj2;
                return dVar21;
            case 22:
                d dVar22 = new d((i7g.g) this.f157530w, continuation, 22);
                dVar22.v = obj2;
                return dVar22;
            case 23:
                d dVar23 = new d((com.revolut.feature.card_screen.impl.kompot.reactivate.b) this.f157530w, continuation, 23);
                dVar23.v = obj2;
                return dVar23;
            case 24:
                d dVar24 = new d((com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment.a) this.f157530w, continuation, 24);
                dVar24.v = obj2;
                return dVar24;
            case 25:
                d dVar25 = new d((CashbackExplainerScreen) this.f157530w, continuation, 25);
                dVar25.v = obj2;
                return dVar25;
            case 26:
                d dVar26 = new d((i8d.e) this.f157530w, continuation, 26);
                dVar26.v = obj2;
                return dVar26;
            case 27:
                d dVar27 = new d((UpcomingTransactionsScreen) this.f157530w, continuation, 27);
                dVar27.v = obj2;
                return dVar27;
            case 28:
                d dVar28 = new d((i9d.k) this.f157530w, continuation, 28);
                dVar28.v = obj2;
                return dVar28;
            default:
                d dVar29 = new d((iad.g) this.f157530w, continuation, 29);
                dVar29.v = obj2;
                return dVar29;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v80, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v88, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        int i2 = 6;
        int i3 = 3;
        int i5 = 12;
        int i6 = 4;
        int i21 = 14;
        int i22 = 15;
        int i32 = 26;
        int i33 = 0;
        int i43 = 7;
        int i59 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object obj3 = this.f157530w;
        switch (i) {
            case 0:
                String pin = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) ((SetPinController) obj3).P.getValue();
                Intrinsics.h(pin);
                com.revolut.feature.card_order_new.common.setpin.kompot.a aVar2 = (com.revolut.feature.card_order_new.common.setpin.kompot.a) hVar;
                n60.a aVar3 = aVar2.f65016p;
                y yVar = aVar2.f65020t;
                Intrinsics.checkNotNullParameter(pin, "pin");
                SetPinScreenContract$InputData setPinScreenContract$InputData = aVar2.f65019s;
                setPinScreenContract$InputData.getClass();
                if (!(setPinScreenContract$InputData instanceof SetPinScreenContract$InputData.ConfirmPin)) {
                    aVar3.R();
                    aVar2.l2(new g(aVar2, pin, objArr == true ? 1 : 0, i59), new yi5.b(i32));
                } else if (Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f157534a, pin)) {
                    aVar3.R();
                    aVar2.H2(yVar, new i0k.f(i43));
                    aVar2.C2(new j(pin));
                } else {
                    aVar2.l2(new f(aVar2, objArr2 == true ? 1 : 0, i3), new yi5.b(i32));
                }
                return Unit.f186387a;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((s) obj3).x2(new e0(data, i2));
                return Unit.f186387a;
            case 2:
                n1 n1Var = (n1) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Parcelable parcelableA = n1Var.a().a();
                StatusViewConfiguration statusViewConfiguration = parcelableA instanceof StatusViewConfiguration ? (StatusViewConfiguration) parcelableA : null;
                Parcelable f = statusViewConfiguration != null ? statusViewConfiguration.getF() : null;
                NaviCommand naviCommand = f instanceof NaviCommand ? (NaviCommand) f : null;
                if (naviCommand != null) {
                    ((n) obj3).A2(u0.b(naviCommand));
                }
                return Unit.f186387a;
            case 3:
                i26.a aVar6 = (i26.a) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h26.f fVar = (h26.f) j6.a.k(h26.f.class, ((i26.c) obj3).f157857c, aVar6.d);
                if (fVar != null) {
                    return v13.d.y(fVar);
                }
                return null;
            case 4:
                Data newData = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.b bVar = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.b) obj3;
                y yVar2 = bVar.f74195r;
                tad.a aVar9 = ((com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a) ((j2) yVar2.f22677a).getValue()).f74190a;
                aVar9.getClass();
                Intrinsics.checkNotNullParameter(newData, "newData");
                if (!aVar9.f269305a && newData.getContent() != null && !tad.a.a(newData) && newData.getLoading() && newData.getError() == null) {
                    i33 = 1;
                }
                bVar.H2(yVar2, new e0(newData, i43));
                if (i33 != 0) {
                    bVar.l2(new i27.l(bVar, objArr3 == true ? 1 : 0, i59), new yi5.b(i32));
                }
                return Unit.f186387a;
            case 5:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i2k.l lVar = (i2k.l) ((PriceComparisonScreen) obj3).P.getValue();
                Intrinsics.h(clickData);
                com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui.a aVar11 = (com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui.a) lVar;
                aVar11.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "HOW_IS_THIS_CALCULATED_DISCLAIMER_ID")) {
                    aVar11.C1(new ExternalDestination.Browser("https://www.revolut.com/money-transfer/remittances-price-comparison-disclaimer/", null));
                }
                return Unit.f186387a;
            case 6:
                Data data2 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui.a aVar13 = (com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui.a) obj3;
                aVar13.H2(aVar13.f102002r, new e0(data2, 9));
                return Unit.f186387a;
            case 7:
                Data data3 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i35.g gVar = (i35.g) obj3;
                gVar.H2(gVar.f158102q, new e0(data3, i5));
                return Unit.f186387a;
            case 8:
                la0 model = (la0) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i3g.j jVar = (i3g.j) ((TravelExperiencesReviewsScreen) obj3).P.getValue();
                Intrinsics.h(model);
                y yVar3 = jVar.f158219s;
                Intrinsics.checkNotNullParameter(model, "model");
                com.fasterxml.jackson.core.m mVar = model.f165158j;
                boolean z = mVar instanceof ja0;
                if (z && (((ja0) mVar).d instanceof na0)) {
                    jVar.H2(yVar3, new i3g.h(model, i33));
                } else if (z && (((ja0) mVar).d instanceof oa0)) {
                    jVar.H2(yVar3, new i3g.h(model, i59));
                }
                return Unit.f186387a;
            case 9:
                yo0 loadingEvent = (yo0) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i42.l lVarE3 = ((ApmRegistrationTermsScreen) obj3).e3();
                Intrinsics.h(loadingEvent);
                lVarE3.getClass();
                Intrinsics.checkNotNullParameter(loadingEvent, "loadingEvent");
                lVarE3.H2(lVarE3.f158278q, new i30.a(loadingEvent, i6));
                return Unit.f186387a;
            case 10:
                ty0.a aVar17 = (ty0.a) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i47.j jVarE3 = ((TaxHubTransactionExportFilterScreen) obj3).R2();
                String listId = aVar17.f275445a;
                com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.a aVar19 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.a) jVarE3;
                y yVar4 = aVar19.f74381r;
                com.revolut.kompot.navigable.vc.modal.a aVar20 = aVar19.f74382s;
                Intrinsics.checkNotNullParameter(listId, "listId");
                boolean zF = Intrinsics.f(listId, "LIST_ID_CATEGORY_SECTION_SEE_ALL");
                ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                if (zF) {
                    oki.h.v2(aVar20, new TaxHubTransactionExportFilterScreenContract$ModalStep.CategoryPicker(((i47.h) ((j2) yVar4.f22677a).getValue()).d, ((i47.h) ((j2) yVar4.f22677a).getValue()).f158288b), popup);
                } else if (Intrinsics.f(listId, "LIST_ID_CURRENCY_SECTION_SEE_ALL")) {
                    j2 j2Var = (j2) yVar4.f22677a;
                    j2 j2Var2 = (j2) yVar4.f22677a;
                    oki.h.v2(aVar20, new TaxHubTransactionExportFilterScreenContract$ModalStep.CurrencyPicker(((i47.h) j2Var.getValue()).e, ((i47.h) j2Var2.getValue()).f158289c, ((d0) zi0.c.I(((i47.h) j2Var2.getValue()).f158287a)).f), popup);
                }
                return Unit.f186387a;
            case 11:
                Data data4 = (Data) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.a aVar22 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.a) obj3;
                aVar22.H2(aVar22.f74381r, new e0(data4, i22));
                return Unit.f186387a;
            case 12:
                i4b.j disclaimerParcel = (i4b.j) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g0 g0Var = (g0) ((q) ((CfdOrderReviewScreen) obj3).f82275h0.getValue());
                g0Var.getClass();
                Intrinsics.checkNotNullParameter(disclaimerParcel, "disclaimerParcel");
                g0Var.n2(new i44.a(g0Var, disclaimerParcel, objArr4 == true ? 1 : 0, i59), new whi.b(i2));
                return Unit.f186387a;
            case 13:
                i4e.b bVar2 = (i4e.b) obj3;
                g4e.a aVar24 = (g4e.a) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                int i66 = i4e.a.f158417a[aVar24.ordinal()];
                if (i66 == 1) {
                    y0 y0Var = new y0(null, new c0(new TextLocalisedClause(R$string.security_hub_street_mode_location_loading_title, null, null, 14), null, null, false, null, false, false, null, 2046), false, 5);
                    bVar2.f158420n = y0Var;
                    bVar2.L2(y0Var);
                } else {
                    if (i66 != 2 && i66 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tji.l lVar2 = bVar2.f158420n;
                    if (lVar2 != null) {
                        bVar2.q2().b(lVar2);
                    }
                    bVar2.f158420n = null;
                }
                return Unit.f186387a;
            case 14:
                nel.n nVar = (nel.n) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                p0 p0Var = (p0) obj3;
                return vkm.q.Q(p0Var.f158478y.B(new i4h.q(i43)), new t(objArr5 == true ? 1 : 0, p0Var, nVar, i33));
            case 15:
                n1 result = (n1) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a aVar28 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a) obj3;
                c52.s sVar = aVar28.f62474s;
                hq1.f onFinish = new hq1.f(aVar28, 19);
                sVar.getClass();
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(onFinish, "onFinish");
                ((e52.b) sVar.f21400m).Z2(result, onFinish);
                return Unit.f186387a;
            case 16:
                ax4.b bVar3 = (ax4.b) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i65.s sVar2 = (i65.s) obj3;
                sVar2.H2(sVar2.f158875r, new ah4.f(bVar3, i43));
                return Unit.f186387a;
            case 17:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.trading.managed_portfolios.impl.ui.details.c cVar = (com.revolut.feature.trading.managed_portfolios.impl.ui.details.c) this.v;
                od0.i iVar = (od0.i) ((i6f.t) ((j2) cVar.I.f22677a).getValue()).f158969a.getContent();
                if (iVar == null || (str = (String) iVar.f224257a) == null) {
                    throw new IllegalStateException("Trying to interact with a non-existing portfolio");
                }
                cVar.C2(new u((alc.d) obj3, str));
                return Unit.f186387a;
            case 18:
                String newQuery = (String) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i6g.m mVar2 = (i6g.m) ((TravelFlightsLocationPickerScreen) obj3).R2();
                mVar2.getClass();
                Intrinsics.checkNotNullParameter(newQuery, "newQuery");
                mVar2.f159004p.setValue(newQuery);
                return Unit.f186387a;
            case 19:
                Data data5 = (Data) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Throwable error = data5.getError();
                if (error != null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                }
                i79.k kVar = (i79.k) obj3;
                kVar.H2(kVar.f159221q, new i6f.h0(data5, i5));
                return Unit.f186387a;
            case 20:
                pcd.s sVar3 = (pcd.s) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return nim.a.v(hj8.a.a(((i7e.d) obj3).e, sVar3.f, w4l.h.f294642c), new p(i6));
            case 21:
                List list = (List) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i7f.g gVar2 = (i7f.g) obj3;
                gVar2.X2(gVar2.f159288q, new i2l.e0(list, i59));
                return Unit.f186387a;
            case 22:
                Data data6 = (Data) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i7g.g gVar3 = (i7g.g) obj3;
                gVar3.H2(gVar3.f159298q, new i6f.h0(data6, 13));
                return Unit.f186387a;
            case 23:
                Data data7 = (Data) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.card_screen.impl.kompot.reactivate.b bVar4 = (com.revolut.feature.card_screen.impl.kompot.reactivate.b) obj3;
                bVar4.H2(bVar4.f65490p, new i6f.h0(data7, i21));
                return Unit.f186387a;
            case 24:
                Data data8 = (Data) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment.a aVar38 = (com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment.a) obj3;
                aVar38.H2(aVar38.u, new i6f.h0(data8, i22));
                return Unit.f186387a;
            case 25:
                Object obj4 = this.v;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i8c.k kVar2 = (i8c.k) ((i8c.j) ((CashbackExplainerScreen) obj3).S.getValue());
                kVar2.getClass();
                if (obj4 instanceof i8c.i) {
                    i8c.i iVar2 = (i8c.i) obj4;
                    if (iVar2 instanceof i8c.g) {
                        kVar2.B2();
                    } else {
                        if (!(iVar2 instanceof i8c.h)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        kVar2.C1(new ExternalDestination.Browser("https://www.revolut.com/legal/pro/", null));
                    }
                }
                return Unit.f186387a;
            case 26:
                r rVar = (r) this.v;
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i8d.e eVar = (i8d.e) obj3;
                eVar.x2(new hsa.l((List) rVar.f314201a, (Set) rVar.f314202b, eVar, (CharSequence) rVar.f314203c));
                return Unit.f186387a;
            case 27:
                String itemId = (String) this.v;
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i9d.k kVar3 = (i9d.k) ((UpcomingTransactionsScreen) obj3).f86369h0.getValue();
                Intrinsics.h(itemId);
                kVar3.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("DONE_BUTTON_ITEM_ID")) {
                    kVar3.v2(i9d.f.f159634a);
                }
                return Unit.f186387a;
            case 28:
                Data data9 = (Data) this.v;
                fim.a aVar42 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i9d.k kVar4 = (i9d.k) obj3;
                kVar4.x2(new i25.e(data9, kVar4, 8));
                return Unit.f186387a;
            default:
                Data data10 = (Data) this.v;
                fim.a aVar43 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iad.g gVar4 = (iad.g) obj3;
                gVar4.H2(gVar4.f159996r, new i6f.h0(data10, 16));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f157530w = obj2;
    }
}
