package ppk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final xi0.b d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f238618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xh5.a f238619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tj3.a f238620c;

    static {
        xi0.b.Companion.getClass();
        d = xi0.b.i;
    }

    public c(fk3.a configurationInteractor, xh5.a cryptoFeatureEnabledInteractor, tj3.a commodityFeatureEnabledInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(commodityFeatureEnabledInteractor, "commodityFeatureEnabledInteractor");
        this.f238618a = configurationInteractor;
        this.f238619b = cryptoFeatureEnabledInteractor;
        this.f238620c = commodityFeatureEnabledInteractor;
    }
}
