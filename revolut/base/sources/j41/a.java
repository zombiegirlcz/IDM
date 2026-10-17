package j41;

import com.revolut.analytics.tracking.v3.l;
import g41.b;
import grl.wb;
import i41.c;
import kotlin.jvm.internal.Intrinsics;
import no.j2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f171277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2 f171278b;

    public a(c environmentCheckProxy, j2 settingsEventsTracker) {
        Intrinsics.checkNotNullParameter(environmentCheckProxy, "environmentCheckProxy");
        Intrinsics.checkNotNullParameter(settingsEventsTracker, "settingsEventsTracker");
        this.f171277a = environmentCheckProxy;
        this.f171278b = settingsEventsTracker;
    }

    public final void a() {
        h41.b bVarA = this.f171277a.a();
        wb wbVar = wb.RootDetection;
        boolean z = bVarA.k;
        String str = bVarA.f149276a;
        l lVar = (l) this.f171278b;
        lVar.q3(wbVar, z, null, str, "16.1.87");
        lVar.q3(wb.CustomFirmware, bVarA.f, null, bVarA.f149276a, "16.1.87");
        lVar.q3(wb.CustomOS, bVarA.f149279g, null, bVarA.f149276a, "16.1.87");
        lVar.q3(wb.CustomKeys, bVarA.f149280h, null, bVarA.f149276a, "16.1.87");
        lVar.q3(wb.UnlockedBootloader, bVarA.i, null, bVarA.f149276a, "16.1.87");
        lVar.q3(wb.KaTampered, bVarA.f149283m, null, bVarA.f149276a, "16.1.87");
        lVar.q3(wb.KaInvalidCertChain, bVarA.f149284n, null, bVarA.f149276a, "16.1.87");
        lVar.q3(wb.KaUntrustedRootKey, bVarA.o, null, bVarA.f149276a, "16.1.87");
        lVar.q3(wb.KaRevokedCert, bVarA.f149285p, null, bVarA.f149276a, "16.1.87");
        lVar.q3(wb.DeveloperMode, bVarA.f149282l, null, null, null);
    }
}
