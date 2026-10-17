package com.revolut.feature.kyc.impl.incode.screen;

import android.app.Activity;
import android.view.View;
import cli.a0;
import cli.l;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.feature.kyc.impl.incode.screen.IncodeScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lw8.g;
import ly8.b;
import th0.j;
import uc.a;
import xki.e;
import zu8.c0;
import zu8.z;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/incode/screen/IncodeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lly8/b;", "Lcli/w;", "Lcli/l;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IncodeScreen extends ViewController<b> implements w {
    public final Object K;
    public final Object L;
    public final int M;
    public final Object N;
    public final boolean O;

    public IncodeScreen(IncodeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = te0.w.y0(new ltf.b(this, inputData, 6));
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: lw8.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncodeScreen f200433b;

            {
                this.f200433b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (g) ((z) this.f200433b.K.getValue()).f325418g.get();
                    default:
                        IncodeScreen incodeScreen = this.f200433b;
                        return n14.e.a(incodeScreen, (g) incodeScreen.L.getValue());
                }
            }
        });
        this.M = R$layout.screen_transparent;
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: lw8.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncodeScreen f200433b;

            {
                this.f200433b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (g) ((z) this.f200433b.K.getValue()).f325418g.get();
                    default:
                        IncodeScreen incodeScreen = this.f200433b;
                        return n14.e.a(incodeScreen, (g) incodeScreen.L.getValue());
                }
            }
        });
        this.O = true;
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
        return (z) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        c0 c0Var = ((z) this.K.getValue()).f325417c;
        j.a();
        Activity activity = m2();
        Intrinsics.checkNotNullParameter(activity, "activity");
        a.a(activity);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
