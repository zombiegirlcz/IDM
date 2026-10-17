package lph;

import cli.y;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.crypto.challenge.impl.model.PlanReward;
import com.revolut.data.model.Data;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.auto_renewal_dialog.AutoRenewalDialogScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.date.DatePickerScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.FreelancerAcquiringOrderFiltersScreen;
import com.revolut.feature.retail.cfd.impl.screens.riskwarning.CfdRiskWarningController;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.CheckoutCustomAmountScreen;
import com.revolut.feature.transfer_reasons.impl.ui.reuse_declaration.TransferReasonsReuseDeclarationScreen;
import com.revolut.feature.transfer_reasons.impl.ui.reuse_declaration.TransferReasonsReuseDeclarationScreenContract$InputData;
import com.revolut.feature.transport.impl.ui.hub.transit_section.TransitSectionScreen;
import com.revolut.feature.transport.impl.ui.transit_checkout.TransitCheckoutScreen;
import com.revolut.feature.transport.impl.ui.transit_checkout.TransitCheckoutScreenContract$InputData;
import com.revolut.feature.transport.models.transit.TransitTicket;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.TravelFlightsPassengersDetailsScreenContract$ModalStep;
import com.revolut.feature.travel.flights.models.domain.itinerary.PassengerRequirement;
import com.revolut.feature.travel.flights.models.domain.offer_details.TravelFlightsOfferDetails;
import com.revolut.feature.travel.flights.models.domain.search.ChildPassenger;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.ScreenerAllCollectionsRedesignScreen;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.search_list.SearchListScreen;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import ip0.vd;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import lt7.m;
import ltf.l;
import lu6.n;
import m4j.k;
import qv0.p;
import ryd.w;
import vkm.j2;
import wim.z;
import yhm.o;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f199136w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f199136w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h((ScreenerAllCollectionsRedesignScreen) this.f199136w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            case 1:
                h hVar2 = new h((com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.a) this.f199136w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
            case 2:
                h hVar3 = new h((lsl.a) this.f199136w, continuation, 2);
                hVar3.v = obj2;
                return hVar3;
            case 3:
                h hVar4 = new h((m) this.f199136w, continuation, 3);
                hVar4.v = obj2;
                return hVar4;
            case 4:
                h hVar5 = new h((TransferReasonsReuseDeclarationScreen) this.f199136w, continuation, 4);
                hVar5.v = obj2;
                return hVar5;
            case 5:
                h hVar6 = new h((l) this.f199136w, continuation, 5);
                hVar6.v = obj2;
                return hVar6;
            case 6:
                h hVar7 = new h((FreelancerAcquiringOrderFiltersScreen) this.f199136w, continuation, 6);
                hVar7.v = obj2;
                return hVar7;
            case 7:
                h hVar8 = new h((com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a) this.f199136w, continuation, 7);
                hVar8.v = obj2;
                return hVar8;
            case 8:
                h hVar9 = new h((com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.b) this.f199136w, continuation, 8);
                hVar9.v = obj2;
                return hVar9;
            case 9:
                h hVar10 = new h((lw6.e) this.f199136w, continuation, 9);
                hVar10.v = obj2;
                return hVar10;
            case 10:
                h hVar11 = new h((TransitSectionScreen) this.f199136w, continuation, 10);
                hVar11.v = obj2;
                return hVar11;
            case 11:
                h hVar12 = new h((lwf.g) this.f199136w, continuation, 11);
                hVar12.v = obj2;
                return hVar12;
            case 12:
                h hVar13 = new h((CheckoutCustomAmountScreen) this.f199136w, continuation, 12);
                hVar13.v = obj2;
                return hVar13;
            case 13:
                h hVar14 = new h((ly5.j) this.f199136w, continuation, 13);
                hVar14.v = obj2;
                return hVar14;
            case 14:
                h hVar15 = new h((lyi.m) this.f199136w, continuation, 14);
                hVar15.v = obj2;
                return hVar15;
            case 15:
                h hVar16 = new h((com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.a) this.f199136w, continuation, 15);
                hVar16.v = obj2;
                return hVar16;
            case 16:
                h hVar17 = new h((com.revolut.crypto.challenge.impl.ui.screen.progress.a) this.f199136w, continuation, 16);
                hVar17.v = obj2;
                return hVar17;
            case 17:
                h hVar18 = new h((m1e.l) this.f199136w, continuation, 17);
                hVar18.v = obj2;
                return hVar18;
            case 18:
                h hVar19 = new h((m22.g) this.f199136w, continuation, 18);
                hVar19.v = obj2;
                return hVar19;
            case 19:
                h hVar20 = new h((m3h.a) this.f199136w, continuation, 19);
                hVar20.v = obj2;
                return hVar20;
            case 20:
                h hVar21 = new h((m40.h) this.f199136w, continuation, 20);
                hVar21.v = obj2;
                return hVar21;
            case 21:
                h hVar22 = new h((CfdRiskWarningController) this.f199136w, continuation, 21);
                hVar22.v = obj2;
                return hVar22;
            case 22:
                h hVar23 = new h((m4b.g) this.f199136w, continuation, 22);
                hVar23.v = obj2;
                return hVar23;
            case 23:
                h hVar24 = new h((SearchListScreen) this.f199136w, continuation, 23);
                hVar24.v = obj2;
                return hVar24;
            case 24:
                h hVar25 = new h((m50.d) this.f199136w, continuation, 24);
                hVar25.v = obj2;
                return hVar25;
            case 25:
                h hVar26 = new h((m56.f) this.f199136w, continuation, 25);
                hVar26.v = obj2;
                return hVar26;
            case 26:
                h hVar27 = new h((m66.g) this.f199136w, continuation, 26);
                hVar27.v = obj2;
                return hVar27;
            case 27:
                h hVar28 = new h((com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a) this.f199136w, continuation, 27);
                hVar28.v = obj2;
                return hVar28;
            case 28:
                h hVar29 = new h((AutoRenewalDialogScreen) this.f199136w, continuation, 28);
                hVar29.v = obj2;
                return hVar29;
            default:
                h hVar30 = new h((DatePickerScreen) this.f199136w, continuation, 29);
                hVar30.v = obj2;
                return hVar30;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((h) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((h) create((TransitTicket) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((h) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((h) create((o30.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((h) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((h) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((h) create((m73.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v85, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v89, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PlanReward planReward;
        f11.c f60118a;
        int i = this.u;
        int i2 = 16;
        int i3 = 19;
        final int i5 = 1;
        final int i6 = 0;
        int i21 = 26;
        int i22 = 27;
        Continuation continuation = null;
        Object obj3 = this.f199136w;
        switch (i) {
            case 0:
                String tabId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d dVarE3 = ((ScreenerAllCollectionsRedesignScreen) obj3).e3();
                Intrinsics.h(tabId);
                dVarE3.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                dVarE3.H2(dVarE3.f199131s, new l3d.a(tabId, i22));
                return Unit.f186387a;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.a aVar3 = (com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.a) obj3;
                aVar3.H2(aVar3.f69439q, new lnk.m(data, 4));
                return Unit.f186387a;
            case 2:
                Object obj4 = this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (Intrinsics.f(((koi.j) obj4).getF52324a(), "COMMODITY_ORDER_DETAILS_FEES")) {
                    lsl.h hVar = ((lsl.a) obj3).d;
                    Object f55000l = ((p) obj4).getF52328h();
                    hVar.c3(new lsl.j(f55000l instanceof ChargeBreakdown ? (ChargeBreakdown) f55000l : null));
                }
                return Unit.f186387a;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m mVar = (m) obj3;
                mVar.H2(mVar.f199837r, new llh.j(data2, mVar, 24));
                return Unit.f186387a;
            case 4:
                ty0.a data3 = (ty0.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ltf.i iVar = (ltf.i) ((TransferReasonsReuseDeclarationScreen) obj3).N.getValue();
                Intrinsics.h(data3);
                final l lVar = (l) iVar;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(data3, "data");
                if (Intrinsics.f(data3.f275445a, "DECLARATION_LINK_ID")) {
                    zxd.c cVar = lVar.f199872p;
                    TransferReasonsReuseDeclarationScreenContract$InputData transferReasonsReuseDeclarationScreenContract$InputData = lVar.o;
                    yji.l.a1(lVar, ue8.c.i0(byd.g.a(byd.g.c(rd0.e.b(((w) cVar).h(transferReasonsReuseDeclarationScreenContract$InputData.f92393a.f92441a, transferReasonsReuseDeclarationScreenContract$InputData.f92394b)), lVar.X(), lVar.f199874r.d(), new Function1() { // from class: ltf.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    Throwable error = (Throwable) obj5;
                                    Intrinsics.checkNotNullParameter(error, "error");
                                    l lVar2 = lVar;
                                    ServerError serverErrorA = lVar2.f199875s.a(error);
                                    if (serverErrorA == null || serverErrorA.f51362a != 9401) {
                                        return lVar2.f199874r.c(error);
                                    }
                                    return null;
                                default:
                                    vyd.a aVar7 = lVar.f199874r;
                                    StatementUrlState content = (StatementUrlState) obj5;
                                    Intrinsics.checkNotNullParameter(content, "content");
                                    if (content instanceof StatementUrlState.InPreparation) {
                                        return aVar7.b(((StatementUrlState.InPreparation) content).getEmail());
                                    }
                                    if (content instanceof StatementUrlState.Ready) {
                                        return aVar7.a();
                                    }
                                    throw new NoWhenBranchMatchedException();
                            }
                        }
                    }, new Function1() { // from class: ltf.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i5) {
                                case 0:
                                    Throwable error = (Throwable) obj5;
                                    Intrinsics.checkNotNullParameter(error, "error");
                                    l lVar2 = lVar;
                                    ServerError serverErrorA = lVar2.f199875s.a(error);
                                    if (serverErrorA == null || serverErrorA.f51362a != 9401) {
                                        return lVar2.f199874r.c(error);
                                    }
                                    return null;
                                default:
                                    vyd.a aVar7 = lVar.f199874r;
                                    StatementUrlState content = (StatementUrlState) obj5;
                                    Intrinsics.checkNotNullParameter(content, "content");
                                    if (content instanceof StatementUrlState.InPreparation) {
                                        return aVar7.b(((StatementUrlState.InPreparation) content).getEmail());
                                    }
                                    if (content instanceof StatementUrlState.Ready) {
                                        return aVar7.a();
                                    }
                                    throw new NoWhenBranchMatchedException();
                            }
                        }
                    })), lVar), null, null, new h(lVar, null, 5), 3);
                }
                return Unit.f186387a;
            case 5:
                String str = (String) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar2 = (l) obj3;
                lVar2.C1(u0.b(lVar2.f199873q.c(null, str)));
                return Unit.f186387a;
            case 6:
                String listId = (String) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                n nVarE3 = ((FreelancerAcquiringOrderFiltersScreen) obj3).R2();
                Intrinsics.h(listId);
                com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a aVar9 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a) nVarE3;
                aVar9.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("ITEM_ID_MENU_RESET")) {
                    aVar9.H2(aVar9.f73688t, new lsl.b(i2));
                }
                return Unit.f186387a;
            case 7:
                Data data4 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a aVar11 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a) obj3;
                aVar11.H2(aVar11.f73688t, new lnk.m(data4, 8));
                return Unit.f186387a;
            case 8:
                Data data5 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.b bVar = (com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.b) obj3;
                bVar.H2(bVar.u, new lnk.m(data5, 13));
                return Unit.f186387a;
            case 9:
                Data data6 = (Data) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                lw6.e eVar = (lw6.e) obj3;
                eVar.H2(eVar.f200416q, new lnk.m(data6, 14));
                return Unit.f186387a;
            case 10:
                TransitTicket ticket = (TransitTicket) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                lwf.d dVar = (lwf.d) ((TransitSectionScreen) obj3).Y.getValue();
                Intrinsics.h(ticket);
                lwf.g gVar = (lwf.g) dVar;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(ticket, "ticket");
                yji.l.g2(gVar, new TransitCheckoutScreen(new TransitCheckoutScreenContract$InputData(ticket)), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, null, 2);
                return Unit.f186387a;
            case 11:
                Data data7 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((lwf.g) obj3).x2(new lnk.m(data7, 15));
                return Unit.f186387a;
            case 12:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                lxe.f fVar = (lxe.f) ((CheckoutCustomAmountScreen) obj3).Q.getValue();
                String formattedAmount = charSequence.toString();
                com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.a aVar17 = (com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.a) fVar;
                aVar17.getClass();
                Intrinsics.checkNotNullParameter(formattedAmount, "formattedAmount");
                y yVar = aVar17.f90772r;
                xi0.b bVar2 = ((lxe.d) ((j2) yVar.f22677a).getValue()).f200559a.f115083b;
                aVar17.H2(yVar, new ar3.a(i3, new dj0.d(aVar17.f90770p.b(formattedAmount, bVar2.f306286a), bVar2)));
                return Unit.f186387a;
            case 13:
                Data data8 = (Data) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ly5.j jVar = (ly5.j) obj3;
                jVar.H2(jVar.f200703q, new lnk.m(data8, i2));
                return Unit.f186387a;
            case 14:
                Data data9 = (Data) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                lyi.m mVar2 = (lyi.m) obj3;
                mVar2.H2(mVar2.f200842r, new lul.d(data9, mVar2, 7));
                return Unit.f186387a;
            case 15:
                Data data10 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.a aVar21 = (com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.a) obj3;
                aVar21.H2(aVar21.f74052r, new lnk.m(data10, 17));
                return Unit.f186387a;
            case 16:
                Data data11 = (Data) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.crypto.challenge.impl.ui.screen.progress.a aVar23 = (com.revolut.crypto.challenge.impl.ui.screen.progress.a) obj3;
                aVar23.H2(aVar23.f60127t, new lnk.m(data11, 18));
                f11.b bVar3 = (f11.b) data11.getContent();
                if (bVar3 != null && (planReward = bVar3.f131163c) != null && (f60118a = planReward.getF60118a()) != null) {
                    aVar23.f60124q.f180076a.G(f60118a, "LAST_SHOWN_TIER_KEY", z.d(o0.b(f11.c.class)));
                }
                return Unit.f186387a;
            case 17:
                Data data12 = (Data) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m1e.l lVar3 = (m1e.l) obj3;
                lVar3.H2(lVar3.f201487r, new lnk.m(data12, i3));
                return Unit.f186387a;
            case 18:
                Data data13 = (Data) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m22.g gVar2 = (m22.g) obj3;
                gVar2.H2(gVar2.f201683p, new lnk.m(data13, 20));
                return Unit.f186387a;
            case 19:
                Data data14 = (Data) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m3h.a aVar27 = (m3h.a) obj3;
                aVar27.X2(aVar27.f202569p, new lnk.m(data14, i21));
                return Unit.f186387a;
            case 20:
                Data data15 = (Data) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m40.h hVar2 = (m40.h) obj3;
                hVar2.H2(hVar2.f202619p, new lnk.m(data15, i22));
                return Unit.f186387a;
            case 21:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m4b.g gVar3 = (m4b.g) ((m4b.c) ((CfdRiskWarningController) obj3).S.getValue());
                gVar3.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                gVar3.C1(new ExternalDestination.Browser(clickData.f275445a, null));
                return Unit.f186387a;
            case 22:
                Data data16 = (Data) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m4b.g gVar4 = (m4b.g) obj3;
                gVar4.H2(gVar4.f202690q, new lnk.m(data16, 28));
                return Unit.f186387a;
            case 23:
                String query = (String) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m4j.i iVar2 = (m4j.i) ((SearchListScreen) obj3).P.getValue();
                Intrinsics.h(query);
                k kVar = (k) iVar2;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                kVar.H2(kVar.f202743p, new lu6.p(query, 11));
                return Unit.f186387a;
            case 24:
                o30.c cVar2 = (o30.c) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((m50.d) obj3).o.set(cVar2);
                return Unit.f186387a;
            case 25:
                Data data17 = (Data) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m56.f fVar2 = (m56.f) obj3;
                fVar2.H2(fVar2.f202846r, new lnk.m(data17, 29));
                return Unit.f186387a;
            case 26:
                xi0.b bVar4 = (xi0.b) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m66.g gVar5 = (m66.g) obj3;
                gVar5.H2(gVar5.f203023q, new i5f.g(23, bVar4));
                return Unit.f186387a;
            case 27:
                Pair pair = (Pair) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Data data18 = (Data) pair.f186385a;
                Data data19 = (Data) pair.f186386b;
                com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a aVar36 = (com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a) obj3;
                y yVar2 = aVar36.D;
                TravelFlightsOfferDetails travelFlightsOfferDetails = (TravelFlightsOfferDetails) data18.getContent();
                if (travelFlightsOfferDetails != null) {
                    List<ChildPassenger> list = aVar36.o.d.f93596b;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                    for (ChildPassenger childPassenger : list) {
                        m7g.i iVar3 = m7g.j.Companion;
                        LocalDate localDate = childPassenger.f93564a;
                        LocalDate localDate2 = ((m6g.i) ((j2) yVar2.f22677a).getValue()).f203093a;
                        iVar3.getClass();
                        arrayList.add(new Pair(m7g.i.a(localDate, localDate2), childPassenger));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj5 : arrayList) {
                        m7g.j jVar2 = (m7g.j) ((Pair) obj5).f186385a;
                        if (jVar2 == m7g.j.CHILD || jVar2 == m7g.j.INFANT) {
                            arrayList2.add(obj5);
                        }
                    }
                    ArrayList arrayListF1 = d0.f1(arrayList2);
                    List list2 = travelFlightsOfferDetails.d;
                    ArrayList<PassengerRequirement> arrayList3 = new ArrayList();
                    for (Object obj6 : list2) {
                        if (((PassengerRequirement) obj6).f93513b != m7g.j.UNKNOWN) {
                            arrayList3.add(obj6);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                    for (PassengerRequirement passengerRequirement : arrayList3) {
                        Iterator it8 = arrayListF1.iterator();
                        int i32 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i32 = -1;
                            } else if (((m7g.j) ((Pair) it8.next()).f186385a) != passengerRequirement.f93513b) {
                                i32++;
                            }
                        }
                        arrayList4.add(new m6g.n(passengerRequirement.f93512a, passengerRequirement.f93513b, i32 >= 0 ? ((ChildPassenger) ((Pair) arrayListF1.remove(i32)).f186386b).f93564a : null));
                    }
                    aVar36.C = arrayList4;
                }
                aVar36.H2(yVar2, new li8.n(aVar36, data18, data19));
                Intrinsics.checkNotNullParameter(data18, "<this>");
                if (v04.b.h(data18.getError())) {
                    aVar36.f93370w.Z2(new ljd.e(aVar36, i22));
                }
                TravelFlightsOfferDetails travelFlightsOfferDetails2 = (TravelFlightsOfferDetails) data18.getContent();
                if (travelFlightsOfferDetails2 != null && travelFlightsOfferDetails2.f.contains(m7g.h.PRICE_CHANGED) && !travelFlightsOfferDetails2.equals(aVar36.z)) {
                    aVar36.z = travelFlightsOfferDetails2;
                    aVar36.A = true;
                    if (aVar36.B) {
                        aVar36.A = false;
                        oki.h.v2(aVar36.E, TravelFlightsPassengersDetailsScreenContract$ModalStep.PriceChanged.f93364a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    }
                }
                return Unit.f186387a;
            case 28:
                m73.b event = (m73.b) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m73.e eVar2 = (m73.e) ((AutoRenewalDialogScreen) obj3).S.getValue();
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                if (!Intrinsics.f(event, m73.b.f203300a)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar2.l2(new lo.c(eVar2, continuation, 21), new yi5.b(i21));
                return Unit.f186387a;
            default:
                vd vdVar = (vd) this.v;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m74.f fVar3 = (m74.f) ((DatePickerScreen) obj3).P.getValue();
                Intrinsics.h(vdVar);
                m74.c event2 = new m74.c(vdVar);
                fVar3.getClass();
                Intrinsics.checkNotNullParameter(event2, "event");
                fVar3.C2(new m74.d(vdVar.f166807b));
                return Unit.f186387a;
        }
    }
}
