package com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting;

import afj.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.EsimConnectivityTroubleshootingScreen;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import rlh.c;
import rnj.d;
import rnj.f;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/troubleshooting/EsimConnectivityTroubleshootingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrnj/d;", "Ldli/a;", "Lrnj/f;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimConnectivityTroubleshootingScreen extends ViewController<d> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(EsimConnectivityTroubleshootingScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object M;
    public final Object O;
    public final Object P;
    public final int K = R$layout.screen_recycler_navbar;
    public final RowDelegate L = new RowDelegate(null, null, 7);
    public final h N = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public EsimConnectivityTroubleshootingScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: rnj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimConnectivityTroubleshootingScreen f255701b;

            {
                this.f255701b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimConnectivityTroubleshootingScreen esimConnectivityTroubleshootingScreen = this.f255701b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimConnectivityTroubleshootingScreen.Q;
                        EsimConnectivityTroubleshootingScreen esimConnectivityTroubleshootingScreen2 = this.f255701b;
                        return dli.f.a(esimConnectivityTroubleshootingScreen2, (e) esimConnectivityTroubleshootingScreen2.P.getValue(), v.k(esimConnectivityTroubleshootingScreen2.L, new RowLoadingDelegate(), new VaultsProgressDelegate(), new ListSubheaderDelegate(), new PlainTextDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimConnectivityTroubleshootingScreen.Q;
                        qji.b bVarU2 = esimConnectivityTroubleshootingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.di.EsimConnectivityTroubleshootingScreenInjector");
                        afj.f fVar = (afj.f) bVarU2;
                        return new afj.g(fVar.f4234b, fVar.f4235c);
                    default:
                        KProperty[] kPropertyArr3 = EsimConnectivityTroubleshootingScreen.Q;
                        return (e) ((afj.g) esimConnectivityTroubleshootingScreen.O.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: rnj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimConnectivityTroubleshootingScreen f255701b;

            {
                this.f255701b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimConnectivityTroubleshootingScreen esimConnectivityTroubleshootingScreen = this.f255701b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimConnectivityTroubleshootingScreen.Q;
                        EsimConnectivityTroubleshootingScreen esimConnectivityTroubleshootingScreen2 = this.f255701b;
                        return dli.f.a(esimConnectivityTroubleshootingScreen2, (e) esimConnectivityTroubleshootingScreen2.P.getValue(), v.k(esimConnectivityTroubleshootingScreen2.L, new RowLoadingDelegate(), new VaultsProgressDelegate(), new ListSubheaderDelegate(), new PlainTextDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimConnectivityTroubleshootingScreen.Q;
                        qji.b bVarU2 = esimConnectivityTroubleshootingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.di.EsimConnectivityTroubleshootingScreenInjector");
                        afj.f fVar = (afj.f) bVarU2;
                        return new afj.g(fVar.f4234b, fVar.f4235c);
                    default:
                        KProperty[] kPropertyArr3 = EsimConnectivityTroubleshootingScreen.Q;
                        return (e) ((afj.g) esimConnectivityTroubleshootingScreen.O.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: rnj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimConnectivityTroubleshootingScreen f255701b;

            {
                this.f255701b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimConnectivityTroubleshootingScreen esimConnectivityTroubleshootingScreen = this.f255701b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimConnectivityTroubleshootingScreen.Q;
                        EsimConnectivityTroubleshootingScreen esimConnectivityTroubleshootingScreen2 = this.f255701b;
                        return dli.f.a(esimConnectivityTroubleshootingScreen2, (e) esimConnectivityTroubleshootingScreen2.P.getValue(), v.k(esimConnectivityTroubleshootingScreen2.L, new RowLoadingDelegate(), new VaultsProgressDelegate(), new ListSubheaderDelegate(), new PlainTextDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimConnectivityTroubleshootingScreen.Q;
                        qji.b bVarU2 = esimConnectivityTroubleshootingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.di.EsimConnectivityTroubleshootingScreenInjector");
                        afj.f fVar = (afj.f) bVarU2;
                        return new afj.g(fVar.f4234b, fVar.f4235c);
                    default:
                        KProperty[] kPropertyArr3 = EsimConnectivityTroubleshootingScreen.Q;
                        return (e) ((afj.g) esimConnectivityTroubleshootingScreen.O.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        if (uiState.f255707a != null) {
            navBarWithToolbar.l0();
        } else {
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        }
        navBarWithToolbar.setSecondDescriptionText(uiState.f255707a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (rnj.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.esim_connectivity_issues_header_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new c(this, null, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53218h), null, new rnj.b(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
