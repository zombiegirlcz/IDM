package fag;

import com.revolut.feature.travel.hotels.impl.network.TravelHotelsService;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentStatus;
import dp4.a1;
import ip0.v7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsService f133352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f133353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f133354c;
    public final x4l.c d;

    public o(TravelHotelsService service, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f133352a = service;
        this.f133353b = memoryCache;
        Continuation continuation = null;
        final int i = 0;
        int i2 = 2;
        int i3 = 3;
        this.f133354c = new x4l.c(new a1(this, continuation, 24), new Function1(this) { // from class: fag.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f133336b;

            {
                this.f133336b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        qei.g params = (qei.g) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ne0.j jVar = this.f133336b.f133353b;
                        String str = params.f245168a;
                        String string = params.f245169b.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        String string2 = params.f245170c.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        return (qei.f) jVar.get("travel_hotels_booking_amendment_availability_key_" + str + "_" + string + "_" + string2);
                    default:
                        qei.n params2 = (qei.n) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (TravelHotelsBookingAmendmentStatus) v7.r("travel_hotels_booking_amendment_status_key_", params2.f245179b, this.f133336b.f133353b);
                }
            }
        }, new Function2(this) { // from class: fag.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f133339b;

            {
                this.f133339b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        qei.g params = (qei.g) obj2;
                        qei.f bookingAmendmentAvailability = (qei.f) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(bookingAmendmentAvailability, "bookingAmendmentAvailability");
                        ne0.j jVar = this.f133339b.f133353b;
                        String str = params.f245168a;
                        String string = params.f245169b.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        String string2 = params.f245170c.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        StringBuilder sb6 = new StringBuilder("travel_hotels_booking_amendment_availability_key_");
                        sb6.append(str);
                        sb6.append("_");
                        jVar.f(a0.d.u(sb6, string, "_", string2), bookingAmendmentAvailability);
                        break;
                    default:
                        qei.n params2 = (qei.n) obj2;
                        TravelHotelsBookingAmendmentStatus status = (TravelHotelsBookingAmendmentStatus) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f133339b.f133353b.f("travel_hotels_booking_amendment_status_key_" + params2.f245179b, status);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e31.i(i2, 8, continuation), new eci.a(i3, 4, continuation));
        final int i5 = 1;
        this.d = new x4l.c(new a1(this, continuation, 25), new Function1(this) { // from class: fag.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f133336b;

            {
                this.f133336b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        qei.g params = (qei.g) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ne0.j jVar = this.f133336b.f133353b;
                        String str = params.f245168a;
                        String string = params.f245169b.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        String string2 = params.f245170c.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        return (qei.f) jVar.get("travel_hotels_booking_amendment_availability_key_" + str + "_" + string + "_" + string2);
                    default:
                        qei.n params2 = (qei.n) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (TravelHotelsBookingAmendmentStatus) v7.r("travel_hotels_booking_amendment_status_key_", params2.f245179b, this.f133336b.f133353b);
                }
            }
        }, new Function2(this) { // from class: fag.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f133339b;

            {
                this.f133339b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        qei.g params = (qei.g) obj2;
                        qei.f bookingAmendmentAvailability = (qei.f) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(bookingAmendmentAvailability, "bookingAmendmentAvailability");
                        ne0.j jVar = this.f133339b.f133353b;
                        String str = params.f245168a;
                        String string = params.f245169b.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        String string2 = params.f245170c.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        StringBuilder sb6 = new StringBuilder("travel_hotels_booking_amendment_availability_key_");
                        sb6.append(str);
                        sb6.append("_");
                        jVar.f(a0.d.u(sb6, string, "_", string2), bookingAmendmentAvailability);
                        break;
                    default:
                        qei.n params2 = (qei.n) obj2;
                        TravelHotelsBookingAmendmentStatus status = (TravelHotelsBookingAmendmentStatus) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f133339b.f133353b.f("travel_hotels_booking_amendment_status_key_" + params2.f245179b, status);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e31.i(i2, 9, continuation), new eci.a(i3, 5, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, qei.l r12, gim.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof fag.m
            if (r0 == 0) goto L13
            r0 = r13
            fag.m r0 = (fag.m) r0
            int r1 = r0.f133344w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f133344w = r1
            goto L18
        L13:
            fag.m r0 = new fag.m
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f133344w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L8b
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r13)
            wj0.b r13 = new wj0.b
            java.lang.String r2 = "stays-booking-amendment-confirmation"
            r13.<init>(r2)
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            r9g.y r4 = new r9g.y
            java.lang.String r5 = r12.f245175a
            java.lang.String r6 = r12.f245176b
            qei.k r12 = r12.f245177c
            r7 = 0
            if (r12 == 0) goto L7d
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            boolean r2 = r12 instanceof qei.h
            if (r2 == 0) goto L62
            r9g.c0 r2 = new r9g.c0
            qei.h r12 = (qei.h) r12
            qei.i r8 = r12.f245172b
            java.lang.String r8 = r8.name()
            java.lang.String r12 = r12.f245171a
            r9 = 2
            r2.<init>(r8, r7, r12, r9)
        L60:
            r7 = r2
            goto L7d
        L62:
            boolean r2 = r12 instanceof qei.j
            if (r2 == 0) goto L77
            r9g.c0 r2 = new r9g.c0
            qei.j r12 = (qei.j) r12
            qei.i r8 = r12.f245174b
            java.lang.String r8 = r8.name()
            java.lang.String r12 = r12.f245173a
            r9 = 4
            r2.<init>(r8, r12, r7, r9)
            goto L60
        L77:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L7d:
            r4.<init>(r5, r6, r7)
            r0.f133344w = r3
            com.revolut.feature.travel.hotels.impl.network.TravelHotelsService r12 = r10.f133352a
            java.lang.Object r13 = r12.confirmAmendment(r11, r13, r4, r0)
            if (r13 != r1) goto L8b
            return r1
        L8b:
            r9g.g0 r13 = (r9g.g0) r13
            com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentStatus r11 = j9g.q.b(r13)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: fag.o.a(java.lang.String, qei.l, gim.c):java.lang.Object");
    }
}
