package com.revolut.feature.three_ds_verification.impl.ui;

import a0.d;
import aii.q;
import ase.c;
import com.revolut.feature.three_ds_verification.impl.ui.ThreeDsVerificationFlow;
import com.revolut.feature.three_ds_verification.impl.ui.ThreeDsVerificationFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/three_ds_verification/impl/ui/ThreeDsVerificationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_three_ds_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ThreeDsVerificationFlow extends ViewController<q> implements f {
    public final ThreeDsVerificationFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public ThreeDsVerificationFlow(ThreeDsVerificationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ase.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreeDsVerificationFlow f8928b;

            {
                this.f8928b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ThreeDsVerificationFlow threeDsVerificationFlow = this.f8928b;
                        phm.a aVar = (phm.a) e.j(threeDsVerificationFlow.m2()).a().get(yre.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", yre.e.class, " is not found"));
                        }
                        yre.e eVar = ((yre.e) aVar2.b()).u;
                        ThreeDsVerificationFlowContract$InputData threeDsVerificationFlowContract$InputData = threeDsVerificationFlow.K;
                        threeDsVerificationFlowContract$InputData.getClass();
                        return new yre.f(eVar, threeDsVerificationFlowContract$InputData);
                    case 1:
                        return (c) ((yre.f) this.f8928b.L.getValue()).e.get();
                    default:
                        ThreeDsVerificationFlow threeDsVerificationFlow2 = this.f8928b;
                        return czi.c.d(0, 6, null, threeDsVerificationFlow2, (c) threeDsVerificationFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ase.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreeDsVerificationFlow f8928b;

            {
                this.f8928b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ThreeDsVerificationFlow threeDsVerificationFlow = this.f8928b;
                        phm.a aVar = (phm.a) e.j(threeDsVerificationFlow.m2()).a().get(yre.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", yre.e.class, " is not found"));
                        }
                        yre.e eVar = ((yre.e) aVar2.b()).u;
                        ThreeDsVerificationFlowContract$InputData threeDsVerificationFlowContract$InputData = threeDsVerificationFlow.K;
                        threeDsVerificationFlowContract$InputData.getClass();
                        return new yre.f(eVar, threeDsVerificationFlowContract$InputData);
                    case 1:
                        return (c) ((yre.f) this.f8928b.L.getValue()).e.get();
                    default:
                        ThreeDsVerificationFlow threeDsVerificationFlow2 = this.f8928b;
                        return czi.c.d(0, 6, null, threeDsVerificationFlow2, (c) threeDsVerificationFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ase.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreeDsVerificationFlow f8928b;

            {
                this.f8928b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ThreeDsVerificationFlow threeDsVerificationFlow = this.f8928b;
                        phm.a aVar = (phm.a) e.j(threeDsVerificationFlow.m2()).a().get(yre.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", yre.e.class, " is not found"));
                        }
                        yre.e eVar = ((yre.e) aVar2.b()).u;
                        ThreeDsVerificationFlowContract$InputData threeDsVerificationFlowContract$InputData = threeDsVerificationFlow.K;
                        threeDsVerificationFlowContract$InputData.getClass();
                        return new yre.f(eVar, threeDsVerificationFlowContract$InputData);
                    case 1:
                        return (c) ((yre.f) this.f8928b.L.getValue()).e.get();
                    default:
                        ThreeDsVerificationFlow threeDsVerificationFlow2 = this.f8928b;
                        return czi.c.d(0, 6, null, threeDsVerificationFlow2, (c) threeDsVerificationFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (yre.f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (yre.f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
