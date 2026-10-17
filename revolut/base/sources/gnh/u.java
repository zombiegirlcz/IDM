package gnh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final knh.h f145021a;

    public u(knh.h assetListSource) {
        Intrinsics.checkNotNullParameter(assetListSource, "assetListSource");
        this.f145021a = assetListSource;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f145021a, ((u) obj2).f145021a);
    }

    public final int hashCode() {
        return this.f145021a.hashCode();
    }
}
