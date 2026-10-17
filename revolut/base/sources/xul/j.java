package xul;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f309121a;

    public j(dj0.d originalAmount) {
        Intrinsics.checkNotNullParameter(originalAmount, "originalAmount");
        this.f309121a = originalAmount;
    }

    @Override // xul.k
    public final dj0.d e0() {
        return this.f309121a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f309121a, ((j) obj2).f309121a);
    }

    public final int hashCode() {
        return this.f309121a.hashCode();
    }
}
