package hyl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f156910a;

    public e(List markers) {
        Intrinsics.checkNotNullParameter(markers, "markers");
        this.f156910a = markers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f156910a, ((e) obj2).f156910a);
    }

    public final int hashCode() {
        return this.f156910a.hashCode();
    }
}
