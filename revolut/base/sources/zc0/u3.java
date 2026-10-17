package zc0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u3 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f321137b;

    public u3(String itemId, boolean z) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f321136a = itemId;
        this.f321137b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj2;
        return Intrinsics.f(this.f321136a, u3Var.f321136a) && this.f321137b == u3Var.f321137b;
    }

    @Override // zc0.d
    public final String getItemId() {
        return this.f321136a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f321137b) + (this.f321136a.hashCode() * 31);
    }
}
