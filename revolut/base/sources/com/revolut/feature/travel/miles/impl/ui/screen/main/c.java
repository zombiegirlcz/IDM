package com.revolut.feature.travel.miles.impl.ui.screen.main;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ e u;
    public final /* synthetic */ LargeActionButtonDelegate.Model v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, LargeActionButtonDelegate.Model model, Continuation continuation) {
        super(1, continuation);
        this.u = eVar;
        this.v = model;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = this.u;
        j60.a.v(eVar.f94370p, false, null, 3);
        Object obj3 = this.v.i;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.travel.miles.api.model.TravelMilesAirline");
        eVar.C2(new a((TravelMilesAirline) obj3));
        return Unit.f186387a;
    }
}
