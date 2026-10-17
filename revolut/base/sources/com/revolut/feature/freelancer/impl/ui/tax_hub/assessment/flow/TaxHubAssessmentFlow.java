package com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow;

import aii.q;
import bt6.j;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.TaxHubAssessmentFlow;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.TaxHubAssessmentFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/assessment/flow/TaxHubAssessmentFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxHubAssessmentFlow extends ViewController<q> implements f {
    public final TaxHubAssessmentFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public TaxHubAssessmentFlow(TaxHubAssessmentFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: c37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubAssessmentFlow f20914b;

            {
                this.f20914b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TaxHubAssessmentFlow taxHubAssessmentFlow = this.f20914b;
                        phm.a aVar = (phm.a) e.j(taxHubAssessmentFlow.m2()).a().get(bt6.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bt6.b.class, " is not found"));
                        }
                        bt6.b bVar = ((bt6.b) aVar2.b()).f18307t;
                        TaxHubAssessmentFlowContract$InputData taxHubAssessmentFlowContract$InputData = taxHubAssessmentFlow.K;
                        taxHubAssessmentFlowContract$InputData.getClass();
                        return new j(bVar, taxHubAssessmentFlowContract$InputData);
                    case 1:
                        return (b) ((j) this.f20914b.L.getValue()).f.get();
                    default:
                        TaxHubAssessmentFlow taxHubAssessmentFlow2 = this.f20914b;
                        return czi.c.d(0, 6, null, taxHubAssessmentFlow2, (b) taxHubAssessmentFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: c37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubAssessmentFlow f20914b;

            {
                this.f20914b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TaxHubAssessmentFlow taxHubAssessmentFlow = this.f20914b;
                        phm.a aVar = (phm.a) e.j(taxHubAssessmentFlow.m2()).a().get(bt6.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bt6.b.class, " is not found"));
                        }
                        bt6.b bVar = ((bt6.b) aVar2.b()).f18307t;
                        TaxHubAssessmentFlowContract$InputData taxHubAssessmentFlowContract$InputData = taxHubAssessmentFlow.K;
                        taxHubAssessmentFlowContract$InputData.getClass();
                        return new j(bVar, taxHubAssessmentFlowContract$InputData);
                    case 1:
                        return (b) ((j) this.f20914b.L.getValue()).f.get();
                    default:
                        TaxHubAssessmentFlow taxHubAssessmentFlow2 = this.f20914b;
                        return czi.c.d(0, 6, null, taxHubAssessmentFlow2, (b) taxHubAssessmentFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: c37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubAssessmentFlow f20914b;

            {
                this.f20914b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TaxHubAssessmentFlow taxHubAssessmentFlow = this.f20914b;
                        phm.a aVar = (phm.a) e.j(taxHubAssessmentFlow.m2()).a().get(bt6.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bt6.b.class, " is not found"));
                        }
                        bt6.b bVar = ((bt6.b) aVar2.b()).f18307t;
                        TaxHubAssessmentFlowContract$InputData taxHubAssessmentFlowContract$InputData = taxHubAssessmentFlow.K;
                        taxHubAssessmentFlowContract$InputData.getClass();
                        return new j(bVar, taxHubAssessmentFlowContract$InputData);
                    case 1:
                        return (b) ((j) this.f20914b.L.getValue()).f.get();
                    default:
                        TaxHubAssessmentFlow taxHubAssessmentFlow2 = this.f20914b;
                        return czi.c.d(0, 6, null, taxHubAssessmentFlow2, (b) taxHubAssessmentFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (j) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c37.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
