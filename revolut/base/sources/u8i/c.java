package u8i;

import kotlin.jvm.internal.Intrinsics;
import n7i.f;
import n8i.g0;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends g0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f278220l;

    public c(f excludedScheduledPaymentsAccountTypesProvider) {
        Intrinsics.checkNotNullParameter(excludedScheduledPaymentsAccountTypesProvider, "excludedScheduledPaymentsAccountTypesProvider");
        this.f278220l = excludedScheduledPaymentsAccountTypesProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // n8i.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final n8i.o c3(n8i.y r8) {
        /*
            r7 = this;
            n8i.x r8 = (n8i.x) r8
            if (r8 != 0) goto L6
            r8 = 0
            return r8
        L6:
            n8i.n r0 = new n8i.n
            com.revolut.feature_move_money.api.model.AccountWrapper r1 = r8.f213483a
            com.revolut.feature_move_money.api.model.AccountWrapper r2 = r8.f213484b
            dj0.d r8 = r8.f213485c
            long r3 = r8.f115082a
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r3 = 1
            if (r8 <= 0) goto L33
            n7i.f r8 = r7.f278220l
            r8.getClass()
            java.util.Set r8 = n7i.f.a()
            j8l.a r1 = r1.f97224a
            boolean r1 = r8.contains(r1)
            if (r1 != 0) goto L33
            j8l.a r1 = r2.f97224a
            boolean r8 = r8.contains(r1)
            if (r8 == 0) goto L31
            goto L33
        L31:
            r8 = r3
            goto L34
        L33:
            r8 = 0
        L34:
            n8i.p r1 = n8i.p.CALENDAR
            r0.<init>(r3, r8, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u8i.c.c3(n8i.y):n8i.o");
    }
}
