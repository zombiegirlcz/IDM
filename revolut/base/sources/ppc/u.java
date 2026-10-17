package ppc;

import kotlin.jvm.internal.Intrinsics;
import pnh.a0;
import vkm.q0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class u implements jlc.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.k f238337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rpc.f f238338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a87.c f238339c;
    public final onh.b d;

    public u(ybl.k tradingAccountsInteractor, rpc.f usRoboFooterDisclaimersWidgetProvider, a87.c eeaRoboFooterDisclaimersWidgetProvider, onh.b sgRoboFooterDisclaimersWidgetProvider) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(usRoboFooterDisclaimersWidgetProvider, "usRoboFooterDisclaimersWidgetProvider");
        Intrinsics.checkNotNullParameter(eeaRoboFooterDisclaimersWidgetProvider, "eeaRoboFooterDisclaimersWidgetProvider");
        Intrinsics.checkNotNullParameter(sgRoboFooterDisclaimersWidgetProvider, "sgRoboFooterDisclaimersWidgetProvider");
        this.f238337a = tradingAccountsInteractor;
        this.f238338b = usRoboFooterDisclaimersWidgetProvider;
        this.f238339c = eeaRoboFooterDisclaimersWidgetProvider;
        this.d = sgRoboFooterDisclaimersWidgetProvider;
    }

    public final q0 a(jlc.t forScreen) {
        Intrinsics.checkNotNullParameter(forScreen, "forScreen");
        return rd0.e.n(boh.f.e(boh.f.e(nim.a.v(nim.a.v(ybl.k.k(this.f238337a, null, null, null, 7), new a0(21)), new a0(22)), new pp5.d(this, 4)), new pj3.b(this, forScreen, 12)), h0.f322473a);
    }
}
