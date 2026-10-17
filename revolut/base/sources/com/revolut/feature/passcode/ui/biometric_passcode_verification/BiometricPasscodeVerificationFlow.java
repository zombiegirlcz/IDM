package com.revolut.feature.passcode.ui.biometric_passcode_verification;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.passcode.ui.biometric_passcode_verification.BiometricPasscodeVerificationFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import he9.d;
import in0.g;
import ke9.c;
import ke9.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import le3.y;
import no.k;
import no.m;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/passcode/ui/biometric_passcode_verification/BiometricPasscodeVerificationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lke9/i;", "Lyki/f;", "Lno/k;", "Lno/m;", "Lin0/g;", "feature_passcode_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricPasscodeVerificationFlow extends ViewController<i> implements f, k, m, g {
    public final Object K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;
    public AnalyticsContext P;
    public final AnalyticsProduct Q;

    public BiometricPasscodeVerificationFlow(BiometricPasscodeVerificationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: ke9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricPasscodeVerificationFlow f183050b;

            {
                this.f183050b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        he9.d dVar = (he9.d) this.f183050b.L.getValue();
                        ViewController controller = dVar.f151605a;
                        he9.c factory = (he9.c) dVar.e.get();
                        le9.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return factory.a(new y(controller, 5), new f01.c(controller.m2()));
                    case 1:
                        return (c) ((he9.d) this.f183050b.L.getValue()).f.get();
                    default:
                        BiometricPasscodeVerificationFlow biometricPasscodeVerificationFlow = this.f183050b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, biometricPasscodeVerificationFlow, (c) biometricPasscodeVerificationFlow.N.getValue());
                }
            }
        });
        this.L = w.y0(new k8e.a(this, inputData, 10));
        this.M = R$layout.screen_transparent;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ke9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricPasscodeVerificationFlow f183050b;

            {
                this.f183050b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        he9.d dVar = (he9.d) this.f183050b.L.getValue();
                        ViewController controller = dVar.f151605a;
                        he9.c factory = (he9.c) dVar.e.get();
                        le9.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return factory.a(new y(controller, 5), new f01.c(controller.m2()));
                    case 1:
                        return (c) ((he9.d) this.f183050b.L.getValue()).f.get();
                    default:
                        BiometricPasscodeVerificationFlow biometricPasscodeVerificationFlow = this.f183050b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, biometricPasscodeVerificationFlow, (c) biometricPasscodeVerificationFlow.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: ke9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricPasscodeVerificationFlow f183050b;

            {
                this.f183050b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        he9.d dVar = (he9.d) this.f183050b.L.getValue();
                        ViewController controller = dVar.f151605a;
                        he9.c factory = (he9.c) dVar.e.get();
                        le9.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return factory.a(new y(controller, 5), new f01.c(controller.m2()));
                    case 1:
                        return (c) ((he9.d) this.f183050b.L.getValue()).f.get();
                    default:
                        BiometricPasscodeVerificationFlow biometricPasscodeVerificationFlow = this.f183050b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, biometricPasscodeVerificationFlow, (c) biometricPasscodeVerificationFlow.N.getValue());
                }
            }
        });
        this.Q = inputData.f78636a;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.P = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getN() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.L.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getO() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (d) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        fe9.e eVar = (fe9.e) ((fe9.a) this.K.getValue());
        eVar.i = null;
        eVar.f134480j = null;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.K;
        fe9.a aVar = (fe9.a) r56.getValue();
        Activity activityM2 = m2();
        Intrinsics.i(activityM2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity activity = (FragmentActivity) activityM2;
        fe9.e eVar = (fe9.e) aVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(this, "analyticsContextHolder");
        eVar.i = activity;
        eVar.f134480j = null;
        eVar.k = this;
        com.revolut.kompot.navigable.a.g2(this, ((fe9.e) ((fe9.a) r56.getValue())).f, null, new ke9.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new dfj.f(((b) ((c) this.N.getValue())).f78642r.c3(), 23), null, new ke9.b(this, null, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
