package com.revolut.feature.onboarding.impl.qes_terms;

import com.revolut.feature.onboarding.api.qes_terms.QesTermsFlowInputData;
import com.revolut.feature.onboarding.impl.qes_terms.QesTermsFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/qes_terms/QesTermsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ly89/e;", "Lyki/f;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QesTermsFlow extends ViewController<y89.e> implements yki.f {
    public final QesTermsFlowInputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public QesTermsFlow(QesTermsFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: oc9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QesTermsFlow f224139b;

            {
                this.f224139b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        QesTermsFlow qesTermsFlow = this.f224139b;
                        phm.a aVar = (phm.a) ue0.e.j(qesTermsFlow.m2()).a().get(qc9.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qc9.c.class, " is not found"));
                        }
                        qc9.c cVar = ((qc9.c) aVar2.b()).f244625q;
                        QesTermsFlowInputData qesTermsFlowInputData = qesTermsFlow.K;
                        qesTermsFlowInputData.getClass();
                        return new qc9.d(cVar, qesTermsFlowInputData);
                    case 1:
                        return (d) ((qc9.d) this.f224139b.L.getValue()).e.get();
                    default:
                        QesTermsFlow qesTermsFlow2 = this.f224139b;
                        return czi.c.d(0, 6, null, qesTermsFlow2, (d) qesTermsFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: oc9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QesTermsFlow f224139b;

            {
                this.f224139b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        QesTermsFlow qesTermsFlow = this.f224139b;
                        phm.a aVar = (phm.a) ue0.e.j(qesTermsFlow.m2()).a().get(qc9.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qc9.c.class, " is not found"));
                        }
                        qc9.c cVar = ((qc9.c) aVar2.b()).f244625q;
                        QesTermsFlowInputData qesTermsFlowInputData = qesTermsFlow.K;
                        qesTermsFlowInputData.getClass();
                        return new qc9.d(cVar, qesTermsFlowInputData);
                    case 1:
                        return (d) ((qc9.d) this.f224139b.L.getValue()).e.get();
                    default:
                        QesTermsFlow qesTermsFlow2 = this.f224139b;
                        return czi.c.d(0, 6, null, qesTermsFlow2, (d) qesTermsFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: oc9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QesTermsFlow f224139b;

            {
                this.f224139b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        QesTermsFlow qesTermsFlow = this.f224139b;
                        phm.a aVar = (phm.a) ue0.e.j(qesTermsFlow.m2()).a().get(qc9.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qc9.c.class, " is not found"));
                        }
                        qc9.c cVar = ((qc9.c) aVar2.b()).f244625q;
                        QesTermsFlowInputData qesTermsFlowInputData = qesTermsFlow.K;
                        qesTermsFlowInputData.getClass();
                        return new qc9.d(cVar, qesTermsFlowInputData);
                    case 1:
                        return (d) ((qc9.d) this.f224139b.L.getValue()).e.get();
                    default:
                        QesTermsFlow qesTermsFlow2 = this.f224139b;
                        return czi.c.d(0, 6, null, qesTermsFlow2, (d) qesTermsFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (qc9.d) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (qc9.d) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (oc9.d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
