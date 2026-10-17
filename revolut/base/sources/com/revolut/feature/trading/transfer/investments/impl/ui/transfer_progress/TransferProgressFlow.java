package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress;

import aii.q;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.TransferProgressFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_progress/TransferProgressFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferProgressFlow extends ViewController<q> implements f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public TransferProgressFlow(TransferProgressFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        this.L = w.y0(new fx5.a(this, inputData, 19));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: gbf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferProgressFlow f142258b;

            {
                this.f142258b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((l9f.q) this.f142258b.L.getValue()).d.get();
                    default:
                        TransferProgressFlow transferProgressFlow = this.f142258b;
                        return c.d(R$id.screen_transparent_container, 4, null, transferProgressFlow, (b) transferProgressFlow.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: gbf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferProgressFlow f142258b;

            {
                this.f142258b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((l9f.q) this.f142258b.L.getValue()).d.get();
                    default:
                        TransferProgressFlow transferProgressFlow = this.f142258b;
                        return c.d(R$id.screen_transparent_container, 4, null, transferProgressFlow, (b) transferProgressFlow.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l9f.q) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (l9f.q) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (gbf.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
