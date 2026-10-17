package com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.TrustedLocationsListScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import v0f.p;
import vc.s;
import vtc.d0;
import vtc.t;
import vtc.x;
import xki.e;
import xo8.a0;
import xvc.d;
import xvc.j;
import xvc.l;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/street_mode/trusted_locations_list/TrustedLocationsListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxvc/j;", "Ldli/a;", "Lxvc/m;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrustedLocationsListScreen extends ViewController<j> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TrustedLocationsListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object N;
    public final Object O;
    public final Object Q;
    public final h K = s.t(this, a.f);
    public final RowDelegate L = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final int P = R$layout.screen_recycler_navbar;

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

    public TrustedLocationsListScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: xvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustedLocationsListScreen f309228b;

            {
                this.f309228b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TrustedLocationsListScreen trustedLocationsListScreen = this.f309228b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TrustedLocationsListScreen.R;
                        return (l) ((d0) trustedLocationsListScreen.O.getValue()).f291964a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TrustedLocationsListScreen.R;
                        qji.b bVarU2 = trustedLocationsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.di.TrustedLocationsListScreenInjector");
                        t tVar = ((x) bVarU2).f292093b;
                        d0 d0Var = new d0();
                        d0Var.f291964a = e4m.b.b(new vrg.a(tVar, 1));
                        return d0Var;
                    default:
                        KProperty[] kPropertyArr3 = TrustedLocationsListScreen.R;
                        TrustedLocationsListScreen trustedLocationsListScreen2 = this.f309228b;
                        return dli.f.a(trustedLocationsListScreen2, trustedLocationsListScreen2.d(), v.k(trustedLocationsListScreen2.L, trustedLocationsListScreen2.M, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: xvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustedLocationsListScreen f309228b;

            {
                this.f309228b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TrustedLocationsListScreen trustedLocationsListScreen = this.f309228b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TrustedLocationsListScreen.R;
                        return (l) ((d0) trustedLocationsListScreen.O.getValue()).f291964a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TrustedLocationsListScreen.R;
                        qji.b bVarU2 = trustedLocationsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.di.TrustedLocationsListScreenInjector");
                        t tVar = ((x) bVarU2).f292093b;
                        d0 d0Var = new d0();
                        d0Var.f291964a = e4m.b.b(new vrg.a(tVar, 1));
                        return d0Var;
                    default:
                        KProperty[] kPropertyArr3 = TrustedLocationsListScreen.R;
                        TrustedLocationsListScreen trustedLocationsListScreen2 = this.f309228b;
                        return dli.f.a(trustedLocationsListScreen2, trustedLocationsListScreen2.d(), v.k(trustedLocationsListScreen2.L, trustedLocationsListScreen2.M, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: xvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustedLocationsListScreen f309228b;

            {
                this.f309228b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TrustedLocationsListScreen trustedLocationsListScreen = this.f309228b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TrustedLocationsListScreen.R;
                        return (l) ((d0) trustedLocationsListScreen.O.getValue()).f291964a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TrustedLocationsListScreen.R;
                        qji.b bVarU2 = trustedLocationsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.di.TrustedLocationsListScreenInjector");
                        t tVar = ((x) bVarU2).f292093b;
                        d0 d0Var = new d0();
                        d0Var.f291964a = e4m.b.b(new vrg.a(tVar, 1));
                        return d0Var;
                    default:
                        KProperty[] kPropertyArr3 = TrustedLocationsListScreen.R;
                        TrustedLocationsListScreen trustedLocationsListScreen2 = this.f309228b;
                        return dli.f.a(trustedLocationsListScreen2, trustedLocationsListScreen2.d(), v.k(trustedLocationsListScreen2.L, trustedLocationsListScreen2.M, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        xvc.m uiState = (xvc.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174539b.setMenuItems(uiState.f309238b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d0) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.security_hub_street_mode_trusted_locations_list_header_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new xni.h(this, null, 13), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new d(this, null, 0), 3);
        ViewController.P2(this, new p(new a0(rd0.e.b(this.L.f53218h), 13), 23), new d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new xvc.e(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
