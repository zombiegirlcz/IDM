package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator;

import afj.c0;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/orchestrator/EsimMobilePlanNumberTransferConfirmationOrchestratorFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/orchestrator/a;", "Lyki/f;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanNumberTransferConfirmationOrchestratorFlow extends ViewController<a> implements f {
    public final EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;

    public EsimMobilePlanNumberTransferConfirmationOrchestratorFlow(EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: hgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanNumberTransferConfirmationOrchestratorFlow f152183b;

            {
                this.f152183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        EsimMobilePlanNumberTransferConfirmationOrchestratorFlow esimMobilePlanNumberTransferConfirmationOrchestratorFlow = this.f152183b;
                        phm.a aVar = (phm.a) ue0.e.j(esimMobilePlanNumberTransferConfirmationOrchestratorFlow.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData = esimMobilePlanNumberTransferConfirmationOrchestratorFlow.K;
                        esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.getClass();
                        return new c0(bVar, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData);
                    case 1:
                        return (b) ((c0) this.f152183b.L.getValue()).f4187c.get();
                    default:
                        EsimMobilePlanNumberTransferConfirmationOrchestratorFlow esimMobilePlanNumberTransferConfirmationOrchestratorFlow2 = this.f152183b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, esimMobilePlanNumberTransferConfirmationOrchestratorFlow2, (b) esimMobilePlanNumberTransferConfirmationOrchestratorFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: hgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanNumberTransferConfirmationOrchestratorFlow f152183b;

            {
                this.f152183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        EsimMobilePlanNumberTransferConfirmationOrchestratorFlow esimMobilePlanNumberTransferConfirmationOrchestratorFlow = this.f152183b;
                        phm.a aVar = (phm.a) ue0.e.j(esimMobilePlanNumberTransferConfirmationOrchestratorFlow.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData = esimMobilePlanNumberTransferConfirmationOrchestratorFlow.K;
                        esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.getClass();
                        return new c0(bVar, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData);
                    case 1:
                        return (b) ((c0) this.f152183b.L.getValue()).f4187c.get();
                    default:
                        EsimMobilePlanNumberTransferConfirmationOrchestratorFlow esimMobilePlanNumberTransferConfirmationOrchestratorFlow2 = this.f152183b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, esimMobilePlanNumberTransferConfirmationOrchestratorFlow2, (b) esimMobilePlanNumberTransferConfirmationOrchestratorFlow2.M.getValue());
                }
            }
        });
        this.N = R$layout.screen_transparent;
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: hgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanNumberTransferConfirmationOrchestratorFlow f152183b;

            {
                this.f152183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        EsimMobilePlanNumberTransferConfirmationOrchestratorFlow esimMobilePlanNumberTransferConfirmationOrchestratorFlow = this.f152183b;
                        phm.a aVar = (phm.a) ue0.e.j(esimMobilePlanNumberTransferConfirmationOrchestratorFlow.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData = esimMobilePlanNumberTransferConfirmationOrchestratorFlow.K;
                        esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.getClass();
                        return new c0(bVar, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData);
                    case 1:
                        return (b) ((c0) this.f152183b.L.getValue()).f4187c.get();
                    default:
                        EsimMobilePlanNumberTransferConfirmationOrchestratorFlow esimMobilePlanNumberTransferConfirmationOrchestratorFlow2 = this.f152183b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, esimMobilePlanNumberTransferConfirmationOrchestratorFlow2, (b) esimMobilePlanNumberTransferConfirmationOrchestratorFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (c0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (hgj.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
