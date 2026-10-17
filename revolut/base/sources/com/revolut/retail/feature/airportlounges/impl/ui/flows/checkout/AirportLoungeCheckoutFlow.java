package com.revolut.retail.feature.airportlounges.impl.ui.flows.checkout;

import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.checkout.AirportLoungeCheckoutFlow;
import cwi.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nwi.e;
import qji.b;
import te0.w;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/checkout/AirportLoungeCheckoutFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnwi/e;", "Lyki/f;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungeCheckoutFlow extends ViewController<e> implements f {
    public final Object K;
    public final Object L;
    public final int M;
    public final Object N;

    public AirportLoungeCheckoutFlow(AirportLoungeCheckoutFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new nsh.e(this, inputData, 8));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: nwi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungeCheckoutFlow f219891b;

            {
                this.f219891b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((y) this.f219891b.K.getValue()).d.get();
                    default:
                        AirportLoungeCheckoutFlow airportLoungeCheckoutFlow = this.f219891b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, airportLoungeCheckoutFlow, (b) airportLoungeCheckoutFlow.L.getValue());
                }
            }
        });
        this.M = R$layout.screen_transparent;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: nwi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungeCheckoutFlow f219891b;

            {
                this.f219891b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((y) this.f219891b.K.getValue()).d.get();
                    default:
                        AirportLoungeCheckoutFlow airportLoungeCheckoutFlow = this.f219891b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, airportLoungeCheckoutFlow, (b) airportLoungeCheckoutFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (y) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (y) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (nwi.b) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
