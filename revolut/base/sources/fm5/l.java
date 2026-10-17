package fm5;

import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends oki.h implements c {
    public final gm5.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jl5.a f136029p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tl5.b f136030q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ow5.b f136031r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f136032s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f136033t;
    public a2 u;
    public a2 v;

    public l(gm5.b articleAndCryptoOnboardingExtension, jl5.a cryptoSpareChangeDialogsProvider, tl5.b cryptoSpareChangeScreensProvider, ow5.b cryptoIsraelExpansionChecker, n stateMapper) {
        Intrinsics.checkNotNullParameter(articleAndCryptoOnboardingExtension, "articleAndCryptoOnboardingExtension");
        Intrinsics.checkNotNullParameter(cryptoSpareChangeDialogsProvider, "cryptoSpareChangeDialogsProvider");
        Intrinsics.checkNotNullParameter(cryptoSpareChangeScreensProvider, "cryptoSpareChangeScreensProvider");
        Intrinsics.checkNotNullParameter(cryptoIsraelExpansionChecker, "cryptoIsraelExpansionChecker");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = articleAndCryptoOnboardingExtension;
        this.f136029p = cryptoSpareChangeDialogsProvider;
        this.f136030q = cryptoSpareChangeScreensProvider;
        this.f136031r = cryptoIsraelExpansionChecker;
        this.f136032s = mra.d.b(this, new d(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new ewa.d(this, null, 27), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f136032s;
    }
}
