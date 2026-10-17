package com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.flow;

import aii.q;
import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.flow.RevIQFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ppd.o0;
import te0.w;
import vqd.b;
import vqd.c;
import vqd.d;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/rev_iq/flow/RevIQFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevIQFlow extends ViewController<q> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public RevIQFlow(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: vqd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevIQFlow f291384b;

            {
                this.f291384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (c) ((o0) this.f291384b.L.getValue()).f238519b.get();
                    default:
                        RevIQFlow revIQFlow = this.f291384b;
                        return czi.c.d(0, 6, null, revIQFlow, (c) revIQFlow.K.getValue());
                }
            }
        });
        this.L = w.y0(new b(this, inputData, 0));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: vqd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevIQFlow f291384b;

            {
                this.f291384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (c) ((o0) this.f291384b.L.getValue()).f238519b.get();
                    default:
                        RevIQFlow revIQFlow = this.f291384b;
                        return czi.c.d(0, 6, null, revIQFlow, (c) revIQFlow.K.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (o0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
