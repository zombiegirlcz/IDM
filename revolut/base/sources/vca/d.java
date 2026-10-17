package vca;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements f8a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lx1.d f287659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cl3.a f287660b;

    public d(lx1.d apmContactsInteractor, cl3.a contactsInteractor) {
        Intrinsics.checkNotNullParameter(apmContactsInteractor, "apmContactsInteractor");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        this.f287659a = apmContactsInteractor;
        this.f287660b = contactsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.apm.core.models.recipients.ApmDescriptor r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof vca.b
            if (r0 == 0) goto L13
            r0 = r8
            vca.b r0 = (vca.b) r0
            int r1 = r0.f287656x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f287656x = r1
            goto L18
        L13:
            vca.b r0 = new vca.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f287656x
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r8)
            return r8
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            return r8
        L39:
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor r7 = r0.u
            yhm.o.b(r8)
            goto L53
        L3f:
            yhm.o.b(r8)
            n02.b r8 = n02.b.PIX
            r0.u = r7
            r0.f287656x = r5
            lx1.d r2 = r6.f287659a
            fy1.o r2 = (fy1.o) r2
            java.lang.Object r8 = r2.c(r8, r7, r0)
            if (r8 != r1) goto L53
            goto L84
        L53:
            nx1.d r8 = (nx1.d) r8
            boolean r2 = r8 instanceof nx1.c
            r5 = 0
            if (r2 == 0) goto L76
            nx1.c r8 = (nx1.c) r8
            com.revolut.feature.apm.core.models.recipients.ApmContact r8 = r8.f220055a
            boolean r2 = r8 instanceof com.revolut.feature.apm.core.models.recipients.PixContact
            if (r2 == 0) goto L6a
            g8a.c r7 = new g8a.c
            com.revolut.feature.apm.core.models.recipients.PixContact r8 = (com.revolut.feature.apm.core.models.recipients.PixContact) r8
            r7.<init>(r8)
            return r7
        L6a:
            r0.u = r5
            r0.f287656x = r4
            java.lang.Object r7 = r6.b(r7, r0)
            if (r7 != r1) goto L75
            goto L84
        L75:
            return r7
        L76:
            boolean r2 = r8 instanceof nx1.a
            if (r2 == 0) goto L86
            r0.u = r5
            r0.f287656x = r3
            java.lang.Object r7 = r6.b(r7, r0)
            if (r7 != r1) goto L85
        L84:
            return r1
        L85:
            return r7
        L86:
            boolean r7 = r8 instanceof nx1.b
            if (r7 == 0) goto L94
            g8a.d r7 = new g8a.d
            nx1.b r8 = (nx1.b) r8
            java.lang.Exception r8 = r8.f220054a
            r7.<init>(r8)
            return r7
        L94:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vca.d.a(com.revolut.feature.apm.core.models.recipients.ApmDescriptor, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.apm.core.models.recipients.ApmDescriptor r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vca.c
            if (r0 == 0) goto L13
            r0 = r6
            vca.c r0 = (vca.c) r0
            int r1 = r0.f287658x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f287658x = r1
            goto L18
        L13:
            vca.c r0 = new vca.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f287658x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor r5 = r0.u
            yhm.o.b(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.String r6 = r5.getF62112a()
            cl3.a r2 = r4.f287660b
            wl3.h r2 = (wl3.h) r2
            rfm.w r6 = r2.c(r6)
            r0.u = r5
            r0.f287658x = r3
            java.lang.Object r6 = nim.a.i(r6, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            zm3.a r6 = (zm3.a) r6
            if (r6 == 0) goto L55
            g8a.f r5 = new g8a.f
            r5.<init>(r6)
            return r5
        L55:
            boolean r6 = r5 instanceof com.revolut.feature.apm.core.models.recipients.ApmDescriptor.Email
            if (r6 == 0) goto L68
            g8a.f r6 = new g8a.f
            zm3.n r0 = new zm3.n
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor$Email r5 = (com.revolut.feature.apm.core.models.recipients.ApmDescriptor.Email) r5
            java.lang.String r5 = r5.f62107b
            r0.<init>(r5)
            r6.<init>(r0)
            return r6
        L68:
            boolean r6 = r5 instanceof com.revolut.feature.apm.core.models.recipients.ApmDescriptor.Phone
            if (r6 == 0) goto L7b
            g8a.f r6 = new g8a.f
            zm3.o r0 = new zm3.o
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor$Phone r5 = (com.revolut.feature.apm.core.models.recipients.ApmDescriptor.Phone) r5
            java.lang.String r5 = r5.f62110b
            r0.<init>(r5)
            r6.<init>(r0)
            return r6
        L7b:
            g8a.e r5 = g8a.e.f141303a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vca.d.b(com.revolut.feature.apm.core.models.recipients.ApmDescriptor, gim.c):java.lang.Object");
    }
}
