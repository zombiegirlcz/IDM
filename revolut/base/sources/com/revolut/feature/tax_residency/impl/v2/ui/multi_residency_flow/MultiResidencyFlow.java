package com.revolut.feature.tax_residency.impl.v2.ui.multi_residency_flow;

import com.revolut.feature.tax_residency.impl.v2.ui.multi_residency_flow.MultiResidencyFlow;
import com.revolut.feature.tax_residency.impl.v2.ui.multi_residency_flow.MultiResidencyFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import ine.g;
import ine.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import wpe.f;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/multi_residency_flow/MultiResidencyFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwpe/f;", "Lyki/f;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MultiResidencyFlow extends ViewController<f> implements yki.f {
    public final MultiResidencyFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public MultiResidencyFlow(MultiResidencyFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: wpe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultiResidencyFlow f299226b;

            {
                this.f299226b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MultiResidencyFlow multiResidencyFlow = this.f299226b;
                        phm.a aVar = (phm.a) ue0.e.j(multiResidencyFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f162885l;
                        MultiResidencyFlowContract$InputData multiResidencyFlowContract$InputData = multiResidencyFlow.K;
                        multiResidencyFlowContract$InputData.getClass();
                        return new g(oVar, multiResidencyFlowContract$InputData);
                    case 1:
                        return (b) ((g) this.f299226b.L.getValue()).d.get();
                    default:
                        MultiResidencyFlow multiResidencyFlow2 = this.f299226b;
                        return czi.c.d(0, 6, null, multiResidencyFlow2, (b) multiResidencyFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: wpe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultiResidencyFlow f299226b;

            {
                this.f299226b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        MultiResidencyFlow multiResidencyFlow = this.f299226b;
                        phm.a aVar = (phm.a) ue0.e.j(multiResidencyFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f162885l;
                        MultiResidencyFlowContract$InputData multiResidencyFlowContract$InputData = multiResidencyFlow.K;
                        multiResidencyFlowContract$InputData.getClass();
                        return new g(oVar, multiResidencyFlowContract$InputData);
                    case 1:
                        return (b) ((g) this.f299226b.L.getValue()).d.get();
                    default:
                        MultiResidencyFlow multiResidencyFlow2 = this.f299226b;
                        return czi.c.d(0, 6, null, multiResidencyFlow2, (b) multiResidencyFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: wpe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultiResidencyFlow f299226b;

            {
                this.f299226b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        MultiResidencyFlow multiResidencyFlow = this.f299226b;
                        phm.a aVar = (phm.a) ue0.e.j(multiResidencyFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f162885l;
                        MultiResidencyFlowContract$InputData multiResidencyFlowContract$InputData = multiResidencyFlow.K;
                        multiResidencyFlowContract$InputData.getClass();
                        return new g(oVar, multiResidencyFlowContract$InputData);
                    case 1:
                        return (b) ((g) this.f299226b.L.getValue()).d.get();
                    default:
                        MultiResidencyFlow multiResidencyFlow2 = this.f299226b;
                        return czi.c.d(0, 6, null, multiResidencyFlow2, (b) multiResidencyFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (g) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (wpe.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
