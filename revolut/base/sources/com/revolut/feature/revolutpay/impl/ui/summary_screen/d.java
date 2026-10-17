package com.revolut.feature.revolutpay.impl.ui.summary_screen;

import bgf.g;
import bgf.h;
import bgf.j;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$ModalStep;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$OutputData;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.suspicious_transaction.api.navigation.SuspiciousTransactionFeatureConfig;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o9c.p0;
import yhm.o;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f84566w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f84567x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
        this.f84566w = str;
        this.f84567x = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f84566w, this.f84567x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String transactionId = this.f84566w;
        f fVar = this.v;
        if (i == 0) {
            o.b(obj2);
            agf.b bVar = fVar.f84577x;
            this.u = 1;
            obj2 = ((cgf.b) bVar).c(transactionId, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        j jVar = (j) obj2;
        boolean z = jVar instanceof g;
        RevolutPaySummaryScreenContract$OutputData.BackPressed backPressed = RevolutPaySummaryScreenContract$OutputData.BackPressed.f84555a;
        if (z || (jVar instanceof bgf.f)) {
            fVar.C2(backPressed);
        } else {
            if (!(jVar instanceof h)) {
                throw new NoWhenBranchMatchedException();
            }
            h hVar = (h) jVar;
            RevolutPaySummaryScreenContract$InputData revolutPaySummaryScreenContract$InputData = fVar.o;
            s9c.a aVar2 = fVar.H;
            int i2 = p0.f223219b[hVar.f15197b.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    boolean f84528j = revolutPaySummaryScreenContract$InputData.getF84528j();
                    String str = this.f84567x;
                    if (f84528j) {
                        String workflowId = hVar.f15196a;
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
                        WorkflowConfiguration.Workflow configuration = new WorkflowConfiguration.Workflow(workflowId, (wi0.b) null, DummyCommand.f98635a, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 122);
                        Intrinsics.checkNotNullParameter(configuration, "configuration");
                        fVar.C1(new BridgeDestination(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new WorkflowFlowDestination(configuration, false), false, (Integer) null, 343965696, 45))));
                        fVar.U2();
                        int i3 = 4;
                        int i5 = 2;
                        l.a1(fVar, ((q7c.j) fVar.f84573r).f(str), new nt.e(i5, fVar, f.class, "handlePaymentError", "handlePaymentError(Ljava/lang/Throwable;)Z", i3, 6), null, new nt.e(i5, fVar, f.class, "handlePaymentState", "handlePaymentState(Lcom/revolut/feature/revolutpay/api/shared/domain/models/PaymentInitiationResult;)V", i3, 5), 2);
                    } else {
                        oki.h.v2(fVar.P, new RevolutPaySummaryScreenContract$ModalStep.RunWorkflow(str, hVar.f15196a), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                        Unit unit = Unit.f186387a;
                    }
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fVar.C2(backPressed);
                    Unit unit2 = Unit.f186387a;
                }
            } else if (revolutPaySummaryScreenContract$InputData.getF84528j()) {
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                fVar.C1(new BridgeDestination(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new SuspiciousTransactionFeatureConfig.SuspiciousTransaction(transactionId), false, (Integer) null, 343965696, 45))));
            } else {
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                fVar.C1(u0.b(new FeatureCommand(new SuspiciousTransactionFeatureConfig(new SuspiciousTransactionFeatureConfig.SuspiciousTransaction(transactionId)))));
            }
        }
        return Unit.f186387a;
    }
}
