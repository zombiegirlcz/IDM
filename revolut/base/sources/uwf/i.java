package uwf;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swf.a f283661a;

    public i(swf.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f283661a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f283661a, ((i) obj2).f283661a);
    }

    public final int hashCode() {
        return this.f283661a.hashCode();
    }
}
