package com.revolut.feature.apm.wero.impl.ui.home;

import aii.q;
import com.revolut.feature.apm.wero.impl.ui.home.WeroHomeFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nh2.s;
import qji.b;
import te0.w;
import u1.g;
import uh2.c;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/home/WeroHomeFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WeroHomeFlow extends ViewController<q> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public WeroHomeFlow(WeroHomeFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new g(this, inputData, 29));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: uh2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeroHomeFlow f280055b;

            {
                this.f280055b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (c) ((s) this.f280055b.K.getValue()).i.get();
                    default:
                        WeroHomeFlow weroHomeFlow = this.f280055b;
                        return czi.c.d(0, 6, null, weroHomeFlow, (c) weroHomeFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: uh2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeroHomeFlow f280055b;

            {
                this.f280055b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (c) ((s) this.f280055b.K.getValue()).i.get();
                    default:
                        WeroHomeFlow weroHomeFlow = this.f280055b;
                        return czi.c.d(0, 6, null, weroHomeFlow, (c) weroHomeFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (s) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (s) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
