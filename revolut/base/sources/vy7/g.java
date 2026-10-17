package vy7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends ori.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx7.f f293249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx7.i f293250c;
    public final fx7.k d;
    public final d e;

    public g(fx7.f petInteractor, fx7.i petNotificationInteractor, fx7.k petPromotionInteractor, d state) {
        Intrinsics.checkNotNullParameter(petInteractor, "petInteractor");
        Intrinsics.checkNotNullParameter(petNotificationInteractor, "petNotificationInteractor");
        Intrinsics.checkNotNullParameter(petPromotionInteractor, "petPromotionInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f293249b = petInteractor;
        this.f293250c = petNotificationInteractor;
        this.d = petPromotionInteractor;
        this.e = state;
    }
}
