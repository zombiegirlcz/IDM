package com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details;

import aii.q;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlow;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$InputData;
import cwi.b0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungePassDetailsFlow extends ViewController<q> implements f {
    public final Object K;
    public final Object L;
    public final int M;
    public final Object N;

    public AirportLoungePassDetailsFlow() {
        this(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b0) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b0) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (qwi.b) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.M;
    }

    public /* synthetic */ AirportLoungePassDetailsFlow(int i) {
        this(new AirportLoungePassDetailsFlowContract$InputData.PassDetails(null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }

    public AirportLoungePassDetailsFlow(AirportLoungePassDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new qvf.a(this, inputData, 4));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: qwi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungePassDetailsFlow f249950b;

            {
                this.f249950b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((b0) this.f249950b.K.getValue()).d.get();
                    default:
                        AirportLoungePassDetailsFlow airportLoungePassDetailsFlow = this.f249950b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, airportLoungePassDetailsFlow, (b) airportLoungePassDetailsFlow.L.getValue());
                }
            }
        });
        this.M = R$layout.screen_transparent;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: qwi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungePassDetailsFlow f249950b;

            {
                this.f249950b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((b0) this.f249950b.K.getValue()).d.get();
                    default:
                        AirportLoungePassDetailsFlow airportLoungePassDetailsFlow = this.f249950b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, airportLoungePassDetailsFlow, (b) airportLoungePassDetailsFlow.L.getValue());
                }
            }
        });
    }
}
