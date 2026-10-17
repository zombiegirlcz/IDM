package com.revolut.feature.travel.flights.impl.ui.screen.booking_contact;

import b4g.f;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.TravelFlightsBookingContactScreenContract$InputData;
import com.revolut.feature.travel.flights.models.domain.common.PhoneNumber;
import gim.i;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import l7g.c;
import y4g.g;
import y4g.h;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f93262w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f93263x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar, g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f93262w = cVar;
        this.f93263x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f93262w, this.f93263x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar = this.v;
        TravelFlightsBookingContactScreenContract$InputData travelFlightsBookingContactScreenContract$InputData = bVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        try {
            if (i == 0) {
                o.b(obj2);
                f fVar = bVar.f93266r;
                String str = ((TravelFlightsBookingContactScreenContract$InputData.ForBookingDetails) travelFlightsBookingContactScreenContract$InputData).f93256a;
                c cVar = this.f93262w;
                this.u = 1;
                if (fVar.b(str, cVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            g gVar = this.f93263x;
            String str2 = gVar.f310921a;
            PhoneNumber phoneNumberJ2 = b.J2(gVar);
            if (phoneNumberJ2 == null) {
                phoneNumberJ2 = ((TravelFlightsBookingContactScreenContract$InputData.ForBookingDetails) travelFlightsBookingContactScreenContract$InputData).f93258c;
            }
            bVar.C2(new h(str2, phoneNumberJ2));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            bVar.H2(bVar.f93268t, new y4b.b(11));
        }
        return Unit.f186387a;
    }
}
