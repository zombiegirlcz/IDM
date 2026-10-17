package com.revolut.retail.feature.impl.userauth.location_enforce.ui.flow;

import com.revolut.retail.feature.impl.userauth.location_enforce.ui.flow.LocationEnforceFlowContract$Step;
import gim.i;
import jwj.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
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
        return ((a) create((x39.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        x39.b bVar = (x39.b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        int i = bVar == null ? -1 : e.f179020a[bVar.ordinal()];
        b bVar2 = this.v;
        if (i == 1) {
            h.D2(bVar2.f101687r);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            h.t2(bVar2, bVar2.f101687r, LocationEnforceFlowContract$Step.LocationToggle.f101683a, false, null, false, 12);
        }
        return Unit.f186387a;
    }
}
