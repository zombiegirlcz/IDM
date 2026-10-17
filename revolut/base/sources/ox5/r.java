package ox5;

import com.revolut.core.backend_flow.api.navigation.BackendFlowDestination;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.delegates.u8;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.PayToConfirmationScreen;
import com.revolut.feature.apm.upi.impl.flow.area.screen.UpiAreaScreen;
import com.revolut.feature.card_screen.api.navigation.CardListPreSelectedVariant;
import com.revolut.feature.card_screen.api.navigation.CardsListDestination;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.reissued_physical_card_dialog.ReissuedPhysicalCardDialogScreen;
import com.revolut.feature.cash_topup.impl.ui.search.CashTopUpSearchLocationScreen;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.CryptoTradeScreen;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceItemPayload;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.invoice.details.screen.InvoiceDetailsScreen;
import com.revolut.feature.junior_onboarding.api.model.OnboardingTerms;
import com.revolut.feature.rev_points.api.provider.RevPointsDisclaimerProvider$Parcel$LearnMore;
import com.revolut.feature.rev_points.models.SpareChangeCalculations;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.RevPointsSpareChangeController;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.RevPointsSpareChangeControllerContract$ModalStep;
import com.revolut.feature.trading.managed_portfolios.impl.ui.tactical_allocations.TacticalAllocationsController;
import com.revolut.feature.travel.experiences.impl.ui.screen.bookings.TravelExperiencesBookingsScreen;
import com.revolut.feature.wealth.impl.ui.screens.pocket_picker.PocketPickerScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.trading.core.domain.PocketInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.k1;
import nii.l1;
import nii.n1;
import om4.t3;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f230611w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f230611w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r((CryptoTradeScreen) this.f230611w, continuation, 0);
                rVar.v = obj2;
                return rVar;
            case 1:
                r rVar2 = new r((InvoiceDetailsScreen) this.f230611w, continuation, 1);
                rVar2.v = obj2;
                return rVar2;
            case 2:
                r rVar3 = new r((com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a) this.f230611w, continuation, 2);
                rVar3.v = obj2;
                return rVar3;
            case 3:
                r rVar4 = new r((com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a) this.f230611w, continuation, 3);
                rVar4.v = obj2;
                return rVar4;
            case 4:
                r rVar5 = new r((TravelExperiencesBookingsScreen) this.f230611w, continuation, 4);
                rVar5.v = obj2;
                return rVar5;
            case 5:
                r rVar6 = new r((aah.g) this.f230611w, continuation, 5);
                rVar6.v = obj2;
                return rVar6;
            case 6:
                r rVar7 = new r((RevPointsSpareChangeController) this.f230611w, continuation, 6);
                rVar7.v = obj2;
                return rVar7;
            case 7:
                r rVar8 = new r((p3b.l) this.f230611w, continuation, 7);
                rVar8.v = obj2;
                return rVar8;
            case 8:
                r rVar9 = new r((p4a.j) this.f230611w, continuation, 8);
                rVar9.v = obj2;
                return rVar9;
            case 9:
                r rVar10 = new r((p5e.i) this.f230611w, continuation, 9);
                rVar10.v = obj2;
                return rVar10;
            case 10:
                r rVar11 = new r((p68.i) this.f230611w, continuation, 10);
                rVar11.v = obj2;
                return rVar11;
            case 11:
                r rVar12 = new r((com.revolut.feature.payments_migration.impl.ui.screen.search.b) this.f230611w, continuation, 11);
                rVar12.v = obj2;
                return rVar12;
            case 12:
                r rVar13 = new r((p6h.c) this.f230611w, continuation, 12);
                rVar13.v = obj2;
                return rVar13;
            case 13:
                r rVar14 = new r((ReissuedPhysicalCardDialogScreen) this.f230611w, continuation, 13);
                rVar14.v = obj2;
                return rVar14;
            case 14:
                r rVar15 = new r((com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.a) this.f230611w, continuation, 14);
                rVar15.v = obj2;
                return rVar15;
            case 15:
                r rVar16 = new r((TacticalAllocationsController) this.f230611w, continuation, 15);
                rVar16.v = obj2;
                return rVar16;
            case 16:
                r rVar17 = new r((p8f.h) this.f230611w, continuation, 16);
                rVar17.v = obj2;
                return rVar17;
            case 17:
                r rVar18 = new r((p8k.j) this.f230611w, continuation, 17);
                rVar18.v = obj2;
                return rVar18;
            case 18:
                r rVar19 = new r((com.revolut.feature.junior.isa.impl.ui.jisa_details.a) this.f230611w, continuation, 18);
                rVar19.v = obj2;
                return rVar19;
            case 19:
                r rVar20 = new r((PayToConfirmationScreen) this.f230611w, continuation, 19);
                rVar20.v = obj2;
                return rVar20;
            case 20:
                r rVar21 = new r((CashTopUpSearchLocationScreen) this.f230611w, continuation, 20);
                rVar21.v = obj2;
                return rVar21;
            case 21:
                r rVar22 = new r((pc3.g) this.f230611w, continuation, 21);
                rVar22.v = obj2;
                return rVar22;
            case 22:
                r rVar23 = new r((PocketPickerScreen) this.f230611w, continuation, 22);
                rVar23.v = obj2;
                return rVar23;
            case 23:
                r rVar24 = new r((pch.h) this.f230611w, continuation, 23);
                rVar24.v = obj2;
                return rVar24;
            case 24:
                r rVar25 = new r((pd4.o) this.f230611w, continuation, 24);
                rVar25.v = obj2;
                return rVar25;
            case 25:
                r rVar26 = new r((com.revolut.feature.apm.swish.impl.ui.home.area.a) this.f230611w, continuation, 25);
                rVar26.v = obj2;
                return rVar26;
            case 26:
                r rVar27 = new r((UpiAreaScreen) this.f230611w, continuation, 26);
                rVar27.v = obj2;
                return rVar27;
            case 27:
                r rVar28 = new r((pf2.n) this.f230611w, continuation, 27);
                rVar28.v = obj2;
                return rVar28;
            case 28:
                r rVar29 = new r((pf9.e) this.f230611w, continuation, 28);
                rVar29.v = obj2;
                return rVar29;
            default:
                r rVar30 = new r((pfk.e0) this.f230611w, continuation, 29);
                rVar30.v = obj2;
                return rVar30;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((r) create((xy6.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((r) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((r) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((r) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((r) create((qla.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((r) create((OnboardingTerms) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((r) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((r) create((p73.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((r) create((m6f.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((r) create((dj0.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((r) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((r) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((r) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((r) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((r) create((rbh.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((r) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((r) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((r) create((pf2.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v64, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        Object value2;
        int i = this.u;
        int i2 = 10;
        int i3 = 26;
        int i5 = 1;
        int i6 = 0;
        int i21 = 6;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object obj3 = this.f230611w;
        switch (i) {
            case 0:
                g6 selected = (g6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarD3 = ((CryptoTradeScreen) obj3).d();
                Intrinsics.h(selected);
                com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b) nVarD3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(selected, "selected");
                bVar.n2(new osk.m(bVar, selected, objArr == true ? 1 : 0, 9), new whi.b(i21));
                bVar.H2(bVar.N, new e0(Intrinsics.f(selected.f54199a, "top_movers.tab_top_losers") ? xzg.n0.LOSERS : xzg.n0.GAINERS, 0));
                return Unit.f186387a;
            case 1:
                xy6.a itemsPerTaxRate = (xy6.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ox6.l lVarE3 = ((InvoiceDetailsScreen) obj3).d();
                Intrinsics.h(itemsPerTaxRate);
                com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar3 = (com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a) lVarE3;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(itemsPerTaxRate, "itemsPerTaxRate");
                j60.a aVar4 = aVar3.f73866p;
                xy6.c cVar = aVar3.v;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(itemsPerTaxRate, "itemsPerTaxRate");
                rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.freelancer_vat_items_with_vat, zhm.u.c(cVar.f309619a.b(itemsPerTaxRate.f309617a.f73416a)), null, 12), null, null, 30);
                ArrayList<FreelancerInvoiceItemPayload> arrayList = itemsPerTaxRate.f309618b;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                for (FreelancerInvoiceItemPayload item : arrayList) {
                    tx6.b bVar2 = cVar.f309620b;
                    Intrinsics.checkNotNullParameter(item, "item");
                    arrayList2.add(bVar2.b(item, 0, false));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                aVar4.x(new rp0.y(arrayList2, tVar, rp0.l.WINDOW, null, itemsPerTaxRate, null, "DELEGATES_KEY_CREATE_INVOICE", null, null, null, 3768));
                return Unit.f186387a;
            case 2:
                Data data = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar6 = (com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a) obj3;
                aVar6.H2(aVar6.f73872x, new m0(data, 3));
                return Unit.f186387a;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a aVar8 = (com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a) obj3;
                aVar8.H2(aVar8.f73936r, new m0(data2, 5));
                return Unit.f186387a;
            case 4:
                u8 model = (u8) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p1g.i iVarE3 = ((TravelExperiencesBookingsScreen) obj3).R2();
                Intrinsics.h(model);
                p1g.m mVar = (p1g.m) iVarE3;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                mVar.f231930q.Z2(new mcg.j(model, mVar, objArr2 == true ? 1 : 0, 8));
                return Unit.f186387a;
            case 5:
                String tabId = (String) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p26.n nVar = (p26.n) ((p26.f) ((aah.g) obj3).d);
                nVar.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                a8j.a aVar11 = nVar.d;
                qta.f duration = ((u9j.e) nVar.e).e(tabId);
                aVar11.getClass();
                Intrinsics.checkNotNullParameter(duration, "duration");
                j2 j2Var = aVar11.f2266b;
                od0.i.Companion.getClass();
                j2Var.g(null, od0.h.a(duration));
                return Unit.f186387a;
            case 6:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p2c.h hVarD3 = ((RevPointsSpareChangeController) obj3).d();
                Intrinsics.h(clickData);
                com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a aVar13 = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a) hVarD3;
                aVar13.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.d, RevPointsDisclaimerProvider$Parcel$LearnMore.f83547a)) {
                    aVar13.l2(new p2c.r(2, aVar13, objArr4 == true ? 1 : 0), new yi5.b(i3));
                } else {
                    String str = clickData.f275445a;
                    if (Intrinsics.f(str, "SPARE_CHANGE_POINTS_INFO_ITEM_ID")) {
                        SpareChangeCalculations spareChangeCalculations = (SpareChangeCalculations) ((p2c.i) ((j2) aVar13.v.f22677a).getValue()).e.getContent();
                        if (spareChangeCalculations != null) {
                            oki.h.v2(aVar13.f84187w, new RevPointsSpareChangeControllerContract$ModalStep.Breakdown(spareChangeCalculations), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                        }
                    } else if (Intrinsics.f(str, "SPARE_CHANGE_POINTS_LEARN_MORE_ITEM_ID")) {
                        if (aVar13.I2()) {
                            aVar13.l2(new p2c.r(i5, aVar13, objArr3 == true ? 1 : 0), new p2c.o(aVar13, i6));
                        } else {
                            aVar13.C1(new BridgeDestination(zh9.u0.f(new BackendFlowDestination(BackendFlowInput.Companion.a(BackendFlowInput.INSTANCE, "rev-points-spare-change-refund-sc-not-active-for-user", null, null, 6)))));
                        }
                    }
                }
                return Unit.f186387a;
            case 7:
                Data data3 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p3b.l lVar = (p3b.l) obj3;
                lVar.H2(lVar.v, new m0(data3, i2));
                return Unit.f186387a;
            case 8:
                qla.a aVar15 = (qla.a) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p4a.j jVar = (p4a.j) obj3;
                jVar.x2(new os9.t(jVar, aVar15, 25));
                return Unit.f186387a;
            case 9:
                Data data4 = (Data) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p5e.i iVar = (p5e.i) obj3;
                iVar.H2(iVar.f233110q, new p5e.h(new m0(data4, 17), iVar, i6));
                return Unit.f186387a;
            case 10:
                OnboardingTerms onboardingTerms = (OnboardingTerms) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p68.i iVar2 = (p68.i) obj3;
                iVar2.H2(iVar2.f233230p, new oxd.m(onboardingTerms, 22));
                return Unit.f186387a;
            case 11:
                Pair pair = (Pair) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments_migration.impl.ui.screen.search.b bVar3 = (com.revolut.feature.payments_migration.impl.ui.screen.search.b) obj3;
                bVar3.H2(bVar3.u, new bba.q((Data) pair.f186386b, (String) pair.f186385a, i21));
                return Unit.f186387a;
            case 12:
                Data data5 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p6h.c cVar2 = (p6h.c) obj3;
                cVar2.X2(cVar2.f233312n, new m0(data5, 19));
                return Unit.f186387a;
            case 13:
                p73.a event = (p73.a) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p73.e eVar = (p73.e) ((ReissuedPhysicalCardDialogScreen) obj3).S.getValue();
                eVar.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                if (!Intrinsics.f(event, p73.a.f233541a)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar.B2();
                return Unit.f186387a;
            case 14:
                Data data6 = (Data) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.a aVar23 = (com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.a) obj3;
                aVar23.H2(aVar23.f91375s, new m0(data6, 20));
                return Unit.f186387a;
            case 15:
                m6f.a parcel = (m6f.a) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p8f.h hVar = (p8f.h) ((p8f.f) ((TacticalAllocationsController) obj3).N.getValue());
                hVar.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                hVar.H2(hVar.f234154r, new j6f.r(parcel, 1));
                return Unit.f186387a;
            case 16:
                Data data7 = (Data) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p8f.h hVar2 = (p8f.h) obj3;
                hVar2.H2(hVar2.f234154r, new m0(data7, 21));
                return Unit.f186387a;
            case 17:
                dj0.d dVar = (dj0.d) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j2 j2Var2 = ((p8k.j) obj3).f234180w;
                do {
                    value = j2Var2.getValue();
                } while (!j2Var2.h(value, p8k.d.a((p8k.d) value, null, dVar, 1)));
                return Unit.f186387a;
            case 18:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.junior.isa.impl.ui.jisa_details.a aVar28 = (com.revolut.feature.junior.isa.impl.ui.jisa_details.a) obj3;
                aVar28.H2(aVar28.f76797s, new afg.h(11, (Data) rVar.f314201a, (Data) rVar.f314202b, (Data) rVar.f314203c));
                return Unit.f186387a;
            case 19:
                ty0.a aVar29 = (ty0.a) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b) ((PayToConfirmationScreen) obj3).d()).K2(new pb2.m(aVar29.f275445a));
                return Unit.f186387a;
            case 20:
                String query = (String) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pc3.g gVar = (pc3.g) ((CashTopUpSearchLocationScreen) obj3).Y.getValue();
                Intrinsics.h(query);
                gVar.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                gVar.x2(new t3(query, gVar));
                return Unit.f186387a;
            case 21:
                List list = (List) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pc3.g gVar2 = (pc3.g) obj3;
                Intrinsics.h(list);
                gVar2.x2(new njf.e(16, gVar2, list));
                return Unit.f186387a;
            case 22:
                rbh.f fVar = (rbh.f) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pch.h hVar3 = (pch.h) ((z9h.g) ((PocketPickerScreen) obj3).U.getValue()).f320429c.get();
                PocketInfo pocketInfo = fVar.f253068a;
                pch.b action = new pch.b(pocketInfo);
                hVar3.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                hVar3.v2(new pch.d(pocketInfo));
                return Unit.f186387a;
            case 23:
                Data data8 = (Data) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((pch.h) obj3).x2(new m0(data8, 23));
                return Unit.f186387a;
            case 24:
                n1 n1Var = (n1) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((n1Var instanceof k1) || (n1Var instanceof l1)) {
                    ((pd4.o) obj3).invoke();
                } else {
                    int i22 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 25:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var2 instanceof l1) {
                    ((com.revolut.feature.apm.swish.impl.ui.home.area.a) obj3).C1(new CardsListDestination((CardListPreSelectedVariant.Tab) null, (b93.d) null, 7));
                }
                return Unit.f186387a;
            case 26:
                pf2.a aVar37 = (pf2.a) this.v;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pf2.d dVarE3 = ((UpiAreaScreen) obj3).d();
                Intrinsics.h(aVar37);
                ((pf2.n) dVarE3).I2(aVar37);
                return Unit.f186387a;
            case 27:
                Data data9 = (Data) this.v;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pf2.n nVar2 = (pf2.n) obj3;
                nVar2.H2(nVar2.f235420s, new m0(data9, i3));
                return Unit.f186387a;
            case 28:
                Data data10 = (Data) this.v;
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j2 j2Var3 = ((pf9.e) obj3).u;
                do {
                    value2 = j2Var3.getValue();
                } while (!j2Var3.h(value2, pf9.h.a((pf9.h) value2, data10, null, null, 6)));
                return Unit.f186387a;
            default:
                String str2 = (String) this.v;
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ofk.a aVar42 = (ofk.a) wp5.y.t(ofk.a.class, ((pfk.e0) obj3).f235631b, j6.a.q("key_partner_subscriptions_", str2));
                if (aVar42 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(aVar42, "<this>");
                String website = aVar42.getWebsite();
                Integer maxSubscriptionsIncluded = aVar42.getMaxSubscriptionsIncluded();
                jo3.a maxSubscriptionsMarketValue = aVar42.getMaxSubscriptionsMarketValue();
                return new hha.e0(maxSubscriptionsMarketValue != null ? mo3.a.o(maxSubscriptionsMarketValue) : null, maxSubscriptionsIncluded, website);
        }
    }
}
