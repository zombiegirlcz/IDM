package com.revolut.feature.kyc.impl.flow.kyc;

import aii.q;
import android.content.ComponentCallbacks2;
import com.revolut.feature.kyc.impl.KycActivity;
import com.revolut.feature.kyc.impl.flow.kyc.KycFlow;
import com.revolut.feature.kyc.impl.flow.kyc.KycFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pv8.c;
import qji.b;
import te0.w;
import xki.e;
import yki.f;
import zu8.c0;
import zu8.e0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KycFlow extends ViewController<q> implements f {
    public final KycFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public KycFlow(KycFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: pv8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycFlow f240004b;

            {
                this.f240004b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KycFlow kycFlow = this.f240004b;
                        phm.a aVar = (phm.a) ue0.e.j(kycFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        KycFlowContract$InputData kycFlowContract$InputData = kycFlow.K;
                        kycFlowContract$InputData.getClass();
                        ComponentCallbacks2 componentCallbacks2M2 = kycFlow.m2();
                        Intrinsics.i(componentCallbacks2M2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.flow.kyc.bridge.provider.KycFlowBridgeInteractorProvider");
                        qv8.b bVar = ((KycActivity) ((rv8.a) componentCallbacks2M2)).f77531w0;
                        if (bVar != null) {
                            return new e0(c0Var, kycFlowContract$InputData, bVar);
                        }
                        Intrinsics.r("kycFlowBridgeInteractor");
                        throw null;
                    case 1:
                        return (c) ((e0) this.f240004b.L.getValue()).i.get();
                    default:
                        KycFlow kycFlow2 = this.f240004b;
                        return czi.c.d(0, 6, null, kycFlow2, (c) kycFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: pv8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycFlow f240004b;

            {
                this.f240004b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KycFlow kycFlow = this.f240004b;
                        phm.a aVar = (phm.a) ue0.e.j(kycFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        KycFlowContract$InputData kycFlowContract$InputData = kycFlow.K;
                        kycFlowContract$InputData.getClass();
                        ComponentCallbacks2 componentCallbacks2M2 = kycFlow.m2();
                        Intrinsics.i(componentCallbacks2M2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.flow.kyc.bridge.provider.KycFlowBridgeInteractorProvider");
                        qv8.b bVar = ((KycActivity) ((rv8.a) componentCallbacks2M2)).f77531w0;
                        if (bVar != null) {
                            return new e0(c0Var, kycFlowContract$InputData, bVar);
                        }
                        Intrinsics.r("kycFlowBridgeInteractor");
                        throw null;
                    case 1:
                        return (c) ((e0) this.f240004b.L.getValue()).i.get();
                    default:
                        KycFlow kycFlow2 = this.f240004b;
                        return czi.c.d(0, 6, null, kycFlow2, (c) kycFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: pv8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycFlow f240004b;

            {
                this.f240004b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        KycFlow kycFlow = this.f240004b;
                        phm.a aVar = (phm.a) ue0.e.j(kycFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        KycFlowContract$InputData kycFlowContract$InputData = kycFlow.K;
                        kycFlowContract$InputData.getClass();
                        ComponentCallbacks2 componentCallbacks2M2 = kycFlow.m2();
                        Intrinsics.i(componentCallbacks2M2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.flow.kyc.bridge.provider.KycFlowBridgeInteractorProvider");
                        qv8.b bVar = ((KycActivity) ((rv8.a) componentCallbacks2M2)).f77531w0;
                        if (bVar != null) {
                            return new e0(c0Var, kycFlowContract$InputData, bVar);
                        }
                        Intrinsics.r("kycFlowBridgeInteractor");
                        throw null;
                    case 1:
                        return (c) ((e0) this.f240004b.L.getValue()).i.get();
                    default:
                        KycFlow kycFlow2 = this.f240004b;
                        return czi.c.d(0, 6, null, kycFlow2, (c) kycFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (e0) this.L.getValue();
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
