package com.revolut.feature.credit.application.plugins.impl.ui.personal_details.details;

import a84.b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.personal_details.details.PersonalDetailsScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dw3.a5;
import gvc.m;
import hg4.c;
import hg4.f;
import hg4.g;
import hg4.k;
import hg4.p;
import hg4.r;
import hg4.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import yp0.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/personal_details/details/PersonalDetailsScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lhg4/p;", "Ldli/a;", "Lhg4/r;", "La84/b;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PersonalDetailsScreen extends PluginScreenController<p> implements a, b {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(PersonalDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditRecyclerNavbarTwinbuttonsBinding;", 0))};
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final LargeActionButtonDelegate Q;
    public final FullScreenStateDelegate R;
    public final InputTextDelegate S;
    public final InputDisclosureDelegate T;
    public final Object U;
    public final Object V;

    public PersonalDetailsScreen(PersonalDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = s.t(this, c.f);
        this.M = R$layout.screen_credit_recycler_navbar_twinbuttons;
        this.N = w.y0(new h1k.a(this, inputData, 23));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: hg4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalDetailsScreen f152087b;

            {
                this.f152087b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PersonalDetailsScreen personalDetailsScreen = this.f152087b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PersonalDetailsScreen.W;
                        return (q) ((a5) personalDetailsScreen.N.getValue()).f118276n.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PersonalDetailsScreen.W;
                        return (j60.a) ((a5) personalDetailsScreen.N.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PersonalDetailsScreen.W;
                        return ((a5) personalDetailsScreen.N.getValue()).b();
                    default:
                        KProperty[] kPropertyArr4 = PersonalDetailsScreen.W;
                        PersonalDetailsScreen personalDetailsScreen2 = this.f152087b;
                        return dli.f.a(personalDetailsScreen2, personalDetailsScreen2.R2(), zhm.v.k(personalDetailsScreen2.R, personalDetailsScreen2.S, new ListSubheaderDelegate(), new RowLoadingDelegate(), personalDetailsScreen2.T), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: hg4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalDetailsScreen f152087b;

            {
                this.f152087b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PersonalDetailsScreen personalDetailsScreen = this.f152087b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PersonalDetailsScreen.W;
                        return (q) ((a5) personalDetailsScreen.N.getValue()).f118276n.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PersonalDetailsScreen.W;
                        return (j60.a) ((a5) personalDetailsScreen.N.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PersonalDetailsScreen.W;
                        return ((a5) personalDetailsScreen.N.getValue()).b();
                    default:
                        KProperty[] kPropertyArr4 = PersonalDetailsScreen.W;
                        PersonalDetailsScreen personalDetailsScreen2 = this.f152087b;
                        return dli.f.a(personalDetailsScreen2, personalDetailsScreen2.R2(), zhm.v.k(personalDetailsScreen2.R, personalDetailsScreen2.S, new ListSubheaderDelegate(), new RowLoadingDelegate(), personalDetailsScreen2.T), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = new LargeActionButtonDelegate();
        this.R = new FullScreenStateDelegate();
        this.S = new InputTextDelegate(null);
        this.T = new InputDisclosureDelegate();
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: hg4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalDetailsScreen f152087b;

            {
                this.f152087b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PersonalDetailsScreen personalDetailsScreen = this.f152087b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PersonalDetailsScreen.W;
                        return (q) ((a5) personalDetailsScreen.N.getValue()).f118276n.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PersonalDetailsScreen.W;
                        return (j60.a) ((a5) personalDetailsScreen.N.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PersonalDetailsScreen.W;
                        return ((a5) personalDetailsScreen.N.getValue()).b();
                    default:
                        KProperty[] kPropertyArr4 = PersonalDetailsScreen.W;
                        PersonalDetailsScreen personalDetailsScreen2 = this.f152087b;
                        return dli.f.a(personalDetailsScreen2, personalDetailsScreen2.R2(), zhm.v.k(personalDetailsScreen2.R, personalDetailsScreen2.S, new ListSubheaderDelegate(), new RowLoadingDelegate(), personalDetailsScreen2.T), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: hg4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalDetailsScreen f152087b;

            {
                this.f152087b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PersonalDetailsScreen personalDetailsScreen = this.f152087b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PersonalDetailsScreen.W;
                        return (q) ((a5) personalDetailsScreen.N.getValue()).f118276n.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PersonalDetailsScreen.W;
                        return (j60.a) ((a5) personalDetailsScreen.N.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PersonalDetailsScreen.W;
                        return ((a5) personalDetailsScreen.N.getValue()).b();
                    default:
                        KProperty[] kPropertyArr4 = PersonalDetailsScreen.W;
                        PersonalDetailsScreen personalDetailsScreen2 = this.f152087b;
                        return dli.f.a(personalDetailsScreen2, personalDetailsScreen2.R2(), zhm.v.k(personalDetailsScreen2.R, personalDetailsScreen2.S, new ListSubheaderDelegate(), new RowLoadingDelegate(), personalDetailsScreen2.T), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a84.a aVar = (a84.a) this.U.getValue();
        boolean z = uiState.e;
        aVar.Q(z, z);
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar creditApplicationNavBarWithToolbar = d3().f10698b;
        Intrinsics.checkNotNullExpressionValue(creditApplicationNavBarWithToolbar, "creditApplicationNavBarWithToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f152101b;
        creditApplicationNavBarWithToolbar.setTitle(textLocalisedClause, null);
        creditApplicationNavBarWithToolbar.setToolbarTitle(textLocalisedClause);
        creditApplicationNavBarWithToolbar.setDescriptionText(uiState.f152102c);
        TwinVerticalButton twinVerticalButtonE = E();
        ?? r06 = uiState.d;
        twinVerticalButtonE.setFabEnabled(true);
        twinVerticalButtonE.setMainButtonText((Clause) r06);
        twinVerticalButtonE.setCollapsed(!uiState.f, true);
    }

    @Override // a84.b
    public final TwinVerticalButton E() {
        TwinVerticalButton creditApplicationTwinVerticalButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(creditApplicationTwinVerticalButton, "creditApplicationTwinVerticalButton");
        return creditApplicationTwinVerticalButton;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((u) R2()).C2(k.f152095a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a5) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.P.getValue()).d(zhm.u.c(this.Q));
        NavBarWithToolbar creditApplicationNavBarWithToolbar = d3().f10698b;
        Intrinsics.checkNotNullExpressionValue(creditApplicationNavBarWithToolbar, "creditApplicationNavBarWithToolbar");
        creditApplicationNavBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        creditApplicationNavBarWithToolbar.setDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        y.b((ScreenContentRecyclerView) h(), new hg4.a(this, 0));
        d3();
        NavBarWithToolbar creditApplicationNavBarWithToolbar = d3().f10698b;
        Intrinsics.checkNotNullExpressionValue(creditApplicationNavBarWithToolbar, "creditApplicationNavBarWithToolbar");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(creditApplicationNavBarWithToolbar.f59410q), null, new hbg.h(this, continuation, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52371h.f121375b), null, new hg4.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new h23.b(rd0.e.b(this.S.f52575g.f121375b), 16), null, new f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.f52538c), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new h23.b(rd0.e.b(this.Q.d.f121375b), 15), null, new f(this, continuation, 1), 3);
    }

    public final aw3.k d3() {
        ViewBinding value = this.L.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (aw3.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final hg4.q R2() {
        return (hg4.q) this.O.getValue();
    }

    @Override // a84.b
    public final void f1() {
        u uVar = (u) R2();
        uVar.getClass();
        uVar.n2(new m(uVar, null, 14), new whi.b(6));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.M;
    }

    @Override // a84.b
    public final RecyclerView h() {
        ScreenContentRecyclerView creditApplicationRecyclerView = d3().f10699c;
        Intrinsics.checkNotNullExpressionValue(creditApplicationRecyclerView, "creditApplicationRecyclerView");
        return creditApplicationRecyclerView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }

    @Override // a84.b
    public final void o1() {
        NavBarWithToolbar creditApplicationNavBarWithToolbar = d3().f10698b;
        Intrinsics.checkNotNullExpressionValue(creditApplicationNavBarWithToolbar, "creditApplicationNavBarWithToolbar");
        creditApplicationNavBarWithToolbar.setExpanded(false, true);
    }
}
