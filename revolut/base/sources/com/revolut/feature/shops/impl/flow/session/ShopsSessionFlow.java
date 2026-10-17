package com.revolut.feature.shops.impl.flow.session;

import aii.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.shops.impl.flow.session.ShopsSessionFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import did.p;
import jji.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shops/impl/flow/session/ShopsSessionFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "Lwhd/b;", "Ljji/y;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShopsSessionFlow extends ViewController<q> implements f, whd.b, y {
    public final Object K;
    public final Object L;
    public final Object M;

    public ShopsSessionFlow(ShopsSessionFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: iid.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsSessionFlow f161600b;

            {
                this.f161600b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ShopsSessionFlow shopsSessionFlow = this.f161600b;
                        return czi.c.d(0, 6, null, shopsSessionFlow, (b) shopsSessionFlow.M.getValue());
                    default:
                        return (b) ((p) this.f161600b.L.getValue()).f115049b.get();
                }
            }
        });
        this.L = w.y0(new i1d.b(this, inputData, 21));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: iid.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsSessionFlow f161600b;

            {
                this.f161600b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ShopsSessionFlow shopsSessionFlow = this.f161600b;
                        return czi.c.d(0, 6, null, shopsSessionFlow, (b) shopsSessionFlow.M.getValue());
                    default:
                        return (b) ((p) this.f161600b.L.getValue()).f115049b.get();
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getG0() {
        return new AnalyticsProduct.Retail(super.f0());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
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
        return (iid.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.K.getValue();
    }
}
