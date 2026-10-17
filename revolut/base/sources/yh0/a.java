package yh0;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ih0.b f313682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f313683b;

    public a(jzl.a base64Util, ih0.b remoteConfig, c tokenProvider) {
        Intrinsics.checkNotNullParameter(base64Util, "base64Util");
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        this.f313682a = remoteConfig;
        this.f313683b = tokenProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response intercept(ulm.y0 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "PLAY_INTEGRITY_ENDPOINTS_LIST_STRICT"
            ih0.b r1 = r7.f313682a
            ii0.b r1 = (ii0.b) r1
            java.lang.String r0 = r1.e(r0)
            zlm.h r8 = (zlm.h) r8
            ulm.j1 r1 = r8.e
            ulm.i1 r2 = r1.b()
            boolean r3 = kotlin.text.d0.W(r0)
            r4 = 0
            java.lang.String r5 = "X-Integrity-Check"
            if (r3 == 0) goto L26
            java.lang.String r3 = r1.a(r5)
            if (r3 != 0) goto L6c
        L26:
            boolean r3 = kotlin.text.d0.W(r0)
            if (r3 != 0) goto Lb3
            r3 = 1
            char[] r3 = new char[r3]
            r6 = 44
            r3[r4] = r6
            r6 = 6
            java.util.List r0 = kotlin.text.d0.m0(r0, r3, r6)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L48
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L48
            goto Lb3
        L48:
            java.util.Iterator r0 = r0.iterator()
        L4c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lb3
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            ulm.x0 r6 = r1.f281095a
            java.lang.String r6 = r6.b()
            java.lang.CharSequence r3 = kotlin.text.d0.F0(r3)
            java.lang.String r3 = r3.toString()
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r6, r3)
            if (r3 == 0) goto L4c
        L6c:
            r2.d(r5)
            od0.a r0 = od0.a.f224253a
            boolean r0 = od0.a.e()
            if (r0 != 0) goto Lb6
            yh0.c r0 = r7.f313683b     // Catch: java.lang.Exception -> L8a
            java.lang.String r1 = ""
            efm.d0 r0 = r0.a(r1)     // Catch: java.lang.Exception -> L8a
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Exception -> L8a
            yg0.e r0 = (yg0.e) r0     // Catch: java.lang.Exception -> L8a
            java.lang.String r0 = r0.a()     // Catch: java.lang.Exception -> L8a
            goto Laf
        L8a:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L9e
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            byte[] r0 = r0.getBytes(r1)
            java.lang.String r1 = "getBytes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            if (r0 != 0) goto La0
        L9e:
            byte[] r0 = new byte[r4]
        La0:
            java.lang.String r1 = "byteArray"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            java.lang.String r1 = "encodeToString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        Laf:
            r2.a(r5, r0)
            goto Lb6
        Lb3:
            r2.d(r5)
        Lb6:
            ulm.j1 r0 = new ulm.j1
            r0.<init>(r2)
            okhttp3.Response r8 = r8.b(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yh0.a.intercept(ulm.y0):okhttp3.Response");
    }
}
