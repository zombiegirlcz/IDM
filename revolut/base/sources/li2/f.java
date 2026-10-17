package li2;

import cmf.k;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.revolutpay.api.shared.domain.models.PaymentInitiationParams;
import com.revolut.feature.revolutpay.api.shared.domain.models.PaymentOptionsDiscount;
import com.revolut.feature.revolutpay.api.shared.domain.models.order.CheckoutMode;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.BuyNowPayLater;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.SplitBillPaymentParams;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistData;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistFetchConfig;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistPayload;
import com.revolut.feature.transfer_reasons.impl.data.network.service.TransferReasonsService;
import com.revolut.feature.transfer_reasons.models.interactor.TransferReasonRecipientIdentification;
import com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.feature.workflow.engine.R$string;
import com.revolut.rxdata.core.CompositeException;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import dce.l0;
import dfj.b5;
import dfj.s4;
import e8h.p0;
import et6.a1;
import fag.o0;
import g4b.a0;
import gr.r;
import gr.t;
import gr.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import jgk.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import lld.u;
import lnk.n;
import lr.j;
import lv4.b0;
import m98.m;
import m98.p;
import ma1.o;
import maa.s;
import md8.q;
import nfj.z1;
import nii.y0;
import nii.z;
import pcd.j;
import retrofit2.HttpException;
import retrofit2.Response;
import te0.w;
import vkm.j2;
import vkm.v1;
import vkm.y;
import wkm.l;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f195407w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f195408x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f195409y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f195409y = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                f fVar = new f((Continuation) obj4, (g) this.f195409y, 0);
                fVar.f195407w = (FlowCollector) obj2;
                fVar.f195408x = obj3;
                return fVar.invokeSuspend(Unit.f186387a);
            case 1:
                f fVar2 = new f((Continuation) obj4, (com.revolut.feature.slot_manager.impl.ui.screen.checklist.a) this.f195409y, 1);
                fVar2.f195407w = (FlowCollector) obj2;
                fVar2.f195408x = obj3;
                return fVar2.invokeSuspend(Unit.f186387a);
            case 2:
                f fVar3 = new f((Continuation) obj4, (u) this.f195409y, 2);
                fVar3.f195407w = (FlowCollector) obj2;
                fVar3.f195408x = obj3;
                return fVar3.invokeSuspend(Unit.f186387a);
            case 3:
                f fVar4 = new f((Continuation) obj4, (lmf.d) this.f195409y, 3);
                fVar4.f195407w = (FlowCollector) obj2;
                fVar4.f195408x = obj3;
                return fVar4.invokeSuspend(Unit.f186387a);
            case 4:
                f fVar5 = new f((Continuation) obj4, (ln9.c) this.f195409y, 4);
                fVar5.f195407w = (FlowCollector) obj2;
                fVar5.f195408x = obj3;
                return fVar5.invokeSuspend(Unit.f186387a);
            case 5:
                f fVar6 = new f((Continuation) obj4, (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c) this.f195409y, 5);
                fVar6.f195407w = (FlowCollector) obj2;
                fVar6.f195408x = obj3;
                return fVar6.invokeSuspend(Unit.f186387a);
            case 6:
                f fVar7 = new f((Continuation) obj4, (n) this.f195409y, 6);
                fVar7.f195407w = (FlowCollector) obj2;
                fVar7.f195408x = obj3;
                return fVar7.invokeSuspend(Unit.f186387a);
            case 7:
                f fVar8 = new f((Continuation) obj4, (j) this.f195409y, 7);
                fVar8.f195407w = (FlowCollector) obj2;
                fVar8.f195408x = (Object[]) obj3;
                return fVar8.invokeSuspend(Unit.f186387a);
            case 8:
                f fVar9 = new f((Continuation) obj4, (lal.a) this.f195409y, 8);
                fVar9.f195407w = (FlowCollector) obj2;
                fVar9.f195408x = (Object[]) obj3;
                return fVar9.invokeSuspend(Unit.f186387a);
            case 9:
                f fVar10 = new f((lsf.d) this.f195409y, (Continuation) obj4);
                fVar10.f195408x = (TransferReasonsRequest) obj3;
                return fVar10.invokeSuspend(Unit.f186387a);
            case 10:
                f fVar11 = new f((Continuation) obj4, (lsl.f) this.f195409y, 10);
                fVar11.f195407w = (FlowCollector) obj2;
                fVar11.f195408x = obj3;
                return fVar11.invokeSuspend(Unit.f186387a);
            case 11:
                f fVar12 = new f((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a) this.f195409y, 11);
                fVar12.f195407w = (FlowCollector) obj2;
                fVar12.f195408x = obj3;
                return fVar12.invokeSuspend(Unit.f186387a);
            case 12:
                f fVar13 = new f((Continuation) obj4, (com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a) this.f195409y, 12);
                fVar13.f195407w = (FlowCollector) obj2;
                fVar13.f195408x = obj3;
                return fVar13.invokeSuspend(Unit.f186387a);
            case 13:
                f fVar14 = new f((Continuation) obj4, (b0) this.f195409y, 13);
                fVar14.f195407w = (FlowCollector) obj2;
                fVar14.f195408x = obj3;
                return fVar14.invokeSuspend(Unit.f186387a);
            case 14:
                f fVar15 = new f((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.b) this.f195409y, 14);
                fVar15.f195407w = (FlowCollector) obj2;
                fVar15.f195408x = obj3;
                return fVar15.invokeSuspend(Unit.f186387a);
            case 15:
                f fVar16 = new f((Continuation) obj4, (lw6.e) this.f195409y, 15);
                fVar16.f195407w = (FlowCollector) obj2;
                fVar16.f195408x = obj3;
                return fVar16.invokeSuspend(Unit.f186387a);
            case 16:
                f fVar17 = new f((Continuation) obj4, (ly5.j) this.f195409y, 16);
                fVar17.f195407w = (FlowCollector) obj2;
                fVar17.f195408x = obj3;
                return fVar17.invokeSuspend(Unit.f186387a);
            case 17:
                f fVar18 = new f((Continuation) obj4, (lyd.u) this.f195409y, 17);
                fVar18.f195407w = (FlowCollector) obj2;
                fVar18.f195408x = obj3;
                return fVar18.invokeSuspend(Unit.f186387a);
            case 18:
                f fVar19 = new f((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.a) this.f195409y, 18);
                fVar19.f195407w = (FlowCollector) obj2;
                fVar19.f195408x = obj3;
                return fVar19.invokeSuspend(Unit.f186387a);
            case 19:
                f fVar20 = new f((Continuation) obj4, (m22.g) this.f195409y, 19);
                fVar20.f195407w = (FlowCollector) obj2;
                fVar20.f195408x = obj3;
                return fVar20.invokeSuspend(Unit.f186387a);
            case 20:
                f fVar21 = new f((Continuation) obj4, (m4b.g) this.f195409y, 20);
                fVar21.f195407w = (FlowCollector) obj2;
                fVar21.f195408x = obj3;
                return fVar21.invokeSuspend(Unit.f186387a);
            case 21:
                f fVar22 = new f((Continuation) obj4, (m56.f) this.f195409y, 21);
                fVar22.f195407w = (FlowCollector) obj2;
                fVar22.f195408x = obj3;
                return fVar22.invokeSuspend(Unit.f186387a);
            case 22:
                f fVar23 = new f((Continuation) obj4, (m75.j) this.f195409y, 22);
                fVar23.f195407w = (FlowCollector) obj2;
                fVar23.f195408x = obj3;
                return fVar23.invokeSuspend(Unit.f186387a);
            case 23:
                f fVar24 = new f((Continuation) obj4, (p) this.f195409y, 23);
                fVar24.f195407w = (FlowCollector) obj2;
                fVar24.f195408x = obj3;
                return fVar24.invokeSuspend(Unit.f186387a);
            case 24:
                f fVar25 = new f((Continuation) obj4, (o) this.f195409y, 24);
                fVar25.f195407w = (FlowCollector) obj2;
                fVar25.f195408x = obj3;
                return fVar25.invokeSuspend(Unit.f186387a);
            case 25:
                f fVar26 = new f((Continuation) obj4, (s) this.f195409y, 25);
                fVar26.f195407w = (FlowCollector) obj2;
                fVar26.f195408x = obj3;
                return fVar26.invokeSuspend(Unit.f186387a);
            case 26:
                f fVar27 = new f((Continuation) obj4, (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.d) this.f195409y, 26);
                fVar27.f195407w = (FlowCollector) obj2;
                fVar27.f195408x = obj3;
                return fVar27.invokeSuspend(Unit.f186387a);
            case 27:
                f fVar28 = new f((Continuation) obj4, (q) this.f195409y, 27);
                fVar28.f195407w = (FlowCollector) obj2;
                fVar28.f195408x = obj3;
                return fVar28.invokeSuspend(Unit.f186387a);
            case 28:
                f fVar29 = new f((Continuation) obj4, (mh2.b) this.f195409y, 28);
                fVar29.f195407w = (FlowCollector) obj2;
                fVar29.f195408x = obj3;
                return fVar29.invokeSuspend(Unit.f186387a);
            default:
                f fVar30 = new f((Continuation) obj4, (mh7.c) this.f195409y, 29);
                fVar30.f195407w = (FlowCollector) obj2;
                fVar30.f195408x = obj3;
                return fVar30.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Flow flowC;
        Flow gVar;
        Object tVar;
        lsf.d dVar;
        gsf.o oVar;
        Object transferReasons;
        Flow gVar2;
        Flow flowV;
        Flow gVar3;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.f195407w;
                    akg.n nVarC = ((g) this.f195409y).o.c();
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, nVarC, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.f195407w;
                    lld.c loadingSource = (lld.c) this.f195408x;
                    u uVar = ((com.revolut.feature.slot_manager.impl.ui.screen.checklist.a) this.f195409y).o;
                    uVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingSource, "loadingSource");
                    int i3 = lld.q.f196729a[loadingSource.ordinal()];
                    Continuation continuation = null;
                    if (i3 == 1) {
                        skd.i iVar = uVar.f196735b;
                        SlotChecklistPayload slotChecklistPayload = uVar.f196734a.f87361a;
                        if (slotChecklistPayload instanceof SlotChecklistData) {
                            flowC = ((SlotChecklistData) slotChecklistPayload).f87296c ? new v1(new lld.s(slotChecklistPayload, continuation, 0)) : new y(new lld.s(slotChecklistPayload, continuation, 1), new a07.p(iVar.a(uVar.f196736c.c(slotChecklistPayload), true), 24));
                        } else {
                            if (!(slotChecklistPayload instanceof SlotChecklistFetchConfig)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            SlotChecklistFetchConfig fetchConfig = (SlotChecklistFetchConfig) slotChecklistPayload;
                            Intrinsics.checkNotNullParameter(fetchConfig, "fetchConfig");
                            w4l.i loadingStrategy = w4l.i.f294643c;
                            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                            flowC = iVar.f263836b.c(fetchConfig);
                        }
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        flowC = new v1(new lb0.b0(uVar, continuation, 21));
                    }
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowC, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = (FlowCollector) this.f195407w;
                    Data data = (Data) this.f195408x;
                    if (data.getLoading() || data.getContent() != null) {
                        gVar = new go.g(data, 2);
                    } else {
                        u uVar2 = (u) this.f195409y;
                        SlotChecklistPayload slotChecklistPayload2 = uVar2.f196734a.f87361a;
                        if (slotChecklistPayload2 instanceof SlotChecklistFetchConfig) {
                            skd.i iVar2 = uVar2.f196735b;
                            SlotChecklistFetchConfig fetchConfig2 = (SlotChecklistFetchConfig) slotChecklistPayload2;
                            Intrinsics.checkNotNullParameter(fetchConfig2, "fetchConfig");
                            w4l.i loadingStrategy2 = w4l.i.f294643c;
                            Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                            gVar = iVar2.f263836b.c(fetchConfig2);
                        } else {
                            gVar = new go.g(new Data(null, new RuntimeException("Unable to load checklist"), false, 5, null), 2);
                        }
                    }
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, gVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                lmf.d dVar2 = (lmf.d) this.f195409y;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = (FlowCollector) this.f195407w;
                    k[] elements = {((Boolean) this.f195408x).booleanValue() ? dVar2.u.a(new ah1.p(29)) : null, dVar2.f196993h.a(), dVar2.i.a()};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    ag1.k kVarG = dVar2.g(kotlin.collections.d.L(elements));
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, kVarG, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = (FlowCollector) this.f195407w;
                    Pair pair = (Pair) this.f195408x;
                    String orderToken = (String) pair.f186385a;
                    PaymentMethod.RevolutAccount paymentMethod = (PaymentMethod.RevolutAccount) pair.f186386b;
                    gn9.d dVar3 = (gn9.d) ((ln9.c) this.f195409y).f197135a;
                    dVar3.getClass();
                    Intrinsics.checkNotNullParameter(orderToken, "orderToken");
                    Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                    Flow flowC2 = ((q7c.j) dVar3.f144937b).c(new PaymentInitiationParams(orderToken, paymentMethod, (String) null, (CheckoutMode) null, (String) null, (PaymentOptionsDiscount) null, (List) null, (SplitBillPaymentParams) null, (String) null, (BuyNowPayLater) null, 2044), null);
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, flowC2, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = (FlowCollector) this.f195407w;
                    com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c cVar = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c) this.f195409y;
                    s4 s4Var = cVar.f101456p;
                    String str = cVar.f101460t;
                    b5 b5Var = (b5) s4Var;
                    z1 z1Var = b5Var.f113922b;
                    z1Var.getClass();
                    akg.n nVarV = nim.a.v(t1.E(new v1(new mtj.i(13, z1Var, str, (Continuation) null))), new l0(b5Var, 11));
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, nVarV, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = (FlowCollector) this.f195407w;
                    boolean zBooleanValue = ((Boolean) this.f195408x).booleanValue();
                    n nVar = (n) this.f195409y;
                    x xVar = nVar.f197303p;
                    hha.d plan = nVar.f197307t.f197294a;
                    ejk.e eVar = (ejk.e) xVar;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(plan, "plan");
                    l lVarH = vkm.q.H(new an8.a(eVar, plan, zBooleanValue, (Continuation) null, 3), rd0.e.e(eVar.f126909a.a(plan), h0.f322473a, new ejk.c(3, null)));
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector7, lVarH, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = (FlowCollector) this.f195407w;
                    r rVar = new r(((j) this.f195409y).f199346b, kotlin.collections.d.v0((gr.q[]) ((Object[]) this.f195408x)));
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (flowCollector8.emit(rVar, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = (FlowCollector) this.f195407w;
                    v[] vVarArr = (v[]) ((Object[]) this.f195408x);
                    int length = vVarArr.length;
                    int i59 = 0;
                    while (true) {
                        if (i59 >= length) {
                            int length2 = vVarArr.length;
                            int i66 = 0;
                            while (true) {
                                if (i66 >= length2) {
                                    tVar = gr.s.f145794a;
                                } else if (vVarArr[i66] instanceof gr.s) {
                                    i66++;
                                } else {
                                    int length3 = vVarArr.length;
                                    int i74 = 0;
                                    while (true) {
                                        if (i74 >= length3) {
                                            tVar = new t(new IllegalStateException("Unexpected state"));
                                        } else if (vVarArr[i74] instanceof t) {
                                            ArrayList arrayList = new ArrayList();
                                            for (v vVar : vVarArr) {
                                                t tVar2 = vVar instanceof t ? (t) vVar : null;
                                                Throwable th10 = tVar2 != null ? tVar2.f145795a : null;
                                                if (th10 != null) {
                                                    arrayList.add(th10);
                                                }
                                            }
                                            tVar = new t(arrayList.size() == 1 ? (Throwable) d0.b0(arrayList) : new CompositeException(arrayList));
                                        } else {
                                            i74++;
                                        }
                                    }
                                }
                            }
                        } else if (vVarArr[i59] instanceof gr.u) {
                            tVar = gr.u.f145796a;
                        } else {
                            i59++;
                        }
                    }
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (flowCollector9.emit(tVar, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                TransferReasonsRequest transferReasonsRequest = (TransferReasonsRequest) this.f195408x;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    dVar = (lsf.d) this.f195409y;
                    TransferReasonsService transferReasonsService = dVar.f199679b;
                    Intrinsics.checkNotNullParameter(transferReasonsRequest, "<this>");
                    if (transferReasonsRequest instanceof TransferReasonsRequest.ForTransaction) {
                        TransferReasonsRequest.ForTransaction forTransaction = (TransferReasonsRequest.ForTransaction) transferReasonsRequest;
                        oVar = new gsf.o(forTransaction.f92424a, null, null, null, null, null, null, null, forTransaction.f92425b);
                    } else if (transferReasonsRequest instanceof TransferReasonsRequest.ForTransferWithCountry) {
                        TransferReasonsRequest.ForTransferWithCountry forTransferWithCountry = (TransferReasonsRequest.ForTransferWithCountry) transferReasonsRequest;
                        oVar = new gsf.o(null, Long.valueOf(forTransferWithCountry.f92426a), forTransferWithCountry.f92427b.f306286a, forTransferWithCountry.f92428c.name(), forTransferWithCountry.e, forTransferWithCountry.d, null, null, forTransferWithCountry.f);
                    } else {
                        if (!(transferReasonsRequest instanceof TransferReasonsRequest.ForTransferWithIdentification)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        TransferReasonsRequest.ForTransferWithIdentification forTransferWithIdentification = (TransferReasonsRequest.ForTransferWithIdentification) transferReasonsRequest;
                        Long lValueOf = Long.valueOf(forTransferWithIdentification.f92429a);
                        String str2 = forTransferWithIdentification.f92430b.f306286a;
                        String strName = forTransferWithIdentification.f92431c.name();
                        String str3 = forTransferWithIdentification.e;
                        TransferReasonRecipientIdentification transferReasonRecipientIdentification = forTransferWithIdentification.d;
                        TransferReasonRecipientIdentification.BeneficiaryId beneficiaryId = transferReasonRecipientIdentification instanceof TransferReasonRecipientIdentification.BeneficiaryId ? (TransferReasonRecipientIdentification.BeneficiaryId) transferReasonRecipientIdentification : null;
                        String str4 = beneficiaryId != null ? beneficiaryId.f92422a : null;
                        TransferReasonRecipientIdentification.Code code = transferReasonRecipientIdentification instanceof TransferReasonRecipientIdentification.Code ? (TransferReasonRecipientIdentification.Code) transferReasonRecipientIdentification : null;
                        oVar = new gsf.o(null, lValueOf, str2, strName, str3, null, str4, code != null ? code.f92423a : null, forTransferWithIdentification.f);
                    }
                    this.f195408x = null;
                    this.f195407w = dVar;
                    this.v = 1;
                    transferReasons = transferReasonsService.getTransferReasons(oVar, this);
                    if (transferReasons == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lsf.d dVar4 = (lsf.d) this.f195407w;
                    yhm.o.b(obj2);
                    dVar = dVar4;
                    transferReasons = obj2;
                }
                Response response = (Response) transferReasons;
                dVar.getClass();
                if (response.code() == 204) {
                    gsf.p.INSTANCE.getClass();
                    return io3.h.y(new gsf.p());
                }
                if (!response.isSuccessful()) {
                    throw new HttpException(response);
                }
                gsf.p pVar = (gsf.p) response.body();
                if (pVar != null) {
                    return io3.h.y(pVar);
                }
                throw new IllegalStateException(("POST /payments/reasons returned " + response.code() + " without a body").toString());
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector10 = (FlowCollector) this.f195407w;
                    Optional optional = (Optional) this.f195408x;
                    if (optional.isPresent()) {
                        h1h.b bVar = ((lsl.f) this.f195409y).f199703p;
                        Object obj3 = optional.get();
                        Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                        InvestTransactionsListContract$Disclaimers.INSTANCE.getClass();
                        gVar2 = bVar.b3((InvestTransactionsFilter) obj3, new h1h.c(false, new InvestTransactionsListContract$Disclaimers(false, 13)));
                    } else {
                        gVar2 = new go.g(f0.f322471a, 2);
                    }
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector10, gVar2, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector11 = (FlowCollector) this.f195407w;
                    akg.n nVarV2 = nim.a.v(((a1) ((com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a) this.f195409y).o).a(), lu6.q.f200055a);
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector11, nVarV2, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector12 = (FlowCollector) this.f195407w;
                    com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a aVar14 = (com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a) this.f195409y;
                    long j2 = 1024;
                    Flow flowX1 = aVar14.X1(new y0(null, new z(new TextLocalisedClause(R$string.chooseDocuments_error_file_too_large, zhm.u.c(String.valueOf((((Question.Documents) ((iuh.e) ((j2) aVar14.f168616p.f22677a).getValue()).f168606a).f105614g / j2) / j2)), null, 12), new TextLocalisedClause(R$string.chooseDocuments_error_file_too_large_upload_another, null, null, 14), new TextLocalisedClause(R$string.chooseDocuments_buttons_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5));
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector12, flowX1, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector13 = (FlowCollector) this.f195407w;
                    vl4.g gVar4 = (vl4.g) this.f195408x;
                    b0 b0Var = (b0) this.f195409y;
                    Flow flowF = b0Var.f200288s.F(b0Var.o.f69691a, gVar4.i, gVar4.f290260s, 4);
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector13, flowF, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector14 = (FlowCollector) this.f195407w;
                    com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.b bVar2 = (com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.b) this.f195409y;
                    et6.y0 y0Var = (et6.y0) bVar2.o;
                    w4l.j jVar = w4l.j.f294644c;
                    akg.n nVarV3 = nim.a.v(nim.a.u(new ie6.q(2, 27, null), u0.m(u0.i(y0Var.c(jVar), y0Var.f(jVar), rd0.e.b(whf.b.a(bVar2.f73752q, w.h(bVar2.f73754s), null, null, null, 14))), rd0.e.b(whf.b.a(bVar2.f73752q, w.h(bVar2.f73753r), null, null, null, 14)))), new lsl.b(28));
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector14, nVarV3, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector15 = (FlowCollector) this.f195407w;
                    vkm.d dVarB = rd0.e.b(((ypg.p) ((lw6.e) this.f195409y).o).f(w4l.h.f294642c, pcd.g.f234858b));
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector15, dVarB, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                ly5.j jVar2 = (ly5.j) this.f195409y;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector16 = (FlowCollector) this.f195407w;
                    vkm.d dVarB2 = rd0.e.b(pd.b.r(jVar2.o.c(tzg.a.MAIN_PAGE, xzg.o.CRYPTO), new ghk.x(jVar2, 25)));
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector16, dVarB2, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector17 = (FlowCollector) this.f195407w;
                    AccountId.Joint joint = (AccountId.Joint) this.f195408x;
                    if (joint == null) {
                        flowV = new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
                    } else {
                        lyd.u uVar3 = (lyd.u) this.f195409y;
                        String str5 = joint.f51413b;
                        wsg.b bVar3 = uVar3.f200801a;
                        w4l.i iVar3 = w4l.i.f294643c;
                        flowV = nim.a.v(u0.m(nim.a.v(bVar3.d(str5, iVar3), new lyd.b(6)), nim.a.v(rd0.e.b(((ypg.p) uVar3.f200803c).l(iVar3, new pcd.f(pcd.l0.REGULAR, j.c.f234866a))), new lyd.b(5))), new lyd.b(4));
                    }
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector17, flowV, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector18 = (FlowCollector) this.f195407w;
                    vkm.d dVarB3 = rd0.e.b(((com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.a) this.f195409y).o.c());
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector18, dVarB3, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector19 = (FlowCollector) this.f195407w;
                    mc2.b bVar4 = (mc2.b) ((m22.g) this.f195409y).o;
                    bVar4.getClass();
                    v1 v1Var = new v1(new mc2.a(bVar4, null));
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector19, v1Var, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector20 = (FlowCollector) this.f195407w;
                    w4l.k loadingStrategy3 = (w4l.k) this.f195408x;
                    p2b.i iVar4 = ((m4b.g) this.f195409y).o;
                    iVar4.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    usc.a aVar23 = iVar4.d;
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    p0 p0Var = (p0) aVar23.f282889b;
                    p0Var.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    akg.n nVarV4 = nim.a.v(p0Var.d.b(Unit.f186387a, loadingStrategy3), new p0g.b(11));
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector20, nVarV4, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector21 = (FlowCollector) this.f195407w;
                    w4l.k kVar = (w4l.k) this.f195408x;
                    m56.f fVar = (m56.f) this.f195409y;
                    l lVarX = fVar.f202844p.x(fVar.o.f71807a, kVar);
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector21, lVarX, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector22 = (FlowCollector) this.f195407w;
                    m75.j jVar3 = (m75.j) this.f195409y;
                    vkm.d dVarB4 = rd0.e.b(y45.i.f(jVar3.o, jVar3.f203329s));
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector22, dVarB4, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                p pVar2 = (p) this.f195409y;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector23 = (FlowCollector) this.f195407w;
                    v0b.b bVarG = ta6.a.g(hj8.a.a(pVar2.f203658q, pVar2.f203657p.f76730a, w4l.h.f294642c), rd0.e.b(pVar2.f203659r.k(false)), ((i98.e) pVar2.f203660s).c(false), rd0.e.b(pVar2.f203661t.b(Intrinsics.f((w4l.k) this.f195408x, w4l.i.f294643c))), new m(pVar2, null, 0));
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector23, bVarG, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                o oVar2 = (o) this.f195409y;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector24 = (FlowCollector) this.f195407w;
                    l lVarH2 = vkm.q.H(new ma1.n(oVar2, null), new a0(((ha1.f) oVar2.f203896c).f150353a.C0("KEY_SAVED_CARD_READERS_ID", ha1.f.f150352c), 13));
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector24, lVarH2, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                jpc.e eVar2 = ((s) this.f195409y).o;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector25 = (FlowCollector) this.f195407w;
                    String searchQuery = (String) this.f195408x;
                    vkm.d dVarB5 = rd0.e.b(nim.a.w(((u3a.n) ((d3a.b) eVar2.f177256b)).d(searchQuery, zhm.u.c(d3a.a.APM_PIX), jq9.a.NONE), new s6e.g(22)));
                    akg.n nVarV5 = eVar2.V(w4l.j.f294644c);
                    if (searchQuery == null) {
                        searchQuery = "";
                    }
                    eVar2.getClass();
                    Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                    akg.n nVarV6 = nim.a.v(u0.i(dVarB5, nVarV5, rd0.e.b(nim.a.w(xx9.p.b((xx9.p) eVar2.f177257c, searchQuery), new s6e.g(24)))), maa.p.f203986a);
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector25, nVarV6, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector26 = (FlowCollector) this.f195407w;
                    vkm.d dVarB6 = rd0.e.b(ue0.e.p(nim.a.w(((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.d) this.f195409y).o.f159841a.N.f(Unit.f186387a, true), new o0(7)), h0.f322473a));
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector26, dVarB6, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector27 = (FlowCollector) this.f195407w;
                    w4l.k kVar2 = (w4l.k) this.f195408x;
                    q qVar = (q) this.f195409y;
                    akg.n nVarA = hj8.a.a(qVar.f204515p, qVar.o.f204504a, kVar2);
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector27, nVarA, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector28 = (FlowCollector) this.f195407w;
                    if (((Boolean) this.f195408x).booleanValue()) {
                        mh2.b bVar5 = (mh2.b) this.f195409y;
                        gVar3 = new lkf.v(bVar5.f205374b.b(ApmPaymentAuthorisationPaymentMethod.WERO), bVar5, 12);
                    } else {
                        gVar3 = new go.g(f0.f322471a, 2);
                    }
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector28, gVar3, this) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                mh7.c cVar2 = (mh7.c) this.f195409y;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector29 = (FlowCollector) this.f195407w;
                    Flow flowC3 = ((Boolean) this.f195408x).booleanValue() ? vkm.q.C(ue0.e.R(cVar2.f205421a, "referral_code", wim.z.d(kotlin.jvm.internal.o0.b(String.class))), cVar2.f205423c) : vkm.i.f290039a;
                    this.f195407w = null;
                    this.f195408x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector29, flowC3, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(lsf.d dVar, Continuation continuation) {
        super(3, continuation);
        this.u = 9;
        this.f195409y = dVar;
    }
}
