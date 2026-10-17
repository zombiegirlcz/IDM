package com.revolut.feature.credit.application.plugins.impl.ui.credit_health.flow;

import com.revolut.feature.credit.application.models.credit_health.CreditHealthConfig;
import com.revolut.feature.credit.application.models.credit_health.CreditHealthContext;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_health.flow.CreditHealthFlowContract$Step;
import elm.f;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import skm.e0;
import skm.p0;
import xq3.r;
import xr3.p;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            r rVar = bVar.f67398p;
            CreditHealthContext creditHealthContext = bVar.o.f67394a;
            this.u = 1;
            p pVar = rVar.f308094a;
            pVar.getClass();
            xr3.o oVar = new xr3.o(creditHealthContext, pVar, null);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, oVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.t2(bVar, bVar.f67399q, new CreditHealthFlowContract$Step.Content((CreditHealthConfig) obj2), false, null, false, 12);
        return Unit.f186387a;
    }
}
