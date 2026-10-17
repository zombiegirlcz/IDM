package com.revolut.feature.cryptocommodity_invest.impl.ui.standalone_symbol.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import ce9.r;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cryptocommodity_invest.impl.ui.standalone_symbol.screen.StandaloneSymbolCustomisationScreen;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import gfd.d;
import ihm.f;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import rxb.b;
import ry5.c;
import te0.w;
import vc.s;
import xki.e;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/impl/ui/standalone_symbol/screen/StandaloneSymbolCustomisationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgfd/d;", "Ldli/a;", "Lry5/m;", "", "<init>", "()V", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StandaloneSymbolCustomisationScreen extends ViewController<d> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(StandaloneSymbolCustomisationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final FullScreenStateDelegate K = new FullScreenStateDelegate();
    public final RowDelegate L = new RowDelegate(null, null, 7);
    public final int M = R$layout.screen_recycler_navbar;
    public final h N = s.t(this, a.f);
    public final r O = new r(new rl8.d(this, 20));
    public final Object P;
    public final Object Q;
    public final Object R;

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

    public StandaloneSymbolCustomisationScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: ry5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StandaloneSymbolCustomisationScreen f258224b;

            {
                this.f258224b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StandaloneSymbolCustomisationScreen standaloneSymbolCustomisationScreen = this.f258224b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StandaloneSymbolCustomisationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(standaloneSymbolCustomisationScreen.m2()).a().get(mw5.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new mw5.o(((mw5.l) aVar2.b()).f209388x);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", mw5.l.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = StandaloneSymbolCustomisationScreen.S;
                        int i3 = R$id.recyclerView;
                        StandaloneSymbolCustomisationScreen standaloneSymbolCustomisationScreen2 = this.f258224b;
                        return dli.f.a(standaloneSymbolCustomisationScreen2, standaloneSymbolCustomisationScreen2.R2(), v.k(standaloneSymbolCustomisationScreen2.L, new ListSubheaderDelegate(), new RowLoadingDelegate(), standaloneSymbolCustomisationScreen2.K), i3, null, new z4l.j(4, (List) f0.f322471a, true), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = StandaloneSymbolCustomisationScreen.S;
                        return (h) ((mw5.o) standaloneSymbolCustomisationScreen.P.getValue()).f209398c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ry5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StandaloneSymbolCustomisationScreen f258224b;

            {
                this.f258224b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StandaloneSymbolCustomisationScreen standaloneSymbolCustomisationScreen = this.f258224b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StandaloneSymbolCustomisationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(standaloneSymbolCustomisationScreen.m2()).a().get(mw5.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new mw5.o(((mw5.l) aVar2.b()).f209388x);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", mw5.l.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = StandaloneSymbolCustomisationScreen.S;
                        int i3 = R$id.recyclerView;
                        StandaloneSymbolCustomisationScreen standaloneSymbolCustomisationScreen2 = this.f258224b;
                        return dli.f.a(standaloneSymbolCustomisationScreen2, standaloneSymbolCustomisationScreen2.R2(), v.k(standaloneSymbolCustomisationScreen2.L, new ListSubheaderDelegate(), new RowLoadingDelegate(), standaloneSymbolCustomisationScreen2.K), i3, null, new z4l.j(4, (List) f0.f322471a, true), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = StandaloneSymbolCustomisationScreen.S;
                        return (h) ((mw5.o) standaloneSymbolCustomisationScreen.P.getValue()).f209398c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ry5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StandaloneSymbolCustomisationScreen f258224b;

            {
                this.f258224b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StandaloneSymbolCustomisationScreen standaloneSymbolCustomisationScreen = this.f258224b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StandaloneSymbolCustomisationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(standaloneSymbolCustomisationScreen.m2()).a().get(mw5.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new mw5.o(((mw5.l) aVar2.b()).f209388x);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", mw5.l.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = StandaloneSymbolCustomisationScreen.S;
                        int i32 = R$id.recyclerView;
                        StandaloneSymbolCustomisationScreen standaloneSymbolCustomisationScreen2 = this.f258224b;
                        return dli.f.a(standaloneSymbolCustomisationScreen2, standaloneSymbolCustomisationScreen2.R2(), v.k(standaloneSymbolCustomisationScreen2.L, new ListSubheaderDelegate(), new RowLoadingDelegate(), standaloneSymbolCustomisationScreen2.K), i32, null, new z4l.j(4, (List) f0.f322471a, true), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = StandaloneSymbolCustomisationScreen.S;
                        return (h) ((mw5.o) standaloneSymbolCustomisationScreen.P.getValue()).f209398c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((ry5.m) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (mw5.o) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.K.f52371h.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.L.f53218h, new b(17))), null, new rt4.o(this, continuation, 11), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new rlh.c(this, continuation, 24), 3);
        ((dli.c) this.Q.getValue()).h().addOnScrollListener(this.O);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.shared_watchlist_common_search_placeholder, null, null, 14));
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        f fVar = navBarWithToolbar.f59409p.f57337m;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.revolut.kompot.navigable.a.g2(this, new rv6.e(new r7b.e(rd0.e.b(w.y(fVar, 400L)), 26), 1), null, new q9c.v(2, R2(), ry5.h.class, "onUIEvent", "onUIEvent(Lcom/revolut/feature/cryptocommodity_invest/impl/ui/standalone_symbol/screen/StandaloneSymbolCustomisationScreenContract$UIEvent;)V", 4, 28), 3);
        navBarWithToolbar.post(new cgd.e(navBarWithToolbar, 3));
        NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
        navBarWithToolbar2.setTitle(new TextLocalisedClause(com.revolut.feature.cryptocommodity_invest.api.R$string.crypto_home_widget_symbol_standalone_edit_flow_title, null, null, 14), null);
        navBarWithToolbar2.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    public final m d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ry5.h R2() {
        return (ry5.h) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
