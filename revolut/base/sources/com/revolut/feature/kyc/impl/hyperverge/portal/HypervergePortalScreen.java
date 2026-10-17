package com.revolut.feature.kyc.impl.hyperverge.portal;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import androidx.viewbinding.ViewBinding;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.feature.kyc.impl.hyperverge.portal.HypervergePortalScreen;
import com.revolut.feature.kyc.shared.R$layout;
import com.revolut.feature.kyc.shared.web_kyc.view.WebPortalLoadingView;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import vc.s;
import yv8.b;
import yv8.c;
import yv8.e;
import yv8.h;
import yv8.i;
import yv8.k;
import zu8.l0;
import zu8.m0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/hyperverge/portal/HypervergePortalScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyv8/h;", "Lcli/w;", "Lyv8/i;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HypervergePortalScreen extends ViewController<h> implements w {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(HypervergePortalScreen.class, "binding", "getBinding()Lcom/revolut/feature/kyc/shared/databinding/ScreenWebKycBinding;", 0))};
    public final e K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final ao.h P;
    public final Object Q;
    public final Object R;

    public HypervergePortalScreen(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_web_kyc;
        final int i = 0;
        this.M = te0.w.y0(new Function0(this) { // from class: yv8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HypervergePortalScreen f317139b;

            {
                this.f317139b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                HypervergePortalScreen hypervergePortalScreen = this.f317139b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = HypervergePortalScreen.S;
                        m0 m0Var = (m0) hypervergePortalScreen.N.getValue();
                        switch (m0Var.f325318a) {
                            case 0:
                                return (k) m0Var.e.get();
                            default:
                                return (k) m0Var.e.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = HypervergePortalScreen.S;
                        qji.b bVarU2 = hypervergePortalScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.kyc.impl.hyperverge.portal.di.HypervergePortalScreenInjector");
                        }
                        l0 l0VarB = ((zv8.a) bVarU2).b();
                        e eVar = hypervergePortalScreen.K;
                        switch (l0VarB.f325312a) {
                            case 0:
                                eVar.getClass();
                                l0VarB.d = eVar;
                                break;
                            default:
                                eVar.getClass();
                                l0VarB.d = eVar;
                                break;
                        }
                        return (m0) ((l0) l0VarB.mo3808a(hypervergePortalScreen)).mo3783build();
                    case 2:
                        KProperty[] kPropertyArr3 = HypervergePortalScreen.S;
                        return n14.e.a(hypervergePortalScreen, (k) hypervergePortalScreen.M.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = HypervergePortalScreen.S;
                        m0 m0Var2 = (m0) hypervergePortalScreen.N.getValue();
                        switch (m0Var2.f325318a) {
                            case 0:
                                return new ay8.a((yx8.a) m0Var2.d.get(), (dy8.a) m0Var2.f.get());
                            default:
                                return new ay8.a((yx8.a) m0Var2.d.get(), (dy8.a) m0Var2.f.get());
                        }
                    default:
                        KProperty[] kPropertyArr5 = HypervergePortalScreen.S;
                        m0 m0Var3 = (m0) hypervergePortalScreen.N.getValue();
                        switch (m0Var3.f325318a) {
                            case 0:
                                return new zx8.a((yx8.a) m0Var3.d.get());
                            default:
                                return new zx8.a((yx8.a) m0Var3.d.get());
                        }
                }
            }
        });
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: yv8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HypervergePortalScreen f317139b;

            {
                this.f317139b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                HypervergePortalScreen hypervergePortalScreen = this.f317139b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = HypervergePortalScreen.S;
                        m0 m0Var = (m0) hypervergePortalScreen.N.getValue();
                        switch (m0Var.f325318a) {
                            case 0:
                                return (k) m0Var.e.get();
                            default:
                                return (k) m0Var.e.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = HypervergePortalScreen.S;
                        qji.b bVarU2 = hypervergePortalScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.kyc.impl.hyperverge.portal.di.HypervergePortalScreenInjector");
                        }
                        l0 l0VarB = ((zv8.a) bVarU2).b();
                        e eVar = hypervergePortalScreen.K;
                        switch (l0VarB.f325312a) {
                            case 0:
                                eVar.getClass();
                                l0VarB.d = eVar;
                                break;
                            default:
                                eVar.getClass();
                                l0VarB.d = eVar;
                                break;
                        }
                        return (m0) ((l0) l0VarB.mo3808a(hypervergePortalScreen)).mo3783build();
                    case 2:
                        KProperty[] kPropertyArr3 = HypervergePortalScreen.S;
                        return n14.e.a(hypervergePortalScreen, (k) hypervergePortalScreen.M.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = HypervergePortalScreen.S;
                        m0 m0Var2 = (m0) hypervergePortalScreen.N.getValue();
                        switch (m0Var2.f325318a) {
                            case 0:
                                return new ay8.a((yx8.a) m0Var2.d.get(), (dy8.a) m0Var2.f.get());
                            default:
                                return new ay8.a((yx8.a) m0Var2.d.get(), (dy8.a) m0Var2.f.get());
                        }
                    default:
                        KProperty[] kPropertyArr5 = HypervergePortalScreen.S;
                        m0 m0Var3 = (m0) hypervergePortalScreen.N.getValue();
                        switch (m0Var3.f325318a) {
                            case 0:
                                return new zx8.a((yx8.a) m0Var3.d.get());
                            default:
                                return new zx8.a((yx8.a) m0Var3.d.get());
                        }
                }
            }
        });
        final int i3 = 2;
        this.O = te0.w.y0(new Function0(this) { // from class: yv8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HypervergePortalScreen f317139b;

            {
                this.f317139b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                HypervergePortalScreen hypervergePortalScreen = this.f317139b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = HypervergePortalScreen.S;
                        m0 m0Var = (m0) hypervergePortalScreen.N.getValue();
                        switch (m0Var.f325318a) {
                            case 0:
                                return (k) m0Var.e.get();
                            default:
                                return (k) m0Var.e.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = HypervergePortalScreen.S;
                        qji.b bVarU2 = hypervergePortalScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.kyc.impl.hyperverge.portal.di.HypervergePortalScreenInjector");
                        }
                        l0 l0VarB = ((zv8.a) bVarU2).b();
                        e eVar = hypervergePortalScreen.K;
                        switch (l0VarB.f325312a) {
                            case 0:
                                eVar.getClass();
                                l0VarB.d = eVar;
                                break;
                            default:
                                eVar.getClass();
                                l0VarB.d = eVar;
                                break;
                        }
                        return (m0) ((l0) l0VarB.mo3808a(hypervergePortalScreen)).mo3783build();
                    case 2:
                        KProperty[] kPropertyArr3 = HypervergePortalScreen.S;
                        return n14.e.a(hypervergePortalScreen, (k) hypervergePortalScreen.M.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = HypervergePortalScreen.S;
                        m0 m0Var2 = (m0) hypervergePortalScreen.N.getValue();
                        switch (m0Var2.f325318a) {
                            case 0:
                                return new ay8.a((yx8.a) m0Var2.d.get(), (dy8.a) m0Var2.f.get());
                            default:
                                return new ay8.a((yx8.a) m0Var2.d.get(), (dy8.a) m0Var2.f.get());
                        }
                    default:
                        KProperty[] kPropertyArr5 = HypervergePortalScreen.S;
                        m0 m0Var3 = (m0) hypervergePortalScreen.N.getValue();
                        switch (m0Var3.f325318a) {
                            case 0:
                                return new zx8.a((yx8.a) m0Var3.d.get());
                            default:
                                return new zx8.a((yx8.a) m0Var3.d.get());
                        }
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i5 = 3;
        this.Q = te0.w.y0(new Function0(this) { // from class: yv8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HypervergePortalScreen f317139b;

            {
                this.f317139b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                HypervergePortalScreen hypervergePortalScreen = this.f317139b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = HypervergePortalScreen.S;
                        m0 m0Var = (m0) hypervergePortalScreen.N.getValue();
                        switch (m0Var.f325318a) {
                            case 0:
                                return (k) m0Var.e.get();
                            default:
                                return (k) m0Var.e.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = HypervergePortalScreen.S;
                        qji.b bVarU2 = hypervergePortalScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.kyc.impl.hyperverge.portal.di.HypervergePortalScreenInjector");
                        }
                        l0 l0VarB = ((zv8.a) bVarU2).b();
                        e eVar = hypervergePortalScreen.K;
                        switch (l0VarB.f325312a) {
                            case 0:
                                eVar.getClass();
                                l0VarB.d = eVar;
                                break;
                            default:
                                eVar.getClass();
                                l0VarB.d = eVar;
                                break;
                        }
                        return (m0) ((l0) l0VarB.mo3808a(hypervergePortalScreen)).mo3783build();
                    case 2:
                        KProperty[] kPropertyArr3 = HypervergePortalScreen.S;
                        return n14.e.a(hypervergePortalScreen, (k) hypervergePortalScreen.M.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = HypervergePortalScreen.S;
                        m0 m0Var2 = (m0) hypervergePortalScreen.N.getValue();
                        switch (m0Var2.f325318a) {
                            case 0:
                                return new ay8.a((yx8.a) m0Var2.d.get(), (dy8.a) m0Var2.f.get());
                            default:
                                return new ay8.a((yx8.a) m0Var2.d.get(), (dy8.a) m0Var2.f.get());
                        }
                    default:
                        KProperty[] kPropertyArr5 = HypervergePortalScreen.S;
                        m0 m0Var3 = (m0) hypervergePortalScreen.N.getValue();
                        switch (m0Var3.f325318a) {
                            case 0:
                                return new zx8.a((yx8.a) m0Var3.d.get());
                            default:
                                return new zx8.a((yx8.a) m0Var3.d.get());
                        }
                }
            }
        });
        final int i6 = 4;
        this.R = te0.w.y0(new Function0(this) { // from class: yv8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HypervergePortalScreen f317139b;

            {
                this.f317139b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                HypervergePortalScreen hypervergePortalScreen = this.f317139b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = HypervergePortalScreen.S;
                        m0 m0Var = (m0) hypervergePortalScreen.N.getValue();
                        switch (m0Var.f325318a) {
                            case 0:
                                return (k) m0Var.e.get();
                            default:
                                return (k) m0Var.e.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = HypervergePortalScreen.S;
                        qji.b bVarU2 = hypervergePortalScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.kyc.impl.hyperverge.portal.di.HypervergePortalScreenInjector");
                        }
                        l0 l0VarB = ((zv8.a) bVarU2).b();
                        e eVar = hypervergePortalScreen.K;
                        switch (l0VarB.f325312a) {
                            case 0:
                                eVar.getClass();
                                l0VarB.d = eVar;
                                break;
                            default:
                                eVar.getClass();
                                l0VarB.d = eVar;
                                break;
                        }
                        return (m0) ((l0) l0VarB.mo3808a(hypervergePortalScreen)).mo3783build();
                    case 2:
                        KProperty[] kPropertyArr3 = HypervergePortalScreen.S;
                        return n14.e.a(hypervergePortalScreen, (k) hypervergePortalScreen.M.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = HypervergePortalScreen.S;
                        m0 m0Var2 = (m0) hypervergePortalScreen.N.getValue();
                        switch (m0Var2.f325318a) {
                            case 0:
                                return new ay8.a((yx8.a) m0Var2.d.get(), (dy8.a) m0Var2.f.get());
                            default:
                                return new ay8.a((yx8.a) m0Var2.d.get(), (dy8.a) m0Var2.f.get());
                        }
                    default:
                        KProperty[] kPropertyArr5 = HypervergePortalScreen.S;
                        m0 m0Var3 = (m0) hypervergePortalScreen.N.getValue();
                        switch (m0Var3.f325318a) {
                            case 0:
                                return new zx8.a((yx8.a) m0Var3.d.get());
                            default:
                                return new zx8.a((yx8.a) m0Var3.d.get());
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f292848b.i0(uiState.f317146a);
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean J2() {
        return !this.K.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (m0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (k) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        WebPortalLoadingView webPortalLoadingView = d3().f292848b;
        webPortalLoadingView.setWebViewClient((WebViewClient) this.Q.getValue());
        webPortalLoadingView.setWebChromeClient((WebChromeClient) this.R.getValue());
        e eVar = this.K;
        webPortalLoadingView.g0(eVar.f317141a);
        webPortalLoadingView.setNavbarBackNavigationButtonVisible(eVar.d);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.K.d) {
            a.g2(this, d3().f292848b.h0(), null, new c(this, null, 0), 3);
        }
        a.g2(this, d3().f292848b.f77907n, null, new c(this, null, 1), 3);
    }

    public final vx8.a d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (vx8.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.O.getValue();
    }
}
