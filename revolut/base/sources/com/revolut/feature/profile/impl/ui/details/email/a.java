package com.revolut.feature.profile.impl.ui.details.email;

import com.revolut.feature.profile.impl.ui.details.email.VerifyEmailFlowContract$Step;
import do3.n;
import do3.q;
import efm.d0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
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
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            d0 d0VarF = cVar.f81385p.f(false);
            this.u = 1;
            obj2 = nim.a.b(d0VarF, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        n nVar = (n) obj2;
        Intrinsics.h(nVar);
        wi0.b bVarY = q.y(nVar);
        String str = nVar.f116411g;
        if (str == null) {
            str = "";
        }
        h.t2(cVar, cVar.f81389t, new VerifyEmailFlowContract$Step.Email(bVarY, str, nVar.f116412h ? sma.c.CHANGE : sma.c.VERIFY), false, null, false, 12);
        return Unit.f186387a;
    }
}
