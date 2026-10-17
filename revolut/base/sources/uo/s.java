package uo;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i90.b f281506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f281507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.n f281508c;

    public s(i90.b uuidUtils, i0 persistentSessionStorage) {
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(persistentSessionStorage, "persistentSessionStorage");
        this.f281506a = uuidUtils;
        this.f281507b = persistentSessionStorage;
        ne0.n.Companion.getClass();
        this.f281508c = ne0.l.a(1, 15L);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String a() {
        /*
            r6 = this;
            monitor-enter(r6)
            ne0.n r0 = r6.f281508c     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "SESSION_KEY"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L36
            uo.i0 r0 = r6.f281507b     // Catch: java.lang.Throwable -> L34
            uo.l0 r0 = (uo.l0) r0     // Catch: java.lang.Throwable -> L34
            ue0.c r1 = r0.f281490a     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = "SESSION_STORAGE_KEY"
            java.lang.Class<uo.k0> r3 = uo.k0.class
            java.lang.Object r1 = r1.T2(r2, r3)     // Catch: java.lang.Throwable -> L34
            uo.k0 r1 = (uo.k0) r1     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L32
            long r2 = r1.getExpirationTimeMillis()     // Catch: java.lang.Throwable -> L34
            ef0.b r0 = r0.f281491b     // Catch: java.lang.Throwable -> L34
            long r4 = r0.a()     // Catch: java.lang.Throwable -> L34
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L32
            java.lang.String r0 = r1.getSessionId()     // Catch: java.lang.Throwable -> L34
            goto L36
        L32:
            r0 = 0
            goto L36
        L34:
            r0 = move-exception
            goto L67
        L36:
            if (r0 != 0) goto L57
            i90.b r0 = r6.f281506a     // Catch: java.lang.Throwable -> L34
            java.util.UUID r0 = r0.a()     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Throwable -> L34
            ne0.n r1 = r6.f281508c     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = "SESSION_KEY"
            r1.f(r2, r0)     // Catch: java.lang.Throwable -> L34
            uo.i0 r1 = r6.f281507b     // Catch: java.lang.Throwable -> L34
            uo.l0 r1 = (uo.l0) r1     // Catch: java.lang.Throwable -> L34
            r1.a(r0)     // Catch: java.lang.Throwable -> L34
            goto L65
        L57:
            ne0.n r1 = r6.f281508c     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = "SESSION_KEY"
            r1.f(r2, r0)     // Catch: java.lang.Throwable -> L34
            uo.i0 r1 = r6.f281507b     // Catch: java.lang.Throwable -> L34
            uo.l0 r1 = (uo.l0) r1     // Catch: java.lang.Throwable -> L34
            r1.a(r0)     // Catch: java.lang.Throwable -> L34
        L65:
            monitor-exit(r6)
            return r0
        L67:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L34
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uo.s.a():java.lang.String");
    }
}
