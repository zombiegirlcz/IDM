package com.revolut.feature.wealth.commodity_additional_services.impl.ui.flows.physical_delivery;

import a0.d;
import aii.q;
import com.revolut.feature.wealth.commodity_additional_services.impl.ui.flows.physical_delivery.PhysicalDeliveryFlow;
import com.revolut.feature.wealth.commodity_additional_services.impl.ui.flows.physical_delivery.PhysicalDeliveryFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l5h.c;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/commodity_additional_services/impl/ui/flows/physical_delivery/PhysicalDeliveryFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_wealth_commodity_additional_services_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PhysicalDeliveryFlow extends ViewController<q> implements f {
    public final PhysicalDeliveryFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public PhysicalDeliveryFlow(PhysicalDeliveryFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: o5h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhysicalDeliveryFlow f222437b;

            {
                this.f222437b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PhysicalDeliveryFlow physicalDeliveryFlow = this.f222437b;
                        phm.a aVar = (phm.a) e.j(physicalDeliveryFlow.m2()).a().get(l5h.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", l5h.a.class, " is not found"));
                        }
                        l5h.a aVar3 = ((l5h.a) aVar2.b()).f;
                        PhysicalDeliveryFlowContract$InputData physicalDeliveryFlowContract$InputData = physicalDeliveryFlow.K;
                        physicalDeliveryFlowContract$InputData.getClass();
                        return new l5h.c(aVar3, physicalDeliveryFlowContract$InputData);
                    case 1:
                        int i2 = R$id.screen_transparent_container;
                        PhysicalDeliveryFlow physicalDeliveryFlow2 = this.f222437b;
                        return czi.c.d(i2, 4, null, physicalDeliveryFlow2, (b) physicalDeliveryFlow2.O.getValue());
                    default:
                        return (b) ((l5h.c) this.f222437b.M.getValue()).f192270b.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: o5h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhysicalDeliveryFlow f222437b;

            {
                this.f222437b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PhysicalDeliveryFlow physicalDeliveryFlow = this.f222437b;
                        phm.a aVar = (phm.a) e.j(physicalDeliveryFlow.m2()).a().get(l5h.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", l5h.a.class, " is not found"));
                        }
                        l5h.a aVar3 = ((l5h.a) aVar2.b()).f;
                        PhysicalDeliveryFlowContract$InputData physicalDeliveryFlowContract$InputData = physicalDeliveryFlow.K;
                        physicalDeliveryFlowContract$InputData.getClass();
                        return new l5h.c(aVar3, physicalDeliveryFlowContract$InputData);
                    case 1:
                        int i22 = R$id.screen_transparent_container;
                        PhysicalDeliveryFlow physicalDeliveryFlow2 = this.f222437b;
                        return czi.c.d(i22, 4, null, physicalDeliveryFlow2, (b) physicalDeliveryFlow2.O.getValue());
                    default:
                        return (b) ((l5h.c) this.f222437b.M.getValue()).f192270b.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: o5h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhysicalDeliveryFlow f222437b;

            {
                this.f222437b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PhysicalDeliveryFlow physicalDeliveryFlow = this.f222437b;
                        phm.a aVar = (phm.a) e.j(physicalDeliveryFlow.m2()).a().get(l5h.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", l5h.a.class, " is not found"));
                        }
                        l5h.a aVar3 = ((l5h.a) aVar2.b()).f;
                        PhysicalDeliveryFlowContract$InputData physicalDeliveryFlowContract$InputData = physicalDeliveryFlow.K;
                        physicalDeliveryFlowContract$InputData.getClass();
                        return new l5h.c(aVar3, physicalDeliveryFlowContract$InputData);
                    case 1:
                        int i22 = R$id.screen_transparent_container;
                        PhysicalDeliveryFlow physicalDeliveryFlow2 = this.f222437b;
                        return czi.c.d(i22, 4, null, physicalDeliveryFlow2, (b) physicalDeliveryFlow2.O.getValue());
                    default:
                        return (b) ((l5h.c) this.f222437b.M.getValue()).f192270b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (o5h.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
