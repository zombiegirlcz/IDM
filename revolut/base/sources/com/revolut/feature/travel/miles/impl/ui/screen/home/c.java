package com.revolut.feature.travel.miles.impl.ui.screen.home;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ LargeActionButtonDelegate.Model u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LargeActionButtonDelegate.Model model, e eVar, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = eVar;
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
        Object obj3 = this.u.i;
        u2f.d dVar = obj3 instanceof u2f.d ? (u2f.d) obj3 : null;
        if (dVar != null) {
            this.v.C2(new a(dVar));
        }
        return Unit.f186387a;
    }
}
