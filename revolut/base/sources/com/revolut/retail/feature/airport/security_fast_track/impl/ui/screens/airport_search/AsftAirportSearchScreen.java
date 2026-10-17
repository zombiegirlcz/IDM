package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.airport_search;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
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
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.airport_search.AsftAirportSearchScreen;
import dli.a;
import efm.r;
import java.util.concurrent.TimeUnit;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import wp5.y;
import xki.e;
import xo8.a0;
import xsf.c;
import xti.d;
import xti.g;
import xti.j;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/airport_search/AsftAirportSearchScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxti/g;", "Ldli/a;", "Lxti/h;", "<init>", "()V", "Companion", "a", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsftAirportSearchScreen extends ViewController<g> implements a {
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, b.f);
    public final Object M = w.y0(new c(1));
    public final Object N = w.y0(new c(2));
    public final Object O;
    public final Object P;
    public final Object Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AsftAirportSearchScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.airport_search.AsftAirportSearchScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public AsftAirportSearchScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: xti.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftAirportSearchScreen f308821b;

            {
                this.f308821b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AsftAirportSearchScreen asftAirportSearchScreen = this.f308821b;
                switch (i2) {
                    case 0:
                        AsftAirportSearchScreen.Companion companion = AsftAirportSearchScreen.INSTANCE;
                        AsftAirportSearchScreen asftAirportSearchScreen2 = this.f308821b;
                        return dli.f.a(asftAirportSearchScreen2, asftAirportSearchScreen2.R2(), v.k((RowDelegate) asftAirportSearchScreen2.M.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), (FullScreenStateDelegate) asftAirportSearchScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        AsftAirportSearchScreen.Companion companion2 = AsftAirportSearchScreen.INSTANCE;
                        qji.b bVarU2 = asftAirportSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.airport_search.di.AsftAirportSearchScreenInjector");
                        lti.k kVar = (lti.k) bVarU2;
                        return new lti.a(kVar.f199922a, kVar.f199923b, asftAirportSearchScreen);
                    default:
                        AsftAirportSearchScreen.Companion companion3 = AsftAirportSearchScreen.INSTANCE;
                        return (j) ((lti.a) asftAirportSearchScreen.P.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: xti.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftAirportSearchScreen f308821b;

            {
                this.f308821b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AsftAirportSearchScreen asftAirportSearchScreen = this.f308821b;
                switch (i22) {
                    case 0:
                        AsftAirportSearchScreen.Companion companion = AsftAirportSearchScreen.INSTANCE;
                        AsftAirportSearchScreen asftAirportSearchScreen2 = this.f308821b;
                        return dli.f.a(asftAirportSearchScreen2, asftAirportSearchScreen2.R2(), v.k((RowDelegate) asftAirportSearchScreen2.M.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), (FullScreenStateDelegate) asftAirportSearchScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        AsftAirportSearchScreen.Companion companion2 = AsftAirportSearchScreen.INSTANCE;
                        qji.b bVarU2 = asftAirportSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.airport_search.di.AsftAirportSearchScreenInjector");
                        lti.k kVar = (lti.k) bVarU2;
                        return new lti.a(kVar.f199922a, kVar.f199923b, asftAirportSearchScreen);
                    default:
                        AsftAirportSearchScreen.Companion companion3 = AsftAirportSearchScreen.INSTANCE;
                        return (j) ((lti.a) asftAirportSearchScreen.P.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: xti.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftAirportSearchScreen f308821b;

            {
                this.f308821b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AsftAirportSearchScreen asftAirportSearchScreen = this.f308821b;
                switch (i22) {
                    case 0:
                        AsftAirportSearchScreen.Companion companion = AsftAirportSearchScreen.INSTANCE;
                        AsftAirportSearchScreen asftAirportSearchScreen2 = this.f308821b;
                        return dli.f.a(asftAirportSearchScreen2, asftAirportSearchScreen2.R2(), v.k((RowDelegate) asftAirportSearchScreen2.M.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), (FullScreenStateDelegate) asftAirportSearchScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        AsftAirportSearchScreen.Companion companion2 = AsftAirportSearchScreen.INSTANCE;
                        qji.b bVarU2 = asftAirportSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.airport_search.di.AsftAirportSearchScreenInjector");
                        lti.k kVar = (lti.k) bVarU2;
                        return new lti.a(kVar.f199922a, kVar.f199923b, asftAirportSearchScreen);
                    default:
                        AsftAirportSearchScreen.Companion companion3 = AsftAirportSearchScreen.INSTANCE;
                        return (j) ((lti.a) asftAirportSearchScreen.P.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((xti.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (lti.a) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        navBarWithToolbar.E0();
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.asft_airport_search_hint, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, y.x(d3().f174539b.f59410q, d3().f174539b.f59409p.f57336l, "mergeWith(...)"), null, new xni.h(this, null, 9), 3);
        r rVarDebounce = d3().f174539b.f59409p.f57337m.debounce(300L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarDebounce), null, new xti.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new a0(rd0.e.b(((RowDelegate) this.M.getValue()).f53218h), 9), null, new xti.c(this, null, 1), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
