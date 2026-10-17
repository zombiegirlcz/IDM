package com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.flow;

import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.flow.ManagedPortfolioSelectTemplateFlow;
import com.revolut.kompot.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import k5f.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import uki.c;
import w5f.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lk5f/e;", "Luki/c;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManagedPortfolioSelectTemplateFlow extends ViewController<e> implements c {
    public final Object K;
    public final Object L;
    public final Object M;

    public ManagedPortfolioSelectTemplateFlow(ManagedPortfolioSelectTemplateFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new fx5.a(this, inputData, 15));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: g8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfolioSelectTemplateFlow f141351b;

            {
                this.f141351b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((j) this.f141351b.K.getValue()).f295183b.get();
                    default:
                        ManagedPortfolioSelectTemplateFlow managedPortfolioSelectTemplateFlow = this.f141351b;
                        return czi.c.a(R$id.container, (b) managedPortfolioSelectTemplateFlow.L.getValue(), managedPortfolioSelectTemplateFlow);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: g8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfolioSelectTemplateFlow f141351b;

            {
                this.f141351b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((j) this.f141351b.K.getValue()).f295183b.get();
                    default:
                        ManagedPortfolioSelectTemplateFlow managedPortfolioSelectTemplateFlow = this.f141351b;
                        return czi.c.a(R$id.container, (b) managedPortfolioSelectTemplateFlow.L.getValue(), managedPortfolioSelectTemplateFlow);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (j) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g8f.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.M.getValue();
    }
}
