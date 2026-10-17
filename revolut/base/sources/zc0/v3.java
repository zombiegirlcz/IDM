package zc0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v3 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321143b;

    public v3(String itemId, String str) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f321142a = itemId;
        this.f321143b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj2;
        return Intrinsics.f(this.f321142a, v3Var.f321142a) && Intrinsics.f(this.f321143b, v3Var.f321143b);
    }

    @Override // zc0.d
    public final String getItemId() {
        return this.f321142a;
    }

    public final int hashCode() {
        int iHashCode = this.f321142a.hashCode() * 31;
        String str = this.f321143b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
