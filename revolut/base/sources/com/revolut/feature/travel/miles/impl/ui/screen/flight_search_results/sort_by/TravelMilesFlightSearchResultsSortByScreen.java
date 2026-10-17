package com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.sort_by;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.sort_by.TravelMilesFlightSearchResultsSortByScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.sort_by.TravelMilesFlightSearchResultsSortByScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import ufg.n;
import ufg.p;
import whg.c;
import whg.d;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_search_results/sort_by/TravelMilesFlightSearchResultsSortByScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lwhg/c;", "Lcli/k;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesFlightSearchResultsSortByScreen extends BaseBottomSheetRecyclerController<c, k> {
    public static final /* synthetic */ int V = 0;
    public final TravelMilesFlightSearchResultsSortByScreenContract$InputData Q;
    public final SingleChoiceDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public TravelMilesFlightSearchResultsSortByScreen(TravelMilesFlightSearchResultsSortByScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        SingleChoiceDelegate singleChoiceDelegate = new SingleChoiceDelegate();
        this.R = singleChoiceDelegate;
        this.S = u.c(singleChoiceDelegate);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: whg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightSearchResultsSortByScreen f297650b;

            {
                this.f297650b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelMilesFlightSearchResultsSortByScreen travelMilesFlightSearchResultsSortByScreen = this.f297650b;
                switch (i2) {
                    case 0:
                        int i3 = TravelMilesFlightSearchResultsSortByScreen.V;
                        qji.b bVarU2 = travelMilesFlightSearchResultsSortByScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.sort_by.di.TravelMilesFlightSearchResultsSortByScreenInjector");
                        n nVar = (n) bVarU2;
                        ufg.g gVar = nVar.f279770b;
                        n nVar2 = nVar.f279771c;
                        TravelMilesFlightSearchResultsSortByScreenContract$InputData travelMilesFlightSearchResultsSortByScreenContract$InputData = travelMilesFlightSearchResultsSortByScreen.Q;
                        travelMilesFlightSearchResultsSortByScreenContract$InputData.getClass();
                        return new p(gVar, nVar2, travelMilesFlightSearchResultsSortByScreenContract$InputData);
                    default:
                        int i5 = TravelMilesFlightSearchResultsSortByScreen.V;
                        return (d) ((p) travelMilesFlightSearchResultsSortByScreen.T.getValue()).f279782b.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: whg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightSearchResultsSortByScreen f297650b;

            {
                this.f297650b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelMilesFlightSearchResultsSortByScreen travelMilesFlightSearchResultsSortByScreen = this.f297650b;
                switch (i22) {
                    case 0:
                        int i3 = TravelMilesFlightSearchResultsSortByScreen.V;
                        qji.b bVarU2 = travelMilesFlightSearchResultsSortByScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.sort_by.di.TravelMilesFlightSearchResultsSortByScreenInjector");
                        n nVar = (n) bVarU2;
                        ufg.g gVar = nVar.f279770b;
                        n nVar2 = nVar.f279771c;
                        TravelMilesFlightSearchResultsSortByScreenContract$InputData travelMilesFlightSearchResultsSortByScreenContract$InputData = travelMilesFlightSearchResultsSortByScreen.Q;
                        travelMilesFlightSearchResultsSortByScreenContract$InputData.getClass();
                        return new p(gVar, nVar2, travelMilesFlightSearchResultsSortByScreenContract$InputData);
                    default:
                        int i5 = TravelMilesFlightSearchResultsSortByScreen.V;
                        return (d) ((p) travelMilesFlightSearchResultsSortByScreen.T.getValue()).f279782b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (d) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, rd0.e.b(this.R.p()), null, new whg.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (d) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
