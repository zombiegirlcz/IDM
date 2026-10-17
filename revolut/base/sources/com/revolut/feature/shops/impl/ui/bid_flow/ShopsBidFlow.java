package com.revolut.feature.shops.impl.ui.bid_flow;

import com.revolut.feature.shops.impl.ui.bid_flow.ShopsBidFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/bid_flow/ShopsBidFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lyki/f;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShopsBidFlow extends ViewController<Object> implements f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public ShopsBidFlow(ShopsBidFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: vid.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsBidFlow f289570b;

            {
                this.f289570b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ShopsBidFlow shopsBidFlow = this.f289570b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, shopsBidFlow, (b) shopsBidFlow.N.getValue());
                    default:
                        return (b) ((did.e) this.f289570b.M.getValue()).f115010b.get();
                }
            }
        });
        this.M = w.y0(new vd1.a(this, inputData, 12));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: vid.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsBidFlow f289570b;

            {
                this.f289570b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ShopsBidFlow shopsBidFlow = this.f289570b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, shopsBidFlow, (b) shopsBidFlow.N.getValue());
                    default:
                        return (b) ((did.e) this.f289570b.M.getValue()).f115010b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (did.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (did.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (vid.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
