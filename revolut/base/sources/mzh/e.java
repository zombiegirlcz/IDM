package mzh;

import akd.s;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import ffk.t;
import gld.f0;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mx0.x8;
import mx5.g;
import org.jetbrains.annotations.NotNull;
import tnb.g0;
import yhm.j;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends n implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ryh.a f210769l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gte.a f210770m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final mkd.d f210771n;
    public final g0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e0i.d f210772p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e0i.b f210773q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f210774r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gzh.b f210775s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Lazy f210776t;
    public r0i.a u;

    public e(ryh.a cryptoOrderFlowConfigurationProvider, gte.a featureToggleInteractor, mkd.d slotManagerFeedExtenstion, g0 lastShownCryptoBannerInteractor, e0i.d bannerProvider, e0i.b bannerInfoProvider, t pricingPlanInteractor, gzh.b planUpgradeProvider) {
        Intrinsics.checkNotNullParameter(cryptoOrderFlowConfigurationProvider, "cryptoOrderFlowConfigurationProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(slotManagerFeedExtenstion, "slotManagerFeedExtenstion");
        Intrinsics.checkNotNullParameter(lastShownCryptoBannerInteractor, "lastShownCryptoBannerInteractor");
        Intrinsics.checkNotNullParameter(bannerProvider, "bannerProvider");
        Intrinsics.checkNotNullParameter(bannerInfoProvider, "bannerInfoProvider");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(planUpgradeProvider, "planUpgradeProvider");
        this.f210769l = cryptoOrderFlowConfigurationProvider;
        this.f210770m = featureToggleInteractor;
        this.f210771n = slotManagerFeedExtenstion;
        this.o = lastShownCryptoBannerInteractor;
        this.f210772p = bannerProvider;
        this.f210773q = bannerInfoProvider;
        this.f210774r = pricingPlanInteractor;
        this.f210775s = planUpgradeProvider;
        this.f210776t = j.b(new x8(this, 6));
    }

    @Override // yji.n
    public final void D2() {
        if (((Boolean) this.f210776t.getValue()).booleanValue()) {
            ((f0) this.f210771n).c3(new mkd.a(new SlotContext(s.CRYPTO_TRADE)));
        }
        n.j2(this, rd0.e.b(m70.a.g(this.f210774r.q(), null, null, 3)), null, new g(this, null, 11), 3);
    }
}
