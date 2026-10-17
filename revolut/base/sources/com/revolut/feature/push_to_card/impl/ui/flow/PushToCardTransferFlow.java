package com.revolut.feature.push_to_card.impl.ui.flow;

import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData;
import com.revolut.feature.push_to_card.impl.ui.flow.PushToCardTransferFlow;
import com.revolut.kompot.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import cqa.e;
import in0.g;
import jqa.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/ui/flow/PushToCardTransferFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcqa/e;", "Lyki/f;", "Lin0/g;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PushToCardTransferFlow extends ViewController<e> implements f, g {
    public final PushToCardTransferInputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public PushToCardTransferFlow(PushToCardTransferInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: msa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PushToCardTransferFlow f208638b;

            {
                this.f208638b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PushToCardTransferFlow pushToCardTransferFlow = this.f208638b;
                        phm.a aVar = (phm.a) ue0.e.j(pushToCardTransferFlow.m2()).a().get(vpa.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vpa.a.class, " is not found"));
                        }
                        jqa.e eVar = ((jqa.e) ((s) aVar2.b())).O;
                        PushToCardTransferInputData pushToCardTransferInputData = pushToCardTransferFlow.K;
                        pushToCardTransferInputData.getClass();
                        return new jqa.g(eVar, pushToCardTransferInputData);
                    case 1:
                        return (b) ((jqa.g) this.f208638b.L.getValue()).f.get();
                    default:
                        int i2 = R$id.container;
                        PushToCardTransferFlow pushToCardTransferFlow2 = this.f208638b;
                        return czi.c.d(i2, 4, null, pushToCardTransferFlow2, (b) pushToCardTransferFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: msa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PushToCardTransferFlow f208638b;

            {
                this.f208638b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PushToCardTransferFlow pushToCardTransferFlow = this.f208638b;
                        phm.a aVar = (phm.a) ue0.e.j(pushToCardTransferFlow.m2()).a().get(vpa.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vpa.a.class, " is not found"));
                        }
                        jqa.e eVar = ((jqa.e) ((s) aVar2.b())).O;
                        PushToCardTransferInputData pushToCardTransferInputData = pushToCardTransferFlow.K;
                        pushToCardTransferInputData.getClass();
                        return new jqa.g(eVar, pushToCardTransferInputData);
                    case 1:
                        return (b) ((jqa.g) this.f208638b.L.getValue()).f.get();
                    default:
                        int i22 = R$id.container;
                        PushToCardTransferFlow pushToCardTransferFlow2 = this.f208638b;
                        return czi.c.d(i22, 4, null, pushToCardTransferFlow2, (b) pushToCardTransferFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: msa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PushToCardTransferFlow f208638b;

            {
                this.f208638b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PushToCardTransferFlow pushToCardTransferFlow = this.f208638b;
                        phm.a aVar = (phm.a) ue0.e.j(pushToCardTransferFlow.m2()).a().get(vpa.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vpa.a.class, " is not found"));
                        }
                        jqa.e eVar = ((jqa.e) ((s) aVar2.b())).O;
                        PushToCardTransferInputData pushToCardTransferInputData = pushToCardTransferFlow.K;
                        pushToCardTransferInputData.getClass();
                        return new jqa.g(eVar, pushToCardTransferInputData);
                    case 1:
                        return (b) ((jqa.g) this.f208638b.L.getValue()).f.get();
                    default:
                        int i22 = R$id.container;
                        PushToCardTransferFlow pushToCardTransferFlow2 = this.f208638b;
                        return czi.c.d(i22, 4, null, pushToCardTransferFlow2, (b) pushToCardTransferFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (jqa.g) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (jqa.g) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (msa.b) this.M.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
