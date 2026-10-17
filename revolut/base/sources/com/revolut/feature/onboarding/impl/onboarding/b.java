package com.revolut.feature.onboarding.impl.onboarding;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ ja9.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f78386w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ja9.c cVar, v vVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f78386w = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f78386w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            ja9.c cVar = this.v;
            if (cVar == null) {
                throw new NoWhenBranchMatchedException();
            }
            Set set = cVar.f172467a;
            this.u = 1;
            v vVar = this.f78386w;
            qki.d dVar = vVar.P;
            vVar.H2(dVar, new g48.j((OnboardingFlowContract$State) ((j2) dVar.f22677a).getValue(), set, 25));
            Object objY2 = v.Y2(vVar, null, this, 3);
            if (objY2 != obj3) {
                objY2 = Unit.f186387a;
            }
            if (objY2 == obj3) {
                return obj3;
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
