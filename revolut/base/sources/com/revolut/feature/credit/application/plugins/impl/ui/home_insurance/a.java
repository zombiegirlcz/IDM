package com.revolut.feature.credit.application.plugins.impl.ui.home_insurance;

import com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.HomeInsuranceFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import elm.f;
import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            kx3.a aVar2 = eVar.f67782p;
            h1 h1VarA9 = eVar.f67783q.a9();
            this.u = 1;
            m34.c cVar = aVar2.f190377a;
            cVar.getClass();
            m34.a aVar3 = new m34.a(cVar, h1VarA9, null, 0);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, aVar3, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.t2(eVar, eVar.u, new HomeInsuranceFlowContract$Step.Intro((uy3.b) obj2), false, TransitionAnimation.NONE.f98393a, false, 8);
        return Unit.f186387a;
    }
}
