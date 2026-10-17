package com.revolut.feature.crypto.withdraw.impl.ui_v3;

import com.revolut.feature.crypto.withdraw.api.navigation.CryptoSendInput;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.CryptoSendFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lo5.q;
import qji.b;
import te0.w;
import xki.e;
import yki.f;
import zp5.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llo5/q;", "Lyki/f;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoSendFlow extends ViewController<q> implements f {
    public final CryptoSendInput K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CryptoSendFlow(CryptoSendInput inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: zp5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendFlow f324170b;

            {
                this.f324170b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CryptoSendFlow cryptoSendFlow = this.f324170b;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoSendFlow.m2()).a().get(zo5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zo5.d.class, " is not found"));
                        }
                        zo5.d dVar = ((zo5.d) aVar2.b()).E;
                        CryptoSendInput cryptoSendInput = cryptoSendFlow.K;
                        cryptoSendInput.getClass();
                        return new zo5.f(dVar, cryptoSendInput);
                    case 1:
                        return (c) ((zo5.f) this.f324170b.M.getValue()).e.get();
                    default:
                        CryptoSendFlow cryptoSendFlow2 = this.f324170b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cryptoSendFlow2, (c) cryptoSendFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: zp5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendFlow f324170b;

            {
                this.f324170b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CryptoSendFlow cryptoSendFlow = this.f324170b;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoSendFlow.m2()).a().get(zo5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zo5.d.class, " is not found"));
                        }
                        zo5.d dVar = ((zo5.d) aVar2.b()).E;
                        CryptoSendInput cryptoSendInput = cryptoSendFlow.K;
                        cryptoSendInput.getClass();
                        return new zo5.f(dVar, cryptoSendInput);
                    case 1:
                        return (c) ((zo5.f) this.f324170b.M.getValue()).e.get();
                    default:
                        CryptoSendFlow cryptoSendFlow2 = this.f324170b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cryptoSendFlow2, (c) cryptoSendFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: zp5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendFlow f324170b;

            {
                this.f324170b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CryptoSendFlow cryptoSendFlow = this.f324170b;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoSendFlow.m2()).a().get(zo5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zo5.d.class, " is not found"));
                        }
                        zo5.d dVar = ((zo5.d) aVar2.b()).E;
                        CryptoSendInput cryptoSendInput = cryptoSendFlow.K;
                        cryptoSendInput.getClass();
                        return new zo5.f(dVar, cryptoSendInput);
                    case 1:
                        return (c) ((zo5.f) this.f324170b.M.getValue()).e.get();
                    default:
                        CryptoSendFlow cryptoSendFlow2 = this.f324170b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cryptoSendFlow2, (c) cryptoSendFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (zo5.f) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (zo5.f) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
