package com.revolut.feature.payments.profile.impl.ui_kompot.scanner;

import ab4.q;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends i implements Function3 {
    public /* synthetic */ Throwable u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(3, continuation);
        this.v = fVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        e eVar = new e(this.v, (Continuation) obj4);
        eVar.u = (Throwable) obj3;
        return eVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Throwable th10 = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (th10 instanceof QrCodeNotParsedException) {
            this.v.x2(new q(th10, 2));
        }
        return Unit.f186387a;
    }
}
