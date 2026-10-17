package com.revolut.feature.external_accounts.impl.ui.link.screens.branches;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.ui.link.screens.branches.BranchesScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.branches.BranchesScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rlh.c;
import rm0.k;
import rn6.b;
import rn6.f;
import rn6.g;
import te0.w;
import tx0.j0;
import vc.s;
import vkm.d;
import xf6.s0;
import xf6.t0;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/screens/branches/BranchesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrn6/f;", "Ldli/a;", "Lrn6/h;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BranchesScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(BranchesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final BranchesScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public BranchesScreen(BranchesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: rn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BranchesScreen f255503b;

            {
                this.f255503b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BranchesScreen branchesScreen = this.f255503b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BranchesScreen.R;
                        qji.b bVarU2 = branchesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.screens.branches.di.BranchesScreenInjector");
                        s0 s0Var = (s0) ((sn6.a) bVarU2).s().mo3808a(branchesScreen);
                        BranchesScreenContract$InputData branchesScreenContract$InputData = branchesScreen.K;
                        switch (s0Var.f305043a) {
                            case 0:
                                branchesScreenContract$InputData.getClass();
                                s0Var.d = branchesScreenContract$InputData;
                                break;
                            case 1:
                                branchesScreenContract$InputData.getClass();
                                s0Var.d = branchesScreenContract$InputData;
                                break;
                            default:
                                branchesScreenContract$InputData.getClass();
                                s0Var.d = branchesScreenContract$InputData;
                                break;
                        }
                        return (t0) s0Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = BranchesScreen.R;
                        t0 t0Var = (t0) branchesScreen.N.getValue();
                        switch (t0Var.f305089a) {
                            case 0:
                                return (g) t0Var.e.get();
                            case 1:
                                return (g) t0Var.e.get();
                            default:
                                return (g) t0Var.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = BranchesScreen.R;
                        BranchesScreen branchesScreen2 = this.f255503b;
                        return dli.f.a(branchesScreen2, (g) branchesScreen2.O.getValue(), v.k(new CellDetailsActionDelegate(), (RowDelegate) branchesScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: rn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BranchesScreen f255503b;

            {
                this.f255503b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BranchesScreen branchesScreen = this.f255503b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BranchesScreen.R;
                        qji.b bVarU2 = branchesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.screens.branches.di.BranchesScreenInjector");
                        s0 s0Var = (s0) ((sn6.a) bVarU2).s().mo3808a(branchesScreen);
                        BranchesScreenContract$InputData branchesScreenContract$InputData = branchesScreen.K;
                        switch (s0Var.f305043a) {
                            case 0:
                                branchesScreenContract$InputData.getClass();
                                s0Var.d = branchesScreenContract$InputData;
                                break;
                            case 1:
                                branchesScreenContract$InputData.getClass();
                                s0Var.d = branchesScreenContract$InputData;
                                break;
                            default:
                                branchesScreenContract$InputData.getClass();
                                s0Var.d = branchesScreenContract$InputData;
                                break;
                        }
                        return (t0) s0Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = BranchesScreen.R;
                        t0 t0Var = (t0) branchesScreen.N.getValue();
                        switch (t0Var.f305089a) {
                            case 0:
                                return (g) t0Var.e.get();
                            case 1:
                                return (g) t0Var.e.get();
                            default:
                                return (g) t0Var.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = BranchesScreen.R;
                        BranchesScreen branchesScreen2 = this.f255503b;
                        return dli.f.a(branchesScreen2, (g) branchesScreen2.O.getValue(), v.k(new CellDetailsActionDelegate(), (RowDelegate) branchesScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new k(3));
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: rn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BranchesScreen f255503b;

            {
                this.f255503b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BranchesScreen branchesScreen = this.f255503b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BranchesScreen.R;
                        qji.b bVarU2 = branchesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.screens.branches.di.BranchesScreenInjector");
                        s0 s0Var = (s0) ((sn6.a) bVarU2).s().mo3808a(branchesScreen);
                        BranchesScreenContract$InputData branchesScreenContract$InputData = branchesScreen.K;
                        switch (s0Var.f305043a) {
                            case 0:
                                branchesScreenContract$InputData.getClass();
                                s0Var.d = branchesScreenContract$InputData;
                                break;
                            case 1:
                                branchesScreenContract$InputData.getClass();
                                s0Var.d = branchesScreenContract$InputData;
                                break;
                            default:
                                branchesScreenContract$InputData.getClass();
                                s0Var.d = branchesScreenContract$InputData;
                                break;
                        }
                        return (t0) s0Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = BranchesScreen.R;
                        t0 t0Var = (t0) branchesScreen.N.getValue();
                        switch (t0Var.f305089a) {
                            case 0:
                                return (g) t0Var.e.get();
                            case 1:
                                return (g) t0Var.e.get();
                            default:
                                return (g) t0Var.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = BranchesScreen.R;
                        BranchesScreen branchesScreen2 = this.f255503b;
                        return dli.f.a(branchesScreen2, (g) branchesScreen2.O.getValue(), v.k(new CellDetailsActionDelegate(), (RowDelegate) branchesScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((rn6.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        BranchesScreenContract$InputData branchesScreenContract$InputData = this.K;
        navBarWithToolbar.setTitle(branchesScreenContract$InputData.f73048b, null);
        navBarWithToolbar.setToolbarTitle(branchesScreenContract$InputData.f73048b);
        navBarWithToolbar.setHint(branchesScreenContract$InputData.f73049c);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setSearchButtonActive(true);
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new c(this, null, 3), 3);
        SearchView searchView = navBarWithToolbar.f59409p;
        d dVarB = rd0.e.b(searchView.f57337m);
        ?? r122 = this.O;
        ViewController.P2(this, dVarB, new q9c.v(2, (g) r122.getValue(), g.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", 4, 13), 3);
        ViewController.P2(this, rd0.e.b(searchView.f57336l), new bl6.f(navBarWithToolbar, null, 6), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), new rn6.c(2, 4, g.class, (g) r122.getValue(), "onBranchClicked", "onBranchClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
