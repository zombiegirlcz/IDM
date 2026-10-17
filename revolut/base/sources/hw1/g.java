package hw1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lx1.d f156038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cl3.a f156039b;

    public g(lx1.d apmContactsInteractor, cl3.a contactsInteractor) {
        Intrinsics.checkNotNullParameter(apmContactsInteractor, "apmContactsInteractor");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        this.f156038a = apmContactsInteractor;
        this.f156039b = contactsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(hw1.m r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof hw1.e
            if (r0 == 0) goto L13
            r0 = r7
            hw1.e r0 = (hw1.e) r0
            int r1 = r0.f156035x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f156035x = r1
            goto L18
        L13:
            hw1.e r0 = new hw1.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f156035x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            hw1.m r6 = r0.u
            yhm.o.b(r7)
            goto L56
        L38:
            yhm.o.b(r7)
            av1.c r7 = r6.f156042a
            boolean r2 = r7 instanceof av1.a
            if (r2 == 0) goto L7f
            n02.b r2 = n02.b.BREB
            av1.a r7 = (av1.a) r7
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor r7 = r7.f9869c
            r0.u = r6
            r0.f156035x = r4
            lx1.d r4 = r5.f156038a
            fy1.o r4 = (fy1.o) r4
            java.lang.Object r7 = r4.c(r2, r7, r0)
            if (r7 != r1) goto L56
            goto L7d
        L56:
            nx1.d r7 = (nx1.d) r7
            boolean r2 = r7 instanceof nx1.c
            if (r2 == 0) goto L6c
            nx1.c r7 = (nx1.c) r7
            com.revolut.feature.apm.core.models.recipients.ApmContact r7 = r7.f220055a
            boolean r2 = r7 instanceof com.revolut.feature.apm.core.models.recipients.BrebContact
            if (r2 == 0) goto L6c
            hw1.a r6 = new hw1.a
            com.revolut.feature.apm.core.models.recipients.BrebContact r7 = (com.revolut.feature.apm.core.models.recipients.BrebContact) r7
            r6.<init>(r7)
            return r6
        L6c:
            av1.c r6 = r6.f156042a
            av1.a r6 = (av1.a) r6
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor r6 = r6.f9869c
            r7 = 0
            r0.u = r7
            r0.f156035x = r3
            java.lang.Object r6 = r5.b(r6, r0)
            if (r6 != r1) goto L7e
        L7d:
            return r1
        L7e:
            return r6
        L7f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Failed requirement."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hw1.g.a(hw1.m, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.apm.core.models.recipients.ApmDescriptor r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof hw1.f
            if (r0 == 0) goto L13
            r0 = r8
            hw1.f r0 = (hw1.f) r0
            int r1 = r0.f156037x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f156037x = r1
            goto L18
        L13:
            hw1.f r0 = new hw1.f
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f156037x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor r7 = r0.u
            yhm.o.b(r8)
            goto L71
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            boolean r8 = r7 instanceof com.revolut.feature.apm.core.models.recipients.ApmDescriptor.Phone
            if (r8 == 0) goto L5a
            r8 = r7
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor$Phone r8 = (com.revolut.feature.apm.core.models.recipients.ApmDescriptor.Phone) r8
            java.lang.String r2 = "phone"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            java.lang.String r8 = r8.f62110b
            java.lang.String r2 = "+57"
            r4 = 0
            boolean r5 = kotlin.text.a0.H(r8, r2, r4)
            if (r5 == 0) goto L4c
            goto L5e
        L4c:
            java.lang.String r5 = "+"
            boolean r4 = kotlin.text.a0.H(r8, r5, r4)
            if (r4 == 0) goto L55
            goto L5e
        L55:
            java.lang.String r8 = r2.concat(r8)
            goto L5e
        L5a:
            java.lang.String r8 = r7.getF62112a()
        L5e:
            cl3.a r2 = r6.f156039b
            wl3.h r2 = (wl3.h) r2
            rfm.w r8 = r2.c(r8)
            r0.u = r7
            r0.f156037x = r3
            java.lang.Object r8 = nim.a.i(r8, r0)
            if (r8 != r1) goto L71
            return r1
        L71:
            zm3.a r8 = (zm3.a) r8
            if (r8 == 0) goto L7b
            hw1.c r7 = new hw1.c
            r7.<init>(r8)
            return r7
        L7b:
            boolean r8 = r7 instanceof com.revolut.feature.apm.core.models.recipients.ApmDescriptor.Email
            if (r8 == 0) goto L8e
            hw1.c r8 = new hw1.c
            zm3.n r0 = new zm3.n
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor$Email r7 = (com.revolut.feature.apm.core.models.recipients.ApmDescriptor.Email) r7
            java.lang.String r7 = r7.f62107b
            r0.<init>(r7)
            r8.<init>(r0)
            return r8
        L8e:
            boolean r8 = r7 instanceof com.revolut.feature.apm.core.models.recipients.ApmDescriptor.Phone
            if (r8 == 0) goto La1
            hw1.c r8 = new hw1.c
            zm3.o r0 = new zm3.o
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor$Phone r7 = (com.revolut.feature.apm.core.models.recipients.ApmDescriptor.Phone) r7
            java.lang.String r7 = r7.f62110b
            r0.<init>(r7)
            r8.<init>(r0)
            return r8
        La1:
            hw1.b r7 = hw1.b.f156032a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hw1.g.b(com.revolut.feature.apm.core.models.recipients.ApmDescriptor, gim.c):java.lang.Object");
    }
}
