package com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow;

import aii.q;
import com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.BillsCatalogueFlow;
import com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.BillsCatalogueFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf9.m;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui_catalogue/flow/BillsCatalogueFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BillsCatalogueFlow extends ViewController<q> implements f {
    public final BillsCatalogueFlowContract$InputData K;
    public final Object L;
    public final Object M;

    public BillsCatalogueFlow(BillsCatalogueFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ah9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillsCatalogueFlow f4908b;

            {
                this.f4908b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BillsCatalogueFlow billsCatalogueFlow = this.f4908b;
                        phm.a aVar = (phm.a) ue0.e.j(billsCatalogueFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).u;
                        BillsCatalogueFlowContract$InputData billsCatalogueFlowContract$InputData = billsCatalogueFlow.K;
                        billsCatalogueFlowContract$InputData.getClass();
                        return new lf9.b(mVar, billsCatalogueFlowContract$InputData);
                    default:
                        BillsCatalogueFlow billsCatalogueFlow2 = this.f4908b;
                        return czi.c.d(0, 6, null, billsCatalogueFlow2, (b) ((lf9.b) billsCatalogueFlow2.L.getValue()).d.get());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ah9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillsCatalogueFlow f4908b;

            {
                this.f4908b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BillsCatalogueFlow billsCatalogueFlow = this.f4908b;
                        phm.a aVar = (phm.a) ue0.e.j(billsCatalogueFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).u;
                        BillsCatalogueFlowContract$InputData billsCatalogueFlowContract$InputData = billsCatalogueFlow.K;
                        billsCatalogueFlowContract$InputData.getClass();
                        return new lf9.b(mVar, billsCatalogueFlowContract$InputData);
                    default:
                        BillsCatalogueFlow billsCatalogueFlow2 = this.f4908b;
                        return czi.c.d(0, 6, null, billsCatalogueFlow2, (b) ((lf9.b) billsCatalogueFlow2.L.getValue()).d.get());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (lf9.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (lf9.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ah9.b) ((lf9.b) this.L.getValue()).d.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
