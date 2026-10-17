package she;

import kotlin.jvm.internal.Intrinsics;
import vie.i;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements zfe.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f263473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f263474b;

    public g(h owningTabResolver, i tabCreditPreferencesInteractor) {
        Intrinsics.checkNotNullParameter(owningTabResolver, "owningTabResolver");
        Intrinsics.checkNotNullParameter(tabCreditPreferencesInteractor, "tabCreditPreferencesInteractor");
        this.f263473a = owningTabResolver;
        this.f263474b = tabCreditPreferencesInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.rev10_main_screen.api.MainScreenTab r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof she.f
            if (r0 == 0) goto L13
            r0 = r6
            she.f r0 = (she.f) r0
            int r1 = r0.f263472x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f263472x = r1
            goto L18
        L13:
            she.f r0 = new she.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f263472x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r5 = r0.u
            yhm.o.b(r6)
            goto L5f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f263472x = r3
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r6 = ibb.c.f
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r6 == 0) goto L5a
            vie.i r6 = r4.f263474b
            boolean r2 = r6.a()
            if (r2 != 0) goto L52
            java.lang.Object r6 = r6.c(r3, r0)
            if (r6 != r1) goto L4f
            goto L54
        L4f:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            goto L54
        L52:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L54:
            if (r6 != r1) goto L57
            goto L5c
        L57:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            goto L5c
        L5a:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L5c:
            if (r6 != r1) goto L5f
            return r1
        L5f:
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow r6 = new com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow
            r0 = 14
            r1 = 0
            r6.<init>(r5, r1, r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: she.g.b(com.revolut.feature.rev10_main_screen.api.MainScreenTab, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r6, com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload.Action r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof she.e
            if (r0 == 0) goto L13
            r0 = r8
            she.e r0 = (she.e) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            she.e r0 = new she.e
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f263469x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r6 = r0.f263468w
            com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload$Action r7 = r0.v
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r0 = r0.u
            yhm.o.b(r8)
            goto L87
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            yhm.o.b(r8)
            java.lang.String r8 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r8)
            she.h r8 = r5.f263473a
            rfe.a r8 = r8.f263475a
            com.revolut.feature.tab.accounts.models.ProductId r2 = r6.getF89727a()
            com.revolut.feature.tab.accounts.models.ProductAccountId r4 = r6.getF89728b()
            com.revolut.feature.tab.accounts.models.ProductAccountId$Payload r4 = r4.f89730b
            boolean r8 = r8.a(r2, r4)
            if (r8 == 0) goto L54
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r8 = ibb.c.f
            goto L56
        L54:
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r8 = ibb.c.f160140a
        L56:
            r0.u = r6
            r0.v = r7
            r0.f263468w = r8
            r0.z = r3
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r2 = ibb.c.f
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r8, r2)
            if (r2 == 0) goto L80
            vie.i r2 = r5.f263474b
            boolean r4 = r2.a()
            if (r4 != 0) goto L78
            java.lang.Object r0 = r2.c(r3, r0)
            if (r0 != r1) goto L75
            goto L7a
        L75:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            goto L7a
        L78:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L7a:
            if (r0 != r1) goto L7d
            goto L82
        L7d:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            goto L82
        L80:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L82:
            if (r0 != r1) goto L85
            return r1
        L85:
            r0 = r6
            r6 = r8
        L87:
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow r8 = new com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow
            com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig r1 = new com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig
            r1.<init>(r0, r7)
            r7 = 0
            r0 = 12
            r8.<init>(r6, r1, r7, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: she.g.c(com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value, com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload$Action, gim.c):java.lang.Object");
    }
}
