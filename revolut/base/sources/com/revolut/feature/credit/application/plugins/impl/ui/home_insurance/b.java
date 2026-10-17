package com.revolut.feature.credit.application.plugins.impl.ui.home_insurance;

import com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.HomeInsuranceFlowContract$Step;
import elm.f;
import ft3.h1;
import gim.i;
import ht3.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ny3.p;
import oki.h;
import skm.e0;
import skm.p0;
import uy3.j;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
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
        e eVar = this.v;
        int i2 = 1;
        if (i == 0) {
            o.b(obj2);
            kx3.a aVar2 = eVar.f67782p;
            h1 h1VarA9 = eVar.f67783q.a9();
            this.u = 1;
            m34.c cVar = aVar2.f190377a;
            cVar.getClass();
            m34.a aVar3 = new m34.a(cVar, h1VarA9, null, i2);
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
        j jVar = (j) obj2;
        l0 l0Var = jVar.f284070a;
        p pVar = jVar.f284071b;
        if (l0Var == null) {
            h.t2(eVar, eVar.u, new HomeInsuranceFlowContract$Step.DocumentsUpload(pVar), true, null, false, 12);
        } else {
            h.t2(eVar, eVar.u, new HomeInsuranceFlowContract$Step.Requirements(l0Var, pVar), true, null, false, 12);
        }
        return Unit.f186387a;
    }
}
