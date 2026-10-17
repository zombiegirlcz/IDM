package com.revolut.feature.payments_migration.impl.ui.flow;

import aii.q;
import com.revolut.feature.payments_migration.impl.ui.flow.PaymentsMigrationFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import te0.w;
import u5a.g;
import u5a.j;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/ui/flow/PaymentsMigrationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "<init>", "()V", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentsMigrationFlow extends ViewController<q> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public PaymentsMigrationFlow() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: c6a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentsMigrationFlow f21748b;

            {
                this.f21748b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f21748b.m2()).a().get(j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new g(((u5a.f) ((j) aVar2.b())).o);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", j.class, " is not found"));
                    case 1:
                        return (b) ((g) this.f21748b.K.getValue()).f277430c.get();
                    default:
                        PaymentsMigrationFlow paymentsMigrationFlow = this.f21748b;
                        return czi.c.d(0, 6, null, paymentsMigrationFlow, (b) paymentsMigrationFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: c6a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentsMigrationFlow f21748b;

            {
                this.f21748b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f21748b.m2()).a().get(j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new g(((u5a.f) ((j) aVar2.b())).o);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", j.class, " is not found"));
                    case 1:
                        return (b) ((g) this.f21748b.K.getValue()).f277430c.get();
                    default:
                        PaymentsMigrationFlow paymentsMigrationFlow = this.f21748b;
                        return czi.c.d(0, 6, null, paymentsMigrationFlow, (b) paymentsMigrationFlow.L.getValue());
                }
            }
        });
        final int i3 = 2;
        this.M = w.y0(new Function0(this) { // from class: c6a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentsMigrationFlow f21748b;

            {
                this.f21748b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f21748b.m2()).a().get(j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new g(((u5a.f) ((j) aVar2.b())).o);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", j.class, " is not found"));
                    case 1:
                        return (b) ((g) this.f21748b.K.getValue()).f277430c.get();
                    default:
                        PaymentsMigrationFlow paymentsMigrationFlow = this.f21748b;
                        return czi.c.d(0, 6, null, paymentsMigrationFlow, (b) paymentsMigrationFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (g) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c6a.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
