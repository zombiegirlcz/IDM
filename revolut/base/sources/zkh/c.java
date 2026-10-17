package zkh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vel.f f322983a;

    public c(vel.f asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f322983a = asset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f322983a, ((c) obj2).f322983a);
    }

    public final int hashCode() {
        return this.f322983a.hashCode();
    }
}
