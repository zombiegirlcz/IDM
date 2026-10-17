package com.revolut.feature.checkout.impl.resume.flow;

import aii.q;
import com.revolut.feature.checkout.impl.resume.flow.ResumeCheckoutFlow;
import com.revolut.feature.checkout.impl.resume.flow.ResumeCheckoutFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import ki3.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/checkout/impl/resume/flow/ResumeCheckoutFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_checkout_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ResumeCheckoutFlow extends ViewController<q> implements f {
    public final ResumeCheckoutFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public ResumeCheckoutFlow(ResumeCheckoutFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ki3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResumeCheckoutFlow f184169b;

            {
                this.f184169b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ResumeCheckoutFlow resumeCheckoutFlow = this.f184169b;
                        phm.a aVar = (phm.a) ue0.e.j(resumeCheckoutFlow.m2()).a().get(bi3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bi3.e.class, " is not found"));
                        }
                        bi3.e eVar = ((bi3.e) aVar2.b()).f15417g;
                        ResumeCheckoutFlowContract$InputData resumeCheckoutFlowContract$InputData = resumeCheckoutFlow.K;
                        resumeCheckoutFlowContract$InputData.getClass();
                        return new bi3.f(eVar, resumeCheckoutFlowContract$InputData);
                    case 1:
                        return (c) ((bi3.f) this.f184169b.L.getValue()).d.get();
                    default:
                        ResumeCheckoutFlow resumeCheckoutFlow2 = this.f184169b;
                        return czi.c.d(0, 6, null, resumeCheckoutFlow2, (c) resumeCheckoutFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ki3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResumeCheckoutFlow f184169b;

            {
                this.f184169b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ResumeCheckoutFlow resumeCheckoutFlow = this.f184169b;
                        phm.a aVar = (phm.a) ue0.e.j(resumeCheckoutFlow.m2()).a().get(bi3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bi3.e.class, " is not found"));
                        }
                        bi3.e eVar = ((bi3.e) aVar2.b()).f15417g;
                        ResumeCheckoutFlowContract$InputData resumeCheckoutFlowContract$InputData = resumeCheckoutFlow.K;
                        resumeCheckoutFlowContract$InputData.getClass();
                        return new bi3.f(eVar, resumeCheckoutFlowContract$InputData);
                    case 1:
                        return (c) ((bi3.f) this.f184169b.L.getValue()).d.get();
                    default:
                        ResumeCheckoutFlow resumeCheckoutFlow2 = this.f184169b;
                        return czi.c.d(0, 6, null, resumeCheckoutFlow2, (c) resumeCheckoutFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ki3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResumeCheckoutFlow f184169b;

            {
                this.f184169b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ResumeCheckoutFlow resumeCheckoutFlow = this.f184169b;
                        phm.a aVar = (phm.a) ue0.e.j(resumeCheckoutFlow.m2()).a().get(bi3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bi3.e.class, " is not found"));
                        }
                        bi3.e eVar = ((bi3.e) aVar2.b()).f15417g;
                        ResumeCheckoutFlowContract$InputData resumeCheckoutFlowContract$InputData = resumeCheckoutFlow.K;
                        resumeCheckoutFlowContract$InputData.getClass();
                        return new bi3.f(eVar, resumeCheckoutFlowContract$InputData);
                    case 1:
                        return (c) ((bi3.f) this.f184169b.L.getValue()).d.get();
                    default:
                        ResumeCheckoutFlow resumeCheckoutFlow2 = this.f184169b;
                        return czi.c.d(0, 6, null, resumeCheckoutFlow2, (c) resumeCheckoutFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (bi3.f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (bi3.f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
