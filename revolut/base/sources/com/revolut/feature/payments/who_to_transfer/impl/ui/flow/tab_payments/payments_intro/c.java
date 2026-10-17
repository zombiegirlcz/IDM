package com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro;

import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.PaymentsIntroScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ e u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Continuation continuation) {
        super(1, continuation);
        this.u = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h.v2(this.u.K, PaymentsIntroScreenContract$ModalStep.Search.f80191a, ModalDestination.Style.FULLSCREEN_FADE.f98307a);
        return Unit.f186387a;
    }
}
