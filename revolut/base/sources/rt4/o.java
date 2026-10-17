package rt4;

import afa.w;
import android.content.Intent;
import android.net.Uri;
import aw0.f4;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.input.CreditAddressInputScreen;
import com.revolut.feature.credit.help.impl.ui.financial_difficulties.self_service.FinancialDifficultiesController;
import com.revolut.feature.cryptocommodity_invest.impl.ui.standalone_symbol.screen.StandaloneSymbolCustomisationScreen;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.plan.FreelancerCashbackPlanScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.list.InvoiceListScreen;
import com.revolut.feature.insurance_embedded.impl.data.model.l0;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.documents.InsuranceDocumentsLayoutScreen;
import com.revolut.feature.retail.beneficiary.impl.cop.ConfirmationOfPayeeScreen;
import com.revolut.feature.shared.beneficiary.common.cop.ConfirmationOfPayeeButtonAction;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$Account;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$CommodityAccount;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$InvestAccount;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$MainAccount;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$OutputData;
import com.revolut.feature.transport.impl.ui.transit_checkout.date_input.DateInputScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.visitor_information.TravelExperiencesVisitorInformationScreen;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.feature.airportlounges.api.navigation.AirportLoungesFeatureConfig;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.AirportLoungePassDetailsRefundScreen;
import com.revolut.trading.orders.ui.invest.placement.account.selector.screen.InvestAccountSelectorScreen;
import gu7.k2;
import gu7.l2;
import ip0.um0;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import m9d.w0;
import r40.n0;
import rv6.u;
import ryj.x;
import s0l.s;
import tof.a3;
import vkm.j2;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f257181w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f257181w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o((p) this.f257181w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o((InvestAccountSelectorScreen) this.f257181w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
            case 2:
                o oVar3 = new o((FreelancerCashbackPlanScreen) this.f257181w, continuation, 2);
                oVar3.v = obj2;
                return oVar3;
            case 3:
                o oVar4 = new o((u) this.f257181w, continuation, 3);
                oVar4.v = obj2;
                return oVar4;
            case 4:
                o oVar5 = new o((InsuranceDocumentsLayoutScreen) this.f257181w, continuation, 4);
                oVar5.v = obj2;
                return oVar5;
            case 5:
                o oVar6 = new o((rv7.j) this.f257181w, continuation, 5);
                oVar6.v = obj2;
                return oVar6;
            case 6:
                o oVar7 = new o((com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history.a) this.f257181w, continuation, 6);
                oVar7.v = obj2;
                return oVar7;
            case 7:
                o oVar8 = new o((rwb.h) this.f257181w, continuation, 7);
                oVar8.v = obj2;
                return oVar8;
            case 8:
                o oVar9 = new o((DateInputScreen) this.f257181w, continuation, 8);
                oVar9.v = obj2;
                return oVar9;
            case 9:
                o oVar10 = new o((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.a) this.f257181w, continuation, 9);
                oVar10.v = obj2;
                return oVar10;
            case 10:
                o oVar11 = new o((InvoiceListScreen) this.f257181w, continuation, 10);
                oVar11.v = obj2;
                return oVar11;
            case 11:
                o oVar12 = new o((StandaloneSymbolCustomisationScreen) this.f257181w, continuation, 11);
                oVar12.v = obj2;
                return oVar12;
            case 12:
                o oVar13 = new o((ry5.o) this.f257181w, continuation, 12);
                oVar13.v = obj2;
                return oVar13;
            case 13:
                o oVar14 = new o((AirportLoungePassDetailsRefundScreen) this.f257181w, continuation, 13);
                oVar14.v = obj2;
                return oVar14;
            case 14:
                o oVar15 = new o((com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a) this.f257181w, continuation, 14);
                oVar15.v = obj2;
                return oVar15;
            case 15:
                o oVar16 = new o((x) this.f257181w, continuation, 15);
                oVar16.v = obj2;
                return oVar16;
            case 16:
                o oVar17 = new o((s0d.m) this.f257181w, continuation, 16);
                oVar17.v = obj2;
                return oVar17;
            case 17:
                o oVar18 = new o((s) this.f257181w, continuation, 17);
                oVar18.v = obj2;
                return oVar18;
            case 18:
                o oVar19 = new o((FinancialDifficultiesController) this.f257181w, continuation, 18);
                oVar19.v = obj2;
                return oVar19;
            case 19:
                o oVar20 = new o((ConfirmationOfPayeeScreen) this.f257181w, continuation, 19);
                oVar20.v = obj2;
                return oVar20;
            case 20:
                o oVar21 = new o((TravelExperiencesCancellationScreen) this.f257181w, continuation, 20);
                oVar21.v = obj2;
                return oVar21;
            case 21:
                o oVar22 = new o((com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e) this.f257181w, continuation, 21);
                oVar22.v = obj2;
                return oVar22;
            case 22:
                o oVar23 = new o((s1k.j) this.f257181w, continuation, 22);
                oVar23.v = obj2;
                return oVar23;
            case 23:
                o oVar24 = new o((com.revolut.feature.localisation.ui.impl.screens.date_input.DateInputScreen) this.f257181w, continuation, 23);
                oVar24.v = obj2;
                return oVar24;
            case 24:
                o oVar25 = new o((TravelExperiencesVisitorInformationScreen) this.f257181w, continuation, 24);
                oVar25.v = obj2;
                return oVar25;
            case 25:
                o oVar26 = new o((CreditAddressInputScreen) this.f257181w, continuation, 25);
                oVar26.v = obj2;
                return oVar26;
            case 26:
                o oVar27 = new o((s44.p) this.f257181w, continuation, 26);
                oVar27.v = obj2;
                return oVar27;
            case 27:
                o oVar28 = new o((com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.a) this.f257181w, continuation, 27);
                oVar28.v = obj2;
                return oVar28;
            case 28:
                o oVar29 = new o((s4b.g) this.f257181w, continuation, 28);
                oVar29.v = obj2;
                return oVar29;
            default:
                o oVar30 = new o((s4e.i) this.f257181w, continuation, 29);
                oVar30.v = obj2;
                return oVar30;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InvestAccountSelectorContract$Account investAccountSelectorContract$CommodityAccount;
        Data data;
        int i = this.u;
        int i2 = 13;
        int i3 = 2;
        int i5 = 28;
        int i6 = 3;
        int i21 = 6;
        Object obj3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj4 = this.f257181w;
        switch (i) {
            case 0:
                Data data2 = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVar = (p) obj4;
                pVar.H2(pVar.f257186t, new rj9.i(data2, 25));
                return Unit.f186387a;
            case 1:
                rtl.n parcel = (rtl.n) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rtl.u uVar = (rtl.u) ((rtl.p) ((InvestAccountSelectorScreen) obj4).O.getValue());
                uVar.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel instanceof rtl.l) {
                    investAccountSelectorContract$CommodityAccount = new InvestAccountSelectorContract$InvestAccount(((rtl.l) parcel).f257329a);
                } else if (parcel instanceof rtl.m) {
                    investAccountSelectorContract$CommodityAccount = new InvestAccountSelectorContract$MainAccount(((rtl.m) parcel).f257330a);
                } else {
                    if (!(parcel instanceof rtl.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rtl.g gVar = (rtl.g) parcel;
                    investAccountSelectorContract$CommodityAccount = new InvestAccountSelectorContract$CommodityAccount(gVar.f257322b, gVar.f257321a);
                }
                uVar.C2(new InvestAccountSelectorContract$OutputData(investAccountSelectorContract$CommodityAccount));
                return Unit.f186387a;
            case 2:
                a3 transaction = (a3) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar2 = (u) ((FreelancerCashbackPlanScreen) obj4).d();
                uVar2.getClass();
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                uVar2.C2(new rv6.n(transaction));
                return Unit.f186387a;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar3 = (u) obj4;
                uVar3.H2(uVar3.f257718w, new rtl.s(data3, 11));
                return Unit.f186387a;
            case 4:
                String str = (String) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rv7.j jVar = (rv7.j) ((InsuranceDocumentsLayoutScreen) obj4).R.getValue();
                jVar.H2(jVar.f257732s, new n0(str, 29));
                return Unit.f186387a;
            case 5:
                Data data4 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rv7.j jVar2 = (rv7.j) obj4;
                y yVar = jVar2.f257732s;
                l0 l0Var = (l0) data4.getContent();
                l2 l2Var = l0Var != null ? l0Var.f76008c : null;
                if (l2Var != null) {
                    data = new Data(l2Var, data4.getError(), data4.getLoading());
                } else if (data4.getLoading()) {
                    data = new Data(null, data4.getError(), true, 1, null);
                } else {
                    Throwable error = data4.getError();
                    if (error == null) {
                        error = new IllegalStateException("Embedded insurance details layout documents must not be null when not loading.");
                    }
                    data = new Data(null, error, false, 5, null);
                }
                l2 l2Var2 = (l2) data.getContent();
                List list = l2Var2 != null ? l2Var2.f146785b : null;
                if (list == null) {
                    list = f0.f322471a;
                }
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (Intrinsics.f(((k2) next).f146778a, ((rv7.f) ((j2) yVar.f22677a).getValue()).f257723b)) {
                            obj3 = next;
                        }
                    }
                }
                k2 k2Var = (k2) obj3;
                if (k2Var == null) {
                    k2Var = (k2) d0.d0(list);
                }
                jVar2.H2(yVar, new rsl.p(data, k2Var, i21));
                return Unit.f186387a;
            case 6:
                Data data5 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history.a aVar8 = (com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history.a) obj4;
                aVar8.H2(aVar8.f81671t, new rtl.s(data5, 12));
                return Unit.f186387a;
            case 7:
                Data data6 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rwb.h hVar = (rwb.h) obj4;
                hVar.H2(hVar.v, new rtl.s(data6, i2));
                return Unit.f186387a;
            case 8:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rwf.i iVar2 = (rwf.i) ((rwf.g) ((DateInputScreen) obj4).O.getValue());
                iVar2.H2(iVar2.o, new a15.l(27, (LocalDate) iVar.f224257a));
                return Unit.f186387a;
            case 9:
                Pair pair = (Pair) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.a aVar12 = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.a) obj4;
                aVar12.H2(aVar12.f71578s, new w((Data) pair.f186386b, (Map) pair.f186385a, 3));
                return Unit.f186387a;
            case 10:
                String listId = (String) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rx6.o oVarE3 = ((InvoiceListScreen) obj4).d();
                Intrinsics.h(listId);
                com.revolut.feature.freelancer.impl.ui.invoice.list.a aVar14 = (com.revolut.feature.freelancer.impl.ui.invoice.list.a) oVarE3;
                aVar14.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                int iHashCode = listId.hashCode();
                if (iHashCode != -1782876750) {
                    if (iHashCode != -843400353) {
                        if (iHashCode == 207251214 && listId.equals("LIST_ID_MENU_ITEM_RECURRING")) {
                            aVar14.C1(new FreelancerBizFeatureConfig.InvoiceListDestination(com.revolut.feature.freelancer.api.navigation.c.RECURRING));
                        }
                    } else if (listId.equals("LIST_ID_MENU_ITEM_NEW_INVOICE")) {
                        aVar14.C1(new FreelancerBizFeatureConfig.NewSale(cs6.c.INVOICE, null));
                    }
                } else if (listId.equals("LIST_ID_MENU_ITEM_SETTINGS")) {
                    aVar14.C1(FreelancerBizFeatureConfig.InvoiceSettingsDestination.f73214a);
                }
                return Unit.f186387a;
            case 11:
                Pair pair2 = (Pair) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ry5.h hVarE3 = ((StandaloneSymbolCustomisationScreen) obj4).R2();
                Intrinsics.h(pair2);
                ((ry5.o) hVarE3).I2(new ry5.j(pair2));
                return Unit.f186387a;
            case 12:
                ce9.p pVar2 = (ce9.p) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ry5.o oVar = (ry5.o) obj4;
                oVar.H2(oVar.f258236p, new aff.m(pVar2, 2));
                return Unit.f186387a;
            case 13:
                ty0.a aVar17 = (ty0.a) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ryi.e eVarE3 = ((AirportLoungePassDetailsRefundScreen) obj4).d();
                String clauseId = aVar17.f275445a;
                com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a aVar19 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a) eVarE3;
                aVar19.getClass();
                Intrinsics.checkNotNullParameter(clauseId, "clauseId");
                if (Intrinsics.f(clauseId, "CLAUSE_ID_AVAILABLE_LOUNGE")) {
                    aVar19.C1(new AirportLoungesFeatureConfig.FindLoungesDestination(false));
                }
                return Unit.f186387a;
            case 14:
                Data data7 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a aVar21 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a) obj4;
                aVar21.H2(aVar21.f99146q, new rsl.p(data7, aVar21, 14));
                return Unit.f186387a;
            case 15:
                Pair[] pairArr = (Pair[]) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar = (x) obj4;
                xVar.x2(new rsl.p(xVar, pairArr, 16));
                return Unit.f186387a;
            case 16:
                Pair pair3 = (Pair) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s0d.m mVar = (s0d.m) obj4;
                mVar.H2(mVar.f258953r, new w0((Data) pair3.f186385a, (Data) pair3.f186386b, i2));
                return Unit.f186387a;
            case 17:
                dn3.d dVar = (dn3.d) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!(dVar instanceof dn3.a) && !(dVar instanceof dn3.c)) {
                    if (!(dVar instanceof dn3.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s sVar = (s) obj4;
                    sVar.x2(new rsl.p(sVar, dVar, 26));
                }
                return Unit.f186387a;
            case 18:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s15.e eVarE32 = ((FinancialDifficultiesController) obj4).d();
                Intrinsics.h(clickData);
                s15.l lVar = (s15.l) eVarE32;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                String str2 = clickData.f275445a;
                Continuation continuation = null;
                if (a0.H(str2, "tel:", false)) {
                    lVar.C1(new ExternalDestination.ByIntent(new Intent("android.intent.action.DIAL", Uri.parse(str2)), null));
                } else if (str2.contentEquals("ID_CLICK_CONTACT_US")) {
                    lVar.I2();
                } else if (a0.H(str2, "https://", false) || a0.H(str2, "http://", false)) {
                    lVar.C1(new ExternalDestination.ByIntent(new Intent("android.intent.action.VIEW", Uri.parse(str2)), null));
                } else {
                    lVar.n2(new rhl.b(lVar, clickData, str2, continuation, 11), new whi.b(i21));
                }
                return Unit.f186387a;
            case 19:
                ConfirmationOfPayeeButtonAction action = (ConfirmationOfPayeeButtonAction) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s1b.c cVar = (s1b.c) ((s1b.d) ((ConfirmationOfPayeeScreen) obj4).S.getValue());
                cVar.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                if (action instanceof ConfirmationOfPayeeButtonAction.EditInfo) {
                    cVar.C2(f6d.a.f132415a);
                } else if (action instanceof ConfirmationOfPayeeButtonAction.KeepInfo) {
                    cVar.C2(f6d.b.f132416a);
                } else {
                    if (!(action instanceof ConfirmationOfPayeeButtonAction.ReplaceName)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.C2(new f6d.c(((ConfirmationOfPayeeButtonAction.ReplaceName) action).f86057a));
                }
                return Unit.f186387a;
            case 20:
                um0 model = (um0) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s1g.h hVarI3 = ((TravelExperiencesCancellationScreen) obj4).T2();
                Intrinsics.h(model);
                com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e eVar = (com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e) hVarI3;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                j60.a.v(eVar.f93039p, false, null, 3);
                eVar.l2(new s09.c(eVar, model, objArr == true ? 1 : 0, i3), new ryd.i(eVar, 9));
                return Unit.f186387a;
            case 21:
                Data data8 = (Data) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e) obj4).x2(new rtl.s(data8, 18));
                return Unit.f186387a;
            case 22:
                Pair pair4 = (Pair) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s1k.j jVar3 = (s1k.j) obj4;
                jVar3.x2(new w0(jVar3, (Data) pair4.f186385a, (Data) pair4.f186386b));
                return Unit.f186387a;
            case 23:
                od0.i iVar3 = (od0.i) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s39.f fVar = (s39.f) ((com.revolut.feature.localisation.ui.impl.screens.date_input.DateInputScreen) obj4).O.getValue();
                fVar.H2(fVar.o, new a15.l(i5, (LocalDate) iVar3.f224257a));
                return Unit.f186387a;
            case 24:
                f4 focusData = (f4) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s3g.f fVar2 = (s3g.f) ((TravelExperiencesVisitorInformationScreen) obj4).f93172b0.getValue();
                Intrinsics.h(focusData);
                s3g.h hVar2 = (s3g.h) fVar2;
                hVar2.getClass();
                Intrinsics.checkNotNullParameter(focusData, "focusData");
                hVar2.x2(new s31.a(hVar2, focusData, i6));
                return Unit.f186387a;
            case 25:
                ty0.a data9 = (ty0.a) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s44.l lVarE3 = ((CreditAddressInputScreen) obj4).d();
                Intrinsics.h(data9);
                s44.p pVar3 = (s44.p) lVarE3;
                pVar3.getClass();
                Intrinsics.checkNotNullParameter(data9, "data");
                if (Intrinsics.f(data9.f275445a, "id_verify_address")) {
                    pVar3.n2(new rbh.k(pVar3, objArr2 == true ? 1 : 0, i5), new whi.b(i21));
                }
                return Unit.f186387a;
            case 26:
                Data data10 = (Data) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s44.p pVar4 = (s44.p) obj4;
                pVar4.H2(pVar4.f259769t, new rtl.s(data10, 21));
                return Unit.f186387a;
            case 27:
                Pair pair5 = (Pair) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.a aVar35 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.a) obj4;
                aVar35.H2(aVar35.f74434s, new w0((Data) pair5.f186385a, (Data) pair5.f186386b, 15));
                return Unit.f186387a;
            case 28:
                Data data11 = (Data) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s4b.g gVar2 = (s4b.g) obj4;
                gVar2.H2(gVar2.f259808q, new rtl.s(data11, 22));
                return Unit.f186387a;
            default:
                Data data12 = (Data) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s4e.i iVar4 = (s4e.i) obj4;
                iVar4.X2(iVar4.f259842n, new rtl.s(data12, 23));
                return Unit.f186387a;
        }
    }
}
