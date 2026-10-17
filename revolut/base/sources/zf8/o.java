package zf8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.b f321910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f321911b;

    public o(wsg.b newWalletsInteractor, gte.a featureToggleInteractor, b basePocketProvider) {
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(basePocketProvider, "basePocketProvider");
        this.f321910a = newWalletsInteractor;
        this.f321911b = featureToggleInteractor;
    }
}
