package wk2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yv0.k f298222a;

    public t(yv0.k mapMarker) {
        Intrinsics.checkNotNullParameter(mapMarker, "mapMarker");
        this.f298222a = mapMarker;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f298222a, ((t) obj2).f298222a);
    }

    public final int hashCode() {
        return this.f298222a.hashCode();
    }
}
