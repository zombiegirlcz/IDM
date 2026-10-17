package com.revolut.feature.apm.multibanco.impl.ui.pending;

import a0.d;
import aii.q;
import com.revolut.feature.apm.multibanco.impl.ui.pending.MultibancoPendingPaymentFlow;
import com.revolut.feature.apm.multibanco.impl.ui.pending.MultibancoPendingPaymentFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import i72.m;
import i72.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/pending/MultibancoPendingPaymentFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MultibancoPendingPaymentFlow extends ViewController<q> implements f {
    public final MultibancoPendingPaymentFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public MultibancoPendingPaymentFlow(MultibancoPendingPaymentFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: i82.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultibancoPendingPaymentFlow f159412b;

            {
                this.f159412b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MultibancoPendingPaymentFlow multibancoPendingPaymentFlow = this.f159412b;
                        phm.a aVar = (phm.a) e.j(multibancoPendingPaymentFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).A;
                        MultibancoPendingPaymentFlowContract$InputData multibancoPendingPaymentFlowContract$InputData = multibancoPendingPaymentFlow.K;
                        multibancoPendingPaymentFlowContract$InputData.getClass();
                        return new u(mVar, multibancoPendingPaymentFlowContract$InputData);
                    case 1:
                        return (b) ((u) this.f159412b.L.getValue()).f.get();
                    default:
                        MultibancoPendingPaymentFlow multibancoPendingPaymentFlow2 = this.f159412b;
                        return czi.c.d(0, 6, null, multibancoPendingPaymentFlow2, (b) multibancoPendingPaymentFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: i82.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultibancoPendingPaymentFlow f159412b;

            {
                this.f159412b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        MultibancoPendingPaymentFlow multibancoPendingPaymentFlow = this.f159412b;
                        phm.a aVar = (phm.a) e.j(multibancoPendingPaymentFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).A;
                        MultibancoPendingPaymentFlowContract$InputData multibancoPendingPaymentFlowContract$InputData = multibancoPendingPaymentFlow.K;
                        multibancoPendingPaymentFlowContract$InputData.getClass();
                        return new u(mVar, multibancoPendingPaymentFlowContract$InputData);
                    case 1:
                        return (b) ((u) this.f159412b.L.getValue()).f.get();
                    default:
                        MultibancoPendingPaymentFlow multibancoPendingPaymentFlow2 = this.f159412b;
                        return czi.c.d(0, 6, null, multibancoPendingPaymentFlow2, (b) multibancoPendingPaymentFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: i82.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultibancoPendingPaymentFlow f159412b;

            {
                this.f159412b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        MultibancoPendingPaymentFlow multibancoPendingPaymentFlow = this.f159412b;
                        phm.a aVar = (phm.a) e.j(multibancoPendingPaymentFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).A;
                        MultibancoPendingPaymentFlowContract$InputData multibancoPendingPaymentFlowContract$InputData = multibancoPendingPaymentFlow.K;
                        multibancoPendingPaymentFlowContract$InputData.getClass();
                        return new u(mVar, multibancoPendingPaymentFlowContract$InputData);
                    case 1:
                        return (b) ((u) this.f159412b.L.getValue()).f.get();
                    default:
                        MultibancoPendingPaymentFlow multibancoPendingPaymentFlow2 = this.f159412b;
                        return czi.c.d(0, 6, null, multibancoPendingPaymentFlow2, (b) multibancoPendingPaymentFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (u) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (u) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i82.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
