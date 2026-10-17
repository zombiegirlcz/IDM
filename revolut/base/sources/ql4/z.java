package ql4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f247199a;

    public z(o0 reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f247199a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && this.f247199a == ((z) obj2).f247199a;
    }

    public final int hashCode() {
        return this.f247199a.hashCode();
    }
}
