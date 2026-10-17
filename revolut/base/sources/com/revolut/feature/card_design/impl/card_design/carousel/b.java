package com.revolut.feature.card_design.impl.card_design.carousel;

import com.revolut.feature.card_design.impl.card_design.carousel.g;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ CardDesignCarouselController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CardDesignCarouselController cardDesignCarouselController, Continuation continuation) {
        super(2, continuation);
        this.u = cardDesignCarouselController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((e) this.u.d()).M2(g.c.f64721a);
        return Unit.f186387a;
    }
}
