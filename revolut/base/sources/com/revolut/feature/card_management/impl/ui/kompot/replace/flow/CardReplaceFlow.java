package com.revolut.feature.card_management.impl.ui.kompot.replace.flow;

import aii.q;
import com.revolut.feature.card_management.impl.ui.kompot.replace.flow.CardReplaceFlow;
import com.revolut.feature.card_management.impl.ui.kompot.replace.flow.CardReplaceFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tz2.g;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/kompot/replace/flow/CardReplaceFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardReplaceFlow extends ViewController<q> implements f {
    public final CardReplaceFlowContract$InputData K;
    public final Object L;
    public final Object M;

    public CardReplaceFlow(CardReplaceFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: n03.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReplaceFlow f210855b;

            {
                this.f210855b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CardReplaceFlow cardReplaceFlow = this.f210855b;
                        phm.a aVar = (phm.a) ue0.e.j(cardReplaceFlow.m2()).a().get(tz2.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tz2.e.class, " is not found"));
                        }
                        tz2.e eVar = ((tz2.e) aVar2.b()).f275770s;
                        CardReplaceFlowContract$InputData cardReplaceFlowContract$InputData = cardReplaceFlow.K;
                        cardReplaceFlowContract$InputData.getClass();
                        return new tz2.g(eVar, cardReplaceFlowContract$InputData);
                    default:
                        CardReplaceFlow cardReplaceFlow2 = this.f210855b;
                        return czi.c.d(0, 6, null, cardReplaceFlow2, (b) ((tz2.g) cardReplaceFlow2.L.getValue()).f.get());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: n03.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReplaceFlow f210855b;

            {
                this.f210855b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CardReplaceFlow cardReplaceFlow = this.f210855b;
                        phm.a aVar = (phm.a) ue0.e.j(cardReplaceFlow.m2()).a().get(tz2.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tz2.e.class, " is not found"));
                        }
                        tz2.e eVar = ((tz2.e) aVar2.b()).f275770s;
                        CardReplaceFlowContract$InputData cardReplaceFlowContract$InputData = cardReplaceFlow.K;
                        cardReplaceFlowContract$InputData.getClass();
                        return new tz2.g(eVar, cardReplaceFlowContract$InputData);
                    default:
                        CardReplaceFlow cardReplaceFlow2 = this.f210855b;
                        return czi.c.d(0, 6, null, cardReplaceFlow2, (b) ((tz2.g) cardReplaceFlow2.L.getValue()).f.get());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (g) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (n03.b) ((g) this.L.getValue()).f.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
