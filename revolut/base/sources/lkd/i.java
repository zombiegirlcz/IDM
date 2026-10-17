package lkd;

import fkd.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f196362a;

    public i(w0 tile) {
        Intrinsics.checkNotNullParameter(tile, "tile");
        this.f196362a = tile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f196362a, ((i) obj2).f196362a);
    }

    public final int hashCode() {
        return this.f196362a.hashCode();
    }
}
