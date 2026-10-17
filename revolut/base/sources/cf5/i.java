package cf5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ttd.a f23553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final he2.b f23554b;

    public i(ttd.a interestRateFormatter, a currencyAccentColorMapper, he2.b assetDetailsPerformanceMapper) {
        Intrinsics.checkNotNullParameter(interestRateFormatter, "interestRateFormatter");
        Intrinsics.checkNotNullParameter(currencyAccentColorMapper, "currencyAccentColorMapper");
        Intrinsics.checkNotNullParameter(assetDetailsPerformanceMapper, "assetDetailsPerformanceMapper");
        this.f23553a = interestRateFormatter;
        this.f23554b = assetDetailsPerformanceMapper;
    }
}
