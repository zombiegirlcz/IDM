package zjb;

import java.util.Set;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements xii.b {

    @NotNull
    public static final C1790a Companion = new C1790a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f322775a = y0.b("savings/challenge/celebration");

    /* JADX INFO: renamed from: zjb.a$a, reason: collision with other inner class name */
    public static final class C1790a {
        private C1790a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f322775a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    @Override // xii.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.kompot.common.ParcelableDestination e(lg0.e r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r0 = "deeplink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.util.LinkedHashMap r11 = r11.f195041c
            java.lang.String r0 = "amount"
            java.lang.String r0 = lg0.g.a(r0, r11)
            r1 = 0
            if (r0 == 0) goto L15
            java.lang.Long r0 = kotlin.text.z.n(r0)
            goto L16
        L15:
            r0 = r1
        L16:
            java.lang.String r2 = "currency"
            java.lang.String r2 = lg0.g.a(r2, r11)
            if (r2 == 0) goto L46
            yhm.m$a r3 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            xi0.a r3 = xi0.b.Companion     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r3.getClass()     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            xi0.b r2 = xi0.a.a(r2)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            goto L34
        L2a:
            r2 = move-exception
            goto L2e
        L2c:
            r11 = move-exception
            goto L45
        L2e:
            yhm.m$a r3 = yhm.m.INSTANCE
            yhm.n r2 = yhm.o.a(r2)
        L34:
            java.lang.Throwable r3 = yhm.m.a(r2)
            if (r3 == 0) goto L3d
            hx7.e.n(r3)
        L3d:
            boolean r3 = r2 instanceof yhm.n
            if (r3 == 0) goto L42
            r2 = r1
        L42:
            xi0.b r2 = (xi0.b) r2
            goto L47
        L45:
            throw r11
        L46:
            r2 = r1
        L47:
            java.lang.String r3 = "transactionId"
            java.lang.String r3 = lg0.g.a(r3, r11)
            java.lang.String r4 = "type"
            java.lang.String r11 = lg0.g.a(r4, r11)
            if (r11 == 0) goto L71
            qib.j[] r4 = qib.j.values()
            int r5 = r4.length
            r6 = 0
        L5b:
            if (r6 >= r5) goto L6e
            r7 = r4[r6]
            java.lang.String r8 = r7.name()
            r9 = 1
            boolean r8 = kotlin.text.a0.z(r8, r11, r9)
            if (r8 == 0) goto L6b
            goto L6f
        L6b:
            int r6 = r6 + 1
            goto L5b
        L6e:
            r7 = r1
        L6f:
            if (r7 != 0) goto L73
        L71:
            qib.j r7 = qib.j.UNKNOWN
        L73:
            if (r0 == 0) goto L88
            if (r2 == 0) goto L88
            if (r3 == 0) goto L88
            long r0 = r0.longValue()
            com.revolut.feature.retail.savings.api.challenge.navigation.SavingsChallengePrizeCelebrationDestination r11 = new com.revolut.feature.retail.savings.api.challenge.navigation.SavingsChallengePrizeCelebrationDestination
            dj0.d r4 = new dj0.d
            r4.<init>(r0, r2)
            r11.<init>(r7, r4, r3)
            r1 = r11
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zjb.a.e(lg0.e):com.revolut.kompot.common.ParcelableDestination");
    }
}
