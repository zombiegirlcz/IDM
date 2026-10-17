package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o40 implements q40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n40 f165621a;

    public o40(n40 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f165621a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o40) && this.f165621a == ((o40) obj2).f165621a;
    }

    public final int hashCode() {
        return this.f165621a.hashCode();
    }

    public o40(boolean z) {
        this(z ? n40.CURRENT : n40.PAST);
    }
}
