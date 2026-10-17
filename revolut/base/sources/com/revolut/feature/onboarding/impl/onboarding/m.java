package com.revolut.feature.onboarding.impl.onboarding;

import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$Step;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pb9.h f78457w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(v vVar, pb9.h hVar, Continuation continuation) {
        super(2, continuation);
        this.v = vVar;
        this.f78457w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.v, this.f78457w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objQ2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            v vVar = this.v;
            vVar.H2(vVar.P, new g64.c(26));
            pb9.h hVar = this.f78457w;
            if (hVar instanceof pb9.g) {
                objQ2 = v.Y2(vVar, null, this, 3);
                if (objQ2 != aVar) {
                    objQ2 = Unit.f186387a;
                }
            } else {
                if (hVar instanceof pb9.d) {
                    oki.h.t2(vVar, vVar.Q, new OnboardingFlowContract$Step.CanNotOpenAccount(((pb9.d) hVar).f234663a, true), false, null, false, 12);
                } else if (hVar instanceof pb9.f) {
                    pb9.f fVar = (pb9.f) hVar;
                    objQ2 = vVar.Q2(fVar.f234665a, fVar.f234666b, this);
                    if (objQ2 != aVar) {
                        objQ2 = Unit.f186387a;
                    }
                } else if (Intrinsics.f(hVar, pb9.c.f234662a)) {
                    vVar.B2();
                } else {
                    if (!Intrinsics.f(hVar, pb9.e.f234664a)) {
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
