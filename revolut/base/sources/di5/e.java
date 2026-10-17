package di5;

import com.revolut.retail.core.navigation.NaviCommand;
import d73.n;
import dcl.m0;
import dee.a0;
import efm.d0;
import ji5.i;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.k;
import sri.m;
import vkm.q;
import yhm.j;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements rh5.b, k, ai5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai5.b f114922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f114923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f114924c;
    public final xh5.a d;
    public final Lazy e;

    public e(m navigator, i cryptoOnboardingInteractor, ai5.b cryptoNavigationInterceptor, xh5.a cryptoFeatureEnabledInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(cryptoOnboardingInteractor, "cryptoOnboardingInteractor");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        this.f114922a = cryptoNavigationInterceptor;
        this.f114923b = navigator;
        this.f114924c = cryptoOnboardingInteractor;
        this.d = cryptoFeatureEnabledInteractor;
        this.e = j.b(new dce.b(19));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(di5.e r5, jf0.c r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof di5.c
            if (r0 == 0) goto L13
            r0 = r7
            di5.c r0 = (di5.c) r0
            int r1 = r0.f114919x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114919x = r1
            goto L18
        L13:
            di5.c r0 = new di5.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114919x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            jf0.c r6 = r0.u
            yhm.o.b(r7)
            goto L6e
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            jf0.c r6 = r0.u
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L86
            goto L4c
        L3a:
            r7 = move-exception
            goto L51
        L3c:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L86
            r0.u = r6     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L86
            r0.f114919x = r4     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L86
            java.lang.Object r7 = r5.h(r4, r0)     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L86
            if (r7 != r1) goto L4c
            goto L85
        L4c:
            ec5.c r7 = (ec5.c) r7     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L86
            yhm.m$a r2 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L86
            goto L57
        L51:
            yhm.m$a r2 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r7)
        L57:
            boolean r2 = r7 instanceof yhm.n
            if (r2 == 0) goto L5c
            r7 = 0
        L5c:
            ec5.c r7 = (ec5.c) r7
            if (r7 != 0) goto L63
            com.revolut.retail.core.navigation.DummyCommand r1 = com.revolut.retail.core.navigation.DummyCommand.f98635a
            goto L85
        L63:
            r0.u = r6
            r0.f114919x = r3
            java.lang.Object r7 = r5.i(r7, r0)
            if (r7 != r1) goto L6e
            goto L85
        L6e:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            boolean r6 = r6.l()
            if (r6 == 0) goto L84
            kotlin.Lazy r5 = r5.e
            java.lang.Object r5 = r5.getValue()
            com.revolut.retail.core.navigation.FeatureCommand r5 = (com.revolut.retail.core.navigation.FeatureCommand) r5
            com.revolut.retail.core.navigation.CompositeCommand r5 = com.revolut.retail.core.navigation.a.c(r5, r7)
            r1 = r5
            goto L85
        L84:
            r1 = r7
        L85:
            return r1
        L86:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: di5.e.g(di5.e, jf0.c, gim.c):java.lang.Object");
    }

    public static boolean k(jf0.c cVar) {
        return Intrinsics.f(cVar.e(1), "crypto") && Intrinsics.f(cVar.e(2), "disclaimer") && Intrinsics.f(cVar.e(3), "fca");
    }

    public static boolean l(jf0.c cVar) {
        return Intrinsics.f(cVar.e(1), "feature") && Intrinsics.f(cVar.e(2), "crypto") && Intrinsics.f(cVar.e(3), "onboarding");
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return l(deeplink) || k(deeplink);
    }

    @Override // ai5.b
    public final d0 b(String deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return this.f114922a.b(deeplinkUri);
    }

    @Override // ai5.b
    public final Object c(NaviCommand naviCommand, Continuation continuation) {
        return this.f114922a.c(naviCommand, continuation);
    }

    @Override // ai5.b
    public final Object d(String str, Continuation continuation) {
        return this.f114922a.d(str, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081 A[Catch: Exception -> 0x002d, CancellationException -> 0x0030, TryCatch #2 {CancellationException -> 0x0030, Exception -> 0x002d, blocks: (B:12:0x0029, B:32:0x0069, B:39:0x0081, B:41:0x0089, B:43:0x0096, B:27:0x0058, B:29:0x005e, B:33:0x006c, B:35:0x0072), top: B:48:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof di5.d
            if (r0 == 0) goto L13
            r0 = r8
            di5.d r0 = (di5.d) r0
            int r1 = r0.f114921x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114921x = r1
            goto L1a
        L13:
            di5.d r0 = new di5.d
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114921x
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r3) goto L3b
            if (r2 != r4) goto L33
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            goto L69
        L2d:
            r7 = move-exception
            goto La8
        L30:
            r7 = move-exception
            goto Lb2
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            jf0.c r7 = r0.u
            yhm.o.b(r8)
            goto L53
        L41:
            yhm.o.b(r8)
            java.lang.String r8 = r7.f173629c
            r0.u = r7
            r0.f114921x = r3
            ai5.b r2 = r6.f114922a
            java.lang.Object r8 = r2.d(r8, r0)
            if (r8 != r1) goto L53
            goto L68
        L53:
            q06.j r8 = (q06.j) r8
            if (r8 == 0) goto L58
            return r8
        L58:
            boolean r8 = l(r7)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            if (r8 == 0) goto L6c
            r0.u = r5     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r0.f114921x = r4     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            java.lang.Object r8 = r6.j(r0)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            if (r8 != r1) goto L69
        L68:
            return r1
        L69:
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            goto L7e
        L6c:
            boolean r7 = k(r7)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            if (r7 == 0) goto L7d
            com.revolut.retail.core.navigation.FeatureCommand r8 = new com.revolut.retail.core.navigation.FeatureCommand     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            com.revolut.feature.crypto.onboarding.api.navigation.CryptoFcaRisksConfig r7 = new com.revolut.feature.crypto.onboarding.api.navigation.CryptoFcaRisksConfig     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r7.<init>()     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r8.<init>(r7)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            goto L7e
        L7d:
            r8 = r5
        L7e:
            if (r8 != 0) goto L81
            return r5
        L81:
            com.revolut.retail.core.navigation.DummyCommand r7 = com.revolut.retail.core.navigation.DummyCommand.f98635a     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            if (r7 == 0) goto L96
            q06.i r7 = new q06.i     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            q06.b r8 = new q06.b     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r0 = ibb.c.d     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r8.<init>(r0, r5)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r7.<init>(r8)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            return r7
        L96:
            q06.h r7 = new q06.h     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r0.<init>(r8)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            q06.b r8 = new q06.b     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.d     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r8.<init>(r1, r5)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r7.<init>(r0, r8)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            return r7
        La8:
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r5, r5, r7, r8)
            return r5
        Lb2:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: di5.e.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarB = b(deeplink.f173629c);
        n nVar = new n(new m0(this, deeplink, 18), 24);
        d0VarB.getClass();
        ufm.i iVar = new ufm.i(d0VarB, nVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final Object h(boolean z, gim.c cVar) {
        return q.x(mo3.a.g(this.f114924c.a(z), null, new a0(14), 1), cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r8 != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(ec5.c r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof di5.b
            if (r0 == 0) goto L13
            r0 = r8
            di5.b r0 = (di5.b) r0
            int r1 = r0.f114917w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114917w = r1
            goto L18
        L13:
            di5.b r0 = new di5.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114917w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r8)
            goto L75
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            goto L61
        L39:
            yhm.o.b(r8)
            yhm.m r8 = (yhm.m) r8
            r8.getClass()
            goto L57
        L42:
            yhm.o.b(r8)
            ec5.j r8 = r7.f124432a
            ec5.j r2 = ec5.j.NOT_STARTED
            if (r8 != r2) goto L64
            r0.f114917w = r5
            r7 = 0
            ji5.i r8 = r6.f114924c
            java.lang.Object r7 = r8.c(r7, r0)
            if (r7 != r1) goto L57
            goto L74
        L57:
            r0.f114917w = r4
            r7 = 0
            java.lang.Object r8 = r6.h(r7, r0)
            if (r8 != r1) goto L61
            goto L74
        L61:
            r7 = r8
            ec5.c r7 = (ec5.c) r7
        L64:
            xh5.a r8 = r6.d
            ji5.e r8 = (ji5.e) r8
            efm.d0 r7 = r8.d(r7)
            r0.f114917w = r3
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L75
        L74:
            return r1
        L75:
            java.lang.String r7 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: di5.e.i(ec5.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof di5.a
            if (r0 == 0) goto L13
            r0 = r6
            di5.a r0 = (di5.a) r0
            int r1 = r0.f114916x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114916x = r1
            goto L18
        L13:
            di5.a r0 = new di5.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114916x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            di5.e r2 = r0.u
            yhm.o.b(r6)
            goto L47
        L38:
            yhm.o.b(r6)
            r0.u = r5
            r0.f114916x = r4
            java.lang.Object r6 = r5.h(r4, r0)
            if (r6 != r1) goto L46
            goto L54
        L46:
            r2 = r5
        L47:
            ec5.c r6 = (ec5.c) r6
            r4 = 0
            r0.u = r4
            r0.f114916x = r3
            java.lang.Object r6 = r2.i(r6, r0)
            if (r6 != r1) goto L55
        L54:
            return r1
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: di5.e.j(gim.c):java.lang.Object");
    }
}
