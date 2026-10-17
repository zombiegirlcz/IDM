package com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.ViewSplitItemsController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import gp9.j;
import hl6.b;
import hq9.d;
import hq9.f;
import hq9.g;
import hq9.i;
import hq9.m;
import hq9.n;
import jii.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/impl/ui/itemization/view/ViewSplitItemsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhq9/m;", "Ltki/c;", "Lhq9/n;", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ViewSplitItemsController extends ViewController<m> implements c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(ViewSplitItemsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final h N;
    public final ListSubheaderDelegate O;
    public final RowDelegate P;
    public final SwipeToActionDelegate Q;
    public final FullScreenStateDelegate R;
    public final Object S;

    public ViewSplitItemsController(i inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_action_footer;
        this.L = w.y0(new b(this, inputData, 10));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: hq9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewSplitItemsController f154641b;

            {
                this.f154641b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ViewSplitItemsController.T;
                        return (j) ((gp9.j) this.f154641b.L.getValue()).f145397b.get();
                    default:
                        KProperty[] kPropertyArr2 = ViewSplitItemsController.T;
                        ViewSplitItemsController viewSplitItemsController = this.f154641b;
                        return tki.g.a(viewSplitItemsController, viewSplitItemsController.R2(), v.k(viewSplitItemsController.O, viewSplitItemsController.P, viewSplitItemsController.Q, viewSplitItemsController.R), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = s.t(this, hq9.b.f);
        this.O = new ListSubheaderDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new SwipeToActionDelegate(rowDelegate, false);
        this.R = new FullScreenStateDelegate();
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: hq9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewSplitItemsController f154641b;

            {
                this.f154641b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ViewSplitItemsController.T;
                        return (j) ((gp9.j) this.f154641b.L.getValue()).f145397b.get();
                    default:
                        KProperty[] kPropertyArr2 = ViewSplitItemsController.T;
                        ViewSplitItemsController viewSplitItemsController = this.f154641b;
                        return tki.g.a(viewSplitItemsController, viewSplitItemsController.R2(), v.k(viewSplitItemsController.O, viewSplitItemsController.P, viewSplitItemsController.Q, viewSplitItemsController.R), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        TextLocalisedClause textLocalisedClause = uiState.f154649b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        d3().f174533b.setModel(uiState.f154650c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new hq9.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52707c), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new hq9.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.k), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new hq9.c(this, null, 1), 3);
    }

    public final k d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final hq9.j R2() {
        return (hq9.j) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
