package ayf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements exf.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y80.a f11180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w39.b f11181b;

    public r(y80.a permissionProvider, w39.b locationInteractor) {
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        this.f11180a = permissionProvider;
        this.f11181b = locationInteractor;
    }
}
