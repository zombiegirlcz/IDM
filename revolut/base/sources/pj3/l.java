package pj3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw0.j f236643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fj3.f f236644b;

    public l(yw0.j loadingModel, fj3.f targetTheme) {
        Intrinsics.checkNotNullParameter(loadingModel, "loadingModel");
        Intrinsics.checkNotNullParameter(targetTheme, "targetTheme");
        this.f236643a = loadingModel;
        this.f236644b = targetTheme;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f236643a, lVar.f236643a) && this.f236644b == lVar.f236644b;
    }

    public final int hashCode() {
        return this.f236644b.hashCode() + (this.f236643a.hashCode() * 31);
    }
}
