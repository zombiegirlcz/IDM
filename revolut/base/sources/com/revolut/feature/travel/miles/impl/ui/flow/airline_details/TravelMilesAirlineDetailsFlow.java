package com.revolut.feature.travel.miles.impl.ui.flow.airline_details;

import aii.q;
import com.revolut.feature.travel.miles.impl.ui.flow.airline_details.TravelMilesAirlineDetailsFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import e58.d;
import egg.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ufg.b;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/airline_details/TravelMilesAirlineDetailsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesAirlineDetailsFlow extends ViewController<q> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public TravelMilesAirlineDetailsFlow(TravelMilesAirlineDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: egg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesAirlineDetailsFlow f125636b;

            {
                this.f125636b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TravelMilesAirlineDetailsFlow travelMilesAirlineDetailsFlow = this.f125636b;
                        return czi.c.d(0, 6, null, travelMilesAirlineDetailsFlow, (c) travelMilesAirlineDetailsFlow.M.getValue());
                    default:
                        return (c) ((ufg.b) this.f125636b.L.getValue()).e.get();
                }
            }
        });
        this.L = w.y0(new d(this, inputData, 17));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: egg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesAirlineDetailsFlow f125636b;

            {
                this.f125636b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TravelMilesAirlineDetailsFlow travelMilesAirlineDetailsFlow = this.f125636b;
                        return czi.c.d(0, 6, null, travelMilesAirlineDetailsFlow, (c) travelMilesAirlineDetailsFlow.M.getValue());
                    default:
                        return (c) ((ufg.b) this.f125636b.L.getValue()).e.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.K.getValue();
    }
}
