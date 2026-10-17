package fkl;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(gu2.e r4, gim.c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof fkl.a
            if (r0 == 0) goto L13
            r0 = r5
            fkl.a r0 = (fkl.a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            fkl.a r0 = new fkl.a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L42
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L42
            r0.v = r3     // Catch: java.lang.Throwable -> L42
            java.lang.Object r5 = r4.R(r0)     // Catch: java.lang.Throwable -> L42
            if (r5 != r1) goto L3d
            return r1
        L3d:
            iu2.b r5 = (iu2.b) r5     // Catch: java.lang.Throwable -> L42
            yhm.m$a r4 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L42
            goto L49
        L42:
            r4 = move-exception
            yhm.m$a r5 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r4)
        L49:
            boolean r4 = r5 instanceof yhm.n
            r0 = 0
            if (r4 == 0) goto Laa
            java.lang.Throwable r4 = yhm.m.a(r5)
            boolean r1 = r4 instanceof com.revolut.feature.captcha.api.models.CaptchaError
            if (r1 == 0) goto L59
            com.revolut.feature.captcha.api.models.CaptchaError r4 = (com.revolut.feature.captcha.api.models.CaptchaError) r4
            goto L5a
        L59:
            r4 = r0
        L5a:
            boolean r1 = r4 instanceof com.revolut.feature.captcha.api.models.CaptchaError.ChallengeClosed
            if (r1 != 0) goto La9
            boolean r1 = r4 instanceof com.revolut.feature.captcha.api.models.CaptchaError.Resolution
            if (r1 == 0) goto L8d
            r5 = r4
            com.revolut.feature.captcha.api.models.CaptchaError$Resolution r5 = (com.revolut.feature.captcha.api.models.CaptchaError.Resolution) r5
            java.lang.String r5 = r5.getMessage()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            byte[] r5 = r5.getBytes(r1)
            java.lang.String r1 = "getBytes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            r1 = 11
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r1)
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            java.lang.String r3 = "Revolut SSO"
            rd0.d.a(r2, r3, r0, r4, r1)
            kotlin.jvm.internal.Intrinsics.h(r5)
            goto Lbb
        L8d:
            boolean r0 = r4 instanceof com.revolut.feature.captcha.api.models.CaptchaError.Timeout
            if (r0 != 0) goto La8
            if (r4 != 0) goto La2
            java.lang.Throwable r4 = yhm.m.a(r5)
            if (r4 != 0) goto La1
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Required value was null."
            r4.<init>(r5)
            throw r4
        La1:
            throw r4
        La2:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        La8:
            throw r4
        La9:
            throw r4
        Laa:
            yhm.o.b(r5)
            iu2.b r5 = (iu2.b) r5
            java.lang.String r4 = r5.f168458a
            boolean r5 = kotlin.text.d0.W(r4)
            if (r5 != 0) goto Lb8
            r0 = r4
        Lb8:
            if (r0 == 0) goto Lbc
            r5 = r0
        Lbb:
            return r5
        Lbc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Captcha is not available"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fkl.c.a(gu2.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(gu2.e r8, kotlin.jvm.functions.Function2 r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof fkl.b
            if (r0 == 0) goto L13
            r0 = r10
            fkl.b r0 = (fkl.b) r0
            int r1 = r0.f135858y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135858y = r1
            goto L18
        L13:
            fkl.b r0 = new fkl.b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f135857x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f135858y
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r10)
            return r10
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.jvm.functions.Function2 r8 = r0.f135856w
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            yhm.o.b(r10)
            goto L8d
        L3e:
            gim.i r8 = r0.v
            r9 = r8
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            gu2.e r8 = r0.u
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L49
            goto L60
        L49:
            r10 = move-exception
            goto L66
        L4b:
            yhm.o.b(r10)
            yhm.m$a r10 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L49
            r0.u = r8     // Catch: java.lang.Throwable -> L49
            r10 = r9
            gim.i r10 = (gim.i) r10     // Catch: java.lang.Throwable -> L49
            r0.v = r10     // Catch: java.lang.Throwable -> L49
            r0.f135858y = r5     // Catch: java.lang.Throwable -> L49
            java.lang.Object r10 = r9.invoke(r6, r0)     // Catch: java.lang.Throwable -> L49
            if (r10 != r1) goto L60
            goto L9b
        L60:
            yhm.m$a r2 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L49
        L62:
            r7 = r9
            r9 = r8
            r8 = r7
            goto L6d
        L66:
            yhm.m$a r2 = yhm.m.INSTANCE
            yhm.n r10 = yhm.o.a(r10)
            goto L62
        L6d:
            boolean r2 = r10 instanceof yhm.n
            if (r2 == 0) goto La6
            java.lang.Throwable r10 = yhm.m.a(r10)
            if (r10 == 0) goto L9e
            boolean r2 = r10 instanceof com.revolut.sso.impl.domain.models.SsoServerError.CaptchaRequired
            if (r2 == 0) goto L9d
            r0.u = r6
            r0.v = r6
            r10 = r8
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r0.f135856w = r10
            r0.f135858y = r4
            java.lang.Object r10 = a(r9, r0)
            if (r10 != r1) goto L8d
            goto L9b
        L8d:
            r0.u = r6
            r0.v = r6
            r0.f135856w = r6
            r0.f135858y = r3
            java.lang.Object r8 = r8.invoke(r10, r0)
            if (r8 != r1) goto L9c
        L9b:
            return r1
        L9c:
            return r8
        L9d:
            throw r10
        L9e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Captcha handling failed: handled block failed with exception being null"
            r8.<init>(r9)
            throw r8
        La6:
            yhm.o.b(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fkl.c.b(gu2.e, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
