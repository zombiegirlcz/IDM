package com.revolut.feature.pix.screens.token_verification;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.e0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.screens.token_verification.TokenVerificationScreen;
import com.revolut.feature.pix.screens.token_verification.TokenVerificationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import p8a.o1;
import p8a.p1;
import te0.w;
import tx0.j0;
import vc.s;
import w65.c;
import wca.b;
import wca.f;
import wca.g;
import wca.l;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/screens/token_verification/TokenVerificationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwca/f;", "Ldli/a;", "Lwca/g;", "Lno/d1;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TokenVerificationScreen extends ViewController<f> implements a, d1 {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TokenVerificationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final TokenVerificationScreenContract$InputData K;
    public final boolean L;
    public final h M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public TokenVerificationScreen(TokenVerificationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        this.M = s.t(this, b.f);
        this.N = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: wca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TokenVerificationScreen f296362b;

            {
                this.f296362b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TokenVerificationScreen tokenVerificationScreen = this.f296362b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TokenVerificationScreen.T;
                        qji.b bVarU2 = tokenVerificationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.screens.token_verification.di.TokenVerificationScreenInjector");
                        o1 o1VarB = ((xca.a) bVarU2).b();
                        TokenVerificationScreenContract$InputData tokenVerificationScreenContract$InputData = tokenVerificationScreen.K;
                        switch (o1VarB.f234046a) {
                            case 0:
                                tokenVerificationScreenContract$InputData.getClass();
                                o1VarB.d = tokenVerificationScreenContract$InputData;
                                break;
                            default:
                                tokenVerificationScreenContract$InputData.getClass();
                                o1VarB.d = tokenVerificationScreenContract$InputData;
                                break;
                        }
                        return (p1) ((o1) o1VarB.mo3808a(tokenVerificationScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TokenVerificationScreen.T;
                        p1 p1Var = (p1) tokenVerificationScreen.O.getValue();
                        switch (p1Var.f234054a) {
                            case 0:
                                return (l) p1Var.f234056c.get();
                            default:
                                return (l) p1Var.f234056c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TokenVerificationScreen.T;
                        TokenVerificationScreen tokenVerificationScreen2 = this.f296362b;
                        return dli.f.a(tokenVerificationScreen2, (l) tokenVerificationScreen2.P.getValue(), v.k((TextDelegate) tokenVerificationScreen2.Q.getValue(), (CodeEditorDelegate) tokenVerificationScreen2.R.getValue(), new HeaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: wca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TokenVerificationScreen f296362b;

            {
                this.f296362b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TokenVerificationScreen tokenVerificationScreen = this.f296362b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TokenVerificationScreen.T;
                        qji.b bVarU2 = tokenVerificationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.screens.token_verification.di.TokenVerificationScreenInjector");
                        o1 o1VarB = ((xca.a) bVarU2).b();
                        TokenVerificationScreenContract$InputData tokenVerificationScreenContract$InputData = tokenVerificationScreen.K;
                        switch (o1VarB.f234046a) {
                            case 0:
                                tokenVerificationScreenContract$InputData.getClass();
                                o1VarB.d = tokenVerificationScreenContract$InputData;
                                break;
                            default:
                                tokenVerificationScreenContract$InputData.getClass();
                                o1VarB.d = tokenVerificationScreenContract$InputData;
                                break;
                        }
                        return (p1) ((o1) o1VarB.mo3808a(tokenVerificationScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TokenVerificationScreen.T;
                        p1 p1Var = (p1) tokenVerificationScreen.O.getValue();
                        switch (p1Var.f234054a) {
                            case 0:
                                return (l) p1Var.f234056c.get();
                            default:
                                return (l) p1Var.f234056c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TokenVerificationScreen.T;
                        TokenVerificationScreen tokenVerificationScreen2 = this.f296362b;
                        return dli.f.a(tokenVerificationScreen2, (l) tokenVerificationScreen2.P.getValue(), v.k((TextDelegate) tokenVerificationScreen2.Q.getValue(), (CodeEditorDelegate) tokenVerificationScreen2.R.getValue(), new HeaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = w.y0(new wal.f(14));
        this.R = w.y0(new wal.f(15));
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: wca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TokenVerificationScreen f296362b;

            {
                this.f296362b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TokenVerificationScreen tokenVerificationScreen = this.f296362b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TokenVerificationScreen.T;
                        qji.b bVarU2 = tokenVerificationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.screens.token_verification.di.TokenVerificationScreenInjector");
                        o1 o1VarB = ((xca.a) bVarU2).b();
                        TokenVerificationScreenContract$InputData tokenVerificationScreenContract$InputData = tokenVerificationScreen.K;
                        switch (o1VarB.f234046a) {
                            case 0:
                                tokenVerificationScreenContract$InputData.getClass();
                                o1VarB.d = tokenVerificationScreenContract$InputData;
                                break;
                            default:
                                tokenVerificationScreenContract$InputData.getClass();
                                o1VarB.d = tokenVerificationScreenContract$InputData;
                                break;
                        }
                        return (p1) ((o1) o1VarB.mo3808a(tokenVerificationScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TokenVerificationScreen.T;
                        p1 p1Var = (p1) tokenVerificationScreen.O.getValue();
                        switch (p1Var.f234054a) {
                            case 0:
                                return (l) p1Var.f234056c.get();
                            default:
                                return (l) p1Var.f234056c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TokenVerificationScreen.T;
                        TokenVerificationScreen tokenVerificationScreen2 = this.f296362b;
                        return dli.f.a(tokenVerificationScreen2, (l) tokenVerificationScreen2.P.getValue(), v.k((TextDelegate) tokenVerificationScreen2.Q.getValue(), (CodeEditorDelegate) tokenVerificationScreen2.R.getValue(), new HeaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(uiState.f296370a);
        navBarWithToolbar.setSecondDescriptionTextStyle(e0.CAPTION);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p1) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (l) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setTitle(this.K.f80762b, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new c(this, null, 16), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CodeEditorDelegate) this.R.getValue()).p()), null, new w50.g(this, (Continuation) null, 17), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TextDelegate) this.Q.getValue()).f53530c), null, new wca.c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
