package o73;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.CardsCarouselFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardsCarouselFlowContract$InputData f222670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f222671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f222672c;
    public final f d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f222673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f222674h;
    public final e4m.e i;

    public f(e eVar, ViewController viewController, CardsCarouselFlowContract$InputData cardsCarouselFlowContract$InputData) {
        this.f222672c = eVar;
        this.f222670a = cardsCarouselFlowContract$InputData;
        this.f222671b = viewController;
        int i = 6;
        this.e = e4m.b.b(new o41.b(eVar, this, 1, i));
        this.f = e4m.b.b(new o41.b(eVar, this, 0, i));
        this.f222673g = e4m.b.b(new o41.b(eVar, this, 2, i));
        this.f222674h = e4m.b.b(new o41.b(eVar, this, 3, i));
        this.i = e4m.b.b(new o41.b(eVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
