package om4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp4.t f226718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k3 f226719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f226720c;

    public v0(dp4.t repository, k3 creditCardPreferencesInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(creditCardPreferencesInteractor, "creditCardPreferencesInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f226718a = repository;
        this.f226719b = creditCardPreferencesInteractor;
        this.f226720c = featureToggleInteractor;
    }
}
