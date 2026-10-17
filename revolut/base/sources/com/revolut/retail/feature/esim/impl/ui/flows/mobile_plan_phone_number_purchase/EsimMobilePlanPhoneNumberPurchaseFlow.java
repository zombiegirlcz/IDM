package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_phone_number_purchase;

import afj.k0;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_phone_number_purchase.EsimMobilePlanPhoneNumberPurchaseFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_phone_number_purchase.EsimMobilePlanPhoneNumberPurchaseFlowContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lgj.d;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_phone_number_purchase/EsimMobilePlanPhoneNumberPurchaseFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llgj/d;", "Lyki/f;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanPhoneNumberPurchaseFlow extends ViewController<d> implements f {
    public final EsimMobilePlanPhoneNumberPurchaseFlowContract$InputData K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;

    public EsimMobilePlanPhoneNumberPurchaseFlow(EsimMobilePlanPhoneNumberPurchaseFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: lgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPhoneNumberPurchaseFlow f195122b;

            {
                this.f195122b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        EsimMobilePlanPhoneNumberPurchaseFlow esimMobilePlanPhoneNumberPurchaseFlow = this.f195122b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, esimMobilePlanPhoneNumberPurchaseFlow, (b) esimMobilePlanPhoneNumberPurchaseFlow.O.getValue());
                    case 1:
                        EsimMobilePlanPhoneNumberPurchaseFlow esimMobilePlanPhoneNumberPurchaseFlow2 = this.f195122b;
                        phm.a aVar = (phm.a) ue0.e.j(esimMobilePlanPhoneNumberPurchaseFlow2.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimMobilePlanPhoneNumberPurchaseFlowContract$InputData esimMobilePlanPhoneNumberPurchaseFlowContract$InputData = esimMobilePlanPhoneNumberPurchaseFlow2.K;
                        esimMobilePlanPhoneNumberPurchaseFlowContract$InputData.getClass();
                        return new k0(bVar, esimMobilePlanPhoneNumberPurchaseFlowContract$InputData);
                    default:
                        return (b) ((k0) this.f195122b.N.getValue()).d.get();
                }
            }
        });
        this.M = R$layout.screen_transparent;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: lgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPhoneNumberPurchaseFlow f195122b;

            {
                this.f195122b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        EsimMobilePlanPhoneNumberPurchaseFlow esimMobilePlanPhoneNumberPurchaseFlow = this.f195122b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, esimMobilePlanPhoneNumberPurchaseFlow, (b) esimMobilePlanPhoneNumberPurchaseFlow.O.getValue());
                    case 1:
                        EsimMobilePlanPhoneNumberPurchaseFlow esimMobilePlanPhoneNumberPurchaseFlow2 = this.f195122b;
                        phm.a aVar = (phm.a) ue0.e.j(esimMobilePlanPhoneNumberPurchaseFlow2.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimMobilePlanPhoneNumberPurchaseFlowContract$InputData esimMobilePlanPhoneNumberPurchaseFlowContract$InputData = esimMobilePlanPhoneNumberPurchaseFlow2.K;
                        esimMobilePlanPhoneNumberPurchaseFlowContract$InputData.getClass();
                        return new k0(bVar, esimMobilePlanPhoneNumberPurchaseFlowContract$InputData);
                    default:
                        return (b) ((k0) this.f195122b.N.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: lgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPhoneNumberPurchaseFlow f195122b;

            {
                this.f195122b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        EsimMobilePlanPhoneNumberPurchaseFlow esimMobilePlanPhoneNumberPurchaseFlow = this.f195122b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, esimMobilePlanPhoneNumberPurchaseFlow, (b) esimMobilePlanPhoneNumberPurchaseFlow.O.getValue());
                    case 1:
                        EsimMobilePlanPhoneNumberPurchaseFlow esimMobilePlanPhoneNumberPurchaseFlow2 = this.f195122b;
                        phm.a aVar = (phm.a) ue0.e.j(esimMobilePlanPhoneNumberPurchaseFlow2.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimMobilePlanPhoneNumberPurchaseFlowContract$InputData esimMobilePlanPhoneNumberPurchaseFlowContract$InputData = esimMobilePlanPhoneNumberPurchaseFlow2.K;
                        esimMobilePlanPhoneNumberPurchaseFlowContract$InputData.getClass();
                        return new k0(bVar, esimMobilePlanPhoneNumberPurchaseFlowContract$InputData);
                    default:
                        return (b) ((k0) this.f195122b.N.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (k0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (lgj.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.L.getValue();
    }
}
