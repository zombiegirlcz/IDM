package com.revolut.core.backend_flow.impl.internal_flow;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.backend_flow.impl.internal_flow.InternalBackendFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.k;
import te0.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/backend_flow/impl/internal_flow/InternalBackendFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lm90/b;", "Luki/c;", "Lin0/g;", "Lno/k;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InternalBackendFlow extends ViewController<m90.b> implements uki.c, g, k {
    public AnalyticsContext K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;

    public InternalBackendFlow(BackendFlowInput inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData.f51220c;
        this.L = w.y0(new kpl.b(this, inputData, 23));
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: la0.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InternalBackendFlow f193310b;

            {
                this.f193310b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((na0.d) this.f193310b.L.getValue()).e();
                    default:
                        InternalBackendFlow internalBackendFlow = this.f193310b;
                        return czi.c.a(R$id.screen_transparent_container, (uki.b) internalBackendFlow.N.getValue(), internalBackendFlow);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: la0.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InternalBackendFlow f193310b;

            {
                this.f193310b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((na0.d) this.f193310b.L.getValue()).e();
                    default:
                        InternalBackendFlow internalBackendFlow = this.f193310b;
                        return czi.c.a(R$id.screen_transparent_container, (uki.b) internalBackendFlow.N.getValue(), internalBackendFlow);
                }
            }
        });
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.K = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (na0.d) this.L.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getG0() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (na0.d) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (uki.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // in0.g
    public final boolean p0() {
        return ((na0.d) this.L.getValue()).U().p0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.O.getValue();
    }
}
