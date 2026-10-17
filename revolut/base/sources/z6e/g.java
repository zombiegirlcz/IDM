package z6e;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.LoanRepaymentBreakdownControllerContract$InputData;
import com.revolut.feature.statements.api.navigation.DocumentsHubType;
import com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreenContract$InputData;
import com.revolut.feature.transactions.impl.chat_widget.TransactionChatWidgetInput;
import com.revolut.feature.widgets.api.exception.WidgetNotAvailableException;
import com.revolut.feature.workflow.engine.shared.data.WorkflowService;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewControllerContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.model.SelectedBillingPlan;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.ProductClosurePrompt;
import et6.a1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nyb.c0;
import oqk.g0;
import skm.p0;
import tof.a3;
import tof.r9;
import tof.t3;
import vge.z2;
import vkm.j2;
import vkm.q0;
import vkm.v1;
import zgj.i0;
import zh9.u0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f319733w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f319734x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f319735y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f319735y = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                g gVar = new g((Continuation) obj4, (k) this.f319735y, 0);
                gVar.f319733w = (FlowCollector) obj2;
                gVar.f319734x = obj3;
                return gVar.invokeSuspend(Unit.f186387a);
            case 1:
                g gVar2 = new g((Continuation) obj4, (r) this.f319735y, 1);
                gVar2.f319733w = (FlowCollector) obj2;
                gVar2.f319734x = obj3;
                return gVar2.invokeSuspend(Unit.f186387a);
            case 2:
                g gVar3 = new g((Continuation) obj4, (u) this.f319735y, 2);
                gVar3.f319733w = (FlowCollector) obj2;
                gVar3.f319734x = obj3;
                return gVar3.invokeSuspend(Unit.f186387a);
            case 3:
                g gVar4 = new g((Continuation) obj4, (x) this.f319735y, 3);
                gVar4.f319733w = (FlowCollector) obj2;
                gVar4.f319734x = obj3;
                return gVar4.invokeSuspend(Unit.f186387a);
            case 4:
                g gVar5 = new g((Continuation) obj4, (a0) this.f319735y, 4);
                gVar5.f319733w = (FlowCollector) obj2;
                gVar5.f319734x = obj3;
                return gVar5.invokeSuspend(Unit.f186387a);
            case 5:
                g gVar6 = new g((Continuation) obj4, (com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.a) this.f319735y, 5);
                gVar6.f319733w = (FlowCollector) obj2;
                gVar6.f319734x = obj3;
                return gVar6.invokeSuspend(Unit.f186387a);
            case 6:
                g gVar7 = new g((gim.i) this.f319735y, (Continuation) obj4);
                gVar7.f319733w = (FlowCollector) obj2;
                gVar7.f319734x = (Throwable) obj3;
                return gVar7.invokeSuspend(Unit.f186387a);
            case 7:
                g gVar8 = new g((Continuation) obj4, (z8b.j) this.f319735y, 7);
                gVar8.f319733w = (FlowCollector) obj2;
                gVar8.f319734x = obj3;
                return gVar8.invokeSuspend(Unit.f186387a);
            case 8:
                g gVar9 = new g((Continuation) obj4, (zaj.l) this.f319735y, 8);
                gVar9.f319733w = (FlowCollector) obj2;
                gVar9.f319734x = obj3;
                return gVar9.invokeSuspend(Unit.f186387a);
            case 9:
                g gVar10 = new g((Continuation) obj4, (com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c) this.f319735y, 9);
                gVar10.f319733w = (FlowCollector) obj2;
                gVar10.f319734x = obj3;
                return gVar10.invokeSuspend(Unit.f186387a);
            case 10:
                g gVar11 = new g((Continuation) obj4, (zf8.k) this.f319735y, 10);
                gVar11.f319733w = (FlowCollector) obj2;
                gVar11.f319734x = obj3;
                return gVar11.invokeSuspend(Unit.f186387a);
            case 11:
                g gVar12 = new g((Continuation) obj4, (zge.i) this.f319735y, 11);
                gVar12.f319733w = (FlowCollector) obj2;
                gVar12.f319734x = obj3;
                return gVar12.invokeSuspend(Unit.f186387a);
            case 12:
                g gVar13 = new g((Continuation) obj4, (zhf.g) this.f319735y, 12);
                gVar13.f319733w = (FlowCollector) obj2;
                gVar13.f319734x = obj3;
                return gVar13.invokeSuspend(Unit.f186387a);
            case 13:
                g gVar14 = new g((Continuation) obj4, (vkm.d) this.f319735y, 13);
                gVar14.f319733w = (FlowCollector) obj2;
                gVar14.f319734x = obj3;
                return gVar14.invokeSuspend(Unit.f186387a);
            case 14:
                g gVar15 = new g((uvl.c) this.f319735y, (Continuation) obj4, 14);
                gVar15.f319733w = (a3) obj2;
                gVar15.f319734x = (t3) obj3;
                return gVar15.invokeSuspend(Unit.f186387a);
            case 15:
                g gVar16 = new g((Continuation) obj4, (zkk.t) this.f319735y, 15);
                gVar16.f319733w = (FlowCollector) obj2;
                gVar16.f319734x = obj3;
                return gVar16.invokeSuspend(Unit.f186387a);
            case 16:
                g gVar17 = new g((Continuation) obj4, (com.revolut.feature.apm.aani.impl.ui.settings.a) this.f319735y, 16);
                gVar17.f319733w = (FlowCollector) obj2;
                gVar17.f319734x = obj3;
                return gVar17.invokeSuspend(Unit.f186387a);
            case 17:
                g gVar18 = new g((Continuation) obj4, (zlb.o) this.f319735y, 17);
                gVar18.f319733w = (FlowCollector) obj2;
                gVar18.f319734x = obj3;
                return gVar18.invokeSuspend(Unit.f186387a);
            case 18:
                g gVar19 = new g((Continuation) obj4, (zmd.o) this.f319735y, 18);
                gVar19.f319733w = (FlowCollector) obj2;
                gVar19.f319734x = obj3;
                return gVar19.invokeSuspend(Unit.f186387a);
            case 19:
                g gVar20 = new g((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) this.f319735y, (Continuation) obj4, 19);
                gVar20.f319733w = (FlowCollector) obj2;
                gVar20.f319734x = (Throwable) obj3;
                return gVar20.invokeSuspend(Unit.f186387a);
            case 20:
                g gVar21 = new g((Continuation) obj4, (znf.c) this.f319735y, 20);
                gVar21.f319733w = (FlowCollector) obj2;
                gVar21.f319734x = obj3;
                return gVar21.invokeSuspend(Unit.f186387a);
            case 21:
                g gVar22 = new g((Continuation) obj4, (zug.i) this.f319735y, 21);
                gVar22.f319733w = (FlowCollector) obj2;
                gVar22.f319734x = obj3;
                return gVar22.invokeSuspend(Unit.f186387a);
            case 22:
                g gVar23 = new g((zuh.o) this.f319735y, (Continuation) obj4, 22);
                gVar23.f319734x = (String) obj3;
                return gVar23.invokeSuspend(Unit.f186387a);
            case 23:
                g gVar24 = new g((Continuation) obj4, (com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a) this.f319735y, 23);
                gVar24.f319733w = (FlowCollector) obj2;
                gVar24.f319734x = obj3;
                return gVar24.invokeSuspend(Unit.f186387a);
            case 24:
                g gVar25 = new g((Continuation) obj4, (zx6.o) this.f319735y, 24);
                gVar25.f319733w = (FlowCollector) obj2;
                gVar25.f319734x = obj3;
                return gVar25.invokeSuspend(Unit.f186387a);
            case 25:
                g gVar26 = new g((Continuation) obj4, (zzb.t) this.f319735y, 25);
                gVar26.f319733w = (FlowCollector) obj2;
                gVar26.f319734x = obj3;
                return gVar26.invokeSuspend(Unit.f186387a);
            default:
                g gVar27 = new g((Continuation) obj4, (com.revolut.feature.statements.impl.ui.documents_hub.a) this.f319735y, 26);
                gVar27.f319733w = (FlowCollector) obj2;
                gVar27.f319734x = obj3;
                return gVar27.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r15v7, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Flow flowV;
        Flow gVar;
        zjh.c cVar;
        Object productObstacles;
        akg.n nVarV;
        Flow uVar;
        int i = this.u;
        int i2 = 13;
        int i3 = 5;
        int i5 = 7;
        w4l.h hVar = w4l.h.f294642c;
        int i6 = 16;
        w4l.i loadingStrategy = w4l.i.f294643c;
        int i21 = 3;
        int i22 = 4;
        int i32 = 2;
        Continuation continuation = null;
        Object obj3 = this.f319735y;
        int i33 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.f319733w;
                    vkm.d dVarB = rd0.e.b(((g0) ((k) obj3).f319743c).d((Data) this.f319734x, false));
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, dVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.f319733w;
                    vkm.d dVarB2 = rd0.e.b(((g0) ((r) obj3).f319759c).d((Data) this.f319734x, false));
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = (FlowCollector) this.f319733w;
                    vkm.d dVarB3 = rd0.e.b(((g0) ((u) obj3).e).d((Data) this.f319734x, false));
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarB3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = (FlowCollector) this.f319733w;
                    vkm.d dVarB4 = rd0.e.b(((g0) ((x) obj3).f319771c).d((Data) this.f319734x, false));
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, dVarB4, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = (FlowCollector) this.f319733w;
                    vkm.d dVarB5 = rd0.e.b(((g0) ((a0) obj3).f319721c).d((Data) this.f319734x, false));
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, dVarB5, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = (FlowCollector) this.f319733w;
                    com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.a aVar7 = (com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.a) obj3;
                    LoanRepaymentAccountModelExtension loanRepaymentAccountModelExtension = aVar7.f70530t;
                    LoanRepaymentBreakdownControllerContract$InputData loanRepaymentBreakdownControllerContract$InputData = aVar7.o;
                    wkm.l lVarC3 = loanRepaymentAccountModelExtension.c3(loanRepaymentBreakdownControllerContract$InputData.f70521a, loanRepaymentBreakdownControllerContract$InputData.f);
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, lVarC3, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                FlowCollector flowCollector7 = (FlowCollector) this.f319733w;
                Throwable th10 = (Throwable) this.f319734x;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    if (th10 instanceof WidgetNotAvailableException) {
                        throw th10;
                    }
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (((gim.i) obj3).invoke(flowCollector7, th10, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = (FlowCollector) this.f319733w;
                    x8b.d dVar = ((z8b.j) obj3).f320063p;
                    akg.n nVarV2 = nim.a.v(vkm.q.Q(rd0.e.b(xv5.c.b(dVar.f303311c)), new x18.e(continuation, dVar, i21)), new x0b.c(dVar, 26));
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector8, nVarV2, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = (FlowCollector) this.f319733w;
                    w4l.k loadingStrategy2 = (w4l.k) this.f319734x;
                    zaj.l lVar = (zaj.l) obj3;
                    waj.a aVar11 = lVar.f320732p;
                    String currencyCode = lVar.o.f100032a;
                    aVar11.getClass();
                    Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    akg.n nVarV3 = nim.a.v(aVar11.d.b(Unit.f186387a, loadingStrategy2), new vb2.r(currencyCode, 28));
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector9, nVarV3, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c cVar2 = (com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c) obj3;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector10 = (FlowCollector) this.f319733w;
                    rbj.l lVar2 = cVar2.f100091s;
                    CryptoDepositsOverviewControllerContract$InputData inputData = cVar2.f100090r;
                    efm.r contactsPermissionsGrantedObservable = ((pn3.b) cVar2.f100092t).b();
                    j2 userSelectedBlockchainFlow = cVar2.E;
                    lVar2.getClass();
                    Intrinsics.checkNotNullParameter(inputData, "inputData");
                    Intrinsics.checkNotNullParameter(contactsPermissionsGrantedObservable, "contactsPermissionsGrantedObservable");
                    Intrinsics.checkNotNullParameter(userSelectedBlockchainFlow, "userSelectedBlockchainFlow");
                    v1 v1Var = new v1(new mp6.j(25, lVar2, inputData, contactsPermissionsGrantedObservable, userSelectedBlockchainFlow, (Continuation) null));
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector10, v1Var, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                zf8.k kVar = (zf8.k) obj3;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector11 = (FlowCollector) this.f319733w;
                    Flow flowV2 = ((Boolean) this.f319734x).booleanValue() ? nim.a.v(u0.m(kVar.c(null, hVar), ((nj8.n) kVar.f321900b).k(null, hVar)), zf8.j.f321898a) : new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector11, flowV2, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                zge.i iVar = (zge.i) obj3;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector12 = (FlowCollector) this.f319733w;
                    z2 z2Var = iVar.f322118b;
                    sfe.a dataLoadingMode = sfe.a.CACHE_ONLY;
                    vge.t3 t3Var = (vge.t3) z2Var;
                    t3Var.getClass();
                    Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
                    Flow flowI = c6d.b.i(vkm.q.r(new vea.b(22), vkm.q.Q(new t38.e(t3Var.f.a(), 20, t3Var, dataLoadingMode), new bwb.k(i21, 17, continuation))), new yrb.n(iVar, i32));
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector12, flowI, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                zhf.g gVar2 = (zhf.g) obj3;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector13 = (FlowCollector) this.f319733w;
                    vkm.d dVarB6 = rd0.e.b(te0.w.v(com.revolut.domain.interactors.transactions.a.d(gVar2.f322411m, new r9(((TransactionChatWidgetInput) gVar2.c3().f310975b).getTransactionId()), null, null, TransactionsSort.STARTED_DATE_DESC, new TransactionContext(new Priority.HIGH("Chat transaction widget"), null, 2), 6), ((njf.j) gVar2.f322413p).f(), new zhf.e(gVar2, i33)));
                    p0 p0Var = p0.f264001a;
                    Flow flowC = vkm.q.C(dVarB6, elm.f.f127540b);
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector13, flowC, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector14 = (FlowCollector) this.f319733w;
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector14, (vkm.d) obj3, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                a3 a3Var = (a3) this.f319733w;
                t3 t3Var2 = (t3) this.f319734x;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.f319733w = null;
                this.f319734x = null;
                this.v = 1;
                Serializable serializableA = uvl.c.a((uvl.c) obj3, a3Var, t3Var2, this);
                return serializableA == aVar17 ? aVar17 : serializableA;
            case 15:
                zkk.t tVar = (zkk.t) obj3;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector15 = (FlowCollector) this.f319733w;
                    w4l.k kVar2 = (w4l.k) this.f319734x;
                    SelectedBillingPlan selectedBillingPlan = tVar.o.f103477a;
                    if (selectedBillingPlan instanceof SelectedBillingPlan.Plan) {
                        zkk.p pVar = zkk.q.Companion;
                        hha.d pricingPlan = ((SelectedBillingPlan.Plan) selectedBillingPlan).f103314a;
                        pVar.getClass();
                        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                        flowV = zi0.c.i(new zkk.q(pricingPlan.f152287a, pricingPlan));
                    } else if (selectedBillingPlan instanceof SelectedBillingPlan.PlanId) {
                        flowV = zi0.c.i(new zkk.q(((SelectedBillingPlan.PlanId) selectedBillingPlan).f103315a, null));
                    } else {
                        if (!(selectedBillingPlan instanceof SelectedBillingPlan.Tier)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        flowV = nim.a.v(com.revolut.data.database.models.openbanking.d.y("PlanBillingPickerScreenModel", "observePricingPlanByTier", tVar.f323084q.k(((SelectedBillingPlan.Tier) selectedBillingPlan).f103316a)), new zke.f(22));
                    }
                    Flow flowH = xam.a.h(new i0(tVar, kVar2, continuation, i32), flowV);
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector15, flowH, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector16 = (FlowCollector) this.f319733w;
                    zl1.l lVar3 = ((com.revolut.feature.apm.aani.impl.ui.settings.a) obj3).o;
                    vkm.y yVarE = rd0.e.e(nim.a.u(new z9m.a(lVar3, continuation, i3), vw1.b.c(lVar3.f323165a)), h0.f322473a, new v77.c(i21, 15, continuation));
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector16, yVarE, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                zlb.o oVar = (zlb.o) obj3;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector17 = (FlowCollector) this.f319733w;
                    Flow flowE = boh.f.e(nim.a.v(ijb.a.c(oVar.o, zhm.v.k(ncd.g.SAVINGS_DEPOSITS, ncd.g.SAVINGS_MMF), zhm.u.c(ncd.m.ACTIVE), 4), new fjm.j(oVar, i6)), new yrb.n(oVar, i5));
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector17, flowE, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector18 = (FlowCollector) this.f319733w;
                    w4l.k loadingStrategy3 = (w4l.k) this.f319734x;
                    zmd.o oVar2 = (zmd.o) obj3;
                    ou5.b bVar = oVar2.f323472p;
                    qzi.i budgetingAccountType = oVar2.o.f87513a;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(budgetingAccountType, "budgetingAccountType");
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    Flow flowE2 = boh.f.e(((wmd.c) bVar.f229819a).a(budgetingAccountType, loadingStrategy3), new zf5.n(bVar, loadingStrategy3, 21));
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector18, flowE2, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                FlowCollector flowCollector19 = (FlowCollector) this.f319733w;
                Throwable th11 = (Throwable) this.f319734x;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    znd.a aVarA = znd.a.a((znd.a) ((j2) ((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) obj3).N.f22677a).getValue(), new Data(null, th11, false, 5, null), null, null, null, null, null, 0, false, false, false, false, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, false, 67108862);
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (flowCollector19.emit(aVarA, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector20 = (FlowCollector) this.f319733w;
                    List list = (List) this.f319734x;
                    if (list.isEmpty()) {
                        od0.i.Companion.getClass();
                        gVar = new go.g(od0.i.f224256b, 2);
                    } else {
                        gVar = new ymk.u(rd0.e.b(((njf.j) ((znf.c) obj3).f323815b).f()), list, i2);
                    }
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector20, gVar, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector21 = (FlowCollector) this.f319733w;
                    w4l.k loadingStrategy4 = (w4l.k) this.f319734x;
                    zug.i iVar2 = (zug.i) obj3;
                    r10.r rVar = iVar2.f325461p;
                    String portfolioId = iVar2.o.f325454a;
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                    Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                    vdl.f fVar = (vdl.f) rVar.f250851a;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                    Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                    Flow flowE3 = boh.f.e(u0.m(fVar.e.b(portfolioId, loadingStrategy4), vkm.q.r(new ack.f(new aed.a(i5), i3), ((ael.y) ((ybl.d) rVar.f250852b)).e(portfolioId, hVar))), new acb.f(rVar, loadingStrategy4, i2));
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector21, flowE3, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                String str = (String) this.f319734x;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    zuh.o oVar3 = (zuh.o) obj3;
                    cVar = oVar3.f;
                    WorkflowService workflowService = oVar3.f325482c;
                    this.f319734x = null;
                    this.f319733w = cVar;
                    this.v = 1;
                    productObstacles = workflowService.getProductObstacles(str, this);
                    if (productObstacles == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zjh.c cVar3 = (zjh.c) this.f319733w;
                    yhm.o.b(obj2);
                    cVar = cVar3;
                    productObstacles = obj2;
                }
                bvh.z productObstaclesResponseDto = (bvh.z) productObstacles;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(productObstaclesResponseDto, "productObstaclesResponseDto");
                List<bvh.x> groups = productObstaclesResponseDto.getGroups();
                ArrayList arrayList = new ArrayList(zhm.w.t(groups, 10));
                for (bvh.x productObstacleGroupDto : groups) {
                    Intrinsics.checkNotNullParameter(productObstacleGroupDto, "productObstacleGroupDto");
                    String name = productObstacleGroupDto.getName();
                    List<bvh.w> products = productObstacleGroupDto.getProducts();
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(products, 10));
                    for (bvh.w productDto : products) {
                        Intrinsics.checkNotNullParameter(productDto, "productDto");
                        String name2 = productDto.getName();
                        String description = productDto.getDescription();
                        aal.b bVarA = ((yxc.l) cVar.f322830b).a(productDto.getIcon());
                        if (bVarA == null) {
                            bVarA = aal.b.INFO;
                        }
                        bvh.y productObstaclePromptDto = productDto.getPrompt();
                        Intrinsics.checkNotNullParameter(productObstaclePromptDto, "productObstaclePromptDto");
                        arrayList2.add(new sil.e(name2, description, bVarA, new ProductClosurePrompt(productObstaclePromptDto.getName(), productObstaclePromptDto.getDisclaimer(), productObstaclePromptDto.getActionButtonTitle(), productObstaclePromptDto.getDeeplink(), productObstaclePromptDto.getSteps())));
                    }
                    arrayList.add(new sil.f(name, arrayList2));
                }
                return new sil.g(arrayList);
            case 23:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector22 = (FlowCollector) this.f319733w;
                    com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a aVar27 = (com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a) obj3;
                    yuj.a aVar28 = aVar27.f101609p;
                    String itineraryId = aVar27.o.f325508a;
                    aVar28.getClass();
                    Intrinsics.checkNotNullParameter(itineraryId, "itineraryId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    tuj.g gVar3 = aVar28.f317057a;
                    gVar3.getClass();
                    Intrinsics.checkNotNullParameter(itineraryId, "itineraryId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    q0 q0VarN = rd0.e.n(new tse.c(gVar3.d.b(itineraryId, loadingStrategy), gVar3, i22), h0.f322473a);
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector22, q0VarN, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector23 = (FlowCollector) this.f319733w;
                    zx6.o oVar4 = (zx6.o) obj3;
                    akg.n nVarV4 = nim.a.v(u0.i(((a1) oVar4.o).c(a1.f129188c), rd0.e.b(oVar4.f326061q.e(false)), rd0.e.b(oVar4.f326062r.J(AccountId.Personal.f51414a, w4l.j.f294644c))), new zrd.q(oVar4, i6));
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector23, nVarV4, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                zzb.t tVar2 = (zzb.t) obj3;
                c0 c0Var = tVar2.f326665p;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector24 = (FlowCollector) this.f319733w;
                    w4l.k loadingStrategy5 = (w4l.k) this.f319734x;
                    int i119 = zzb.q.f326662a[tVar2.o.f83842a.ordinal()];
                    if (i119 == 1) {
                        c0Var.getClass();
                        Intrinsics.checkNotNullParameter(loadingStrategy5, "loadingStrategy");
                        oxb.f fVar2 = c0Var.f220778a;
                        fVar2.getClass();
                        Intrinsics.checkNotNullParameter(loadingStrategy5, "loadingStrategy");
                        nVarV = nim.a.v(fVar2.d.b(Unit.f186387a, loadingStrategy5), zzb.r.f326663a);
                    } else {
                        if (i119 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c0Var.getClass();
                        Intrinsics.checkNotNullParameter(loadingStrategy5, "loadingStrategy");
                        oxb.f fVar3 = c0Var.f220778a;
                        fVar3.getClass();
                        Intrinsics.checkNotNullParameter(loadingStrategy5, "loadingStrategy");
                        nVarV = nim.a.v(fVar3.e.b(Unit.f186387a, loadingStrategy5), zzb.s.f326664a);
                    }
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector24, nVarV, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.statements.impl.ui.documents_hub.a aVar31 = (com.revolut.feature.statements.impl.ui.documents_hub.a) obj3;
                DocumentsHubScreenContract$InputData documentsHubScreenContract$InputData = aVar31.o;
                jyd.b bVar2 = aVar31.f88361p;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector25 = (FlowCollector) this.f319733w;
                    zzd.x xVar = (zzd.x) this.f319734x;
                    if (xVar instanceof zzd.w) {
                        w4l.k kVar3 = ((zzd.w) xVar).f326699a;
                        String str2 = documentsHubScreenContract$InputData.f88356a;
                        DocumentsHubType.INSTANCE.getClass();
                        uVar = Intrinsics.f(str2, "root") ? new z75.f(bVar2.c(str2, null, kVar3), 25) : xam.a.h(new i0(aVar31, kVar3, continuation, i22), bVar2.b(str2, kVar3));
                    } else {
                        if (!(xVar instanceof zzd.v)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zzd.v vVar = (zzd.v) xVar;
                        uVar = new ymk.u(bVar2.c(documentsHubScreenContract$InputData.f88356a, vVar.f326698a, loadingStrategy), vVar, 19);
                    }
                    this.f319733w = null;
                    this.f319734x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector25, uVar, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f319735y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(Function3 function3, Continuation continuation) {
        super(3, continuation);
        this.u = 6;
        this.f319735y = (gim.i) function3;
    }
}
