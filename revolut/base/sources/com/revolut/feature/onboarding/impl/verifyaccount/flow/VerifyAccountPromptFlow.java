package com.revolut.feature.onboarding.impl.verifyaccount.flow;

import a0.d;
import aii.q;
import com.revolut.feature.onboarding.api.verify_account.flow.VerifyAccountPromptFlowInputData;
import com.revolut.feature.onboarding.impl.verifyaccount.flow.VerifyAccountPromptFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import jd9.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/verifyaccount/flow/VerifyAccountPromptFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VerifyAccountPromptFlow extends ViewController<q> implements f {
    public final VerifyAccountPromptFlowInputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public VerifyAccountPromptFlow(VerifyAccountPromptFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: kd9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerifyAccountPromptFlow f182862b;

            {
                this.f182862b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((jd9.b) this.f182862b.N.getValue()).f173040c.get();
                    case 1:
                        VerifyAccountPromptFlow verifyAccountPromptFlow = this.f182862b;
                        return c.d(0, 6, null, verifyAccountPromptFlow, (b) verifyAccountPromptFlow.L.getValue());
                    default:
                        VerifyAccountPromptFlow verifyAccountPromptFlow2 = this.f182862b;
                        phm.a aVar = (phm.a) e.j(verifyAccountPromptFlow2.m2()).a().get(d99.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", d99.a.class, " is not found"));
                        }
                        jd9.a aVar3 = ((jd9.a) aVar2.b()).f;
                        VerifyAccountPromptFlowInputData verifyAccountPromptFlowInputData = verifyAccountPromptFlow2.K;
                        verifyAccountPromptFlowInputData.getClass();
                        return new jd9.b(aVar3, verifyAccountPromptFlowInputData);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: kd9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerifyAccountPromptFlow f182862b;

            {
                this.f182862b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((jd9.b) this.f182862b.N.getValue()).f173040c.get();
                    case 1:
                        VerifyAccountPromptFlow verifyAccountPromptFlow = this.f182862b;
                        return c.d(0, 6, null, verifyAccountPromptFlow, (b) verifyAccountPromptFlow.L.getValue());
                    default:
                        VerifyAccountPromptFlow verifyAccountPromptFlow2 = this.f182862b;
                        phm.a aVar = (phm.a) e.j(verifyAccountPromptFlow2.m2()).a().get(d99.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", d99.a.class, " is not found"));
                        }
                        jd9.a aVar3 = ((jd9.a) aVar2.b()).f;
                        VerifyAccountPromptFlowInputData verifyAccountPromptFlowInputData = verifyAccountPromptFlow2.K;
                        verifyAccountPromptFlowInputData.getClass();
                        return new jd9.b(aVar3, verifyAccountPromptFlowInputData);
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: kd9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerifyAccountPromptFlow f182862b;

            {
                this.f182862b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (b) ((jd9.b) this.f182862b.N.getValue()).f173040c.get();
                    case 1:
                        VerifyAccountPromptFlow verifyAccountPromptFlow = this.f182862b;
                        return c.d(0, 6, null, verifyAccountPromptFlow, (b) verifyAccountPromptFlow.L.getValue());
                    default:
                        VerifyAccountPromptFlow verifyAccountPromptFlow2 = this.f182862b;
                        phm.a aVar = (phm.a) e.j(verifyAccountPromptFlow2.m2()).a().get(d99.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", d99.a.class, " is not found"));
                        }
                        jd9.a aVar3 = ((jd9.a) aVar2.b()).f;
                        VerifyAccountPromptFlowInputData verifyAccountPromptFlowInputData = verifyAccountPromptFlow2.K;
                        verifyAccountPromptFlowInputData.getClass();
                        return new jd9.b(aVar3, verifyAccountPromptFlowInputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (kd9.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
