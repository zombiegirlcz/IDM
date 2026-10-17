package com.revolut.feature_crypto_order_flow.impl.flow;

import a0.d;
import aii.q;
import com.revolut.feature_crypto_order_flow.api.navigation.CryptoExchangeFlowInputData;
import com.revolut.feature_crypto_order_flow.impl.flow.CryptoExchangeFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import tyh.c;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/flow/CryptoExchangeFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoExchangeFlow extends ViewController<q> implements f {
    public final CryptoExchangeFlowInputData K;
    public final Object L;
    public final boolean M;
    public final int N;
    public final Object O;
    public final Object P;

    public CryptoExchangeFlow(CryptoExchangeFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: dzh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoExchangeFlow f121342b;

            {
                this.f121342b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CryptoExchangeFlow cryptoExchangeFlow = this.f121342b;
                        phm.a aVar = (phm.a) e.j(cryptoExchangeFlow.m2()).a().get(tyh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", tyh.b.class, " is not found"));
                        }
                        tyh.b bVar = ((tyh.b) aVar2.b()).N;
                        CryptoExchangeFlowInputData cryptoExchangeFlowInputData = cryptoExchangeFlow.K;
                        cryptoExchangeFlowInputData.getClass();
                        return new tyh.c(bVar, cryptoExchangeFlow, cryptoExchangeFlowInputData);
                    case 1:
                        return (b) ((tyh.c) this.f121342b.L.getValue()).f275607h.get();
                    default:
                        CryptoExchangeFlow cryptoExchangeFlow2 = this.f121342b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cryptoExchangeFlow2, (b) cryptoExchangeFlow2.O.getValue());
                }
            }
        });
        this.M = true;
        this.N = R$layout.screen_transparent;
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: dzh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoExchangeFlow f121342b;

            {
                this.f121342b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CryptoExchangeFlow cryptoExchangeFlow = this.f121342b;
                        phm.a aVar = (phm.a) e.j(cryptoExchangeFlow.m2()).a().get(tyh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", tyh.b.class, " is not found"));
                        }
                        tyh.b bVar = ((tyh.b) aVar2.b()).N;
                        CryptoExchangeFlowInputData cryptoExchangeFlowInputData = cryptoExchangeFlow.K;
                        cryptoExchangeFlowInputData.getClass();
                        return new tyh.c(bVar, cryptoExchangeFlow, cryptoExchangeFlowInputData);
                    case 1:
                        return (b) ((tyh.c) this.f121342b.L.getValue()).f275607h.get();
                    default:
                        CryptoExchangeFlow cryptoExchangeFlow2 = this.f121342b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cryptoExchangeFlow2, (b) cryptoExchangeFlow2.O.getValue());
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: dzh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoExchangeFlow f121342b;

            {
                this.f121342b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CryptoExchangeFlow cryptoExchangeFlow = this.f121342b;
                        phm.a aVar = (phm.a) e.j(cryptoExchangeFlow.m2()).a().get(tyh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", tyh.b.class, " is not found"));
                        }
                        tyh.b bVar = ((tyh.b) aVar2.b()).N;
                        CryptoExchangeFlowInputData cryptoExchangeFlowInputData = cryptoExchangeFlow.K;
                        cryptoExchangeFlowInputData.getClass();
                        return new tyh.c(bVar, cryptoExchangeFlow, cryptoExchangeFlowInputData);
                    case 1:
                        return (b) ((tyh.c) this.f121342b.L.getValue()).f275607h.get();
                    default:
                        CryptoExchangeFlow cryptoExchangeFlow2 = this.f121342b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cryptoExchangeFlow2, (b) cryptoExchangeFlow2.O.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (dzh.b) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: T2 */
    public final Boolean getG() {
        return Boolean.valueOf(this.M);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.P.getValue();
    }
}
