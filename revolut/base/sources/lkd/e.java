package lkd;

import ckd.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f196358a;

    public e(o tile) {
        Intrinsics.checkNotNullParameter(tile, "tile");
        this.f196358a = tile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f196358a, ((e) obj2).f196358a);
    }

    public final int hashCode() {
        return this.f196358a.hashCode();
    }
}
