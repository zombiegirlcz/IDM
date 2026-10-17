package com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mvj.b;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r8 == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r8 == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        return r2;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            mvj.b r0 = r7.v
            yuj.a r1 = r0.f209265p
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L1d
            if (r3 == r5) goto L19
            if (r3 != r4) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            yhm.o.b(r8)
            goto L78
        L1d:
            yhm.o.b(r8)
            com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.TravelItineraryRemoveEventContract$InputData r8 = r0.o
            com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.TravelItineraryRemoveEventContract$Target r8 = r8.f101649a
            boolean r3 = r8 instanceof com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.TravelItineraryRemoveEventContract$Target.Event
            r6 = 0
            if (r3 == 0) goto L4f
            com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.TravelItineraryRemoveEventContract$Target$Event r8 = (com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.TravelItineraryRemoveEventContract$Target.Event) r8
            java.lang.String r8 = r8.f101650a
            r7.u = r5
            tuj.g r1 = r1.f317057a
            r1.getClass()
            tuj.f r3 = new tuj.f
            r4 = 0
            r3.<init>(r1, r8, r6, r4)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r3, r7)
            if (r8 != r2) goto L45
            goto L47
        L45:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L47:
            if (r8 != r2) goto L4a
            goto L4c
        L4a:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L4c:
            if (r8 != r2) goto L78
            goto L77
        L4f:
            boolean r3 = r8 instanceof com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.TravelItineraryRemoveEventContract$Target.Proposal
            if (r3 == 0) goto L80
            com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.TravelItineraryRemoveEventContract$Target$Proposal r8 = (com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.TravelItineraryRemoveEventContract$Target.Proposal) r8
            java.lang.String r8 = r8.f101651a
            r7.u = r4
            tuj.g r1 = r1.f317057a
            r1.getClass()
            tuj.f r3 = new tuj.f
            r3.<init>(r1, r8, r6, r5)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r3, r7)
            if (r8 != r2) goto L6e
            goto L70
        L6e:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L70:
            if (r8 != r2) goto L73
            goto L75
        L73:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L75:
            if (r8 != r2) goto L78
        L77:
            return r2
        L78:
            aii.q r8 = aii.q.f5292a
            r0.C2(r8)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L80:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
