package n2j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k18.c f211559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g26.b f211560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f211561c;

    public c(k18.c deFiAccountsInteractor, g26.b deFiAssetDetailsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(deFiAccountsInteractor, "deFiAccountsInteractor");
        Intrinsics.checkNotNullParameter(deFiAssetDetailsInteractor, "deFiAssetDetailsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f211559a = deFiAccountsInteractor;
        this.f211560b = deFiAssetDetailsInteractor;
        this.f211561c = featureToggleInteractor;
    }
}
