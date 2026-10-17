package dz7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends ori.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx7.g f121277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx7.f f121278c;
    public final g d;

    public m(fx7.g petIssueInteractor, fx7.f petInteractor, g state) {
        Intrinsics.checkNotNullParameter(petIssueInteractor, "petIssueInteractor");
        Intrinsics.checkNotNullParameter(petInteractor, "petInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f121277b = petIssueInteractor;
        this.f121278c = petInteractor;
        this.d = state;
    }
}
