package com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results;

import gim.i;
import hfg.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nhg.f0;
import nhg.h0;
import nhg.r;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        m mVar = (m) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        int i = h0.f215480a[mVar.ordinal()];
        f fVar = this.v;
        if (i == 1) {
            fVar.M2(new r(false));
        } else if (i == 2 || i == 3) {
            fVar.H2(fVar.u, new f0(3));
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
