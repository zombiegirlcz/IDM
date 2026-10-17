package com.revolut.feature.revolut_shop.ui.flow.ipp_shop;

import com.revolut.feature.revolut_shop.ui.flow.ipp_shop.IppShopFlowContract$Step;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import oki.h;
import rp0.b1;
import rp0.c1;
import rp0.d1;
import rp0.e1;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((e1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        e1 e1Var = (e1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (e1Var instanceof b1) {
            b bVar = this.v;
            h.t2(bVar, bVar.f84217q, IppShopFlowContract$Step.Cart.f84209a, true, null, false, 12);
        } else if (!(e1Var instanceof d1) && !(e1Var instanceof c1)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
