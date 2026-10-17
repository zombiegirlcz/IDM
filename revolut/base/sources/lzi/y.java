package lzi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f201012c;

    public y(dj0.d amount, String allocationId, String categoryId) {
        Intrinsics.checkNotNullParameter(allocationId, "allocationId");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f201010a = allocationId;
        this.f201011b = categoryId;
        this.f201012c = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f201010a, yVar.f201010a) && Intrinsics.f(this.f201011b, yVar.f201011b) && Intrinsics.f(this.f201012c, yVar.f201012c);
    }

    public final int hashCode() {
        return this.f201012c.hashCode() + p.a.c(this.f201010a.hashCode() * 31, 31, this.f201011b);
    }
}
