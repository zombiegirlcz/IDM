package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ppd.k0;
import sqd.a0;
import sqd.b0;
import sqd.c0;
import sqd.d0;
import sqd.t;
import sqd.u;
import sqd.v;
import sqd.y;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsqd/j;", "Ldli/a;", "Lsqd/w;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IncomeSorterReviewController extends ViewController<sqd.j> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(IncomeSorterReviewController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final ao.h L;
    public final Object M;
    public final Object N;
    public final FullScreenStateDelegate O;
    public final RowDelegate P;
    public final FooterTextDelegate Q;
    public final Object R;

    public IncomeSorterReviewController(sqd.d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = s.t(this, y.f);
        this.M = w.y0(new s86.a(this, inputData, 24));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: sqd.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSorterReviewController f265082b;

            {
                this.f265082b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = IncomeSorterReviewController.S;
                        return (e) ((k0) this.f265082b.M.getValue()).f238459c.get();
                    default:
                        KProperty[] kPropertyArr2 = IncomeSorterReviewController.S;
                        IncomeSorterReviewController incomeSorterReviewController = this.f265082b;
                        return dli.f.a(incomeSorterReviewController, incomeSorterReviewController.d(), zhm.v.k(incomeSorterReviewController.P, new ListSubheaderDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), incomeSorterReviewController.O, incomeSorterReviewController.Q), incomeSorterReviewController.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        this.O = new FullScreenStateDelegate();
        this.P = new RowDelegate(null, null, 7);
        this.Q = new FooterTextDelegate();
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: sqd.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSorterReviewController f265082b;

            {
                this.f265082b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IncomeSorterReviewController.S;
                        return (e) ((k0) this.f265082b.M.getValue()).f238459c.get();
                    default:
                        KProperty[] kPropertyArr2 = IncomeSorterReviewController.S;
                        IncomeSorterReviewController incomeSorterReviewController = this.f265082b;
                        return dli.f.a(incomeSorterReviewController, incomeSorterReviewController.d(), zhm.v.k(incomeSorterReviewController.P, new ListSubheaderDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), incomeSorterReviewController.O, incomeSorterReviewController.Q), incomeSorterReviewController.d3().d.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        sqd.w uiState = (sqd.w) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174565c.setHeaderDisclaimerSticky(uiState.f265080c);
        v vVar = uiState.f265079b;
        if (vVar instanceof t) {
            LargeActionButton goToButton = d3().f174564b;
            Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
            goToButton.setVisibility(8);
        } else {
            if (!(vVar instanceof u)) {
                throw new NoWhenBranchMatchedException();
            }
            LargeActionButton goToButton2 = d3().f174564b;
            Intrinsics.checkNotNullExpressionValue(goToButton2, "goToButton");
            goToButton2.setVisibility(0);
            d3().f174564b.setText(((u) vVar).f265077a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (k0) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.analytics_income_sorter_review_sorting_header_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.analytics_income_sorter_review_sorting_header_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        RowDelegate rowDelegate = this.P;
        int i = 0;
        int i2 = 1;
        Continuation continuation = null;
        ViewController.P2(this, vkm.q.J(rd0.e.b(rowDelegate.f53218h), rd0.e.b(rowDelegate.k)), new a0(this, null), 3);
        ViewController.P2(this, new ryj.w(rd0.e.b(this.O.f52371h.f121375b), 19), new b0(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c0(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(this.Q.e.f121375b), new d0(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b((ihm.f) d3().f174565c.f59406n.f258290b), new d0(this, continuation, i2), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c0(this, continuation, i2), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final sqd.e d() {
        return (sqd.e) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
