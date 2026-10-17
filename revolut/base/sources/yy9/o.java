package yy9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lx1.c f317912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z80.b f317913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f317914c;

    public o(lx1.c interactor, z80.b phoneToolsProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f317912a = interactor;
        this.f317913b = phoneToolsProvider;
        this.f317914c = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, com.revolut.feature.apm.core.api.product.ApmProduct r6, n02.b r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof yy9.m
            if (r0 == 0) goto L13
            r0 = r8
            yy9.m r0 = (yy9.m) r0
            int r1 = r0.f317909x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317909x = r1
            goto L18
        L13:
            yy9.m r0 = new yy9.m
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317909x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.api.product.ApmProduct r6 = r0.u
            yhm.o.b(r8)
            goto L51
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r8)
            boolean r8 = e0m.g.a(r5)
            if (r8 != 0) goto L3b
            goto L67
        L3b:
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor$Email r8 = new com.revolut.feature.apm.core.models.recipients.ApmDescriptor$Email
            r8.<init>(r5)
            r0.u = r6
            r0.f317909x = r3
            lx1.c r5 = r4.f317912a
            fy1.g r5 = (fy1.g) r5
            java.lang.String r2 = ""
            java.lang.Object r8 = r5.a(r7, r8, r2, r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            lx1.g r8 = (lx1.g) r8
            boolean r5 = r8 instanceof lx1.e
            if (r5 == 0) goto L67
            com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType$ApmType$Email r5 = new com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType$ApmType$Email
            lx1.e r8 = (lx1.e) r8
            java.util.List r7 = r8.f200516a
            java.lang.Object r7 = zhm.d0.b0(r7)
            com.revolut.feature.apm.core.models.recipients.ApmContact r7 = (com.revolut.feature.apm.core.models.recipients.ApmContact) r7
            r5.<init>(r6, r7)
            return r5
        L67:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yy9.o.a(java.lang.String, com.revolut.feature.apm.core.api.product.ApmProduct, n02.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, com.revolut.feature.apm.core.api.product.ApmProduct r6, n02.b r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof yy9.n
            if (r0 == 0) goto L13
            r0 = r8
            yy9.n r0 = (yy9.n) r0
            int r1 = r0.f317911x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317911x = r1
            goto L18
        L13:
            yy9.n r0 = new yy9.n
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317911x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.api.product.ApmProduct r6 = r0.u
            yhm.o.b(r8)
            goto L53
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r8)
            z80.b r8 = r4.f317913b
            boolean r8 = z80.b.l(r8, r5)
            if (r8 != 0) goto L3d
            goto L69
        L3d:
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor$Phone r8 = new com.revolut.feature.apm.core.models.recipients.ApmDescriptor$Phone
            r8.<init>(r5)
            r0.u = r6
            r0.f317911x = r3
            lx1.c r5 = r4.f317912a
            fy1.g r5 = (fy1.g) r5
            java.lang.String r2 = ""
            java.lang.Object r8 = r5.a(r7, r8, r2, r0)
            if (r8 != r1) goto L53
            return r1
        L53:
            lx1.g r8 = (lx1.g) r8
            boolean r5 = r8 instanceof lx1.e
            if (r5 == 0) goto L69
            com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType$ApmType$Phone r5 = new com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType$ApmType$Phone
            lx1.e r8 = (lx1.e) r8
            java.util.List r7 = r8.f200516a
            java.lang.Object r7 = zhm.d0.b0(r7)
            com.revolut.feature.apm.core.models.recipients.ApmContact r7 = (com.revolut.feature.apm.core.models.recipients.ApmContact) r7
            r5.<init>(r6, r7)
            return r5
        L69:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yy9.o.b(java.lang.String, com.revolut.feature.apm.core.api.product.ApmProduct, n02.b, gim.c):java.lang.Object");
    }
}
