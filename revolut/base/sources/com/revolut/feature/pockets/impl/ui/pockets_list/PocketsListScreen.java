package com.revolut.feature.pockets.impl.ui.pockets_list;

import ael.r0;
import afa.i;
import afa.k;
import afa.l;
import afa.n;
import afa.p;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.pockets.impl.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ihm.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oda.m;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/impl/ui/pockets_list/PocketsListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhda/c;", "Ldli/a;", "Lafa/i;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PocketsListScreen extends ViewController<hda.c> implements dli.a {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(PocketsListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final PocketsListContract$InputData K;
    public final int L;
    public final boolean M;
    public final Integer N;
    public final h O;
    public final ActionWidgetDelegate P;
    public final f Q;
    public final ScrollerDelegate R;
    public final Object S;
    public final Object T;
    public final RowDelegate U;
    public final FullScreenStateDelegate V;
    public final TwinHorizontalButtonDelegate W;
    public final Object X;

    public PocketsListScreen(PocketsListContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        int i = 1;
        this.M = true;
        this.N = inputData.f80907c.f80914b ? Integer.valueOf(R$style.UiKitTheme_Transparent) : null;
        this.O = s.t(this, l.f);
        HeroBannerDelegate heroBannerDelegate = new HeroBannerDelegate(0);
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.P = actionWidgetDelegate;
        this.Q = v0.a.d("create(...)");
        this.R = new ScrollerDelegate(v.k(heroBannerDelegate, actionWidgetDelegate), false);
        this.S = w.y0(new k(this, 0));
        this.T = w.y0(new k(this, i));
        this.U = new RowDelegate(null, null, 7);
        this.V = new FullScreenStateDelegate();
        this.W = new TwinHorizontalButtonDelegate();
        this.X = w.y0(new k(this, 2));
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getN() {
        return this.N;
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((i) oVar);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (!e3().f174539b.f59421x0) {
            return super.F2();
        }
        d3();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((m) this.S.getValue()).f.get()).d(u.c(this.W));
        NavBarWithToolbar navBarWithToolbar = e3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        PocketsListContract$InputData pocketsListContract$InputData = this.K;
        navBarWithToolbar.setTitle(pocketsListContract$InputData.f80907c.f80913a, null);
        navBarWithToolbar.setToolbarTitle(pocketsListContract$InputData.f80907c.f80913a);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.account_details_select_details_search_hint, null, null, 14));
        navBarWithToolbar.setSearchButtonActive(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().f174539b.f59410q), null, new n(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().f174539b.f59409p.f57337m), null, new afa.o(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().f174539b.f59409p.f57336l), null, new n(this, null, 1), 3);
        RowDelegate rowDelegate = this.U;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new p(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(rowDelegate.f53220l, new r0(14))), null, new afa.o(this, continuation, 1), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.W;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new n(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(twinHorizontalButtonDelegate.d.f121375b, new r0(15))), null, new afa.o(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.V.f52371h.f121375b), null, new afa.m(this, null), 3);
    }

    public final void d3() {
        e3().f174539b.m0(j4.FROM_CLICKED_BUTTON);
        e3().f174539b.i0();
        NavBarWithToolbar navBarWithToolbar = e3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        Intrinsics.checkNotNullParameter(navBarWithToolbar, "<this>");
        kli.c.c(navBarWithToolbar, false);
    }

    public final jii.m e3() {
        ViewBinding value = this.O.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final afa.h R2() {
        return (afa.h) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
