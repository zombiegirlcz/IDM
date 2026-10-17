package jx2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f179051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f179052b;

    public c(d cardDesignButtonNameMapper, n lockedCardDesignButtonTextMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(cardDesignButtonNameMapper, "cardDesignButtonNameMapper");
        Intrinsics.checkNotNullParameter(lockedCardDesignButtonTextMapper, "lockedCardDesignButtonTextMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f179051a = lockedCardDesignButtonTextMapper;
        this.f179052b = featureToggleInteractor;
    }
}
