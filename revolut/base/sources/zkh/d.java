package zkh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vel.f f322985a;

    public d(vel.e asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f322985a = asset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f322985a, ((d) obj2).f322985a);
    }

    public final int hashCode() {
        return this.f322985a.hashCode();
    }
}
