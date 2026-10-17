package com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bt6.d0;
import bt6.e0;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.TaxHubCreateProfileScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.TaxHubCreateProfileScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import te0.w;
import tki.c;
import tx0.j0;
import u37.b;
import u37.d;
import u37.f;
import u37.j;
import u37.m;
import vc.s;
import wp5.y;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/profile/create/TaxHubCreateProfileScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lu37/j;", "Ltki/c;", "Lu37/m;", "Lno/k;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxHubCreateProfileScreen extends ViewController<j> implements c, k {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TaxHubCreateProfileScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final TaxHubCreateProfileScreenContract$InputData K;
    public final int L;
    public final h M;
    public final FullScreenStateDelegate N;
    public final InputTextDelegate O;
    public AnalyticsContext P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public TaxHubCreateProfileScreen(TaxHubCreateProfileScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new FullScreenStateDelegate();
        this.O = new InputTextDelegate(null);
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: u37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubCreateProfileScreen f276790b;

            {
                this.f276790b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TaxHubCreateProfileScreen taxHubCreateProfileScreen = this.f276790b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubCreateProfileScreen.T;
                        qji.b bVarU2 = taxHubCreateProfileScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.di.TaxHubCreateProfileScreenInjector");
                        d0 d0Var = (d0) ((v37.a) bVarU2).b().mo3808a(taxHubCreateProfileScreen);
                        TaxHubCreateProfileScreenContract$InputData taxHubCreateProfileScreenContract$InputData = taxHubCreateProfileScreen.K;
                        switch (d0Var.f18322a) {
                            case 0:
                                taxHubCreateProfileScreenContract$InputData.getClass();
                                d0Var.d = taxHubCreateProfileScreenContract$InputData;
                                break;
                            default:
                                taxHubCreateProfileScreenContract$InputData.getClass();
                                d0Var.d = taxHubCreateProfileScreenContract$InputData;
                                break;
                        }
                        return (e0) d0Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubCreateProfileScreen.T;
                        e0 e0Var = (e0) taxHubCreateProfileScreen.Q.getValue();
                        switch (e0Var.f18328a) {
                            case 0:
                                return (k) e0Var.d.get();
                            default:
                                return (k) e0Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TaxHubCreateProfileScreen.T;
                        TaxHubCreateProfileScreen taxHubCreateProfileScreen2 = this.f276790b;
                        return tki.g.a(taxHubCreateProfileScreen2, taxHubCreateProfileScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), taxHubCreateProfileScreen2.O, taxHubCreateProfileScreen2.N), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: u37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubCreateProfileScreen f276790b;

            {
                this.f276790b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TaxHubCreateProfileScreen taxHubCreateProfileScreen = this.f276790b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubCreateProfileScreen.T;
                        qji.b bVarU2 = taxHubCreateProfileScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.di.TaxHubCreateProfileScreenInjector");
                        d0 d0Var = (d0) ((v37.a) bVarU2).b().mo3808a(taxHubCreateProfileScreen);
                        TaxHubCreateProfileScreenContract$InputData taxHubCreateProfileScreenContract$InputData = taxHubCreateProfileScreen.K;
                        switch (d0Var.f18322a) {
                            case 0:
                                taxHubCreateProfileScreenContract$InputData.getClass();
                                d0Var.d = taxHubCreateProfileScreenContract$InputData;
                                break;
                            default:
                                taxHubCreateProfileScreenContract$InputData.getClass();
                                d0Var.d = taxHubCreateProfileScreenContract$InputData;
                                break;
                        }
                        return (e0) d0Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubCreateProfileScreen.T;
                        e0 e0Var = (e0) taxHubCreateProfileScreen.Q.getValue();
                        switch (e0Var.f18328a) {
                            case 0:
                                return (k) e0Var.d.get();
                            default:
                                return (k) e0Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TaxHubCreateProfileScreen.T;
                        TaxHubCreateProfileScreen taxHubCreateProfileScreen2 = this.f276790b;
                        return tki.g.a(taxHubCreateProfileScreen2, taxHubCreateProfileScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), taxHubCreateProfileScreen2.O, taxHubCreateProfileScreen2.N), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: u37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubCreateProfileScreen f276790b;

            {
                this.f276790b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TaxHubCreateProfileScreen taxHubCreateProfileScreen = this.f276790b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubCreateProfileScreen.T;
                        qji.b bVarU2 = taxHubCreateProfileScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.di.TaxHubCreateProfileScreenInjector");
                        d0 d0Var = (d0) ((v37.a) bVarU2).b().mo3808a(taxHubCreateProfileScreen);
                        TaxHubCreateProfileScreenContract$InputData taxHubCreateProfileScreenContract$InputData = taxHubCreateProfileScreen.K;
                        switch (d0Var.f18322a) {
                            case 0:
                                taxHubCreateProfileScreenContract$InputData.getClass();
                                d0Var.d = taxHubCreateProfileScreenContract$InputData;
                                break;
                            default:
                                taxHubCreateProfileScreenContract$InputData.getClass();
                                d0Var.d = taxHubCreateProfileScreenContract$InputData;
                                break;
                        }
                        return (e0) d0Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubCreateProfileScreen.T;
                        e0 e0Var = (e0) taxHubCreateProfileScreen.Q.getValue();
                        switch (e0Var.f18328a) {
                            case 0:
                                return (k) e0Var.d.get();
                            default:
                                return (k) e0Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TaxHubCreateProfileScreen.T;
                        TaxHubCreateProfileScreen taxHubCreateProfileScreen2 = this.f276790b;
                        return tki.g.a(taxHubCreateProfileScreen2, taxHubCreateProfileScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), taxHubCreateProfileScreen2.O, taxHubCreateProfileScreen2.N), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().e;
        Clause clause = uiState.f276802c;
        Clause clause2 = uiState.d;
        if (clause != null) {
            navBarWithToolbar.setTitle(clause, null);
            navBarWithToolbar.setToolbarTitle(clause);
        }
        navBarWithToolbar.setSecondDescriptionText(clause2);
        navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        navBarWithToolbar.setMenuItems(uiState.f);
        d3().f174558c.setTextClause(uiState.e);
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setText(uiState.f276801b);
        largeActionButton.setEnabled(uiState.f276803g);
        largeActionButton.setAnalyticsContext(this.P);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.P = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e0) this.Q.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getP() {
        return this.P;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0012. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        switch (((e0) this.Q.getValue()).f18328a) {
        }
        this.P = new AnalyticsContext(x47.a.a(this.K.f74340c));
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174557b.setLoadingButtonTag("BUTTON_TAG_CREATE_TAX_PROFILE");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new u37.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().e.o.f57403b), new d(this, continuation, 0), 3);
        int i = 1;
        ViewController.P2(this, rd0.e.b(d3().f174557b.o), new u37.c(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(d3().f174558c.f58608l), new d(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new u37.e(this, null), 3);
        InputTextDelegate inputTextDelegate = this.O;
        com.revolut.kompot.navigable.a.g2(this, y.x(inputTextDelegate.f52575g.f121375b, inputTextDelegate.i.f121375b, "mergeWith(...)"), null, new f(this, null), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final u37.k R2() {
        return (u37.k) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
