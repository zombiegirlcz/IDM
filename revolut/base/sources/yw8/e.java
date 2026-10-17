package yw8;

import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import cli.y;
import com.revolut.feature.kyc.impl.screens.chrome_portal.ChromePortalScreenContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import ks8.k;
import oki.h;
import w72.g;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends h implements d {
    public final ChromePortalScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f80.a f317349p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f317350q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f317351r;

    public e(ChromePortalScreenContract$InputData inputData, f80.a uriHelper, k kycChromeTabLauncher) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(kycChromeTabLauncher, "kycChromeTabLauncher");
        this.o = inputData;
        this.f317349p = uriHelper;
        this.f317350q = kycChromeTabLauncher;
        this.f317351r = mra.d.b(this, cli.k.f25028a, new g(5), null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        if (ax8.b.f10895a == ax8.a.TAB_HIDDEN) {
            C2(c.f317348a);
            return;
        }
        k kVar = this.f317350q;
        cu8.d dVar = (cu8.d) kVar;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(this, "callBack");
        dVar.d = this;
        String packageName = CustomTabsClient.getPackageName(dVar.f108829a, null);
        if (packageName == null) {
            packageName = "";
        }
        if (d0.W(packageName)) {
            I2();
            return;
        }
        try {
            Uri uri2 = ((f80.b) this.f317349p).f(this.o.f77856a);
            cu8.d dVar2 = (cu8.d) kVar;
            dVar2.getClass();
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(uri2, "uri");
            cu8.c cVar = new cu8.c(dVar2, uri2);
            dVar2.f108830b = cVar;
            CustomTabsClient.bindCustomTabsService(dVar2.f108829a, packageName, cVar);
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            I2();
        }
    }

    public final void I2() {
        C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, ((f80.b) this.f317349p).f(this.o.f77856a), 0, null, 494));
        C2(b.f317347a);
    }

    @Override // yji.l
    public final void K1() {
        cu8.d dVar = (cu8.d) this.f317350q;
        cu8.c cVar = dVar.f108830b;
        if (cVar == null) {
            return;
        }
        dVar.f108829a.unbindService(cVar);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f317351r;
    }
}
