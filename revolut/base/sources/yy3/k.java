package yy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f317782a;

    public k(n application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f317782a = application;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f317782a == ((k) obj2).f317782a;
    }

    public final int hashCode() {
        return this.f317782a.hashCode();
    }
}
