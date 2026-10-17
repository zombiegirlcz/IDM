package com.revolut.feature.robo.impl.ui.flow.edit_goal;

import aii.q;
import com.revolut.feature.robo.impl.ui.flow.edit_goal.EditGoalFlowContract$Step;
import com.revolut.feature.wealth.api.declaration.DualAddMoneyDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends i implements Function1 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jnc.f f85112w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ EditGoalFlowContract$Step f85113x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, jnc.f fVar2, EditGoalFlowContract$Step editGoalFlowContract$Step, Continuation continuation) {
        super(1, continuation);
        this.v = fVar;
        this.f85112w = fVar2;
        this.f85113x = editGoalFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f85112w, this.f85113x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        f fVar = this.v;
        if (i == 0) {
            o.b(obj2);
            c cVar = fVar.f85116r;
            jnc.f fVar2 = this.f85112w;
            dj0.d dVar = fVar2.f176689c;
            dj0.d dVar2 = fVar2.f176688b;
            a aVar2 = ((EditGoalFlowContract$Step.Projections) this.f85113x).f85104b;
            this.u = 1;
            obj2 = cVar.a(dVar, dVar2, aVar2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        DualAddMoneyDestination dualAddMoneyDestination = (DualAddMoneyDestination) obj2;
        if (dualAddMoneyDestination != null) {
            fVar.C1(u0.b(vhi.c.c(dualAddMoneyDestination, yhi.b.POPUP, null, false, 12)));
        }
        fVar.C2(q.f5292a);
        return Unit.f186387a;
    }
}
