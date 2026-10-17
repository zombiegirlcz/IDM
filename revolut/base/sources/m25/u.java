package m25;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class u {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f201718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f201719b;

    public u(a actionMapper, r creditCardEmptyStateProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(actionMapper, "actionMapper");
        Intrinsics.checkNotNullParameter(creditCardEmptyStateProvider, "creditCardEmptyStateProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f201718a = creditCardEmptyStateProvider;
        this.f201719b = featureToggleInteractor;
    }
}
