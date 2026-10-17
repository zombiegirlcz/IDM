package psd;

import efm.r;
import frd.k;
import java.util.List;
import ji5.m;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import wsg.n;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements k {

    @NotNull
    public static final i Companion = new i();
    public static final List i = v.k(io3.k.ACTIVE, io3.k.INACTIVE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f239478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mu5.f f239479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f239480c;
    public final ppk.f d;
    public final xoj.a e;
    public final ur5.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f239481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f239482h;

    public j(n walletInteractor, mu5.f cryptoInvestmentsInteractor, g cryptoNetWorthProductMapper, m cryptoPreferencesInteractor, ppk.f ratesInteractor, xoj.a featuresInteractor, ur5.c revolutXFiatBalanceInteractor, gte.a featureToggleInteractor, d cryptoFuturesNetWorthProductProvider) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(cryptoInvestmentsInteractor, "cryptoInvestmentsInteractor");
        Intrinsics.checkNotNullParameter(cryptoNetWorthProductMapper, "cryptoNetWorthProductMapper");
        Intrinsics.checkNotNullParameter(cryptoPreferencesInteractor, "cryptoPreferencesInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(revolutXFiatBalanceInteractor, "revolutXFiatBalanceInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cryptoFuturesNetWorthProductProvider, "cryptoFuturesNetWorthProductProvider");
        this.f239478a = walletInteractor;
        this.f239479b = cryptoInvestmentsInteractor;
        this.f239480c = cryptoPreferencesInteractor;
        this.d = ratesInteractor;
        this.e = featuresInteractor;
        this.f = revolutXFiatBalanceInteractor;
        this.f239481g = featureToggleInteractor;
        this.f239482h = cryptoFuturesNetWorthProductProvider;
    }

    @Override // frd.k
    public final Flow b() {
        r map = ((cpj.b) this.e).j(yoj.c.CRYPTO, w4l.h.f294642c).map(new prl.n(3, new pqg.v(23)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return k.a(this, rd0.e.b(map), new pgk.f(this, 19));
    }
}
