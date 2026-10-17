package xmc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class u {

    @NotNull
    private static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f307151a;

    public u(t documentGroupMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(documentGroupMapper, "documentGroupMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f307151a = featureToggleInteractor;
    }
}
