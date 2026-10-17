package com.revolut.feature.travel.experiences.impl.ui.screen.reviews;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.ReviewCardDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.feature.travel.experiences.impl.ui.screen.reviews.TravelExperiencesReviewsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import dli.a;
import dli.c;
import hwi.l0;
import i13.d;
import i1d.b;
import i3g.e;
import i3g.g;
import i3g.j;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import yp0.y;
import z0g.i0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/reviews/TravelExperiencesReviewsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Li3g/g;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesReviewsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TravelExperiencesReviewsScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenTravelExperiencesReviewsBinding;", 0))};
    public final int K;
    public final ReviewCardDelegate L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;

    public TravelExperiencesReviewsScreen(TravelExperiencesReviewsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_experiences_reviews;
        this.L = new ReviewCardDelegate();
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: i3g.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesReviewsScreen f158208b;

            {
                this.f158208b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesReviewsScreen.Q;
                        TravelExperiencesReviewsScreen travelExperiencesReviewsScreen = this.f158208b;
                        return dli.f.a(travelExperiencesReviewsScreen, (j) travelExperiencesReviewsScreen.P.getValue(), v.k(travelExperiencesReviewsScreen.L, new HeaderDelegate()), R$id.travelExperiencesReviewsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelExperiencesReviewsScreen.Q;
                        i0 i0Var = (i0) this.f158208b.O.getValue();
                        switch (i0Var.f318382a) {
                            case 0:
                                return (j) i0Var.f.get();
                            default:
                                return (j) i0Var.f.get();
                        }
                }
            }
        });
        this.N = s.t(this, e.f);
        this.O = w.y0(new b(this, inputData, 1));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: i3g.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesReviewsScreen f158208b;

            {
                this.f158208b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesReviewsScreen.Q;
                        TravelExperiencesReviewsScreen travelExperiencesReviewsScreen = this.f158208b;
                        return dli.f.a(travelExperiencesReviewsScreen, (j) travelExperiencesReviewsScreen.P.getValue(), v.k(travelExperiencesReviewsScreen.L, new HeaderDelegate()), R$id.travelExperiencesReviewsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelExperiencesReviewsScreen.Q;
                        i0 i0Var = (i0) this.f158208b.O.getValue();
                        switch (i0Var.f318382a) {
                            case 0:
                                return (j) i0Var.f.get();
                            default:
                                return (j) i0Var.f.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (j) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f293753b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.experiences_reviews_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        d3().f293754c.clearOnScrollListeners();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f293753b.f59410q), null, new l0(this, null, 13), 3);
        AsyncDiffRecyclerView travelExperiencesReviewsScreenRecyclerView = d3().f293754c;
        Intrinsics.checkNotNullExpressionValue(travelExperiencesReviewsScreenRecyclerView, "travelExperiencesReviewsScreenRecyclerView");
        y.a(travelExperiencesReviewsScreenRecyclerView, 10, true, new i30.a(this, 2));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53189c), null, new d(this, (Continuation) null, 8), 3);
    }

    public final w0g.y d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w0g.y) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }
}
