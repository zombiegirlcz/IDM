package y4g;

import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.TravelFlightsBookingContactScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsBookingContactScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelFlightsBookingContactScreen travelFlightsBookingContactScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsBookingContactScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((PhoneEditorDelegate.PhoneData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048 A[PHI: r3
      0x0048: PHI (r3v7 y4g.j) = (r3v6 y4g.j), (r3v10 y4g.j) binds: [B:3:0x0030, B:8:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.u
            com.revolut.core.ui_kit.delegates.PhoneEditorDelegate$PhoneData r0 = (com.revolut.core.ui_kit.delegates.PhoneEditorDelegate.PhoneData) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r6)
            com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.TravelFlightsBookingContactScreen r6 = r5.v
            y4g.k r6 = r6.d()
            kotlin.jvm.internal.Intrinsics.h(r0)
            java.lang.String r1 = r0.f52896b
            com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.b r6 = (com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.b) r6
            r6.getClass()
            z80.b r2 = r6.f93264p
            java.lang.String r3 = "phoneData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            cli.y r0 = r6.f93268t
            java.lang.Object r3 = r0.f22677a
            vkm.j2 r3 = (vkm.j2) r3
            java.lang.Object r3 = r3.getValue()
            y4g.i r3 = (y4g.i) r3
            y4g.g r3 = r3.f310926b
            y4g.j r3 = r3.f310922b
            if (r3 != 0) goto L48
            wi0.b r3 = r2.f()
            if (r3 != 0) goto L3f
            wi0.a r3 = wi0.b.Companion
            r3.getClass()
            wi0.b r3 = wi0.b.p0
        L3f:
            java.lang.String r4 = ""
            y4g.j r3 = r6.I2(r4, r3)
            if (r3 != 0) goto L48
            goto L5c
        L48:
            wi0.b r4 = r3.f310928a
            java.lang.String r2 = r2.g(r1, r4)
            if (r2 != 0) goto L51
            goto L52
        L51:
            r1 = r2
        L52:
            xyc.j r2 = new xyc.j
            r4 = 19
            r2.<init>(r3, r1, r4)
            r6.H2(r0, r2)
        L5c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y4g.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
