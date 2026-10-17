package yna;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yna.a;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends a.AbstractC1757a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f315374a;

    public t(List tiles) {
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        this.f315374a = tiles;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f315374a, ((t) obj2).f315374a);
    }

    public final int hashCode() {
        return this.f315374a.hashCode();
    }
}
