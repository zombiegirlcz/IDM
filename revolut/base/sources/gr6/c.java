package gr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4l.k f145941a;

    public c(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        this.f145941a = loadingStrategy;
    }

    @Override // gr6.d
    public final w4l.k a() {
        return this.f145941a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f145941a, ((c) obj2).f145941a);
    }

    public final int hashCode() {
        return this.f145941a.hashCode();
    }
}
