package ig5;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import jf0.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.k;
import sri.m;
import ufm.i;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements fg5.b, k, ai5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai5.b f161078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f161079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FeatureCommand f161080c;

    public b(m navigator, ai5.b cryptoNavigationInterceptor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        this.f161078a = cryptoNavigationInterceptor;
        this.f161079b = navigator;
        this.f161080c = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6)));
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        return y.D(cVar, "deeplink", 1, "crypto") && Intrinsics.f(cVar.e(2), "multi-network");
    }

    @Override // ai5.b
    public final d0 b(String deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return this.f161078a.b(deeplinkUri);
    }

    @Override // ai5.b
    public final Object c(NaviCommand naviCommand, Continuation continuation) {
        return this.f161078a.c(naviCommand, continuation);
    }

    @Override // ai5.b
    public final Object d(String str, Continuation continuation) {
        return this.f161078a.d(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ig5.a
            if (r0 == 0) goto L13
            r0 = r10
            ig5.a r0 = (ig5.a) r0
            int r1 = r0.f161077w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161077w = r1
            goto L1a
        L13:
            ig5.a r0 = new ig5.a
            gim.c r10 = (gim.c) r10
            r0.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f161077w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r10)
            goto L41
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            yhm.o.b(r10)
            java.lang.String r9 = r9.f173629c
            r0.f161077w = r3
            ai5.b r10 = r8.f161078a
            java.lang.Object r10 = r10.d(r9, r0)
            if (r10 != r1) goto L41
            return r1
        L41:
            q06.j r10 = (q06.j) r10
            if (r10 == 0) goto L46
            return r10
        L46:
            q06.h r9 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r10 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r1 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            com.revolut.feature.crypto.features.api.navigation.CryptoFeaturesDestination r3 = new com.revolut.feature.crypto.features.api.navigation.CryptoFeaturesDestination
            gg5.a r2 = gg5.a.MULTINETWORK
            r3.<init>(r2)
            r6 = 0
            r7 = 61
            r2 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r1)
            r10.<init>(r0)
            q06.b r0 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.d
            r0.<init>(r1, r2)
            r9.<init>(r10, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ig5.b.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarB = b(deeplink.f173629c);
        icc.c cVar = new icc.c(new gae.a(this, z, 14), 29);
        d0VarB.getClass();
        i iVar = new i(d0VarB, cVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
