package qp7;

import android.net.Uri;
import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.data.model.Data;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.apm.breb.impl.ui.register.BrebRegisterScreen;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.reservation.ReservationScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.CoverageDetailsScreen;
import com.revolut.feature.retail.cfd.impl.screens.home.CfdTradingHomeScreen;
import com.revolut.feature.staking.impl.stake.v2.StakeController;
import com.revolut.feature.staking.impl.stake.v2.StakeControllerContract$KeyboardSuggestionParcel;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementsFormat;
import com.revolut.feature.topup_screen.impl.mcy.mcy_exchange_rate.McyExchangeRateScreen;
import com.revolut.feature.wealth.analytics.navigation.ComplexAnalyticsDestination;
import com.revolut.feature.wealth.assetdetails.ui.impl.investments_avg_price.InvestmentsAvgPriceController;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.manage_booking.AsftManageBookingScreen;
import grl.k9;
import java.time.LocalDate;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import pzd.u;
import pzd.v;
import pzd.w;
import pzd.x;
import q97.g3;
import qu4.s;
import r40.x0;
import skm.e0;
import v38.c;
import vkm.j2;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f248303w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f248303w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g((ReservationScreen) this.f248303w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g((q) this.f248303w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            case 2:
                g gVar3 = new g((qpg.b) this.f248303w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
            case 3:
                g gVar4 = new g((qq4.e) this.f248303w, continuation, 3);
                gVar4.v = obj2;
                return gVar4;
            case 4:
                g gVar5 = new g((qq6.c) this.f248303w, continuation, 4);
                gVar5.v = obj2;
                return gVar5;
            case 5:
                g gVar6 = new g((qqe.j) this.f248303w, continuation, 5);
                gVar6.v = obj2;
                return gVar6;
            case 6:
                g gVar7 = new g((CoverageDetailsScreen) this.f248303w, continuation, 6);
                gVar7.v = obj2;
                return gVar7;
            case 7:
                g gVar8 = new g((qtb.g) this.f248303w, continuation, 7);
                gVar8.v = obj2;
                return gVar8;
            case 8:
                g gVar9 = new g((qu8.m) this.f248303w, continuation, 8);
                gVar9.v = obj2;
                return gVar9;
            case 9:
                g gVar10 = new g((AsftManageBookingScreen) this.f248303w, continuation, 9);
                gVar10.v = obj2;
                return gVar10;
            case 10:
                g gVar11 = new g((qv4.n) this.f248303w, continuation, 10);
                gVar11.v = obj2;
                return gVar11;
            case 11:
                g gVar12 = new g((BrebRegisterScreen) this.f248303w, continuation, 11);
                gVar12.v = obj2;
                return gVar12;
            case 12:
                g gVar13 = new g((qw2.i) this.f248303w, continuation, 12);
                gVar13.v = obj2;
                return gVar13;
            case 13:
                g gVar14 = new g((StakeController) this.f248303w, continuation, 13);
                gVar14.v = obj2;
                return gVar14;
            case 14:
                g gVar15 = new g((com.revolut.feature.topup_screen.impl.flows.checkout.flow.e) this.f248303w, continuation, 14);
                gVar15.v = obj2;
                return gVar15;
            case 15:
                g gVar16 = new g((com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e) this.f248303w, continuation, 15);
                gVar16.v = obj2;
                return gVar16;
            case 16:
                g gVar17 = new g((r07.h) this.f248303w, continuation, 16);
                gVar17.v = obj2;
                return gVar17;
            case 17:
                g gVar18 = new g((r0e.m) this.f248303w, continuation, 17);
                gVar18.v = obj2;
                return gVar18;
            case 18:
                return new g((r0e.m) this.v, (StatementPeriod) this.f248303w, continuation, 18);
            case 19:
                g gVar19 = new g((McyExchangeRateScreen) this.f248303w, continuation, 19);
                gVar19.v = obj2;
                return gVar19;
            case 20:
                g gVar20 = new g((r0f.k) this.f248303w, continuation, 20);
                gVar20.v = obj2;
                return gVar20;
            case 21:
                g gVar21 = new g((r12.g) this.f248303w, continuation, 21);
                gVar21.v = obj2;
                return gVar21;
            case 22:
                g gVar22 = new g((r18.m) this.f248303w, continuation, 22);
                gVar22.v = obj2;
                return gVar22;
            case 23:
                return new g((r18.m) this.v, (NaviCommand) this.f248303w, continuation, 23);
            case 24:
                g gVar23 = new g((com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.a) this.f248303w, continuation, 24);
                gVar23.v = obj2;
                return gVar23;
            case 25:
                g gVar24 = new g((r38.l) this.f248303w, continuation, 25);
                gVar24.v = obj2;
                return gVar24;
            case 26:
                g gVar25 = new g((CfdTradingHomeScreen) this.f248303w, continuation, 26);
                gVar25.v = obj2;
                return gVar25;
            case 27:
                g gVar26 = new g((r3k.f) this.f248303w, continuation, 27);
                gVar26.v = obj2;
                return gVar26;
            case 28:
                return new g((x0) this.v, (String) this.f248303w, continuation, 28);
            default:
                g gVar27 = new g((InvestmentsAvgPriceController) this.f248303w, continuation, 29);
                gVar27.v = obj2;
                return gVar27;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g) create((kii.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((g) create((ptb.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((g) create((qui.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((g) create((Alias) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((g) create((d01.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((g) create((w) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((g) create((t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((g) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v85, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        NaviCommand naviCommandA;
        Object value;
        r3k.b bVar;
        Data data;
        hrf.e eVar;
        int i = this.u;
        int i2 = 6;
        int i3 = 16;
        int i5 = 27;
        final int i6 = 1;
        int i21 = 3;
        final int i22 = 0;
        Continuation continuation = null;
        Object obj3 = this.f248303w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ReservationScreen) obj3).T2().y2(aVar.f275445a);
                return Unit.f186387a;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((q) obj3).x2(new qna.p(data2, i21));
                return Unit.f186387a;
            case 2:
                kii.d dVar = (kii.d) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (dVar.d) {
                    qpg.b bVar2 = (qpg.b) obj3;
                    bVar2.getClass();
                    bVar2.T2(new qpg.a(bVar2, null), new yi5.b(i5));
                }
                return Unit.f186387a;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qq4.e eVar2 = (qq4.e) obj3;
                eVar2.H2(eVar2.u, new qna.p(data3, 11));
                return Unit.f186387a;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qq6.c cVar = (qq6.c) obj3;
                cVar.H2(cVar.f248494p, new qna.p(data4, 12));
                return Unit.f186387a;
            case 5:
                Data data5 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qqe.j jVar = (qqe.j) obj3;
                jVar.H2(jVar.f248533r, new qna.p(data5, 13));
                return Unit.f186387a;
            case 6:
                CoverageDetailsScreen coverageDetailsScreen = (CoverageDetailsScreen) obj3;
                ty0.a aVar8 = (ty0.a) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Clause clause = aVar8.f275447c;
                Object obj4 = aVar8.d;
                String str = aVar8.f275445a;
                if (clause instanceof HtmlClause) {
                    qt7.f fVarE3 = coverageDetailsScreen.R2();
                    String str2 = aVar8.f275446b;
                    ((com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.a) fVarE3).I2(new ft7.b(obj4, str2, str), str2);
                } else {
                    ((com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.a) coverageDetailsScreen.R2()).I2(obj4, str);
                }
                return Unit.f186387a;
            case 7:
                ptb.g gVar = (ptb.g) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qtb.g gVar2 = (qtb.g) obj3;
                gVar2.H2(gVar2.f249069s, new qtb.c(new qtb.c(gVar, i6), i22));
                return Unit.f186387a;
            case 8:
                String str3 = (String) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qu8.m mVar = (qu8.m) obj3;
                Uri uriF = ((f80.b) mVar.f249271p).f(a0.F(str3, "#", "?", false));
                if (uriF.getQueryParameter("access_token") != null) {
                    Uri.Builder builderClearQuery = uriF.buildUpon().clearQuery();
                    for (String str4 : uriF.getQueryParameterNames()) {
                        if (!Intrinsics.f(str4, "refresh_token")) {
                            Iterator<String> it8 = uriF.getQueryParameters(str4).iterator();
                            while (it8.hasNext()) {
                                builderClearQuery.appendQueryParameter(str4, it8.next());
                            }
                        }
                    }
                    Uri uriBuild = builderClearQuery.build();
                    Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
                    String string = uriBuild.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    mVar.I2(new qu8.h(string));
                } else if (uriF.getQueryParameter("error") != null) {
                    String queryParameter = uriF.getQueryParameter("error");
                    if (Intrinsics.f(queryParameter, "cancelled")) {
                        mVar.I2(qu8.f.f249265a);
                    } else if (d0.T(qu8.m.f249270t, queryParameter)) {
                        mVar.I2(qu8.i.f249268a);
                    } else {
                        mVar.I2(qu8.g.f249266a);
                    }
                }
                return Unit.f186387a;
            case 9:
                qui.e outputData = (qui.e) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qui.i iVar = ((AsftManageBookingScreen) obj3).P;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                iVar.C2(outputData);
                return Unit.f186387a;
            case 10:
                Data data6 = (Data) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qv4.n nVar = (qv4.n) obj3;
                nVar.H2(nVar.f249533q, new qna.p(data6, 15));
                return Unit.f186387a;
            case 11:
                Alias alias = (Alias) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qw1.g gVarE3 = ((BrebRegisterScreen) obj3).d();
                Intrinsics.h(alias);
                gVarE3.getClass();
                Intrinsics.checkNotNullParameter(alias, "alias");
                gVarE3.H2(gVarE3.f249743s, new ma2.q(gVarE3, alias));
                return Unit.f186387a;
            case 12:
                Data data7 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qw2.i iVar2 = (qw2.i) obj3;
                iVar2.H2(iVar2.f249751q, new qna.p(data7, i3));
                return Unit.f186387a;
            case 13:
                d01.b bVar3 = (d01.b) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qwd.j jVarE3 = ((StakeController) obj3).R2();
                Object obj5 = bVar3.f110279c;
                com.revolut.feature.staking.impl.stake.v2.b bVar4 = (com.revolut.feature.staking.impl.stake.v2.b) jVarE3;
                bVar4.getClass();
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.staking.impl.stake.v2.StakeControllerContract.KeyboardSuggestionParcel");
                bVar4.J.onNext(((StakeControllerContract$KeyboardSuggestionParcel) obj5).f88140a);
                return Unit.f186387a;
            case 14:
                com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar3 = (com.revolut.feature.topup_screen.impl.flows.checkout.flow.e) obj3;
                wwe.a aVar17 = eVar3.f90703q;
                Data data8 = (Data) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Throwable error = data8.getError();
                TopupMethod topupMethod = (TopupMethod) data8.getContent();
                if (error != null && topupMethod == null) {
                    throw error;
                }
                if (topupMethod == null) {
                    aVar17.f300648a.k(null);
                } else {
                    aVar17.f300648a.k(eVar3.f90705s.f(topupMethod));
                }
                return Unit.f186387a;
            case 15:
                Data data9 = (Data) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str5 = (String) data9.getContent();
                if (str5 != null) {
                    com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e eVar4 = (com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e) obj3;
                    eVar4.H2(eVar4.z, new qc0.w(str5, 23));
                }
                return Unit.f186387a;
            case 16:
                Data data10 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r07.h hVar = (r07.h) obj3;
                hVar.H2(hVar.f250719t, new qna.p(data10, 22));
                return Unit.f186387a;
            case 17:
                w wVar = (w) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r0e.m mVar2 = (r0e.m) obj3;
                n0e.b bVar5 = mVar2.f250781q;
                if (wVar instanceof v) {
                    naviCommandA = bVar5.c(null, ((v) wVar).f240980a);
                } else {
                    if (!(wVar instanceof u)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    naviCommandA = bVar5.a(((u) wVar).f240979a);
                }
                mVar2.C1(u0.b(naviCommandA));
                return Unit.f186387a;
            case 18:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                final r0e.m mVar3 = (r0e.m) this.v;
                zxd.c cVar2 = mVar3.o;
                StatementPeriod statementPeriod = (StatementPeriod) obj3;
                LocalDate fromDate = statementPeriod.getStart();
                LocalDate toDate = statementPeriod.getEnd();
                StatementsFormat format = StatementsFormat.PDF;
                ryd.w wVar2 = (ryd.w) cVar2;
                wVar2.getClass();
                Intrinsics.checkNotNullParameter(fromDate, "fromDate");
                Intrinsics.checkNotNullParameter(toDate, "toDate");
                Intrinsics.checkNotNullParameter(format, "format");
                return yji.l.b1(mVar3, new g3(mo3.a.g(byd.g.c(boh.f.e(rd0.e.b(o70.a.f(wVar2.n(2, new ryd.h(wVar2, fromDate, toDate, format, 2)))), new r0e.i(i22)), mVar3.X(), mVar3.f250780p.d(), new Function1() { // from class: r0e.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i22) {
                            case 0:
                                return mVar3.f250780p.c((Throwable) obj6);
                            default:
                                vyd.a aVar23 = mVar3.f250780p;
                                x xVar = (x) obj6;
                                if (xVar instanceof pzd.t) {
                                    return aVar23.b(((pzd.t) xVar).f240978a);
                                }
                                if (xVar instanceof w) {
                                    return aVar23.a();
                                }
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                }, new Function1() { // from class: r0e.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i6) {
                            case 0:
                                return mVar3.f250780p.c((Throwable) obj6);
                            default:
                                vyd.a aVar23 = mVar3.f250780p;
                                x xVar = (x) obj6;
                                if (xVar instanceof pzd.t) {
                                    return aVar23.b(((pzd.t) xVar).f240978a);
                                }
                                if (xVar instanceof w) {
                                    return aVar23.a();
                                }
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                }), null, new qz9.u(i2), 1), 5), null, new g(mVar3, continuation, 17), 3);
            case 19:
                ty0.a aVar23 = (ty0.a) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r0f.i iVarE3 = ((McyExchangeRateScreen) obj3).R2();
                String id10 = aVar23.f275445a;
                r0f.k kVar = (r0f.k) iVarE3;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                kVar.n2(new s(kVar, id10, continuation, i3), new whi.b(i2));
                return Unit.f186387a;
            case 20:
                Data data11 = (Data) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r0f.k kVar2 = (r0f.k) obj3;
                kVar2.H2(kVar2.v, new qna.p(data11, 25));
                return Unit.f186387a;
            case 21:
                t tVar = (t) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y02.c cVar3 = ((r12.g) obj3).d;
                Intrinsics.h(tVar);
                cVar3.T0(tVar);
                return Unit.f186387a;
            case 22:
                Data data12 = (Data) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r18.m mVar4 = (r18.m) obj3;
                mVar4.X2(mVar4.f250923p, new qna.p(data12, i5));
                return Unit.f186387a;
            case 23:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r18.m mVar5 = (r18.m) this.v;
                NaviCommand naviCommand = (NaviCommand) obj3;
                Intrinsics.h(naviCommand);
                BridgeDestination bridgeDestinationB = u0.b(naviCommand);
                r18.d dVar2 = r18.m.Companion;
                return mVar5.A2(bridgeDestinationB);
            case 24:
                Data data13 = (Data) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.a aVar30 = (com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.a) obj3;
                aVar30.H2(aVar30.f74336s, new qna.p(data13, 28));
                return Unit.f186387a;
            case 25:
                Pair pair = (Pair) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                od0.i iVar3 = (od0.i) pair.f186385a;
                n38.a aVar32 = (n38.a) ((od0.i) pair.f186386b).f224257a;
                if (aVar32 != null) {
                    return aVar32.f211925c == n38.q.PENDING ? new go.g(new Data(new v38.d(aVar32), null, false, 6, null), 2) : new go.g(new Data(new v38.a(aVar32), null, false, 6, null), 2);
                }
                r38.l lVar = (r38.l) obj3;
                n38.d0 d0Var = (n38.d0) iVar3.f224257a;
                j2 j2Var = lVar.f251220j;
                c.a aVar33 = c.a.f285856a;
                if (d0Var == null || !d0Var.f211943l) {
                    return d0Var != null ? new go.g(new Data(new v38.b(d0Var), null, false, 6, null), 2) : new go.g(new Data(aVar33, null, false, 6, null), 2);
                }
                if (j2Var.h(new Data(aVar33, null, false, 6, null), new Data(null, null, true, 3, null))) {
                    e0.C(lVar.f, null, null, new r38.f(lVar, d0Var, null), 3);
                }
                return j2Var;
            case 26:
                String menuItemId = (String) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r3b.l lVarE3 = ((CfdTradingHomeScreen) obj3).R2();
                Intrinsics.h(menuItemId);
                com.revolut.feature.retail.cfd.impl.screens.home.a aVar35 = (com.revolut.feature.retail.cfd.impl.screens.home.a) lVarE3;
                aVar35.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (menuItemId.equals("CFD_ANALYTICS_MENU_ITEM_ID")) {
                    ixg.b bVar6 = ixg.b.CFD;
                    ixg.a aVar36 = ixg.a.TOTAL_VALUE;
                    eel.c cVar4 = eel.c.ALL;
                    k9 k9Var = k9.MarginTrading;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    aVar35.C1(new ComplexAnalyticsDestination(null, bVar6, aVar36, cVar4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, 33));
                }
                return Unit.f186387a;
            case 27:
                Pair pair2 = (Pair) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dj0.d dVar3 = (dj0.d) pair2.f186385a;
                Data data14 = (Data) pair2.f186386b;
                j2 j2Var2 = ((r3k.f) obj3).E;
                do {
                    value = j2Var2.getValue();
                    bVar = (r3k.b) value;
                    try {
                        Object content = data14.getContent();
                        if (content != null) {
                            z1k.e eVar5 = (z1k.e) content;
                            eVar = new hrf.e(new hrf.d(eVar5.getTransferLimits().getLower(), eVar5.getTransferLimits().getUpper()), eVar5.getIsDecimalsAllowed(), eVar5.getAmountMultiple());
                        } else {
                            eVar = null;
                        }
                        data = new Data(eVar, data14.getError(), data14.getLoading());
                    } catch (Throwable th10) {
                        data = new Data(null, th10, data14.getLoading());
                    }
                } while (!j2Var2.h(value, r3k.b.a(bVar, null, dVar3, data14, data, 1)));
                return Unit.f186387a;
            case 28:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x0 x0Var = (x0) this.v;
                yo6.d dVar4 = yo6.d.TICKETOR;
                ep6.e eVar6 = ep6.n.Companion;
                yji.l.b1(x0Var, x0Var.u.I1((String) obj3, dVar4, null), null, null, 7);
                return Unit.f186387a;
            default:
                n6 largeActionButtonModel = (n6) this.v;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r4h.f fVar = (r4h.f) ((r4h.c) ((InvestmentsAvgPriceController) obj3).S.getValue());
                fVar.getClass();
                Intrinsics.checkNotNullParameter(largeActionButtonModel, "largeActionButtonModel");
                fVar.C2(aii.q.f5292a);
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f248303w = obj2;
    }
}
