package com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta;

import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.a;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ e u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Continuation continuation) {
        super(2, continuation);
        this.u = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        yv2.o oVar = e.Companion;
        this.u.C2(a.C0460a.f64424a);
        return Unit.f186387a;
    }
}
