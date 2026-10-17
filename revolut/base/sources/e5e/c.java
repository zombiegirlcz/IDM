package e5e;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3h.d f122811a;

    public c(k3h.d ratingsState) {
        Intrinsics.checkNotNullParameter(ratingsState, "ratingsState");
        this.f122811a = ratingsState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f122811a, ((c) obj2).f122811a);
    }

    public final int hashCode() {
        return this.f122811a.hashCode();
    }
}
