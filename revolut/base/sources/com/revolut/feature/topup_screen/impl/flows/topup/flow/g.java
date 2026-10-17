package com.revolut.feature.topup_screen.impl.flows.topup.flow;

import com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import rea.m;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TopupFlowContract$Step f90937w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TopupFlowContract$Step topupFlowContract$Step, i iVar, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f90937w = topupFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.f90937w, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        i iVar = this.v;
        uye.g gVar = iVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            m mVar = iVar.f90944e0;
            xi0.b bVar = ((TopupFlowContract$Step.ExchangeGlobalAccess) this.f90937w).f90848a;
            ufm.i iVarG = mVar.g(e1f.c.a(gVar.f284275a), e1f.c.b(gVar.f284275a), bVar);
            this.u = 1;
            obj2 = nim.a.b(iVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        iVar.S2(((eda.e) obj2).f124961a);
        return Unit.f186387a;
    }
}
