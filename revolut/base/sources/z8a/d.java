package z8a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s8a.c f320051l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t8a.a f320052m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d9a.c f320053n;
    public final wj0.a o;

    public d(s8a.c aliasManagementInteractor, t8a.a pixKeysControllerModelExtension, d9a.c dialogContentProvider, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(aliasManagementInteractor, "aliasManagementInteractor");
        Intrinsics.checkNotNullParameter(pixKeysControllerModelExtension, "pixKeysControllerModelExtension");
        Intrinsics.checkNotNullParameter(dialogContentProvider, "dialogContentProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.f320051l = aliasManagementInteractor;
        this.f320052m = pixKeysControllerModelExtension;
        this.f320053n = dialogContentProvider;
        this.o = idempotencyKeyHolder;
    }

    @Override // yji.n
    public final void D2() {
        this.o.a("create_alias");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // z8a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.pix.api.model.AliasRegistrationType r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof z8a.b
            if (r0 == 0) goto L14
            r0 = r11
            z8a.b r0 = (z8a.b) r0
            int r1 = r0.f320049x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f320049x = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            z8a.b r0 = new z8a.b
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f320049x
            r7 = 2
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L3c
            if (r1 == r2) goto L35
            if (r1 != r7) goto L2d
            yhm.o.b(r11)
            return r11
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            com.revolut.feature.pix.api.model.AliasRegistrationType r10 = r5.u
            yhm.o.b(r11)
            r1 = r9
            goto L62
        L3c:
            yhm.o.b(r11)
            r11 = r2
            dx6.m r2 = new dx6.m
            r1 = 9
            d9a.c r3 = r9.f320053n
            r2.<init>(r3, r1)
            r1 = r3
            i4b.e0 r3 = new i4b.e0
            r4 = 3
            r3.<init>(r1, r4)
            z8a.c r4 = new z8a.c
            r4.<init>(r9, r10, r8)
            r5.u = r10
            r5.f320049x = r11
            r6 = 1
            r1 = r9
            java.lang.Object r11 = n14.k.R(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto L62
            goto L7a
        L62:
            nii.e r11 = (nii.e) r11
            boolean r2 = r11 instanceof nii.c
            if (r2 == 0) goto L83
            nii.c r11 = (nii.c) r11
            nii.n1 r11 = r11.f216124b
            boolean r11 = r11 instanceof nii.l1
            if (r11 == 0) goto L7c
            r5.u = r8
            r5.f320049x = r7
            java.lang.Object r10 = r9.Z2(r10, r5)
            if (r10 != r0) goto L7b
        L7a:
            return r0
        L7b:
            return r10
        L7c:
            com.revolut.feature.pix.api.model.AliasRegistrationResult$Failed r10 = new com.revolut.feature.pix.api.model.AliasRegistrationResult$Failed
            r11 = 0
            r10.<init>(r11)
            return r10
        L83:
            boolean r10 = r11 instanceof nii.d
            if (r10 == 0) goto La4
            nii.d r11 = (nii.d) r11
            java.lang.Object r10 = r11.f216133a
            com.revolut.feature.pix.api.model.AliasRegistrationResult r10 = (com.revolut.feature.pix.api.model.AliasRegistrationResult) r10
            nii.n1 r11 = r11.f216134b
            boolean r11 = r11 instanceof nii.l1
            if (r11 == 0) goto La3
            boolean r11 = r10 instanceof com.revolut.feature.pix.api.model.AliasRegistrationResult.Success
            if (r11 == 0) goto L9a
            r8 = r10
            com.revolut.feature.pix.api.model.AliasRegistrationResult$Success r8 = (com.revolut.feature.pix.api.model.AliasRegistrationResult.Success) r8
        L9a:
            if (r8 == 0) goto La3
            t8a.a r11 = r1.f320052m
            com.revolut.feature.pix.api.model.PixKey r0 = r8.f80387a
            r11.Z2(r0)
        La3:
            return r10
        La4:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z8a.d.Z2(com.revolut.feature.pix.api.model.AliasRegistrationType, gim.c):java.lang.Object");
    }
}
