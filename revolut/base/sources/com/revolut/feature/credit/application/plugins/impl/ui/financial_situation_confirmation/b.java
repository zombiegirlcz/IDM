package com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation;

import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.FinancialSituationConfirmationFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import elm.f;
import ft3.h1;
import gim.i;
import jsl.t0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import skm.e0;
import skm.p0;
import sy3.e;
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
        if (i == 0) {
            o.b(obj2);
            ix3.a aVar2 = cVar.f67759p;
            h1 h1VarA9 = cVar.f67760q.a9();
            this.u = 1;
            k34.a aVar3 = aVar2.f169334a;
            aVar3.getClass();
            t0 t0Var = new t0(aVar3, h1VarA9, null, 24);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, t0Var, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.t2(cVar, cVar.f67761r, new FinancialSituationConfirmationFlowContract$Step.Intro((e) obj2), false, TransitionAnimation.NONE.f98393a, false, 8);
        return Unit.f186387a;
    }
}
