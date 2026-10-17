package zsi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324932a;

    public d(String passId) {
        Intrinsics.checkNotNullParameter(passId, "passId");
        this.f324932a = passId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f324932a, ((d) obj2).f324932a);
    }

    public final int hashCode() {
        return this.f324932a.hashCode();
    }
}
