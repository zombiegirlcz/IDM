package ea4;

import aqd.o1;
import cli.y;
import com.revolut.core.ui_kit.delegates.u8;
import com.revolut.data.model.Data;
import com.revolut.feature.address.common.impl.flow.field_search.search.FieldSearchScreen;
import com.revolut.feature.atm.impl.ui.redesign.details.AtmDetailsBottomSheetController;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.summary.SummaryScreen;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import com.revolut.feature.donations.impl.ui.kompot.screen.overview.tab.charities.CharitiesTabScreen;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OpenBankingAuthPaymentScreen;
import com.revolut.feature.insurance.api.models.CFACClaimExpense;
import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.CFACInsuranceExpenseDetailsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.CFACInsuranceExpenseDetailsScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.review_claim.CFACInsuranceReviewClaimScreen;
import com.revolut.feature.junior_allowance.api.navigation.JuniorAllowanceDestination;
import com.revolut.feature.junior_allowance.api.navigation.JuniorAllowanceLaunchMode;
import com.revolut.feature.junior_allowance.impl.ui.screen.list.JuniorAllowancesListScreen;
import com.revolut.feature.junior_payment_links.impl.ui.screen.custom_amount.JuniorPaymentLinkCustomAmountScreen;
import com.revolut.feature.junior_savings.impl.ui.screen.savings_list.JuniorSavingsListScreen;
import com.revolut.feature.rewards.impl.ui.concierge.screen.details.ConciergeAlbertineDetailsScreen;
import com.revolut.feature.shared.invoices.impl.ui.invoice_preview.InvoicePreviewScreen;
import com.revolut.feature.shops.impl.ui.fullscreen_opt_in.ShopsPromptScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.broker_selection.BrokerSelectionScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.TravelHotelsHomeBookingsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_date_picker.TravelMilesFlightDatePickerScreen;
import com.revolut.feature.uipersonalisation.api.models.AppTheme;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.footer.PricingPlanFooterInternalContract$TermsClauseClickParcel;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_gift.PlanGiftBenefitsScreen;
import dmj.r0;
import eh9.z;
import ip0.qs;
import ip0.vd;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import skm.a2;
import tof.a3;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f124129w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f124129w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d((SummaryScreen) this.f124129w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d((u) this.f124129w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d((InvoicePreviewScreen) this.f124129w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            case 3:
                d dVar4 = new d((BrokerSelectionScreen) this.f124129w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
            case 4:
                d dVar5 = new d((TravelHotelsHomeBookingsScreen) this.f124129w, continuation, 4);
                dVar5.v = obj2;
                return dVar5;
            case 5:
                d dVar6 = new d((CharitiesTabScreen) this.f124129w, continuation, 5);
                dVar6.v = obj2;
                return dVar6;
            case 6:
                d dVar7 = new d((JuniorAllowancesListScreen) this.f124129w, continuation, 6);
                dVar7.v = obj2;
                return dVar7;
            case 7:
                d dVar8 = new d((ech.m) this.f124129w, continuation, 7);
                dVar8.v = obj2;
                return dVar8;
            case 8:
                d dVar9 = new d((TravelHotelsPriceBreakdownScreen) this.f124129w, continuation, 8);
                dVar9.v = obj2;
                return dVar9;
            case 9:
                return new d((eg2.u) this.v, (qua.p) this.f124129w, continuation, 9);
            case 10:
                d dVar10 = new d((com.revolut.feature.travel.miles.impl.ui.flow.airline_details.a) this.f124129w, continuation, 10);
                dVar10.v = obj2;
                return dVar10;
            case 11:
                d dVar11 = new d((eh1.i) this.f124129w, continuation, 11);
                dVar11.v = obj2;
                return dVar11;
            case 12:
                d dVar12 = new d((com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a) this.f124129w, continuation, 12);
                dVar12.v = obj2;
                return dVar12;
            case 13:
                d dVar13 = new d((eh8.k) this.f124129w, continuation, 13);
                dVar13.v = obj2;
                return dVar13;
            case 14:
                d dVar14 = new d((z) this.f124129w, continuation, 14);
                dVar14.v = obj2;
                return dVar14;
            case 15:
                d dVar15 = new d((TravelMilesFlightDatePickerScreen) this.f124129w, continuation, 15);
                dVar15.v = obj2;
                return dVar15;
            case 16:
                d dVar16 = new d((FieldSearchScreen) this.f124129w, continuation, 16);
                dVar16.v = obj2;
                return dVar16;
            case 17:
                d dVar17 = new d((ConciergeAlbertineDetailsScreen) this.f124129w, continuation, 17);
                dVar17.v = obj2;
                return dVar17;
            case 18:
                d dVar18 = new d((eic.t) this.f124129w, continuation, 18);
                dVar18.v = obj2;
                return dVar18;
            case 19:
                d dVar19 = new d((OpenBankingAuthPaymentScreen) this.f124129w, continuation, 19);
                dVar19.v = obj2;
                return dVar19;
            case 20:
                d dVar20 = new d((JuniorPaymentLinkCustomAmountScreen) this.f124129w, continuation, 20);
                dVar20.v = obj2;
                return dVar20;
            case 21:
                d dVar21 = new d((ShopsPromptScreen) this.f124129w, continuation, 21);
                dVar21.v = obj2;
                return dVar21;
            case 22:
                d dVar22 = new d((AtmDetailsBottomSheetController) this.f124129w, continuation, 22);
                dVar22.v = obj2;
                return dVar22;
            case 23:
                d dVar23 = new d((CFACInsuranceReviewClaimScreen) this.f124129w, continuation, 23);
                dVar23.v = obj2;
                return dVar23;
            case 24:
                d dVar24 = new d((ek7.p) this.f124129w, continuation, 24);
                dVar24.v = obj2;
                return dVar24;
            case 25:
                return new d((ekg.g) this.v, (AppTheme) this.f124129w, continuation, 25);
            case 26:
                d dVar25 = new d((BaseScrollerFlow) this.f124129w, continuation, 26);
                dVar25.v = obj2;
                return dVar25;
            case 27:
                d dVar26 = new d((PlanGiftBenefitsScreen) this.f124129w, continuation, 27);
                dVar26.v = obj2;
                return dVar26;
            case 28:
                d dVar27 = new d((emk.k) this.f124129w, continuation, 28);
                dVar27.v = obj2;
                return dVar27;
            default:
                d dVar28 = new d((JuniorSavingsListScreen) this.f124129w, continuation, 29);
                dVar28.v = obj2;
                return dVar28;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((Map) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((ead.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((d) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((d) create((qs) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((d) create((gch.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((d) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((d) create((eh8.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((d) create((eh9.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((d) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((d) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((d) create((zv0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((d) create((a3) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((d) create((fki.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v64, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v84, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v93, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        Data dataO;
        int i = this.u;
        int i2 = 9;
        int i3 = 6;
        int i5 = 12;
        int i6 = 13;
        int i21 = 1;
        Continuation continuation = null;
        Object obj3 = this.f124129w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE3 = ((SummaryScreen) obj3).R2();
                Intrinsics.h(aVar);
                ((u) rVarE3).I2(new k(aVar));
                return Unit.f186387a;
            case 1:
                Map map = (Map) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar = (u) obj3;
                uVar.H2(uVar.f124145q, new o1(map, i21));
                return Unit.f186387a;
            case 2:
                ead.j parcel = (ead.j) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ead.o oVar = (ead.o) ((InvoicePreviewScreen) obj3).O.getValue();
                oVar.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel instanceof ead.g) {
                    oVar.B2();
                } else if (parcel instanceof ead.i) {
                    oVar.H2(oVar.f124212t, new e87.e(parcel, i6));
                } else {
                    if (!(parcel instanceof ead.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i22 = ead.l.f124203a[((ead.h) parcel).f124198a.ordinal()];
                    if (i22 == 1) {
                        oVar.f124209q.a();
                    } else if (i22 == 2) {
                        oVar.f124210r.a();
                    } else {
                        if (i22 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oVar.f124211s.a();
                    }
                }
                return Unit.f186387a;
            case 3:
                String query = (String) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eaf.k kVar = (eaf.k) ((BrokerSelectionScreen) obj3).Q.getValue();
                Intrinsics.h(query);
                eaf.q qVar = (eaf.q) kVar;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                j2 j2Var = qVar.f124245r;
                do {
                    value = j2Var.getValue();
                } while (!j2Var.h(value, query));
                return Unit.f186387a;
            case 4:
                u8 model = (u8) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ebg.i iVarE3 = ((TravelHotelsHomeBookingsScreen) obj3).R2();
                Intrinsics.h(model);
                ebg.p pVar = (ebg.p) iVarE3;
                pVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                pVar.f124350r.Z2(new ah1.m(model, pVar, continuation, i2));
                return Unit.f186387a;
            case 5:
                qs qsVar = (qs) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (qsVar.i instanceof ba6.l) {
                    ec6.f fVarH3 = ((CharitiesTabScreen) obj3).T2();
                    Object obj4 = qsVar.i;
                    Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.donations.api.model.Charity");
                    ba6.l charity = (ba6.l) obj4;
                    ec6.m mVar = (ec6.m) fVarH3;
                    mVar.getClass();
                    Intrinsics.checkNotNullParameter(charity, "charity");
                    mVar.v2(new nb6.e(charity.f13938a));
                }
                return Unit.f186387a;
            case 6:
                String listId = (String) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ec8.i iVarE32 = ((JuniorAllowancesListScreen) obj3).d();
                Intrinsics.h(listId);
                com.revolut.feature.junior_allowance.impl.ui.screen.list.a aVar9 = (com.revolut.feature.junior_allowance.impl.ui.screen.list.a) iVarE32;
                aVar9.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("PLUS_NAV_BAR_MENU_ITEM_ID")) {
                    ec8.h hVar = aVar9.o;
                    aVar9.C1(new JuniorAllowanceDestination(hVar.f124465a, null, JuniorAllowanceLaunchMode.AsDestination.f76816a, hVar.f124466b));
                }
                return Unit.f186387a;
            case 7:
                gch.h hVar2 = (gch.h) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ech.m) obj3).x2(new e87.e(hVar2, 18));
                return Unit.f186387a;
            case 8:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                edg.d dVar = (edg.d) ((TravelHotelsPriceBreakdownScreen) obj3).Q.getValue();
                Intrinsics.h(clickData);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.a aVar12 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.a) dVar;
                aVar12.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj5 = clickData.d;
                if (obj5 instanceof x6c.a) {
                    aVar12.C1(new ExternalDestination.Browser(((x6c.a) obj5).f303062a, null));
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((eg2.u) this.v).C2(new eg2.j((qua.p) obj3));
                return Unit.f186387a;
            case 10:
                Data data = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.miles.impl.ui.flow.airline_details.a aVar15 = (com.revolut.feature.travel.miles.impl.ui.flow.airline_details.a) obj3;
                aVar15.H2(aVar15.f94204r, new ec6.l(data, 5));
                return Unit.f186387a;
            case 11:
                Data data2 = (Data) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eh1.i iVar = (eh1.i) obj3;
                iVar.H2(iVar.f125691s, new ec6.l(data2, i5));
                return Unit.f186387a;
            case 12:
                com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a aVar17 = (com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a) obj3;
                Pair pair = (Pair) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data3 = (Data) pair.f186385a;
                Pair pair2 = (Pair) pair.f186386b;
                Data data4 = (Data) pair2.f186385a;
                boolean zBooleanValue = ((Boolean) pair2.f186386b).booleanValue();
                if (zi0.c.E(data4) || !zi0.c.E(data3)) {
                    dataO = data3;
                } else {
                    Throwable error = data4.getError();
                    if (error == null) {
                        error = new IllegalStateException("Challenge is expected to be non null!");
                    }
                    dataO = zi0.c.O(error);
                }
                aVar17.H2(aVar17.f65822y, new r0(i21, dataO, zBooleanValue));
                if (zi0.c.E(data3) && zi0.c.E(data4)) {
                    ChecklistChallenge checklistChallenge = (ChecklistChallenge) zi0.c.I(data4);
                    try {
                        if (!aVar17.f65820w) {
                            aVar17.f65820w = true;
                            aVar17.f65818s.F(checklistChallenge);
                            break;
                        }
                    } catch (Throwable th10) {
                        if (!(th10 instanceof CancellationException)) {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                        }
                    }
                }
                return Unit.f186387a;
            case 13:
                eh8.d dVar2 = (eh8.d) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eh8.k kVar2 = (eh8.k) obj3;
                kVar2.H2(kVar2.f125763s, new e87.e(dVar2, 27));
                return Unit.f186387a;
            case 14:
                eh9.b bVar = (eh9.b) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVar = (z) obj3;
                zVar.H2(zVar.A, new e87.e(bVar, 29));
                return Unit.f186387a;
            case 15:
                vd vdVar = (vd) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ehg.f fVar = (ehg.f) ((TravelMilesFlightDatePickerScreen) obj3).P.getValue();
                LocalDate date = vdVar.f166807b;
                ehg.h hVar3 = (ehg.h) fVar;
                hVar3.getClass();
                Intrinsics.checkNotNullParameter(date, "date");
                hVar3.H2(hVar3.o, new a15.l(i3, date));
                return Unit.f186387a;
            case 16:
                String query2 = (String) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ei1.k kVarE3 = ((FieldSearchScreen) obj3).d();
                Intrinsics.h(query2);
                y yVar = kVarE3.f126352r;
                Intrinsics.checkNotNullParameter(query2, "query");
                a2 a2Var = kVarE3.f126351q;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                if (query2.length() == 0) {
                    kVarE3.H2(yVar, new efb.i(19));
                } else if (d0.W(query2)) {
                    kVarE3.H2(yVar, new e2j.i(query2, i2));
                } else {
                    kVarE3.I2(d0.F0(query2).toString());
                }
                return Unit.f186387a;
            case 17:
                ty0.a aVar23 = (ty0.a) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eic.r rVarE32 = ((ConciergeAlbertineDetailsScreen) obj3).d();
                eic.t tVar = (eic.t) rVarE32;
                tVar.I2(aVar23.d, aVar23.f275445a);
                return Unit.f186387a;
            case 18:
                Data data5 = (Data) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eic.t tVar2 = (eic.t) obj3;
                tVar2.H2(tVar2.f126486r, new ec6.l(data5, i6));
                return Unit.f186387a;
            case 19:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ej6.v vVarE3 = ((OpenBankingAuthPaymentScreen) obj3).R2();
                Intrinsics.h(clickData2);
                com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d dVar3 = (com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d) vVarE3;
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                CryptoFcaRisksDestination cryptoFcaRisksDestinationD = ((gi5.d) dVar3.B).d(clickData2);
                if (cryptoFcaRisksDestinationD != null) {
                    dVar3.C1(cryptoFcaRisksDestinationD);
                }
                return Unit.f186387a;
            case 20:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ej8.h hVarE3 = ((JuniorPaymentLinkCustomAmountScreen) obj3).d();
                String text = charSequence.toString();
                hVarE3.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                hVarE3.H2(hVarE3.f126786q, new eed.j(hVarE3, text, i6));
                return Unit.f186387a;
            case 21:
                ty0.a aVar28 = (ty0.a) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ejd.f fVar2 = (ejd.f) ((ShopsPromptScreen) obj3).Z.getValue();
                String id10 = aVar28.f275445a;
                ejd.k kVar3 = (ejd.k) fVar2;
                kVar3.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "ID_PROMOTION_STATUS_THIRD_PARTY_LEARN_MORE")) {
                    kVar3.n2(new ebg.o(kVar3, continuation, 11), new whi.b(i3));
                }
                return Unit.f186387a;
            case 22:
                zv0.b bVar2 = (zv0.b) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zv0.a aVarD = pd.b.d((AtmDetailsBottomSheetController) obj3);
                if (aVarD != null) {
                    aVarD.setExpandableModalState(bVar2);
                }
                return Unit.f186387a;
            case 23:
                a3 a3Var = (a3) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ek7.l lVarH3 = ((CFACInsuranceReviewClaimScreen) obj3).T2();
                String transactionId = a3Var.f272579a;
                ek7.p pVar2 = (ek7.p) lVarH3;
                pVar2.getClass();
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                for (CFACClaimExpense cFACClaimExpense : ((ek7.i) pVar2.t2()).f126962b) {
                    if (Intrinsics.f(cFACClaimExpense.f74926a.f272579a, transactionId)) {
                        yji.l.j2(pVar2, new CFACInsuranceExpenseDetailsScreen(new CFACInsuranceExpenseDetailsScreenContract$InputData(cFACClaimExpense.f74926a, ((ek7.i) pVar2.t2()).f126961a.d, cFACClaimExpense.f74927b, cFACClaimExpense.f74928c, Long.valueOf(cFACClaimExpense.d), Long.valueOf(cFACClaimExpense.e), cFACClaimExpense.f, cFACClaimExpense.f74929g, true)), null, new eed.j(pVar2, cFACClaimExpense, 15), 1);
                        return Unit.f186387a;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 24:
                Data data6 = (Data) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ek7.p) obj3).x2(new ec6.l(data6, 23));
                return Unit.f186387a;
            case 25:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                AppTheme appTheme = (AppTheme) obj3;
                ((ekg.g) this.v).f127160a.a(appTheme.f94561a, appTheme.f94562b, appTheme.f94563c);
                return Unit.f186387a;
            case 26:
                fki.c cVar = (fki.c) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                BaseScrollerFlow baseScrollerFlow = (BaseScrollerFlow) obj3;
                List currentList = baseScrollerFlow.P2().getCurrentList();
                List list = cVar.f135844a;
                if (Intrinsics.f(currentList, list)) {
                    baseScrollerFlow.W2(cVar);
                } else {
                    eki.m mVarP2 = baseScrollerFlow.P2();
                    List currentList2 = baseScrollerFlow.P2().getCurrentList();
                    Intrinsics.checkNotNullExpressionValue(currentList2, "getCurrentList(...)");
                    mVarP2.e(currentList2, list);
                    baseScrollerFlow.P2().submitList(list, new d0.c(baseScrollerFlow, cVar, i5));
                }
                return Unit.f186387a;
            case 27:
                ty0.a clickData3 = (ty0.a) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                emk.g gVar = (emk.g) ((PlanGiftBenefitsScreen) obj3).R.getValue();
                Intrinsics.h(clickData3);
                emk.k kVar4 = (emk.k) gVar;
                kVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData3, "clickData");
                Object obj6 = clickData3.d;
                if (obj6 instanceof PricingPlanFooterInternalContract$TermsClauseClickParcel.UrlNavigation) {
                    kVar4.l2(new emk.j(kVar4, ((PricingPlanFooterInternalContract$TermsClauseClickParcel.UrlNavigation) obj6).f103301a, continuation, i21), new yi5.b(26));
                } else if (obj6 instanceof PricingPlanFooterInternalContract$TermsClauseClickParcel.BottomSheetNavigation) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "PlanGiftBenefitsScreenModel", "Bottom sheet navigation is not supported in benefits screen", null, h0Var2);
                }
                return Unit.f186387a;
            case 28:
                Data data7 = (Data) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                emk.k kVar5 = (emk.k) obj3;
                kVar5.H2(kVar5.f127692w, new ec6.l(data7, 24));
                return Unit.f186387a;
            default:
                String id11 = (String) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                en8.h hVar4 = (en8.h) ((JuniorSavingsListScreen) obj3).S.getValue();
                Intrinsics.h(id11);
                en8.n nVar = (en8.n) hVar4;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(id11, "id");
                if (id11.equals("MENU_ADD_SAVING_ID")) {
                    nVar.J2();
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown menu id = ".concat(id11));
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var3);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f124129w = obj2;
    }
}
