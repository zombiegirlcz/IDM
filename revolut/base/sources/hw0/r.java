package hw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f156018a;

    public r() {
        this(f0.f322471a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f156018a, ((r) obj2).f156018a);
    }

    public final int hashCode() {
        return this.f156018a.hashCode();
    }

    public r(List segments) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.f156018a = segments;
    }
}
