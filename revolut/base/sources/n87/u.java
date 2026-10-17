package n87;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vel.f f213271a;

    public u(vel.f asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f213271a = asset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f213271a, ((u) obj2).f213271a);
    }

    public final int hashCode() {
        return this.f213271a.hashCode();
    }
}
