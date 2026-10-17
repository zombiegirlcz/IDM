package com.revolut.feature.junior.account_activation.impl.ui.screen.request;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.junior.account_activation.impl.ui.screen.request.ActivationRequestScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import n68.f;
import n68.i;
import n68.l;
import n68.m;
import n68.n;
import n68.o;
import n68.r;
import te0.w;
import tx0.t3;
import vc.s;
import xki.e;
import yhm.j;
import z58.g;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/a;", "Ldli/a;", "Ln68/s;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActivationRequestScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(ActivationRequestScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinVerticalButtonsBinding;", 0))};
    public final o K;
    public final int L;
    public final boolean M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Lazy Q;
    public final CellDetailsActionDelegate R;
    public final TextDelegate S;
    public final SelectableDelegate T;
    public final ErrorDelegate U;
    public final TextDelegate V;
    public final RowDelegate W;
    public final LargeActionButtonDelegate X;

    public ActivationRequestScreen(o inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_twin_vertical_buttons;
        this.M = true;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: n68.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivationRequestScreen f212717b;

            {
                this.f212717b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ActivationRequestScreen activationRequestScreen = this.f212717b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ActivationRequestScreen.Y;
                        return (r) ((z58.g) activationRequestScreen.Q.getValue()).f319566h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ActivationRequestScreen.Y;
                        ActivationRequestScreen activationRequestScreen2 = this.f212717b;
                        return dli.f.a(activationRequestScreen2, activationRequestScreen2.e3(), zhm.v.k(activationRequestScreen2.R, activationRequestScreen2.T, activationRequestScreen2.S, new RowLoadingDelegate(), activationRequestScreen2.U), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ActivationRequestScreen.Y;
                        phm.a aVar = (phm.a) ue0.e.j(activationRequestScreen.m2()).a().get(o58.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o58.a.class, " is not found"));
                        }
                        z58.j jVar = ((z58.j) aVar2.b()).o;
                        o oVar = activationRequestScreen.K;
                        oVar.getClass();
                        return new z58.g(jVar, activationRequestScreen, oVar);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: n68.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivationRequestScreen f212717b;

            {
                this.f212717b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ActivationRequestScreen activationRequestScreen = this.f212717b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ActivationRequestScreen.Y;
                        return (r) ((z58.g) activationRequestScreen.Q.getValue()).f319566h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ActivationRequestScreen.Y;
                        ActivationRequestScreen activationRequestScreen2 = this.f212717b;
                        return dli.f.a(activationRequestScreen2, activationRequestScreen2.e3(), zhm.v.k(activationRequestScreen2.R, activationRequestScreen2.T, activationRequestScreen2.S, new RowLoadingDelegate(), activationRequestScreen2.U), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ActivationRequestScreen.Y;
                        phm.a aVar = (phm.a) ue0.e.j(activationRequestScreen.m2()).a().get(o58.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o58.a.class, " is not found"));
                        }
                        z58.j jVar = ((z58.j) aVar2.b()).o;
                        o oVar = activationRequestScreen.K;
                        oVar.getClass();
                        return new z58.g(jVar, activationRequestScreen, oVar);
                }
            }
        });
        this.P = s.t(this, n68.c.f);
        final int i3 = 2;
        this.Q = j.b(new Function0(this) { // from class: n68.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivationRequestScreen f212717b;

            {
                this.f212717b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ActivationRequestScreen activationRequestScreen = this.f212717b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ActivationRequestScreen.Y;
                        return (r) ((z58.g) activationRequestScreen.Q.getValue()).f319566h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ActivationRequestScreen.Y;
                        ActivationRequestScreen activationRequestScreen2 = this.f212717b;
                        return dli.f.a(activationRequestScreen2, activationRequestScreen2.e3(), zhm.v.k(activationRequestScreen2.R, activationRequestScreen2.T, activationRequestScreen2.S, new RowLoadingDelegate(), activationRequestScreen2.U), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ActivationRequestScreen.Y;
                        phm.a aVar = (phm.a) ue0.e.j(activationRequestScreen.m2()).a().get(o58.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o58.a.class, " is not found"));
                        }
                        z58.j jVar = ((z58.j) aVar2.b()).o;
                        o oVar = activationRequestScreen.K;
                        oVar.getClass();
                        return new z58.g(jVar, activationRequestScreen, oVar);
                }
            }
        });
        this.R = new CellDetailsActionDelegate();
        TextDelegate textDelegate = new TextDelegate();
        this.S = textDelegate;
        this.T = new SelectableDelegate(textDelegate);
        this.U = new ErrorDelegate();
        this.V = new TextDelegate();
        this.W = new RowDelegate(null, null, 7);
        this.X = new LargeActionButtonDelegate();
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        n68.s uiState = (n68.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        jii.w wVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = wVarD3.f174570b;
        TwinVerticalButton twinVerticalButton = wVarD3.d;
        ResourceImage resourceImage = uiState.f212735b;
        n68.j jVar = uiState.d;
        navBarWithToolbar.setNavigationButtonImage(resourceImage);
        n nVar = uiState.f212736c;
        if (nVar instanceof l) {
            l lVar = (l) nVar;
            TextLocalisedClause textLocalisedClause = lVar.f212726a;
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "screenRecyclerNavbarTwin…alButtonNavBarWithToolbar");
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setSecondDescriptionText(lVar.f212727b);
            navBarWithToolbar.setDescriptionVisible(false);
            navBarWithToolbar.setSecondDescriptionVisible(true);
            navBarWithToolbar.l0();
        } else {
            if (!Intrinsics.f(nVar, m.f212728a)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "screenRecyclerNavbarTwin…alButtonNavBarWithToolbar");
            navBarWithToolbar.I0(t3.DEFAULT, false);
        }
        twinVerticalButton.setSecondaryButtonText(uiState.e);
        twinVerticalButton.setMainButtonText(jVar.f212719a);
        twinVerticalButton.setMainButtonEnabled(jVar.f212720b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setMainButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        d3().d.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        ((j60.a) ((g) this.Q.getValue()).d.get()).d(v.k(this.V, this.W, this.X));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.d), new n68.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.r()), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.V.d), new n68.g(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.W.f53218h), new n68.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.X.d.f121375b), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.d), new n68.g(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.U.f52226c), new n68.d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().d.o0()), new n68.d(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().d.p0()), new n68.d(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(d3().f174570b.f59410q), new n68.d(this, null, 0), 3);
    }

    public final jii.w d3() {
        ViewBinding value = this.P.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.w) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final r e3() {
        return (r) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
