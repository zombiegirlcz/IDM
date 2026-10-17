package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp;

import aii.q;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.TransferOutFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l9f.k;
import l9f.o;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;
import zaf.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/TransferOutFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferOutFlow extends ViewController<q> implements f {
    public final c K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;

    public TransferOutFlow(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: zaf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOutFlow f320680b;

            {
                this.f320680b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TransferOutFlow transferOutFlow = this.f320680b;
                        phm.a aVar = (phm.a) e.j(transferOutFlow.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).v;
                        c cVar = transferOutFlow.K;
                        cVar.getClass();
                        return new o(kVar, cVar);
                    case 1:
                        return (b) ((o) this.f320680b.L.getValue()).d.get();
                    default:
                        TransferOutFlow transferOutFlow2 = this.f320680b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, transferOutFlow2, (b) transferOutFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: zaf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOutFlow f320680b;

            {
                this.f320680b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TransferOutFlow transferOutFlow = this.f320680b;
                        phm.a aVar = (phm.a) e.j(transferOutFlow.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).v;
                        c cVar = transferOutFlow.K;
                        cVar.getClass();
                        return new o(kVar, cVar);
                    case 1:
                        return (b) ((o) this.f320680b.L.getValue()).d.get();
                    default:
                        TransferOutFlow transferOutFlow2 = this.f320680b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, transferOutFlow2, (b) transferOutFlow2.M.getValue());
                }
            }
        });
        this.N = R$layout.screen_transparent;
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: zaf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOutFlow f320680b;

            {
                this.f320680b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TransferOutFlow transferOutFlow = this.f320680b;
                        phm.a aVar = (phm.a) e.j(transferOutFlow.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).v;
                        c cVar = transferOutFlow.K;
                        cVar.getClass();
                        return new o(kVar, cVar);
                    case 1:
                        return (b) ((o) this.f320680b.L.getValue()).d.get();
                    default:
                        TransferOutFlow transferOutFlow2 = this.f320680b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, transferOutFlow2, (b) transferOutFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (o) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (o) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b h3() {
        return (zaf.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
