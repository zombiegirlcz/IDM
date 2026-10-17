package com.revolut.feature.travel.flights.impl.ui.flow.root;

import aii.q;
import com.revolut.feature.travel.flights.impl.ui.flow.root.TravelFlightsFlow;
import com.revolut.feature.travel.flights.impl.ui.flow.root.TravelFlightsFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import f4g.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/flow/root/TravelFlightsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsFlow extends ViewController<q> implements f {
    public final TravelFlightsFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public TravelFlightsFlow(TravelFlightsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: n4g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsFlow f212434b;

            {
                this.f212434b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TravelFlightsFlow travelFlightsFlow = this.f212434b;
                        return czi.c.d(0, 6, null, travelFlightsFlow, (b) travelFlightsFlow.N.getValue());
                    case 1:
                        TravelFlightsFlow travelFlightsFlow2 = this.f212434b;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsFlow2.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsFlowContract$InputData travelFlightsFlowContract$InputData = travelFlightsFlow2.K;
                        travelFlightsFlowContract$InputData.getClass();
                        return new p(bVar, travelFlightsFlowContract$InputData);
                    default:
                        return (b) ((p) this.f212434b.M.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: n4g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsFlow f212434b;

            {
                this.f212434b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TravelFlightsFlow travelFlightsFlow = this.f212434b;
                        return czi.c.d(0, 6, null, travelFlightsFlow, (b) travelFlightsFlow.N.getValue());
                    case 1:
                        TravelFlightsFlow travelFlightsFlow2 = this.f212434b;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsFlow2.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsFlowContract$InputData travelFlightsFlowContract$InputData = travelFlightsFlow2.K;
                        travelFlightsFlowContract$InputData.getClass();
                        return new p(bVar, travelFlightsFlowContract$InputData);
                    default:
                        return (b) ((p) this.f212434b.M.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: n4g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsFlow f212434b;

            {
                this.f212434b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TravelFlightsFlow travelFlightsFlow = this.f212434b;
                        return czi.c.d(0, 6, null, travelFlightsFlow, (b) travelFlightsFlow.N.getValue());
                    case 1:
                        TravelFlightsFlow travelFlightsFlow2 = this.f212434b;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsFlow2.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsFlowContract$InputData travelFlightsFlowContract$InputData = travelFlightsFlow2.K;
                        travelFlightsFlowContract$InputData.getClass();
                        return new p(bVar, travelFlightsFlowContract$InputData);
                    default:
                        return (b) ((p) this.f212434b.M.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (p) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (n4g.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.L.getValue();
    }
}
