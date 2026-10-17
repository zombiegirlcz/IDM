package n5c;

import ang.f;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExternalAppDestination;
import gim.i;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends j5c.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y70.a f212576l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o5c.a f212577m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x f212578n;
    public final zja.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f212579p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ryc.a f212580q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z70.a f212581r;

    public e(y70.a appInstalledChecker, o5c.a cryptoExchangeEligibilityInteractor, x deeplinkHandler, zja.a productArticleInteractor, f userInteractor, ryc.a inlineInstaller, z70.a contextProvider) {
        Intrinsics.checkNotNullParameter(appInstalledChecker, "appInstalledChecker");
        Intrinsics.checkNotNullParameter(cryptoExchangeEligibilityInteractor, "cryptoExchangeEligibilityInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(inlineInstaller, "inlineInstaller");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f212576l = appInstalledChecker;
        this.f212577m = cryptoExchangeEligibilityInteractor;
        this.f212578n = deeplinkHandler;
        this.o = productArticleInteractor;
        this.f212579p = userInteractor;
        this.f212580q = inlineInstaller;
        this.f212581r = contextProvider;
    }

    @Override // j5c.a
    public final boolean Z2() {
        return this.f212576l.a("com.revolut.revolutx");
    }

    @Override // j5c.a
    public final Object b3(boolean z, i iVar) {
        if (z) {
            Object objD3 = d3(iVar);
            return objD3 == fim.a.COROUTINE_SUSPENDED ? objD3 : Unit.f186387a;
        }
        Object objY2 = Y2(iVar, new mtd.e(this, null, 5));
        return objY2 == fim.a.COROUTINE_SUSPENDED ? objY2 : Unit.f186387a;
    }

    @Override // j5c.a
    public final void c3() {
        A2(new BridgeDestination(new ActivityNavigateCommand(new ExternalAppDestination("com.revolut.revolutx"), null, null, null, 268435456, null, null, null, null, false, 1006)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(gim.i r7) {
        /*
            r6 = this;
            ryc.a r0 = r6.f212580q
            boolean r0 = r0.e()
            if (r0 == 0) goto L3c
            z70.a r0 = r6.f212581r
            android.content.Context r0 = r0.getContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r1 = "getPackageManager(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            ui0.a r1 = ui0.b.Companion
            ui0.b r1 = cj9.c.k(r1)
            boolean r0 = ryc.a.d(r0, r1)
            if (r0 != 0) goto L3c
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig r0 = new com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig
            yhi.b r1 = yhi.b.POPUP
            r2 = 0
            r3 = 12
            com.revolut.feature.revolut_x_promo.api.navigation.destinations.RevolutXInAppInstallDestination r4 = com.revolut.feature.revolut_x_promo.api.navigation.destinations.RevolutXInAppInstallDestination.f84264a
            r0.<init>(r4, r1, r2, r3)
            com.revolut.retail.core.navigation.FeatureCommand r0 = gc0.c.f(r0)
            r7.<init>(r0)
            r6.A2(r7)
            goto L45
        L3c:
            boolean r0 = r6.Z2()
            if (r0 == 0) goto L48
            r6.c3()
        L45:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L48:
            r3 = 0
            r5 = 6
            wli.x r0 = r6.f212578n
            java.lang.String r1 = "revolut://app/crypto-exchange/open-exchange"
            r2 = 0
            r4 = r7
            java.lang.Object r7 = lg0.b.x1(r0, r1, r2, r3, r4, r5)
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            if (r7 != r0) goto L59
            return r7
        L59:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n5c.e.d3(gim.i):java.lang.Object");
    }
}
