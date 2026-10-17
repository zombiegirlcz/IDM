package com.revolut.feature.kyc.impl.idnow.video_ident.screen;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.kyc.impl.idnow.video_ident.screen.IdnowVideoIdentScreen;
import com.revolut.feature.kyc.impl.idnow.video_ident.screen.IdnowVideoIdentScreenContract$InputData;
import com.revolut.feature.kyc.shared.R$id;
import com.revolut.feature.kyc.shared.R$layout;
import com.revolut.feature.kyc.shared.web_kyc.view.WebPortalLoadingView;
import com.revolut.kompot.navigable.vc.ViewController;
import iw8.e;
import iw8.f;
import iw8.j;
import iw8.k;
import iw8.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import vc.s;
import zu8.c0;
import zu8.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/idnow/video_ident/screen/IdnowVideoIdentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liw8/j;", "Lcli/w;", "Liw8/l;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IdnowVideoIdentScreen extends ViewController<j> implements w {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(IdnowVideoIdentScreen.class, "binding", "getBinding()Lcom/revolut/feature/kyc/shared/databinding/ScreenWebKycBinding;", 0))};
    public final IdnowVideoIdentScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public IdnowVideoIdentScreen(IdnowVideoIdentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_web_kyc;
        final int i = 0;
        this.M = te0.w.y0(new Function0(this) { // from class: iw8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdnowVideoIdentScreen f168990b;

            {
                this.f168990b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                IdnowVideoIdentScreen idnowVideoIdentScreen = this.f168990b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IdnowVideoIdentScreen.S;
                        return (k) ((zu8.w) idnowVideoIdentScreen.R.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = IdnowVideoIdentScreen.S;
                        return n14.e.a(idnowVideoIdentScreen, (k) idnowVideoIdentScreen.M.getValue());
                    case 2:
                        KProperty[] kPropertyArr3 = IdnowVideoIdentScreen.S;
                        zu8.w wVar = (zu8.w) idnowVideoIdentScreen.R.getValue();
                        wVar.getClass();
                        yx8.a aVar = (yx8.a) wVar.f325409c.get();
                        jw8.b.Companion.getClass();
                        return new ay8.a(aVar, c.f168987a);
                    case 3:
                        KProperty[] kPropertyArr4 = IdnowVideoIdentScreen.S;
                        zu8.w wVar2 = (zu8.w) idnowVideoIdentScreen.R.getValue();
                        wVar2.getClass();
                        return new zx8.a((yx8.a) wVar2.f325409c.get());
                    default:
                        KProperty[] kPropertyArr5 = IdnowVideoIdentScreen.S;
                        qji.b bVarU2 = idnowVideoIdentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.idnow.video_ident.screen.di.IdnowVideoIdentScreenInjector");
                        v vVar = (v) bVarU2;
                        c0 c0Var = vVar.f325405b;
                        v vVar2 = vVar.f325406c;
                        IdnowVideoIdentScreenContract$InputData idnowVideoIdentScreenContract$InputData = idnowVideoIdentScreen.K;
                        idnowVideoIdentScreenContract$InputData.getClass();
                        return new zu8.w(c0Var, vVar2, idnowVideoIdentScreenContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: iw8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdnowVideoIdentScreen f168990b;

            {
                this.f168990b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                IdnowVideoIdentScreen idnowVideoIdentScreen = this.f168990b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IdnowVideoIdentScreen.S;
                        return (k) ((zu8.w) idnowVideoIdentScreen.R.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = IdnowVideoIdentScreen.S;
                        return n14.e.a(idnowVideoIdentScreen, (k) idnowVideoIdentScreen.M.getValue());
                    case 2:
                        KProperty[] kPropertyArr3 = IdnowVideoIdentScreen.S;
                        zu8.w wVar = (zu8.w) idnowVideoIdentScreen.R.getValue();
                        wVar.getClass();
                        yx8.a aVar = (yx8.a) wVar.f325409c.get();
                        jw8.b.Companion.getClass();
                        return new ay8.a(aVar, c.f168987a);
                    case 3:
                        KProperty[] kPropertyArr4 = IdnowVideoIdentScreen.S;
                        zu8.w wVar2 = (zu8.w) idnowVideoIdentScreen.R.getValue();
                        wVar2.getClass();
                        return new zx8.a((yx8.a) wVar2.f325409c.get());
                    default:
                        KProperty[] kPropertyArr5 = IdnowVideoIdentScreen.S;
                        qji.b bVarU2 = idnowVideoIdentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.idnow.video_ident.screen.di.IdnowVideoIdentScreenInjector");
                        v vVar = (v) bVarU2;
                        c0 c0Var = vVar.f325405b;
                        v vVar2 = vVar.f325406c;
                        IdnowVideoIdentScreenContract$InputData idnowVideoIdentScreenContract$InputData = idnowVideoIdentScreen.K;
                        idnowVideoIdentScreenContract$InputData.getClass();
                        return new zu8.w(c0Var, vVar2, idnowVideoIdentScreenContract$InputData);
                }
            }
        });
        this.O = s.t(this, e.f);
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: iw8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdnowVideoIdentScreen f168990b;

            {
                this.f168990b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                IdnowVideoIdentScreen idnowVideoIdentScreen = this.f168990b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IdnowVideoIdentScreen.S;
                        return (k) ((zu8.w) idnowVideoIdentScreen.R.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = IdnowVideoIdentScreen.S;
                        return n14.e.a(idnowVideoIdentScreen, (k) idnowVideoIdentScreen.M.getValue());
                    case 2:
                        KProperty[] kPropertyArr3 = IdnowVideoIdentScreen.S;
                        zu8.w wVar = (zu8.w) idnowVideoIdentScreen.R.getValue();
                        wVar.getClass();
                        yx8.a aVar = (yx8.a) wVar.f325409c.get();
                        jw8.b.Companion.getClass();
                        return new ay8.a(aVar, c.f168987a);
                    case 3:
                        KProperty[] kPropertyArr4 = IdnowVideoIdentScreen.S;
                        zu8.w wVar2 = (zu8.w) idnowVideoIdentScreen.R.getValue();
                        wVar2.getClass();
                        return new zx8.a((yx8.a) wVar2.f325409c.get());
                    default:
                        KProperty[] kPropertyArr5 = IdnowVideoIdentScreen.S;
                        qji.b bVarU2 = idnowVideoIdentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.idnow.video_ident.screen.di.IdnowVideoIdentScreenInjector");
                        v vVar = (v) bVarU2;
                        c0 c0Var = vVar.f325405b;
                        v vVar2 = vVar.f325406c;
                        IdnowVideoIdentScreenContract$InputData idnowVideoIdentScreenContract$InputData = idnowVideoIdentScreen.K;
                        idnowVideoIdentScreenContract$InputData.getClass();
                        return new zu8.w(c0Var, vVar2, idnowVideoIdentScreenContract$InputData);
                }
            }
        });
        final int i5 = 3;
        this.Q = te0.w.y0(new Function0(this) { // from class: iw8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdnowVideoIdentScreen f168990b;

            {
                this.f168990b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                IdnowVideoIdentScreen idnowVideoIdentScreen = this.f168990b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IdnowVideoIdentScreen.S;
                        return (k) ((zu8.w) idnowVideoIdentScreen.R.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = IdnowVideoIdentScreen.S;
                        return n14.e.a(idnowVideoIdentScreen, (k) idnowVideoIdentScreen.M.getValue());
                    case 2:
                        KProperty[] kPropertyArr3 = IdnowVideoIdentScreen.S;
                        zu8.w wVar = (zu8.w) idnowVideoIdentScreen.R.getValue();
                        wVar.getClass();
                        yx8.a aVar = (yx8.a) wVar.f325409c.get();
                        jw8.b.Companion.getClass();
                        return new ay8.a(aVar, c.f168987a);
                    case 3:
                        KProperty[] kPropertyArr4 = IdnowVideoIdentScreen.S;
                        zu8.w wVar2 = (zu8.w) idnowVideoIdentScreen.R.getValue();
                        wVar2.getClass();
                        return new zx8.a((yx8.a) wVar2.f325409c.get());
                    default:
                        KProperty[] kPropertyArr5 = IdnowVideoIdentScreen.S;
                        qji.b bVarU2 = idnowVideoIdentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.idnow.video_ident.screen.di.IdnowVideoIdentScreenInjector");
                        v vVar = (v) bVarU2;
                        c0 c0Var = vVar.f325405b;
                        v vVar2 = vVar.f325406c;
                        IdnowVideoIdentScreenContract$InputData idnowVideoIdentScreenContract$InputData = idnowVideoIdentScreen.K;
                        idnowVideoIdentScreenContract$InputData.getClass();
                        return new zu8.w(c0Var, vVar2, idnowVideoIdentScreenContract$InputData);
                }
            }
        });
        final int i6 = 4;
        this.R = te0.w.y0(new Function0(this) { // from class: iw8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdnowVideoIdentScreen f168990b;

            {
                this.f168990b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                IdnowVideoIdentScreen idnowVideoIdentScreen = this.f168990b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IdnowVideoIdentScreen.S;
                        return (k) ((zu8.w) idnowVideoIdentScreen.R.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = IdnowVideoIdentScreen.S;
                        return n14.e.a(idnowVideoIdentScreen, (k) idnowVideoIdentScreen.M.getValue());
                    case 2:
                        KProperty[] kPropertyArr3 = IdnowVideoIdentScreen.S;
                        zu8.w wVar = (zu8.w) idnowVideoIdentScreen.R.getValue();
                        wVar.getClass();
                        yx8.a aVar = (yx8.a) wVar.f325409c.get();
                        jw8.b.Companion.getClass();
                        return new ay8.a(aVar, c.f168987a);
                    case 3:
                        KProperty[] kPropertyArr4 = IdnowVideoIdentScreen.S;
                        zu8.w wVar2 = (zu8.w) idnowVideoIdentScreen.R.getValue();
                        wVar2.getClass();
                        return new zx8.a((yx8.a) wVar2.f325409c.get());
                    default:
                        KProperty[] kPropertyArr5 = IdnowVideoIdentScreen.S;
                        qji.b bVarU2 = idnowVideoIdentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.idnow.video_ident.screen.di.IdnowVideoIdentScreenInjector");
                        v vVar = (v) bVarU2;
                        c0 c0Var = vVar.f325405b;
                        v vVar2 = vVar.f325406c;
                        IdnowVideoIdentScreenContract$InputData idnowVideoIdentScreenContract$InputData = idnowVideoIdentScreen.K;
                        idnowVideoIdentScreenContract$InputData.getClass();
                        return new zu8.w(c0Var, vVar2, idnowVideoIdentScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f292848b.i0(uiState.f168996a);
        d3().f292848b.setNavbarBackNavigationButtonVisible(uiState.f168997b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        return ((a) ((k) this.M.getValue())).I2();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (zu8.w) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (k) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        WebPortalLoadingView webPortalLoadingView = d3().f292848b;
        webPortalLoadingView.setWebViewClient((WebViewClient) this.P.getValue());
        webPortalLoadingView.setWebChromeClient((WebChromeClient) this.Q.getValue());
        webPortalLoadingView.g0(this.K.f77794a);
        ((ConstraintLayout) view.findViewById(R$id.portalLoading_screenContainer)).setBackground(new ColorDrawable(kli.a.s(R$attr.uikit_colorBackground, m2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, d3().f292848b.h0(), null, new f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, d3().f292848b.f77907n, null, new f(this, null, 1), 3);
    }

    public final vx8.a d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (vx8.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.N.getValue();
    }
}
