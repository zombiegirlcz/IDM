package com.revolut.feature.card_screen.impl.kompot.cards_carousel;

import aii.q;
import com.revolut.feature.card_screen.impl.R$id;
import com.revolut.feature.card_screen.impl.R$layout;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.CardsCarouselFlow;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.CardsCarouselFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import in0.g;
import jji.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l73.d;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/CardsCarouselFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "Lin0/g;", "Ljji/y;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardsCarouselFlow extends ViewController<q> implements f, g, y {
    public final CardsCarouselFlowContract$InputData K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;

    public CardsCarouselFlow(CardsCarouselFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: l73.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardsCarouselFlow f192516b;

            {
                this.f192516b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CardsCarouselFlow cardsCarouselFlow = this.f192516b;
                        phm.a aVar = (phm.a) ue0.e.j(cardsCarouselFlow.m2()).a().get(a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a.class, " is not found"));
                        }
                        o73.e eVar = ((o73.e) aVar2.b()).L;
                        CardsCarouselFlowContract$InputData cardsCarouselFlowContract$InputData = cardsCarouselFlow.K;
                        cardsCarouselFlowContract$InputData.getClass();
                        return new o73.f(eVar, cardsCarouselFlow, cardsCarouselFlowContract$InputData);
                    case 1:
                        return (d) ((o73.f) this.f192516b.L.getValue()).f.get();
                    default:
                        CardsCarouselFlow cardsCarouselFlow2 = this.f192516b;
                        return czi.c.d(R$id.cardsCarouselFlow_rootControllerView, 4, null, cardsCarouselFlow2, (d) cardsCarouselFlow2.N.getValue());
                }
            }
        });
        this.M = R$layout.flow_cards_carousel;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: l73.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardsCarouselFlow f192516b;

            {
                this.f192516b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CardsCarouselFlow cardsCarouselFlow = this.f192516b;
                        phm.a aVar = (phm.a) ue0.e.j(cardsCarouselFlow.m2()).a().get(a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a.class, " is not found"));
                        }
                        o73.e eVar = ((o73.e) aVar2.b()).L;
                        CardsCarouselFlowContract$InputData cardsCarouselFlowContract$InputData = cardsCarouselFlow.K;
                        cardsCarouselFlowContract$InputData.getClass();
                        return new o73.f(eVar, cardsCarouselFlow, cardsCarouselFlowContract$InputData);
                    case 1:
                        return (d) ((o73.f) this.f192516b.L.getValue()).f.get();
                    default:
                        CardsCarouselFlow cardsCarouselFlow2 = this.f192516b;
                        return czi.c.d(R$id.cardsCarouselFlow_rootControllerView, 4, null, cardsCarouselFlow2, (d) cardsCarouselFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: l73.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardsCarouselFlow f192516b;

            {
                this.f192516b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CardsCarouselFlow cardsCarouselFlow = this.f192516b;
                        phm.a aVar = (phm.a) ue0.e.j(cardsCarouselFlow.m2()).a().get(a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a.class, " is not found"));
                        }
                        o73.e eVar = ((o73.e) aVar2.b()).L;
                        CardsCarouselFlowContract$InputData cardsCarouselFlowContract$InputData = cardsCarouselFlow.K;
                        cardsCarouselFlowContract$InputData.getClass();
                        return new o73.f(eVar, cardsCarouselFlow, cardsCarouselFlowContract$InputData);
                    case 1:
                        return (d) ((o73.f) this.f192516b.L.getValue()).f.get();
                    default:
                        CardsCarouselFlow cardsCarouselFlow2 = this.f192516b;
                        return czi.c.d(R$id.cardsCarouselFlow_rootControllerView, 4, null, cardsCarouselFlow2, (d) cardsCarouselFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o73.f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (o73.f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
