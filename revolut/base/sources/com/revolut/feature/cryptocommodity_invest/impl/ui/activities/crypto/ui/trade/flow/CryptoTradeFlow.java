package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.flow;

import aii.q;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.flow.CryptoTradeFlow;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.flow.CryptoTradeFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import ix5.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/crypto/ui/trade/flow/CryptoTradeFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoTradeFlow extends ViewController<q> implements f {
    public final CryptoTradeFlowContract$InputData K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;

    public CryptoTradeFlow(CryptoTradeFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: jx5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoTradeFlow f179063b;

            {
                this.f179063b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CryptoTradeFlow cryptoTradeFlow = this.f179063b;
                        phm.a aVar = (phm.a) e.j(cryptoTradeFlow.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        d dVar = ((d) aVar2.b()).f169353n;
                        CryptoTradeFlowContract$InputData cryptoTradeFlowContract$InputData = cryptoTradeFlow.K;
                        cryptoTradeFlowContract$InputData.getClass();
                        return new ix5.e(dVar, cryptoTradeFlowContract$InputData);
                    case 1:
                        return (b) ((ix5.e) this.f179063b.L.getValue()).d.get();
                    default:
                        CryptoTradeFlow cryptoTradeFlow2 = this.f179063b;
                        return c.d(R$id.screen_transparent_container, 4, null, cryptoTradeFlow2, (b) cryptoTradeFlow2.N.getValue());
                }
            }
        });
        this.M = R$layout.screen_transparent;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: jx5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoTradeFlow f179063b;

            {
                this.f179063b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CryptoTradeFlow cryptoTradeFlow = this.f179063b;
                        phm.a aVar = (phm.a) e.j(cryptoTradeFlow.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        d dVar = ((d) aVar2.b()).f169353n;
                        CryptoTradeFlowContract$InputData cryptoTradeFlowContract$InputData = cryptoTradeFlow.K;
                        cryptoTradeFlowContract$InputData.getClass();
                        return new ix5.e(dVar, cryptoTradeFlowContract$InputData);
                    case 1:
                        return (b) ((ix5.e) this.f179063b.L.getValue()).d.get();
                    default:
                        CryptoTradeFlow cryptoTradeFlow2 = this.f179063b;
                        return c.d(R$id.screen_transparent_container, 4, null, cryptoTradeFlow2, (b) cryptoTradeFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: jx5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoTradeFlow f179063b;

            {
                this.f179063b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CryptoTradeFlow cryptoTradeFlow = this.f179063b;
                        phm.a aVar = (phm.a) e.j(cryptoTradeFlow.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        d dVar = ((d) aVar2.b()).f169353n;
                        CryptoTradeFlowContract$InputData cryptoTradeFlowContract$InputData = cryptoTradeFlow.K;
                        cryptoTradeFlowContract$InputData.getClass();
                        return new ix5.e(dVar, cryptoTradeFlowContract$InputData);
                    case 1:
                        return (b) ((ix5.e) this.f179063b.L.getValue()).d.get();
                    default:
                        CryptoTradeFlow cryptoTradeFlow2 = this.f179063b;
                        return c.d(R$id.screen_transparent_container, 4, null, cryptoTradeFlow2, (b) cryptoTradeFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ix5.e) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (ix5.e) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (jx5.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }

    public CryptoTradeFlow() {
        this(new CryptoTradeFlowContract$InputData(null));
    }
}
