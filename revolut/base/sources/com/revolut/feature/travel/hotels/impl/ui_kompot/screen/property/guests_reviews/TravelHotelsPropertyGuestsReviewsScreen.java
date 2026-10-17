package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsBarRatingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.ReviewCardDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.TravelHotelsPropertyGuestsReviewsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import g9g.a0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import s1k.b;
import sdg.e;
import sdg.f;
import sdg.i;
import sdg.j;
import te0.w;
import vc.s;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/property/guests_reviews/TravelHotelsPropertyGuestsReviewsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lsdg/j;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsPropertyGuestsReviewsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TravelHotelsPropertyGuestsReviewsScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsPropertyGuestsReviewsBinding;", 0))};
    public final int K;
    public final ReviewCardDelegate L;
    public final PlainTextDelegate M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public TravelHotelsPropertyGuestsReviewsScreen(TravelHotelsPropertyGuestsReviewsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_hotels_property_guests_reviews;
        this.L = new ReviewCardDelegate();
        this.M = new PlainTextDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: sdg.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsPropertyGuestsReviewsScreen f261877b;

            {
                this.f261877b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsPropertyGuestsReviewsScreen.R;
                        TravelHotelsPropertyGuestsReviewsScreen travelHotelsPropertyGuestsReviewsScreen = this.f261877b;
                        return dli.f.a(travelHotelsPropertyGuestsReviewsScreen, travelHotelsPropertyGuestsReviewsScreen.d(), v.k(travelHotelsPropertyGuestsReviewsScreen.L, travelHotelsPropertyGuestsReviewsScreen.M, new CellDetailsBarRatingDelegate()), R$id.travelHotelsPropertyGuestsReviewsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsPropertyGuestsReviewsScreen.R;
                        return (i) ((a0) this.f261877b.P.getValue()).f.get();
                }
            }
        });
        this.O = s.t(this, e.f);
        this.P = w.y0(new s86.a(this, inputData, 9));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: sdg.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsPropertyGuestsReviewsScreen f261877b;

            {
                this.f261877b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsPropertyGuestsReviewsScreen.R;
                        TravelHotelsPropertyGuestsReviewsScreen travelHotelsPropertyGuestsReviewsScreen = this.f261877b;
                        return dli.f.a(travelHotelsPropertyGuestsReviewsScreen, travelHotelsPropertyGuestsReviewsScreen.d(), v.k(travelHotelsPropertyGuestsReviewsScreen.L, travelHotelsPropertyGuestsReviewsScreen.M, new CellDetailsBarRatingDelegate()), R$id.travelHotelsPropertyGuestsReviewsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsPropertyGuestsReviewsScreen.R;
                        return (i) ((a0) this.f261877b.P.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        sdg.h hVar = qVar instanceof sdg.h ? (sdg.h) qVar : null;
        if (hVar == null || hVar.f261882a) {
            d3().f22421b.setMenuItems(uiState.f261884b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (a0) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f22421b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_property_guests_reviews_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        d3().f22422c.clearOnScrollListeners();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22421b.f59410q), null, new b(this, null, 27), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22421b.o.f57403b), null, new f(this, null, 0), 3);
        ScreenContentRecyclerView screenContentRecyclerView = d3().f22422c;
        Intrinsics.checkNotNullExpressionValue(screenContentRecyclerView, "travelHotelsPropertyGues…ReviewsScreenRecyclerView");
        y.a(screenContentRecyclerView, 10, true, new scl.e(this, 6));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53189c), null, new f(this, null, 1), 3);
    }

    public final c9g.q d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c9g.q) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
