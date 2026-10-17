package hw3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f156077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p24.p f156078b;

    public k(ang.f userInteractor, p24.p creditApplicationCommonRepository) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationCommonRepository, "creditApplicationCommonRepository");
        this.f156077a = userInteractor;
        this.f156078b = creditApplicationCommonRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof hw3.j
            if (r0 == 0) goto L13
            r0 = r8
            hw3.j r0 = (hw3.j) r0
            int r1 = r0.f156076x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f156076x = r1
            goto L18
        L13:
            hw3.j r0 = new hw3.j
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f156076x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L4c
        L38:
            yhm.o.b(r8)
            ang.f r8 = r5.f156077a
            pfm.a r6 = r8.n(r6)
            r0.u = r7
            r0.f156076x = r4
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L4c
            goto L65
        L4c:
            r6 = 0
            r0.u = r6
            r0.f156076x = r3
            p24.p r8 = r5.f156078b
            r8.getClass()
            p24.f r2 = new p24.f
            r2.<init>(r8, r7, r6, r4)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r6, r2, r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hw3.k.a(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
