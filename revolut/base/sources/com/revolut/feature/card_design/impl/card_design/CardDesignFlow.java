package com.revolut.feature.card_design.impl.card_design;

import com.revolut.feature.card_design.api.model.SkipConfig;
import com.revolut.feature.card_design.impl.card_design.CardDesignFlow;
import com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData;
import com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhx2/b;", "Lyki/f;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardDesignFlow extends ViewController<hx2.b> implements f {
    public final CardDesignFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CardDesignFlow(CardDesignFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: nx2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDesignFlow f220094b;

            {
                this.f220094b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CardDesignFlow cardDesignFlow = this.f220094b;
                        phm.a aVar = (phm.a) ue0.e.j(cardDesignFlow.m2()).a().get(gy2.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gy2.d.class, " is not found"));
                        }
                        gy2.d dVar = ((gy2.d) aVar2.b()).f147796y;
                        CardDesignFlowContract$InputData cardDesignFlowContract$InputData = cardDesignFlow.K;
                        cardDesignFlowContract$InputData.getClass();
                        return new gy2.e(dVar, cardDesignFlowContract$InputData);
                    case 1:
                        return (b) ((gy2.e) this.f220094b.L.getValue()).e.get();
                    default:
                        CardDesignFlow cardDesignFlow2 = this.f220094b;
                        return czi.c.d(0, 6, null, cardDesignFlow2, (b) cardDesignFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: nx2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDesignFlow f220094b;

            {
                this.f220094b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CardDesignFlow cardDesignFlow = this.f220094b;
                        phm.a aVar = (phm.a) ue0.e.j(cardDesignFlow.m2()).a().get(gy2.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gy2.d.class, " is not found"));
                        }
                        gy2.d dVar = ((gy2.d) aVar2.b()).f147796y;
                        CardDesignFlowContract$InputData cardDesignFlowContract$InputData = cardDesignFlow.K;
                        cardDesignFlowContract$InputData.getClass();
                        return new gy2.e(dVar, cardDesignFlowContract$InputData);
                    case 1:
                        return (b) ((gy2.e) this.f220094b.L.getValue()).e.get();
                    default:
                        CardDesignFlow cardDesignFlow2 = this.f220094b;
                        return czi.c.d(0, 6, null, cardDesignFlow2, (b) cardDesignFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: nx2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDesignFlow f220094b;

            {
                this.f220094b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CardDesignFlow cardDesignFlow = this.f220094b;
                        phm.a aVar = (phm.a) ue0.e.j(cardDesignFlow.m2()).a().get(gy2.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gy2.d.class, " is not found"));
                        }
                        gy2.d dVar = ((gy2.d) aVar2.b()).f147796y;
                        CardDesignFlowContract$InputData cardDesignFlowContract$InputData = cardDesignFlow.K;
                        cardDesignFlowContract$InputData.getClass();
                        return new gy2.e(dVar, cardDesignFlowContract$InputData);
                    case 1:
                        return (b) ((gy2.e) this.f220094b.L.getValue()).e.get();
                    default:
                        CardDesignFlow cardDesignFlow2 = this.f220094b;
                        return czi.c.d(0, 6, null, cardDesignFlow2, (b) cardDesignFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        d dVar = (d) ((nx2.b) this.M.getValue());
        SkipConfig f64620j = dVar.o.getF64620j();
        if (f64620j == null) {
            return super.F2();
        }
        h.w2(dVar.E, new CardDesignFlowContract$Step.SkipConfirmationDialog(f64620j), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (gy2.e) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (gy2.e) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (nx2.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
