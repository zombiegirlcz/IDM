package pth;

import com.revolut.feature.workflow.engine.onboarding.impl.workflow.InternalStep;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$State;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep;
import cp6.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mvh.a;
import vkm.j2;
import yth.a;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.workflow.engine.onboarding.impl.workflow.a f239694b;

    public /* synthetic */ i(com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar, int i) {
        this.f239693a = i;
        this.f239694b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f239693a) {
            case 0:
                wth.h result = (wth.h) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean zF = Intrinsics.f(result, wth.g.f299988a);
                com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar = this.f239694b;
                if (zF) {
                    aVar.V2(new od9.h(false));
                } else if (Intrinsics.f(result, wth.f.f299987a)) {
                    aVar.V2(new od9.f(null));
                }
                return Unit.f186387a;
            case 1:
                qbl.c result2 = (qbl.c) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                boolean zF2 = Intrinsics.f(result2, qbl.a.f244373a);
                com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar2 = this.f239694b;
                if (zF2) {
                    aVar2.V2(new od9.h(false));
                } else {
                    if (!Intrinsics.f(result2, qbl.b.f244374a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.V2(new od9.f(null));
                }
                return Unit.f186387a;
            case 2:
                Intrinsics.checkNotNullParameter((til.r) obj2, "<unused var>");
                com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar3 = this.f239694b;
                aVar3.H2(aVar3.J, new psl.e(19));
                aVar3.V2(new od9.h(false));
                return Unit.f186387a;
            case 3:
                mvh.a result3 = (mvh.a) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                boolean zF3 = Intrinsics.f(result3, a.b.f209254a);
                com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar4 = this.f239694b;
                if (zF3) {
                    aVar4.C2(new til.o(3));
                    ((btb.c) aVar4.f96496t).getClass();
                    aVar4.C1(new ExternalDestination.Browser("revolut://app/chat", null));
                } else if (Intrinsics.f(result3, a.c.f209255a)) {
                    aVar4.V2(new od9.h(false));
                } else {
                    if (!Intrinsics.f(result3, a.C1180a.f209253a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar4.V2(new od9.f(null));
                }
                return Unit.f186387a;
            case 4:
                com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar5 = this.f239694b;
                qki.d dVar = aVar5.J;
                wuh.f result4 = (wuh.f) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (Intrinsics.f(result4, wuh.c.f300148a)) {
                    aVar5.V2(new od9.f(null));
                } else if (Intrinsics.f(result4, wuh.e.f300150a)) {
                    com.revolut.feature.workflow.engine.onboarding.impl.workflow.a.Q2(aVar5, ((WorkflowFlowContract$State) ((j2) dVar.f22677a).getValue()).f96485b, false, 6);
                } else {
                    if (!(result4 instanceof wuh.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.revolut.feature.workflow.engine.onboarding.impl.workflow.a.Q2(aVar5, ((WorkflowFlowContract$State) ((j2) dVar.f22677a).getValue()).f96485b, ((wuh.d) result4).f300149a, 4);
                }
                return Unit.f186387a;
            case 5:
                wuh.f result5 = (wuh.f) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                boolean z = result5 instanceof wuh.d;
                com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar6 = this.f239694b;
                if (z) {
                    aVar6.V2(new od9.h(false));
                } else if (result5 instanceof wuh.c) {
                    aVar6.V2(new od9.f(null));
                } else {
                    if (!(result5 instanceof wuh.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar6.C2(new til.o(2));
                }
                return Unit.f186387a;
            case 6:
                wuh.f result6 = (wuh.f) obj2;
                Intrinsics.checkNotNullParameter(result6, "result");
                boolean z3 = result6 instanceof wuh.d;
                com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar7 = this.f239694b;
                if (z3) {
                    aVar7.V2(new od9.h(false));
                } else {
                    if (!(result6 instanceof wuh.c) && !(result6 instanceof wuh.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.revolut.feature.workflow.engine.onboarding.impl.workflow.a.Q2(aVar7, ((WorkflowFlowContract$State) ((j2) aVar7.J.f22677a).getValue()).f96485b, false, 6);
                }
                return Unit.f186387a;
            case 7:
                hth.e docCollectionResult = (hth.e) obj2;
                Intrinsics.checkNotNullParameter(docCollectionResult, "docCollectionResult");
                boolean zF4 = Intrinsics.f(docCollectionResult, hth.c.f155387a);
                com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar8 = this.f239694b;
                if (zF4) {
                    aVar8.V2(new od9.f(null));
                } else {
                    if (!Intrinsics.f(docCollectionResult, hth.d.f155388a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar8.V2(new od9.h(false));
                }
                return Unit.f186387a;
            case 8:
                Intrinsics.checkNotNullParameter((aii.q) obj2, "<unused var>");
                this.f239694b.V2(new od9.h(false));
                return Unit.f186387a;
            case 9:
                Intrinsics.checkNotNullParameter((nbl.d) obj2, "it");
                this.f239694b.V2(new od9.h(false));
                return Unit.f186387a;
            case 10:
                WorkflowFlowStep step = (WorkflowFlowStep) obj2;
                Intrinsics.checkNotNullParameter(step, "step");
                Intrinsics.checkNotNullParameter(step, "step");
                return Boolean.valueOf((step instanceof InternalStep.Workflow) && ((WorkflowFlowContract$State) ((j2) this.f239694b.J.f22677a).getValue()).d.contains(((InternalStep.Workflow) step).d));
            case 11:
                WorkflowFlowStep step2 = (WorkflowFlowStep) obj2;
                Intrinsics.checkNotNullParameter(step2, "step");
                return Boolean.valueOf((step2 instanceof InternalStep.WorkflowEligibility) && ((WorkflowFlowContract$State) ((j2) this.f239694b.J.f22677a).getValue()).f96486c);
            case 12:
                WorkflowFlowContract$State update = (WorkflowFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                String languageTag = ((s80.b) this.f239694b.f96499y).b().toLanguageTag();
                Intrinsics.checkNotNullExpressionValue(languageTag, "toLanguageTag(...)");
                return WorkflowFlowContract$State.a(update, null, null, null, null, languageTag, 63);
            case 13:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar9 = this.f239694b;
                aVar9.S2("Failed to load steps", it8);
                aVar9.O2(it8, new j(aVar9, 2));
                return Boolean.TRUE;
            case 14:
                cp6.e result7 = (cp6.e) obj2;
                Intrinsics.checkNotNullParameter(result7, "result");
                boolean z4 = result7 instanceof e.a;
                Continuation continuation = null;
                com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar10 = this.f239694b;
                if (z4) {
                    aVar10.l2(new prl.k(aVar10, ((e.a) result7).f107881a, continuation, 4), new yi5.b(26));
                } else {
                    if (!(result7 instanceof e.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar10.l2(new prl.k(aVar10, continuation, continuation, 4), new yi5.b(26));
                }
                return Unit.f186387a;
            default:
                yth.a flowResult = (yth.a) obj2;
                Intrinsics.checkNotNullParameter(flowResult, "flowResult");
                boolean zF5 = Intrinsics.f(flowResult, a.C1765a.f316810a);
                com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar11 = this.f239694b;
                if (zF5) {
                    aVar11.V2(new od9.f(null));
                } else {
                    if (!Intrinsics.f(flowResult, a.b.f316811a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar11.V2(new od9.h(false));
                }
                return Unit.f186387a;
        }
    }
}
