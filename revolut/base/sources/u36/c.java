package u36;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t36.c f276782a;

    public c(t36.c asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f276782a = asset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f276782a, ((c) obj2).f276782a);
    }

    public final int hashCode() {
        return this.f276782a.hashCode();
    }
}
