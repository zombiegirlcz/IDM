package she;

import kotlin.jvm.internal.Intrinsics;
import vge.z2;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vge.d f263466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2 f263467b;

    public d(vge.d accountInteractor, z2 accountsInteractor) {
        Intrinsics.checkNotNullParameter(accountInteractor, "accountInteractor");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        this.f263466a = accountInteractor;
        this.f263467b = accountsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r8, com.revolut.feature.rev10_main_screen.api.MainScreenTab r9, com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload.Action r10, gim.c r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof she.b
            if (r0 == 0) goto L13
            r0 = r11
            she.b r0 = (she.b) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            she.b r0 = new she.b
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.f263463x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload$Action r10 = r0.f263462w
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r9 = r0.v
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r8 = r0.u
            yhm.o.b(r11)     // Catch: java.lang.Exception -> L2e
            goto L5b
        L2e:
            r11 = move-exception
            goto L51
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            yhm.o.b(r11)
            she.c r11 = new she.c     // Catch: java.lang.Exception -> L2e
            r11.<init>(r7, r8, r4)     // Catch: java.lang.Exception -> L2e
            r0.u = r8     // Catch: java.lang.Exception -> L2e
            r0.v = r9     // Catch: java.lang.Exception -> L2e
            r0.f263462w = r10     // Catch: java.lang.Exception -> L2e
            r0.z = r3     // Catch: java.lang.Exception -> L2e
            r5 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r11 = skm.h2.b(r5, r11, r0)     // Catch: java.lang.Exception -> L2e
            if (r11 != r1) goto L5b
            return r1
        L51:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r4, r4, r11, r0)
            r3 = 0
        L5b:
            vge.z2 r11 = r7.f263467b
            vge.z2.a(r11, r8)
            com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig r11 = new com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig
            r11.<init>(r8, r10)
            com.revolut.kompot.navigable.TransitionAnimation$a r8 = com.revolut.kompot.navigable.TransitionAnimation.INSTANCE
            com.revolut.kompot.common.transition.AccountCreationTransitionAnimation r8 = jji.b.a(r8)
            if (r3 == 0) goto L6e
            r4 = r8
        L6e:
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow r8 = new com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow
            r10 = 8
            r8.<init>(r9, r11, r4, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: she.d.a(com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value, com.revolut.feature.rev10_main_screen.api.MainScreenTab, com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload$Action, gim.c):java.lang.Object");
    }
}
