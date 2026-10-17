package com.revolut.feature.travel.experiences.impl.ui.screen.bookings;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import boh.f;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.feature.travel.experiences.impl.ui.screen.bookings.TravelExperiencesBookingsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import grl.k9;
import knm.b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import ot1.p;
import ox5.r;
import p1g.c;
import p1g.d;
import p1g.g;
import p1g.i;
import p1g.j;
import te0.w;
import vc.s;
import xki.e;
import z0g.x;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/bookings/TravelExperiencesBookingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lp1g/g;", "Ldli/a;", "Lp1g/j;", "Lno/m;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesBookingsScreen extends ViewController<g> implements a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TravelExperiencesBookingsScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenExperiencesHomeBookingListBinding;", 0))};
    public final AnalyticsProduct.Retail K;
    public final FullScreenStateDelegate L;
    public final ListingTileDelegate M;
    public final CellDetailsChevronDelegate N;
    public final int O;
    public final int P;
    public final Object Q;
    public final h R;
    public final Object S;
    public final Object T;

    public TravelExperiencesBookingsScreen() {
        this(0);
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getL() {
        return Integer.valueOf(this.P);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        boolean z = uiState.f231927b;
        if ((qVar instanceof p1g.h ? (p1g.h) qVar : null) == null || ((p1g.h) qVar).f231925a) {
            NavBarWithToolbar experiencesHomeBookingListNavBar = d3().f293713b;
            Intrinsics.checkNotNullExpressionValue(experiencesHomeBookingListNavBar, "experiencesHomeBookingListNavBar");
            experiencesHomeBookingListNavBar.setVisibility(z ? 0 : 8);
            if (z) {
                NavBarWithToolbar navBarWithToolbar = d3().f293713b;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.experiences_home_title, null, null, 14);
                navBarWithToolbar.setTitle(textLocalisedClause, null);
                navBarWithToolbar.setToolbarTitle(textLocalisedClause);
                navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
            }
        }
        ScreenContentRecyclerView experiencesHomeBookingListRecyclerView = d3().f293714c;
        Intrinsics.checkNotNullExpressionValue(experiencesHomeBookingListRecyclerView, "experiencesHomeBookingListRecyclerView");
        Context context = D2().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        b.v(f.p(context), experiencesHomeBookingListRecyclerView);
        d3().f293714c.setClipToPadding(false);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52371h.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52751c), null, new r(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f51821c), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f293713b.f59410q), null, new p0l.d(this, continuation, 2), 3);
    }

    public final w0g.j d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w0g.j) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    public /* synthetic */ TravelExperiencesBookingsScreen(int i) {
        this(new TravelExperiencesBookingsScreenContract$InputData(false));
    }

    public TravelExperiencesBookingsScreen(TravelExperiencesBookingsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137510y;
        this.K = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.L = new FullScreenStateDelegate();
        this.M = new ListingTileDelegate();
        this.N = new CellDetailsChevronDelegate();
        this.O = R$layout.screen_experiences_home_booking_list;
        this.P = R$style.TransparentNavigationBarMarkerTheme;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: p1g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesBookingsScreen f231918b;

            {
                this.f231918b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesBookingsScreen.U;
                        TravelExperiencesBookingsScreen travelExperiencesBookingsScreen = this.f231918b;
                        return dli.f.a(travelExperiencesBookingsScreen, travelExperiencesBookingsScreen.R2(), v.k(travelExperiencesBookingsScreen.L, travelExperiencesBookingsScreen.M, travelExperiencesBookingsScreen.N, new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new ListingTileLoadingDelegate(), new TextDelegate()), R$id.experiencesHomeBookingList_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelExperiencesBookingsScreen.U;
                        x xVar = (x) this.f231918b.S.getValue();
                        switch (xVar.f318466a) {
                            case 0:
                                return (i) xVar.f.get();
                            default:
                                return (i) xVar.f.get();
                        }
                }
            }
        });
        this.R = s.t(this, p1g.b.f);
        this.S = w.y0(new p(this, inputData, 13));
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: p1g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesBookingsScreen f231918b;

            {
                this.f231918b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesBookingsScreen.U;
                        TravelExperiencesBookingsScreen travelExperiencesBookingsScreen = this.f231918b;
                        return dli.f.a(travelExperiencesBookingsScreen, travelExperiencesBookingsScreen.R2(), v.k(travelExperiencesBookingsScreen.L, travelExperiencesBookingsScreen.M, travelExperiencesBookingsScreen.N, new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new ListingTileLoadingDelegate(), new TextDelegate()), R$id.experiencesHomeBookingList_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelExperiencesBookingsScreen.U;
                        x xVar = (x) this.f231918b.S.getValue();
                        switch (xVar.f318466a) {
                            case 0:
                                return (i) xVar.f.get();
                            default:
                                return (i) xVar.f.get();
                        }
                }
            }
        });
    }
}
