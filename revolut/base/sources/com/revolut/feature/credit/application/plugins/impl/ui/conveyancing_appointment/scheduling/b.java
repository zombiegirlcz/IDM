package com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling;

import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.ConveyancingAppointmentSchedulingFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import elm.f;
import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ly3.e;
import oki.h;
import skm.e0;
import skm.p0;
import y20.a1;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        int i2 = 1;
        if (i == 0) {
            o.b(obj2);
            tw3.a aVar2 = cVar.f67319p;
            h1 h1VarA9 = cVar.f67320q.a9();
            this.u = 1;
            y24.a aVar3 = aVar2.f274901a;
            aVar3.getClass();
            a1 a1Var = new a1(aVar3, h1VarA9, null, i2);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, a1Var, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.t2(cVar, cVar.f67321r, new ConveyancingAppointmentSchedulingFlowContract$Step.Intro((e) obj2), false, TransitionAnimation.NONE.f98393a, false, 8);
        return Unit.f186387a;
    }
}
