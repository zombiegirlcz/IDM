package com.revolut.feature.apm.blik.impl.ui.terms_acceptance;

import com.revolut.feature.apm.blik.impl.ui.terms_acceptance.a;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import ku1.v;
import n14.k;
import nii.d;
import oki.h;
import rik.e;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            v vVar = new v(21);
            e eVar = new e(cVar, null, 29);
            this.u = 1;
            obj2 = k.Q(cVar, null, null, vVar, eVar, this, 2);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        nii.e eVar2 = (nii.e) obj2;
        if (eVar2 instanceof d) {
            cVar.C2(a.b.f61691a);
        } else {
            if (!(eVar2 instanceof nii.c)) {
                throw new NoWhenBranchMatchedException();
            }
            h.D2(cVar.f61694r);
        }
        return Unit.f186387a;
    }
}
