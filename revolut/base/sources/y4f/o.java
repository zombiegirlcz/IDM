package y4f;

import au6.c3;
import b4g.s;
import b4g.t;
import b4g.u;
import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.TaxHubAssessmentScreenContract$InputData;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.feature.staking.impl.service.pocket.StakingPocketService;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.topup_screen.impl.screens.topup_methods.TopupMethodsScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.details.amendment.TravelHotelsRoomDetailsAmendmentScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.AsftTimeSlotBookingScreenContract$InputData;
import com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import et6.l2;
import et6.r1;
import hwi.f1;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import jid.v;
import klf.j1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mif.e0;
import tof.a3;
import tv5.a;
import vdl.c1;
import vkm.j2;
import vkm.s1;
import y5b.b0;
import y7a.f0;
import y7d.x;
import y9a.r;
import ybh.a0;
import z55.w;
import zh9.u0;
import zhm.h0;
import zhm.y0;
import zhm.z0;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f310915w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f310916x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f310917y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f310917y = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                o oVar = new o((Continuation) obj4, (com.revolut.feature.trading.impl.ui.holdings.information.entry.a) this.f310917y, 0);
                oVar.f310915w = (FlowCollector) obj2;
                oVar.f310916x = obj3;
                return oVar.invokeSuspend(Unit.f186387a);
            case 1:
                o oVar2 = new o((Continuation) obj4, (y52.b) this.f310917y, 1);
                oVar2.f310915w = (FlowCollector) obj2;
                oVar2.f310916x = obj3;
                return oVar2.invokeSuspend(Unit.f186387a);
            case 2:
                o oVar3 = new o((Continuation) obj4, (y58.f) this.f310917y, 2);
                oVar3.f310915w = (FlowCollector) obj2;
                oVar3.f310916x = obj3;
                return oVar3.invokeSuspend(Unit.f186387a);
            case 3:
                o oVar4 = new o((Continuation) obj4, (y5g.k) this.f310917y, 3);
                oVar4.f310915w = (FlowCollector) obj2;
                oVar4.f310916x = obj3;
                return oVar4.invokeSuspend(Unit.f186387a);
            case 4:
                o oVar5 = new o((Continuation) obj4, (com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.a) this.f310917y, 4);
                oVar5.f310915w = (FlowCollector) obj2;
                oVar5.f310916x = obj3;
                return oVar5.invokeSuspend(Unit.f186387a);
            case 5:
                o oVar6 = new o((Continuation) obj4, (y6b.k) this.f310917y, 5);
                oVar6.f310915w = (FlowCollector) obj2;
                oVar6.f310916x = obj3;
                return oVar6.invokeSuspend(Unit.f186387a);
            case 6:
                o oVar7 = new o((Continuation) obj4, (f0) this.f310917y, 6);
                oVar7.f310915w = (FlowCollector) obj2;
                oVar7.f310916x = obj3;
                return oVar7.invokeSuspend(Unit.f186387a);
            case 7:
                o oVar8 = new o((Continuation) obj4, (x) this.f310917y, 7);
                oVar8.f310915w = (FlowCollector) obj2;
                oVar8.f310916x = obj3;
                return oVar8.invokeSuspend(Unit.f186387a);
            case 8:
                o oVar9 = new o((Continuation) obj4, (r) this.f310917y, 8);
                oVar9.f310915w = (FlowCollector) obj2;
                oVar9.f310916x = obj3;
                return oVar9.invokeSuspend(Unit.f186387a);
            case 9:
                o oVar10 = new o((Continuation) obj4, (ya5.l) this.f310917y, 9);
                oVar10.f310915w = (FlowCollector) obj2;
                oVar10.f310916x = obj3;
                return oVar10.invokeSuspend(Unit.f186387a);
            case 10:
                o oVar11 = new o((Continuation) obj4, (yd8.h) this.f310917y, 10);
                oVar11.f310915w = (FlowCollector) obj2;
                oVar11.f310916x = obj3;
                return oVar11.invokeSuspend(Unit.f186387a);
            case 11:
                o oVar12 = new o((Continuation) obj4, (yd8.n) this.f310917y, 11);
                oVar12.f310915w = (FlowCollector) obj2;
                oVar12.f310916x = obj3;
                return oVar12.invokeSuspend(Unit.f186387a);
            case 12:
                o oVar13 = new o((Continuation) obj4, (ydg.g) this.f310917y, 12);
                oVar13.f310915w = (FlowCollector) obj2;
                oVar13.f310916x = obj3;
                return oVar13.invokeSuspend(Unit.f186387a);
            case 13:
                o oVar14 = new o((Continuation) obj4, (ygf.i) this.f310917y, 13);
                oVar14.f310915w = (FlowCollector) obj2;
                oVar14.f310916x = obj3;
                return oVar14.invokeSuspend(Unit.f186387a);
            case 14:
                o oVar15 = new o((Continuation) obj4, (com.revolut.feature.shops.impl.ui.carousel_details.a) this.f310917y, 14);
                oVar15.f310915w = (FlowCollector) obj2;
                oVar15.f310916x = obj3;
                return oVar15.invokeSuspend(Unit.f186387a);
            case 15:
                o oVar16 = new o((Continuation) obj4, (ykf.b) this.f310917y, 15);
                oVar16.f310915w = (FlowCollector) obj2;
                oVar16.f310916x = obj3;
                return oVar16.invokeSuspend(Unit.f186387a);
            case 16:
                o oVar17 = new o((Continuation) obj4, (com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.a) this.f310917y, 16);
                oVar17.f310915w = (FlowCollector) obj2;
                oVar17.f310916x = obj3;
                return oVar17.invokeSuspend(Unit.f186387a);
            case 17:
                o oVar18 = new o((Continuation) obj4, (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a) this.f310917y, 17);
                oVar18.f310915w = (FlowCollector) obj2;
                oVar18.f310916x = obj3;
                return oVar18.invokeSuspend(Unit.f186387a);
            case 18:
                o oVar19 = new o((yvd.c) this.f310917y, (Continuation) obj4);
                oVar19.f310916x = (String) obj3;
                return oVar19.invokeSuspend(Unit.f186387a);
            case 19:
                o oVar20 = new o((Continuation) obj4, (yw6.g) this.f310917y, 19);
                oVar20.f310915w = (FlowCollector) obj2;
                oVar20.f310916x = obj3;
                return oVar20.invokeSuspend(Unit.f186387a);
            case 20:
                o oVar21 = new o((Continuation) obj4, (ywg.l) this.f310917y, 20);
                oVar21.f310915w = (FlowCollector) obj2;
                oVar21.f310916x = obj3;
                return oVar21.invokeSuspend(Unit.f186387a);
            case 21:
                o oVar22 = new o((Continuation) obj4, (ywi.g) this.f310917y, 21);
                oVar22.f310915w = (FlowCollector) obj2;
                oVar22.f310916x = obj3;
                return oVar22.invokeSuspend(Unit.f186387a);
            case 22:
                o oVar23 = new o((Continuation) obj4, (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b) this.f310917y, 22);
                oVar23.f310915w = (FlowCollector) obj2;
                oVar23.f310916x = obj3;
                return oVar23.invokeSuspend(Unit.f186387a);
            case 23:
                o oVar24 = new o((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c) this.f310917y, 23);
                oVar24.f310915w = (FlowCollector) obj2;
                oVar24.f310916x = obj3;
                return oVar24.invokeSuspend(Unit.f186387a);
            case 24:
                o oVar25 = new o((Continuation) obj4, (com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.a) this.f310917y, 24);
                oVar25.f310915w = (FlowCollector) obj2;
                oVar25.f310916x = obj3;
                return oVar25.invokeSuspend(Unit.f186387a);
            case 25:
                o oVar26 = new o((Continuation) obj4, (yz9.f) this.f310917y, 25);
                oVar26.f310915w = (FlowCollector) obj2;
                oVar26.f310916x = obj3;
                return oVar26.invokeSuspend(Unit.f186387a);
            case 26:
                o oVar27 = new o((Continuation) obj4, (z0f.f0) this.f310917y, 26);
                oVar27.f310915w = (FlowCollector) obj2;
                oVar27.f310916x = obj3;
                return oVar27.invokeSuspend(Unit.f186387a);
            case 27:
                o oVar28 = new o((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f) this.f310917y, 27);
                oVar28.f310915w = (FlowCollector) obj2;
                oVar28.f310916x = obj3;
                return oVar28.invokeSuspend(Unit.f186387a);
            case 28:
                o oVar29 = new o((Continuation) obj4, (z2d.c) this.f310917y, 28);
                oVar29.f310915w = (FlowCollector) obj2;
                oVar29.f310916x = obj3;
                return oVar29.invokeSuspend(Unit.f186387a);
            default:
                o oVar30 = new o((Continuation) obj4, (com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a) this.f310917y, 29);
                oVar30.f310915w = (FlowCollector) obj2;
                oVar30.f310916x = obj3;
                return oVar30.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Flow gVar;
        Flow gVar2;
        Flow gVar3;
        String str;
        Flow fVar;
        Object rewards;
        by5.a aVar;
        Flow gVar4;
        int i = this.u;
        int i2 = 18;
        int i3 = 21;
        int i5 = 14;
        int i6 = 3;
        w4l.h loadingStrategy = w4l.h.f294642c;
        int i21 = 0;
        w4l.i loadingStrategy2 = w4l.i.f294643c;
        Continuation continuation = null;
        Object obj3 = this.f310917y;
        int i22 = 1;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.f310915w;
                    com.revolut.feature.trading.impl.ui.holdings.information.entry.a aVar3 = (com.revolut.feature.trading.impl.ui.holdings.information.entry.a) obj3;
                    Flow flowE = boh.f.e(nim.a.v(ybl.k.h(aVar3.f91219p, TradingAccountType.Gia.f105270a, null, 6), new y4b.b(8)), new n(aVar3, 1));
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowE, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.f310915w;
                    if (((Boolean) this.f310916x).booleanValue()) {
                        y52.b bVar = (y52.b) obj3;
                        gVar = new wyd.f(bVar.f310980b.b(ApmPaymentAuthorisationPaymentMethod.IRIS), bVar, i3);
                    } else {
                        gVar = new go.g(zhm.f0.f322471a, 2);
                    }
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, gVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = (FlowCollector) this.f310915w;
                    if (((Boolean) this.f310916x).booleanValue()) {
                        y58.f fVar2 = (y58.f) obj3;
                        gVar2 = mo3.a.f(u0.m(vkm.q.q(nim.a.v(((nj8.n) fVar2.f311004a).k(null, loadingStrategy2), new y4b.b(17))), nim.a.v(fVar2.f311006c.j(w4l.j.f294644c), new y4b.b(16))), new y13.a(23), new x0b.h(fVar2, 29), new y13.a(24));
                    } else {
                        gVar2 = new go.g(zhm.f0.f322471a, 2);
                    }
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, gVar2, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = (FlowCollector) this.f310915w;
                    w4l.k loadingStrategy3 = (w4l.k) this.f310916x;
                    y5g.k kVar = (y5g.k) obj3;
                    h4g.e eVar = kVar.o;
                    String bookingId = ((y5g.g) ((j2) kVar.f311086r.f22677a).getValue()).f311079a;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                    u uVar = eVar.f149360a;
                    Locale localeB = ((s80.b) eVar.f149361b).b();
                    uVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                    jhi.k kVarU = nim.a.u(new h4g.d(eVar, bookingId, null), nim.a.v(uVar.e.b(new s(bookingId, localeB != null ? localeB.getLanguage() : null), loadingStrategy3), t.f));
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, kVarU, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.a aVar7 = (com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.a) obj3;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = (FlowCollector) this.f310915w;
                    j23.b bVarD = yh5.b.d(nim.a.v(rd0.e.b(aVar7.f70434q.b(aVar7.v, w4l.h.f294642c)), y65.m.f311172a), aVar7.f70436s.j(loadingStrategy));
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, bVarD, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = (FlowCollector) this.f310915w;
                    w4l.k loadingStrategy4 = (w4l.k) this.f310916x;
                    c6b.b bVar2 = ((y6b.k) obj3).o;
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                    y5b.p pVar = bVar2.f21753a;
                    pVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                    vkm.d dVarB = pVar.d.b(Unit.f186387a, loadingStrategy4);
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, dVarB, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                f0 f0Var = (f0) obj3;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = (FlowCollector) this.f310915w;
                    Set set = (Set) this.f310916x;
                    a8a.d dVarY2 = f0Var.y2();
                    PickerScreenContract$InputData pickerScreenContract$InputData = f0Var.f311442q;
                    vkm.d dVarB2 = rd0.e.b(dVarY2.e(pickerScreenContract$InputData.f80358a, set, pickerScreenContract$InputData.f80364l));
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector7, dVarB2, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = (FlowCollector) this.f310915w;
                    String userInput = (String) this.f310916x;
                    toh.d dVar = ((x) obj3).f311494p;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(userInput, "userInput");
                    efm.r rVarX = ((vo6.b) dVar.f273214a).a().x();
                    Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                    wkm.l lVarQ = vkm.q.Q(rd0.e.b(rVarX), new sdi.a(continuation, dVar, userInput, 29));
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector8, lVarQ, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                r rVar = (r) obj3;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = (FlowCollector) this.f310915w;
                    Flow flowE2 = boh.f.e(rVar.f311825p.f260949a.f213356c.b(Unit.f186387a, loadingStrategy2), new ro7.n(rVar, 29));
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector9, flowE2, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                ya5.l lVar = (ya5.l) obj3;
                String planId = lVar.f311946s;
                ra5.b bVar3 = lVar.o;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector10 = (FlowCollector) this.f310915w;
                    bVar3.getClass();
                    Intrinsics.checkNotNullParameter(planId, "planId");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    vkm.d dVarB3 = ((ua5.e) bVar3.f252783a).b(planId, loadingStrategy2);
                    bVar3.getClass();
                    Intrinsics.checkNotNullParameter(planId, "planId");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    t38.e eVarM = u0.m(dVarB3, nim.a.v(boh.f.e(((ua5.e) bVar3.f252783a).b(planId, loadingStrategy2), new r38.m(bVar3, 28)), new r7i.r(i5)));
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector10, eVarM, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                yd8.h hVar = (yd8.h) obj3;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector11 = (FlowCollector) this.f310915w;
                    if (((Boolean) this.f310916x).booleanValue()) {
                        fe8.i iVar = (fe8.i) ((fe8.a) hVar.f312645a.e);
                        x4l.c cVar = iVar.f134472g;
                        Unit unit = Unit.f186387a;
                        gVar3 = mo3.a.f(cVar.c(unit, iVar.f.a(unit, true)), yd8.e.f312643a, new yd8.d(), yd8.f.f312644a);
                    } else {
                        gVar3 = new go.g(zhm.f0.f322471a, 2);
                    }
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector11, gVar3, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                yd8.n nVar = (yd8.n) obj3;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector12 = (FlowCollector) this.f310915w;
                    Flow flowF = ((Boolean) this.f310916x).booleanValue() ? mo3.a.f(boh.f.e(vkm.q.q(nim.a.v(((nj8.n) nVar.f312654c).k(null, loadingStrategy2), new a0(23))), new y8a.h(nVar, 24)), yd8.l.f312650a, new g17.i(nVar, 6), yd8.m.f312651a) : new go.g(zhm.f0.f322471a, 2);
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector12, flowF, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                ydg.g gVar5 = (ydg.g) obj3;
                TravelHotelsRoomDetailsAmendmentScreenContract$InputData travelHotelsRoomDetailsAmendmentScreenContract$InputData = gVar5.o;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector13 = (FlowCollector) this.f310915w;
                    w4l.k loadingStrategy5 = (w4l.k) this.f310916x;
                    i9g.h hVar2 = gVar5.f312694p;
                    qei.g params = new qei.g(travelHotelsRoomDetailsAmendmentScreenContract$InputData.f93997a, travelHotelsRoomDetailsAmendmentScreenContract$InputData.f93998b, travelHotelsRoomDetailsAmendmentScreenContract$InputData.f93999c);
                    List selectedBeds = zhm.u.c(travelHotelsRoomDetailsAmendmentScreenContract$InputData.d);
                    hVar2.getClass();
                    Intrinsics.checkNotNullParameter(params, "params");
                    Intrinsics.checkNotNullParameter(selectedBeds, "selectedBeds");
                    Intrinsics.checkNotNullParameter(loadingStrategy5, "loadingStrategy");
                    Intrinsics.checkNotNullParameter(params, "params");
                    Intrinsics.checkNotNullParameter(loadingStrategy5, "loadingStrategy");
                    fag.o oVar = hVar2.f159796a;
                    Intrinsics.checkNotNullParameter(params, "params");
                    Intrinsics.checkNotNullParameter(loadingStrategy5, "loadingStrategy");
                    akg.n nVarV = nim.a.v(nim.a.v(oVar.f133354c.b(params, loadingStrategy5), new i6j.p(22)), new i25.e(hVar2, selectedBeds, 11));
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector13, nVarV, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector14 = (FlowCollector) this.f310915w;
                    od0.i iVar2 = (od0.i) this.f310916x;
                    ygf.i iVar3 = (ygf.i) obj3;
                    g9e.a aVar18 = iVar3.f313655p;
                    RecurringPaymentFilter.ByReceiverId byReceiverId = new RecurringPaymentFilter.ByReceiverId(y0.b(iVar3.f313659t.f91944a));
                    n38.a aVar19 = (n38.a) iVar2.g();
                    vkm.d dVarB4 = rd0.e.b(g9e.a.b(aVar18, null, byReceiverId, z0.i(AccountId.Personal.f51414a, aVar19 != null ? l38.a.c(aVar19) : null), 3));
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector14, dVarB4, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector15 = (FlowCollector) this.f310915w;
                    com.revolut.feature.shops.impl.ui.carousel_details.a aVar21 = (com.revolut.feature.shops.impl.ui.carousel_details.a) obj3;
                    r10.d dVar2 = aVar21.o;
                    String carouselId = aVar21.f87152p.f87147a;
                    dVar2.getClass();
                    Intrinsics.checkNotNullParameter(carouselId, "carouselId");
                    sfm.b bVar4 = new sfm.b(((v) dVar2.f250819b).b(), new jeg.h(new je2.d(dVar2, carouselId, i2), 7), 2);
                    Intrinsics.checkNotNullExpressionValue(bVar4, "flatMapObservable(...)");
                    vkm.d dVarB5 = rd0.e.b(bVar4);
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector15, dVarB5, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                ykf.b bVar5 = (ykf.b) obj3;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector16 = (FlowCollector) this.f310915w;
                    yhm.r rVar2 = (yhm.r) this.f310916x;
                    a3 a3Var = (a3) rVar2.f314201a;
                    do3.n nVar2 = (do3.n) rVar2.f314202b;
                    if (((j1) rVar2.f314203c).c() || (str = a3Var.I.f273161a) == null) {
                        fVar = new go.g(zhm.f0.f322471a, 2);
                    } else {
                        efm.r rVarX2 = ((k61.i) bVar5.f314619n).f(str).x();
                        Intrinsics.checkNotNullExpressionValue(rVarX2, "toObservable(...)");
                        fVar = new yi5.f(rd0.e.b(rVarX2), bVar5, a3Var, nVar2, 1);
                    }
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector16, fVar, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.a aVar23 = (com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.a) obj3;
                y yVar = aVar23.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector17 = (FlowCollector) this.f310915w;
                    vkm.d dVarA = aVar23.o.a(new RewardsHubChallengeDetailsParams(((ytj.j) ((j2) yVar.f22677a).getValue()).f316818b, ((ytj.j) ((j2) yVar.f22677a).getValue()).f316819c), loadingStrategy2);
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector17, dVarA, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a aVar25 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a) obj3;
                AsftTimeSlotBookingScreenContract$InputData asftTimeSlotBookingScreenContract$InputData = aVar25.o;
                mti.a aVar26 = aVar25.f98887p;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector18 = (FlowCollector) this.f310915w;
                    aVar26.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    pti.e eVar2 = aVar26.f208843a;
                    eVar2.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    uf0.b bVarG = yh5.b.g(nim.a.v(eVar2.d.b(Unit.f186387a, loadingStrategy), new msb.c(8)), aVar26.a(asftTimeSlotBookingScreenContract$InputData.f98882a, loadingStrategy), mti.n.a(aVar25.f98888q, asftTimeSlotBookingScreenContract$InputData.f98883b), pti.k.a(aVar25.f98890s));
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector18, bVarG, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                String pocketId = (String) this.f310916x;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    yvd.c cVar2 = (yvd.c) obj3;
                    by5.a aVar29 = cVar2.e;
                    StakingPocketService stakingPocketService = cVar2.f;
                    this.f310916x = pocketId;
                    this.f310915w = aVar29;
                    this.v = 1;
                    rewards = stakingPocketService.getRewards(pocketId, this);
                    if (rewards == aVar28) {
                        return aVar28;
                    }
                    aVar = aVar29;
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (by5.a) this.f310915w;
                    yhm.o.b(obj2);
                    rewards = obj2;
                }
                mwd.b rewardsDto = (mwd.b) rewards;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(rewardsDto, "rewardsDto");
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                Intrinsics.checkNotNullParameter(rewardsDto, "rewardsDto");
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                return new vtd.c(mo3.a.o(rewardsDto.getBalance()), rewardsDto.getDaysTillFirstReward(), pocketId);
            case 19:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector19 = (FlowCollector) this.f310915w;
                    yw6.g gVar6 = (yw6.g) obj3;
                    j23.b bVarD2 = yh5.b.d(nim.a.v(((l2) gVar6.o).a(), new r1(8)), rd0.e.b(hng.g.b(((ang.b) gVar6.f317340p).f7765a)));
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector19, bVarD2, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector20 = (FlowCollector) this.f310915w;
                    w4l.k loadingStrategy6 = (w4l.k) this.f310916x;
                    ywg.l lVar2 = (ywg.l) obj3;
                    jul.o oVar2 = lVar2.f317435p;
                    pwg.p params2 = new pwg.p(lVar2.o.f95019a);
                    oVar2.getClass();
                    Intrinsics.checkNotNullParameter(params2, "params");
                    Intrinsics.checkNotNullParameter(loadingStrategy6, "loadingStrategy");
                    swg.f fVar3 = (swg.f) oVar2.f178695b;
                    fVar3.getClass();
                    Intrinsics.checkNotNullParameter(params2, "params");
                    Intrinsics.checkNotNullParameter(loadingStrategy6, "loadingStrategy");
                    vkm.d dVarB6 = fVar3.e.b(params2, loadingStrategy6);
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector20, dVarB6, this) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector21 = (FlowCollector) this.f310915w;
                    ywi.g gVar7 = (ywi.g) obj3;
                    vkm.d dVarB7 = rd0.e.b(nim.a.w(gVar7.f317447p.b(gVar7.f317448q.f99043a), new yv8.j(9)));
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector21, dVarB7, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b bVar6 = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b) obj3;
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector22 = (FlowCollector) this.f310915w;
                    int i114 = 15;
                    Flow flowE3 = boh.f.e(u0.m(rd0.e.b(((xv5.h) bVar6.o).a(a.b.f274717a)), new yph.b(rd0.e.b(bVar6.f71589p.c()), i114)), new yx5.i(bVar6, i21));
                    Flow flowB = bVar6.u.B(yx5.k.f317566a);
                    y69.e eVar3 = new y69.e(bVar6, continuation, 5);
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector22);
                    Object objG = e0.g(this, s1.f290118a, new c1((Function3) eVar3, continuation, i114), flowCollector22, new Flow[]{flowE3, flowB});
                    if (objG != fim.a.COROUTINE_SUSPENDED) {
                        objG = Unit.f186387a;
                    }
                    if (objG != fim.a.COROUTINE_SUSPENDED) {
                        objG = Unit.f186387a;
                    }
                    if (objG == obj4) {
                        return obj4;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector23 = (FlowCollector) this.f310915w;
                    vkm.d dVarB8 = rd0.e.b(((com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c) obj3).o.c());
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector23, dVarB8, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector24 = (FlowCollector) this.f310915w;
                    f1 f1Var = ((com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.a) obj3).f99153p.f120463b;
                    f1Var.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB9 = f1Var.d.b(Unit.f186387a, loadingStrategy);
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector24, dVarB9, this) == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector25 = (FlowCollector) this.f310915w;
                    a3 a3Var2 = (a3) this.f310916x;
                    if (a3Var2 == null) {
                        gVar4 = new go.g(null, 2);
                    } else {
                        String str2 = a3Var2.d;
                        if (str2 == null || d0.W(str2)) {
                            Set set2 = dv9.b.f118061a;
                            gVar4 = new go.g(dv9.b.b(a3Var2, null), 2);
                        } else {
                            gVar4 = rd0.e.e(new wc7.e(mo3.a.g(((yz9.f) obj3).f318057a.c(), null, yz9.d.f318055a, 1), str2, a3Var2, i5), h0.f322473a, new b0(a3Var2, continuation, 9));
                        }
                    }
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector25, gVar4, this) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector26 = (FlowCollector) this.f310915w;
                    String str3 = (String) this.f310916x;
                    z0f.f0 f0Var2 = (z0f.f0) obj3;
                    u51.a aVar37 = f0Var2.f318253q;
                    TopupMethodsScreenContract$InputData topupMethodsScreenContract$InputData = f0Var2.o;
                    wkm.l lVarJ = ((e0f.r1) aVar37).j(str3, topupMethodsScreenContract$InputData.f91103b, ((z0f.q) ((j2) f0Var2.A.f22677a).getValue()).f ? loadingStrategy2 : loadingStrategy, topupMethodsScreenContract$InputData.d, topupMethodsScreenContract$InputData.e);
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector26, lVarJ, this) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector27 = (FlowCollector) this.f310915w;
                    com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f fVar4 = (com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f) obj3;
                    r10.a aVar39 = fVar4.f74245r;
                    TaxHubAssessmentScreenContract$InputData taxHubAssessmentScreenContract$InputData = fVar4.f74243p;
                    String taxCalendarEventId = taxHubAssessmentScreenContract$InputData.f74235a;
                    ds6.j taxType = taxHubAssessmentScreenContract$InputData.f74236b;
                    aVar39.getClass();
                    Intrinsics.checkNotNullParameter(taxCalendarEventId, "taxCalendarEventId");
                    Intrinsics.checkNotNullParameter(taxType, "taxType");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    vkm.d dVarX = ((zjh.f) aVar39.f250811a).x(taxType, loadingStrategy2);
                    r10.d dVar3 = (r10.d) aVar39.f250812b;
                    Intrinsics.checkNotNullParameter(taxCalendarEventId, "taxCalendarEventId");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    c3 c3Var = (c3) dVar3.f250818a;
                    c3Var.getClass();
                    Intrinsics.checkNotNullParameter(taxCalendarEventId, "taxCalendarEventId");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    akg.n nVarV2 = nim.a.v(u0.m(rd0.e.e(nim.a.v(u0.m(dVarX, c3Var.f.b(taxCalendarEventId, loadingStrategy2)), new e2j.i(taxCalendarEventId, i3)), h0.f322473a, new a82.q(i6, i2, continuation)), rd0.e.b(fVar4.f74247t.k(false))), new z1i.l(10));
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector27, nVarV2, this) == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector28 = (FlowCollector) this.f310915w;
                    Set set3 = (Set) this.f310916x;
                    Intrinsics.h(set3);
                    Flow flowA = ((z2d.c) obj3).a(set3);
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector28, flowA, this) == aVar40) {
                        return aVar40;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a aVar41 = (com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a) obj3;
                l35.b bVar7 = aVar41.o;
                y45.i iVar4 = aVar41.f70351p;
                LoanAccountDetailsScreenContract$InputData loanAccountDetailsScreenContract$InputData = aVar41.f70353r;
                fim.a aVar42 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector29 = (FlowCollector) this.f310915w;
                    efm.r rVarA = iVar4.a(loanAccountDetailsScreenContract$InputData.f70343a, loadingStrategy);
                    efm.r rVarB = iVar4.b(loanAccountDetailsScreenContract$InputData.f70343a, w4l.h.f294642c);
                    efm.r rVarK = ((y45.f) bVar7).k(loanAccountDetailsScreenContract$InputData.f70343a, w4l.j.f294644c);
                    efm.r rVarL = ((y45.f) bVar7).l(loanAccountDetailsScreenContract$InputData.f70343a, w4l.j.f294644c);
                    efm.r rVarC = l35.b.c(bVar7, loanAccountDetailsScreenContract$InputData.f70343a);
                    efm.r rVarR = pd.b.r(zi0.c.u(iVar4.b(loanAccountDetailsScreenContract$InputData.f70343a, w4l.h.f294642c), new w(i21)), new z55.v(aVar41, i22));
                    od0.h hVar3 = od0.i.Companion;
                    efm.r map = rVarR.map(new z3e.a(new yea.l(1, hVar3, od0.h.class, "of", "of(Ljava/lang/Object;)Lcom/revolut/core/common/Optional;", 0, 27), i5));
                    hVar3.getClass();
                    efm.r rVarStartWith = map.startWith((efm.w) te0.w.h(od0.i.f224256b));
                    Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                    efm.r rVarFlatMap = m70.a.g(iVar4.a(loanAccountDetailsScreenContract$InputData.f70343a, loadingStrategy), null, null, 3).flatMap(new z3e.a(new z55.v(aVar41, i21), 13));
                    Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
                    vkm.d dVarB10 = rd0.e.b(te0.w.r(rVarA, rVarB, rVarK, rVarL, rVarC, rVarStartWith, rVarFlatMap, rd0.e.c(mo3.a.g(nim.a.u(new y65.l(aVar41, null), rd0.e.b(iVar4.b(loanAccountDetailsScreenContract$InputData.f70343a, w4l.h.f294642c))), null, null, 3), kotlin.coroutines.g.f186406a)));
                    this.f310915w = null;
                    this.f310916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector29, dVarB10, this) == aVar42) {
                        return aVar42;
                    }
                } else {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(yvd.c cVar, Continuation continuation) {
        super(3, continuation);
        this.u = 18;
        this.f310917y = cVar;
    }
}
