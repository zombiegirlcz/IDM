package m3d;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wsg.n;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements ifd.e {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f202369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final td0.b f202370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t70.b f202371c;
    public final z2d.c d;
    public final n e;
    public final ppk.f f;

    public f(fk3.a configurationInteractor, td0.b currencySetsProvider, t70.b currenciesLocalization, z2d.c assetTypesInteractor, n walletInteractor, ppk.f ratesInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(currencySetsProvider, "currencySetsProvider");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        Intrinsics.checkNotNullParameter(assetTypesInteractor, "assetTypesInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f202369a = configurationInteractor;
        this.f202370b = currencySetsProvider;
        this.f202371c = currenciesLocalization;
        this.d = assetTypesInteractor;
        this.e = walletInteractor;
        this.f = ratesInteractor;
    }
}
