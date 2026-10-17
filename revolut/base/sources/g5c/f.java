package g5c;

import android.content.pm.PackageManager;
import bjl.q0;
import g48.j;
import g48.k;
import ip0.v7;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.h;
import skm.p0;
import sri.m;
import te0.w;
import wp5.y;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements d5c.b {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.a f140744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f140745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e5c.a f140746c;
    public final f80.a d;
    public final q0 e;
    public final ryc.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z70.a f140747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qka.c f140748h;

    public f(y70.a appInstalledChecker, m navigator, e5c.a revolutXPromoRepository, f80.a uriHelper, q0 appLinkInteractor, ryc.a inlineInstaller, z70.a contextProvider, qka.c productArticleNavigationProvider) {
        Intrinsics.checkNotNullParameter(appInstalledChecker, "appInstalledChecker");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(revolutXPromoRepository, "revolutXPromoRepository");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(appLinkInteractor, "appLinkInteractor");
        Intrinsics.checkNotNullParameter(inlineInstaller, "inlineInstaller");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        this.f140744a = appInstalledChecker;
        this.f140745b = navigator;
        this.f140746c = revolutXPromoRepository;
        this.d = uriHelper;
        this.e = appLinkInteractor;
        this.f = inlineInstaller;
        this.f140747g = contextProvider;
        this.f140748h = productArticleNavigationProvider;
    }

    public static String g(jf0.c cVar) throws IOException {
        String strK0 = d0.k0(d0.V(cVar.h(), 2), "/", null, null, 0, null, 62);
        if (!c5c.a.f21550a.contains(strK0)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Unknown revolut x path: ", strK0, ". Please add to known paths in RevolutXDeeplinkConstants"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        return j6.a.q("revolut-revolutx://app/", strK0);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "crypto-exchange");
    }

    public final boolean b() {
        if (!this.f.e()) {
            return false;
        }
        PackageManager packageManager = this.f140747g.getContext().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        return !ryc.a.d(packageManager, cj9.c.k(ui0.b.Companion));
    }

    public final efm.b c(boolean z) {
        if (b()) {
            h hVar = new h(new a(this, 1), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return ue0.e.v(hVar);
        }
        if (!this.f140744a.a("com.revolut.revolutx")) {
            return v7.x(new ufm.f(w.o0(p0.f264003c, new c(this, null, 0)), new k(13, new j(this, z ? "https://exchange.revolut.com/applink?challenge_id=" : "https://exchange.revolut.codes/applink?challenge_id=", 10)), 3), "ignoreElement(...)");
        }
        h hVar2 = new h(new a(this, 0), 2);
        Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
        return ue0.e.v(hVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(boolean r19, gim.c r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof g5c.e
            if (r2 == 0) goto L17
            r2 = r1
            g5c.e r2 = (g5c.e) r2
            int r3 = r2.f140743x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f140743x = r3
            goto L1c
        L17:
            g5c.e r2 = new g5c.e
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f140743x
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L36
            if (r4 != r6) goto L2e
            boolean r2 = r2.u
            yhm.o.b(r1)
            goto L8d
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            yhm.o.b(r1)
            boolean r1 = r0.b()
            if (r1 == 0) goto L47
            q06.h r1 = new q06.h
            com.revolut.feature.revolut_x_promo.api.navigation.destinations.RevolutXInAppInstallDestination r2 = com.revolut.feature.revolut_x_promo.api.navigation.destinations.RevolutXInAppInstallDestination.f84264a
            r1.<init>(r2, r5)
            return r1
        L47:
            y70.a r1 = r0.f140744a
            java.lang.String r4 = "com.revolut.revolutx"
            boolean r1 = r1.a(r4)
            if (r1 == 0) goto L73
            q06.h r1 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r2 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.ActivityNavigateCommand r6 = new com.revolut.retail.core.navigation.ActivityNavigateCommand
            com.revolut.retail.core.navigation.ExternalAppDestination r7 = new com.revolut.retail.core.navigation.ExternalAppDestination
            r7.<init>(r4)
            r16 = 0
            r17 = 1006(0x3ee, float:1.41E-42)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 268435456(0x10000000, float:2.524355E-29)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2.<init>(r6)
            r1.<init>(r2, r5)
            return r1
        L73:
            kotlinx.coroutines.d r1 = skm.p0.f264003c
            g5c.c r4 = new g5c.c
            r7 = 0
            r4.<init>(r0, r5, r7)
            ufm.b r1 = te0.w.o0(r1, r4)
            r4 = r19
            r2.u = r4
            r2.f140743x = r6
            java.lang.Object r1 = nim.a.b(r1, r2)
            if (r1 != r3) goto L8c
            return r3
        L8c:
            r2 = r4
        L8d:
            java.lang.String r1 = (java.lang.String) r1
            q06.h r3 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r4 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.BrowserCommand r6 = new com.revolut.retail.core.navigation.BrowserCommand
            if (r2 == 0) goto L9a
            java.lang.String r2 = "https://exchange.revolut.com/applink?challenge_id="
            goto L9c
        L9a:
            java.lang.String r2 = "https://exchange.revolut.codes/applink?challenge_id="
        L9c:
            java.lang.String r1 = a0.d.r(r2, r1)
            f80.a r2 = r0.d
            f80.b r2 = (f80.b) r2
            android.net.Uri r1 = r2.f(r1)
            r6.<init>(r1)
            r4.<init>(r6)
            r3.<init>(r4, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g5c.f.d(boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
    
        if ((r0 == r4 ? r0 : kotlin.Unit.f186387a) == r4) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r23, kotlin.coroutines.Continuation r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5c.f.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    @Override // jf0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.d0 f(jf0.c r3, boolean r4) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5c.f.f(jf0.c, boolean):efm.d0");
    }
}
