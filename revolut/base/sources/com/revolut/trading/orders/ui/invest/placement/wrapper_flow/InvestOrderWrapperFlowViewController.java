package com.revolut.trading.orders.ui.invest.placement.wrapper_flow;

import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData;
import com.revolut.trading.orders.ui.invest.placement.wrapper_flow.InvestOrderWrapperFlowViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import xsl.h;
import yki.c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/wrapper_flow/InvestOrderWrapperFlowViewController;", "Lcom/revolut/trading/orders/ui/invest/placement/wrapper_flow/InvestOrderWrapperFlowContract$WrapperFlowViewController;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestOrderWrapperFlowViewController extends InvestOrderWrapperFlowContract$WrapperFlowViewController {
    public final Object K;
    public final Object L;
    public final Object M;

    public InvestOrderWrapperFlowViewController(InvestOrderContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new uj7.a(this, inputData, 20));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: uul.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderWrapperFlowViewController f283246b;

            {
                this.f283246b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((h) this.f283246b.K.getValue()).f308642c.get();
                    default:
                        InvestOrderWrapperFlowViewController investOrderWrapperFlowViewController = this.f283246b;
                        return czi.c.d(0, 6, null, investOrderWrapperFlowViewController, (b) investOrderWrapperFlowViewController.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: uul.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderWrapperFlowViewController f283246b;

            {
                this.f283246b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((h) this.f283246b.K.getValue()).f308642c.get();
                    default:
                        InvestOrderWrapperFlowViewController investOrderWrapperFlowViewController = this.f283246b;
                        return czi.c.d(0, 6, null, investOrderWrapperFlowViewController, (b) investOrderWrapperFlowViewController.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (h) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (uul.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.trading.orders.ui.invest.placement.wrapper_flow.InvestOrderWrapperFlowContract$WrapperFlowViewController, oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
