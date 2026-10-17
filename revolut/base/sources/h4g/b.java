package h4g;

import b4g.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f149353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f149354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b4g.j f149355c;

    public b(q repository, k searchSessionInteractor, b4g.j bookingsRepository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(searchSessionInteractor, "searchSessionInteractor");
        Intrinsics.checkNotNullParameter(bookingsRepository, "bookingsRepository");
        this.f149353a = repository;
        this.f149354b = searchSessionInteractor;
        this.f149355c = bookingsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.travel.flights.models.domain.booking.BookingConfirmParams r11, gim.c r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof h4g.a
            if (r0 == 0) goto L13
            r0 = r12
            h4g.a r0 = (h4g.a) r0
            int r1 = r0.f149352y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149352y = r1
            goto L18
        L13:
            h4g.a r0 = new h4g.a
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f149350w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149352y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r12)
            return r12
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            com.revolut.feature.travel.flights.models.domain.booking.BookingConfirmParams r11 = r0.v
            b4g.q r2 = r0.u
            yhm.o.b(r12)
        L39:
            r5 = r11
            r7 = r2
            goto L50
        L3c:
            yhm.o.b(r12)
            b4g.q r2 = r10.f149353a
            r0.u = r2
            r0.v = r11
            r0.f149352y = r4
            h4g.k r12 = r10.f149354b
            java.lang.Object r12 = r12.a(r0)
            if (r12 != r1) goto L39
            goto L6e
        L50:
            r6 = r12
            java.lang.String r6 = (java.lang.String) r6
            r8 = 0
            r0.u = r8
            r0.v = r8
            r0.f149352y = r3
            r7.getClass()
            a1a.c r4 = new a1a.c
            r9 = 16
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L6f
        L6e:
            return r1
        L6f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: h4g.b.a(com.revolut.feature.travel.flights.models.domain.booking.BookingConfirmParams, gim.c):java.lang.Object");
    }
}
