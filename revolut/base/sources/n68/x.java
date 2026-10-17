package n68;

import chc.b0;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.data.model.Data;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import com.revolut.feature.rewards.impl.data.network.services.RentAndBillsService;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.analytics.tracking.impl.AnalyticsFeatureToggles;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.interactor.terms.PricingPlanTerms;
import efm.h0;
import hfg.j0;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import no.g1;
import pfm.z;
import skm.e0;
import skm.g0;
import vkm.j2;
import vkm.z1;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f212744w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f212744w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x((com.revolut.feature.junior.account_activation.impl.ui.screen.request.c) this.f212744w, continuation, 0);
            case 1:
                return new x((com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation.b) this.f212744w, continuation, 1);
            case 2:
                return new x((com.revolut.feature.subaccount.impl.ui.add_money.flow.b) this.f212744w, continuation, 2);
            case 3:
                return new x((com.revolut.feature.credit.application.plugins.impl.ui.credit_post_activation_waiting.a) this.f212744w, continuation, 3);
            case 4:
                return new x((n9e.i) this.f212744w, continuation, 4);
            case 5:
                return new x((com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a) this.f212744w, continuation, 5);
            case 6:
                return new x((com.revolut.feature.donations.impl.ui.kompot.flow.overview.b) this.f212744w, continuation, 6);
            case 7:
                return new x((nbk.b) this.f212744w, continuation, 7);
            case 8:
                return new x((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a) this.f212744w, continuation, 8);
            case 9:
                return new x((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c) this.f212744w, continuation, 9);
            case 10:
                return new x((com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c) this.f212744w, continuation, 10);
            case 11:
                return new x((com.revolut.feature.credit.application.plugins.impl.ui.plan_selection.a) this.f212744w, continuation, 11);
            case 12:
                return new x((nhc.i) this.f212744w, continuation, 12);
            case 13:
                return new x((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f) this.f212744w, continuation, 13);
            case 14:
                return new x((nig.g) this.f212744w, continuation, 14);
            case 15:
                return new x((ArrayList) this.f212744w, continuation, 15);
            case 16:
                return new x((g0) this.f212744w, continuation, 16);
            case 17:
                return new x((njd.f) this.f212744w, continuation, 17);
            case 18:
                return new x((h0) this.f212744w, continuation, 18);
            case 19:
                return new x((efm.f) this.f212744w, continuation, 19);
            case 20:
                return new x((EsimMobilePlanCheckoutScreen) this.f212744w, continuation, 20);
            case 21:
                return new x((nk2.d) this.f212744w, continuation, 21);
            case 22:
                return new x((nk9.o) this.f212744w, continuation, 22);
            case 23:
                return new x((nm9.m) this.f212744w, continuation, 23);
            case 24:
                return new x((nnk.h) this.f212744w, continuation, 24);
            case 25:
                return new x((g1) this.f212744w, continuation, 25);
            case 26:
                return new x((com.revolut.analytics.tracking.v3.l) this.f212744w, continuation, 26);
            case 27:
                return new x((com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.b) this.f212744w, continuation, 27);
            case 28:
                return new x((com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.a) this.f212744w, continuation, 28);
            default:
                return new x((nsl.i) this.f212744w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((x) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        Object objB2;
        Object linkedPayments;
        Object objM;
        Object objB3;
        Object objA;
        int i = this.u;
        int i2 = 7;
        int i3 = 9;
        int i5 = 12;
        int i6 = 0;
        int i21 = 15;
        int i22 = 13;
        Continuation continuation = null;
        Object obj3 = this.f212744w;
        int i32 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.junior.account_activation.impl.ui.screen.request.c cVar = (com.revolut.feature.junior.account_activation.impl.ui.screen.request.c) obj3;
                    com.revolut.feature.junior.account_activation.impl.ui.screen.request.b bVar = new com.revolut.feature.junior.account_activation.impl.ui.screen.request.b(cVar, null);
                    this.v = 1;
                    if (cVar.p2(this, bVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation.b bVar2 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation.b) obj3;
                    com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation.a aVar3 = new com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation.a(bVar2, null);
                    this.v = 1;
                    if (bVar2.p2(this, aVar3) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.subaccount.impl.ui.add_money.flow.b bVar3 = (com.revolut.feature.subaccount.impl.ui.add_money.flow.b) obj3;
                    com.revolut.feature.subaccount.impl.ui.add_money.flow.a aVar5 = new com.revolut.feature.subaccount.impl.ui.add_money.flow.a(bVar3, null);
                    this.v = 1;
                    if (bVar3.p2(this, aVar5) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((com.revolut.feature.credit.application.plugins.impl.ui.credit_post_activation_waiting.a) obj3).J2(null, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n9e.i iVar = (n9e.i) obj3;
                mtd.e eVar = new mtd.e(iVar, continuation, i2);
                this.v = 1;
                Object objB4 = pu7.a.B(iVar.k, "block_subscription", eVar, this);
                return objB4 == aVar7 ? aVar7 : objB4;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a aVar9 = (com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a) obj3;
                mtd.e eVar2 = new mtd.e(aVar9, continuation, 8);
                this.v = 1;
                Object objB5 = pu7.a.B(aVar9.k, "CREATE_JISA_ONLY_TASK_ID", eVar2, this);
                return objB5 == aVar8 ? aVar8 : objB5;
            case 6:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.donations.impl.ui.kompot.flow.overview.b bVar4 = (com.revolut.feature.donations.impl.ui.kompot.flow.overview.b) obj3;
                    com.revolut.feature.donations.impl.ui.kompot.flow.overview.a aVar11 = new com.revolut.feature.donations.impl.ui.kompot.flow.overview.a(bVar4, null);
                    this.v = 1;
                    if (bVar4.p2(this, aVar11) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                nbk.b bVar5 = (nbk.b) obj3;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    lbk.a aVar13 = bVar5.f214087c;
                    kbk.l lVar = kbk.l.BIRTHDAY;
                    this.v = 1;
                    objB = ((ubk.a) aVar13).b(false, false, (1 & 4) == 0, lVar);
                    if (objB == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                bVar5.f214085a.c((FeatureCommand) objB);
                return Boolean.TRUE;
            case 8:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a aVar15 = (com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a) obj3;
                mtd.e eVar3 = new mtd.e(aVar15, continuation, i3);
                this.v = 1;
                Object objB6 = pu7.a.B(aVar15.k, "Send proof of income event", eVar3, this);
                return objB6 == aVar14 ? aVar14 : objB6;
            case 9:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    fag.i iVar2 = ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c) obj3).o.f159781a;
                    iVar2.getClass();
                    pfm.n nVar = new pfm.n(new fag.f(iVar2, i32), i32);
                    Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
                    pfm.r rVarG0 = te0.w.g0(nVar);
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c cVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c) obj3;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    cVar2.H2(cVar2.f68132t, new nd8.i(i21));
                    j2 j2Var = cVar2.f68131s;
                    cv3.u.Companion.getClass();
                    cv3.u uVarA = cv3.t.a();
                    this.v = 1;
                    j2Var.getClass();
                    j2Var.g(null, uVarA);
                    if (Unit.f186387a == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i102 != 1) {
                        if (i102 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objB2 = obj2;
                        cVar2.I2(new Data((nf4.t) objB2, null, false, 6, null));
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                nf4.l lVar2 = cVar2.f68128p;
                String str = cVar2.f68130r.f68120a;
                this.v = 2;
                objB2 = lVar2.b(str, this);
                if (objB2 == aVar17) {
                    return aVar17;
                }
                cVar2.I2(new Data((nf4.t) objB2, null, false, 6, null));
                return Unit.f186387a;
            case 11:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.plan_selection.a aVar19 = (com.revolut.feature.credit.application.plugins.impl.ui.plan_selection.a) obj3;
                ng4.d dVar = new ng4.d(aVar19, continuation, i32);
                this.v = 1;
                Object objP2 = aVar19.p2(this, dVar);
                return objP2 == aVar18 ? aVar18 : objP2;
            case 12:
                nhc.i iVar3 = (nhc.i) obj3;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    RentAndBillsService rentAndBillsService = iVar3.f215412a;
                    this.v = 1;
                    linkedPayments = rentAndBillsService.getLinkedPayments(this);
                    if (linkedPayments == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i104 != 1) {
                        if (i104 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    linkedPayments = obj2;
                }
                RentAndBillsLinkedPayments rentAndBillsLinkedPaymentsD = dhc.c.d((b0) linkedPayments);
                x4l.c cVar3 = iVar3.d;
                Unit unit = Unit.f186387a;
                this.v = 2;
                if (cVar3.f(unit, rentAndBillsLinkedPaymentsD, this) == aVar20) {
                    return aVar20;
                }
                return Unit.f186387a;
            case 13:
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f fVar = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f) obj3;
                cli.y yVar = fVar.u;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    j0 firstRequest = new j0(((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) ((j2) yVar.f22677a).getValue()).f94322a, ((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) ((j2) yVar.f22677a).getValue()).f94323b, ((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) ((j2) yVar.f22677a).getValue()).f94324c, null, ((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) ((j2) yVar.f22677a).getValue()).e, ((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) ((j2) yVar.f22677a).getValue()).f);
                    vfg.o oVar = fVar.f94330p;
                    oVar.getClass();
                    Intrinsics.checkNotNullParameter(firstRequest, "firstRequest");
                    efm.b bVarB = new lk0.d(new v48.d(oVar, 23), new vch.a(oVar, i2), new vdl.a(oVar, 18), firstRequest, new vf0.p(i21), new vf0.p(i22), yk0.d.a()).b(oVar.f288630b);
                    this.v = 1;
                    if (nim.a.a(bVarB, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    nig.g gVar = (nig.g) obj3;
                    gfg.c cVar4 = gVar.o;
                    ihm.f events = gVar.f216105r;
                    vfg.t tVar = (vfg.t) cVar4;
                    tVar.getClass();
                    Intrinsics.checkNotNullParameter(events, "events");
                    efm.b bVarB2 = ((lk0.d) tVar.d.getValue()).b(events);
                    this.v = 1;
                    if (nim.a.a(bVarB2, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objH = e0.h((ArrayList) obj3, this);
                return objH == aVar23 ? aVar23 : objH;
            case 16:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 != 0) {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objI = ((g0) obj3).i(this);
                return objI == aVar24 ? aVar24 : objI;
            case 17:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    njd.f fVar2 = (njd.f) obj3;
                    njd.e eVar4 = new njd.e(fVar2, null);
                    this.v = 1;
                    if (u0.b0(fVar2.X(), "SHOPS_ADS_NOTIFICATIONS_ACCEPT_BUTTON", eVar4, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objB7 = nim.a.b((h0) obj3, this);
                return objB7 == aVar26 ? aVar26 : objB7;
            case 19:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (nim.a.a((efm.f) obj3, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    KProperty[] kPropertyArr = EsimMobilePlanCheckoutScreen.Y;
                    wej.a aVarD3 = ((EsimMobilePlanCheckoutScreen) obj3).d3();
                    ScreenContentRecyclerView screenEsimCheckoutRecyclerView = aVarD3.d;
                    Intrinsics.checkNotNullExpressionValue(screenEsimCheckoutRecyclerView, "screenEsimCheckoutRecyclerView");
                    NavBarWithToolbar navBarWithToolbar = aVarD3.f296798c;
                    CollapsingActionButton collapsingActionButton = aVarD3.f296797b;
                    this.v = 1;
                    if (unj.p.a(screenEsimCheckoutRecyclerView, navBarWithToolbar, collapsingActionButton, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                nk2.d dVar2 = (nk2.d) obj3;
                cli.y yVar2 = dVar2.f216631s;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                try {
                    if (i113 == 0) {
                        yhm.o.b(obj2);
                        l93.f fVar3 = dVar2.f216628p;
                        c93.s sVar = c93.s.ATM_ROLLING_MONTH;
                        this.v = 1;
                        objM = ((ha3.x) fVar3).f.m(sVar, this);
                        if (objM == aVar29) {
                            return aVar29;
                        }
                    } else {
                        if (i113 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objM = obj2;
                    }
                    dVar2.H2(yVar2, new nk2.c((c93.p) objM, 0));
                    break;
                } catch (Exception e) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    dVar2.H2(yVar2, new njf.d(i5));
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                nk9.o oVar2 = (nk9.o) obj3;
                nk9.l lVar3 = new nk9.l(i6, continuation, oVar2);
                this.v = 1;
                Object objB8 = pu7.a.B(oVar2.k, "navigateToPayLaterCard", lVar3, this);
                return objB8 == aVar30 ? aVar30 : objB8;
            case 23:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    nm9.m mVar = (nm9.m) obj3;
                    mtd.e eVar5 = new mtd.e(mVar, continuation, 11);
                    this.v = 1;
                    if (ue8.c.f0(mVar, eVar5, this) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                nnk.h hVar = (nnk.h) obj3;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    z zVarA = hVar.o.a();
                    this.v = 1;
                    objB3 = nim.a.b(zVarA, this);
                    if (objB3 == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB3 = obj2;
                }
                hVar.H2(hVar.f217723r, new nn3.z((PricingPlanTerms) objB3, i22));
                return Unit.f186387a;
            case 25:
                g1 g1Var = (g1) obj3;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    if (((Boolean) g1Var.f217775g.getValue()).booleanValue()) {
                        if (!((jte.d) g1Var.f.f98545a).c(AnalyticsFeatureToggles.DisableDynamicDeliveryLifecycleTracking.f98543c)) {
                            z1 z1Var = ((oi0.b) g1Var.f217773b).d;
                            blj.t tVar2 = new blj.t(g1Var, i21);
                            this.v = 1;
                            z1Var.getClass();
                            if (z1.m(z1Var, tVar2, this) == aVar33) {
                                return aVar33;
                            }
                        }
                    }
                    return Unit.f186387a;
                }
                if (i117 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                return Unit.f186387a;
            case 26:
                com.revolut.analytics.tracking.v3.l lVar4 = (com.revolut.analytics.tracking.v3.l) obj3;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    bfe.f fVar4 = lVar4.f50340c;
                    this.v = 1;
                    objA = fVar4.a(this);
                    if (objA == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                for (yee.b app : (Iterable) objA) {
                    Intrinsics.checkNotNullParameter(app, "app");
                    lVar4.m3(AnalyticsProduct.Shared.FinCrime.f, true, new nmm.h(app, i3));
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 != 0) {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.b bVar6 = (com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.b) obj3;
                mtd.e eVar6 = new mtd.e(bVar6, continuation, i5);
                this.v = 1;
                Object objB9 = pu7.a.B(bVar6.k, "submitTask", eVar6, this);
                return objB9 == aVar35 ? aVar35 : objB9;
            case 28:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 != 0) {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.a aVar37 = (com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.a) obj3;
                ns4.k kVar = new ns4.k(aVar37, continuation, i32);
                this.v = 1;
                Object objB10 = pu7.a.B(aVar37.k, "Anticipate instalment", kVar, this);
                return objB10 == aVar36 ? aVar36 : objB10;
            default:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 != 0) {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                nsl.i iVar4 = (nsl.i) obj3;
                mtd.e eVar7 = new mtd.e(iVar4, continuation, i22);
                this.v = 1;
                Object objB11 = pu7.a.B(iVar4.e, "on_show_stock_details_screen", eVar7, this);
                return objB11 == aVar38 ? aVar38 : objB11;
        }
    }
}
