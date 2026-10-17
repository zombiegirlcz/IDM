package yzg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f318103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f318104b;

    public b(dj0.d totalAmount, dj0.d completedAmount) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(completedAmount, "completedAmount");
        this.f318103a = totalAmount;
        this.f318104b = completedAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f318103a, bVar.f318103a) && Intrinsics.f(this.f318104b, bVar.f318104b);
    }

    public final int hashCode() {
        return this.f318104b.hashCode() + (this.f318103a.hashCode() * 31);
    }
}
