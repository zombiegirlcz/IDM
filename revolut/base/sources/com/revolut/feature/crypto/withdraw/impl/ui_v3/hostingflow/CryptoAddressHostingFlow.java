package com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingflow;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingFlowInput;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingflow.CryptoAddressHostingFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import rq5.d;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;
import yo5.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/hostingflow/CryptoAddressHostingFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrq5/d;", "Lyki/f;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoAddressHostingFlow extends ViewController<d> implements f {
    public final CryptoAddressHostingFlowInput K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CryptoAddressHostingFlow(CryptoAddressHostingFlowInput inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: rq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAddressHostingFlow f256477b;

            {
                this.f256477b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CryptoAddressHostingFlow cryptoAddressHostingFlow = this.f256477b;
                        phm.a aVar = (phm.a) e.j(cryptoAddressHostingFlow.m2()).a().get(go5.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", go5.c.class, " is not found"));
                        }
                        yo5.w wVar = ((yo5.w) ((yo5.a) aVar2.b())).f315599q;
                        CryptoAddressHostingFlowInput cryptoAddressHostingFlowInput = cryptoAddressHostingFlow.K;
                        cryptoAddressHostingFlowInput.getClass();
                        return new s(wVar, cryptoAddressHostingFlowInput);
                    case 1:
                        return (b) ((s) this.f256477b.M.getValue()).d.get();
                    default:
                        CryptoAddressHostingFlow cryptoAddressHostingFlow2 = this.f256477b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cryptoAddressHostingFlow2, (b) cryptoAddressHostingFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: rq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAddressHostingFlow f256477b;

            {
                this.f256477b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CryptoAddressHostingFlow cryptoAddressHostingFlow = this.f256477b;
                        phm.a aVar = (phm.a) e.j(cryptoAddressHostingFlow.m2()).a().get(go5.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", go5.c.class, " is not found"));
                        }
                        yo5.w wVar = ((yo5.w) ((yo5.a) aVar2.b())).f315599q;
                        CryptoAddressHostingFlowInput cryptoAddressHostingFlowInput = cryptoAddressHostingFlow.K;
                        cryptoAddressHostingFlowInput.getClass();
                        return new s(wVar, cryptoAddressHostingFlowInput);
                    case 1:
                        return (b) ((s) this.f256477b.M.getValue()).d.get();
                    default:
                        CryptoAddressHostingFlow cryptoAddressHostingFlow2 = this.f256477b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cryptoAddressHostingFlow2, (b) cryptoAddressHostingFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: rq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAddressHostingFlow f256477b;

            {
                this.f256477b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CryptoAddressHostingFlow cryptoAddressHostingFlow = this.f256477b;
                        phm.a aVar = (phm.a) e.j(cryptoAddressHostingFlow.m2()).a().get(go5.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", go5.c.class, " is not found"));
                        }
                        yo5.w wVar = ((yo5.w) ((yo5.a) aVar2.b())).f315599q;
                        CryptoAddressHostingFlowInput cryptoAddressHostingFlowInput = cryptoAddressHostingFlow.K;
                        cryptoAddressHostingFlowInput.getClass();
                        return new s(wVar, cryptoAddressHostingFlowInput);
                    case 1:
                        return (b) ((s) this.f256477b.M.getValue()).d.get();
                    default:
                        CryptoAddressHostingFlow cryptoAddressHostingFlow2 = this.f256477b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cryptoAddressHostingFlow2, (b) cryptoAddressHostingFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (s) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (s) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (rq5.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
