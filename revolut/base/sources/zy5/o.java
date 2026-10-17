package zy5;

import kotlin.jvm.internal.Intrinsics;
import mp.r;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f326386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f326387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f326388c;

    public o(kla.a introToggleResolver, i resolveStoryHelper, gte.a featureToggleInteractor, r productIntroInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(introToggleResolver, "introToggleResolver");
        Intrinsics.checkNotNullParameter(resolveStoryHelper, "resolveStoryHelper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productIntroInteractor, "productIntroInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f326386a = featureToggleInteractor;
        this.f326387b = productIntroInteractor;
        this.f326388c = userInteractor;
    }
}
