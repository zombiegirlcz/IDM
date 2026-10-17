package com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.search;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.revolutpay.promoted_merchants.impl.R$string;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.search.RevolutPayMerchantsSearchController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import jcc.d;
import jii.m;
import kli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import s56.i;
import scc.b;
import scc.f;
import te0.w;
import vc.s;
import xki.e;
import yp0.v;
import yp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/promoted_merchants/impl/ui/promotedmerchants/search/RevolutPayMerchantsSearchController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lscc/f;", "feature_revolut_pay_promoted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutPayMerchantsSearchController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(RevolutPayMerchantsSearchController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public v N;
    public final Object O;
    public final RowDelegate P;
    public final Object Q;

    public RevolutPayMerchantsSearchController(RevolutPayMerchantsSearchControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, b.f);
        this.M = w.y0(new s86.a(this, inputData, 6));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: scc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutPayMerchantsSearchController f261700b;

            {
                this.f261700b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = RevolutPayMerchantsSearchController.R;
                        return (e) ((jcc.d) this.f261700b.M.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr2 = RevolutPayMerchantsSearchController.R;
                        RevolutPayMerchantsSearchController revolutPayMerchantsSearchController = this.f261700b;
                        return dli.f.a(revolutPayMerchantsSearchController, (e) revolutPayMerchantsSearchController.O.getValue(), zhm.v.k(new FullScreenStateDelegate(), new RowLoadingDelegate(), revolutPayMerchantsSearchController.P), 0, null, null, null, 60);
                }
            }
        });
        this.P = new RowDelegate(null, null, 7);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: scc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutPayMerchantsSearchController f261700b;

            {
                this.f261700b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevolutPayMerchantsSearchController.R;
                        return (e) ((jcc.d) this.f261700b.M.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr2 = RevolutPayMerchantsSearchController.R;
                        RevolutPayMerchantsSearchController revolutPayMerchantsSearchController = this.f261700b;
                        return dli.f.a(revolutPayMerchantsSearchController, (e) revolutPayMerchantsSearchController.O.getValue(), zhm.v.k(new FullScreenStateDelegate(), new RowLoadingDelegate(), revolutPayMerchantsSearchController.P), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (scc.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setHints(u.c(new TextLocalisedClause(R$string.revolut_pay_promoted_merchants_search_placeholder, null, null, 14)));
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        navBarWithToolbar.E0();
        c.d(navBarWithToolbar, 0L);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ScreenContentRecyclerView screenContentRecyclerView = d3().f174540c;
        v vVar = this.N;
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
        this.N = y.a(recyclerView, 10, true, new s78.d(this, 25));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59409p.f57336l), null, new s1k.b(this, null, 24), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), null, new i(this, null, 22), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53218h), null, new scc.c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
