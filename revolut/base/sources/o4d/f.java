package o4d;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f222204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f222205b;

    public f(e watchlist, List items) {
        Intrinsics.checkNotNullParameter(watchlist, "watchlist");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f222204a = watchlist;
        this.f222205b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f222204a, fVar.f222204a) && Intrinsics.f(this.f222205b, fVar.f222205b);
    }

    public final int hashCode() {
        return this.f222205b.hashCode() + (this.f222204a.hashCode() * 31);
    }
}
