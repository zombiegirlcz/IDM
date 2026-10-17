package com.revolut.feature.travel.flights.impl.ui.screen.post_booking;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.impl.ui.screen.post_booking.TravelFlightsPostBookingScreenContract$Tab;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import l7g.b0;
import l7g.q;
import sx2.h;
import yhm.o;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
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
        return ((a) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b0 b0Var = (b0) data.getContent();
        q qVar = b0Var != null ? b0Var.d : null;
        q qVar2 = q.CONFIRMED;
        TravelFlightsPostBookingScreenContract$Tab.Overview overview = TravelFlightsPostBookingScreenContract$Tab.Overview.f93392a;
        List listK = qVar == qVar2 ? v.k(overview, TravelFlightsPostBookingScreenContract$Tab.CheckIn.f93390a, TravelFlightsPostBookingScreenContract$Tab.Manage.f93391a) : u.c(overview);
        b bVar = this.v;
        bVar.H2(bVar.f93395r, new h(listK, bVar, 24));
        return Unit.f186387a;
    }
}
