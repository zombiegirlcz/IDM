package c41;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r10.t;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f20973a;

    public c(t seonSdkLoader) {
        Intrinsics.checkNotNullParameter(seonSdkLoader, "seonSdkLoader");
        this.f20973a = seonSdkLoader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof c41.b
            if (r0 == 0) goto L13
            r0 = r8
            c41.b r0 = (c41.b) r0
            int r1 = r0.f20972w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20972w = r1
            goto L18
        L13:
            c41.b r0 = new c41.b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f20972w
            r10.t r3 = r7.f20973a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            yhm.o.b(r8)
            goto L56
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            yhm.o.b(r8)
            goto L45
        L39:
            yhm.o.b(r8)
            r0.f20972w = r5
            java.lang.Object r8 = r3.i(r0)
            if (r8 != r1) goto L45
            goto L55
        L45:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L5d
            r0.f20972w = r4
            java.lang.Object r8 = r3.h(r0)
            if (r8 != r1) goto L56
        L55:
            return r1
        L56:
            xg0.u r8 = (xg0.u) r8
            boolean r8 = r8 instanceof xg0.q
            if (r8 != 0) goto L5d
            return r6
        L5d:
            java.lang.String r8 = "com.revolut.feature.seon_sdk.SeonSdkImpl"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Exception -> L73
            java.lang.reflect.Constructor r8 = r8.getDeclaredConstructor(r6)     // Catch: java.lang.Exception -> L73
            java.lang.Object r8 = r8.newInstance(r6)     // Catch: java.lang.Exception -> L73
            java.lang.String r0 = "null cannot be cast to non-null type com.revolut.feature_seon_sdk_api.SeonSdk"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)     // Catch: java.lang.Exception -> L73
            cei.c r8 = (cei.c) r8     // Catch: java.lang.Exception -> L73
            return r8
        L73:
            r8 = move-exception
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            java.lang.String r2 = "Failed to instantiate SEON SDK"
            java.lang.String r3 = "SeonSdkInstanceProvider"
            rd0.d.a(r1, r3, r2, r8, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c41.c.a(gim.c):java.lang.Object");
    }
}
