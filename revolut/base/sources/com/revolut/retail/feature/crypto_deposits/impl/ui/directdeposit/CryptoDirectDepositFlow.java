package com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit;

import aii.q;
import android.content.Intent;
import com.revolut.feature.crypto.tfr.validation.api.model.MeshEvent;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlow;
import com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlowContract$InputData;
import java.util.ArrayList;
import jh.d;
import jli.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import qbj.t;
import skm.a2;
import te0.w;
import xki.e;
import ybj.c;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/directdeposit/CryptoDirectDepositFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoDirectDepositFlow extends ViewController<q> implements f {
    public final CryptoDirectDepositFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CryptoDirectDepositFlow(CryptoDirectDepositFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ybj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoDirectDepositFlow f312374b;

            {
                this.f312374b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CryptoDirectDepositFlow cryptoDirectDepositFlow = this.f312374b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cryptoDirectDepositFlow, (c) cryptoDirectDepositFlow.O.getValue());
                    case 1:
                        CryptoDirectDepositFlow cryptoDirectDepositFlow2 = this.f312374b;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoDirectDepositFlow2.m2()).a().get(qbj.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qbj.q.class, " is not found"));
                        }
                        qbj.q qVar = ((qbj.q) aVar2.b()).v;
                        CryptoDirectDepositFlowContract$InputData cryptoDirectDepositFlowContract$InputData = cryptoDirectDepositFlow2.K;
                        cryptoDirectDepositFlowContract$InputData.getClass();
                        return new t(qVar, cryptoDirectDepositFlowContract$InputData);
                    default:
                        return (c) ((t) this.f312374b.N.getValue()).f244358b.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ybj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoDirectDepositFlow f312374b;

            {
                this.f312374b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CryptoDirectDepositFlow cryptoDirectDepositFlow = this.f312374b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cryptoDirectDepositFlow, (c) cryptoDirectDepositFlow.O.getValue());
                    case 1:
                        CryptoDirectDepositFlow cryptoDirectDepositFlow2 = this.f312374b;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoDirectDepositFlow2.m2()).a().get(qbj.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qbj.q.class, " is not found"));
                        }
                        qbj.q qVar = ((qbj.q) aVar2.b()).v;
                        CryptoDirectDepositFlowContract$InputData cryptoDirectDepositFlowContract$InputData = cryptoDirectDepositFlow2.K;
                        cryptoDirectDepositFlowContract$InputData.getClass();
                        return new t(qVar, cryptoDirectDepositFlowContract$InputData);
                    default:
                        return (c) ((t) this.f312374b.N.getValue()).f244358b.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: ybj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoDirectDepositFlow f312374b;

            {
                this.f312374b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CryptoDirectDepositFlow cryptoDirectDepositFlow = this.f312374b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cryptoDirectDepositFlow, (c) cryptoDirectDepositFlow.O.getValue());
                    case 1:
                        CryptoDirectDepositFlow cryptoDirectDepositFlow2 = this.f312374b;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoDirectDepositFlow2.m2()).a().get(qbj.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qbj.q.class, " is not found"));
                        }
                        qbj.q qVar = ((qbj.q) aVar2.b()).v;
                        CryptoDirectDepositFlowContract$InputData cryptoDirectDepositFlowContract$InputData = cryptoDirectDepositFlow2.K;
                        cryptoDirectDepositFlowContract$InputData.getClass();
                        return new t(qVar, cryptoDirectDepositFlowContract$InputData);
                    default:
                        return (c) ((t) this.f312374b.N.getValue()).f244358b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (t) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        b bVar = (b) ((c) this.O.getValue());
        ArrayList<MeshEvent> arrayList = bVar.f100072w;
        if (i == 54332) {
            a2 a2Var = bVar.f100073x;
            if (a2Var != null) {
                a2Var.f(null);
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            for (MeshEvent meshEvent : arrayList) {
                if (meshEvent instanceof MeshEvent.TransferCompleted) {
                    ref$ObjectRef.f186409a = meshEvent;
                } else if (meshEvent instanceof MeshEvent.IntegrationConnected) {
                    ref$ObjectRef2.f186409a = meshEvent;
                } else {
                    int i3 = h.f175850a;
                }
            }
            arrayList.clear();
            if (ref$ObjectRef.f186409a == null) {
                oki.h.D2(bVar.z);
                return;
            }
            bVar.H2(bVar.f100074y, new ay0.b(ref$ObjectRef, ref$ObjectRef2, 2));
            if (d.h(bVar.u.a())) {
                bVar.M2();
            }
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
