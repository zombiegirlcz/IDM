package com.revolut.feature.credit.impl.notifications.data;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.o0;
import wim.z;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function3 {
    public /* synthetic */ Object u;
    public final /* synthetic */ i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Continuation continuation) {
        super(3, continuation);
        this.v = iVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        h hVar = new h(this.v, (Continuation) obj4);
        hVar.u = (e) obj3;
        return hVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        e eVar = (e) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        this.v.f70017c.G(eVar, "credit_collection_notification_settings", z.d(o0.b(e.class)));
        return Unit.f186387a;
    }
}
