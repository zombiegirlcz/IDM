package b4g;

import com.revolut.feature.travel.flights.impl.data.network.TravelFlightsApi;
import com.revolut.feature.travel.flights.models.domain.booking.BookingConfirmation;
import com.revolut.feature.travel.flights.models.domain.booking.BookingPreview;
import com.revolut.feature.travel.flights.models.domain.booking.BookingPreviewParams;
import com.revolut.feature.travel.flights.models.domain.booking.BookingPreviewPayment;
import com.revolut.feature.travel.flights.models.domain.booking.BookingStatus;
import com.revolut.feature.travel.flights.models.domain.booking.OfferDetails;
import com.revolut.feature.travel.flights.models.domain.booking.TravelFlightsLegalAcceptance;
import ip0.v7;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class q {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsApi f12358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f12359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f12360c;

    public q(TravelFlightsApi api2, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f12358a = api2;
        this.f12359b = memoryCache;
        Continuation continuation = null;
        final int i = 0;
        int i2 = 2;
        int i3 = 3;
        this.f12360c = new x4l.c(new a72.k(this, continuation, 23), new Function1(this) { // from class: b4g.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f12342b;

            {
                this.f12342b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        n request = (n) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        return (BookingPreview) this.f12342b.f12359b.get(q.c(request));
                    case 1:
                        m request2 = (m) obj2;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        return (BookingConfirmation) this.f12342b.f12359b.get(q.b(request2));
                    default:
                        String bookingId = (String) obj2;
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        return (BookingStatus) v7.r("FLIGHTS_BOOKING_STATUS_", bookingId, this.f12342b.f12359b);
                }
            }
        }, new Function2(this) { // from class: b4g.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f12345b;

            {
                this.f12345b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                switch (i) {
                    case 0:
                        n request = (n) obj2;
                        BookingPreview preview = (BookingPreview) obj3;
                        Intrinsics.checkNotNullParameter(request, "request");
                        Intrinsics.checkNotNullParameter(preview, "preview");
                        ne0.j jVar = this.f12345b.f12359b;
                        String strC = q.c(request);
                        zhm.f0 notifications = zhm.f0.f322471a;
                        String bookingToken = preview.f93443a;
                        BookingPreviewPayment payment = preview.f93444b;
                        OfferDetails offerDetails = preview.f93445c;
                        TravelFlightsLegalAcceptance legalAcceptance = preview.d;
                        List carrierCodes = preview.f;
                        Intrinsics.checkNotNullParameter(bookingToken, "bookingToken");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        Intrinsics.checkNotNullParameter(offerDetails, "offerDetails");
                        Intrinsics.checkNotNullParameter(legalAcceptance, "legalAcceptance");
                        Intrinsics.checkNotNullParameter(notifications, "notifications");
                        Intrinsics.checkNotNullParameter(carrierCodes, "carrierCodes");
                        jVar.f(strC, new BookingPreview(bookingToken, payment, offerDetails, legalAcceptance, notifications, carrierCodes));
                        break;
                    case 1:
                        m request2 = (m) obj2;
                        BookingConfirmation confirmation = (BookingConfirmation) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
                        this.f12345b.f12359b.f(q.b(request2), confirmation);
                        break;
                    default:
                        String bookingId = (String) obj2;
                        BookingStatus status = (BookingStatus) obj3;
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f12345b.f12359b.f("FLIGHTS_BOOKING_STATUS_" + bookingId, status);
                        break;
                }
                return Unit.f186387a;
            }
        }, new akl.o(i2, 8, continuation), new a19.e(i3, 10, continuation));
        final int i5 = 1;
        new x4l.c(new a72.k(this, continuation, 22), new Function1(this) { // from class: b4g.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f12342b;

            {
                this.f12342b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        n request = (n) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        return (BookingPreview) this.f12342b.f12359b.get(q.c(request));
                    case 1:
                        m request2 = (m) obj2;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        return (BookingConfirmation) this.f12342b.f12359b.get(q.b(request2));
                    default:
                        String bookingId = (String) obj2;
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        return (BookingStatus) v7.r("FLIGHTS_BOOKING_STATUS_", bookingId, this.f12342b.f12359b);
                }
            }
        }, new Function2(this) { // from class: b4g.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f12345b;

            {
                this.f12345b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                switch (i5) {
                    case 0:
                        n request = (n) obj2;
                        BookingPreview preview = (BookingPreview) obj3;
                        Intrinsics.checkNotNullParameter(request, "request");
                        Intrinsics.checkNotNullParameter(preview, "preview");
                        ne0.j jVar = this.f12345b.f12359b;
                        String strC = q.c(request);
                        zhm.f0 notifications = zhm.f0.f322471a;
                        String bookingToken = preview.f93443a;
                        BookingPreviewPayment payment = preview.f93444b;
                        OfferDetails offerDetails = preview.f93445c;
                        TravelFlightsLegalAcceptance legalAcceptance = preview.d;
                        List carrierCodes = preview.f;
                        Intrinsics.checkNotNullParameter(bookingToken, "bookingToken");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        Intrinsics.checkNotNullParameter(offerDetails, "offerDetails");
                        Intrinsics.checkNotNullParameter(legalAcceptance, "legalAcceptance");
                        Intrinsics.checkNotNullParameter(notifications, "notifications");
                        Intrinsics.checkNotNullParameter(carrierCodes, "carrierCodes");
                        jVar.f(strC, new BookingPreview(bookingToken, payment, offerDetails, legalAcceptance, notifications, carrierCodes));
                        break;
                    case 1:
                        m request2 = (m) obj2;
                        BookingConfirmation confirmation = (BookingConfirmation) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
                        this.f12345b.f12359b.f(q.b(request2), confirmation);
                        break;
                    default:
                        String bookingId = (String) obj2;
                        BookingStatus status = (BookingStatus) obj3;
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f12345b.f12359b.f("FLIGHTS_BOOKING_STATUS_" + bookingId, status);
                        break;
                }
                return Unit.f186387a;
            }
        }, new akl.o(i2, 7, continuation), new a19.e(i3, 9, continuation));
        final int i6 = 2;
        final int i21 = 2;
        new x4l.c(new a72.k(this, continuation, 24), new Function1(this) { // from class: b4g.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f12342b;

            {
                this.f12342b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        n request = (n) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        return (BookingPreview) this.f12342b.f12359b.get(q.c(request));
                    case 1:
                        m request2 = (m) obj2;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        return (BookingConfirmation) this.f12342b.f12359b.get(q.b(request2));
                    default:
                        String bookingId = (String) obj2;
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        return (BookingStatus) v7.r("FLIGHTS_BOOKING_STATUS_", bookingId, this.f12342b.f12359b);
                }
            }
        }, new Function2(this) { // from class: b4g.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f12345b;

            {
                this.f12345b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                switch (i21) {
                    case 0:
                        n request = (n) obj2;
                        BookingPreview preview = (BookingPreview) obj3;
                        Intrinsics.checkNotNullParameter(request, "request");
                        Intrinsics.checkNotNullParameter(preview, "preview");
                        ne0.j jVar = this.f12345b.f12359b;
                        String strC = q.c(request);
                        zhm.f0 notifications = zhm.f0.f322471a;
                        String bookingToken = preview.f93443a;
                        BookingPreviewPayment payment = preview.f93444b;
                        OfferDetails offerDetails = preview.f93445c;
                        TravelFlightsLegalAcceptance legalAcceptance = preview.d;
                        List carrierCodes = preview.f;
                        Intrinsics.checkNotNullParameter(bookingToken, "bookingToken");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        Intrinsics.checkNotNullParameter(offerDetails, "offerDetails");
                        Intrinsics.checkNotNullParameter(legalAcceptance, "legalAcceptance");
                        Intrinsics.checkNotNullParameter(notifications, "notifications");
                        Intrinsics.checkNotNullParameter(carrierCodes, "carrierCodes");
                        jVar.f(strC, new BookingPreview(bookingToken, payment, offerDetails, legalAcceptance, notifications, carrierCodes));
                        break;
                    case 1:
                        m request2 = (m) obj2;
                        BookingConfirmation confirmation = (BookingConfirmation) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
                        this.f12345b.f12359b.f(q.b(request2), confirmation);
                        break;
                    default:
                        String bookingId = (String) obj2;
                        BookingStatus status = (BookingStatus) obj3;
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f12345b.f12359b.f("FLIGHTS_BOOKING_STATUS_" + bookingId, status);
                        break;
                }
                return Unit.f186387a;
            }
        }, new akl.o(i2, 9, continuation), new a19.e(i3, 11, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(b4g.q r6, b4g.m r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof b4g.p
            if (r0 == 0) goto L13
            r0 = r8
            b4g.p r0 = (b4g.p) r0
            int r1 = r0.f12357w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12357w = r1
            goto L18
        L13:
            b4g.p r0 = new b4g.p
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12357w
            java.lang.String r3 = "<this>"
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            yhm.o.b(r8)
            goto L4f
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r8)
            com.revolut.feature.travel.flights.impl.data.network.TravelFlightsApi r6 = r6.f12358a
            com.revolut.feature.travel.flights.models.domain.booking.BookingConfirmParams r8 = r7.f12348a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
            s7g.c r2 = new s7g.c
            java.lang.String r5 = r8.f93431a
            java.lang.String r8 = r8.f93432b
            r2.<init>(r5, r8)
            java.lang.String r7 = r7.f12349b
            r0.f12357w = r4
            java.lang.Object r8 = r6.confirmBooking(r2, r7, r0)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            s7g.f r8 = (s7g.f) r8
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
            com.revolut.feature.travel.flights.models.domain.booking.BookingConfirmation r6 = new com.revolut.feature.travel.flights.models.domain.booking.BookingConfirmation
            java.lang.String r7 = r8.f260709a
            java.lang.String r8 = r8.f260710b
            r6.<init>(r7, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b4g.q.a(b4g.q, b4g.m, gim.c):java.lang.Object");
    }

    public static String b(m mVar) {
        return a0.d.s("FLIGHTS_BOOKING_CONFIRM_", mVar.f12348a.f93431a, "_", mVar.f12349b);
    }

    public static String c(n nVar) throws IOException {
        BookingPreviewParams bookingPreviewParams = nVar.f12353a;
        String str = bookingPreviewParams.f93449a;
        String str2 = nVar.f12354b;
        String strK0 = zhm.d0.k0(zhm.d0.O0(bookingPreviewParams.d), ",", null, null, 0, null, 62);
        StringBuilder sbM = v0.a.m("FLIGHTS_BOOKING_PREVIEW_", str, "_", str2, "_");
        sbM.append(strK0);
        return sbM.toString();
    }
}
