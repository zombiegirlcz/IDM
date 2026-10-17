package dwi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hwi.n f120454a;

    public r(hwi.n repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f120454a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(dwi.r r12, kotlinx.coroutines.flow.FlowCollector r13, java.lang.String r14, long r15, long r17, gim.c r19) {
        /*
            r0 = r19
            r12.getClass()
            boolean r1 = r0 instanceof dwi.o
            if (r1 == 0) goto L18
            r1 = r0
            dwi.o r1 = (dwi.o) r1
            int r2 = r1.f120444w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f120444w = r2
            goto L1d
        L18:
            dwi.o r1 = new dwi.o
            r1.<init>(r12, r0)
        L1d:
            java.lang.Object r0 = r1.u
            fim.a r10 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f120444w
            r11 = 1
            if (r2 == 0) goto L34
            if (r2 != r11) goto L2c
            yhm.o.b(r0)
            goto L51
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            yhm.o.b(r0)
            kotlin.jvm.internal.Ref$BooleanRef r3 = new kotlin.jvm.internal.Ref$BooleanRef
            r3.<init>()
            dwi.p r2 = new dwi.p
            r9 = 0
            r4 = r12
            r6 = r13
            r5 = r14
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7, r9)
            r1.f120444w = r11
            r3 = r17
            java.lang.Object r0 = skm.h2.e(r3, r2, r1)
            if (r0 != r10) goto L51
            return r10
        L51:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L5a
            boolean r0 = r0.booleanValue()
            goto L5b
        L5a:
            r0 = 0
        L5b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dwi.r.a(dwi.r, kotlinx.coroutines.flow.FlowCollector, java.lang.String, long, long, gim.c):java.lang.Object");
    }
}
