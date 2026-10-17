package com.revolut.feature.apm.multibanco.impl.ui.pay;

import com.revolut.feature.apm.multibanco.impl.ui.pay.MultibancoPayFlow;
import com.revolut.feature.apm.multibanco.impl.ui.pay.MultibancoPayFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import i72.m;
import i72.t;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/pay/MultibancoPayFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lyki/f;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MultibancoPayFlow extends ViewController<Object> implements f {
    public final MultibancoPayFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public MultibancoPayFlow(MultibancoPayFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: e82.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultibancoPayFlow f123559b;

            {
                this.f123559b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MultibancoPayFlow multibancoPayFlow = this.f123559b;
                        phm.a aVar = (phm.a) ue0.e.j(multibancoPayFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).A;
                        MultibancoPayFlowContract$InputData multibancoPayFlowContract$InputData = multibancoPayFlow.K;
                        multibancoPayFlowContract$InputData.getClass();
                        return new t(mVar, multibancoPayFlowContract$InputData);
                    case 1:
                        return (b) ((t) this.f123559b.L.getValue()).f159166c.get();
                    default:
                        MultibancoPayFlow multibancoPayFlow2 = this.f123559b;
                        return czi.c.d(0, 6, null, multibancoPayFlow2, (b) multibancoPayFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: e82.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultibancoPayFlow f123559b;

            {
                this.f123559b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        MultibancoPayFlow multibancoPayFlow = this.f123559b;
                        phm.a aVar = (phm.a) ue0.e.j(multibancoPayFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).A;
                        MultibancoPayFlowContract$InputData multibancoPayFlowContract$InputData = multibancoPayFlow.K;
                        multibancoPayFlowContract$InputData.getClass();
                        return new t(mVar, multibancoPayFlowContract$InputData);
                    case 1:
                        return (b) ((t) this.f123559b.L.getValue()).f159166c.get();
                    default:
                        MultibancoPayFlow multibancoPayFlow2 = this.f123559b;
                        return czi.c.d(0, 6, null, multibancoPayFlow2, (b) multibancoPayFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: e82.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultibancoPayFlow f123559b;

            {
                this.f123559b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        MultibancoPayFlow multibancoPayFlow = this.f123559b;
                        phm.a aVar = (phm.a) ue0.e.j(multibancoPayFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).A;
                        MultibancoPayFlowContract$InputData multibancoPayFlowContract$InputData = multibancoPayFlow.K;
                        multibancoPayFlowContract$InputData.getClass();
                        return new t(mVar, multibancoPayFlowContract$InputData);
                    case 1:
                        return (b) ((t) this.f123559b.L.getValue()).f159166c.get();
                    default:
                        MultibancoPayFlow multibancoPayFlow2 = this.f123559b;
                        return czi.c.d(0, 6, null, multibancoPayFlow2, (b) multibancoPayFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (t) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (e82.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
