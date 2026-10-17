package yw4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f317317a;

    public g(f feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        this.f317317a = feature;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f317317a == ((g) obj2).f317317a;
    }

    public final int hashCode() {
        return this.f317317a.hashCode();
    }
}
