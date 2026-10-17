package com.revolut.feature.trading.impl.flows.holdings.information;

import aii.q;
import c4f.d;
import com.revolut.feature.trading.impl.flows.holdings.information.HoldingsInformationFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/trading/impl/flows/holdings/information/HoldingsInformationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "<init>", "()V", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HoldingsInformationFlow extends ViewController<q> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public HoldingsInformationFlow() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: h4f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HoldingsInformationFlow f149349b;

            {
                this.f149349b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f149349b.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new c4f.f(((d) aVar2.b()).f21206g);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                    case 1:
                        return (b) ((c4f.f) this.f149349b.K.getValue()).f21212c.get();
                    default:
                        HoldingsInformationFlow holdingsInformationFlow = this.f149349b;
                        return c.d(0, 6, null, holdingsInformationFlow, (b) holdingsInformationFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: h4f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HoldingsInformationFlow f149349b;

            {
                this.f149349b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f149349b.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new c4f.f(((d) aVar2.b()).f21206g);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                    case 1:
                        return (b) ((c4f.f) this.f149349b.K.getValue()).f21212c.get();
                    default:
                        HoldingsInformationFlow holdingsInformationFlow = this.f149349b;
                        return c.d(0, 6, null, holdingsInformationFlow, (b) holdingsInformationFlow.L.getValue());
                }
            }
        });
        final int i3 = 2;
        this.M = w.y0(new Function0(this) { // from class: h4f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HoldingsInformationFlow f149349b;

            {
                this.f149349b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f149349b.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new c4f.f(((d) aVar2.b()).f21206g);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                    case 1:
                        return (b) ((c4f.f) this.f149349b.K.getValue()).f21212c.get();
                    default:
                        HoldingsInformationFlow holdingsInformationFlow = this.f149349b;
                        return c.d(0, 6, null, holdingsInformationFlow, (b) holdingsInformationFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c4f.f) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (c4f.f) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (h4f.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
