package l72;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja3.f f192504a;

    public b(ja3.f cardBitmapDisplayer) {
        Intrinsics.checkNotNullParameter(cardBitmapDisplayer, "cardBitmapDisplayer");
        this.f192504a = cardBitmapDisplayer;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof l72.a
            if (r0 == 0) goto L13
            r0 = r12
            l72.a r0 = (l72.a) r0
            int r1 = r0.f192503w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f192503w = r1
            goto L18
        L13:
            l72.a r0 = new l72.a
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f192503w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L69
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            ja3.f r12 = r10.f192504a
            efm.r r11 = r12.c(r11)
            l5a.u r12 = new l5a.u
            r2 = 3
            r12.<init>(r2)
            l5i.b r4 = new l5i.b
            r4.<init>(r2, r12)
            efm.r r11 = r11.filter(r4)
            com.revolut.data.model.Data r4 = new com.revolut.data.model.Data
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r12 = "No card bitmap was returned"
            r6.<init>(r12)
            r8 = 5
            r9 = 0
            r5 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            efm.d0 r11 = r11.first(r4)
            java.lang.String r12 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)
            r0.f192503w = r3
            java.lang.Object r12 = nim.a.b(r11, r0)
            if (r12 != r1) goto L69
            return r1
        L69:
            com.revolut.data.model.Data r12 = (com.revolut.data.model.Data) r12
            java.lang.Throwable r11 = r12.getError()
            if (r11 == 0) goto L7c
            zhm.h0 r12 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r11, r12)
            return r1
        L7c:
            java.lang.Object r11 = r12.getContent()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l72.b.a(java.lang.String, gim.c):java.lang.Object");
    }
}
