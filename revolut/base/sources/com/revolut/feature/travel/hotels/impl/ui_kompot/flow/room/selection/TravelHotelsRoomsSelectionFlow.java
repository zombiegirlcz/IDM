package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.room.selection;

import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.room.selection.TravelHotelsRoomsSelectionFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import g9g.p0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import wag.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/room/selection/TravelHotelsRoomsSelectionFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwag/e;", "Lyki/f;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsRoomsSelectionFlow extends ViewController<e> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public TravelHotelsRoomsSelectionFlow(TravelHotelsRoomsSelectionFlowContract$InputData$Amendment inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: wag.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsRoomsSelectionFlow f295938b;

            {
                this.f295938b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TravelHotelsRoomsSelectionFlow travelHotelsRoomsSelectionFlow = this.f295938b;
                        return czi.c.d(0, 6, null, travelHotelsRoomsSelectionFlow, (b) travelHotelsRoomsSelectionFlow.M.getValue());
                    default:
                        return (b) ((p0) this.f295938b.L.getValue()).d.get();
                }
            }
        });
        this.L = w.y0(new w83.a(this, inputData, 3));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: wag.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsRoomsSelectionFlow f295938b;

            {
                this.f295938b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TravelHotelsRoomsSelectionFlow travelHotelsRoomsSelectionFlow = this.f295938b;
                        return czi.c.d(0, 6, null, travelHotelsRoomsSelectionFlow, (b) travelHotelsRoomsSelectionFlow.M.getValue());
                    default:
                        return (b) ((p0) this.f295938b.L.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (p0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (wag.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.K.getValue();
    }
}
