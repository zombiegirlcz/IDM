package com.revolut.feature.transfer_reasons.impl.flow;

import com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData;
import com.revolut.feature.transfer_reasons.impl.flow.TransferReasonsFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dsf.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nsf.d;
import te0.w;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldsf/e;", "Lyki/f;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferReasonsFlow extends ViewController<e> implements f {
    public final TransferReasonsFlowInputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public TransferReasonsFlow(TransferReasonsFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: qsf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsFlow f248818b;

            {
                this.f248818b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TransferReasonsFlow transferReasonsFlow = this.f248818b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, transferReasonsFlow, (b) transferReasonsFlow.O.getValue());
                    case 1:
                        TransferReasonsFlow transferReasonsFlow2 = this.f248818b;
                        phm.a aVar = (phm.a) ue0.e.j(transferReasonsFlow2.m2()).a().get(nsf.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nsf.b.class, " is not found"));
                        }
                        nsf.b bVar = ((nsf.b) aVar2.b()).f218801m;
                        TransferReasonsFlowInputData transferReasonsFlowInputData = transferReasonsFlow2.K;
                        transferReasonsFlowInputData.getClass();
                        return new nsf.d(bVar, transferReasonsFlow2, transferReasonsFlowInputData);
                    default:
                        return (b) ((nsf.d) this.f248818b.N.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: qsf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsFlow f248818b;

            {
                this.f248818b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TransferReasonsFlow transferReasonsFlow = this.f248818b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, transferReasonsFlow, (b) transferReasonsFlow.O.getValue());
                    case 1:
                        TransferReasonsFlow transferReasonsFlow2 = this.f248818b;
                        phm.a aVar = (phm.a) ue0.e.j(transferReasonsFlow2.m2()).a().get(nsf.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nsf.b.class, " is not found"));
                        }
                        nsf.b bVar = ((nsf.b) aVar2.b()).f218801m;
                        TransferReasonsFlowInputData transferReasonsFlowInputData = transferReasonsFlow2.K;
                        transferReasonsFlowInputData.getClass();
                        return new nsf.d(bVar, transferReasonsFlow2, transferReasonsFlowInputData);
                    default:
                        return (b) ((nsf.d) this.f248818b.N.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: qsf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsFlow f248818b;

            {
                this.f248818b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TransferReasonsFlow transferReasonsFlow = this.f248818b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, transferReasonsFlow, (b) transferReasonsFlow.O.getValue());
                    case 1:
                        TransferReasonsFlow transferReasonsFlow2 = this.f248818b;
                        phm.a aVar = (phm.a) ue0.e.j(transferReasonsFlow2.m2()).a().get(nsf.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nsf.b.class, " is not found"));
                        }
                        nsf.b bVar = ((nsf.b) aVar2.b()).f218801m;
                        TransferReasonsFlowInputData transferReasonsFlowInputData = transferReasonsFlow2.K;
                        transferReasonsFlowInputData.getClass();
                        return new nsf.d(bVar, transferReasonsFlow2, transferReasonsFlowInputData);
                    default:
                        return (b) ((nsf.d) this.f248818b.N.getValue()).f.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (d) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (qsf.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
