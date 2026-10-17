package ybh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f312317a;

    public k(dj0.d missingAmount) {
        Intrinsics.checkNotNullParameter(missingAmount, "missingAmount");
        this.f312317a = missingAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f312317a, ((k) obj2).f312317a);
    }

    public final int hashCode() {
        return this.f312317a.hashCode();
    }
}
