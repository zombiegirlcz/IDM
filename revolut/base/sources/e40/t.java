package e40;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be7.a f122365a;

    public t(be7.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f122365a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && this.f122365a == ((t) obj2).f122365a;
    }

    public final int hashCode() {
        return this.f122365a.hashCode();
    }
}
