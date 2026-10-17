package com.revolut.feature.workflow.engine.sdk_flow;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.workflow.engine.sdk_flow.SdkFlow;
import com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwuh/f;", "Lyki/f;", "Lno/m;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SdkFlow extends ViewController<wuh.f> implements yki.f, m {
    public final SdkFlowContract$InputData K;
    public final AnalyticsProduct.Shared L;
    public final Object M;
    public final Object N;
    public final Object O;

    public SdkFlow(SdkFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = iuh.a.f168605a;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: wuh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SdkFlow f300147b;

            {
                this.f300147b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SdkFlow sdkFlow = this.f300147b;
                        return czi.c.d(0, 6, null, sdkFlow, (b) sdkFlow.O.getValue());
                    case 1:
                        SdkFlow sdkFlow2 = this.f300147b;
                        phm.a aVar = (phm.a) ue0.e.j(sdkFlow2.m2()).a().get(qth.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qth.g.class, " is not found"));
                        }
                        qth.g gVar = ((qth.g) ((yuh.a) aVar2.b())).f249144s;
                        SdkFlowContract$InputData sdkFlowContract$InputData = sdkFlow2.K;
                        sdkFlowContract$InputData.getClass();
                        return new qth.f(gVar, sdkFlowContract$InputData);
                    default:
                        return (b) ((qth.f) this.f300147b.N.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: wuh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SdkFlow f300147b;

            {
                this.f300147b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SdkFlow sdkFlow = this.f300147b;
                        return czi.c.d(0, 6, null, sdkFlow, (b) sdkFlow.O.getValue());
                    case 1:
                        SdkFlow sdkFlow2 = this.f300147b;
                        phm.a aVar = (phm.a) ue0.e.j(sdkFlow2.m2()).a().get(qth.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qth.g.class, " is not found"));
                        }
                        qth.g gVar = ((qth.g) ((yuh.a) aVar2.b())).f249144s;
                        SdkFlowContract$InputData sdkFlowContract$InputData = sdkFlow2.K;
                        sdkFlowContract$InputData.getClass();
                        return new qth.f(gVar, sdkFlowContract$InputData);
                    default:
                        return (b) ((qth.f) this.f300147b.N.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: wuh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SdkFlow f300147b;

            {
                this.f300147b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        SdkFlow sdkFlow = this.f300147b;
                        return czi.c.d(0, 6, null, sdkFlow, (b) sdkFlow.O.getValue());
                    case 1:
                        SdkFlow sdkFlow2 = this.f300147b;
                        phm.a aVar = (phm.a) ue0.e.j(sdkFlow2.m2()).a().get(qth.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qth.g.class, " is not found"));
                        }
                        qth.g gVar = ((qth.g) ((yuh.a) aVar2.b())).f249144s;
                        SdkFlowContract$InputData sdkFlowContract$InputData = sdkFlow2.K;
                        sdkFlowContract$InputData.getClass();
                        return new qth.f(gVar, sdkFlowContract$InputData);
                    default:
                        return (b) ((qth.f) this.f300147b.N.getValue()).e.get();
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (qth.f) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (qth.f) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (wuh.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
