package com.revolut.retail.feature.impl.userauth.flow;

import cul.n0;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ q89.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f101672w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, Continuation continuation, q89.d dVar) {
        super(1, continuation);
        this.v = dVar;
        this.f101672w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.f101672w, continuation, this.v);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            q89.d dVar = this.v;
            boolean z = dVar instanceof q89.b;
            f fVar = this.f101672w;
            if (z) {
                fVar.H2(fVar.L, new n0(dVar, 16));
                fVar.K2();
            } else {
                if (!(dVar instanceof q89.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                q89.f fVar2 = ((q89.c) dVar).f243046a;
                this.u = 1;
                if (f.I2(fVar, fVar2, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
