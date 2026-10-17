package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow;

import com.revolut.feature.junior_tasks.api.navigation.JuniorTasksListDestination;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.ChallengesEditContract$Step;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import np8.f;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar = this.v;
        yki.a aVar = bVar.v;
        n1 n1Var = (n1) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (n1Var instanceof l1) {
            bVar.H2(bVar.u, new f(bVar, 1));
            h.r2(aVar);
            h.t2(bVar, bVar.v, ChallengesEditContract$Step.Details.f77364a, false, TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
        } else {
            if (!(n1Var instanceof k1) && !(n1Var instanceof m1) && !(n1Var instanceof j1)) {
                throw new NoWhenBranchMatchedException();
            }
            if (bVar.o.f218156c) {
                bVar.C1(new JuniorTasksListDestination(bVar.f77371t, (ZoomTransitionAnimation.Widgets) null, 2));
            } else {
                h.D2(aVar);
            }
        }
        return Unit.f186387a;
    }
}
