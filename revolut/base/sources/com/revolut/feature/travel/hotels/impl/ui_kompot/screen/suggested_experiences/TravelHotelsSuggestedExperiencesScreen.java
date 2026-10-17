package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.suggested_experiences;

import afg.b;
import afg.c;
import afg.d;
import afg.f;
import afg.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c9g.x;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.StaggeredGridItemDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.suggested_experiences.TravelHotelsSuggestedExperiencesScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import g9g.m0;
import java.util.List;
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
import yp0.y;
import z4l.j;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/suggested_experiences/TravelHotelsSuggestedExperiencesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lafg/g;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsSuggestedExperiencesScreen extends ViewController<Object> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TravelHotelsSuggestedExperiencesScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsSuggestedExperiencesBinding;", 0))};
    public final h K;
    public final ErrorDelegate L;
    public final VoucherSmallTileDelegate M;
    public final j N;
    public final int O;
    public final boolean P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public TravelHotelsSuggestedExperiencesScreen(TravelHotelsSuggestedExperiencesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        ErrorDelegate errorDelegate = new ErrorDelegate();
        this.L = errorDelegate;
        VoucherSmallTileDelegate voucherSmallTileDelegate = new VoucherSmallTileDelegate();
        this.M = voucherSmallTileDelegate;
        StaggeredGridItemDelegate.Companion companion = StaggeredGridItemDelegate.INSTANCE;
        final int i = 0;
        final int i2 = 1;
        List listK = v.k(largeActionButtonDelegate, errorDelegate, voucherSmallTileDelegate, new VoucherSmallLoadingDelegate());
        companion.getClass();
        this.N = new j(7, (List) StaggeredGridItemDelegate.Companion.a(listK), false);
        this.O = R$layout.screen_travel_hotels_suggested_experiences;
        this.P = true;
        this.Q = w.y0(new a07.b(this, inputData, 28));
        this.R = w.y0(new Function0(this) { // from class: afg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsSuggestedExperiencesScreen f4050b;

            {
                this.f4050b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsSuggestedExperiencesScreen.T;
                        return (f) ((m0) this.f4050b.Q.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsSuggestedExperiencesScreen.T;
                        TravelHotelsSuggestedExperiencesScreen travelHotelsSuggestedExperiencesScreen = this.f4050b;
                        return dli.f.a(travelHotelsSuggestedExperiencesScreen, travelHotelsSuggestedExperiencesScreen.d(), f0.f322471a, R$id.suggestedExperiences_recyclerView, null, travelHotelsSuggestedExperiencesScreen.N, null, 40);
                }
            }
        });
        this.S = w.y0(new Function0(this) { // from class: afg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsSuggestedExperiencesScreen f4050b;

            {
                this.f4050b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsSuggestedExperiencesScreen.T;
                        return (f) ((m0) this.f4050b.Q.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsSuggestedExperiencesScreen.T;
                        TravelHotelsSuggestedExperiencesScreen travelHotelsSuggestedExperiencesScreen = this.f4050b;
                        return dli.f.a(travelHotelsSuggestedExperiencesScreen, travelHotelsSuggestedExperiencesScreen.d(), f0.f322471a, R$id.suggestedExperiences_recyclerView, null, travelHotelsSuggestedExperiencesScreen.N, null, 40);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f22446b;
        Clause clause = uiState.f4055b;
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setTitle(clause, null);
        Clause clause2 = uiState.f4056c;
        navBarWithToolbar.setDescriptionText(clause2);
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
        d3().f22447c.setVisibility(uiState.d ? 0 : 4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m0) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView suggestedExperiencesRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(suggestedExperiencesRecyclerView, "suggestedExperiencesRecyclerView");
        y.k(suggestedExperiencesRecyclerView, this.N, 0, 14);
        d3().f22446b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        d3().f22447c.setText(new TextLocalisedClause(R$string.hotels_booking_details_suggested_experiences_button_discover_more_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22446b.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22447c.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53608c), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52226c), null, new af4.e(this, continuation, 3), 3);
    }

    public final x d3() {
        ViewBinding value = this.K.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f d() {
        return (f) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}
