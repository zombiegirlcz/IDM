package com.revolut.feature.product.lifecycle.flow;

import com.revolut.feature.product.lifecycle.flow.ProductLifecycleFlow;
import com.revolut.feature.product.lifecycle.flow.ProductLifecycleFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import hja.b;
import kja.f;
import kja.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import uki.c;
import xki.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/product/lifecycle/flow/ProductLifecycleFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkja/r;", "Luki/c;", "feature_product_lifecycle_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProductLifecycleFlow extends ViewController<r> implements c {
    public final ProductLifecycleFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public ProductLifecycleFlow(ProductLifecycleFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: kja.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductLifecycleFlow f184350b;

            {
                this.f184350b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ProductLifecycleFlow productLifecycleFlow = this.f184350b;
                        phm.a aVar = (phm.a) ue0.e.j(productLifecycleFlow.m2()).a().get(hja.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hja.a.class, " is not found"));
                        }
                        hja.a aVar3 = ((hja.a) aVar2.b()).e;
                        ProductLifecycleFlowContract$InputData productLifecycleFlowContract$InputData = productLifecycleFlow.K;
                        productLifecycleFlowContract$InputData.getClass();
                        return new hja.b(aVar3, productLifecycleFlowContract$InputData);
                    case 1:
                        return (f) ((hja.b) this.f184350b.M.getValue()).d.get();
                    default:
                        ProductLifecycleFlow productLifecycleFlow2 = this.f184350b;
                        return czi.c.a(R$id.screen_transparent_container, (f) productLifecycleFlow2.N.getValue(), productLifecycleFlow2);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: kja.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductLifecycleFlow f184350b;

            {
                this.f184350b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ProductLifecycleFlow productLifecycleFlow = this.f184350b;
                        phm.a aVar = (phm.a) ue0.e.j(productLifecycleFlow.m2()).a().get(hja.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hja.a.class, " is not found"));
                        }
                        hja.a aVar3 = ((hja.a) aVar2.b()).e;
                        ProductLifecycleFlowContract$InputData productLifecycleFlowContract$InputData = productLifecycleFlow.K;
                        productLifecycleFlowContract$InputData.getClass();
                        return new hja.b(aVar3, productLifecycleFlowContract$InputData);
                    case 1:
                        return (f) ((hja.b) this.f184350b.M.getValue()).d.get();
                    default:
                        ProductLifecycleFlow productLifecycleFlow2 = this.f184350b;
                        return czi.c.a(R$id.screen_transparent_container, (f) productLifecycleFlow2.N.getValue(), productLifecycleFlow2);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: kja.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductLifecycleFlow f184350b;

            {
                this.f184350b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ProductLifecycleFlow productLifecycleFlow = this.f184350b;
                        phm.a aVar = (phm.a) ue0.e.j(productLifecycleFlow.m2()).a().get(hja.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hja.a.class, " is not found"));
                        }
                        hja.a aVar3 = ((hja.a) aVar2.b()).e;
                        ProductLifecycleFlowContract$InputData productLifecycleFlowContract$InputData = productLifecycleFlow.K;
                        productLifecycleFlowContract$InputData.getClass();
                        return new hja.b(aVar3, productLifecycleFlowContract$InputData);
                    case 1:
                        return (f) ((hja.b) this.f184350b.M.getValue()).d.get();
                    default:
                        ProductLifecycleFlow productLifecycleFlow2 = this.f184350b;
                        return czi.c.a(R$id.screen_transparent_container, (f) productLifecycleFlow2.N.getValue(), productLifecycleFlow2);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.O.getValue();
    }
}
