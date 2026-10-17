package n95;

import kotlin.jvm.internal.Intrinsics;
import o95.g;
import o95.i;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements h95.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f213579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f213580b;

    public d(g overdraftProductFeatureTogglesInteractor, i overdraftProductInteractor) {
        Intrinsics.checkNotNullParameter(overdraftProductFeatureTogglesInteractor, "overdraftProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(overdraftProductInteractor, "overdraftProductInteractor");
        this.f213579a = overdraftProductFeatureTogglesInteractor;
        this.f213580b = overdraftProductInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof n95.b
            if (r0 == 0) goto L13
            r0 = r9
            n95.b r0 = (n95.b) r0
            int r1 = r0.f213575w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213575w = r1
            goto L18
        L13:
            n95.b r0 = new n95.b
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f213575w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L3f
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            yhm.o.b(r9)
            r0.f213575w = r3
            o95.i r9 = r8.f213580b
            w4l.i r2 = w4l.i.f294643c
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto L3f
            return r1
        L3f:
            java.lang.String r9 = (java.lang.String) r9
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration r1 = new com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration
            s49.a r2 = s49.a.SINGLE_TOP
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration r3 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId r4 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r5 = ibb.c.f160140a
            java.lang.String r5 = r5.f83420a
            r6 = 0
            r4.<init>(r5, r6)
            com.revolut.retail.core.navigation.FeatureCommand r5 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.credit.overdraft.api.navigation.OverdraftDetailsFeatureConfig r7 = new com.revolut.feature.credit.overdraft.api.navigation.OverdraftDetailsFeatureConfig
            r7.<init>(r9)
            r5.<init>(r7)
            r9 = 2
            r3.<init>(r4, r6, r5, r9)
            r1.<init>(r2, r3)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n95.d.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r2 == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(w4l.k r18, grl.r2 r19, gim.c r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            boolean r3 = r2 instanceof n95.c
            if (r3 == 0) goto L19
            r3 = r2
            n95.c r3 = (n95.c) r3
            int r4 = r3.f213578y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f213578y = r4
            goto L1e
        L19:
            n95.c r3 = new n95.c
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f213576w
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f213578y
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L43
            if (r5 == r7) goto L39
            if (r5 != r6) goto L31
            yhm.o.b(r2)
            goto L78
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            grl.r2 r1 = r3.v
            w4l.k r5 = r3.u
            yhm.o.b(r2)
            r10 = r1
            r1 = r5
            goto L61
        L43:
            yhm.o.b(r2)
            o95.g r2 = r0.f213579a
            kotlinx.coroutines.flow.Flow r2 = r2.c(r1)
            r5 = 3
            jhi.b r2 = mo3.a.g(r2, r8, r8, r5)
            r3.u = r1
            r5 = r19
            r3.v = r5
            r3.f213578y = r7
            java.lang.Object r2 = vkm.q.x(r2, r3)
            if (r2 != r4) goto L60
            goto L77
        L60:
            r10 = r5
        L61:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L85
            r3.u = r8
            r3.v = r8
            r3.f213578y = r6
            o95.i r2 = r0.f213580b
            java.lang.Object r2 = r2.a(r1, r3)
            if (r2 != r4) goto L78
        L77:
            return r4
        L78:
            java.lang.String r2 = (java.lang.String) r2
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.credit.overdraft.api.navigation.OverdraftDetailsFeatureConfig r3 = new com.revolut.feature.credit.overdraft.api.navigation.OverdraftDetailsFeatureConfig
            r3.<init>(r2)
            r1.<init>(r3)
            return r1
        L85:
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            ft3.g0 r11 = ft3.g0.INSTANCE
            int[] r2 = n95.a.f213574a
            int r3 = r10.ordinal()
            r2 = r2[r3]
            if (r2 != r7) goto L97
            yp3.e r2 = yp3.e.ALWAYS_CHECK
        L95:
            r14 = r2
            goto L9a
        L97:
            yp3.e r2 = yp3.e.SKIP_ON_TOGGLE_DISABLED
            goto L95
        L9a:
            com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig$StartApplication r9 = new com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig$StartApplication
            r15 = 0
            r16 = 16122(0x3efa, float:2.2592E-41)
            r12 = 0
            r13 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r1.<init>(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n95.d.b(w4l.k, grl.r2, gim.c):java.lang.Object");
    }
}
