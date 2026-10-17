package b41;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c41.c f12153b;

    public e(Context context, c41.c seonSdkInstanceProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(seonSdkInstanceProvider, "seonSdkInstanceProvider");
        this.f12152a = context;
        this.f12153b = seonSdkInstanceProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof b41.d
            if (r0 == 0) goto L13
            r0 = r6
            b41.d r0 = (b41.d) r0
            int r1 = r0.f12151w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12151w = r1
            goto L18
        L13:
            b41.d r0 = new b41.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12151w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r6)
            goto L45
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            yhm.o.b(r6)
            aza.g r6 = new aza.g
            r6.<init>(r5, r4, r3)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            r0.f12151w = r3
            java.lang.Object r6 = skm.e0.J(r2, r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            u31.d r6 = (u31.d) r6
            if (r6 == 0) goto L4c
            java.lang.String r6 = r6.f276738a
            return r6
        L4c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b41.e.a(gim.c):java.lang.Object");
    }
}
