package com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputScreen;
import com.revolut.kompot.common.R$layout;
import dw3.n5;
import eq8.g;
import fb6.j;
import fh4.f;
import fh4.m;
import fh4.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_account_details/input/RefinancingAccountDetailsInputScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lfh4/m;", "Ldli/a;", "Lfh4/q;", "Lbx4/c;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RefinancingAccountDetailsInputScreen extends PluginScreenController<m> implements dli.a, bx4.c {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(RefinancingAccountDetailsInputScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final FullScreenStateDelegate P;
    public final Object Q;
    public final Object R;

    public RefinancingAccountDetailsInputScreen(RefinancingAccountDetailsInputScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, f.f);
        this.N = w.y0(new j(this, inputData, 5));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: fh4.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RefinancingAccountDetailsInputScreen f135134b;

            {
                this.f135134b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RefinancingAccountDetailsInputScreen refinancingAccountDetailsInputScreen = this.f135134b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RefinancingAccountDetailsInputScreen.S;
                        return (p) ((n5) refinancingAccountDetailsInputScreen.N.getValue()).f119357j.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RefinancingAccountDetailsInputScreen.S;
                        return d0.E0(u.c(refinancingAccountDetailsInputScreen.P), ((n5) refinancingAccountDetailsInputScreen.N.getValue()).c().Q());
                    default:
                        KProperty[] kPropertyArr3 = RefinancingAccountDetailsInputScreen.S;
                        RefinancingAccountDetailsInputScreen refinancingAccountDetailsInputScreen2 = this.f135134b;
                        return dli.f.a(refinancingAccountDetailsInputScreen2, refinancingAccountDetailsInputScreen2.d(), (List) refinancingAccountDetailsInputScreen2.Q.getValue(), 0, null, null, null, 60);
                }
            }
        });
        this.P = new FullScreenStateDelegate();
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: fh4.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RefinancingAccountDetailsInputScreen f135134b;

            {
                this.f135134b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RefinancingAccountDetailsInputScreen refinancingAccountDetailsInputScreen = this.f135134b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RefinancingAccountDetailsInputScreen.S;
                        return (p) ((n5) refinancingAccountDetailsInputScreen.N.getValue()).f119357j.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RefinancingAccountDetailsInputScreen.S;
                        return d0.E0(u.c(refinancingAccountDetailsInputScreen.P), ((n5) refinancingAccountDetailsInputScreen.N.getValue()).c().Q());
                    default:
                        KProperty[] kPropertyArr3 = RefinancingAccountDetailsInputScreen.S;
                        RefinancingAccountDetailsInputScreen refinancingAccountDetailsInputScreen2 = this.f135134b;
                        return dli.f.a(refinancingAccountDetailsInputScreen2, refinancingAccountDetailsInputScreen2.d(), (List) refinancingAccountDetailsInputScreen2.Q.getValue(), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: fh4.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RefinancingAccountDetailsInputScreen f135134b;

            {
                this.f135134b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RefinancingAccountDetailsInputScreen refinancingAccountDetailsInputScreen = this.f135134b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RefinancingAccountDetailsInputScreen.S;
                        return (p) ((n5) refinancingAccountDetailsInputScreen.N.getValue()).f119357j.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RefinancingAccountDetailsInputScreen.S;
                        return d0.E0(u.c(refinancingAccountDetailsInputScreen.P), ((n5) refinancingAccountDetailsInputScreen.N.getValue()).c().Q());
                    default:
                        KProperty[] kPropertyArr3 = RefinancingAccountDetailsInputScreen.S;
                        RefinancingAccountDetailsInputScreen refinancingAccountDetailsInputScreen2 = this.f135134b;
                        return dli.f.a(refinancingAccountDetailsInputScreen2, refinancingAccountDetailsInputScreen2.d(), (List) refinancingAccountDetailsInputScreen2.Q.getValue(), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        fh4.q uiState = (fh4.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f135142b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(uiState.f));
        Clause clause = uiState.f135143c;
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setEnabled(uiState.e);
        largeActionButton.setText(uiState.d);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((c) d()).C2(fh4.j.f135138a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n5) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        jii.u uVarD3 = d3();
        uVarD3.f174565c.setHeaderTitleMode(j0.MULTILINE);
        NavBarWithToolbar navBarWithToolbar = uVarD3.f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setEnabled(false);
        navBarWithToolbar.setDescriptionVisible(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new fh4.h(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new fh4.h(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new g(rd0.e.b(d3().f174565c.x0()), 20), null, new f9d.c(this, (Continuation) null, 15), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p d() {
        return (p) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
