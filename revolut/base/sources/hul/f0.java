package hul;

import android.graphics.Typeface;
import com.revolut.feature.apm.core.models.recipients.BlikContact;
import com.revolut.feature.apm.core.models.recipients.BrebContact;
import com.revolut.feature.apm.core.models.recipients.IrisContact;
import com.revolut.feature.apm.core.models.recipients.PixContact;
import com.revolut.feature.freelancer.common.models.onboarding.BusinessCategory;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungeNewPassesService;
import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungesDisclaimerService;
import com.revolut.retail.feature.trading_onboarding.impl.data.network.OnboardingService;
import com.revolut.retail.feature.trading_onboarding.impl.data.network.SpouseConsentService;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import gwi.y0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import m1c.s0;
import m1c.v0;
import om4.s3;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f155716w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f155717x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(hyk.h hVar, Continuation continuation) {
        super(2, continuation);
        this.u = 22;
        this.f155717x = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f0((com.revolut.trading.orders.ui.invest.placement.screens.review.o) this.f155716w, (Instant) this.f155717x, continuation, 0);
            case 1:
                return new f0((com.revolut.trading.orders.ui.invest.placement.screens.review.o) this.f155716w, (OrderQuote) this.f155717x, continuation, 1);
            case 2:
                return new f0((com.revolut.trading.orders.ui.invest.placement.screens.review.o) this.f155716w, (xul.e) this.f155717x, continuation, 2);
            case 3:
                return new f0((com.revolut.trading.orders.ui.invest.placement.screens.review.o) this.f155716w, (l) this.f155717x, continuation, 3);
            case 4:
                return new f0((com.revolut.trading.orders.ui.invest.placement.screens.review.o) this.f155716w, (bfl.g) this.f155717x, continuation, 4);
            case 5:
                return new f0((hw3.i) this.f155716w, (ll4.c) this.f155717x, continuation, 5);
            case 6:
                return new f0((com.revolut.feature.topup_screen.impl.flow.topup_methods.d) this.f155716w, (dii.c) this.f155717x, continuation, 6);
            case 7:
                return new f0((hwi.c) this.f155716w, (String) this.f155717x, continuation, 7);
            case 8:
                return new f0((hwi.k) this.f155716w, (String) this.f155717x, continuation, 8);
            case 9:
                return new f0((hwi.d0) this.f155716w, (String) this.f155717x, continuation, 9);
            case 10:
                return new f0((hy1.c) this.f155716w, (List) this.f155717x, continuation, 10);
            case 11:
                return new f0((hy1.l) this.f155716w, (List) this.f155717x, continuation, 11);
            case 12:
                return new f0((hy1.p) this.f155716w, (List) this.f155717x, continuation, 12);
            case 13:
                return new f0((hy1.s) this.f155716w, (List) this.f155717x, continuation, 13);
            case 14:
                return new f0((hy1.v) this.f155716w, (List) this.f155717x, continuation, 14);
            case 15:
                return new f0((hy1.y) this.f155716w, (List) this.f155717x, continuation, 15);
            case 16:
                return new f0((hy1.c0) this.f155716w, (List) this.f155717x, continuation, 16);
            case 17:
                return new f0((hy1.g0) this.f155716w, (List) this.f155717x, continuation, 17);
            case 18:
                return new f0((hy1.j0) this.f155716w, (List) this.f155717x, continuation, 18);
            case 19:
                return new f0((hy1.m0) this.f155716w, (List) this.f155717x, continuation, 19);
            case 20:
                return new f0((hyb.c) this.f155716w, (s0) this.f155717x, continuation, 20);
            case 21:
                return new f0((hyk.c) this.f155716w, (String) this.f155717x, continuation, 21);
            case 22:
                return new f0((hyk.h) this.f155717x, continuation);
            case 23:
                return new f0((hyk.l) this.f155716w, (xel.e) this.f155717x, continuation, 23);
            case 24:
                return new f0((hz6.k) this.f155716w, (BusinessCategory) this.f155717x, continuation, 24);
            case 25:
                return new f0((com.revolut.feature.rev_points.impl.ui.earn.b) this.f155716w, (String) this.f155717x, continuation, 25);
            case 26:
                return new f0((com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c) this.f155716w, (com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.a) this.f155717x, continuation, 26);
            case 27:
                return new f0((i01.b) this.f155716w, (String) this.f155717x, continuation, 27);
            case 28:
                return new f0((com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a) this.f155716w, (ExchangeOrderDraft) this.f155717x, continuation, 28);
            default:
                return new f0((i2l.m0) this.f155716w, (String) this.f155717x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        hyk.h hVar;
        skm.g0 g0Var;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) this.f155716w;
                hib.n nVar = new hib.n((Object) oVar, this.f155717x, (Continuation) null, 15);
                this.v = 1;
                Object objB = pu7.a.B(oVar.k, "on_cancellation_deadline_click", nVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar2 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) this.f155716w;
                hib.n nVar2 = new hib.n((Object) oVar2, this.f155717x, (Continuation) null, 16);
                this.v = 1;
                Object objB2 = pu7.a.B(oVar2.k, "on_item_exchanged_click", nVar2, this);
                return objB2 == aVar2 ? aVar2 : objB2;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar3 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) this.f155716w;
                com.revolut.trading.orders.ui.invest.placement.screens.review.h hVar2 = new com.revolut.trading.orders.ui.invest.placement.screens.review.h(oVar3, (xul.e) this.f155717x, null);
                this.v = 1;
                Object objB3 = pu7.a.B(oVar3.k, "on_price_row_click", hVar2, this);
                return objB3 == aVar3 ? aVar3 : objB3;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar4 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) this.f155716w;
                    f9i.c cVar = new f9i.c(new f9i.e(((l) this.f155717x).f155741a, false));
                    this.v = 1;
                    if (oVar4.G1(cVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar5 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) this.f155716w;
                com.revolut.trading.orders.ui.invest.placement.screens.review.k kVar = new com.revolut.trading.orders.ui.invest.placement.screens.review.k(oVar5, (bfl.g) this.f155717x, null);
                this.v = 1;
                Object objB4 = pu7.a.B(oVar5.k, "on_settlement_date_click", kVar, this);
                return objB4 == aVar5 ? aVar5 : objB4;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    al4.j jVar = ((hw3.i) this.f155716w).d;
                    ll4.c cVar2 = (ll4.c) this.f155717x;
                    this.v = 1;
                    if (((s3) jVar).w(cVar2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                efm.d0 d0VarC = ((s06.j) ((com.revolut.feature.topup_screen.impl.flow.topup_methods.d) this.f155716w).A).c(((dii.c) this.f155717x).f115066a.f275445a, false, lg0.a.OPEN_BROWSER);
                this.v = 1;
                Object objB5 = nim.a.b(d0VarC, this);
                return objB5 == aVar7 ? aVar7 : objB5;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    AirportLoungeNewPassesService airportLoungeNewPassesService = ((hwi.c) this.f155716w).f156196a;
                    String str = (String) this.f155717x;
                    this.v = 1;
                    obj2 = airportLoungeNewPassesService.getLoungePassDetailsByPassId(str, this);
                    if (obj2 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return knm.b.L((gwi.m0) obj2);
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    AirportLoungeNewPassesService airportLoungeNewPassesService2 = ((hwi.k) this.f155716w).f156229a;
                    String str2 = (String) this.f155717x;
                    this.v = 1;
                    obj2 = airportLoungeNewPassesService2.getPassRefundBreakdown(str2, this);
                    if (obj2 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                y0 y0Var = (y0) obj2;
                Intrinsics.checkNotNullParameter(y0Var, "<this>");
                return new svi.u(mo3.a.o(y0Var.f147566a), y0Var.f147567b);
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    AirportLoungesDisclaimerService airportLoungesDisclaimerService = ((hwi.d0) this.f155716w).f156203a;
                    String str3 = (String) this.f155717x;
                    this.v = 1;
                    if (airportLoungesDisclaimerService.acceptDisclaimer(str3, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarD = ((hy1.c) this.f155716w).f156636a.d(sx1.i.c((List) this.f155717x));
                    this.v = 1;
                    if (nim.a.a(bVarD, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarF = ((hy1.l) this.f155716w).f156661b.f(tx1.k.c((List) this.f155717x));
                    this.v = 1;
                    if (nim.a.a(bVarF, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    ux1.a aVar14 = ((hy1.p) this.f155716w).f156671a;
                    List list = (List) this.f155717x;
                    Intrinsics.checkNotNullParameter(list, "<this>");
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(ux1.i.c((BlikContact) it8.next()));
                    }
                    efm.b bVarD2 = aVar14.d(arrayList);
                    this.v = 1;
                    if (nim.a.a(bVarD2, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    vx1.a aVar16 = ((hy1.s) this.f155716w).f156676a;
                    List list3 = (List) this.f155717x;
                    Intrinsics.checkNotNullParameter(list3, "<this>");
                    List list4 = list3;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                    Iterator it9 = list4.iterator();
                    while (it9.hasNext()) {
                        arrayList2.add(vx1.h.c((BrebContact) it9.next()));
                    }
                    efm.b bVarD3 = aVar16.d(arrayList2);
                    this.v = 1;
                    if (nim.a.a(bVarD3, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    xx1.a aVar18 = ((hy1.v) this.f155716w).f156681a;
                    List list5 = (List) this.f155717x;
                    Intrinsics.checkNotNullParameter(list5, "<this>");
                    List list6 = list5;
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(list6, 10));
                    Iterator it10 = list6.iterator();
                    while (it10.hasNext()) {
                        arrayList3.add(xx1.h.c((IrisContact) it10.next()));
                    }
                    efm.b bVarD4 = aVar18.d(arrayList3);
                    this.v = 1;
                    if (nim.a.a(bVarD4, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarD5 = ((hy1.y) this.f155716w).f156686a.d(zx1.j.c((List) this.f155717x));
                    this.v = 1;
                    if (nim.a.a(bVarD5, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    ay1.a aVar21 = ((hy1.c0) this.f155716w).f156638a;
                    List list7 = (List) this.f155717x;
                    Intrinsics.checkNotNullParameter(list7, "<this>");
                    List list8 = list7;
                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list8, 10));
                    Iterator it11 = list8.iterator();
                    while (it11.hasNext()) {
                        arrayList4.add(ay1.j.c((PixContact) it11.next()));
                    }
                    efm.b bVarD6 = aVar21.d(arrayList4);
                    this.v = 1;
                    if (nim.a.a(bVarD6, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarD7 = ((hy1.g0) this.f155716w).f156647a.d(by1.i.c((List) this.f155717x));
                    this.v = 1;
                    if (nim.a.a(bVarD7, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarD8 = ((hy1.j0) this.f155716w).f156655a.d(cy1.i.c((List) this.f155717x));
                    this.v = 1;
                    if (nim.a.a(bVarD8, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarD9 = ((hy1.m0) this.f155716w).f156666a.d(dy1.i.c((List) this.f155717x));
                    this.v = 1;
                    if (nim.a.a(bVarD9, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    eub.j jVar2 = ((hyb.c) this.f155716w).f156774l;
                    v0 v0Var = ((s0) this.f155717x).f201452a;
                    this.v = 1;
                    Object objA = ((nxb.e) ((nyb.v) jVar2).f220838b).a(v0Var, System.currentTimeMillis(), this);
                    if (objA != aVar25) {
                        objA = Unit.f186387a;
                    }
                    if (objA == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    OnboardingService onboardingService = ((hyk.c) this.f155716w).f156887a;
                    String str4 = (String) this.f155717x;
                    this.v = 1;
                    if (onboardingService.getOtpChallenge(str4, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    hyk.h hVar3 = (hyk.h) this.f155717x;
                    SpouseConsentService spouseConsentService = hVar3.f156898b;
                    this.f155716w = hVar3;
                    this.v = 1;
                    Object objRequestManualSpouseConsent = spouseConsentService.requestManualSpouseConsent(this);
                    if (objRequestManualSpouseConsent == aVar27) {
                        return aVar27;
                    }
                    hVar = hVar3;
                    obj2 = objRequestManualSpouseConsent;
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar = (hyk.h) this.f155716w;
                    yhm.o.b(obj2);
                }
                hyk.h.a(hVar, (Response) obj2);
                return Unit.f186387a;
            case 23:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    OnboardingService onboardingService2 = ((hyk.l) this.f155716w).f156904a;
                    xel.e eVar = (xel.e) this.f155717x;
                    Intrinsics.checkNotNullParameter(eVar, "<this>");
                    ArrayList arrayList5 = eVar.f304712a;
                    ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                    Iterator it12 = arrayList5.iterator();
                    while (it12.hasNext()) {
                        arrayList6.add(((wi0.b) it12.next()).f297794a);
                    }
                    fyk.z zVar = new fyk.z(arrayList6);
                    this.v = 1;
                    obj2 = onboardingService2.updateKyc(zVar, this);
                    if (obj2 == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Response response = (Response) obj2;
                if (response.isSuccessful()) {
                    return Unit.f186387a;
                }
                throw new HttpException(response);
            case 24:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    hz6.k kVar2 = (hz6.k) this.f155716w;
                    afa.u uVar = new afa.u(kVar2, (BusinessCategory) this.f155717x, null, 24);
                    this.v = 1;
                    if (kVar2.p2(this, uVar) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 != 0) {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.rev_points.impl.ui.earn.b bVar = (com.revolut.feature.rev_points.impl.ui.earn.b) this.f155716w;
                hib.n nVar3 = new hib.n((yji.l) bVar, this.f155717x, (Continuation) null, 18);
                this.v = 1;
                Object objP2 = bVar.p2(this, nVar3);
                return objP2 == aVar30 ? aVar30 : objP2;
            case 26:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar3 = (com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c) this.f155716w;
                    gca.l lVar = new gca.l((com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.a) this.f155717x, null, 20);
                    this.v = 1;
                    if (cVar3.p2(this, lVar) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 != 0) {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                Typeface typeface = (Typeface) ((i01.b) this.f155716w).d.get((String) this.f155717x);
                if (typeface != null) {
                    return typeface;
                }
                i01.b bVar2 = (i01.b) this.f155716w;
                LinkedHashMap linkedHashMap = bVar2.e;
                String str5 = (String) this.f155717x;
                synchronized (linkedHashMap) {
                    try {
                        LinkedHashMap linkedHashMap2 = bVar2.e;
                        Object objG = linkedHashMap2.get(str5);
                        if (objG == null) {
                            objG = skm.e0.g(bVar2.f157277c, bVar2.f157276b, null, new hp2.d(bVar2, str5, null, 26), 2);
                            linkedHashMap2.put(str5, objG);
                        }
                        g0Var = (skm.g0) objG;
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                this.v = 1;
                Object objI = g0Var.i(this);
                return objI == aVar32 ? aVar32 : objI;
            case 28:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                zrc.d dVar = ((com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a) this.f155716w).F;
                ExchangeOrderDraft exchangeOrderDraft = (ExchangeOrderDraft) this.f155717x;
                xi0.b bVar3 = exchangeOrderDraft.f96879a.f96897a;
                xi0.b bVar4 = exchangeOrderDraft.f96880b.f96897a;
                boolean z = exchangeOrderDraft.f96881c == wd6.e.BUY;
                this.v = 1;
                Object objA2 = dVar.a(bVar3, bVar4, z, this);
                return objA2 == aVar33 ? aVar33 : objA2;
            default:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 != 0) {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wli.x xVar = ((i2l.m0) this.f155716w).f158028s;
                String str6 = (String) this.f155717x;
                lg0.a aVar35 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, str6, aVar35, null, this, 4);
                return objX1 == aVar34 ? aVar34 : objX1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f155716w = obj2;
        this.f155717x = obj3;
    }
}
