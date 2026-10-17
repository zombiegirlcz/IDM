package com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.pass_booking;

import com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.pass_booking.AsftPassBookingFlowContract$Step;
import cu8.r0;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import ks8.j;
import ks8.m;
import oki.h;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
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
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            bVar.f98790p.a();
            r0 r0Var = bVar.o;
            this.u = 1;
            obj2 = m.b(r0Var, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        j jVar = (j) obj2;
        if (jVar instanceof ks8.i) {
            bVar.C1(u0.b(((ks8.i) jVar).f189312a));
            h.D2(bVar.f98792r);
        } else {
            if (!(jVar instanceof j.a)) {
                throw new NoWhenBranchMatchedException();
            }
            h.u2(bVar, bVar.f98792r, AsftPassBookingFlowContract$Step.AirportSelection.f98777a, null, 6);
        }
        return Unit.f186387a;
    }
}
