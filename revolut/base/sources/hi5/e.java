package hi5;

import ji5.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends th5.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f152497l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xh5.a f152498m;

    public e(i cryptoOnboardingInteractor, xh5.a cryptoFeatureEnabledInteractor) {
        Intrinsics.checkNotNullParameter(cryptoOnboardingInteractor, "cryptoOnboardingInteractor");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        this.f152497l = cryptoOnboardingInteractor;
        this.f152498m = cryptoFeatureEnabledInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
    
        if (r4.invoke(r2) == r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b0, code lost:
    
        if (b3(r0, r2) == r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        if (r4.invoke(r2) == r3) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r25v0, types: [hi5.e, yji.n] */
    /* JADX WARN: Type inference failed for: r26v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9, types: [kotlin.jvm.functions.Function1] */
    @Override // th5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(kotlin.jvm.functions.Function1 r26, gim.c r27) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hi5.e.Z2(kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(ec5.c r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof hi5.d
            if (r0 == 0) goto L13
            r0 = r7
            hi5.d r0 = (hi5.d) r0
            int r1 = r0.f152496x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f152496x = r1
            goto L18
        L13:
            hi5.d r0 = new hi5.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f152496x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            hi5.e r6 = r0.u
            yhm.o.b(r7)
            goto L60
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            xh5.a r7 = r5.f152498m
            ji5.e r7 = (ji5.e) r7
            efm.d0 r6 = r7.d(r6)
            hhd.n r7 = new hhd.n
            r2 = 4
            r7.<init>(r2)
            hae.k r2 = new hae.k
            r4 = 25
            r2.<init>(r7, r4)
            ufm.i r7 = new ufm.i
            r4 = 1
            r7.<init>(r6, r2, r4)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            r0.u = r5
            r0.f152496x = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r6 = r5
        L60:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            aii.u r7 = (aii.u) r7
            r6.A2(r7)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hi5.e.b3(ec5.c, gim.c):java.lang.Object");
    }
}
