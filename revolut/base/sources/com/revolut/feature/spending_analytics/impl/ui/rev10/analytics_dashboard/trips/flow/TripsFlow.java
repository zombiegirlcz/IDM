package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow;

import aii.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.TripsFlow;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.TripsFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mod.v;
import ppd.c1;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TripsFlow extends ViewController<q> implements f {
    public final TripsFlowContract$InputData K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;

    public TripsFlow(TripsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: mod.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripsFlow f207626b;

            {
                this.f207626b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (v) ((c1) this.f207626b.O.getValue()).f238388g.get();
                    case 1:
                        TripsFlow tripsFlow = this.f207626b;
                        return czi.c.d(0, 6, null, tripsFlow, (v) tripsFlow.L.getValue());
                    default:
                        TripsFlow tripsFlow2 = this.f207626b;
                        phm.a aVar = (phm.a) ue0.e.j(tripsFlow2.m2()).a().get(ppd.n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ppd.n.class, " is not found"));
                        }
                        ppd.n nVar = ((ppd.n) aVar2.b()).L0;
                        TripsFlowContract$InputData tripsFlowContract$InputData = tripsFlow2.K;
                        tripsFlowContract$InputData.getClass();
                        return new c1(nVar, tripsFlow2, tripsFlowContract$InputData);
                }
            }
        });
        this.M = R$style.UiKitTheme_Night;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: mod.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripsFlow f207626b;

            {
                this.f207626b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (v) ((c1) this.f207626b.O.getValue()).f238388g.get();
                    case 1:
                        TripsFlow tripsFlow = this.f207626b;
                        return czi.c.d(0, 6, null, tripsFlow, (v) tripsFlow.L.getValue());
                    default:
                        TripsFlow tripsFlow2 = this.f207626b;
                        phm.a aVar = (phm.a) ue0.e.j(tripsFlow2.m2()).a().get(ppd.n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ppd.n.class, " is not found"));
                        }
                        ppd.n nVar = ((ppd.n) aVar2.b()).L0;
                        TripsFlowContract$InputData tripsFlowContract$InputData = tripsFlow2.K;
                        tripsFlowContract$InputData.getClass();
                        return new c1(nVar, tripsFlow2, tripsFlowContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: mod.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripsFlow f207626b;

            {
                this.f207626b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (v) ((c1) this.f207626b.O.getValue()).f238388g.get();
                    case 1:
                        TripsFlow tripsFlow = this.f207626b;
                        return czi.c.d(0, 6, null, tripsFlow, (v) tripsFlow.L.getValue());
                    default:
                        TripsFlow tripsFlow2 = this.f207626b;
                        phm.a aVar = (phm.a) ue0.e.j(tripsFlow2.m2()).a().get(ppd.n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ppd.n.class, " is not found"));
                        }
                        ppd.n nVar = ((ppd.n) aVar2.b()).L0;
                        TripsFlowContract$InputData tripsFlowContract$InputData = tripsFlow2.K;
                        tripsFlowContract$InputData.getClass();
                        return new c1(nVar, tripsFlow2, tripsFlowContract$InputData);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.M);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c1) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (c1) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (v) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
