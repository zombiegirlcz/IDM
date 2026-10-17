package com.revolut.feature.onboarding.selfie.impl.intro.flow;

import com.revolut.feature.onboarding.selfie.impl.intro.flow.OnboardingSelfieIntroFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import pu.e;
import te0.w;
import vd9.c;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/onboarding/selfie/impl/intro/flow/OnboardingSelfieIntroFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpu/e;", "Lyki/f;", "Lin0/g;", "Lno/d1;", "feature_retail_onboarding_selfie_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OnboardingSelfieIntroFlow extends ViewController<e> implements f, g, d1 {
    public final Object K;
    public final Object L;
    public final Object M;

    public OnboardingSelfieIntroFlow(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new vd1.a(this, inputData, 1));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: vd9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingSelfieIntroFlow f287828b;

            {
                this.f287828b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((ud9.b) this.f287828b.K.getValue()).f279177b.get();
                    default:
                        OnboardingSelfieIntroFlow onboardingSelfieIntroFlow = this.f287828b;
                        return czi.c.d(0, 6, null, onboardingSelfieIntroFlow, (b) onboardingSelfieIntroFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: vd9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingSelfieIntroFlow f287828b;

            {
                this.f287828b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((ud9.b) this.f287828b.K.getValue()).f279177b.get();
                    default:
                        OnboardingSelfieIntroFlow onboardingSelfieIntroFlow = this.f287828b;
                        return czi.c.d(0, 6, null, onboardingSelfieIntroFlow, (b) onboardingSelfieIntroFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ud9.b) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (ud9.b) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (vd9.b) this.L.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
