package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.amenities;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.amenities.TravelHotelsPropertyAmenitiesScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import g9g.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ldg.b;
import ldg.c;
import ldg.e;
import ldg.f;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/property/amenities/TravelHotelsPropertyAmenitiesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lldg/e;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsPropertyAmenitiesScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TravelHotelsPropertyAmenitiesScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsPropertyAmenitiesBinding;", 0))};
    public final int K;
    public final FullScreenStateDelegate L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;

    public TravelHotelsPropertyAmenitiesScreen(TravelHotelsPropertyAmenitiesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_hotels_property_amenities;
        this.L = new FullScreenStateDelegate();
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ldg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsPropertyAmenitiesScreen f194099b;

            {
                this.f194099b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsPropertyAmenitiesScreen.Q;
                        TravelHotelsPropertyAmenitiesScreen travelHotelsPropertyAmenitiesScreen = this.f194099b;
                        return dli.f.a(travelHotelsPropertyAmenitiesScreen, (f) travelHotelsPropertyAmenitiesScreen.P.getValue(), v.k(new ListCellDelegate(), new RowLoadingDelegate(), travelHotelsPropertyAmenitiesScreen.L), R$id.travelHotelsPropertyAmenities_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsPropertyAmenitiesScreen.Q;
                        return (f) ((x) this.f194099b.O.getValue()).f141844b.get();
                }
            }
        });
        this.N = s.t(this, b.f);
        this.O = w.y0(new kpl.b(this, inputData, 28));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ldg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsPropertyAmenitiesScreen f194099b;

            {
                this.f194099b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsPropertyAmenitiesScreen.Q;
                        TravelHotelsPropertyAmenitiesScreen travelHotelsPropertyAmenitiesScreen = this.f194099b;
                        return dli.f.a(travelHotelsPropertyAmenitiesScreen, (f) travelHotelsPropertyAmenitiesScreen.P.getValue(), v.k(new ListCellDelegate(), new RowLoadingDelegate(), travelHotelsPropertyAmenitiesScreen.L), R$id.travelHotelsPropertyAmenities_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsPropertyAmenitiesScreen.Q;
                        return (f) ((x) this.f194099b.O.getValue()).f141844b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((c9g.o) value).f22416b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_property_amenities_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((c9g.o) value).f22416b.f59410q), null, new la8.h(this, null, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52371h.f121375b), null, new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
