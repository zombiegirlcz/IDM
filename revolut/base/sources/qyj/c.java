package qyj;

import cu8.r0;
import dz8.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f250296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xh5.a f250297b;

    public c(r0 kycRequiredActionTransformer, xh5.a cryptoFeatureEnabledInteractor) {
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        this.f250296a = kycRequiredActionTransformer;
        this.f250297b = cryptoFeatureEnabledInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(u09.q r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qyj.a
            if (r0 == 0) goto L13
            r0 = r7
            qyj.a r0 = (qyj.a) r0
            int r1 = r0.f250293x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f250293x = r1
            goto L18
        L13:
            qyj.a r0 = new qyj.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f250293x
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
            u09.q r6 = r0.u
            yhm.o.b(r7)
            goto L4f
        L38:
            yhm.o.b(r7)
            ks8.b r7 = ks8.c.Companion
            r7.getClass()
            ks8.c r7 = ks8.c.f
            r0.u = r6
            r0.f250293x = r4
            cu8.r0 r2 = r5.f250296a
            java.lang.Object r7 = r2.f(r7, r0)
            if (r7 != r1) goto L4f
            goto L60
        L4f:
            ks8.j r7 = (ks8.j) r7
            boolean r2 = r7 instanceof ks8.j.a
            if (r2 == 0) goto L62
            r7 = 0
            r0.u = r7
            r0.f250293x = r3
            java.lang.Object r6 = r5.b(r6, r0)
            if (r6 != r1) goto L61
        L60:
            return r1
        L61:
            return r6
        L62:
            boolean r6 = r7 instanceof ks8.i
            if (r6 == 0) goto L75
            dz8.b r6 = new dz8.b
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            ks8.i r7 = (ks8.i) r7
            com.revolut.retail.core.navigation.FeatureCommand r7 = r7.f189312a
            r0.<init>(r7)
            r6.<init>(r0)
            return r6
        L75:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qyj.c.a(u09.q, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(u09.q r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof qyj.b
            if (r0 == 0) goto L13
            r0 = r9
            qyj.b r0 = (qyj.b) r0
            int r1 = r0.f250295x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f250295x = r1
            goto L18
        L13:
            qyj.b r0 = new qyj.b
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f250295x
            xh5.a r3 = r7.f250297b
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r5) goto L2c
            yhm.o.b(r9)
            goto L76
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            u09.q r8 = r0.u
            yhm.o.b(r9)
            goto L4b
        L3a:
            yhm.o.b(r9)
            r0.u = r8
            r0.f250295x = r4
            r9 = r3
            ji5.e r9 = (ji5.e) r9
            java.lang.Object r9 = r9.e(r0)
            if (r9 != r1) goto L4b
            goto L75
        L4b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L56
            dz8.c r8 = dz8.c.f121292a
            return r8
        L56:
            com.revolut.retail.core.navigation.FeatureCommand r9 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig$CourseOverview r2 = new com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig$CourseOverview
            java.lang.String r4 = r8.f276147c
            u09.v r6 = u09.v.CRYPTO
            java.lang.String r8 = r8.f276145a
            r2.<init>(r4, r6, r8)
            r9.<init>(r2)
            efm.d0 r8 = xh5.a.a(r3, r9)
            r9 = 0
            r0.u = r9
            r0.f250295x = r5
            java.lang.Object r9 = nim.a.b(r8, r0)
            if (r9 != r1) goto L76
        L75:
            return r1
        L76:
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9
            dz8.b r8 = new dz8.b
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            kotlin.jvm.internal.Intrinsics.h(r9)
            r0.<init>(r9)
            r8.<init>(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qyj.c.b(u09.q, gim.c):java.lang.Object");
    }
}
