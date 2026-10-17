package eg;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        if (r10 == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r9v0, types: [df.e] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(df.e r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof eg.b0
            if (r0 == 0) goto L13
            r0 = r10
            eg.b0 r0 = (eg.b0) r0
            int r1 = r0.f125405x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125405x = r1
            goto L18
        L13:
            eg.b0 r0 = new eg.b0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125405x
            java.lang.String r3 = ""
            java.lang.String r4 = "InstallationId"
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L48
            if (r2 == r6) goto L3e
            if (r2 != r5) goto L36
            java.lang.Object r9 = r0.u
            java.lang.String r9 = (java.lang.String) r9
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L33
            goto L92
        L33:
            r10 = move-exception
            goto L9c
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            java.lang.Object r9 = r0.u
            df.e r9 = (df.e) r9
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L46
            goto L65
        L46:
            r10 = move-exception
            goto L77
        L48:
            yhm.o.b(r10)
            r10 = r9
            df.d r10 = (df.d) r10     // Catch: java.lang.Exception -> L46
            com.google.android.gms.tasks.Task r9 = r10.d()     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = "firebaseInstallations.getToken(false)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)     // Catch: java.lang.Exception -> L73
            r0.u = r10     // Catch: java.lang.Exception -> L73
            r0.f125405x = r6     // Catch: java.lang.Exception -> L73
            java.lang.Object r9 = jh.d.b(r9, r0)     // Catch: java.lang.Exception -> L73
            if (r9 != r1) goto L62
            goto L91
        L62:
            r7 = r10
            r10 = r9
            r9 = r7
        L65:
            df.a r10 = (df.a) r10     // Catch: java.lang.Exception -> L46
            java.lang.String r10 = r10.f113718a     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)     // Catch: java.lang.Exception -> L46
            r7 = r10
            r10 = r9
            r9 = r7
            goto L7c
        L73:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L77:
            java.lang.String r2 = "Error getting authentication token."
            r10 = r9
            r9 = r3
        L7c:
            df.d r10 = (df.d) r10     // Catch: java.lang.Exception -> L33
            com.google.android.gms.tasks.Task r10 = r10.c()     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "firebaseInstallations.id"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)     // Catch: java.lang.Exception -> L33
            r0.u = r9     // Catch: java.lang.Exception -> L33
            r0.f125405x = r5     // Catch: java.lang.Exception -> L33
            java.lang.Object r10 = jh.d.b(r10, r0)     // Catch: java.lang.Exception -> L33
            if (r10 != r1) goto L92
        L91:
            return r1
        L92:
            java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)     // Catch: java.lang.Exception -> L33
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L33
            r3 = r10
            goto L9f
        L9c:
            java.lang.String r0 = "Error getting Firebase installation id ."
        L9f:
            eg.d0 r10 = new eg.d0
            r10.<init>(r3, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.c0.a(df.e, gim.c):java.lang.Object");
    }
}
