package com.revolut.sso.impl.ui.email.enter_email;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.email.enter_email.EnterEmailScreen;
import com.revolut.sso.impl.ui.email.enter_email.EnterEmailScreenContract$InputData;
import efm.r;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljl.h1;
import ljl.i1;
import te0.w;
import tx0.j0;
import vc.s;
import vml.c;
import vml.d;
import vml.i;
import vml.j;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/email/enter_email/EnterEmailScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvml/i;", "Ldli/a;", "Lvml/j;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EnterEmailScreen extends ViewController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EnterEmailScreen.class, "binding", "getBinding()Lcom/revolut/sso/impl/databinding/ScreenEnterEmailBinding;", 0))};
    public final EnterEmailScreenContract$InputData K;
    public final h L;
    public final InputTextDelegate M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final int Q;

    public EnterEmailScreen(EnterEmailScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, vml.b.f);
        this.M = new InputTextDelegate(null);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: vml.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnterEmailScreen f290619b;

            {
                this.f290619b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EnterEmailScreen enterEmailScreen = this.f290619b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EnterEmailScreen.R;
                        i1 i1Var = (i1) enterEmailScreen.P.getValue();
                        switch (i1Var.f195980a) {
                            case 0:
                                return (e) i1Var.d.get();
                            default:
                                return (e) i1Var.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = EnterEmailScreen.R;
                        EnterEmailScreen enterEmailScreen2 = this.f290619b;
                        return dli.f.a(enterEmailScreen2, (e) enterEmailScreen2.N.getValue(), u.c(enterEmailScreen2.M), R$id.enterEmailScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = EnterEmailScreen.R;
                        qji.b bVarU2 = enterEmailScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.email.enter_email.di.EnterEmailScreenInjector");
                        h1 h1Var = (h1) ((wml.a) bVarU2).c().mo3808a(enterEmailScreen);
                        EnterEmailScreenContract$InputData enterEmailScreenContract$InputData = enterEmailScreen.K;
                        switch (h1Var.f195969a) {
                            case 0:
                                enterEmailScreenContract$InputData.getClass();
                                h1Var.d = enterEmailScreenContract$InputData;
                                break;
                            default:
                                enterEmailScreenContract$InputData.getClass();
                                h1Var.d = enterEmailScreenContract$InputData;
                                break;
                        }
                        return (i1) h1Var.mo3783build();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: vml.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnterEmailScreen f290619b;

            {
                this.f290619b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EnterEmailScreen enterEmailScreen = this.f290619b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EnterEmailScreen.R;
                        i1 i1Var = (i1) enterEmailScreen.P.getValue();
                        switch (i1Var.f195980a) {
                            case 0:
                                return (e) i1Var.d.get();
                            default:
                                return (e) i1Var.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = EnterEmailScreen.R;
                        EnterEmailScreen enterEmailScreen2 = this.f290619b;
                        return dli.f.a(enterEmailScreen2, (e) enterEmailScreen2.N.getValue(), u.c(enterEmailScreen2.M), R$id.enterEmailScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = EnterEmailScreen.R;
                        qji.b bVarU2 = enterEmailScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.email.enter_email.di.EnterEmailScreenInjector");
                        h1 h1Var = (h1) ((wml.a) bVarU2).c().mo3808a(enterEmailScreen);
                        EnterEmailScreenContract$InputData enterEmailScreenContract$InputData = enterEmailScreen.K;
                        switch (h1Var.f195969a) {
                            case 0:
                                enterEmailScreenContract$InputData.getClass();
                                h1Var.d = enterEmailScreenContract$InputData;
                                break;
                            default:
                                enterEmailScreenContract$InputData.getClass();
                                h1Var.d = enterEmailScreenContract$InputData;
                                break;
                        }
                        return (i1) h1Var.mo3783build();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: vml.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnterEmailScreen f290619b;

            {
                this.f290619b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EnterEmailScreen enterEmailScreen = this.f290619b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EnterEmailScreen.R;
                        i1 i1Var = (i1) enterEmailScreen.P.getValue();
                        switch (i1Var.f195980a) {
                            case 0:
                                return (e) i1Var.d.get();
                            default:
                                return (e) i1Var.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = EnterEmailScreen.R;
                        EnterEmailScreen enterEmailScreen2 = this.f290619b;
                        return dli.f.a(enterEmailScreen2, (e) enterEmailScreen2.N.getValue(), u.c(enterEmailScreen2.M), R$id.enterEmailScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = EnterEmailScreen.R;
                        qji.b bVarU2 = enterEmailScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.email.enter_email.di.EnterEmailScreenInjector");
                        h1 h1Var = (h1) ((wml.a) bVarU2).c().mo3808a(enterEmailScreen);
                        EnterEmailScreenContract$InputData enterEmailScreenContract$InputData = enterEmailScreen.K;
                        switch (h1Var.f195969a) {
                            case 0:
                                enterEmailScreenContract$InputData.getClass();
                                h1Var.d = enterEmailScreenContract$InputData;
                                break;
                            default:
                                enterEmailScreenContract$InputData.getClass();
                                h1Var.d = enterEmailScreenContract$InputData;
                                break;
                        }
                        return (i1) h1Var.mo3783build();
                }
            }
        });
        this.Q = R$layout.screen_enter_email;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f115655b;
        TextLocalisedClause textLocalisedClause = uiState.f290623a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(uiState.f290624b);
        LargeActionButton largeActionButton = d3().f115656c;
        largeActionButton.setText(uiState.f290625c);
        largeActionButton.setEnabled(uiState.d);
        LargeActionButton largeActionButton2 = d3().d;
        Clause clause = uiState.e;
        largeActionButton2.setText(clause);
        largeActionButton2.setVisibility(clause != null ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i1) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (vml.e) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f115655b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f115655b.f59410q), null, new c(this, continuation, 0), 3);
        r rVarDebounce = this.M.e.f121375b.debounce(300L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarDebounce), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f115656c.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.o), null, new c(this, continuation, 2), 3);
    }

    public final dkl.i d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (dkl.i) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
