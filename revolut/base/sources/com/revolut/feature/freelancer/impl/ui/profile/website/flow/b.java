package com.revolut.feature.freelancer.impl.ui.profile.website.flow;

import au6.k2;
import com.revolut.feature.freelancer.impl.ui.profile.website.flow.a;
import et6.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import w4l.f;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
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
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            h1 h1Var = dVar.o;
            this.u = 1;
            f fVar = ((k2) h1Var.f129237b).i;
            Object obj3 = Unit.f186387a;
            Object objA = nim.a.a(fVar.g(obj3, false), this);
            if (objA != aVar) {
                objA = obj3;
            }
            if (objA == aVar) {
                obj3 = objA;
            }
            if (obj3 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        dVar.C2(a.C0493a.f74083a);
        return Unit.f186387a;
    }
}
