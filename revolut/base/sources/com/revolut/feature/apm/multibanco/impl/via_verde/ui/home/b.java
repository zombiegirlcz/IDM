package com.revolut.feature.apm.multibanco.impl.via_verde.ui.home;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.home.ViaVerdeHomeContract$Action;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ ViaVerdeHomeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ViaVerdeHomeScreen viaVerdeHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = viaVerdeHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((c) this.u.R2()).I2(new ViaVerdeHomeContract$Action.AddEnrollment(f92.b.REPLACE));
        return Unit.f186387a;
    }
}
