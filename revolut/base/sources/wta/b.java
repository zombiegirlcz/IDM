package wta;

import aua.f;
import java.time.Clock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements rta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f299848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clock f299849b;

    public b(f ratingRepository, Clock clock) {
        Intrinsics.checkNotNullParameter(ratingRepository, "ratingRepository");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f299848a = ratingRepository;
        this.f299849b = clock;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // rta.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof wta.a
            if (r0 == 0) goto L13
            r0 = r7
            wta.a r0 = (wta.a) r0
            int r1 = r0.f299847w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f299847w = r1
            goto L18
        L13:
            wta.a r0 = new wta.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f299847w
            aua.f r3 = r6.f299848a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r7)
            goto L61
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            goto L48
        L38:
            yhm.o.b(r7)
            ufm.f r7 = r3.b()
            r0.f299847w = r5
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L48
            goto L60
        L48:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r2 = 3
            if (r7 >= r2) goto L54
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L54:
            ufm.f r7 = r3.a()
            r0.f299847w = r4
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L61
        L60:
            return r1
        L61:
            java.lang.Long r7 = (java.lang.Long) r7
            kotlin.jvm.internal.Intrinsics.h(r7)
            long r0 = r7.longValue()
            java.time.Instant r7 = java.time.Instant.ofEpochMilli(r0)
            java.time.ZoneId r0 = java.time.ZoneId.systemDefault()
            java.time.ZonedDateTime r7 = r7.atZone(r0)
            java.time.LocalDate r7 = r7.toLocalDate()
            java.time.Clock r0 = r6.f299849b
            java.time.LocalDate r0 = java.time.LocalDate.now(r0)
            boolean r7 = r7.isBefore(r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wta.b.a(gim.c):java.lang.Object");
    }
}
