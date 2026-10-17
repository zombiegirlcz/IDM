package uk9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import vi9.c0;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f280705w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ bi9.f f280706x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, bi9.f fVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f280705w = kVar;
        this.f280706x = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f280705w, this.f280706x, continuation, 0);
            default:
                return new j(this.f280705w, this.f280706x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    xh9.a aVar2 = this.f280705w.f280707p;
                    bi9.f fVar = this.f280706x;
                    ti9.g gVar = (ti9.g) aVar2;
                    pfm.a aVarP = gVar.p(fVar.f15452b, fVar.f15451a.f322326a);
                    this.v = 1;
                    if (nim.a.a(aVarP, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                bi9.f fVar2 = this.f280706x;
                int i3 = 2;
                Continuation continuation = null;
                k kVar = this.f280705w;
                if (i2 == 0) {
                    o.b(obj2);
                    j60.a.v(kVar.f280709r, false, null, 3);
                    j jVar = new j(kVar, fVar2, continuation, 0);
                    this.v = 1;
                    if (kVar.p2(this, jVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        kVar.u2();
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                kVar.f280708q.getClass();
                Flow flowX1 = kVar.X1(c0.g(fVar2));
                tk9.i iVar = new tk9.i(i3, 6, continuation);
                this.v = 2;
                if (q.y(flowX1, iVar, this) == aVar3) {
                    return aVar3;
                }
                kVar.u2();
                return Unit.f186387a;
        }
    }
}
