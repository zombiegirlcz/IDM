package lhk;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zfk.n;

/* JADX INFO: loaded from: classes11.dex */
public abstract class p {
    public static final void a(zfk.n nVar, tji.f dialogDisplayer) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        if (!Intrinsics.f(nVar, n.a.f322030a)) {
            throw new NoWhenBranchMatchedException();
        }
        dialogDisplayer.e(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(yji.n r4, zfk.n r5, kotlin.jvm.functions.Function1 r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof lhk.o
            if (r0 == 0) goto L13
            r0 = r7
            lhk.o r0 = (lhk.o) r0
            int r1 = r0.f195363x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195363x = r1
            goto L18
        L13:
            lhk.o r0 = new lhk.o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f195362w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195363x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            zfk.n r5 = r0.v
            yji.n r4 = r0.u
            yhm.o.b(r7)
            goto L5c
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            yhm.o.b(r7)
            tji.f r7 = r4.q2()
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.lang.String r2 = "dialogDisplayer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            zfk.n$a r2 = zfk.n.a.f322030a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r5, r2)
            if (r2 == 0) goto L64
            r7.c()
            r0.u = r4
            r0.v = r5
            r0.f195363x = r3
            java.lang.Object r7 = r6.invoke(r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            tji.f r4 = r4.q2()
            a(r5, r4)
            return r7
        L64:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lhk.p.b(yji.n, zfk.n, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }
}
