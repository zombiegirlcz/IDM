package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.verification_disclaimer;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import c9g.t;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.v5;
import rd0.e;
import vc.s;
import yp0.y;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/property/guests_reviews/verification_disclaimer/TravelHotelsReviewVerificationDisclaimerScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Laii/q;", "<init>", "()V", "Companion", "a", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsReviewVerificationDisclaimerScreen extends SimpleViewController<q> {
    public final int N = R$layout.screen_travel_hotels_review_verification_disclaimer;
    public final h O = s.t(this, b.f);
    public final j P = new j(7, u.c(new PlainTextDelegate()), false);
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TravelHotelsReviewVerificationDisclaimerScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsReviewVerificationDisclaimerBinding;", 0))};

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, t.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsReviewVerificationDisclaimerBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i = R$id.travelHotelsReviewVerificationDisclaimerScreen_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.travelHotelsReviewVerificationDisclaimerScreen_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    return new t(controllerContainerCoordinatorLayout, navBarWithToolbar, screenContentRecyclerView);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f22429b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_property_reviews_reviews_verification_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ScreenContentRecyclerView screenContentRecyclerView = d3().f22430c;
        Intrinsics.checkNotNullExpressionValue(screenContentRecyclerView, "travelHotelsReviewVerifi…claimerScreenRecyclerView");
        j jVar = this.P;
        y.h(screenContentRecyclerView, jVar, new LinearLayoutManager(screenContentRecyclerView.getContext()));
        PlainTextDelegate.Model model = new PlainTextDelegate.Model("DISCLAIMER_ITEM_ID", (UrlImage) null, new TextLocalisedClause(R$string.hotels_property_reviews_reviews_verification_section_title, null, null, 14), new TextLocalisedClause(R$string.hotels_property_reviews_reviews_verification_section_message, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        jVar.c(u.c(model));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e.b(d3().f22429b.f59410q), new u07.b(this, null, 29), 3);
    }

    public final t d3() {
        ViewBinding value = this.O.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (t) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.N;
    }
}
