package com.revolut.feature.giro.impl.ui.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.giro.api.R$string;
import com.revolut.feature.giro.impl.ui.review.DirectDebitReviewScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import e58.d;
import e77.b;
import e77.g;
import e77.i;
import h30.l;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import y67.c;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/giro/impl/ui/review/DirectDebitReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Le77/g;", "Ldli/a;", "Le77/i;", "feature_giro_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DirectDebitReviewScreen extends ViewController<g> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(DirectDebitReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final CellDetailsSwitcherDelegate M;
    public final CellDetailsActionDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public DirectDebitReviewScreen(DirectDebitReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = s.t(this, b.f);
        this.M = new CellDetailsSwitcherDelegate();
        this.N = new CellDetailsActionDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: e77.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDebitReviewScreen f123091b;

            {
                this.f123091b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDebitReviewScreen.R;
                        DirectDebitReviewScreen directDebitReviewScreen = this.f123091b;
                        return dli.f.a(directDebitReviewScreen, (h) directDebitReviewScreen.Q.getValue(), v.k(new CellDetailsDelegate(), directDebitReviewScreen.N, directDebitReviewScreen.M), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = DirectDebitReviewScreen.R;
                        return (h) ((y67.c) this.f123091b.P.getValue()).d.get();
                }
            }
        });
        this.P = w.y0(new d(this, inputData, 3));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: e77.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDebitReviewScreen f123091b;

            {
                this.f123091b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDebitReviewScreen.R;
                        DirectDebitReviewScreen directDebitReviewScreen = this.f123091b;
                        return dli.f.a(directDebitReviewScreen, (h) directDebitReviewScreen.Q.getValue(), v.k(new CellDetailsDelegate(), directDebitReviewScreen.N, directDebitReviewScreen.M), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = DirectDebitReviewScreen.R;
                        return (h) ((y67.c) this.f123091b.P.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (e77.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.giro_direct_debits_review_direct_debit_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.giro_direct_debits_review_direct_debit_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        l.A(R.string.common_action_submit, null, null, 14, d3().f174564b);
        d3().f174564b.setLoadingButtonTag("BUTTON_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new e77.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f51912c), null, new e77.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.d), null, new e77.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new e77.c(this, continuation, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
