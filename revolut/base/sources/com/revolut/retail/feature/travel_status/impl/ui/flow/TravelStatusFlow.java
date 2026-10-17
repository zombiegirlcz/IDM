package com.revolut.retail.feature.travel_status.impl.ui.flow;

import aii.q;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.travel_status.impl.ui.flow.TravelStatusFlow;
import com.revolut.retail.feature.travel_status.impl.ui.flow.TravelStatusFlowContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import y1l.d;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/travel_status/impl/ui/flow/TravelStatusFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelStatusFlow extends ViewController<q> implements f {
    public final TravelStatusFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;

    public TravelStatusFlow(TravelStatusFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: c2l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelStatusFlow f20825b;

            {
                this.f20825b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((y1l.d) this.f20825b.O.getValue()).d.get();
                    case 1:
                        TravelStatusFlow travelStatusFlow = this.f20825b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, travelStatusFlow, (b) travelStatusFlow.L.getValue());
                    default:
                        TravelStatusFlow travelStatusFlow2 = this.f20825b;
                        phm.a aVar = (phm.a) ue0.e.j(travelStatusFlow2.m2()).a().get(y1l.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y1l.b.class, " is not found"));
                        }
                        y1l.b bVar = ((y1l.b) aVar2.b()).k;
                        TravelStatusFlowContract$InputData travelStatusFlowContract$InputData = travelStatusFlow2.K;
                        travelStatusFlowContract$InputData.getClass();
                        return new y1l.d(bVar, travelStatusFlowContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: c2l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelStatusFlow f20825b;

            {
                this.f20825b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((y1l.d) this.f20825b.O.getValue()).d.get();
                    case 1:
                        TravelStatusFlow travelStatusFlow = this.f20825b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, travelStatusFlow, (b) travelStatusFlow.L.getValue());
                    default:
                        TravelStatusFlow travelStatusFlow2 = this.f20825b;
                        phm.a aVar = (phm.a) ue0.e.j(travelStatusFlow2.m2()).a().get(y1l.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y1l.b.class, " is not found"));
                        }
                        y1l.b bVar = ((y1l.b) aVar2.b()).k;
                        TravelStatusFlowContract$InputData travelStatusFlowContract$InputData = travelStatusFlow2.K;
                        travelStatusFlowContract$InputData.getClass();
                        return new y1l.d(bVar, travelStatusFlowContract$InputData);
                }
            }
        });
        this.N = R$layout.screen_transparent;
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: c2l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelStatusFlow f20825b;

            {
                this.f20825b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (b) ((y1l.d) this.f20825b.O.getValue()).d.get();
                    case 1:
                        TravelStatusFlow travelStatusFlow = this.f20825b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, travelStatusFlow, (b) travelStatusFlow.L.getValue());
                    default:
                        TravelStatusFlow travelStatusFlow2 = this.f20825b;
                        phm.a aVar = (phm.a) ue0.e.j(travelStatusFlow2.m2()).a().get(y1l.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y1l.b.class, " is not found"));
                        }
                        y1l.b bVar = ((y1l.b) aVar2.b()).k;
                        TravelStatusFlowContract$InputData travelStatusFlowContract$InputData = travelStatusFlow2.K;
                        travelStatusFlowContract$InputData.getClass();
                        return new y1l.d(bVar, travelStatusFlowContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (d) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c2l.b) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
