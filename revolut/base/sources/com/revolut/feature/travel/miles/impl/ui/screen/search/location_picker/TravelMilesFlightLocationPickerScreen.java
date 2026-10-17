package com.revolut.feature.travel.miles.impl.ui.screen.search.location_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import cli.o;
import cli.q;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.feature.travel.miles.impl.R$layout;
import com.revolut.feature.travel.miles.impl.ui.screen.search.location_picker.TravelMilesFlightLocationPickerScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.search.location_picker.TravelMilesFlightLocationPickerScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import le8.d;
import lfg.d0;
import lig.b;
import lig.c;
import lig.f;
import lig.k;
import lig.l;
import lig.m;
import lig.n;
import te0.w;
import ufg.i;
import vc.s;
import xki.e;
import yp0.v;
import yp0.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/search/location_picker/TravelMilesFlightLocationPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llig/k;", "Ldli/a;", "Llig/n;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesFlightLocationPickerScreen extends ViewController<k> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TravelMilesFlightLocationPickerScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/miles/impl/databinding/ScreenTravelMilesFlightLocationPickerBinding;", 0))};
    public final TravelMilesFlightLocationPickerScreenContract$InputData K;
    public final int L;
    public final RowDelegate M;
    public final FullScreenStateDelegate N;
    public v O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final Object S;

    public TravelMilesFlightLocationPickerScreen(TravelMilesFlightLocationPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_travel_miles_flight_location_picker;
        this.M = new RowDelegate(null, null, 7);
        this.N = new FullScreenStateDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: lig.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightLocationPickerScreen f195505b;

            {
                this.f195505b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelMilesFlightLocationPickerScreen travelMilesFlightLocationPickerScreen = this.f195505b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesFlightLocationPickerScreen.T;
                        TravelMilesFlightLocationPickerScreen travelMilesFlightLocationPickerScreen2 = this.f195505b;
                        return dli.f.a(travelMilesFlightLocationPickerScreen2, travelMilesFlightLocationPickerScreen2.d(), zhm.v.k(travelMilesFlightLocationPickerScreen2.M, travelMilesFlightLocationPickerScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.travelMilesFlightLocationPickerScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesFlightLocationPickerScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(travelMilesFlightLocationPickerScreen.m2()).a().get(ffg.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ffg.a.class, " is not found"));
                        }
                        ufg.g gVar = ((ufg.g) aVar2.b()).A;
                        TravelMilesFlightLocationPickerScreenContract$InputData travelMilesFlightLocationPickerScreenContract$InputData = travelMilesFlightLocationPickerScreen.K;
                        travelMilesFlightLocationPickerScreenContract$InputData.getClass();
                        return new ufg.i(gVar, travelMilesFlightLocationPickerScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesFlightLocationPickerScreen.T;
                        return (l) ((ufg.i) travelMilesFlightLocationPickerScreen.R.getValue()).f279743c.get();
                }
            }
        });
        this.Q = s.t(this, c.f);
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: lig.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightLocationPickerScreen f195505b;

            {
                this.f195505b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelMilesFlightLocationPickerScreen travelMilesFlightLocationPickerScreen = this.f195505b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesFlightLocationPickerScreen.T;
                        TravelMilesFlightLocationPickerScreen travelMilesFlightLocationPickerScreen2 = this.f195505b;
                        return dli.f.a(travelMilesFlightLocationPickerScreen2, travelMilesFlightLocationPickerScreen2.d(), zhm.v.k(travelMilesFlightLocationPickerScreen2.M, travelMilesFlightLocationPickerScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.travelMilesFlightLocationPickerScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesFlightLocationPickerScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(travelMilesFlightLocationPickerScreen.m2()).a().get(ffg.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ffg.a.class, " is not found"));
                        }
                        ufg.g gVar = ((ufg.g) aVar2.b()).A;
                        TravelMilesFlightLocationPickerScreenContract$InputData travelMilesFlightLocationPickerScreenContract$InputData = travelMilesFlightLocationPickerScreen.K;
                        travelMilesFlightLocationPickerScreenContract$InputData.getClass();
                        return new ufg.i(gVar, travelMilesFlightLocationPickerScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesFlightLocationPickerScreen.T;
                        return (l) ((ufg.i) travelMilesFlightLocationPickerScreen.R.getValue()).f279743c.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: lig.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightLocationPickerScreen f195505b;

            {
                this.f195505b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelMilesFlightLocationPickerScreen travelMilesFlightLocationPickerScreen = this.f195505b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesFlightLocationPickerScreen.T;
                        TravelMilesFlightLocationPickerScreen travelMilesFlightLocationPickerScreen2 = this.f195505b;
                        return dli.f.a(travelMilesFlightLocationPickerScreen2, travelMilesFlightLocationPickerScreen2.d(), zhm.v.k(travelMilesFlightLocationPickerScreen2.M, travelMilesFlightLocationPickerScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.travelMilesFlightLocationPickerScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesFlightLocationPickerScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(travelMilesFlightLocationPickerScreen.m2()).a().get(ffg.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ffg.a.class, " is not found"));
                        }
                        ufg.g gVar = ((ufg.g) aVar2.b()).A;
                        TravelMilesFlightLocationPickerScreenContract$InputData travelMilesFlightLocationPickerScreenContract$InputData = travelMilesFlightLocationPickerScreen.K;
                        travelMilesFlightLocationPickerScreenContract$InputData.getClass();
                        return new ufg.i(gVar, travelMilesFlightLocationPickerScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesFlightLocationPickerScreen.T;
                        return (l) ((ufg.i) travelMilesFlightLocationPickerScreen.R.getValue()).f279743c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        if (!(qVar instanceof m)) {
            if (uiState.f195519c != null) {
                d3().f253802b.setHint(uiState.f195519c);
            }
            d3().f253802b.setSearchInput(uiState.f195518b);
            return;
        }
        m mVar = (m) qVar;
        if (mVar.f195515a) {
            d3().f253802b.setSearchInput(uiState.f195518b);
        }
        if (!mVar.f195516b || uiState.f195519c == null) {
            return;
        }
        d3().f253802b.setHint(uiState.f195519c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f253802b;
        int i2 = b.f195506a[this.K.f94381a.ordinal()];
        if (i2 == 1) {
            i = R$string.miles_flight_origin_location_picker;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.miles_flight_destination_location_picker;
        }
        navBarWithToolbar.setTitle(new TextLocalisedClause(i, null, null, 14), null);
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.j0(false);
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        navBarWithToolbar.E0();
        kli.c.d(navBarWithToolbar, 300L);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ScreenContentRecyclerView screenContentRecyclerView = d3().f253803c;
        v vVar = this.O;
        if (vVar != null) {
            screenContentRecyclerView.removeOnScrollListener(vVar);
        } else {
            Intrinsics.r("scrollListener");
            throw null;
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253802b.f59409p.f57336l), null, new la8.h(this, null, 14), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.q(new d0(t1.d(rd0.e.b(d3().f253802b.f59409p.f57337m), 300L), 2)), null, new d(this, (Continuation) null, 9), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new lig.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52371h.f121375b), null, new f(this, null), 3);
        ScreenContentRecyclerView travelMilesFlightLocationPickerScreenRecyclerView = d3().f253803c;
        Intrinsics.checkNotNullExpressionValue(travelMilesFlightLocationPickerScreenRecyclerView, "travelMilesFlightLocationPickerScreenRecyclerView");
        this.O = y.a(travelMilesFlightLocationPickerScreenRecyclerView, 10, false, new laj.b(this, 26));
    }

    public final rfg.k d3() {
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rfg.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
