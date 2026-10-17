package mgh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3h.f f205279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f205280b;

    public e(e3h.f historicalChartMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(historicalChartMapper, "historicalChartMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f205279a = historicalChartMapper;
        this.f205280b = featureToggleInteractor;
    }
}
