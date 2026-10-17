package maa;

import g8a.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f203982a;

    public k(t type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f203982a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f203982a == ((k) obj2).f203982a;
    }

    public final int hashCode() {
        return this.f203982a.hashCode();
    }
}
