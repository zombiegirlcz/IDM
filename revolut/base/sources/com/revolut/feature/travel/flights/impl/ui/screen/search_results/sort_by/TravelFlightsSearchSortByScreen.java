package com.revolut.feature.travel.flights.impl.ui.screen.search_results.sort_by;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.search_results.sort_by.TravelFlightsSearchSortByScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import d7g.c;
import d7g.d;
import f4g.v0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/sort_by/TravelFlightsSearchSortByScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Ld7g/c;", "Lcli/k;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsSearchSortByScreen extends BaseBottomSheetRecyclerController<c, k> {
    public static final /* synthetic */ int V = 0;
    public final TravelFlightsSearchSortByScreenContract$InputData Q;
    public final SingleChoiceDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public TravelFlightsSearchSortByScreen(TravelFlightsSearchSortByScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        SingleChoiceDelegate singleChoiceDelegate = new SingleChoiceDelegate();
        this.R = singleChoiceDelegate;
        this.S = u.c(singleChoiceDelegate);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: d7g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsSearchSortByScreen f111961b;

            {
                this.f111961b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelFlightsSearchSortByScreen travelFlightsSearchSortByScreen = this.f111961b;
                switch (i2) {
                    case 0:
                        int i3 = TravelFlightsSearchSortByScreen.V;
                        qji.b bVarU2 = travelFlightsSearchSortByScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.search_results.sort_by.di.TravelFlightsSearchSortByScreenInjector");
                        return (v0) ((e7g.a) ((e7g.b) bVarU2).y().mo3808a(travelFlightsSearchSortByScreen)).s(travelFlightsSearchSortByScreen.Q).mo3783build();
                    default:
                        int i5 = TravelFlightsSearchSortByScreen.V;
                        v0 v0Var = (v0) travelFlightsSearchSortByScreen.T.getValue();
                        switch (v0Var.f132207a) {
                            case 0:
                                return (d) v0Var.f132209c.get();
                            case 1:
                                return (d) v0Var.f132209c.get();
                            default:
                                return (d) v0Var.f132209c.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: d7g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsSearchSortByScreen f111961b;

            {
                this.f111961b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelFlightsSearchSortByScreen travelFlightsSearchSortByScreen = this.f111961b;
                switch (i22) {
                    case 0:
                        int i3 = TravelFlightsSearchSortByScreen.V;
                        qji.b bVarU2 = travelFlightsSearchSortByScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.search_results.sort_by.di.TravelFlightsSearchSortByScreenInjector");
                        return (v0) ((e7g.a) ((e7g.b) bVarU2).y().mo3808a(travelFlightsSearchSortByScreen)).s(travelFlightsSearchSortByScreen.Q).mo3783build();
                    default:
                        int i5 = TravelFlightsSearchSortByScreen.V;
                        v0 v0Var = (v0) travelFlightsSearchSortByScreen.T.getValue();
                        switch (v0Var.f132207a) {
                            case 0:
                                return (d) v0Var.f132209c.get();
                            case 1:
                                return (d) v0Var.f132209c.get();
                            default:
                                return (d) v0Var.f132209c.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v0) this.T.getValue();
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
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.p()), new d7g.b(this, null), 3);
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
