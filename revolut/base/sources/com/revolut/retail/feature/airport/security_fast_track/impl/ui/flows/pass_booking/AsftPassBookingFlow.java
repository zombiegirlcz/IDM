package com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.pass_booking;

import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.pass_booking.AsftPassBookingFlow;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import lti.g;
import lti.k;
import te0.w;
import vti.d;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvti/d;", "Lyki/f;", "<init>", "()V", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsftPassBookingFlow extends ViewController<d> implements f {
    public final Object K;
    public final Object L;
    public final int M = R$layout.base_flow_container;
    public final Object N;

    public AsftPassBookingFlow() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: vti.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftPassBookingFlow f292119b;

            {
                this.f292119b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f292119b.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new k(((g) aVar2.b()).o);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                    case 1:
                        return (b) ((k) this.f292119b.K.getValue()).f199924c.get();
                    default:
                        AsftPassBookingFlow asftPassBookingFlow = this.f292119b;
                        return czi.c.d(0, 6, null, asftPassBookingFlow, (b) asftPassBookingFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: vti.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftPassBookingFlow f292119b;

            {
                this.f292119b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f292119b.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new k(((g) aVar2.b()).o);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                    case 1:
                        return (b) ((k) this.f292119b.K.getValue()).f199924c.get();
                    default:
                        AsftPassBookingFlow asftPassBookingFlow = this.f292119b;
                        return czi.c.d(0, 6, null, asftPassBookingFlow, (b) asftPassBookingFlow.L.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: vti.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftPassBookingFlow f292119b;

            {
                this.f292119b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f292119b.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new k(((g) aVar2.b()).o);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                    case 1:
                        return (b) ((k) this.f292119b.K.getValue()).f199924c.get();
                    default:
                        AsftPassBookingFlow asftPassBookingFlow = this.f292119b;
                        return czi.c.d(0, 6, null, asftPassBookingFlow, (b) asftPassBookingFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (k) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (vti.b) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
