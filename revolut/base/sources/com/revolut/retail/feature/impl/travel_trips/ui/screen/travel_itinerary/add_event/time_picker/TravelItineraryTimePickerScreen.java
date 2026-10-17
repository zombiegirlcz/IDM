package com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.time_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.TimePickerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.api.travel_trips.R$string;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.time_picker.TravelItineraryTimePickerContract$InputData;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.time_picker.TravelItineraryTimePickerScreen;
import dli.a;
import evj.b;
import evj.c;
import evj.d;
import evj.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import xuj.g;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/time_picker/TravelItineraryTimePickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Levj/b;", "Ldli/a;", "Levj/d;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelItineraryTimePickerScreen extends ViewController<b> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TravelItineraryTimePickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final TravelItineraryTimePickerContract$InputData K;
    public final h L;
    public final TimePickerDelegate M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public TravelItineraryTimePickerScreen(TravelItineraryTimePickerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, f.f);
        this.M = new TimePickerDelegate();
        this.N = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: evj.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelItineraryTimePickerScreen f129973b;

            {
                this.f129973b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelItineraryTimePickerScreen travelItineraryTimePickerScreen = this.f129973b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelItineraryTimePickerScreen.R;
                        TravelItineraryTimePickerScreen travelItineraryTimePickerScreen2 = this.f129973b;
                        return dli.f.a(travelItineraryTimePickerScreen2, (c) travelItineraryTimePickerScreen2.Q.getValue(), u.c(travelItineraryTimePickerScreen2.M), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelItineraryTimePickerScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(travelItineraryTimePickerScreen.m2()).a().get(xuj.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xuj.i.class, " is not found"));
                        }
                        xuj.i iVar = ((xuj.i) aVar2.b()).f309099m;
                        TravelItineraryTimePickerContract$InputData travelItineraryTimePickerContract$InputData = travelItineraryTimePickerScreen.K;
                        travelItineraryTimePickerContract$InputData.getClass();
                        return new xuj.g(iVar, travelItineraryTimePickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelItineraryTimePickerScreen.R;
                        return (c) ((xuj.g) travelItineraryTimePickerScreen.P.getValue()).f309089b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: evj.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelItineraryTimePickerScreen f129973b;

            {
                this.f129973b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelItineraryTimePickerScreen travelItineraryTimePickerScreen = this.f129973b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelItineraryTimePickerScreen.R;
                        TravelItineraryTimePickerScreen travelItineraryTimePickerScreen2 = this.f129973b;
                        return dli.f.a(travelItineraryTimePickerScreen2, (c) travelItineraryTimePickerScreen2.Q.getValue(), u.c(travelItineraryTimePickerScreen2.M), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelItineraryTimePickerScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(travelItineraryTimePickerScreen.m2()).a().get(xuj.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xuj.i.class, " is not found"));
                        }
                        xuj.i iVar = ((xuj.i) aVar2.b()).f309099m;
                        TravelItineraryTimePickerContract$InputData travelItineraryTimePickerContract$InputData = travelItineraryTimePickerScreen.K;
                        travelItineraryTimePickerContract$InputData.getClass();
                        return new xuj.g(iVar, travelItineraryTimePickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelItineraryTimePickerScreen.R;
                        return (c) ((xuj.g) travelItineraryTimePickerScreen.P.getValue()).f309089b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: evj.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelItineraryTimePickerScreen f129973b;

            {
                this.f129973b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelItineraryTimePickerScreen travelItineraryTimePickerScreen = this.f129973b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelItineraryTimePickerScreen.R;
                        TravelItineraryTimePickerScreen travelItineraryTimePickerScreen2 = this.f129973b;
                        return dli.f.a(travelItineraryTimePickerScreen2, (c) travelItineraryTimePickerScreen2.Q.getValue(), u.c(travelItineraryTimePickerScreen2.M), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelItineraryTimePickerScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(travelItineraryTimePickerScreen.m2()).a().get(xuj.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xuj.i.class, " is not found"));
                        }
                        xuj.i iVar = ((xuj.i) aVar2.b()).f309099m;
                        TravelItineraryTimePickerContract$InputData travelItineraryTimePickerContract$InputData = travelItineraryTimePickerScreen.K;
                        travelItineraryTimePickerContract$InputData.getClass();
                        return new xuj.g(iVar, travelItineraryTimePickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelItineraryTimePickerScreen.R;
                        return (c) ((xuj.g) travelItineraryTimePickerScreen.P.getValue()).f309089b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174546c.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.travel_trip_itinerary_add_event_time_picker_title, null, null, 14), null, null, null, false, 30));
        d3().f174545b.setText(new TextLocalisedClause(R$string.travel_trip_itinerary_add_event_time_picker_cta, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174545b.o), new ev7.b(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(this.M.p()), new enb.f(this, null, 29), 3);
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
        return (dli.c) this.O.getValue();
    }
}
