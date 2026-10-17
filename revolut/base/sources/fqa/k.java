package fqa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f137237a;

    public k(l reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f137237a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f137237a == ((k) obj2).f137237a;
    }

    public final int hashCode() {
        return this.f137237a.hashCode();
    }
}
