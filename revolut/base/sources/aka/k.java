package aka;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5759a;

    public k(String asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f5759a = asset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f5759a, ((k) obj2).f5759a);
    }

    public final int hashCode() {
        return this.f5759a.hashCode();
    }
}
