package com.revolut.feature.freelancer.impl.ui.invoice.settings.flow;

import a0.d;
import aii.q;
import com.revolut.feature.freelancer.impl.ui.invoice.settings.flow.InvoiceSettingsFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import qji.b;
import te0.w;
import ue0.e;
import us6.g2;
import us6.u2;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/settings/flow/InvoiceSettingsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvoiceSettingsFlow extends ViewController<q> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public InvoiceSettingsFlow() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: my6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceSettingsFlow f210351b;

            {
                this.f210351b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f210351b.m2()).a().get(g2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new u2(((g2) aVar2.b()).f282557j);
                        }
                        throw new IllegalStateException(d.q("Api ", g2.class, " is not found"));
                    case 1:
                        return (b) ((u2) this.f210351b.K.getValue()).f282771c.get();
                    default:
                        InvoiceSettingsFlow invoiceSettingsFlow = this.f210351b;
                        return c.d(0, 6, null, invoiceSettingsFlow, (b) invoiceSettingsFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: my6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceSettingsFlow f210351b;

            {
                this.f210351b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f210351b.m2()).a().get(g2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new u2(((g2) aVar2.b()).f282557j);
                        }
                        throw new IllegalStateException(d.q("Api ", g2.class, " is not found"));
                    case 1:
                        return (b) ((u2) this.f210351b.K.getValue()).f282771c.get();
                    default:
                        InvoiceSettingsFlow invoiceSettingsFlow = this.f210351b;
                        return c.d(0, 6, null, invoiceSettingsFlow, (b) invoiceSettingsFlow.L.getValue());
                }
            }
        });
        final int i3 = 2;
        this.M = w.y0(new Function0(this) { // from class: my6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceSettingsFlow f210351b;

            {
                this.f210351b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f210351b.m2()).a().get(g2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new u2(((g2) aVar2.b()).f282557j);
                        }
                        throw new IllegalStateException(d.q("Api ", g2.class, " is not found"));
                    case 1:
                        return (b) ((u2) this.f210351b.K.getValue()).f282771c.get();
                    default:
                        InvoiceSettingsFlow invoiceSettingsFlow = this.f210351b;
                        return c.d(0, 6, null, invoiceSettingsFlow, (b) invoiceSettingsFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (u2) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (u2) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (my6.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
