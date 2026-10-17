package com.revolut.feature.rewards.impl.ui.rent_and_bills.flow;

import aii.q;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.RentAndBillsFlow;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.RentAndBillsFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import whc.p;
import whc.s;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RentAndBillsFlow extends ViewController<q> implements f {
    public final RentAndBillsFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public RentAndBillsFlow(RentAndBillsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: wic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RentAndBillsFlow f297873b;

            {
                this.f297873b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((p) this.f297873b.N.getValue()).f297560b.get();
                    case 1:
                        RentAndBillsFlow rentAndBillsFlow = this.f297873b;
                        return czi.c.d(0, 6, null, rentAndBillsFlow, (b) rentAndBillsFlow.L.getValue());
                    default:
                        RentAndBillsFlow rentAndBillsFlow2 = this.f297873b;
                        phm.a aVar = (phm.a) ue0.e.j(rentAndBillsFlow2.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).f297580t;
                        RentAndBillsFlowContract$InputData rentAndBillsFlowContract$InputData = rentAndBillsFlow2.K;
                        rentAndBillsFlowContract$InputData.getClass();
                        return new p(sVar, rentAndBillsFlowContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: wic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RentAndBillsFlow f297873b;

            {
                this.f297873b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((p) this.f297873b.N.getValue()).f297560b.get();
                    case 1:
                        RentAndBillsFlow rentAndBillsFlow = this.f297873b;
                        return czi.c.d(0, 6, null, rentAndBillsFlow, (b) rentAndBillsFlow.L.getValue());
                    default:
                        RentAndBillsFlow rentAndBillsFlow2 = this.f297873b;
                        phm.a aVar = (phm.a) ue0.e.j(rentAndBillsFlow2.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).f297580t;
                        RentAndBillsFlowContract$InputData rentAndBillsFlowContract$InputData = rentAndBillsFlow2.K;
                        rentAndBillsFlowContract$InputData.getClass();
                        return new p(sVar, rentAndBillsFlowContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: wic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RentAndBillsFlow f297873b;

            {
                this.f297873b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (b) ((p) this.f297873b.N.getValue()).f297560b.get();
                    case 1:
                        RentAndBillsFlow rentAndBillsFlow = this.f297873b;
                        return czi.c.d(0, 6, null, rentAndBillsFlow, (b) rentAndBillsFlow.L.getValue());
                    default:
                        RentAndBillsFlow rentAndBillsFlow2 = this.f297873b;
                        phm.a aVar = (phm.a) ue0.e.j(rentAndBillsFlow2.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).f297580t;
                        RentAndBillsFlowContract$InputData rentAndBillsFlowContract$InputData = rentAndBillsFlow2.K;
                        rentAndBillsFlowContract$InputData.getClass();
                        return new p(sVar, rentAndBillsFlowContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (p) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (wic.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
