package com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.edit_dates;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.api.travel_trips.R$string;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.edit_dates.TravelItineraryEditDatesScreen;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.edit_dates.TravelItineraryEditDatesScreenContract$InputData;
import dli.a;
import dli.c;
import jkc.g;
import jvj.b;
import jvj.d;
import jvj.e;
import jvj.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xuj.i;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/edit_dates/TravelItineraryEditDatesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljvj/d;", "Ldli/a;", "Ljvj/e;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelItineraryEditDatesScreen extends ViewController<d> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TravelItineraryEditDatesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final TravelItineraryEditDatesScreenContract$InputData K;
    public final h L;
    public final DatePickerDelegate M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public TravelItineraryEditDatesScreen(TravelItineraryEditDatesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new DatePickerDelegate();
        this.N = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: jvj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelItineraryEditDatesScreen f178887b;

            {
                this.f178887b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelItineraryEditDatesScreen travelItineraryEditDatesScreen = this.f178887b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelItineraryEditDatesScreen.R;
                        TravelItineraryEditDatesScreen travelItineraryEditDatesScreen2 = this.f178887b;
                        return dli.f.a(travelItineraryEditDatesScreen2, (f) travelItineraryEditDatesScreen2.Q.getValue(), u.c(travelItineraryEditDatesScreen2.M), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelItineraryEditDatesScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(travelItineraryEditDatesScreen.m2()).a().get(i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f309099m;
                        TravelItineraryEditDatesScreenContract$InputData travelItineraryEditDatesScreenContract$InputData = travelItineraryEditDatesScreen.K;
                        travelItineraryEditDatesScreenContract$InputData.getClass();
                        return new xuj.d(iVar, travelItineraryEditDatesScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelItineraryEditDatesScreen.R;
                        return (f) ((xuj.d) travelItineraryEditDatesScreen.P.getValue()).f309082b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: jvj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelItineraryEditDatesScreen f178887b;

            {
                this.f178887b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelItineraryEditDatesScreen travelItineraryEditDatesScreen = this.f178887b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelItineraryEditDatesScreen.R;
                        TravelItineraryEditDatesScreen travelItineraryEditDatesScreen2 = this.f178887b;
                        return dli.f.a(travelItineraryEditDatesScreen2, (f) travelItineraryEditDatesScreen2.Q.getValue(), u.c(travelItineraryEditDatesScreen2.M), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelItineraryEditDatesScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(travelItineraryEditDatesScreen.m2()).a().get(i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f309099m;
                        TravelItineraryEditDatesScreenContract$InputData travelItineraryEditDatesScreenContract$InputData = travelItineraryEditDatesScreen.K;
                        travelItineraryEditDatesScreenContract$InputData.getClass();
                        return new xuj.d(iVar, travelItineraryEditDatesScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelItineraryEditDatesScreen.R;
                        return (f) ((xuj.d) travelItineraryEditDatesScreen.P.getValue()).f309082b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: jvj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelItineraryEditDatesScreen f178887b;

            {
                this.f178887b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelItineraryEditDatesScreen travelItineraryEditDatesScreen = this.f178887b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelItineraryEditDatesScreen.R;
                        TravelItineraryEditDatesScreen travelItineraryEditDatesScreen2 = this.f178887b;
                        return dli.f.a(travelItineraryEditDatesScreen2, (f) travelItineraryEditDatesScreen2.Q.getValue(), u.c(travelItineraryEditDatesScreen2.M), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelItineraryEditDatesScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(travelItineraryEditDatesScreen.m2()).a().get(i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f309099m;
                        TravelItineraryEditDatesScreenContract$InputData travelItineraryEditDatesScreenContract$InputData = travelItineraryEditDatesScreen.K;
                        travelItineraryEditDatesScreenContract$InputData.getClass();
                        return new xuj.d(iVar, travelItineraryEditDatesScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelItineraryEditDatesScreen.R;
                        return (f) ((xuj.d) travelItineraryEditDatesScreen.P.getValue()).f309082b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174546c.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.travel_trip_itinerary_edit_dates_title, null, null, 14), uiState.f178894b, null, null, false, 28));
        d3().f174545b.setEnabled(uiState.f178895c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (xuj.d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174545b.setText(new TextLocalisedClause(R$string.travel_trip_itinerary_edit_dates_cta, null, null, 14));
        d3().f174545b.setLoadingButtonTag("edit_dates_continue_button");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.M.f52176c.f121375b), new jv.o(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(d3().f174545b.o), new g(this, null, 22), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF0() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
