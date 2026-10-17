package com.revolut.feature.travel.flights.impl.ui.screen.checkin_details;

import aii.q;
import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TitleDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.ui.screen.checkin_details.TravelFlightsCheckInDetailsScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.checkin_details.TravelFlightsCheckInDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import f4g.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import o5g.b;
import o5g.c;
import o5g.d;
import o5g.f;
import o5g.g;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/checkin_details/TravelFlightsCheckInDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lo5g/g;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsCheckInDetailsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TravelFlightsCheckInDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final TravelFlightsCheckInDetailsScreenContract$InputData K;
    public final h L;
    public final RowDelegate M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public TravelFlightsCheckInDetailsScreen(TravelFlightsCheckInDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: o5g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsCheckInDetailsScreen f222428b;

            {
                this.f222428b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelFlightsCheckInDetailsScreen travelFlightsCheckInDetailsScreen = this.f222428b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsCheckInDetailsScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsCheckInDetailsScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsCheckInDetailsScreenContract$InputData travelFlightsCheckInDetailsScreenContract$InputData = travelFlightsCheckInDetailsScreen.K;
                        travelFlightsCheckInDetailsScreenContract$InputData.getClass();
                        return new f4g.j(bVar, travelFlightsCheckInDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsCheckInDetailsScreen.R;
                        return (f) ((f4g.j) travelFlightsCheckInDetailsScreen.O.getValue()).f132131b.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsCheckInDetailsScreen.R;
                        TravelFlightsCheckInDetailsScreen travelFlightsCheckInDetailsScreen2 = this.f222428b;
                        return dli.f.a(travelFlightsCheckInDetailsScreen2, (f) travelFlightsCheckInDetailsScreen2.P.getValue(), v.k(new IconDelegate(), new TitleDelegate(), travelFlightsCheckInDetailsScreen2.M), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: o5g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsCheckInDetailsScreen f222428b;

            {
                this.f222428b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelFlightsCheckInDetailsScreen travelFlightsCheckInDetailsScreen = this.f222428b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsCheckInDetailsScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsCheckInDetailsScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsCheckInDetailsScreenContract$InputData travelFlightsCheckInDetailsScreenContract$InputData = travelFlightsCheckInDetailsScreen.K;
                        travelFlightsCheckInDetailsScreenContract$InputData.getClass();
                        return new f4g.j(bVar, travelFlightsCheckInDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsCheckInDetailsScreen.R;
                        return (f) ((f4g.j) travelFlightsCheckInDetailsScreen.O.getValue()).f132131b.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsCheckInDetailsScreen.R;
                        TravelFlightsCheckInDetailsScreen travelFlightsCheckInDetailsScreen2 = this.f222428b;
                        return dli.f.a(travelFlightsCheckInDetailsScreen2, (f) travelFlightsCheckInDetailsScreen2.P.getValue(), v.k(new IconDelegate(), new TitleDelegate(), travelFlightsCheckInDetailsScreen2.M), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: o5g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsCheckInDetailsScreen f222428b;

            {
                this.f222428b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelFlightsCheckInDetailsScreen travelFlightsCheckInDetailsScreen = this.f222428b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsCheckInDetailsScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsCheckInDetailsScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsCheckInDetailsScreenContract$InputData travelFlightsCheckInDetailsScreenContract$InputData = travelFlightsCheckInDetailsScreen.K;
                        travelFlightsCheckInDetailsScreenContract$InputData.getClass();
                        return new f4g.j(bVar, travelFlightsCheckInDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsCheckInDetailsScreen.R;
                        return (f) ((f4g.j) travelFlightsCheckInDetailsScreen.O.getValue()).f132131b.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsCheckInDetailsScreen.R;
                        TravelFlightsCheckInDetailsScreen travelFlightsCheckInDetailsScreen2 = this.f222428b;
                        return dli.f.a(travelFlightsCheckInDetailsScreen2, (f) travelFlightsCheckInDetailsScreen2.P.getValue(), v.k(new IconDelegate(), new TitleDelegate(), travelFlightsCheckInDetailsScreen2.M), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        LargeActionButton navBarBottomSheetButton = d3().f174545b;
        Intrinsics.checkNotNullExpressionValue(navBarBottomSheetButton, "navBarBottomSheetButton");
        navBarBottomSheetButton.setVisibility(uiState.f222433b ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.O.getValue();
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
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackgroundColor(kli.a.s(R$attr.uikit_colorElevatedGroupedBackground, context));
        d3().f174546c.setHeaderModel(null);
        ScreenContentRecyclerView navBarBottomSheetRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(navBarBottomSheetRecyclerView, "navBarBottomSheetRecyclerView");
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        navBarBottomSheetRecyclerView.setPaddingRelative(navBarBottomSheetRecyclerView.getPaddingStart(), kli.a.w(R$attr.uikit_dp16, context2), navBarBottomSheetRecyclerView.getPaddingEnd(), navBarBottomSheetRecyclerView.getPaddingBottom());
        d3().f174545b.o(LargeActionButton.ButtonStyle.d);
        d3().f174545b.setText(new TextLocalisedClause(R$string.travel_flights_booking_details_check_in_segment_details_go_to_airline_website, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        RowDelegate rowDelegate = this.M;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.k), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174545b.o), new nuh.j(this, null, 18), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
