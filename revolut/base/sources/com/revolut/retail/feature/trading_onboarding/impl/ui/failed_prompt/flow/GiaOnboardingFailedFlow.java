package com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow;

import aii.q;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.GiaOnboardingFailedFlow;
import dgg.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kyk.c;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/failed_prompt/flow/GiaOnboardingFailedFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GiaOnboardingFailedFlow extends ViewController<q> implements f {
    public final Object K;
    public final Object L;
    public final Object M;
    public final int N;

    public GiaOnboardingFailedFlow(GiaOnboardingFailedFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: dzk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GiaOnboardingFailedFlow f121355b;

            {
                this.f121355b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((kyk.c) this.f121355b.L.getValue()).d.get();
                    default:
                        GiaOnboardingFailedFlow giaOnboardingFailedFlow = this.f121355b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, giaOnboardingFailedFlow, (b) giaOnboardingFailedFlow.K.getValue());
                }
            }
        });
        this.L = w.y0(new b(this, inputData, 23));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: dzk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GiaOnboardingFailedFlow f121355b;

            {
                this.f121355b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((kyk.c) this.f121355b.L.getValue()).d.get();
                    default:
                        GiaOnboardingFailedFlow giaOnboardingFailedFlow = this.f121355b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, giaOnboardingFailedFlow, (b) giaOnboardingFailedFlow.K.getValue());
                }
            }
        });
        this.N = R$layout.screen_transparent;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (dzk.b) this.K.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
