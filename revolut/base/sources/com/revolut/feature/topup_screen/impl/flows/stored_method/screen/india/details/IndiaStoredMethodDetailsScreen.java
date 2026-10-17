package com.revolut.feature.topup_screen.impl.flows.stored_method.screen.india.details;

import akl.e0;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import at4.b;
import aye.c;
import aye.g;
import aye.i;
import aye.j;
import aye.k;
import aye.l;
import aye.m;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.india.details.IndiaStoredMethodDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.t3;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/india/details/IndiaStoredMethodDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laye/g;", "Ldli/a;", "Laye/l;", "Lin0/g;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IndiaStoredMethodDetailsScreen extends ViewController<g> implements a, in0.g {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(IndiaStoredMethodDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final h O;

    public IndiaStoredMethodDetailsScreen(IndiaStoredMethodDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: aye.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndiaStoredMethodDetailsScreen f11135b;

            {
                this.f11135b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = IndiaStoredMethodDetailsScreen.P;
                        IndiaStoredMethodDetailsScreen indiaStoredMethodDetailsScreen = this.f11135b;
                        return dli.f.a(indiaStoredMethodDetailsScreen, (m) indiaStoredMethodDetailsScreen.N.getValue(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = IndiaStoredMethodDetailsScreen.P;
                        return (m) ((qve.h) this.f11135b.M.getValue()).f249596c.get();
                }
            }
        });
        this.M = w.y0(new b(this, inputData, 14));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: aye.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndiaStoredMethodDetailsScreen f11135b;

            {
                this.f11135b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IndiaStoredMethodDetailsScreen.P;
                        IndiaStoredMethodDetailsScreen indiaStoredMethodDetailsScreen = this.f11135b;
                        return dli.f.a(indiaStoredMethodDetailsScreen, (m) indiaStoredMethodDetailsScreen.N.getValue(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = IndiaStoredMethodDetailsScreen.P;
                        return (m) ((qve.h) this.f11135b.M.getValue()).f249596c.get();
                }
            }
        });
        this.O = s.t(this, aye.b.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        k kVar = uiState.f11146b;
        if (kVar.equals(j.f11144a)) {
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
            return;
        }
        if (kVar.equals(i.f11143a)) {
            d3().f174539b.l0();
            return;
        }
        if (!(kVar instanceof aye.h)) {
            throw new NoWhenBranchMatchedException();
        }
        NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
        aye.h hVar = (aye.h) kVar;
        Clause clause = hVar.f11140a;
        if (clause != null) {
            navBarWithToolbar2.setToolbarTitle(clause);
        }
        navBarWithToolbar2.setTitle(clause, null);
        navBarWithToolbar2.setEndIconImage(hVar.f11142c);
        navBarWithToolbar2.setDescriptionVisible(true);
        navBarWithToolbar2.setDescriptionText(hVar.f11141b);
        navBarWithToolbar2.l0();
        navBarWithToolbar2.setFilters(hVar.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (qve.h) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (m) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new e0(this, null, 29), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.s0()), new c(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.O.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
