package com.revolut.feature.apm.iris.impl.ui.pay;

import com.revolut.feature.apm.iris.impl.ui.pay.IrisPayFlow;
import com.revolut.feature.apm.iris.impl.ui.pay.IrisPayFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import j62.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import yki.c;
import yki.f;
import z52.j;
import z52.n;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/iris/impl/ui/pay/IrisPayFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lj62/e;", "Lyki/f;", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IrisPayFlow extends ViewController<e> implements f {
    public final IrisPayFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public IrisPayFlow(IrisPayFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: j62.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IrisPayFlow f171662b;

            {
                this.f171662b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        IrisPayFlow irisPayFlow = this.f171662b;
                        phm.a aVar = (phm.a) ue0.e.j(irisPayFlow.m2()).a().get(z52.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z52.e.class, " is not found"));
                        }
                        j jVar = ((j) ((z52.e) aVar2.b())).o;
                        IrisPayFlowContract$InputData irisPayFlowContract$InputData = irisPayFlow.K;
                        irisPayFlowContract$InputData.getClass();
                        return new n(jVar, irisPayFlowContract$InputData);
                    case 1:
                        return (b) ((n) this.f171662b.L.getValue()).e.get();
                    default:
                        IrisPayFlow irisPayFlow2 = this.f171662b;
                        return czi.c.d(0, 6, null, irisPayFlow2, (b) irisPayFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: j62.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IrisPayFlow f171662b;

            {
                this.f171662b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        IrisPayFlow irisPayFlow = this.f171662b;
                        phm.a aVar = (phm.a) ue0.e.j(irisPayFlow.m2()).a().get(z52.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z52.e.class, " is not found"));
                        }
                        j jVar = ((j) ((z52.e) aVar2.b())).o;
                        IrisPayFlowContract$InputData irisPayFlowContract$InputData = irisPayFlow.K;
                        irisPayFlowContract$InputData.getClass();
                        return new n(jVar, irisPayFlowContract$InputData);
                    case 1:
                        return (b) ((n) this.f171662b.L.getValue()).e.get();
                    default:
                        IrisPayFlow irisPayFlow2 = this.f171662b;
                        return czi.c.d(0, 6, null, irisPayFlow2, (b) irisPayFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: j62.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IrisPayFlow f171662b;

            {
                this.f171662b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        IrisPayFlow irisPayFlow = this.f171662b;
                        phm.a aVar = (phm.a) ue0.e.j(irisPayFlow.m2()).a().get(z52.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z52.e.class, " is not found"));
                        }
                        j jVar = ((j) ((z52.e) aVar2.b())).o;
                        IrisPayFlowContract$InputData irisPayFlowContract$InputData = irisPayFlow.K;
                        irisPayFlowContract$InputData.getClass();
                        return new n(jVar, irisPayFlowContract$InputData);
                    case 1:
                        return (b) ((n) this.f171662b.L.getValue()).e.get();
                    default:
                        IrisPayFlow irisPayFlow2 = this.f171662b;
                        return czi.c.d(0, 6, null, irisPayFlow2, (b) irisPayFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (n) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (n) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j62.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
