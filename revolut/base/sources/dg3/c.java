package dg3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f114573a;

    public c(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f114573a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f114573a, ((c) obj2).f114573a);
    }

    public final int hashCode() {
        return this.f114573a.hashCode();
    }
}
