package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c9g.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import e58.d;
import ec8.c;
import edg.b;
import edg.e;
import g9g.b1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/price_breakdown/TravelHotelsPriceBreakdownScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ledg/e;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsPriceBreakdownScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TravelHotelsPriceBreakdownScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsPriceBreakdownBinding;", 0))};
    public final int K;
    public final CellDetailsDelegate L;
    public final TextDelegate M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public TravelHotelsPriceBreakdownScreen(TravelHotelsPriceBreakdownScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_hotels_price_breakdown;
        this.L = new CellDetailsDelegate();
        this.M = new TextDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: edg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsPriceBreakdownScreen f125020b;

            {
                this.f125020b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsPriceBreakdownScreen.R;
                        TravelHotelsPriceBreakdownScreen travelHotelsPriceBreakdownScreen = this.f125020b;
                        return dli.f.a(travelHotelsPriceBreakdownScreen, (d) travelHotelsPriceBreakdownScreen.Q.getValue(), v.k(new CellDetailsBadgeDelegate(), travelHotelsPriceBreakdownScreen.M, travelHotelsPriceBreakdownScreen.L), R$id.travelHotelsPriceBreakdown_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsPriceBreakdownScreen.R;
                        b1 b1Var = (b1) this.f125020b.P.getValue();
                        switch (b1Var.f141601a) {
                            case 0:
                                return (d) b1Var.d.get();
                            case 1:
                                return (d) b1Var.d.get();
                            default:
                                return (d) b1Var.d.get();
                        }
                }
            }
        });
        this.O = s.t(this, b.f);
        this.P = w.y0(new d(this, inputData, 13));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: edg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsPriceBreakdownScreen f125020b;

            {
                this.f125020b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsPriceBreakdownScreen.R;
                        TravelHotelsPriceBreakdownScreen travelHotelsPriceBreakdownScreen = this.f125020b;
                        return dli.f.a(travelHotelsPriceBreakdownScreen, (d) travelHotelsPriceBreakdownScreen.Q.getValue(), v.k(new CellDetailsBadgeDelegate(), travelHotelsPriceBreakdownScreen.M, travelHotelsPriceBreakdownScreen.L), R$id.travelHotelsPriceBreakdown_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsPriceBreakdownScreen.R;
                        b1 b1Var = (b1) this.f125020b.P.getValue();
                        switch (b1Var.f141601a) {
                            case 0:
                                return (d) b1Var.d.get();
                            case 1:
                                return (d) b1Var.d.get();
                            default:
                                return (d) b1Var.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b1) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (edg.d) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((n) value).f22414b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_price_breakdown_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((n) value).f22414b.f59410q), null, new c(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.M.d), new ea4.d(this, continuation, 8), 3);
        ViewController.P2(this, rd0.e.b(this.L.d), new edg.c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
