package com.revolut.feature.kyc.impl.flow.addressverification;

import android.content.Intent;
import com.revolut.feature.kyc.impl.flow.addressverification.ProofOfAddressFlow;
import com.revolut.feature.kyc.impl.flow.addressverification.ProofOfAddressFlowContract$ActionOnResult;
import com.revolut.feature.kyc.impl.flow.addressverification.ProofOfAddressFlowContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ks8.d;
import nv8.c;
import qji.b;
import te0.w;
import xki.e;
import yki.f;
import zu8.c0;
import zu8.g0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lks8/d;", "Lyki/f;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProofOfAddressFlow extends ViewController<d> implements f {
    public final ProofOfAddressFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final boolean O;

    public ProofOfAddressFlow(ProofOfAddressFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: nv8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProofOfAddressFlow f219560b;

            {
                this.f219560b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ProofOfAddressFlow proofOfAddressFlow = this.f219560b;
                        phm.a aVar = (phm.a) ue0.e.j(proofOfAddressFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        ProofOfAddressFlowContract$InputData proofOfAddressFlowContract$InputData = proofOfAddressFlow.K;
                        proofOfAddressFlowContract$InputData.getClass();
                        return new g0(c0Var, proofOfAddressFlowContract$InputData);
                    case 1:
                        return (c) ((g0) this.f219560b.L.getValue()).d.get();
                    default:
                        ProofOfAddressFlow proofOfAddressFlow2 = this.f219560b;
                        return czi.c.d(0, 6, null, proofOfAddressFlow2, (c) proofOfAddressFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: nv8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProofOfAddressFlow f219560b;

            {
                this.f219560b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ProofOfAddressFlow proofOfAddressFlow = this.f219560b;
                        phm.a aVar = (phm.a) ue0.e.j(proofOfAddressFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        ProofOfAddressFlowContract$InputData proofOfAddressFlowContract$InputData = proofOfAddressFlow.K;
                        proofOfAddressFlowContract$InputData.getClass();
                        return new g0(c0Var, proofOfAddressFlowContract$InputData);
                    case 1:
                        return (c) ((g0) this.f219560b.L.getValue()).d.get();
                    default:
                        ProofOfAddressFlow proofOfAddressFlow2 = this.f219560b;
                        return czi.c.d(0, 6, null, proofOfAddressFlow2, (c) proofOfAddressFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: nv8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProofOfAddressFlow f219560b;

            {
                this.f219560b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ProofOfAddressFlow proofOfAddressFlow = this.f219560b;
                        phm.a aVar = (phm.a) ue0.e.j(proofOfAddressFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        ProofOfAddressFlowContract$InputData proofOfAddressFlowContract$InputData = proofOfAddressFlow.K;
                        proofOfAddressFlowContract$InputData.getClass();
                        return new g0(c0Var, proofOfAddressFlowContract$InputData);
                    case 1:
                        return (c) ((g0) this.f219560b.L.getValue()).d.get();
                    default:
                        ProofOfAddressFlow proofOfAddressFlow2 = this.f219560b;
                        return czi.c.d(0, 6, null, proofOfAddressFlow2, (c) proofOfAddressFlow2.M.getValue());
                }
            }
        });
        this.O = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (g0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        if (i2 == -1) {
            a aVar = (a) ((c) this.M.getValue());
            if (i != 10001) {
                aVar.getClass();
                return;
            }
            ProofOfAddressFlowContract$InputData proofOfAddressFlowContract$InputData = aVar.o;
            ProofOfAddressFlowContract$ActionOnResult proofOfAddressFlowContract$ActionOnResult = proofOfAddressFlowContract$InputData.f77681b;
            if (proofOfAddressFlowContract$ActionOnResult instanceof ProofOfAddressFlowContract$ActionOnResult.Finish) {
                aVar.C1(new BridgeDestination(new FinishCommand(-1, null, null, 6)));
            } else if (proofOfAddressFlowContract$ActionOnResult instanceof ProofOfAddressFlowContract$ActionOnResult.OpenNextScreen) {
                aVar.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), ((ProofOfAddressFlowContract$ActionOnResult.OpenNextScreen) proofOfAddressFlowContract$InputData.f77681b).f77676a)));
            } else {
                if (!Intrinsics.f(proofOfAddressFlowContract$ActionOnResult, ProofOfAddressFlowContract$ActionOnResult.CompleteFlow.f77674a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.C2(d.f189308a);
            }
        }
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
