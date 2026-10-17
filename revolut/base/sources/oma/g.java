package oma;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f226781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f226782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bma.a f226783c;
    public final mt8.d d;

    public g(d state, ang.f userInteractor, bma.a behaviourInteractor, mt8.d kycInteractor) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(behaviourInteractor, "behaviourInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        this.f226781a = state;
        this.f226782b = userInteractor;
        this.f226783c = behaviourInteractor;
        this.d = kycInteractor;
    }
}
