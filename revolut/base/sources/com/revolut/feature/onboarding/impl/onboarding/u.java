package com.revolut.feature.onboarding.impl.onboarding;

import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$Step;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ bc9.h f78489w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, bc9.h hVar, Continuation continuation) {
        super(2, continuation);
        this.v = vVar;
        this.f78489w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u(this.v, this.f78489w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objQ2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            v vVar = this.v;
            qki.d dVar = vVar.P;
            OnboardingFlowContract$State onboardingFlowContract$State = (OnboardingFlowContract$State) ((j2) dVar.f22677a).getValue();
            this.u = 1;
            vVar.H2(dVar, new ga9.g(onboardingFlowContract$State, 1));
            bc9.g gVar = bc9.g.f14403a;
            bc9.h hVar = this.f78489w;
            if (Intrinsics.f(hVar, gVar)) {
                objQ2 = v.Y2(vVar, null, this, 3);
                if (objQ2 != aVar) {
                    objQ2 = Unit.f186387a;
                }
            } else {
                if (hVar instanceof bc9.d) {
                    oki.h.t2(vVar, vVar.Q, new OnboardingFlowContract$Step.CanNotOpenAccount(((bc9.d) hVar).f14399a, true), false, null, false, 12);
                } else if (hVar instanceof bc9.f) {
                    bc9.f fVar = (bc9.f) hVar;
                    objQ2 = vVar.Q2(fVar.f14401a, fVar.f14402b, this);
                    if (objQ2 != aVar) {
                        objQ2 = Unit.f186387a;
                    }
                } else if (Intrinsics.f(hVar, bc9.c.f14398a)) {
                    vVar.B2();
                } else {
                    if (!Intrinsics.f(hVar, bc9.e.f14400a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vVar.T2(q89.f.STORIES);
                }
                objQ2 = Unit.f186387a;
            }
            if (objQ2 == aVar) {
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
