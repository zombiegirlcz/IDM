package com.revolut.feature.credit.application.plugins.impl.ui.offer;

import c64.l;
import c64.m;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.OfferFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ e u;
    public final /* synthetic */ l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, l lVar, Continuation continuation) {
        super(2, continuation);
        this.u = eVar;
        this.v = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = this.u;
        yki.a aVar2 = eVar.f68088w;
        m mVar = (m) this.v;
        Long lB = mVar.f21634a.f129492a.b();
        Long lC = mVar.f21634a.f129492a.c();
        fu3.c cVar = mVar.f21634a.f129493b;
        h.t2(eVar, aVar2, new OfferFlowContract$Step.OfferContent(lB, lC, cVar != null ? cVar.a() : null), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
        return Unit.f186387a;
    }
}
