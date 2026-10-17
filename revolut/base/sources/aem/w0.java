package aem;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class w0 implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vdm.b f3787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wdm.f f3789c;

    public w0(vdm.b client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f3787a = client;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // aem.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(fem.d r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof aem.v0
            if (r0 == 0) goto L13
            r0 = r7
            aem.v0 r0 = (aem.v0) r0
            int r1 = r0.f3786w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3786w = r1
            goto L18
        L13:
            aem.v0 r0 = new aem.v0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f3786w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r7)
            goto L52
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            wdm.f r7 = r5.f3789c
            if (r7 == 0) goto L3a
            skm.e0.k(r7, r3)
        L3a:
            int r7 = r5.f3788b
            r2 = 20
            if (r7 >= r2) goto L76
            int r7 = r7 + r4
            r5.f3788b = r7
            vdm.b r7 = r5.f3787a
            fem.i r7 = r7.f
            java.lang.Object r2 = r6.d
            r0.f3786w = r4
            java.lang.Object r7 = r7.a(r6, r2, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            boolean r6 = r7 instanceof wdm.f
            if (r6 == 0) goto L59
            r3 = r7
            wdm.f r3 = (wdm.f) r3
        L59:
            if (r3 == 0) goto L5e
            r5.f3789c = r3
            return r3
        L5e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to execute send pipeline. Expected [HttpClientCall], but received "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L76:
            io.ktor.client.plugins.SendCountExceedException r6 = new io.ktor.client.plugins.SendCountExceedException
            java.lang.String r7 = "message"
            java.lang.String r0 = "Max send count 20 exceeded. Consider increasing the property maxSendCount if more is required."
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r7)
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: aem.w0.a(fem.d, gim.c):java.lang.Object");
    }
}
