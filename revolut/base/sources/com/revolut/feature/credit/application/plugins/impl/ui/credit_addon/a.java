package com.revolut.feature.credit.application.plugins.impl.ui.credit_addon;

import com.revolut.feature.credit.application.plugins.impl.ui.credit_addon.CreditAddonFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import f84.k;
import gim.i;
import ht3.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
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
            k kVar = bVar.f67357q;
            this.u = 1;
            obj2 = kVar.d(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        l0 l0Var = (l0) obj2;
        h.t2(bVar, bVar.f67358r, l0Var == null ? new CreditAddonFlowContract$Step.Calculator(true) : new CreditAddonFlowContract$Step.Intro(l0Var), false, TransitionAnimation.NONE.f98393a, false, 8);
        return Unit.f186387a;
    }
}
