package zm2;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final em2.e f323326a;

    public f(em2.e background) {
        Intrinsics.checkNotNullParameter(background, "background");
        this.f323326a = background;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f323326a, ((f) obj2).f323326a);
    }

    public final int hashCode() {
        return this.f323326a.hashCode();
    }
}
