package y7k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f311582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f311583b;

    public w(dj0.d money, String str) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f311582a = money;
        this.f311583b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f311582a, wVar.f311582a) && Intrinsics.f(this.f311583b, wVar.f311583b);
    }

    public final int hashCode() {
        int iHashCode = this.f311582a.hashCode() * 31;
        String str = this.f311583b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
