package com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.SchemeLoungesHomeScreen;
import cwi.j1;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import yph.b;
import yyi.c;
import yyi.d;
import yyi.f;
import yyi.i;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/scheme/home/SchemeLoungesHomeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lyyi/i;", "<init>", "()V", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SchemeLoungesHomeScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SchemeLoungesHomeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_nextbutton;
    public final h L = s.t(this, a.f);
    public final ActionWidgetDelegate M = new ActionWidgetDelegate();
    public final CellDetailsChevronDelegate N = new CellDetailsChevronDelegate();
    public final FullScreenStateDelegate O = new FullScreenStateDelegate();
    public final Object P;
    public final Object Q;
    public final Object R;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public SchemeLoungesHomeScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: yyi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SchemeLoungesHomeScreen f317940b;

            {
                this.f317940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SchemeLoungesHomeScreen schemeLoungesHomeScreen = this.f317940b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SchemeLoungesHomeScreen.S;
                        SchemeLoungesHomeScreen schemeLoungesHomeScreen2 = this.f317940b;
                        return dli.f.a(schemeLoungesHomeScreen2, schemeLoungesHomeScreen2.R2(), v.k(schemeLoungesHomeScreen2.M, new ListingTileDelegate(), new ListingTileLoadingDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), schemeLoungesHomeScreen2.N, new CellDetailsLoadingDelegate(), schemeLoungesHomeScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SchemeLoungesHomeScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(schemeLoungesHomeScreen.m2()).a().get(ovi.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (j1) ((zyi.a) ((zyi.b) aVar2.b()).b().mo3808a(schemeLoungesHomeScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ovi.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = SchemeLoungesHomeScreen.S;
                        j1 j1Var = (j1) schemeLoungesHomeScreen.Q.getValue();
                        switch (j1Var.f109730a) {
                            case 0:
                                return (h) j1Var.f109734h.get();
                            default:
                                return (h) j1Var.f109734h.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: yyi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SchemeLoungesHomeScreen f317940b;

            {
                this.f317940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SchemeLoungesHomeScreen schemeLoungesHomeScreen = this.f317940b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SchemeLoungesHomeScreen.S;
                        SchemeLoungesHomeScreen schemeLoungesHomeScreen2 = this.f317940b;
                        return dli.f.a(schemeLoungesHomeScreen2, schemeLoungesHomeScreen2.R2(), v.k(schemeLoungesHomeScreen2.M, new ListingTileDelegate(), new ListingTileLoadingDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), schemeLoungesHomeScreen2.N, new CellDetailsLoadingDelegate(), schemeLoungesHomeScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SchemeLoungesHomeScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(schemeLoungesHomeScreen.m2()).a().get(ovi.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (j1) ((zyi.a) ((zyi.b) aVar2.b()).b().mo3808a(schemeLoungesHomeScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ovi.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = SchemeLoungesHomeScreen.S;
                        j1 j1Var = (j1) schemeLoungesHomeScreen.Q.getValue();
                        switch (j1Var.f109730a) {
                            case 0:
                                return (h) j1Var.f109734h.get();
                            default:
                                return (h) j1Var.f109734h.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: yyi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SchemeLoungesHomeScreen f317940b;

            {
                this.f317940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SchemeLoungesHomeScreen schemeLoungesHomeScreen = this.f317940b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SchemeLoungesHomeScreen.S;
                        SchemeLoungesHomeScreen schemeLoungesHomeScreen2 = this.f317940b;
                        return dli.f.a(schemeLoungesHomeScreen2, schemeLoungesHomeScreen2.R2(), v.k(schemeLoungesHomeScreen2.M, new ListingTileDelegate(), new ListingTileLoadingDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), schemeLoungesHomeScreen2.N, new CellDetailsLoadingDelegate(), schemeLoungesHomeScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SchemeLoungesHomeScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(schemeLoungesHomeScreen.m2()).a().get(ovi.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (j1) ((zyi.a) ((zyi.b) aVar2.b()).b().mo3808a(schemeLoungesHomeScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ovi.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = SchemeLoungesHomeScreen.S;
                        j1 j1Var = (j1) schemeLoungesHomeScreen.Q.getValue();
                        switch (j1Var.f109730a) {
                            case 0:
                                return (h) j1Var.f109734h.get();
                            default:
                                return (h) j1Var.f109734h.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        Clause clause = uiState.f317944b;
        goToButton.setVisibility(clause != null ? 0 : 8);
        d3().f174564b.setText(clause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j1) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.airport_lounges_scheme_home_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.airport_lounges_scheme_home_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f51821c), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new b(rd0.e.b(this.O.f52371h.f121375b), 16), null, new yyi.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f51589c.f121375b), null, new f(this, null), 3);
        d3().f174564b.setLoadingButtonTag("HOME_LOADING_BUTTON_TAG");
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final yyi.h R2() {
        return (yyi.h) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
