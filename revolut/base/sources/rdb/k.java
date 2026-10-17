package rdb;

import com.revolut.feature.retail.restaurants.impl.data.network.ReservationsService;
import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import do3.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.n;
import xdb.v;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReservationsService f253406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f253407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f253408c;
    public final ue0.c d;
    public final x4l.c e;
    public final x4l.c f;

    public k(ReservationsService reservationsService, n availabilityCalendarCache, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(reservationsService, "reservationsService");
        Intrinsics.checkNotNullParameter(availabilityCalendarCache, "availabilityCalendarCache");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f253406a = reservationsService;
        this.f253407b = availabilityCalendarCache;
        this.f253408c = memoryCache;
        this.d = storage;
        final int i = 0;
        Continuation continuation = null;
        this.e = new x4l.c(new i(this, continuation, i), new Function1(this) { // from class: rdb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f253394b;

            {
                this.f253394b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String reservationId = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
                        return (Reservation) this.f253394b.f253408c.get(q.b(reservationId));
                    default:
                        Intrinsics.checkNotNullParameter(reservationId, "reservationPageId");
                        return (v) this.f253394b.f253408c.get(q.c(reservationId));
                }
            }
        }, new Function2(this) { // from class: rdb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f253396b;

            {
                this.f253396b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String reservationId = (String) obj2;
                switch (i) {
                    case 0:
                        Reservation reservation = (Reservation) obj3;
                        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
                        Intrinsics.checkNotNullParameter(reservation, "reservation");
                        this.f253396b.f253408c.f(q.b(reservationId), reservation);
                        break;
                    default:
                        v reservationPage = (v) obj3;
                        Intrinsics.checkNotNullParameter(reservationId, "reservationPageId");
                        Intrinsics.checkNotNullParameter(reservationPage, "reservationPage");
                        this.f253396b.f253408c.f(q.c(reservationId), reservationPage);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j(this, continuation, i), new pfk.q(this, continuation, 21));
        final int i2 = 1;
        this.f = new x4l.c(new i(this, continuation, i2), new Function1(this) { // from class: rdb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f253394b;

            {
                this.f253394b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String reservationId = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
                        return (Reservation) this.f253394b.f253408c.get(q.b(reservationId));
                    default:
                        Intrinsics.checkNotNullParameter(reservationId, "reservationPageId");
                        return (v) this.f253394b.f253408c.get(q.c(reservationId));
                }
            }
        }, new Function2(this) { // from class: rdb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f253396b;

            {
                this.f253396b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String reservationId = (String) obj2;
                switch (i2) {
                    case 0:
                        Reservation reservation = (Reservation) obj3;
                        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
                        Intrinsics.checkNotNullParameter(reservation, "reservation");
                        this.f253396b.f253408c.f(q.b(reservationId), reservation);
                        break;
                    default:
                        v reservationPage = (v) obj3;
                        Intrinsics.checkNotNullParameter(reservationId, "reservationPageId");
                        Intrinsics.checkNotNullParameter(reservationPage, "reservationPage");
                        this.f253396b.f253408c.f(q.c(reservationId), reservationPage);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j(this, continuation, i2), new pfk.q(this, continuation, 22));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, xdb.o r9, java.lang.String r10, gim.c r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof rdb.d
            if (r0 == 0) goto L13
            r0 = r11
            rdb.d r0 = (rdb.d) r0
            int r1 = r0.f253397w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f253397w = r1
            goto L18
        L13:
            rdb.d r0 = new rdb.d
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f253397w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r11)
            goto L5f
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r11)
            java.lang.String r11 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r11)
            qdb.j r11 = new qdb.j
            int r2 = r9.f304400a
            java.time.LocalDate r4 = r9.f304401b
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.time.LocalTime r6 = r9.f304402c
            java.lang.String r6 = r6.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            java.lang.String r9 = r9.d
            r11.<init>(r2, r4, r6, r9)
            r0.f253397w = r3
            com.revolut.feature.retail.restaurants.impl.data.network.ReservationsService r9 = r7.f253406a
            java.lang.Object r11 = r9.createReservation(r8, r10, r11, r0)
            if (r11 != r1) goto L5f
            return r1
        L5f:
            qdb.b r11 = (qdb.b) r11
            java.lang.String r8 = r11.getId()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rdb.k.a(java.lang.String, xdb.o, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, int r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof rdb.e
            if (r0 == 0) goto L13
            r0 = r9
            rdb.e r0 = (rdb.e) r0
            int r1 = r0.f253399x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f253399x = r1
            goto L18
        L13:
            rdb.e r0 = new rdb.e
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f253399x
            ne0.n r3 = r6.f253407b
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            rdb.a r7 = r0.u
            yhm.o.b(r9)
            goto L55
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r9)
            rdb.a r9 = new rdb.a
            r9.<init>(r7, r8)
            java.lang.Object r2 = r3.get(r9)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L44
            return r2
        L44:
            r0.u = r9
            r0.f253399x = r4
            com.revolut.feature.retail.restaurants.impl.data.network.ReservationsService r2 = r6.f253406a
            r4 = 0
            java.lang.Object r7 = r2.getAvailabilityCalendar(r7, r8, r4, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r5 = r9
            r9 = r7
            r7 = r5
        L55:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r8 = new java.util.ArrayList
            r0 = 10
            int r0 = zhm.w.t(r9, r0)
            r8.<init>(r0)
            java.util.Iterator r9 = r9.iterator()
        L66:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r0 = r9.next()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.time.LocalDate r0 = java.time.LocalDate.parse(r0)
            r8.add(r0)
            goto L66
        L7a:
            r3.f(r7, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rdb.k.b(java.lang.String, int, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof rdb.f
            if (r0 == 0) goto L13
            r0 = r6
            rdb.f r0 = (rdb.f) r0
            int r1 = r0.f253400w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f253400w = r1
            goto L18
        L13:
            rdb.f r0 = new rdb.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f253400w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f253400w = r3
            com.revolut.feature.retail.restaurants.impl.data.network.ReservationsService r6 = r4.f253406a
            java.lang.Object r6 = r6.getReservation(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            qdb.k r6 = (qdb.k) r6
            com.revolut.feature.retail.restaurants.impl.domain.model.Reservation r5 = qdb.l.a(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rdb.k.c(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof rdb.g
            if (r0 == 0) goto L13
            r0 = r6
            rdb.g r0 = (rdb.g) r0
            int r1 = r0.f253401w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f253401w = r1
            goto L18
        L13:
            rdb.g r0 = new rdb.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f253401w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f253401w = r3
            com.revolut.feature.retail.restaurants.impl.data.network.ReservationsService r6 = r4.f253406a
            java.lang.Object r6 = r6.getReservationPage(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            qdb.m r6 = (qdb.m) r6
            xdb.v r5 = d9.e1.X(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rdb.k.d(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(java.lang.String r18, java.time.LocalDate r19, int r20, java.time.LocalTime r21, java.lang.Integer r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rdb.k.e(java.lang.String, java.time.LocalDate, int, java.time.LocalTime, java.lang.Integer, gim.c):java.io.Serializable");
    }
}
