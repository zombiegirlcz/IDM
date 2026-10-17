package ml5;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import i4b.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.k;
import sri.m;
import ufm.i;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements hl5.b, k, ai5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai5.b f206639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f206640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f206641c;
    public final xh5.a d;

    public c(m navigator, f cryptoSpareChangeFeatureChecker, xh5.a cryptoFeatureEnabledInteractor, ai5.b cryptoNavigationInterceptor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(cryptoSpareChangeFeatureChecker, "cryptoSpareChangeFeatureChecker");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        this.f206639a = cryptoNavigationInterceptor;
        this.f206640b = navigator;
        this.f206641c = cryptoSpareChangeFeatureChecker;
        this.d = cryptoFeatureEnabledInteractor;
    }

    public static FeatureCommand g(c cVar, FeatureCommand featureCommand, MainContainerNavigationId.MainContainerTabId mainContainerTabId, int i) {
        if ((i & 1) != 0) {
            featureCommand = null;
        }
        if ((i & 2) != 0) {
            mainContainerTabId = u49.b.f277278a;
        }
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(mainContainerTabId, null, featureCommand, 2)));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "crypto") && Intrinsics.f(cVar.e(2), "spare-change");
    }

    @Override // ai5.b
    public final d0 b(String deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return this.f206639a.b(deeplinkUri);
    }

    @Override // ai5.b
    public final Object c(NaviCommand naviCommand, Continuation continuation) {
        return this.f206639a.c(naviCommand, continuation);
    }

    @Override // ai5.b
    public final Object d(String str, Continuation continuation) {
        return this.f206639a.d(str, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ml5.b
            if (r0 == 0) goto L13
            r0 = r7
            ml5.b r0 = (ml5.b) r0
            int r1 = r0.f206638x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f206638x = r1
            goto L1a
        L13:
            ml5.b r0 = new ml5.b
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f206638x
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3a
            if (r2 == r3) goto L36
            if (r2 != r4) goto L2e
            boolean r6 = r0.u
            yhm.o.b(r7)
            goto L68
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            yhm.o.b(r7)
            goto L4a
        L3a:
            yhm.o.b(r7)
            java.lang.String r6 = r6.f173629c
            r0.f206638x = r3
            ai5.b r7 = r5.f206639a
            java.lang.Object r7 = r7.d(r6, r0)
            if (r7 != r1) goto L4a
            goto L67
        L4a:
            q06.j r7 = (q06.j) r7
            if (r7 == 0) goto L4f
            return r7
        L4f:
            i4b.f r6 = r5.f206641c
            boolean r6 = r6.i()
            xh5.a r7 = r5.d
            ji5.e r7 = (ji5.e) r7
            efm.d0 r7 = r7.c()
            r0.u = r6
            r0.f206638x = r4
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L68
        L67:
            return r1
        L68:
            yh5.a r7 = (yh5.a) r7
            r0 = 0
            if (r6 == 0) goto L97
            kotlin.jvm.internal.Intrinsics.h(r7)
            boolean r6 = yh5.b.w(r7)
            if (r6 == 0) goto L97
            q06.h r6 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.tab.crypto.api.navigation.TabCryptoKompotFeatureConfig$CryptoSettingsConfig r2 = new com.revolut.feature.tab.crypto.api.navigation.TabCryptoKompotFeatureConfig$CryptoSettingsConfig
            com.revolut.feature.tab.crypto.api.navigation.CryptoSettingsInputData$OpenSpareChangeAtTop r3 = new com.revolut.feature.tab.crypto.api.navigation.CryptoSettingsInputData$OpenSpareChangeAtTop
            r3.<init>(r0)
            r2.<init>(r3)
            r1.<init>(r2)
            r7.<init>(r1)
            q06.b r1 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r2 = ibb.c.d
            r1.<init>(r2, r0)
            r6.<init>(r7, r1)
            return r6
        L97:
            q06.i r6 = new q06.i
            q06.b r1 = new q06.b
            kotlin.jvm.internal.Intrinsics.h(r7)
            boolean r7 = yh5.b.w(r7)
            if (r7 == 0) goto La7
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r7 = ibb.c.d
            goto La9
        La7:
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r7 = ibb.c.f160140a
        La9:
            r1.<init>(r7, r0)
            r6.<init>(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ml5.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarB = b(deeplink.f173629c);
        mhd.c cVar = new mhd.c(new a(this, z, 0), 22);
        d0VarB.getClass();
        i iVar = new i(d0VarB, cVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
