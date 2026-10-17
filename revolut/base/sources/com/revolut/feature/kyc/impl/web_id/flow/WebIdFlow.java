package com.revolut.feature.kyc.impl.web_id.flow;

import a0.d;
import com.revolut.feature.kyc.impl.web_id.flow.WebIdFlow;
import com.revolut.feature.kyc.impl.web_id.flow.WebIdFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ks8.h;
import qji.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;
import zu8.c0;
import zu8.j0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/impl/web_id/flow/WebIdFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lks8/h;", "Lyki/f;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WebIdFlow extends ViewController<h> implements f {
    public final WebIdFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public WebIdFlow(WebIdFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ox8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebIdFlow f230701b;

            {
                this.f230701b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        WebIdFlow webIdFlow = this.f230701b;
                        phm.a aVar = (phm.a) e.j(webIdFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        WebIdFlowContract$InputData webIdFlowContract$InputData = webIdFlow.K;
                        webIdFlowContract$InputData.getClass();
                        return new j0(c0Var, webIdFlowContract$InputData);
                    case 1:
                        return (b) ((j0) this.f230701b.L.getValue()).d.get();
                    default:
                        WebIdFlow webIdFlow2 = this.f230701b;
                        return czi.c.d(0, 6, null, webIdFlow2, (b) webIdFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ox8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebIdFlow f230701b;

            {
                this.f230701b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        WebIdFlow webIdFlow = this.f230701b;
                        phm.a aVar = (phm.a) e.j(webIdFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        WebIdFlowContract$InputData webIdFlowContract$InputData = webIdFlow.K;
                        webIdFlowContract$InputData.getClass();
                        return new j0(c0Var, webIdFlowContract$InputData);
                    case 1:
                        return (b) ((j0) this.f230701b.L.getValue()).d.get();
                    default:
                        WebIdFlow webIdFlow2 = this.f230701b;
                        return czi.c.d(0, 6, null, webIdFlow2, (b) webIdFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ox8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebIdFlow f230701b;

            {
                this.f230701b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        WebIdFlow webIdFlow = this.f230701b;
                        phm.a aVar = (phm.a) e.j(webIdFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        WebIdFlowContract$InputData webIdFlowContract$InputData = webIdFlow.K;
                        webIdFlowContract$InputData.getClass();
                        return new j0(c0Var, webIdFlowContract$InputData);
                    case 1:
                        return (b) ((j0) this.f230701b.L.getValue()).d.get();
                    default:
                        WebIdFlow webIdFlow2 = this.f230701b;
                        return czi.c.d(0, 6, null, webIdFlow2, (b) webIdFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (j0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ox8.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
