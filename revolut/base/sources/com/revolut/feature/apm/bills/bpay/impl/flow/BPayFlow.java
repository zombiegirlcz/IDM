package com.revolut.feature.apm.bills.bpay.impl.flow;

import aii.q;
import ao1.e;
import com.revolut.feature.apm.bills.bpay.impl.flow.BPayFlow;
import com.revolut.feature.apm.bills.bpay.impl.flow.BPayFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bills/bpay/impl/flow/BPayFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BPayFlow extends ViewController<q> implements f {
    public final BPayFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public BPayFlow(BPayFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: bo1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BPayFlow f17264b;

            {
                this.f17264b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((e) this.f17264b.N.getValue()).d.get();
                    case 1:
                        BPayFlow bPayFlow = this.f17264b;
                        return czi.c.d(0, 6, null, bPayFlow, (b) bPayFlow.L.getValue());
                    default:
                        BPayFlow bPayFlow2 = this.f17264b;
                        phm.a aVar = (phm.a) ue0.e.j(bPayFlow2.m2()).a().get(ao1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ao1.d.class, " is not found"));
                        }
                        ao1.d dVar = ((ao1.d) aVar2.b()).f7878p;
                        BPayFlowContract$InputData bPayFlowContract$InputData = bPayFlow2.K;
                        bPayFlowContract$InputData.getClass();
                        return new e(dVar, bPayFlowContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: bo1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BPayFlow f17264b;

            {
                this.f17264b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((e) this.f17264b.N.getValue()).d.get();
                    case 1:
                        BPayFlow bPayFlow = this.f17264b;
                        return czi.c.d(0, 6, null, bPayFlow, (b) bPayFlow.L.getValue());
                    default:
                        BPayFlow bPayFlow2 = this.f17264b;
                        phm.a aVar = (phm.a) ue0.e.j(bPayFlow2.m2()).a().get(ao1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ao1.d.class, " is not found"));
                        }
                        ao1.d dVar = ((ao1.d) aVar2.b()).f7878p;
                        BPayFlowContract$InputData bPayFlowContract$InputData = bPayFlow2.K;
                        bPayFlowContract$InputData.getClass();
                        return new e(dVar, bPayFlowContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: bo1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BPayFlow f17264b;

            {
                this.f17264b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (b) ((e) this.f17264b.N.getValue()).d.get();
                    case 1:
                        BPayFlow bPayFlow = this.f17264b;
                        return czi.c.d(0, 6, null, bPayFlow, (b) bPayFlow.L.getValue());
                    default:
                        BPayFlow bPayFlow2 = this.f17264b;
                        phm.a aVar = (phm.a) ue0.e.j(bPayFlow2.m2()).a().get(ao1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ao1.d.class, " is not found"));
                        }
                        ao1.d dVar = ((ao1.d) aVar2.b()).f7878p;
                        BPayFlowContract$InputData bPayFlowContract$InputData = bPayFlow2.K;
                        bPayFlowContract$InputData.getClass();
                        return new e(dVar, bPayFlowContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (bo1.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
