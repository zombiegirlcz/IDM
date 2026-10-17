package b4g;

import com.revolut.feature.travel.flights.impl.data.network.TravelFlightsApi;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsApi f12329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f12330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f12331c;
    public final x4l.c d;
    public final ConcurrentHashMap e;

    public f(TravelFlightsApi api2, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f12329a = api2;
        this.f12330b = memoryCache;
        this.f12331c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new a72.k(this, continuation, 21), new b4b.z(this, 3), new av8.n(this, 15), new avk.i(this, continuation, 21), new a0e.o(this, continuation, 19));
        this.e = new ConcurrentHashMap();
    }

    public final akg.n a(String bookingId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        return nim.a.v(this.d.b(bookingId, loadingStrategy), new b0a.j(29));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r10, l7g.c r11, gim.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof b4g.e
            if (r0 == 0) goto L13
            r0 = r12
            b4g.e r0 = (b4g.e) r0
            int r1 = r0.f12327y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12327y = r1
            goto L18
        L13:
            b4g.e r0 = new b4g.e
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f12325w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12327y
            java.lang.String r3 = "<this>"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            s7g.c0 r10 = r0.v
            yhm.o.b(r12)
            goto L7a
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            java.lang.String r10 = r0.u
            yhm.o.b(r12)
            goto L66
        L3d:
            yhm.o.b(r12)
            s7g.h r12 = new s7g.h
            java.lang.String r2 = r11.f192595a
            com.revolut.feature.travel.flights.models.domain.common.PhoneNumber r11 = r11.f192596b
            if (r11 == 0) goto L55
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r3)
            t7g.o r7 = new t7g.o
            java.lang.String r8 = r11.f93496a
            java.lang.String r11 = r11.f93497b
            r7.<init>(r8, r11)
            goto L56
        L55:
            r7 = r6
        L56:
            r12.<init>(r2, r7)
            r0.u = r10
            r0.f12327y = r5
            com.revolut.feature.travel.flights.impl.data.network.TravelFlightsApi r11 = r9.f12329a
            java.lang.Object r12 = r11.updateBookingContact(r10, r12, r0)
            if (r12 != r1) goto L66
            goto L78
        L66:
            r11 = r12
            s7g.c0 r11 = (s7g.c0) r11
            r0.u = r6
            r0.v = r11
            r0.f12327y = r4
            r12 = 0
            x4l.c r2 = r9.d
            java.lang.Object r10 = r2.d(r10, r12, r0)
            if (r10 != r1) goto L79
        L78:
            return r1
        L79:
            r10 = r11
        L7a:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r3)
            l7g.k r11 = new l7g.k
            java.lang.String r12 = r10.f260692a
            t7g.o r10 = r10.f260693b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r3)
            com.revolut.feature.travel.flights.models.domain.common.PhoneNumber r0 = new com.revolut.feature.travel.flights.models.domain.common.PhoneNumber
            java.lang.String r1 = r10.f268683a
            java.lang.String r10 = r10.f268684b
            r0.<init>(r1, r10)
            r11.<init>(r12, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b4g.f.b(java.lang.String, l7g.c, gim.c):java.lang.Object");
    }
}
