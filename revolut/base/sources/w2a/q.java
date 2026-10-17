package w2a;

import com.google.android.gms.location.DeviceOrientationRequest;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConstants;
import com.revolut.chat.domain.model.TranscriptIdentifier;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.retail.cfd.impl.flows.order.CfdOrderData;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreenContract$InputData;
import com.revolut.feature.retail.salary_account.impl.model.salary_promotion.SalaryPromotionParams;
import com.revolut.feature.retail.salary_account.impl.salary_promotion.SalaryPromotionControllerContract$InputData;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.widgets.api.exception.WidgetNotAvailableException;
import com.revolut.retail.feature.api.SpendingAnalyticsAccount;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.upcoming_payments.UpcomingPaymentsContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$PlanReference;
import et6.r1;
import et6.y0;
import h6e.f;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import s6e.z;
import vkm.d2;
import vkm.h2;
import vkm.j2;
import vkm.q0;
import vkm.s0;
import vkm.v1;
import w4i.d0;
import wj8.c0;
import wna.t;
import wp5.v;
import wp5.x;
import wr1.u;
import x0f.y;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f294001w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f294002x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f294003y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f294003y = obj2;
    }

    private final Object b(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f294001w;
            o7.d dVar = ((wz6.g) this.f294003y).o;
            dVar.getClass();
            w4l.h loadingStrategy = w4l.h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            ugc.g gVar = (ugc.g) ((bgc.e) dVar.f222642b);
            vkm.d dVarG = gVar.g(cgc.o.PRO, loadingStrategy);
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            phc.j jVar = (phc.j) gVar.f280008b;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            akg.n nVarV = nim.a.v(u0.m(dVarG, nim.a.A(jVar.o.b(Unit.f186387a, loadingStrategy), new r1(3))), new eq4.g(dVar, 25));
            this.f294001w = null;
            this.f294002x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, nVarV, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object c(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f294001w;
            Flow flowA = ybl.l.a(((x0l.i) this.f294003y).o, Intrinsics.f((w4l.k) this.f294002x, w4l.i.f294643c), 2);
            this.f294001w = null;
            this.f294002x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, flowA, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                q qVar = new q((Continuation) obj4, (s) this.f294003y, 0);
                qVar.f294001w = (FlowCollector) obj2;
                qVar.f294002x = obj3;
                return qVar.invokeSuspend(Unit.f186387a);
            case 1:
                q qVar2 = new q((Continuation) obj4, (w2b.a) this.f294003y, 1);
                qVar2.f294001w = (FlowCollector) obj2;
                qVar2.f294002x = obj3;
                return qVar2.invokeSuspend(Unit.f186387a);
            case 2:
                q qVar3 = new q((Continuation) obj4, (w2b.h) this.f294003y, 2);
                qVar3.f294001w = (FlowCollector) obj2;
                qVar3.f294002x = obj3;
                return qVar3.invokeSuspend(Unit.f186387a);
            case 3:
                q qVar4 = new q((Continuation) obj4, (d0) this.f294003y, 3);
                qVar4.f294001w = (FlowCollector) obj2;
                qVar4.f294002x = obj3;
                return qVar4.invokeSuspend(Unit.f186387a);
            case 4:
                q qVar5 = new q((Continuation) obj4, (w50.o) this.f294003y, 4);
                qVar5.f294001w = (FlowCollector) obj2;
                qVar5.f294002x = obj3;
                return qVar5.invokeSuspend(Unit.f186387a);
            case 5:
                q qVar6 = new q((Continuation) obj4, (w56.p) this.f294003y, 5);
                qVar6.f294001w = (FlowCollector) obj2;
                qVar6.f294002x = obj3;
                return qVar6.invokeSuspend(Unit.f186387a);
            case 6:
                q qVar7 = new q((Continuation) obj4, (w75.l) this.f294003y, 6);
                qVar7.f294001w = (FlowCollector) obj2;
                qVar7.f294002x = obj3;
                return qVar7.invokeSuspend(Unit.f186387a);
            case 7:
                q qVar8 = new q((Continuation) obj4, (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c) this.f294003y, 7);
                qVar8.f294001w = (FlowCollector) obj2;
                qVar8.f294002x = obj3;
                return qVar8.invokeSuspend(Unit.f186387a);
            case 8:
                q qVar9 = new q((Continuation) obj4, (w86.k) this.f294003y, 8);
                qVar9.f294001w = (FlowCollector) obj2;
                qVar9.f294002x = obj3;
                return qVar9.invokeSuspend(Unit.f186387a);
            case 9:
                q qVar10 = new q((Continuation) obj4, (w8l.j) this.f294003y, 9);
                qVar10.f294001w = (FlowCollector) obj2;
                qVar10.f294002x = obj3;
                return qVar10.invokeSuspend(Unit.f186387a);
            case 10:
                q qVar11 = new q((Continuation) obj4, (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) this.f294003y, 10);
                qVar11.f294001w = (FlowCollector) obj2;
                qVar11.f294002x = obj3;
                return qVar11.invokeSuspend(Unit.f186387a);
            case 11:
                q qVar12 = new q((Continuation) obj4, (com.revolut.feature.retail.salary_account.impl.salary_promotion.b) this.f294003y, 11);
                qVar12.f294001w = (FlowCollector) obj2;
                qVar12.f294002x = obj3;
                return qVar12.invokeSuspend(Unit.f186387a);
            case 12:
                q qVar13 = new q((Continuation) obj4, (wha.e) this.f294003y, 12);
                qVar13.f294001w = (FlowCollector) obj2;
                qVar13.f294002x = obj3;
                return qVar13.invokeSuspend(Unit.f186387a);
            case 13:
                q qVar14 = new q((Continuation) obj4, (wha.l) this.f294003y, 13);
                qVar14.f294001w = (FlowCollector) obj2;
                qVar14.f294002x = obj3;
                return qVar14.invokeSuspend(Unit.f186387a);
            case 14:
                q qVar15 = new q((Continuation) obj4, (wid.c) this.f294003y, 14);
                qVar15.f294001w = (FlowCollector) obj2;
                qVar15.f294002x = obj3;
                return qVar15.invokeSuspend(Unit.f186387a);
            case 15:
                q qVar16 = new q((Continuation) obj4, (c0) this.f294003y, 15);
                qVar16.f294001w = (FlowCollector) obj2;
                qVar16.f294002x = obj3;
                return qVar16.invokeSuspend(Unit.f186387a);
            case 16:
                q qVar17 = new q((Continuation) obj4, (wkf.d) this.f294003y, 16);
                qVar17.f294001w = (FlowCollector) obj2;
                qVar17.f294002x = obj3;
                return qVar17.invokeSuspend(Unit.f186387a);
            case 17:
                q qVar18 = new q((Continuation) obj4, (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.a) this.f294003y, 17);
                qVar18.f294001w = (FlowCollector) obj2;
                qVar18.f294002x = obj3;
                return qVar18.invokeSuspend(Unit.f186387a);
            case 18:
                q qVar19 = new q((Continuation) obj4, (t) this.f294003y, 18);
                qVar19.f294001w = (FlowCollector) obj2;
                qVar19.f294002x = obj3;
                return qVar19.invokeSuspend(Unit.f186387a);
            case 19:
                q qVar20 = new q((Continuation) obj4, (toh.d) this.f294003y, 19);
                qVar20.f294001w = (FlowCollector) obj2;
                qVar20.f294002x = obj3;
                return qVar20.invokeSuspend(Unit.f186387a);
            case 20:
                q qVar21 = new q((wqj.j) this.f294003y, (Continuation) obj4, 20);
                qVar21.f294001w = (wqj.d) obj2;
                qVar21.f294002x = (lzi.n) obj3;
                return qVar21.invokeSuspend(Unit.f186387a);
            case 21:
                q qVar22 = new q((Continuation) obj4, (u) this.f294003y, 21);
                qVar22.f294001w = (FlowCollector) obj2;
                qVar22.f294002x = obj3;
                return qVar22.invokeSuspend(Unit.f186387a);
            case 22:
                q qVar23 = new q((Continuation) obj4, (wrj.l) this.f294003y, 22);
                qVar23.f294001w = (FlowCollector) obj2;
                qVar23.f294002x = obj3;
                return qVar23.invokeSuspend(Unit.f186387a);
            case 23:
                q qVar24 = new q(this.f294003y, (Continuation) obj4, 23);
                qVar24.f294001w = (FlowCollector) obj2;
                qVar24.f294002x = (Throwable) obj3;
                return qVar24.invokeSuspend(Unit.f186387a);
            case 24:
                q qVar25 = new q((Continuation) obj4, (wx6.j) this.f294003y, 24);
                qVar25.f294001w = (FlowCollector) obj2;
                qVar25.f294002x = obj3;
                return qVar25.invokeSuspend(Unit.f186387a);
            case 25:
                q qVar26 = new q((Continuation) obj4, (wz1.k) this.f294003y, 25);
                qVar26.f294001w = (FlowCollector) obj2;
                qVar26.f294002x = obj3;
                return qVar26.invokeSuspend(Unit.f186387a);
            case 26:
                q qVar27 = new q((Continuation) obj4, (wz6.g) this.f294003y, 26);
                qVar27.f294001w = (FlowCollector) obj2;
                qVar27.f294002x = obj3;
                return qVar27.invokeSuspend(Unit.f186387a);
            case 27:
                q qVar28 = new q((Continuation) obj4, (y) this.f294003y, 27);
                qVar28.f294001w = (FlowCollector) obj2;
                qVar28.f294002x = obj3;
                return qVar28.invokeSuspend(Unit.f186387a);
            case 28:
                q qVar29 = new q((Continuation) obj4, (x0l.i) this.f294003y, 28);
                qVar29.f294001w = (FlowCollector) obj2;
                qVar29.f294002x = obj3;
                return qVar29.invokeSuspend(Unit.f186387a);
            default:
                q qVar30 = new q((Continuation) obj4, (com.revolut.feature.defi.accounts.impl.ui.extension.a) this.f294003y, 29);
                qVar30.f294001w = (FlowCollector) obj2;
                qVar30.f294002x = obj3;
                return qVar30.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        vkm.d dVarB;
        Flow gVar;
        Object obj3;
        Flow gVar2;
        Object obj4;
        Continuation continuation;
        Flow gVar3;
        Flow gVar4;
        Flow flowV;
        long j2;
        long j3;
        zpj.a aVar;
        String str;
        zpj.a aVar2;
        String str2;
        Flow gVar5;
        int i = this.u;
        int i2 = 22;
        int i3 = 25;
        int i5 = 10;
        int i6 = 5;
        w4l.h loadingStrategy = w4l.h.f294642c;
        int i21 = 11;
        w4l.i loadingStrategy2 = w4l.i.f294643c;
        int i22 = 2;
        Object obj5 = this.f294003y;
        int i32 = 1;
        switch (i) {
            case 0:
                s sVar = (s) obj5;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.f294001w;
                    wkm.l lVarQ = vkm.q.Q(sVar.f294007r.B(r.f294004a), new mki.d((Continuation) null, sVar, i3));
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, lVarQ, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.f294001w;
                    CfdOrderData cfdOrderData = (CfdOrderData) this.f294002x;
                    w2b.a aVar5 = (w2b.a) obj5;
                    vrl.s sVar2 = (vrl.s) aVar5.d;
                    w2b.d dVar = (w2b.d) aVar5.f294009b;
                    akg.n nVarV = nim.a.v(rd0.e.b(sVar2.a(dVar.f294015c, dVar.f294014b.f214596b, cfdOrderData.f82169a, (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? null : Boolean.FALSE, null, (56 & 64) != 0 ? w4l.h.f294642c : w4l.j.f294644c)), new ro7.n(cfdOrderData, 18));
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, nVarV, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = (FlowCollector) this.f294001w;
                    CfdOrderData cfdOrderData2 = (CfdOrderData) this.f294002x;
                    w2b.h hVar = (w2b.h) obj5;
                    vrl.s sVar3 = hVar.e;
                    w2b.d dVar2 = hVar.f294020a;
                    vkm.d dVarB2 = rd0.e.b(sVar3.a(dVar2.f294015c, dVar2.f294014b.f214596b, cfdOrderData2.f82169a, (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? null : Boolean.FALSE, null, (56 & 64) != 0 ? w4l.h.f294642c : w4l.i.f294643c));
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarB2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = (FlowCollector) this.f294001w;
                    v1 v1Var = new v1(new w3k.i((d0) obj5, (Continuation) null, 4));
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, v1Var, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = (FlowCollector) this.f294001w;
                    TranscriptIdentifier identifier = (TranscriptIdentifier) this.f294002x;
                    t1j.b bVar = ((w50.o) obj5).f294665l;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(identifier, "identifier");
                    c30.h hVar2 = (c30.h) bVar.f267380b;
                    hVar2.getClass();
                    Intrinsics.checkNotNullParameter(identifier, "identifier");
                    ConcurrentHashMap concurrentHashMap = hVar2.f20851g;
                    Object objM = concurrentHashMap.get(identifier);
                    Continuation continuation2 = null;
                    if (objM == null) {
                        MutableStateFlow mutableStateFlowC = hVar2.c(identifier);
                        wkm.l lVarQ2 = vkm.q.Q(mutableStateFlowC, new a67.c(mutableStateFlowC, identifier, hVar2, continuation2, 8));
                        CoroutineScope coroutineScope = hVar2.f20849b;
                        d2.Companion.getClass();
                        objM = vkm.q.M(lVarQ2, coroutineScope, new h2(500L, 0L), 0);
                        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(identifier, objM);
                        if (objPutIfAbsent != null) {
                            objM = objPutIfAbsent;
                        }
                    }
                    Intrinsics.checkNotNullExpressionValue(objM, "getOrPut(...)");
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector5);
                    Object objCollect = ((Flow) objM).collect(new s0(flowCollector5, identifier, i6), this);
                    if (objCollect != aVar8) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar8) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = (FlowCollector) this.f294001w;
                    w56.p pVar = (w56.p) obj5;
                    wkm.l lVarP = r10.t.p(pVar.o, ((w56.g) ((j2) pVar.f294716t.f22677a).getValue()).f294701a);
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, lVarP, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = (FlowCollector) this.f294001w;
                    w75.l lVar = (w75.l) obj5;
                    vkm.d dVarB3 = rd0.e.b(((y45.f) lVar.f295480r).l(((w75.e) ((j2) lVar.f295482t.f22677a).getValue()).f295469a, w4l.j.f294644c));
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector7, dVarB3, this) == aVar10) {
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
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = (FlowCollector) this.f294001w;
                    w4l.k loadingStrategy3 = (w4l.k) this.f294002x;
                    com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c cVar = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c) obj5;
                    c6b.b bVar2 = cVar.f82628p;
                    CobrandedCardsValueReminderScreenContract$InputData cobrandedCardsValueReminderScreenContract$InputData = cVar.o;
                    if (cobrandedCardsValueReminderScreenContract$InputData instanceof CobrandedCardsValueReminderScreenContract$InputData.Downgrade) {
                        CobrandedCardsPlan cobrandedCardsPlan = ((CobrandedCardsValueReminderScreenContract$InputData.Downgrade) cobrandedCardsValueReminderScreenContract$InputData).f82611a;
                        String planId = cobrandedCardsPlan.f82304a;
                        String tier = cobrandedCardsPlan.f82305b;
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        Intrinsics.checkNotNullParameter(tier, "tier");
                        Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                        y5b.p pVar2 = bVar2.f21753a;
                        pVar2.getClass();
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        Intrinsics.checkNotNullParameter(tier, "tier");
                        Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                        dVarB = pVar2.e.b(new Pair(planId, tier), loadingStrategy3);
                    } else {
                        if (!(cobrandedCardsValueReminderScreenContract$InputData instanceof CobrandedCardsValueReminderScreenContract$InputData.Terminate)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String cardId = ((CobrandedCardsValueReminderScreenContract$InputData.Terminate) cobrandedCardsValueReminderScreenContract$InputData).f82613a;
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                        y5b.p pVar3 = bVar2.f21753a;
                        pVar3.getClass();
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                        dVarB = pVar3.f.b(cardId, loadingStrategy3);
                    }
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector8, dVarB, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = (FlowCollector) this.f294001w;
                    vkm.d dVarB4 = rd0.e.b(((w86.k) obj5).o.j0(true, true));
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector9, dVarB4, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector10 = (FlowCollector) this.f294001w;
                    vkm.y yVar = new vkm.y(rd0.e.b(((w8l.j) obj5).o.f277717a.d.f(Unit.f186387a, true)), new v77.c(3, i6, null));
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector10, yVar, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector11 = (FlowCollector) this.f294001w;
                    vkm.d dVarB5 = rd0.e.b(((nyb.o) ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) obj5).u).f(((w4l.k) this.f294002x) instanceof w4l.i));
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector11, dVarB5, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector12 = (FlowCollector) this.f294001w;
                    boolean zBooleanValue = ((Boolean) this.f294002x).booleanValue();
                    com.revolut.feature.retail.salary_account.impl.salary_promotion.b bVar3 = (com.revolut.feature.retail.salary_account.impl.salary_promotion.b) obj5;
                    zgb.a aVar16 = bVar3.o;
                    SalaryPromotionControllerContract$InputData salaryPromotionControllerContract$InputData = bVar3.f83026t;
                    String str3 = salaryPromotionControllerContract$InputData.f83016a;
                    String str4 = salaryPromotionControllerContract$InputData.f83017b;
                    aVar16.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    xgb.a aVar17 = aVar16.f322107a;
                    aVar17.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    q0 q0VarN = rd0.e.n(aVar17.d.b(new SalaryPromotionParams(str3, str4), loadingStrategy2), h0.f322473a);
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector12);
                    Object objCollect2 = q0VarN.collect(new f3d.f(flowCollector12, zBooleanValue, 4), this);
                    if (objCollect2 != aVar15) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 != aVar15) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                wha.e eVar = (wha.e) obj5;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector13 = (FlowCollector) this.f294001w;
                    if (((Boolean) this.f294002x).booleanValue()) {
                        gVar = new v0b.b(zi0.c.w(u0.m(((et6.g) eVar.f297451a).d(loadingStrategy), nim.a.A(nim.a.v(((y0) eVar.f297452b).b(), wha.b.f297446a), wha.c.f297447a))), eVar, 21);
                        obj3 = null;
                    } else {
                        obj3 = null;
                        gVar = new go.g(null, 2);
                    }
                    this.f294001w = obj3;
                    this.f294002x = obj3;
                    this.v = 1;
                    if (vkm.q.u(flowCollector13, gVar, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                wha.l lVar2 = (wha.l) obj5;
                g6e.d dVar3 = lVar2.d;
                SubaccountType subaccountType = lVar2.f297472a;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector14 = (FlowCollector) this.f294001w;
                    Data data = (Data) this.f294002x;
                    Throwable error = data.getError();
                    if (error != null) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                    }
                    FreelancerAccountOnboardingState freelancerAccountOnboardingState = (FreelancerAccountOnboardingState) data.getContent();
                    if (freelancerAccountOnboardingState == null || !(freelancerAccountOnboardingState instanceof FreelancerAccountOnboardingState.Onboarded) || com.revolut.feature.freelancer.common.models.a.b(freelancerAccountOnboardingState)) {
                        obj4 = null;
                        gVar2 = new go.g(null, 2);
                    } else {
                        if (subaccountType.equals(SubaccountType.Pro.f88964a)) {
                            gVar2 = new wha.j(zi0.c.w(((z) dVar3).g()), lVar2, 0);
                        } else {
                            if (!subaccountType.equals(SubaccountType.ProTax.f88965a)) {
                                throw new IllegalArgumentException("Given " + subaccountType + " is not a Pro subaccount type.");
                            }
                            z zVar = (z) dVar3;
                            gVar2 = new wha.j(zi0.c.w(u0.m(zVar.g(), zVar.w(f.g.f149642a, loadingStrategy))), lVar2, 1);
                        }
                        obj4 = null;
                    }
                    this.f294001w = obj4;
                    this.f294002x = obj4;
                    this.v = 1;
                    if (vkm.q.u(flowCollector14, gVar2, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector15 = (FlowCollector) this.f294001w;
                    Instant instant = (Instant) this.f294002x;
                    if (instant != null) {
                        wid.b bVar4 = wid.c.Companion;
                        continuation = null;
                        gVar3 = new v1(new b6i.d0((wid.c) obj5, instant, continuation, i21));
                    } else {
                        continuation = null;
                        gVar3 = new go.g(new wid.a(0L, false), 2);
                    }
                    this.f294001w = continuation;
                    this.f294002x = continuation;
                    this.v = 1;
                    if (vkm.q.u(flowCollector15, gVar3, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector16 = (FlowCollector) this.f294001w;
                    c0 c0Var = (c0) obj5;
                    akg.n nVarA = hj8.a.a(c0Var.f297999p, c0Var.o.f298008a, (w4l.k) this.f294002x);
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector16, nVarA, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector17 = (FlowCollector) this.f294001w;
                    Pair pair = (Pair) this.f294002x;
                    String transactionId = (String) pair.f186385a;
                    wkf.d dVar4 = (wkf.d) obj5;
                    if (((Boolean) pair.f186386b).booleanValue()) {
                        dVar4.getClass();
                        gVar4 = new go.g(f0.f322471a, 2);
                    } else {
                        ti9.g gVar6 = (ti9.g) dVar4.f298277n;
                        gVar6.getClass();
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        gVar4 = new wc7.e(rd0.e.b(nim.a.w(kli.a.h(pd.b.r(nim.a.w(gVar6.n(), new te8.a(transactionId, i6)), new s06.e(gVar6, 28, transactionId, loadingStrategy)), gVar6.i()), new tfh.a(i21))), 3, dVar4, transactionId);
                    }
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector17, gVar4, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.a aVar23 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.a) obj5;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector18 = (FlowCollector) this.f294001w;
                    PlanBenefitsScreenContract$PlanReference planBenefitsScreenContract$PlanReference = aVar23.o.f103457a;
                    if (planBenefitsScreenContract$PlanReference instanceof PlanBenefitsScreenContract$PlanReference.Id) {
                        flowV = zi0.c.i(((PlanBenefitsScreenContract$PlanReference.Id) planBenefitsScreenContract$PlanReference).f103461a);
                    } else {
                        if (!(planBenefitsScreenContract$PlanReference instanceof PlanBenefitsScreenContract$PlanReference.Tier)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        flowV = nim.a.v(com.revolut.data.database.models.openbanking.d.y("PlanBenefitsScreenModel", "observePricingPlanByTier", aVar23.f103466r.k(((PlanBenefitsScreenContract$PlanReference.Tier) planBenefitsScreenContract$PlanReference).f103462a)), new wje.m(i2));
                    }
                    Flow flowE = boh.f.e(flowV, new wkk.i(aVar23));
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector18, flowE, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector19 = (FlowCollector) this.f294001w;
                    ((Boolean) this.f294002x).getClass();
                    akg.n nVarA2 = ((t) obj5).f298765r.a();
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector19, nVarA2, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector20 = (FlowCollector) this.f294001w;
                    xi0.b bVar5 = (xi0.b) this.f294002x;
                    xi0.b.Companion.getClass();
                    Long l2 = (Intrinsics.f(bVar5, xi0.b.f306282t) || Intrinsics.f(bVar5, xi0.b.f306277n)) ? new Long(100000L) : Intrinsics.f(bVar5, xi0.b.C) ? new Long(3000000L) : Intrinsics.f(bVar5, xi0.b.f306280r) ? new Long(200000L) : Intrinsics.f(bVar5, xi0.b.e) ? new Long(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT) : Intrinsics.f(bVar5, xi0.b.k) ? new Long(100000L) : Intrinsics.f(bVar5, xi0.b.f) ? new Long(500000L) : (Intrinsics.f(bVar5, xi0.b.f306273h) || Intrinsics.f(bVar5, xi0.b.f306272g)) ? new Long(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT) : Intrinsics.f(bVar5, xi0.b.o) ? new Long(LivenessConstants.MAX_VIDEO_SIZE_BYTES) : Intrinsics.f(bVar5, xi0.b.f306281s) ? new Long(200000L) : (Intrinsics.f(bVar5, xi0.b.f306278p) || Intrinsics.f(bVar5, xi0.b.i)) ? new Long(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT) : null;
                    dj0.d dVar5 = l2 != null ? new dj0.d(l2.longValue(), bVar5) : null;
                    Flow flowI = dVar5 != null ? zi0.c.i(dVar5) : ((smd.s) ((toh.d) obj5).f273215b).d(new dj0.d(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, xi0.b.f306272g));
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector20, flowI, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                wqj.j jVar = (wqj.j) obj5;
                wqj.d dVar6 = (wqj.d) this.f294001w;
                lzi.n nVar = (lzi.n) this.f294002x;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    rqj.h hVar3 = jVar.d;
                    String str5 = dVar6.f299462a;
                    long epochDay = dVar6.f299463b.toEpochDay();
                    long epochDay2 = dVar6.f299464c.toEpochDay();
                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                    List<lzi.p> list = nVar.f200992c;
                    ArrayList arrayList = new ArrayList(w.t(list, 10));
                    for (lzi.p pVar4 : list) {
                        String str6 = nVar.f200990a;
                        rqj.h hVar4 = hVar3;
                        long epochDay3 = pVar4.f200995a.toEpochDay();
                        LocalDate localDate = pVar4.f200996b;
                        Long lValueOf = localDate != null ? Long.valueOf(localDate.toEpochDay()) : null;
                        lzi.h hVar5 = pVar4.f200997c;
                        Intrinsics.checkNotNullParameter(hVar5, "<this>");
                        String str7 = str5;
                        if (hVar5 instanceof lzi.g) {
                            j2 = epochDay;
                            aVar2 = new zpj.a(null, "WEEKLY", qk.d.J(((lzi.g) hVar5).f200979a), null);
                            j3 = epochDay2;
                        } else {
                            j2 = epochDay;
                            if (hVar5 instanceof lzi.c) {
                                lzi.c cVar2 = (lzi.c) hVar5;
                                Integer numValueOf = Integer.valueOf(cVar2.f200975a);
                                int i113 = aqj.a.f8469b[cVar2.f200976b.ordinal()];
                                if (i113 == 1) {
                                    str2 = "EXACT";
                                } else if (i113 == 2) {
                                    str2 = "BEFORE_WEEKEND";
                                } else {
                                    if (i113 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    str2 = "AFTER_WEEKEND";
                                }
                                j3 = epochDay2;
                                aVar = new zpj.a(numValueOf, "MONTHLY_BY_DAY", null, str2);
                            } else {
                                j3 = epochDay2;
                                if (!(hVar5 instanceof lzi.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                lzi.e eVar2 = (lzi.e) hVar5;
                                String strJ = qk.d.J(eVar2.f200977a);
                                int i114 = aqj.a.f8470c[eVar2.f200978b.ordinal()];
                                if (i114 == 1) {
                                    str = "FIRST";
                                } else {
                                    if (i114 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    str = "LAST";
                                }
                                aVar = new zpj.a(null, "MONTHLY_BY_WEEKDAY", strJ, str);
                            }
                            aVar2 = aVar;
                        }
                        dj0.d dVar7 = pVar4.d;
                        String str8 = dVar7.f115083b.f306286a;
                        long j5 = dVar7.f115082a;
                        ArrayList arrayList2 = pVar4.e;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        Iterator it8 = arrayList2.iterator();
                        while (it8.hasNext()) {
                            lzi.o oVar = (lzi.o) it8.next();
                            arrayList3.add(new tqj.c(oVar.f200993a, oVar.f200994b.f115082a));
                            it8 = it8;
                            str8 = str8;
                            j5 = j5;
                        }
                        arrayList.add(new tqj.d(str6, epochDay3, lValueOf, aVar2, str8, j5, arrayList3));
                        hVar3 = hVar4;
                        str5 = str7;
                        epochDay = j2;
                        epochDay2 = j3;
                    }
                    this.f294001w = dVar6;
                    this.f294002x = nVar;
                    this.v = 1;
                    if (hVar3.d(str5, epochDay, epochDay2, arrayList, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                ue0.c cVar3 = jVar.f299477c;
                String str9 = dVar6.e;
                String string = nVar.f200991b.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                cVar3.G(string, str9, wim.z.d(o0.b(String.class)));
                return Unit.f186387a;
            case 21:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector21 = (FlowCollector) this.f294001w;
                    Pair pair2 = (Pair) this.f294002x;
                    Flow flowD = ((u) obj5).f299510s.d((io3.d) pair2.f186385a, (Double) pair2.f186386b);
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector21, flowD, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector22 = (FlowCollector) this.f294001w;
                    wrj.l lVar3 = (wrj.l) obj5;
                    UpcomingPaymentsContract$InputData upcomingPaymentsContract$InputData = lVar3.f299606p;
                    SpendingAnalyticsAccount spendingAnalyticsAccountB = com.revolut.retail.feature.api.a.b(upcomingPaymentsContract$InputData.f101527b);
                    int i117 = 24;
                    efm.r map = m70.a.g(rd0.e.c(((le3.f) lVar3.u).e(zhm.y0.b(spendingAnalyticsAccountB)), kotlin.coroutines.g.f186406a), null, new wm9.k(i117), 1).map(new x(new wrj.i(lVar3, i22), i5));
                    efm.r rVarA = ppg.b.a(lVar3.f299607q, 2);
                    efm.r rVarSwitchMap = map.switchMap(new x(new v(lVar3, spendingAnalyticsAccountB, 12), i21));
                    Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                    efm.r rVarW = nim.a.w(((lmd.j) lVar3.f299609s).a(upcomingPaymentsContract$InputData.f101526a, upcomingPaymentsContract$InputData.f101527b), new wrj.i(lVar3, i32));
                    efm.r map2 = cl3.a.a(lVar3.f299611w).map(new x(new wp5.w(i3), 6));
                    Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                    efm.r rVarOnErrorReturn = ((njf.j) lVar3.f299612x).f().map(new x(new wp5.w(i2), 7)).onErrorReturn(new x(new wp5.w(23), 9));
                    k71.q.Companion.getClass();
                    efm.r rVarStartWith = rVarOnErrorReturn.startWith(new Data(k71.p.a(), null, false, 6, null));
                    Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                    vkm.d dVarB6 = rd0.e.b(nim.a.w(mif.a.g(rVarA, rVarSwitchMap, rVarW, map2, rVarStartWith), new wp5.w(i117)));
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector22, dVarB6, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                FlowCollector flowCollector23 = (FlowCollector) this.f294001w;
                Throwable th10 = (Throwable) this.f294002x;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    if (th10 instanceof WidgetNotAvailableException) {
                        throw th10;
                    }
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (((ww4.e) obj5).invoke(flowCollector23, th10, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector24 = (FlowCollector) this.f294001w;
                    akg.n nVarA3 = ((wx6.j) obj5).o.a();
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector24, nVarA3, this) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                wz1.k kVar = (wz1.k) obj5;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector25 = (FlowCollector) this.f294001w;
                    if (((Boolean) this.f294002x).booleanValue()) {
                        wz1.f fVar = kVar.f301351a;
                        fVar.getClass();
                        gVar5 = mo3.a.e(nim.a.v(fVar.d.b(Unit.f186387a, loadingStrategy2), new wz1.h(kVar)), wz1.i.f301349a, wz1.j.f301350a);
                    } else {
                        gVar5 = new go.g(f0.f322471a, 2);
                    }
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector25, gVar5, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                return b(obj2);
            case 27:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector26 = (FlowCollector) this.f294001w;
                    y yVar2 = (y) obj5;
                    vkm.d dVarB7 = rd0.e.b(((e0f.z) yVar2.f301606p).c(yVar2.o.f91099a, loadingStrategy2));
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector26, dVarB7, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                return c(obj2);
            default:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i122 = this.v;
                if (i122 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector27 = (FlowCollector) this.f294001w;
                    Flow flowA = t46.a.a(((com.revolut.feature.defi.accounts.impl.ui.extension.a) obj5).f71659n, (List) this.f294002x);
                    this.f294001w = null;
                    this.f294002x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector27, flowA, this) == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i122 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f294003y = obj2;
    }
}
