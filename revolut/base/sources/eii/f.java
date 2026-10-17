package eii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.l f126652a;

    public f(lw0.l item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f126652a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f126652a, ((f) obj2).f126652a);
    }

    public final int hashCode() {
        return this.f126652a.hashCode();
    }
}
