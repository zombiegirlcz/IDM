package o9h;

import aah.m;
import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import com.revolut.shared.feature.wealth.models.config.Links;
import java.util.List;
import k1h.j;
import kbh.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import z0h.s;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f223274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kbh.a f223275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f223276c;

    public a(h tradingFooterDisclosuresFactory, kbh.a roboFooterDisclaimerFactory, m wealthDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(tradingFooterDisclosuresFactory, "tradingFooterDisclosuresFactory");
        Intrinsics.checkNotNullParameter(roboFooterDisclaimerFactory, "roboFooterDisclaimerFactory");
        Intrinsics.checkNotNullParameter(wealthDisclaimerMapper, "wealthDisclaimerMapper");
        this.f223274a = tradingFooterDisclosuresFactory;
        this.f223275b = roboFooterDisclaimerFactory;
        this.f223276c = wealthDisclaimerMapper;
    }

    public final List a(n0h.b delegateData, p0h.f disclaimer) {
        k1h.f bVar;
        Intrinsics.checkNotNullParameter(delegateData, "delegateData");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        if (disclaimer instanceof p0h.c) {
            p0h.c cVar = (p0h.c) disclaimer;
            if (cVar.equals(p0h.a.f231540a)) {
                Links links = delegateData.f211041a;
                Intrinsics.checkNotNullParameter(links, "<this>");
                bVar = new k1h.a(new j(links.f105098p));
            } else {
                if (!cVar.equals(p0h.b.f231541a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Links links2 = delegateData.f211041a;
                Intrinsics.checkNotNullParameter(links2, "<this>");
                bVar = new k1h.b(new j(links2.f105098p));
            }
            return this.f223275b.b(bVar);
        }
        boolean z = disclaimer instanceof p0h.e;
        m mVar = this.f223276c;
        if (!z) {
            if (!(disclaimer instanceof p0h.d)) {
                throw new NoWhenBranchMatchedException();
            }
            p0h.d dVar = (p0h.d) disclaimer;
            return mVar.c(u.c(new WealthDisclaimersContract$Disclaimer$Investment.Stats(delegateData.f211042b, delegateData.f211041a, dVar.f231542a, dVar.f231543b)), delegateData.f211042b);
        }
        z zVar = ((p0h.e) disclaimer).f231544a;
        if (zVar == z.CFD) {
            return mVar.c(u.c(new s(delegateData.f211041a)), delegateData.f211042b);
        }
        return this.f223274a.d(delegateData.f211041a, delegateData.f211042b, zVar, null);
    }
}
