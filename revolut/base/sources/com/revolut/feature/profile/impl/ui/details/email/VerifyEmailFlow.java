package com.revolut.feature.profile.impl.ui.details.email;

import aii.q;
import com.revolut.feature.profile.impl.ui.details.email.VerifyEmailFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import fma.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yhm.d;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/details/email/VerifyEmailFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class VerifyEmailFlow extends ViewController<q> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public VerifyEmailFlow(VerifyEmailFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new s86.a(this, inputData, 19));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: sma.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerifyEmailFlow f264401b;

            {
                this.f264401b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((i) this.f264401b.K.getValue()).d.get();
                    default:
                        VerifyEmailFlow verifyEmailFlow = this.f264401b;
                        return czi.c.d(0, 6, null, verifyEmailFlow, (b) verifyEmailFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: sma.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerifyEmailFlow f264401b;

            {
                this.f264401b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((i) this.f264401b.K.getValue()).d.get();
                    default:
                        VerifyEmailFlow verifyEmailFlow = this.f264401b;
                        return czi.c.d(0, 6, null, verifyEmailFlow, (b) verifyEmailFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (i) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (sma.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
