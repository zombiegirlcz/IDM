package zs9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mq9.f f324832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pak.h f324833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f324834c;
    public final bn2.p d;

    public e(mq9.f groupsInteractor, pak.h groupSettingsInteractor, wsg.n walletInteractor, bn2.p backgroundsInteractor) {
        Intrinsics.checkNotNullParameter(groupsInteractor, "groupsInteractor");
        Intrinsics.checkNotNullParameter(groupSettingsInteractor, "groupSettingsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        this.f324832a = groupsInteractor;
        this.f324833b = groupSettingsInteractor;
        this.f324834c = walletInteractor;
        this.d = backgroundsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r9, java.lang.String r10, com.revolut.core.ui_kit_core.displayers.image.Image r11, xi0.b r12, st9.b r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zs9.e.a(java.util.List, java.lang.String, com.revolut.core.ui_kit_core.displayers.image.Image, xi0.b, st9.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zs9.b
            if (r0 == 0) goto L13
            r0 = r5
            zs9.b r0 = (zs9.b) r0
            int r1 = r0.f324829w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f324829w = r1
            goto L18
        L13:
            zs9.b r0 = new zs9.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f324829w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            wsg.n r5 = r4.f324834c
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r5 = r5.x(r2)
            r0.f324829w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zs9.e.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zs9.c
            if (r0 == 0) goto L13
            r0 = r5
            zs9.c r0 = (zs9.c) r0
            int r1 = r0.f324830w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f324830w = r1
            goto L18
        L13:
            zs9.c r0 = new zs9.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f324830w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f324830w = r3
            java.lang.Object r5 = r4.b(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            r0 = 0
            r1 = 3
            r2 = 0
            com.revolut.data.model.Data r5 = zi0.c.P(r5, r0, r2, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zs9.e.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.feature.backgroundpicker.models.RetailBackgroundKey.SplitBillGroupCreation r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zs9.d
            if (r0 == 0) goto L13
            r0 = r6
            zs9.d r0 = (zs9.d) r0
            int r1 = r0.f324831w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f324831w = r1
            goto L18
        L13:
            zs9.d r0 = new zs9.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f324831w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f324831w = r3
            bn2.p r6 = r4.d
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.revolut.feature.backgroundpicker.api.model.ChosenBackground r6 = (com.revolut.feature.backgroundpicker.api.model.ChosenBackground) r6
            r5 = 0
            if (r6 == 0) goto L45
            com.revolut.core.ui_kit.models.NavBarWithContainerBackground r6 = r6.f63742b
            goto L46
        L45:
            r6 = r5
        L46:
            boolean r0 = r6 instanceof com.revolut.core.ui_kit.models.NavBarWithContainerBackground.ImageBackground
            if (r0 == 0) goto L53
            com.revolut.core.ui_kit.models.NavBarWithContainerBackground$ImageBackground r6 = (com.revolut.core.ui_kit.models.NavBarWithContainerBackground.ImageBackground) r6
            com.revolut.core.ui_kit_core.displayers.image.Image r5 = r6.f57881c
            if (r5 != 0) goto L52
            com.revolut.core.ui_kit_core.displayers.image.Image r5 = r6.f57879a
        L52:
            return r5
        L53:
            boolean r0 = r6 instanceof com.revolut.core.ui_kit.models.NavBarWithContainerBackground.VideoBackground
            if (r0 == 0) goto L5c
            com.revolut.core.ui_kit.models.NavBarWithContainerBackground$VideoBackground r6 = (com.revolut.core.ui_kit.models.NavBarWithContainerBackground.VideoBackground) r6
            com.revolut.core.ui_kit_core.displayers.image.Image r5 = r6.f57884b
            return r5
        L5c:
            com.revolut.core.ui_kit.models.NavBarWithContainerBackground$TransparentBackground r0 = com.revolut.core.ui_kit.models.NavBarWithContainerBackground.TransparentBackground.f57882a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r6, r0)
            if (r0 != 0) goto L6d
            if (r6 != 0) goto L67
            goto L6d
        L67:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L6d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zs9.e.d(com.revolut.feature.backgroundpicker.models.RetailBackgroundKey$SplitBillGroupCreation, gim.c):java.lang.Object");
    }
}
