package lkd;

import ekd.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f196361a;

    public h(n0 tile) {
        Intrinsics.checkNotNullParameter(tile, "tile");
        this.f196361a = tile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f196361a, ((h) obj2).f196361a);
    }

    public final int hashCode() {
        return this.f196361a.hashCode();
    }
}
