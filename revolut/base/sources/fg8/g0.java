package fg8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vc8.a f134930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sri.m f134931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q78.e f134932c;

    public g0(vc8.a promptProvider, sri.m navigator, q78.e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(promptProvider, "promptProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.f134930a = promptProvider;
        this.f134931b = navigator;
        this.f134932c = juniorAccountDestinationResolver;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r5 == r8) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r5 == r8) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(fg8.g0 r5, jf0.c r6, java.lang.String r7, gim.c r8) {
        /*
            vc8.a r0 = r5.f134930a
            boolean r1 = r8 instanceof fg8.f0
            if (r1 == 0) goto L15
            r1 = r8
            fg8.f0 r1 = (fg8.f0) r1
            int r2 = r1.f134928w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f134928w = r2
            goto L1a
        L15:
            fg8.f0 r1 = new fg8.f0
            r1.<init>(r5, r8)
        L1a:
            java.lang.Object r5 = r1.u
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f134928w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r5)
            goto L6a
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r5)
            goto L54
        L38:
            yhm.o.b(r5)
            r5 = 5
            java.lang.String r5 = r6.e(r5)
            java.lang.String r2 = "first-party-consent"
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r5, r2)
            if (r2 == 0) goto L57
            r1.f134928w = r4
            kd8.v r0 = (kd8.v) r0
            r5 = 0
            java.lang.Object r5 = r0.c(r7, r5, r5, r1)
            if (r5 != r8) goto L54
            goto L69
        L54:
            com.revolut.retail.core.navigation.NaviCommand r5 = (com.revolut.retail.core.navigation.NaviCommand) r5
            goto L6c
        L57:
            java.lang.String r2 = "third-party-consent"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r2)
            if (r5 == 0) goto L77
            r1.f134928w = r3
            kd8.v r0 = (kd8.v) r0
            java.lang.Object r5 = r0.e(r7, r1)
            if (r5 != r8) goto L6a
        L69:
            return r8
        L6a:
            com.revolut.retail.core.navigation.NaviCommand r5 = (com.revolut.retail.core.navigation.NaviCommand) r5
        L6c:
            if (r5 == 0) goto L6f
            return r5
        L6f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Cannot show consent prompt for the juniorId."
            r5.<init>(r6)
            throw r5
        L77:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r6.f173629c
            java.lang.String r6 = r6.f173627a
            java.lang.String r8 = "uri="
            java.lang.String r0 = ", originalUri="
            java.lang.String r6 = a0.d.s(r8, r7, r0, r6)
            java.lang.String r7 = "Cannot parse consent type from the deeplink "
            java.lang.String r6 = j6.a.q(r7, r6)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fg8.g0.a(fg8.g0, jf0.c, java.lang.String, gim.c):java.lang.Object");
    }
}
