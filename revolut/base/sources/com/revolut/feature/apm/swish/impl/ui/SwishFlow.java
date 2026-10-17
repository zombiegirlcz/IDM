package com.revolut.feature.apm.swish.impl.ui;

import aii.q;
import com.revolut.feature.apm.swish.api.navigation.SwishNavigation$InputData;
import com.revolut.feature.apm.swish.impl.ui.SwishFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/swish/impl/ui/SwishFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_apm_swish_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwishFlow extends ViewController<q> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public SwishFlow(SwishNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: je2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwishFlow f173186b;

            {
                this.f173186b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SwishFlow swishFlow = this.f173186b;
                        return czi.c.d(0, 6, null, swishFlow, (b) swishFlow.M.getValue());
                    default:
                        return (b) ((he2.f) this.f173186b.L.getValue()).f151541c.get();
                }
            }
        });
        this.L = w.y0(new j68.a(this, inputData, 19));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: je2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwishFlow f173186b;

            {
                this.f173186b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SwishFlow swishFlow = this.f173186b;
                        return czi.c.d(0, 6, null, swishFlow, (b) swishFlow.M.getValue());
                    default:
                        return (b) ((he2.f) this.f173186b.L.getValue()).f151541c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (he2.f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (he2.f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (je2.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.K.getValue();
    }
}
