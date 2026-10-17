package com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import puj.f;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f101633w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, f fVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f101633w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f101633w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r2 == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (r3.a(r2, r11, r17) == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        if (r3.a(r2, r14, r17) == r4) goto L33;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b r1 = r0.v
            com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$InputData r2 = r1.o
            yuj.a r3 = r1.f101634p
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r0.u
            avj.b r6 = avj.b.f10049a
            r7 = 3
            r8 = 2
            r9 = 1
            if (r5 == 0) goto L2b
            if (r5 == r9) goto L27
            if (r5 == r8) goto L22
            if (r5 != r7) goto L1a
            goto L22
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L22:
            yhm.o.b(r18)
            goto L9c
        L27:
            yhm.o.b(r18)
            goto L5e
        L2b:
            yhm.o.b(r18)
            com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$Mode r5 = r2.e
            boolean r10 = r5 instanceof com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$Mode.Edit
            puj.f r14 = r0.f101633w
            if (r10 == 0) goto L61
            com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$Mode$Edit r5 = (com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$Mode.Edit) r5
            java.lang.String r13 = r5.f101628a
            r0.u = r9
            tuj.g r12 = r3.f317057a
            r12.getClass()
            tuj.d r11 = new tuj.d
            r16 = 1
            r15 = 0
            r11.<init>(r12, r13, r14, r15, r16)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            java.lang.Object r2 = skm.e0.J(r2, r11, r0)
            if (r2 != r4) goto L54
            goto L56
        L54:
            kotlin.Unit r2 = kotlin.Unit.f186387a
        L56:
            if (r2 != r4) goto L59
            goto L5b
        L59:
            kotlin.Unit r2 = kotlin.Unit.f186387a
        L5b:
            if (r2 != r4) goto L5e
            goto L9b
        L5e:
            avj.c r6 = avj.c.f10050a
            goto L9c
        L61:
            boolean r9 = r5 instanceof com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$Mode.AddProposal
            if (r9 == 0) goto L89
            java.lang.String r2 = r2.f101617a
            com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$Mode$AddProposal r5 = (com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$Mode.AddProposal) r5
            java.lang.String r5 = r5.f101625a
            java.lang.String r7 = r14.f239917a
            java.time.LocalDateTime r9 = r14.f239918b
            com.revolut.feature.address.models.Address r10 = r14.f239919c
            java.lang.String r11 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r11)
            java.lang.String r11 = "date"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r11)
            puj.f r11 = new puj.f
            r11.<init>(r7, r9, r10, r5)
            r0.u = r8
            java.lang.Object r2 = r3.a(r2, r11, r0)
            if (r2 != r4) goto L9c
            goto L9b
        L89:
            com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$Mode$Add r8 = com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$Mode.Add.f101624a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r8)
            if (r5 == 0) goto La2
            java.lang.String r2 = r2.f101617a
            r0.u = r7
            java.lang.Object r2 = r3.a(r2, r14, r0)
            if (r2 != r4) goto L9c
        L9b:
            return r4
        L9c:
            r1.C2(r6)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        La2:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
