package com.revolut.feature.kyc.impl.trustdock.icchip.screen;

import aii.r;
import android.app.Application;
import android.content.Intent;
import android.view.View;
import cli.a0;
import cli.l;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.feature.kyc.impl.trustdock.icchip.screen.TrustdockIcChipScreen;
import com.revolut.feature_trustdock_ic_chip_api.TrustdockIcChipSdkOutput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jnf.a;
import jx8.b;
import jx8.c;
import jx8.d;
import jx8.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xki.e;
import zu8.h0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/trustdock/icchip/screen/TrustdockIcChipScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljx8/b;", "Lcli/w;", "Lcli/l;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrustdockIcChipScreen extends ViewController<b> implements w {
    public final Object K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public TrustdockIcChipScreen(TrustdockIcChipScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = te0.w.y0(new a(this, inputData, 16));
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: jx8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustdockIcChipScreen f179087b;

            {
                this.f179087b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (e) ((h0) this.f179087b.K.getValue()).f325284c.get();
                    case 1:
                        TrustdockIcChipScreen trustdockIcChipScreen = this.f179087b;
                        return n14.e.a(trustdockIcChipScreen, (e) trustdockIcChipScreen.L.getValue());
                    case 2:
                        return (Application.ActivityLifecycleCallbacks) ((h0) this.f179087b.K.getValue()).d.get();
                    default:
                        Application application = this.f179087b.m2().getApplication();
                        Intrinsics.i(application, "null cannot be cast to non-null type android.app.Application");
                        return application;
                }
            }
        });
        this.M = R$layout.screen_transparent;
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: jx8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustdockIcChipScreen f179087b;

            {
                this.f179087b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (e) ((h0) this.f179087b.K.getValue()).f325284c.get();
                    case 1:
                        TrustdockIcChipScreen trustdockIcChipScreen = this.f179087b;
                        return n14.e.a(trustdockIcChipScreen, (e) trustdockIcChipScreen.L.getValue());
                    case 2:
                        return (Application.ActivityLifecycleCallbacks) ((h0) this.f179087b.K.getValue()).d.get();
                    default:
                        Application application = this.f179087b.m2().getApplication();
                        Intrinsics.i(application, "null cannot be cast to non-null type android.app.Application");
                        return application;
                }
            }
        });
        final int i3 = 2;
        this.O = te0.w.y0(new Function0(this) { // from class: jx8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustdockIcChipScreen f179087b;

            {
                this.f179087b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (e) ((h0) this.f179087b.K.getValue()).f325284c.get();
                    case 1:
                        TrustdockIcChipScreen trustdockIcChipScreen = this.f179087b;
                        return n14.e.a(trustdockIcChipScreen, (e) trustdockIcChipScreen.L.getValue());
                    case 2:
                        return (Application.ActivityLifecycleCallbacks) ((h0) this.f179087b.K.getValue()).d.get();
                    default:
                        Application application = this.f179087b.m2().getApplication();
                        Intrinsics.i(application, "null cannot be cast to non-null type android.app.Application");
                        return application;
                }
            }
        });
        final int i5 = 3;
        this.P = te0.w.y0(new Function0(this) { // from class: jx8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustdockIcChipScreen f179087b;

            {
                this.f179087b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return (e) ((h0) this.f179087b.K.getValue()).f325284c.get();
                    case 1:
                        TrustdockIcChipScreen trustdockIcChipScreen = this.f179087b;
                        return n14.e.a(trustdockIcChipScreen, (e) trustdockIcChipScreen.L.getValue());
                    case 2:
                        return (Application.ActivityLifecycleCallbacks) ((h0) this.f179087b.K.getValue()).d.get();
                    default:
                        Application application = this.f179087b.m2().getApplication();
                        Intrinsics.i(application, "null cannot be cast to non-null type android.app.Application");
                        return application;
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h0) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (jx8.e) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        f fVar = (f) ((jx8.e) this.L.getValue());
        fVar.getClass();
        r dVar = b.C1022b.f179089a;
        if (i != 60440 || i2 != -1) {
            fVar.C2(dVar);
            return;
        }
        TrustdockIcChipSdkOutput trustdockIcChipSdkOutput = intent != null ? (TrustdockIcChipSdkOutput) intent.getParcelableExtra("trustdockFeatureResult") : null;
        if (trustdockIcChipSdkOutput instanceof TrustdockIcChipSdkOutput.Completed) {
            dVar = new c(((TrustdockIcChipSdkOutput.Completed) trustdockIcChipSdkOutput).f98145a);
        } else if (!Intrinsics.f(trustdockIcChipSdkOutput, TrustdockIcChipSdkOutput.Cancelled.f98144a)) {
            if (Intrinsics.f(trustdockIcChipSdkOutput, TrustdockIcChipSdkOutput.VerificationFailed.f98150a)) {
                dVar = b.c.f179090a;
            } else if (Intrinsics.f(trustdockIcChipSdkOutput, TrustdockIcChipSdkOutput.CameraPermissionRequired.f98143a)) {
                dVar = b.a.f179088a;
            } else if (Intrinsics.f(trustdockIcChipSdkOutput, TrustdockIcChipSdkOutput.DeviceNotSupported.f98146a)) {
                dVar = new d(hx8.a.DEVICE_NOT_SUPPORTED);
            } else if (Intrinsics.f(trustdockIcChipSdkOutput, TrustdockIcChipSdkOutput.NetworkError.f98147a)) {
                dVar = new d(hx8.a.NETWORK_ERROR);
            } else if (Intrinsics.f(trustdockIcChipSdkOutput, TrustdockIcChipSdkOutput.ServiceUnavailable.f98148a)) {
                dVar = new d(hx8.a.SERVICE_UNAVAILABLE);
            } else {
                if (!Intrinsics.f(trustdockIcChipSdkOutput, TrustdockIcChipSdkOutput.UnknownError.f98149a) && trustdockIcChipSdkOutput != null) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = new d(hx8.a.UNKNOWN_ERROR);
            }
        }
        fVar.C2(dVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((Application) this.P.getValue()).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) this.O.getValue());
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        ((Application) this.P.getValue()).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) this.O.getValue());
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.N.getValue();
    }
}
