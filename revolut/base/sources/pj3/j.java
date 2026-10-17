package pj3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw0.g f236640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fj3.f f236641b;

    public j(yw0.g errorModel, fj3.f targetTheme) {
        Intrinsics.checkNotNullParameter(errorModel, "errorModel");
        Intrinsics.checkNotNullParameter(targetTheme, "targetTheme");
        this.f236640a = errorModel;
        this.f236641b = targetTheme;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f236640a, jVar.f236640a) && this.f236641b == jVar.f236641b;
    }

    public final int hashCode() {
        return this.f236641b.hashCode() + (this.f236640a.hashCode() * 31);
    }
}
