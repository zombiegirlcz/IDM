package a6g;

import com.revolut.feature.travel.flights.impl.ui.screen.fare_selection.TravelFlightsFareSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelFlightsFareSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TravelFlightsFareSelectionScreen travelFlightsFareSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelFlightsFareSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b A[SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.u
            com.revolut.feature.travel.flights.impl.ui.screen.fare_selection.TravelFlightsFareSelectionScreen r1 = r5.v
            switch(r0) {
                case 0: goto L7c;
                default: goto L7;
            }
        L7:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r6)
            a6g.i r6 = r1.e3()
            com.revolut.feature.travel.flights.impl.ui.screen.fare_selection.a r6 = (com.revolut.feature.travel.flights.impl.ui.screen.fare_selection.a) r6
            cli.y r0 = r6.o
            java.lang.Object r1 = r0.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            a6g.g r1 = (a6g.g) r1
            java.util.List r1 = r1.f1687a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L30
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L30
            goto L45
        L30:
            java.util.Iterator r2 = r1.iterator()
        L34:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r2.next()
            com.revolut.feature.travel.flights.models.domain.itinerary.TravelFlightsFare r3 = (com.revolut.feature.travel.flights.models.domain.itinerary.TravelFlightsFare) r3
            java.lang.String r3 = r3.f93517b
            if (r3 != 0) goto L34
            goto L79
        L45:
            java.util.Iterator r1 = r1.iterator()
        L49:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r1.next()
            r3 = r2
            com.revolut.feature.travel.flights.models.domain.itinerary.TravelFlightsFare r3 = (com.revolut.feature.travel.flights.models.domain.itinerary.TravelFlightsFare) r3
            java.lang.String r3 = r3.f93516a
            java.lang.Object r4 = r0.f22677a
            vkm.j2 r4 = (vkm.j2) r4
            java.lang.Object r4 = r4.getValue()
            a6g.g r4 = (a6g.g) r4
            java.lang.String r4 = r4.f1688b
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r4)
            if (r3 == 0) goto L49
            goto L6c
        L6b:
            r2 = 0
        L6c:
            com.revolut.feature.travel.flights.models.domain.itinerary.TravelFlightsFare r2 = (com.revolut.feature.travel.flights.models.domain.itinerary.TravelFlightsFare) r2
            if (r2 != 0) goto L71
            goto L79
        L71:
            a6g.h r0 = new a6g.h
            r0.<init>(r2)
            r6.C2(r0)
        L79:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L7c:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r6)
            a6g.i r6 = r1.e3()
            com.revolut.feature.travel.flights.impl.ui.screen.fare_selection.a r6 = (com.revolut.feature.travel.flights.impl.ui.screen.fare_selection.a) r6
            r6.B2()
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a6g.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
