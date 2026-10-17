package com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.bridge;

import aii.q;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.bridge.CryptoSendDualChooserBridgeFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;
import yo5.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/bridge/CryptoSendDualChooserBridgeFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoSendDualChooserBridgeFlow extends ViewController<q> implements f {
    public final DualChooserContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CryptoSendDualChooserBridgeFlow(DualChooserContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: pp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendDualChooserBridgeFlow f238275b;

            {
                this.f238275b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CryptoSendDualChooserBridgeFlow cryptoSendDualChooserBridgeFlow = this.f238275b;
                        phm.a aVar = (phm.a) e.j(cryptoSendDualChooserBridgeFlow.m2()).a().get(go5.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", go5.c.class, " is not found"));
                        }
                        yo5.w wVar = ((yo5.w) ((yo5.a) aVar2.b())).f315599q;
                        DualChooserContract$InputData dualChooserContract$InputData = cryptoSendDualChooserBridgeFlow.K;
                        dualChooserContract$InputData.getClass();
                        return new u(wVar, dualChooserContract$InputData);
                    case 1:
                        return (b) ((u) this.f238275b.M.getValue()).f315586c.get();
                    default:
                        CryptoSendDualChooserBridgeFlow cryptoSendDualChooserBridgeFlow2 = this.f238275b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cryptoSendDualChooserBridgeFlow2, (b) cryptoSendDualChooserBridgeFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: pp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendDualChooserBridgeFlow f238275b;

            {
                this.f238275b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CryptoSendDualChooserBridgeFlow cryptoSendDualChooserBridgeFlow = this.f238275b;
                        phm.a aVar = (phm.a) e.j(cryptoSendDualChooserBridgeFlow.m2()).a().get(go5.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", go5.c.class, " is not found"));
                        }
                        yo5.w wVar = ((yo5.w) ((yo5.a) aVar2.b())).f315599q;
                        DualChooserContract$InputData dualChooserContract$InputData = cryptoSendDualChooserBridgeFlow.K;
                        dualChooserContract$InputData.getClass();
                        return new u(wVar, dualChooserContract$InputData);
                    case 1:
                        return (b) ((u) this.f238275b.M.getValue()).f315586c.get();
                    default:
                        CryptoSendDualChooserBridgeFlow cryptoSendDualChooserBridgeFlow2 = this.f238275b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cryptoSendDualChooserBridgeFlow2, (b) cryptoSendDualChooserBridgeFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: pp5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendDualChooserBridgeFlow f238275b;

            {
                this.f238275b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CryptoSendDualChooserBridgeFlow cryptoSendDualChooserBridgeFlow = this.f238275b;
                        phm.a aVar = (phm.a) e.j(cryptoSendDualChooserBridgeFlow.m2()).a().get(go5.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", go5.c.class, " is not found"));
                        }
                        yo5.w wVar = ((yo5.w) ((yo5.a) aVar2.b())).f315599q;
                        DualChooserContract$InputData dualChooserContract$InputData = cryptoSendDualChooserBridgeFlow.K;
                        dualChooserContract$InputData.getClass();
                        return new u(wVar, dualChooserContract$InputData);
                    case 1:
                        return (b) ((u) this.f238275b.M.getValue()).f315586c.get();
                    default:
                        CryptoSendDualChooserBridgeFlow cryptoSendDualChooserBridgeFlow2 = this.f238275b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cryptoSendDualChooserBridgeFlow2, (b) cryptoSendDualChooserBridgeFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (u) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (u) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (pp5.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
