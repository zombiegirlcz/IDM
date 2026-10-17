package zc0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y3 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f321176b;

    public y3(String itemId, boolean z) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f321175a = itemId;
        this.f321176b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj2;
        return Intrinsics.f(this.f321175a, y3Var.f321175a) && this.f321176b == y3Var.f321176b;
    }

    @Override // zc0.d
    public final String getItemId() {
        return this.f321175a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f321176b) + (this.f321175a.hashCode() * 31);
    }
}
