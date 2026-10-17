package rqk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f256596a;

    public m(ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f256596a = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof rqk.l
            if (r0 == 0) goto L13
            r0 = r7
            rqk.l r0 = (rqk.l) r0
            int r1 = r0.f256595w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256595w = r1
            goto L18
        L13:
            rqk.l r0 = new rqk.l
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256595w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L59
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            ang.f r7 = r5.f256596a
            efm.d0 r6 = r7.f(r6)
            rpi.e r7 = new rpi.e
            r2 = 9
            r7.<init>(r2)
            rpi.d r2 = new rpi.d
            r4 = 4
            r2.<init>(r7, r4)
            ufm.i r7 = new ufm.i
            r4 = 1
            r7.<init>(r6, r2, r4)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            r0.f256595w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rqk.m.a(boolean, gim.c):java.lang.Object");
    }
}
