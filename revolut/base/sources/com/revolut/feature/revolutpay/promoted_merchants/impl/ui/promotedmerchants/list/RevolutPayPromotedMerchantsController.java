package com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FixedTabsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.list.RevolutPayPromotedMerchantsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import jcc.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import q43.m;
import qa9.r;
import qcc.b;
import qcc.c;
import qcc.d;
import qcc.g;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import yp0.v;
import yp0.y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/promoted_merchants/impl/ui/promotedmerchants/list/RevolutPayPromotedMerchantsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqcc/g;", "Ldli/a;", "Lqcc/h;", "feature_revolut_pay_promoted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutPayPromotedMerchantsController extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(RevolutPayPromotedMerchantsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final TabsDelegate O;
    public final SearchButtonDelegate P;
    public final RowDelegate Q;
    public v R;
    public final Object S;

    public RevolutPayPromotedMerchantsController(RevolutPayPromotedMerchantsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, b.f);
        this.M = w.y0(new qba.b(this, inputData, 5));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: qcc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutPayPromotedMerchantsController f244689b;

            {
                this.f244689b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = RevolutPayPromotedMerchantsController.T;
                        return (f) ((jcc.f) this.f244689b.M.getValue()).f172786g.get();
                    default:
                        KProperty[] kPropertyArr2 = RevolutPayPromotedMerchantsController.T;
                        RevolutPayPromotedMerchantsController revolutPayPromotedMerchantsController = this.f244689b;
                        return dli.f.a(revolutPayPromotedMerchantsController, revolutPayPromotedMerchantsController.d(), zhm.v.k(new FullScreenStateDelegate(), new RowLoadingDelegate(), new FixedTabsLoadingDelegate(), revolutPayPromotedMerchantsController.P, revolutPayPromotedMerchantsController.O, revolutPayPromotedMerchantsController.Q), 0, null, null, null, 60);
                }
            }
        });
        this.O = new TabsDelegate();
        this.P = new SearchButtonDelegate();
        this.Q = new RowDelegate(null, null, 7);
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: qcc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutPayPromotedMerchantsController f244689b;

            {
                this.f244689b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevolutPayPromotedMerchantsController.T;
                        return (f) ((jcc.f) this.f244689b.M.getValue()).f172786g.get();
                    default:
                        KProperty[] kPropertyArr2 = RevolutPayPromotedMerchantsController.T;
                        RevolutPayPromotedMerchantsController revolutPayPromotedMerchantsController = this.f244689b;
                        return dli.f.a(revolutPayPromotedMerchantsController, revolutPayPromotedMerchantsController.d(), zhm.v.k(new FullScreenStateDelegate(), new RowLoadingDelegate(), new FixedTabsLoadingDelegate(), revolutPayPromotedMerchantsController.P, revolutPayPromotedMerchantsController.O, revolutPayPromotedMerchantsController.Q), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        qcc.h uiState = (qcc.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f244694a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ScreenContentRecyclerView screenContentRecyclerView = d3().f174540c;
        v vVar = this.R;
        if (vVar != null) {
            screenContentRecyclerView.removeOnScrollListener(vVar);
        } else {
            Intrinsics.r("paginationScrollListener");
            throw null;
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        this.R = y.a(recyclerView, 10, true, new r(this, 17));
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new m(this, continuation, 23), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f53218h), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f53515c.f121375b), null, new qc3.c(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53283c.f121375b), null, new d(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final qcc.f d() {
        return (qcc.f) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
