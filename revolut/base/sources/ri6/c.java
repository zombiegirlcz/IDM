package ri6;

import g48.r0;
import kotlin.jvm.internal.Intrinsics;
import oe6.m;
import wsg.n;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f254559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f254560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f254561c;

    public c(m openBankingInteractor, n walletInteractor, r0 jointAccountsInteractor) {
        Intrinsics.checkNotNullParameter(openBankingInteractor, "openBankingInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        this.f254559a = openBankingInteractor;
        this.f254560b = walletInteractor;
        this.f254561c = jointAccountsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(io3.d r10, x61.i r11) {
        /*
            com.revolut.domain.models.openbanking.OpenBankingFundsConfirmation$Scheme r0 = r11.f303026a
            java.lang.String r11 = r11.f303027b
            int[] r1 = ri6.b.f254558a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L90
            r3 = 2
            if (r0 != r3) goto L8a
            java.util.List r10 = r10.f163157s
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r0 = r10 instanceof java.util.Collection
            if (r0 == 0) goto L26
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L26
            goto Lc1
        L26:
            java.util.Iterator r10 = r10.iterator()
        L2a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lc1
            java.lang.Object r0 = r10.next()
            io3.e r0 = (io3.e) r0
            java.util.LinkedHashMap r3 = r0.f163162c
            java.lang.String r4 = "SORT_CODE"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = ""
            if (r3 == 0) goto L66
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = r3.length()
            r7 = r1
        L4e:
            if (r7 >= r6) goto L60
            char r8 = r3.charAt(r7)
            boolean r9 = java.lang.Character.isDigit(r8)
            if (r9 == 0) goto L5d
            r5.append(r8)
        L5d:
            int r7 = r7 + 1
            goto L4e
        L60:
            java.lang.String r3 = r5.toString()
            if (r3 != 0) goto L6c
        L66:
            kotlin.jvm.internal.t0 r3 = kotlin.jvm.internal.t0.f186434a
            m70.a.c(r3)
            r3 = r4
        L6c:
            java.util.LinkedHashMap r0 = r0.f163162c
            java.lang.String r5 = "ACCOUNT_NUMBER"
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L7e
            kotlin.jvm.internal.t0 r0 = kotlin.jvm.internal.t0.f186434a
            m70.a.c(r0)
            goto L7f
        L7e:
            r4 = r0
        L7f:
            java.lang.String r0 = r3.concat(r4)
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r11)
            if (r0 == 0) goto L2a
            goto Lc0
        L8a:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L90:
            java.util.List r10 = r10.f163157s
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r0 = r10 instanceof java.util.Collection
            if (r0 == 0) goto La2
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La2
            goto Lc1
        La2:
            java.util.Iterator r10 = r10.iterator()
        La6:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lc1
            java.lang.Object r0 = r10.next()
            io3.e r0 = (io3.e) r0
            java.util.LinkedHashMap r0 = r0.f163162c
            java.lang.String r3 = "IBAN"
            java.lang.Object r0 = r0.get(r3)
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r11)
            if (r0 == 0) goto La6
        Lc0:
            return r2
        Lc1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ri6.c.a(io3.d, x61.i):boolean");
    }
}
