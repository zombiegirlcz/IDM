package b4g;

import com.revolut.feature.travel.flights.impl.data.network.TravelFlightsApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsApi f12356a;

    public o0(TravelFlightsApi api2) {
        Intrinsics.checkNotNullParameter(api2, "api");
        this.f12356a = api2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof b4g.n0
            if (r0 == 0) goto L13
            r0 = r8
            b4g.n0 r0 = (b4g.n0) r0
            int r1 = r0.f12355w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12355w = r1
            goto L18
        L13:
            b4g.n0 r0 = new b4g.n0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12355w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L5a
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            b8g.f r8 = new b8g.f
            b8g.c r2 = b8g.c.OTHER
            java.lang.String r4 = z3g.a.f319261a
            java.lang.String r4 = "bookingId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r4)
            java.lang.String r4 = "manage"
            java.lang.String r4 = z3g.a.a(r7, r4)
            java.lang.String r5 = "revolut://app/"
            java.lang.String r4 = j6.a.q(r5, r4)
            r8.<init>(r2, r7, r4)
            r0.f12355w = r3
            com.revolut.feature.travel.flights.impl.data.network.TravelFlightsApi r7 = r6.f12356a
            java.lang.Object r8 = r7.getChatRedirectUrl(r8, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            b8g.i r8 = (b8g.i) r8
            java.lang.String r7 = r8.f13265a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b4g.o0.a(java.lang.String, gim.c):java.lang.Object");
    }
}
