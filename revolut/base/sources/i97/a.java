package i97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b97.g f159582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f159583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p56.a f159584c;
    public final ef0.b d;

    public a(b97.g repository, gte.a featureToggleInteractor, p56.a secretPhraseMatcher, ef0.b currentTimeProvider) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(secretPhraseMatcher, "secretPhraseMatcher");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f159582a = repository;
        this.f159583b = featureToggleInteractor;
        this.f159584c = secretPhraseMatcher;
        this.d = currentTimeProvider;
    }
}
