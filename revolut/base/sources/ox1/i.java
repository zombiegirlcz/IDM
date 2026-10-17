package ox1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f230536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z80.b f230537b;

    public i(ang.f userInteractor, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f230536a = userInteractor;
        this.f230537b = phoneToolsProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ox1.f
            if (r0 == 0) goto L13
            r0 = r9
            ox1.f r0 = (ox1.f) r0
            int r1 = r0.f230531x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f230531x = r1
            goto L18
        L13:
            ox1.f r0 = new ox1.f
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f230531x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.List r8 = r0.u
            java.util.List r8 = (java.util.List) r8
            yhm.o.b(r9)
            goto L44
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            yhm.o.b(r9)
            r9 = r8
            java.util.List r9 = (java.util.List) r9
            r0.u = r9
            r0.f230531x = r3
            java.io.Serializable r9 = r7.c(r0)
            if (r9 != r1) goto L44
            return r1
        L44:
            wi0.b r9 = (wi0.b) r9
            java.lang.String r9 = r9.f297794a
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L53:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Lad
            java.lang.Object r1 = r8.next()
            zm3.g r1 = (zm3.g) r1
            boolean r2 = r1 instanceof zm3.f
            if (r2 == 0) goto L8f
            zm3.f r1 = (zm3.f) r1
            java.lang.String r2 = r1.f323345a
            java.lang.String r3 = "phone"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.lang.String r4 = "countryCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r4)
            z80.b r4 = r7.f230537b
            boolean r5 = r4.k(r2, r9)
            if (r5 == 0) goto L8d
            ox1.b r5 = new ox1.b
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor$Phone r6 = new com.revolut.feature.apm.core.models.recipients.ApmDescriptor$Phone
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            yk0.b r3 = yk0.b.E164
            java.lang.String r2 = r4.a(r2, r9, r3)
            r6.<init>(r2)
            r5.<init>(r1, r6)
            goto La1
        L8d:
            r5 = 0
            goto La1
        L8f:
            boolean r2 = r1 instanceof zm3.e
            if (r2 == 0) goto La7
            ox1.a r5 = new ox1.a
            zm3.e r1 = (zm3.e) r1
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor$Email r2 = new com.revolut.feature.apm.core.models.recipients.ApmDescriptor$Email
            java.lang.String r3 = r1.f323340a
            r2.<init>(r3)
            r5.<init>(r1, r2)
        La1:
            if (r5 == 0) goto L53
            r0.add(r5)
            goto L53
        La7:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        Lad:
            ox1.e r8 = new ox1.e
            r8.<init>()
            java.util.List r8 = zhm.d0.P0(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ox1.i.a(java.util.List, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r9, nx1.e r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox1.i.b(java.util.List, nx1.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ox1.h
            if (r0 == 0) goto L13
            r0 = r5
            ox1.h r0 = (ox1.h) r0
            int r1 = r0.f230535w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f230535w = r1
            goto L18
        L13:
            ox1.h r0 = new ox1.h
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f230535w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.f230536a
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f230535w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            do3.n r5 = (do3.n) r5
            wi0.b r5 = do3.q.y(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ox1.i.c(gim.c):java.io.Serializable");
    }
}
