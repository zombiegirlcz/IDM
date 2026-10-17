package com.revolut.feature.travel.flights.impl.ui.screen.price_breakdown;

import aii.q;
import android.util.TypedValue;
import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.flights.impl.ui.screen.price_breakdown.TravelFlightsPriceBreakdownScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.price_breakdown.TravelFlightsPriceBreakdownScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import f4g.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import uwe.f;
import v6g.c;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/price_breakdown/TravelFlightsPriceBreakdownScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lv6g/c;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsPriceBreakdownScreen extends BaseBottomSheetRecyclerController<q, c> {
    public static final /* synthetic */ int V = 0;
    public final TravelFlightsPriceBreakdownScreenContract$InputData Q;
    public final CellDetailsDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public TravelFlightsPriceBreakdownScreen(TravelFlightsPriceBreakdownScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.R = cellDetailsDelegate;
        this.S = u.c(cellDetailsDelegate);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: v6g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsPriceBreakdownScreen f286386b;

            {
                this.f286386b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelFlightsPriceBreakdownScreen travelFlightsPriceBreakdownScreen = this.f286386b;
                switch (i2) {
                    case 0:
                        int i3 = TravelFlightsPriceBreakdownScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsPriceBreakdownScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsPriceBreakdownScreenContract$InputData travelFlightsPriceBreakdownScreenContract$InputData = travelFlightsPriceBreakdownScreen.Q;
                        travelFlightsPriceBreakdownScreenContract$InputData.getClass();
                        return new y(bVar, travelFlightsPriceBreakdownScreenContract$InputData);
                    default:
                        int i5 = TravelFlightsPriceBreakdownScreen.V;
                        return (e) ((y) travelFlightsPriceBreakdownScreen.T.getValue()).f132220b.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: v6g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsPriceBreakdownScreen f286386b;

            {
                this.f286386b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelFlightsPriceBreakdownScreen travelFlightsPriceBreakdownScreen = this.f286386b;
                switch (i22) {
                    case 0:
                        int i3 = TravelFlightsPriceBreakdownScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsPriceBreakdownScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsPriceBreakdownScreenContract$InputData travelFlightsPriceBreakdownScreenContract$InputData = travelFlightsPriceBreakdownScreen.Q;
                        travelFlightsPriceBreakdownScreenContract$InputData.getClass();
                        return new y(bVar, travelFlightsPriceBreakdownScreenContract$InputData);
                    default:
                        int i5 = TravelFlightsPriceBreakdownScreen.V;
                        return (e) ((y) travelFlightsPriceBreakdownScreen.T.getValue()).f132220b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (v6g.e) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        int i = R$attr.uikit_colorElevatedGroupedBackground;
        TypedValue typedValue = new TypedValue();
        view.getContext().getTheme().resolveAttribute(i, typedValue, true);
        view.setBackgroundColor(typedValue.data);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new f(this, null, 9), 3);
        ViewController.P2(this, rd0.e.b(this.R.f), new v6g.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (v6g.e) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.S;
    }
}
