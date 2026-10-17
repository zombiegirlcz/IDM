package doc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.r f116526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f116527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ael.z f116528c;

    public y(r10.r mapperProvider, gte.a featureToggleInteractor, ael.z performanceCalculator) {
        Intrinsics.checkNotNullParameter(mapperProvider, "mapperProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(performanceCalculator, "performanceCalculator");
        this.f116526a = mapperProvider;
        this.f116527b = featureToggleInteractor;
        this.f116528c = performanceCalculator;
    }
}
