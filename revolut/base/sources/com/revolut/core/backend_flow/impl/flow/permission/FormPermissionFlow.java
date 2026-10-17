package com.revolut.core.backend_flow.impl.flow.permission;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.impl.flow.permission.FormPermissionFlow;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/backend_flow/impl/flow/permission/FormPermissionFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/core/backend_flow/impl/flow/permission/FormPermissionFlowContract$OutputData;", "Lyki/f;", "Lno/m;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FormPermissionFlow extends ViewController<FormPermissionFlowContract$OutputData> implements f, m {
    public final AnalyticsProduct K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;

    public FormPermissionFlow(FormPermissionFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct analyticsProduct = inputData.f51232b;
        this.K = analyticsProduct == null ? AnalyticsProduct.Shared.RevolutUIKit.f : analyticsProduct;
        this.L = w.y0(new k8e.a(this, inputData, 6));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ka0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormPermissionFlow f182365b;

            {
                this.f182365b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((fa0.f) this.f182365b.L.getValue()).f133032b.get();
                    default:
                        FormPermissionFlow formPermissionFlow = this.f182365b;
                        return czi.c.d(0, 6, null, formPermissionFlow, (b) formPermissionFlow.M.getValue());
                }
            }
        });
        this.N = R$layout.base_flow_container;
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ka0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormPermissionFlow f182365b;

            {
                this.f182365b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((fa0.f) this.f182365b.L.getValue()).f133032b.get();
                    default:
                        FormPermissionFlow formPermissionFlow = this.f182365b;
                        return czi.c.d(0, 6, null, formPermissionFlow, (b) formPermissionFlow.M.getValue());
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (fa0.f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (fa0.f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ka0.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
