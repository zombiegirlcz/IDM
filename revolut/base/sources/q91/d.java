package q91;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import sri.m;
import te0.w;
import wp5.y;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements i91.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f243631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s91.a f243632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v91.a f243633c;

    public d(m navigator, s91.a featureChecker, v91.a accountSwitchingActionObserver) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(accountSwitchingActionObserver, "accountSwitchingActionObserver");
        this.f243631a = navigator;
        this.f243632b = featureChecker;
        this.f243633c = accountSwitchingActionObserver;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "account-switching");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof q91.a
            if (r0 == 0) goto L13
            r0 = r5
            q91.a r0 = (q91.a) r0
            int r1 = r0.f243627w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f243627w = r1
            goto L18
        L13:
            q91.a r0 = new q91.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f243627w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r5)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            goto L45
        L27:
            r5 = move-exception
            goto L48
        L29:
            r5 = move-exception
            goto L5c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            yhm.o.b(r5)
            s91.a r5 = r4.f243632b     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            kotlinx.coroutines.flow.Flow r5 = r5.a()     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            r0.f243627w = r3     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = vkm.q.x(r5, r0)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            goto L53
        L48:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r5, r0)
            r5 = r2
        L53:
            boolean r5 = pd.b.j(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L5c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q91.d.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof q91.c
            if (r0 == 0) goto L13
            r0 = r6
            q91.c r0 = (q91.c) r0
            int r1 = r0.f243630x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f243630x = r1
            goto L1a
        L13:
            q91.c r0 = new q91.c
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f243630x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            jf0.c r5 = r0.u
            yhm.o.b(r6)
            goto L41
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            r0.u = r5
            r0.f243630x = r3
            java.lang.Object r6 = r4.b(r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 != 0) goto L4b
            return r0
        L4b:
            r6 = 2
            java.lang.String r5 = r5.e(r6)
            java.lang.String r6 = "success"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 == 0) goto L69
            v91.a r5 = r4.f243633c
            r5.getClass()
            java.lang.String r6 = "action"
            com.revolut.feature.account_switching.api.model.AccountSwitchingAction$HandleSuccessfulConnect r1 = com.revolut.feature.account_switching.api.model.AccountSwitchingAction.HandleSuccessfulConnect.f60557a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)
            vkm.z1 r5 = r5.f286960a
            r5.k(r1)
        L69:
            q06.h r5 = new q06.h
            com.revolut.feature.account_switching.api.navigation.AccountSwitchingFeatureConfig$AccountSwitchingFlowDestination r6 = com.revolut.feature.account_switching.api.navigation.AccountSwitchingFeatureConfig.AccountSwitchingFlowDestination.f60559a
            r5.<init>(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q91.d.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return w.o0(p0.f264003c, new b(this, deeplink, null));
    }
}
