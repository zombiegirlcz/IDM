package cq6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f108019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ttd.a f108020b;

    public n(gte.a featureToggleInteractor, ttd.a interestRateFormatter) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(interestRateFormatter, "interestRateFormatter");
        this.f108019a = featureToggleInteractor;
        this.f108020b = interestRateFormatter;
    }
}
