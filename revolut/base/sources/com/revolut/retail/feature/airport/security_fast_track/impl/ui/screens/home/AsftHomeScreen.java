package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.EsimLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.AsftHomeScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.AsftHomeScreenContract$InputData;
import ht1.e;
import hui.g;
import hui.j;
import hui.n;
import hui.t;
import hui.u;
import i7d.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lti.f;
import te0.w;
import vc.s;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/AsftHomeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhui/n;", "Ldli/a;", "Lhui/u;", "Li7d/i;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsftHomeScreen extends ViewController<n> implements dli.a, i {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(AsftHomeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final AsftHomeScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

    public AsftHomeScreen(AsftHomeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, hui.b.f);
        this.N = w.y0(new e(18));
        this.O = w.y0(new e(19));
        this.P = w.y0(new e(20));
        this.Q = w.y0(new e(21));
        this.R = w.y0(new e(22));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: hui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftHomeScreen f155670b;

            {
                this.f155670b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AsftHomeScreen asftHomeScreen = this.f155670b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AsftHomeScreen.W;
                        return (fd6.a) ((lti.f) asftHomeScreen.U.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AsftHomeScreen.W;
                        AsftHomeScreen asftHomeScreen2 = this.f155670b;
                        return dli.f.a(asftHomeScreen2, asftHomeScreen2.d(), d0.E0(((fd6.a) asftHomeScreen2.S.getValue()).e, zhm.v.k((ListSubheaderDelegate) asftHomeScreen2.Q.getValue(), new ListSubheaderLoadingDelegate(), new ScrollerDelegate(zhm.v.k((EsimDelegate) asftHomeScreen2.N.getValue(), (ReferralContactDelegate) asftHomeScreen2.O.getValue()), false), new EsimLoadingDelegate(), (FullScreenStateDelegate) asftHomeScreen2.P.getValue(), (RowDelegate) asftHomeScreen2.R.getValue(), new RowLoadingDelegate())), 0, null, null, null, 60);
                    case 2:
                        KProperty[] kPropertyArr3 = AsftHomeScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(asftHomeScreen.m2()).a().get(lti.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lti.g.class, " is not found"));
                        }
                        lti.g gVar = ((lti.g) aVar2.b()).o;
                        AsftHomeScreenContract$InputData asftHomeScreenContract$InputData = asftHomeScreen.K;
                        asftHomeScreenContract$InputData.getClass();
                        return new lti.f(gVar, asftHomeScreen, asftHomeScreen, asftHomeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = AsftHomeScreen.W;
                        return (s) ((lti.f) asftHomeScreen.U.getValue()).f199903m.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: hui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftHomeScreen f155670b;

            {
                this.f155670b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AsftHomeScreen asftHomeScreen = this.f155670b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AsftHomeScreen.W;
                        return (fd6.a) ((lti.f) asftHomeScreen.U.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AsftHomeScreen.W;
                        AsftHomeScreen asftHomeScreen2 = this.f155670b;
                        return dli.f.a(asftHomeScreen2, asftHomeScreen2.d(), d0.E0(((fd6.a) asftHomeScreen2.S.getValue()).e, zhm.v.k((ListSubheaderDelegate) asftHomeScreen2.Q.getValue(), new ListSubheaderLoadingDelegate(), new ScrollerDelegate(zhm.v.k((EsimDelegate) asftHomeScreen2.N.getValue(), (ReferralContactDelegate) asftHomeScreen2.O.getValue()), false), new EsimLoadingDelegate(), (FullScreenStateDelegate) asftHomeScreen2.P.getValue(), (RowDelegate) asftHomeScreen2.R.getValue(), new RowLoadingDelegate())), 0, null, null, null, 60);
                    case 2:
                        KProperty[] kPropertyArr3 = AsftHomeScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(asftHomeScreen.m2()).a().get(lti.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lti.g.class, " is not found"));
                        }
                        lti.g gVar = ((lti.g) aVar2.b()).o;
                        AsftHomeScreenContract$InputData asftHomeScreenContract$InputData = asftHomeScreen.K;
                        asftHomeScreenContract$InputData.getClass();
                        return new lti.f(gVar, asftHomeScreen, asftHomeScreen, asftHomeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = AsftHomeScreen.W;
                        return (s) ((lti.f) asftHomeScreen.U.getValue()).f199903m.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: hui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftHomeScreen f155670b;

            {
                this.f155670b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AsftHomeScreen asftHomeScreen = this.f155670b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AsftHomeScreen.W;
                        return (fd6.a) ((lti.f) asftHomeScreen.U.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AsftHomeScreen.W;
                        AsftHomeScreen asftHomeScreen2 = this.f155670b;
                        return dli.f.a(asftHomeScreen2, asftHomeScreen2.d(), d0.E0(((fd6.a) asftHomeScreen2.S.getValue()).e, zhm.v.k((ListSubheaderDelegate) asftHomeScreen2.Q.getValue(), new ListSubheaderLoadingDelegate(), new ScrollerDelegate(zhm.v.k((EsimDelegate) asftHomeScreen2.N.getValue(), (ReferralContactDelegate) asftHomeScreen2.O.getValue()), false), new EsimLoadingDelegate(), (FullScreenStateDelegate) asftHomeScreen2.P.getValue(), (RowDelegate) asftHomeScreen2.R.getValue(), new RowLoadingDelegate())), 0, null, null, null, 60);
                    case 2:
                        KProperty[] kPropertyArr3 = AsftHomeScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(asftHomeScreen.m2()).a().get(lti.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lti.g.class, " is not found"));
                        }
                        lti.g gVar = ((lti.g) aVar2.b()).o;
                        AsftHomeScreenContract$InputData asftHomeScreenContract$InputData = asftHomeScreen.K;
                        asftHomeScreenContract$InputData.getClass();
                        return new lti.f(gVar, asftHomeScreen, asftHomeScreen, asftHomeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = AsftHomeScreen.W;
                        return (s) ((lti.f) asftHomeScreen.U.getValue()).f199903m.get();
                }
            }
        });
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: hui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftHomeScreen f155670b;

            {
                this.f155670b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                AsftHomeScreen asftHomeScreen = this.f155670b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AsftHomeScreen.W;
                        return (fd6.a) ((lti.f) asftHomeScreen.U.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AsftHomeScreen.W;
                        AsftHomeScreen asftHomeScreen2 = this.f155670b;
                        return dli.f.a(asftHomeScreen2, asftHomeScreen2.d(), d0.E0(((fd6.a) asftHomeScreen2.S.getValue()).e, zhm.v.k((ListSubheaderDelegate) asftHomeScreen2.Q.getValue(), new ListSubheaderLoadingDelegate(), new ScrollerDelegate(zhm.v.k((EsimDelegate) asftHomeScreen2.N.getValue(), (ReferralContactDelegate) asftHomeScreen2.O.getValue()), false), new EsimLoadingDelegate(), (FullScreenStateDelegate) asftHomeScreen2.P.getValue(), (RowDelegate) asftHomeScreen2.R.getValue(), new RowLoadingDelegate())), 0, null, null, null, 60);
                    case 2:
                        KProperty[] kPropertyArr3 = AsftHomeScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(asftHomeScreen.m2()).a().get(lti.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lti.g.class, " is not found"));
                        }
                        lti.g gVar = ((lti.g) aVar2.b()).o;
                        AsftHomeScreenContract$InputData asftHomeScreenContract$InputData = asftHomeScreen.K;
                        asftHomeScreenContract$InputData.getClass();
                        return new lti.f(gVar, asftHomeScreen, asftHomeScreen, asftHomeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = AsftHomeScreen.W;
                        return (s) ((lti.f) asftHomeScreen.U.getValue()).f199903m.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        u uiState = (u) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        t tVar = uiState.f155694b;
        navBarWithToolbar.setMenuItems(v.l(tVar.f155690a));
        Clause clause = tVar.f155691b;
        Clause clause2 = tVar.f155692c;
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setDescriptionVisible(clause != null);
        navBarWithToolbar.setSecondDescriptionText(clause2);
        navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        d3().f174564b.setText(uiState.f155695c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.asft_home_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // i7d.i
    public final koi.a b1() {
        return ((dli.c) this.T.getValue()).w();
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new hui.f(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.o.f57403b), new hui.f(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.P.getValue()).f52371h.f121375b), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(((ReferralContactDelegate) this.O.getValue()).q()), new hui.h(this, null), 3);
        ViewController.P2(this, new hsl.c(rd0.e.b(((EsimDelegate) this.N.getValue()).d), 2), new hui.i(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((ListSubheaderDelegate) this.Q.getValue()).f52707c), new j(this, null), 3);
        ViewController.P2(this, new hsl.c(rd0.e.b(((RowDelegate) this.R.getValue()).f53218h), 3), new hui.i(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new hui.f(this, null, 0), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final hui.s d() {
        return (hui.s) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }

    public AsftHomeScreen() {
        this(new AsftHomeScreenContract$InputData(null));
    }
}
