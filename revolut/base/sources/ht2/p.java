package ht2;

import aw0.u4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4 f155236a;

    public p(u4 headerWithBigTileData) {
        Intrinsics.checkNotNullParameter(headerWithBigTileData, "headerWithBigTileData");
        this.f155236a = headerWithBigTileData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f155236a, ((p) obj2).f155236a);
    }

    public final int hashCode() {
        return this.f155236a.hashCode();
    }
}
