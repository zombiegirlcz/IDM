package o03;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wy2.d f221106a;

    public c(wy2.d reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f221106a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f221106a == ((c) obj2).f221106a;
    }

    public final int hashCode() {
        return this.f221106a.hashCode();
    }
}
