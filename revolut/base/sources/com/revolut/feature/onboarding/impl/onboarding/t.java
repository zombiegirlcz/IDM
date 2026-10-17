package com.revolut.feature.onboarding.impl.onboarding;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ zb9.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f78488w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(zb9.c cVar, v vVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f78488w = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t(this.v, this.f78488w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            if (!(this.v instanceof zb9.c)) {
                throw new NoWhenBranchMatchedException();
            }
            this.u = 1;
            if (v.Y2(this.f78488w, null, this, 3) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
