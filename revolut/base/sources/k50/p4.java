package k50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p4 implements r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v4 f181209a;

    public p4(v4 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f181209a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p4) && Intrinsics.f(this.f181209a, ((p4) obj2).f181209a);
    }

    public final int hashCode() {
        return this.f181209a.hashCode();
    }
}
