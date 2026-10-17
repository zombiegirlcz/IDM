package com.revolut.feature.onboarding.impl.onboarding;

import com.revolut.feature.junior_graduation.api.navigation.IdentificationFlowPublicContract$OutputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ IdentificationFlowPublicContract$OutputData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f78439w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(IdentificationFlowPublicContract$OutputData identificationFlowPublicContract$OutputData, v vVar, Continuation continuation) {
        super(2, continuation);
        this.v = identificationFlowPublicContract$OutputData;
        this.f78439w = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, this.f78439w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            if (!(this.v instanceof IdentificationFlowPublicContract$OutputData.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            this.u = 1;
            if (v.Y2(this.f78439w, null, this, 3) == aVar) {
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
