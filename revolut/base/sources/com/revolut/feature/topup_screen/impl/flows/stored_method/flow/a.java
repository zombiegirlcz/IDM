package com.revolut.feature.topup_screen.impl.flows.stored_method.flow;

import com.revolut.feature.topup_screen.impl.flows.stored_method.flow.StoredMethodFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ StoredMethodFlowContract$Step v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f90795w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(StoredMethodFlowContract$Step storedMethodFlowContract$Step, b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = storedMethodFlowContract$Step;
        this.f90795w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f90795w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            StoredMethodFlowContract$Step.RemovalNotAllowed removalNotAllowed = (StoredMethodFlowContract$Step.RemovalNotAllowed) this.v;
            String str = removalNotAllowed.f90788b;
            String str2 = removalNotAllowed.f90787a;
            String str3 = removalNotAllowed.f90789c;
            this.u = 1;
            if (b.I2(this.f90795w, str2, str, str3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
