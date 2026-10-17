package fy1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements lx1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cz5.b f138849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lx1.d f138850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wl3.c f138851c;
    public final cl3.a d;
    public final ox1.i e;

    public g(cz5.b apmContactsProviderMap, lx1.d apmContactsInteractor, wl3.c addContactsInteractor, cl3.a contactsInteractor, ox1.i deviceContactMapper) {
        Intrinsics.checkNotNullParameter(apmContactsProviderMap, "apmContactsProviderMap");
        Intrinsics.checkNotNullParameter(apmContactsInteractor, "apmContactsInteractor");
        Intrinsics.checkNotNullParameter(addContactsInteractor, "addContactsInteractor");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(deviceContactMapper, "deviceContactMapper");
        this.f138849a = apmContactsProviderMap;
        this.f138850b = apmContactsInteractor;
        this.f138851c = addContactsInteractor;
        this.d = contactsInteractor;
        this.e = deviceContactMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0117 A[LOOP:0: B:45:0x0111->B:47:0x0117, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0143 A[LOOP:1: B:49:0x013d->B:51:0x0143, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(n02.b r12, com.revolut.feature.apm.core.models.recipients.ApmDescriptor r13, java.lang.String r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fy1.g.a(n02.b, com.revolut.feature.apm.core.models.recipients.ApmDescriptor, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec A[PHI: r11 r12 r13
      0x00ec: PHI (r11v5 java.lang.String) = 
      (r11v3 java.lang.String)
      (r11v3 java.lang.String)
      (r11v3 java.lang.String)
      (r11v3 java.lang.String)
      (r11v9 java.lang.String)
     binds: [B:33:0x00a5, B:53:0x00ea, B:42:0x00d4, B:37:0x00bc, B:19:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x00ec: PHI (r12v3 com.revolut.feature.apm.core.models.recipients.ApmDescriptor) = 
      (r12v2 com.revolut.feature.apm.core.models.recipients.ApmDescriptor)
      (r12v2 com.revolut.feature.apm.core.models.recipients.ApmDescriptor)
      (r12v2 com.revolut.feature.apm.core.models.recipients.ApmDescriptor)
      (r12v2 com.revolut.feature.apm.core.models.recipients.ApmDescriptor)
      (r12v6 com.revolut.feature.apm.core.models.recipients.ApmDescriptor)
     binds: [B:33:0x00a5, B:53:0x00ea, B:42:0x00d4, B:37:0x00bc, B:19:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x00ec: PHI (r13v4 n02.b) = (r13v3 n02.b), (r13v3 n02.b), (r13v3 n02.b), (r13v3 n02.b), (r13v7 n02.b) binds: [B:33:0x00a5, B:53:0x00ea, B:42:0x00d4, B:37:0x00bc, B:19:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(n02.b r11, com.revolut.feature.apm.core.models.recipients.ApmDescriptor r12, java.lang.String r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fy1.g.b(n02.b, com.revolut.feature.apm.core.models.recipients.ApmDescriptor, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof fy1.e
            if (r0 == 0) goto L13
            r0 = r7
            fy1.e r0 = (fy1.e) r0
            int r1 = r0.f138847w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f138847w = r1
            goto L18
        L13:
            fy1.e r0 = new fy1.e
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f138847w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            wl3.c r7 = r4.f138851c
            ufm.i r5 = r7.a(r5, r6)
            r0.f138847w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fy1.g.c(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof fy1.f
            if (r0 == 0) goto L13
            r0 = r7
            fy1.f r0 = (fy1.f) r0
            int r1 = r0.f138848w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f138848w = r1
            goto L18
        L13:
            fy1.f r0 = new fy1.f
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f138848w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            wl3.c r7 = r4.f138851c
            ufm.i r5 = r7.b(r5, r6)
            r0.f138848w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fy1.g.d(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
