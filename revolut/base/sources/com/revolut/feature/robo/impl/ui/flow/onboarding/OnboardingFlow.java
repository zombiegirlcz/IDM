package com.revolut.feature.robo.impl.ui.flow.onboarding;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import dmc.i;
import grl.k9;
import k8e.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/flow/onboarding/OnboardingFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lyki/f;", "Lno/m;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OnboardingFlow extends ViewController<Object> implements f, m {
    public final k9 K;
    public final Object L;
    public final Object M;
    public final Object N;

    public OnboardingFlow(OnboardingFlowContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        k9 value = k9.RoboAdvisor;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        this.K = value;
        this.L = w.y0(new a(this, input, 18));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: kmc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingFlow f185751b;

            {
                this.f185751b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((dmc.i) this.f185751b.L.getValue()).e.get();
                    default:
                        OnboardingFlow onboardingFlow = this.f185751b;
                        return czi.c.d(0, 6, null, onboardingFlow, (b) onboardingFlow.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: kmc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingFlow f185751b;

            {
                this.f185751b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((dmc.i) this.f185751b.L.getValue()).e.get();
                    default:
                        OnboardingFlow onboardingFlow = this.f185751b;
                        return czi.c.d(0, 6, null, onboardingFlow, (b) onboardingFlow.M.getValue());
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return new AnalyticsProduct.Retail(this.K);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (i) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (kmc.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
