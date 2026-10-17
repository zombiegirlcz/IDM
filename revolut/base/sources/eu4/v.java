package eu4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f129520a;

    public v(dj0.d minPayment) {
        Intrinsics.checkNotNullParameter(minPayment, "minPayment");
        this.f129520a = minPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f129520a, ((v) obj2).f129520a);
    }

    public final int hashCode() {
        return this.f129520a.hashCode();
    }
}
