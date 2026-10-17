package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.airport_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ap7.k;
import ar0.b;
import aui.c;
import aui.d;
import aui.g;
import aui.i;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.airport_selection.AsftAirportSelectionScreen;
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
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/airport_selection/AsftAirportSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laui/g;", "Ldli/a;", "Laui/i;", "<init>", "()V", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsftAirportSelectionScreen extends ViewController<g> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AsftAirportSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final Object M = w.y0(new b(23));
    public final Object N = w.y0(new b(24));
    public final Object O;
    public final Object P;
    public final Object Q;

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

    public AsftAirportSelectionScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: aui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftAirportSelectionScreen f9828b;

            {
                this.f9828b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AsftAirportSelectionScreen asftAirportSelectionScreen = this.f9828b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AsftAirportSelectionScreen.R;
                        AsftAirportSelectionScreen asftAirportSelectionScreen2 = this.f9828b;
                        return dli.f.a(asftAirportSelectionScreen2, asftAirportSelectionScreen2.R2(), v.k((RowDelegate) asftAirportSelectionScreen2.M.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), (FullScreenStateDelegate) asftAirportSelectionScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftAirportSelectionScreen.R;
                        qji.b bVarU2 = asftAirportSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.airport_selection.di.AsftAirportSelectionScreenInjector");
                        lti.k kVar = (lti.k) bVarU2;
                        return new lti.b(kVar.f199922a, kVar.f199923b, asftAirportSelectionScreen);
                    default:
                        KProperty[] kPropertyArr3 = AsftAirportSelectionScreen.R;
                        return (h) ((lti.b) asftAirportSelectionScreen.P.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: aui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftAirportSelectionScreen f9828b;

            {
                this.f9828b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AsftAirportSelectionScreen asftAirportSelectionScreen = this.f9828b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AsftAirportSelectionScreen.R;
                        AsftAirportSelectionScreen asftAirportSelectionScreen2 = this.f9828b;
                        return dli.f.a(asftAirportSelectionScreen2, asftAirportSelectionScreen2.R2(), v.k((RowDelegate) asftAirportSelectionScreen2.M.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), (FullScreenStateDelegate) asftAirportSelectionScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftAirportSelectionScreen.R;
                        qji.b bVarU2 = asftAirportSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.airport_selection.di.AsftAirportSelectionScreenInjector");
                        lti.k kVar = (lti.k) bVarU2;
                        return new lti.b(kVar.f199922a, kVar.f199923b, asftAirportSelectionScreen);
                    default:
                        KProperty[] kPropertyArr3 = AsftAirportSelectionScreen.R;
                        return (h) ((lti.b) asftAirportSelectionScreen.P.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: aui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftAirportSelectionScreen f9828b;

            {
                this.f9828b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AsftAirportSelectionScreen asftAirportSelectionScreen = this.f9828b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AsftAirportSelectionScreen.R;
                        AsftAirportSelectionScreen asftAirportSelectionScreen2 = this.f9828b;
                        return dli.f.a(asftAirportSelectionScreen2, asftAirportSelectionScreen2.R2(), v.k((RowDelegate) asftAirportSelectionScreen2.M.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), (FullScreenStateDelegate) asftAirportSelectionScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftAirportSelectionScreen.R;
                        qji.b bVarU2 = asftAirportSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.airport_selection.di.AsftAirportSelectionScreenInjector");
                        lti.k kVar = (lti.k) bVarU2;
                        return new lti.b(kVar.f199922a, kVar.f199923b, asftAirportSelectionScreen);
                    default:
                        KProperty[] kPropertyArr3 = AsftAirportSelectionScreen.R;
                        return (h) ((lti.b) asftAirportSelectionScreen.P.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (lti.b) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitleAutoSize(false);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.asft_airport_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.asft_airport_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.f59417v0 = false;
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.asft_airport_search_hint, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.v0()), null, new c(this, null, 1), 3);
        ViewController.P2(this, new an9.i(rd0.e.b(((RowDelegate) this.M.getValue()).f53218h), 13), new k(this, null, 20), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), new d(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final aui.h R2() {
        return (aui.h) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
