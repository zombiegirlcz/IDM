package com.revolut.feature.onboarding.impl.onboarding;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ rbi.c f78447w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(v vVar, rbi.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = vVar;
        this.f78447w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, this.f78447w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        v vVar = this.v;
        ah1.m mVar = new ah1.m(vVar, this.f78447w, null, 13);
        this.u = 1;
        Object objP2 = vVar.p2(this, mVar);
        return objP2 == aVar ? aVar : objP2;
    }
}
