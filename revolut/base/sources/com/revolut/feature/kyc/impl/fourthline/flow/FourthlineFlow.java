package com.revolut.feature.kyc.impl.fourthline.flow;

import a0.d;
import com.revolut.feature.kyc.impl.fourthline.flow.FourthlineFlow;
import com.revolut.feature.kyc.impl.fourthline.flow.FourthlineFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;
import vs8.b;
import yki.c;
import yki.f;
import zu8.c0;
import zu8.p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/impl/fourthline/flow/FourthlineFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvs8/b;", "Lyki/f;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FourthlineFlow extends ViewController<b> implements f {
    public final FourthlineFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public FourthlineFlow(FourthlineFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: uv8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FourthlineFlow f283343b;

            {
                this.f283343b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        FourthlineFlow fourthlineFlow = this.f283343b;
                        phm.a aVar = (phm.a) e.j(fourthlineFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        FourthlineFlowContract$InputData fourthlineFlowContract$InputData = fourthlineFlow.K;
                        fourthlineFlowContract$InputData.getClass();
                        return new p(c0Var, fourthlineFlowContract$InputData);
                    case 1:
                        return (b) ((p) this.f283343b.L.getValue()).d.get();
                    default:
                        FourthlineFlow fourthlineFlow2 = this.f283343b;
                        return czi.c.d(0, 6, null, fourthlineFlow2, (b) fourthlineFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: uv8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FourthlineFlow f283343b;

            {
                this.f283343b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        FourthlineFlow fourthlineFlow = this.f283343b;
                        phm.a aVar = (phm.a) e.j(fourthlineFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        FourthlineFlowContract$InputData fourthlineFlowContract$InputData = fourthlineFlow.K;
                        fourthlineFlowContract$InputData.getClass();
                        return new p(c0Var, fourthlineFlowContract$InputData);
                    case 1:
                        return (b) ((p) this.f283343b.L.getValue()).d.get();
                    default:
                        FourthlineFlow fourthlineFlow2 = this.f283343b;
                        return czi.c.d(0, 6, null, fourthlineFlow2, (b) fourthlineFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: uv8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FourthlineFlow f283343b;

            {
                this.f283343b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        FourthlineFlow fourthlineFlow = this.f283343b;
                        phm.a aVar = (phm.a) e.j(fourthlineFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        FourthlineFlowContract$InputData fourthlineFlowContract$InputData = fourthlineFlow.K;
                        fourthlineFlowContract$InputData.getClass();
                        return new p(c0Var, fourthlineFlowContract$InputData);
                    case 1:
                        return (b) ((p) this.f283343b.L.getValue()).d.get();
                    default:
                        FourthlineFlow fourthlineFlow2 = this.f283343b;
                        return czi.c.d(0, 6, null, fourthlineFlow2, (b) fourthlineFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (p) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (uv8.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
