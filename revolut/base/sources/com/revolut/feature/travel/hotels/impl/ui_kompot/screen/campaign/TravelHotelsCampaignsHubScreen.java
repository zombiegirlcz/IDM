package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.f0;
import aw0.d0;
import c9g.g;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardLoadingDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.TravelHotelsCampaignsHubScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import obg.c;
import obg.d;
import obg.i;
import obg.j;
import obg.k;
import obg.l;
import obg.m;
import obg.n;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.t3;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/campaign/TravelHotelsCampaignsHubScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lobg/i;", "Ldli/a;", "Lobg/o;", "Companion", "a", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsCampaignsHubScreen extends ViewController<i> implements dli.a {
    public final SmallCardDelegate K;
    public final SmallCardLoadingDelegate L;
    public final FullScreenStateDelegate M;
    public final int N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TravelHotelsCampaignsHubScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsCampaignsHubBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.TravelHotelsCampaignsHubScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public TravelHotelsCampaignsHubScreen(TravelHotelsCampaignsHubScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        SmallCardDelegate.INSTANCE.getClass();
        d0 d0Var = SmallCardDelegate.f53351j;
        this.K = new SmallCardDelegate(d0Var);
        this.L = new SmallCardLoadingDelegate(d0Var);
        this.M = new FullScreenStateDelegate();
        this.N = R$layout.screen_travel_hotels_campaigns_hub;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: obg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsCampaignsHubScreen f223938b;

            {
                this.f223938b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TravelHotelsCampaignsHubScreen.Companion companion = TravelHotelsCampaignsHubScreen.INSTANCE;
                        TravelHotelsCampaignsHubScreen travelHotelsCampaignsHubScreen = this.f223938b;
                        k kVar = (k) travelHotelsCampaignsHubScreen.R.getValue();
                        FullScreenStateDelegate fullScreenStateDelegate = travelHotelsCampaignsHubScreen.M;
                        SmallCardDelegate smallCardDelegate = travelHotelsCampaignsHubScreen.K;
                        SmallCardLoadingDelegate smallCardLoadingDelegate = travelHotelsCampaignsHubScreen.L;
                        return dli.f.a(travelHotelsCampaignsHubScreen, kVar, v.k(fullScreenStateDelegate, smallCardDelegate, smallCardLoadingDelegate, new GridBoxDelegate(v.k(smallCardDelegate, smallCardLoadingDelegate), 8.0f, 8.0f, 2)), R$id.travelHotelsCampaignsHubScreen_recyclerView, null, null, null, 56);
                    default:
                        TravelHotelsCampaignsHubScreen.Companion companion2 = TravelHotelsCampaignsHubScreen.INSTANCE;
                        return (k) ((g9g.j) this.f223938b.Q.getValue()).f141703c.get();
                }
            }
        });
        this.P = s.t(this, c.f);
        this.Q = w.y0(new oa2.b(this, inputData, 3));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: obg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsCampaignsHubScreen f223938b;

            {
                this.f223938b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TravelHotelsCampaignsHubScreen.Companion companion = TravelHotelsCampaignsHubScreen.INSTANCE;
                        TravelHotelsCampaignsHubScreen travelHotelsCampaignsHubScreen = this.f223938b;
                        k kVar = (k) travelHotelsCampaignsHubScreen.R.getValue();
                        FullScreenStateDelegate fullScreenStateDelegate = travelHotelsCampaignsHubScreen.M;
                        SmallCardDelegate smallCardDelegate = travelHotelsCampaignsHubScreen.K;
                        SmallCardLoadingDelegate smallCardLoadingDelegate = travelHotelsCampaignsHubScreen.L;
                        return dli.f.a(travelHotelsCampaignsHubScreen, kVar, v.k(fullScreenStateDelegate, smallCardDelegate, smallCardLoadingDelegate, new GridBoxDelegate(v.k(smallCardDelegate, smallCardLoadingDelegate), 8.0f, 8.0f, 2)), R$id.travelHotelsCampaignsHubScreen_recyclerView, null, null, null, 56);
                    default:
                        TravelHotelsCampaignsHubScreen.Companion companion2 = TravelHotelsCampaignsHubScreen.INSTANCE;
                        return (k) ((g9g.j) this.f223938b.Q.getValue()).f141703c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        obg.o uiState = (obg.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        j jVar = qVar instanceof j ? (j) qVar : null;
        if (pd.b.k(jVar != null ? Boolean.valueOf(jVar.f223944a) : null)) {
            n nVar = uiState.f223950b;
            if (nVar instanceof m) {
                NavBarWithToolbar travelHotelsCampaignsHubScreenNavBar = d3().f22396b;
                Intrinsics.checkNotNullExpressionValue(travelHotelsCampaignsHubScreenNavBar, "travelHotelsCampaignsHubScreenNavBar");
                t3 t3Var = t3.DEFAULT;
                NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
                travelHotelsCampaignsHubScreenNavBar.I0(t3Var, false);
                return;
            }
            if (!(nVar instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            d3().f22396b.l0();
            NavBarWithToolbar navBarWithToolbar = d3().f22396b;
            l lVar = (l) nVar;
            TextClause textClause = lVar.f223945a;
            navBarWithToolbar.setTitle(textClause, null);
            navBarWithToolbar.setToolbarTitle(textClause);
            navBarWithToolbar.setDescriptionVisible(true);
            f0.t(navBarWithToolbar, lVar.f223947c, false, 6);
            navBarWithToolbar.setDescriptionText(lVar.f223946b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g9g.j) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (k) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f22396b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22396b.f59410q), null, new nuh.j(this, null, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.K.d), null, new obg.e(this, null), 3);
    }

    public final g d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (g) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
