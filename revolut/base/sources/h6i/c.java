package h6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0i.f f149653a;

    public c(x0i.f exchangeCurrenciesInteractor) {
        Intrinsics.checkNotNullParameter(exchangeCurrenciesInteractor, "exchangeCurrenciesInteractor");
        this.f149653a = exchangeCurrenciesInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(xi0.b r5, wd6.c r6, java.util.Set r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof h6i.b
            if (r0 == 0) goto L13
            r0 = r8
            h6i.b r0 = (h6i.b) r0
            int r1 = r0.f149649w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149649w = r1
            goto L18
        L13:
            h6i.b r0 = new h6i.b
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149649w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r8)
            x0i.f r8 = r4.f149653a
            ufm.i r5 = r8.b(r5, r6, r7)
            r0.f149649w = r3
            java.lang.Object r8 = nim.a.b(r5, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h6i.c.a(xi0.b, wd6.c, java.util.Set, gim.c):java.lang.Object");
    }
}
