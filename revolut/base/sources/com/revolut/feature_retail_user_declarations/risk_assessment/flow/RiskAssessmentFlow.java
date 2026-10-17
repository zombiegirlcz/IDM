package com.revolut.feature_retail_user_declarations.risk_assessment.flow;

import com.revolut.feature_retail_user_declarations.risk_assessment.flow.RiskAssessmentFlow;
import com.revolut.feature_retail_user_declarations.risk_assessment.flow.RiskAssessmentFlowInputData;
import com.revolut.kompot.navigable.vc.ViewController;
import ici.c;
import ici.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oai.c0;
import oai.i0;
import qji.b;
import te0.w;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/risk_assessment/flow/RiskAssessmentFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lici/e;", "Lyki/f;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RiskAssessmentFlow extends ViewController<e> implements f {
    public final RiskAssessmentFlowInputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public RiskAssessmentFlow(RiskAssessmentFlowInputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ici.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiskAssessmentFlow f160291b;

            {
                this.f160291b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        RiskAssessmentFlow riskAssessmentFlow = this.f160291b;
                        phm.a aVar = (phm.a) ue0.e.j(riskAssessmentFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        RiskAssessmentFlowInputData riskAssessmentFlowInputData = riskAssessmentFlow.K;
                        riskAssessmentFlowInputData.getClass();
                        return new c0(i0Var, riskAssessmentFlowInputData);
                    case 1:
                        return (c) ((c0) this.f160291b.L.getValue()).f223669b.get();
                    default:
                        RiskAssessmentFlow riskAssessmentFlow2 = this.f160291b;
                        return czi.c.d(0, 6, null, riskAssessmentFlow2, (c) riskAssessmentFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ici.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiskAssessmentFlow f160291b;

            {
                this.f160291b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        RiskAssessmentFlow riskAssessmentFlow = this.f160291b;
                        phm.a aVar = (phm.a) ue0.e.j(riskAssessmentFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        RiskAssessmentFlowInputData riskAssessmentFlowInputData = riskAssessmentFlow.K;
                        riskAssessmentFlowInputData.getClass();
                        return new c0(i0Var, riskAssessmentFlowInputData);
                    case 1:
                        return (c) ((c0) this.f160291b.L.getValue()).f223669b.get();
                    default:
                        RiskAssessmentFlow riskAssessmentFlow2 = this.f160291b;
                        return czi.c.d(0, 6, null, riskAssessmentFlow2, (c) riskAssessmentFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ici.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiskAssessmentFlow f160291b;

            {
                this.f160291b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        RiskAssessmentFlow riskAssessmentFlow = this.f160291b;
                        phm.a aVar = (phm.a) ue0.e.j(riskAssessmentFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        RiskAssessmentFlowInputData riskAssessmentFlowInputData = riskAssessmentFlow.K;
                        riskAssessmentFlowInputData.getClass();
                        return new c0(i0Var, riskAssessmentFlowInputData);
                    case 1:
                        return (c) ((c0) this.f160291b.L.getValue()).f223669b.get();
                    default:
                        RiskAssessmentFlow riskAssessmentFlow2 = this.f160291b;
                        return czi.c.d(0, 6, null, riskAssessmentFlow2, (c) riskAssessmentFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (c0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
