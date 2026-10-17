package com.revolut.feature.apm.bills.billers.impl.ui;

import aii.q;
import com.revolut.feature.apm.bills.billers.impl.ui.BillersFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import hm1.d;
import jm1.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bills/billers/impl/ui/BillersFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_apm_bills_billers_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BillersFlow extends ViewController<q> implements f {
    public final c K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public BillersFlow(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: jm1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillersFlow f175915b;

            {
                this.f175915b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BillersFlow billersFlow = this.f175915b;
                        phm.a aVar = (phm.a) e.j(billersFlow.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        d dVar = ((d) aVar2.b()).f153500c;
                        c cVar = billersFlow.K;
                        cVar.getClass();
                        return new hm1.e(dVar, cVar);
                    case 1:
                        return (b) ((hm1.e) this.f175915b.M.getValue()).f153502b.get();
                    default:
                        int i2 = R$id.screen_transparent_container;
                        BillersFlow billersFlow2 = this.f175915b;
                        return czi.c.d(i2, 4, null, billersFlow2, (b) billersFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: jm1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillersFlow f175915b;

            {
                this.f175915b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BillersFlow billersFlow = this.f175915b;
                        phm.a aVar = (phm.a) e.j(billersFlow.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        d dVar = ((d) aVar2.b()).f153500c;
                        c cVar = billersFlow.K;
                        cVar.getClass();
                        return new hm1.e(dVar, cVar);
                    case 1:
                        return (b) ((hm1.e) this.f175915b.M.getValue()).f153502b.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        BillersFlow billersFlow2 = this.f175915b;
                        return czi.c.d(i22, 4, null, billersFlow2, (b) billersFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: jm1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillersFlow f175915b;

            {
                this.f175915b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        BillersFlow billersFlow = this.f175915b;
                        phm.a aVar = (phm.a) e.j(billersFlow.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        d dVar = ((d) aVar2.b()).f153500c;
                        c cVar = billersFlow.K;
                        cVar.getClass();
                        return new hm1.e(dVar, cVar);
                    case 1:
                        return (b) ((hm1.e) this.f175915b.M.getValue()).f153502b.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        BillersFlow billersFlow2 = this.f175915b;
                        return czi.c.d(i22, 4, null, billersFlow2, (b) billersFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (hm1.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (hm1.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (jm1.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
