package t9b;

import kl.c0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f268973a;

    public e(c0 countryProfilesManagementRepository) {
        Intrinsics.checkNotNullParameter(countryProfilesManagementRepository, "countryProfilesManagementRepository");
        this.f268973a = countryProfilesManagementRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof t9b.d
            if (r0 == 0) goto L13
            r0 = r7
            t9b.d r0 = (t9b.d) r0
            int r1 = r0.f268972w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f268972w = r1
            goto L18
        L13:
            t9b.d r0 = new t9b.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f268972w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L48
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            r0.f268972w = r3
            l9b.a r7 = new l9b.a
            r2 = 0
            kl.c0 r3 = r5.f268973a
            r4 = 0
            r7.<init>(r6, r3, r4, r2)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r6, r7, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r6 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t9b.e.a(java.lang.String, gim.c):java.lang.Object");
    }
}
