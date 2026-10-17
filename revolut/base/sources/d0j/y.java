package d0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f110444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110445b;

    public y(z type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f110444a = type;
        this.f110445b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f110444a == yVar.f110444a && Intrinsics.f(this.f110445b, yVar.f110445b);
    }

    public final int hashCode() {
        int iHashCode = this.f110444a.hashCode() * 31;
        String str = this.f110445b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
