package hwi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f156247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156248b;

    public q(int i, String str) {
        this.f156247a = i;
        this.f156248b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f156247a == qVar.f156247a && Intrinsics.f(this.f156248b, qVar.f156248b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f156247a) * 31;
        String str = this.f156248b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
