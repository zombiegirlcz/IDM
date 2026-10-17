package com.revolut.feature.tax_residency.impl.v2.ui.fatca_flow;

import com.revolut.feature.tax_residency.impl.v2.ui.fatca_flow.FatcaFlow;
import com.revolut.feature.tax_residency.impl.v2.ui.fatca_flow.FatcaFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import ine.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import tpe.f;
import xki.e;
import yki.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/fatca_flow/FatcaFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltpe/f;", "Lyki/f;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FatcaFlow extends ViewController<f> implements yki.f {
    public final FatcaFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public FatcaFlow(FatcaFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: tpe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FatcaFlow f273356b;

            {
                this.f273356b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        FatcaFlow fatcaFlow = this.f273356b;
                        phm.a aVar = (phm.a) ue0.e.j(fatcaFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f162885l;
                        FatcaFlowContract$InputData fatcaFlowContract$InputData = fatcaFlow.K;
                        fatcaFlowContract$InputData.getClass();
                        return new ine.f(oVar, fatcaFlowContract$InputData);
                    case 1:
                        return (b) ((ine.f) this.f273356b.L.getValue()).f162851c.get();
                    default:
                        FatcaFlow fatcaFlow2 = this.f273356b;
                        return czi.c.d(0, 6, null, fatcaFlow2, (b) fatcaFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: tpe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FatcaFlow f273356b;

            {
                this.f273356b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        FatcaFlow fatcaFlow = this.f273356b;
                        phm.a aVar = (phm.a) ue0.e.j(fatcaFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f162885l;
                        FatcaFlowContract$InputData fatcaFlowContract$InputData = fatcaFlow.K;
                        fatcaFlowContract$InputData.getClass();
                        return new ine.f(oVar, fatcaFlowContract$InputData);
                    case 1:
                        return (b) ((ine.f) this.f273356b.L.getValue()).f162851c.get();
                    default:
                        FatcaFlow fatcaFlow2 = this.f273356b;
                        return czi.c.d(0, 6, null, fatcaFlow2, (b) fatcaFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: tpe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FatcaFlow f273356b;

            {
                this.f273356b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        FatcaFlow fatcaFlow = this.f273356b;
                        phm.a aVar = (phm.a) ue0.e.j(fatcaFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f162885l;
                        FatcaFlowContract$InputData fatcaFlowContract$InputData = fatcaFlow.K;
                        fatcaFlowContract$InputData.getClass();
                        return new ine.f(oVar, fatcaFlowContract$InputData);
                    case 1:
                        return (b) ((ine.f) this.f273356b.L.getValue()).f162851c.get();
                    default:
                        FatcaFlow fatcaFlow2 = this.f273356b;
                        return czi.c.d(0, 6, null, fatcaFlow2, (b) fatcaFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ine.f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (ine.f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (tpe.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
