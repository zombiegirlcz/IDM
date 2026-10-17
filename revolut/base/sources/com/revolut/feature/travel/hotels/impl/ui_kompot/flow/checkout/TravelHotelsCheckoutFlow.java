package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout;

import cli.l;
import cli.o;
import cli.q;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import g9g.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import qji.b;
import tag.c;
import tag.i;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltag/i;", "Lwki/a;", "Lcli/l;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsCheckoutFlow extends ViewController<i> implements wki.a {
    public final Object K;
    public final Object L;
    public final Object M;

    public TravelHotelsCheckoutFlow(TravelHotelsCheckoutFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: tag.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsCheckoutFlow f269327b;

            {
                this.f269327b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TravelHotelsCheckoutFlow travelHotelsCheckoutFlow = this.f269327b;
                        return s.a(travelHotelsCheckoutFlow, (c) travelHotelsCheckoutFlow.M.getValue(), 0, 6);
                    default:
                        return (c) ((n) this.f269327b.L.getValue()).e.get();
                }
            }
        });
        this.L = w.y0(new sw6.a(this, inputData, 11));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: tag.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsCheckoutFlow f269327b;

            {
                this.f269327b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TravelHotelsCheckoutFlow travelHotelsCheckoutFlow = this.f269327b;
                        return s.a(travelHotelsCheckoutFlow, (c) travelHotelsCheckoutFlow.M.getValue(), 0, 6);
                    default:
                        return (c) ((n) this.f269327b.L.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (n) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (wki.c) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (wki.c) this.K.getValue();
    }
}
