package ya1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f311890a;

    public d(k state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f311890a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f311890a == ((d) obj2).f311890a;
    }

    public final int hashCode() {
        return this.f311890a.hashCode();
    }
}
