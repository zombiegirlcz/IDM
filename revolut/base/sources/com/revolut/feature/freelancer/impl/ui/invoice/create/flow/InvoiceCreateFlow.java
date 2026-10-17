package com.revolut.feature.freelancer.impl.ui.invoice.create.flow;

import a0.d;
import com.revolut.feature.freelancer.impl.ui.invoice.create.flow.InvoiceCreateFlow;
import com.revolut.feature.freelancer.impl.ui.invoice.create.flow.InvoiceCreateFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import gx6.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import us6.g2;
import us6.h2;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgx6/c;", "Lyki/f;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvoiceCreateFlow extends ViewController<c> implements f {
    public final InvoiceCreateFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public InvoiceCreateFlow(InvoiceCreateFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: gx6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceCreateFlow f147639b;

            {
                this.f147639b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        InvoiceCreateFlow invoiceCreateFlow = this.f147639b;
                        phm.a aVar = (phm.a) e.j(invoiceCreateFlow.m2()).a().get(g2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", g2.class, " is not found"));
                        }
                        g2 g2Var = ((g2) aVar2.b()).f282557j;
                        InvoiceCreateFlowContract$InputData invoiceCreateFlowContract$InputData = invoiceCreateFlow.K;
                        invoiceCreateFlowContract$InputData.getClass();
                        return new h2(g2Var, invoiceCreateFlowContract$InputData);
                    case 1:
                        return (b) ((h2) this.f147639b.L.getValue()).d.get();
                    default:
                        InvoiceCreateFlow invoiceCreateFlow2 = this.f147639b;
                        return czi.c.d(0, 6, null, invoiceCreateFlow2, (b) invoiceCreateFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: gx6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceCreateFlow f147639b;

            {
                this.f147639b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        InvoiceCreateFlow invoiceCreateFlow = this.f147639b;
                        phm.a aVar = (phm.a) e.j(invoiceCreateFlow.m2()).a().get(g2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", g2.class, " is not found"));
                        }
                        g2 g2Var = ((g2) aVar2.b()).f282557j;
                        InvoiceCreateFlowContract$InputData invoiceCreateFlowContract$InputData = invoiceCreateFlow.K;
                        invoiceCreateFlowContract$InputData.getClass();
                        return new h2(g2Var, invoiceCreateFlowContract$InputData);
                    case 1:
                        return (b) ((h2) this.f147639b.L.getValue()).d.get();
                    default:
                        InvoiceCreateFlow invoiceCreateFlow2 = this.f147639b;
                        return czi.c.d(0, 6, null, invoiceCreateFlow2, (b) invoiceCreateFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: gx6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceCreateFlow f147639b;

            {
                this.f147639b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        InvoiceCreateFlow invoiceCreateFlow = this.f147639b;
                        phm.a aVar = (phm.a) e.j(invoiceCreateFlow.m2()).a().get(g2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", g2.class, " is not found"));
                        }
                        g2 g2Var = ((g2) aVar2.b()).f282557j;
                        InvoiceCreateFlowContract$InputData invoiceCreateFlowContract$InputData = invoiceCreateFlow.K;
                        invoiceCreateFlowContract$InputData.getClass();
                        return new h2(g2Var, invoiceCreateFlowContract$InputData);
                    case 1:
                        return (b) ((h2) this.f147639b.L.getValue()).d.get();
                    default:
                        InvoiceCreateFlow invoiceCreateFlow2 = this.f147639b;
                        return czi.c.d(0, 6, null, invoiceCreateFlow2, (b) invoiceCreateFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (h2) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (h2) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (gx6.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
