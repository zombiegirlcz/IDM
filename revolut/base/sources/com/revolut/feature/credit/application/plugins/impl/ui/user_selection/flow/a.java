package com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow;

import com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow.UserSelectionFlowContract$Step;
import elm.f;
import ft3.h1;
import gim.i;
import k3k.q0;
import k44.c;
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
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
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
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            gy3.a aVar2 = bVar.f68497q;
            h1 h1VarA9 = bVar.f68496p.a9();
            this.u = 1;
            c cVar = aVar2.f147818a;
            cVar.getClass();
            q0 q0Var = new q0(cVar, h1VarA9, null, 2);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, q0Var, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.t2(bVar, bVar.f68499s, new UserSelectionFlowContract$Step.Initial((fz3.c) obj2), false, null, false, 12);
        return Unit.f186387a;
    }
}
