package jyk;

import ip0.yc0;
import jsl.t0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class j0 implements oxk.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f179487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hyk.c f179488b;

    public j0(sri.m navigator, hyk.c onboardingRepository) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(onboardingRepository, "onboardingRepository");
        this.f179487a = navigator;
        this.f179488b = onboardingRepository;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "onboarding") && Intrinsics.f(cVar.e(3), "otp") && Intrinsics.f(cVar.e(4), "challenge") && cVar.d.containsKey("accountId");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof jyk.i0
            if (r0 == 0) goto L13
            r0 = r8
            jyk.i0 r0 = (jyk.i0) r0
            int r1 = r0.f179483w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f179483w = r1
            goto L1a
        L13:
            jyk.i0 r0 = new jyk.i0
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f179483w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2a
            goto L64
        L2a:
            r7 = move-exception
            goto L69
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            java.util.HashMap r7 = r7.d
            java.lang.String r8 = "accountId"
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L44
            return r4
        L44:
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a
            hyk.c r8 = r6.f179488b     // Catch: java.lang.Throwable -> L2a
            r0.f179483w = r3     // Catch: java.lang.Throwable -> L2a
            r8.getClass()     // Catch: java.lang.Throwable -> L2a
            hul.f0 r2 = new hul.f0     // Catch: java.lang.Throwable -> L2a
            r5 = 21
            r2.<init>(r8, r7, r4, r5)     // Catch: java.lang.Throwable -> L2a
            skm.p0 r7 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L2a
            elm.f r7 = elm.f.f127540b     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)     // Catch: java.lang.Throwable -> L2a
            if (r7 != r1) goto L5f
            goto L61
        L5f:
            kotlin.Unit r7 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2a
        L61:
            if (r7 != r1) goto L64
            return r1
        L64:
            kotlin.Unit r7 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2a
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a
            goto L6f
        L69:
            yhm.m$a r8 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r7)
        L6f:
            boolean r7 = r7 instanceof yhm.n
            r7 = r7 ^ r3
            q06.h r8 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_otp_dialog.OnboardingOtpDialogDestination r1 = new com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_otp_dialog.OnboardingOtpDialogDestination
            r1.<init>(r7)
            yhi.b r7 = yhi.b.BOTTOM_DIALOG
            r2 = 0
            r3 = 12
            com.revolut.retail.core.navigation.FeatureCommand r7 = vhi.c.c(r1, r7, r4, r2, r3)
            r0.<init>(r7)
            r8.<init>(r0, r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jyk.j0.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String str = (String) deeplink.d.get("accountId");
        if (str == null) {
            ufm.b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        p0 p0Var = p0.f264001a;
        Continuation continuation = null;
        pfm.z zVar = new pfm.z(pd.b.n(zkm.o.f323119a, new t0(this, str, continuation, 14)), 0, new a68.f(10), continuation);
        Intrinsics.checkNotNullExpressionValue(zVar, "toSingle(...)");
        int i = 2;
        int i2 = 3;
        ufm.i iVar = new ufm.i(new ufm.f(new ufm.i(ue0.e.D(zVar, new d0(i)), new g0(new d0(i2), 1), 1), new g0(new yc0(1, this.f179487a, sri.m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 21), i), i2), new g0(new d0(4), i2), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
