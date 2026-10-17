package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection;

import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.TransferInAssetSelectionFlow;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.TransferInAssetSelectionFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l9f.h;
import l9f.k;
import qji.b;
import s9f.c;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/TransferInAssetSelectionFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ls9f/c;", "Lyki/f;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferInAssetSelectionFlow extends ViewController<c> implements f {
    public final TransferInAssetSelectionFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;

    public TransferInAssetSelectionFlow(TransferInAssetSelectionFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: s9f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferInAssetSelectionFlow f261173b;

            {
                this.f261173b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TransferInAssetSelectionFlow transferInAssetSelectionFlow = this.f261173b;
                        phm.a aVar = (phm.a) e.j(transferInAssetSelectionFlow.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).v;
                        TransferInAssetSelectionFlowContract$InputData transferInAssetSelectionFlowContract$InputData = transferInAssetSelectionFlow.K;
                        transferInAssetSelectionFlowContract$InputData.getClass();
                        return new h(kVar, transferInAssetSelectionFlowContract$InputData);
                    case 1:
                        return (b) ((h) this.f261173b.L.getValue()).d.get();
                    default:
                        TransferInAssetSelectionFlow transferInAssetSelectionFlow2 = this.f261173b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, transferInAssetSelectionFlow2, (b) transferInAssetSelectionFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: s9f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferInAssetSelectionFlow f261173b;

            {
                this.f261173b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TransferInAssetSelectionFlow transferInAssetSelectionFlow = this.f261173b;
                        phm.a aVar = (phm.a) e.j(transferInAssetSelectionFlow.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).v;
                        TransferInAssetSelectionFlowContract$InputData transferInAssetSelectionFlowContract$InputData = transferInAssetSelectionFlow.K;
                        transferInAssetSelectionFlowContract$InputData.getClass();
                        return new h(kVar, transferInAssetSelectionFlowContract$InputData);
                    case 1:
                        return (b) ((h) this.f261173b.L.getValue()).d.get();
                    default:
                        TransferInAssetSelectionFlow transferInAssetSelectionFlow2 = this.f261173b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, transferInAssetSelectionFlow2, (b) transferInAssetSelectionFlow2.M.getValue());
                }
            }
        });
        this.N = R$layout.screen_transparent;
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: s9f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferInAssetSelectionFlow f261173b;

            {
                this.f261173b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TransferInAssetSelectionFlow transferInAssetSelectionFlow = this.f261173b;
                        phm.a aVar = (phm.a) e.j(transferInAssetSelectionFlow.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).v;
                        TransferInAssetSelectionFlowContract$InputData transferInAssetSelectionFlowContract$InputData = transferInAssetSelectionFlow.K;
                        transferInAssetSelectionFlowContract$InputData.getClass();
                        return new h(kVar, transferInAssetSelectionFlowContract$InputData);
                    case 1:
                        return (b) ((h) this.f261173b.L.getValue()).d.get();
                    default:
                        TransferInAssetSelectionFlow transferInAssetSelectionFlow2 = this.f261173b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, transferInAssetSelectionFlow2, (b) transferInAssetSelectionFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (h) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (h) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (s9f.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
