package eu4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f129504a;

    public e(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f129504a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f129504a, ((e) obj2).f129504a);
    }

    @Override // eu4.f
    public final dj0.d f() {
        return this.f129504a;
    }

    public final int hashCode() {
        return this.f129504a.hashCode();
    }
}
