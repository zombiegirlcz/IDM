package wy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f301080a;

    public k(n statusPopup) {
        Intrinsics.checkNotNullParameter(statusPopup, "statusPopup");
        this.f301080a = statusPopup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f301080a, ((k) obj2).f301080a);
    }

    public final int hashCode() {
        return this.f301080a.hashCode();
    }
}
