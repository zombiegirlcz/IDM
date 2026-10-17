package com.revolut.feature.travel.experiences.impl.ui.screen.cancellation;

import c1g.h;
import c1g.m;
import com.revolut.feature.travel.experiences.api.models.cancellation.TravelExperienceCancellationRequest;
import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$Mode;
import gim.i;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s1g.g;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ um0 f93033w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, um0 um0Var, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f93033w = um0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f93033w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            e eVar = this.v;
            TravelExperiencesCancellationScreenContract$Mode travelExperiencesCancellationScreenContract$Mode = ((g) eVar.t2()).f259135a;
            Intrinsics.i(travelExperiencesCancellationScreenContract$Mode, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract.Mode.BookingCancellation");
            TravelExperiencesCancellationScreenContract$Mode.BookingCancellation bookingCancellation = (TravelExperiencesCancellationScreenContract$Mode.BookingCancellation) travelExperiencesCancellationScreenContract$Mode;
            Object obj3 = this.f93033w.d;
            jyf.a aVar2 = obj3 instanceof jyf.a ? (jyf.a) obj3 : null;
            String str = aVar2 != null ? aVar2.f179418b : null;
            if (!((m) eVar.f93043t).a() || str == null) {
                str = bookingCancellation.f93029c;
            }
            h hVar = eVar.f93042s;
            TravelExperienceCancellationRequest travelExperienceCancellationRequest = new TravelExperienceCancellationRequest(bookingCancellation.f93028b, str);
            this.u = 1;
            Object objC = hVar.f20486a.c(travelExperienceCancellationRequest, this);
            if (objC != aVar) {
                objC = Unit.f186387a;
            }
            if (objC == aVar) {
                return aVar;
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
