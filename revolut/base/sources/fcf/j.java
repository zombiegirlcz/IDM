package fcf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f133739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f133740b;

    public j(int i, String str) {
        this.f133739a = i;
        this.f133740b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f133739a == jVar.f133739a && Intrinsics.f(this.f133740b, jVar.f133740b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f133739a) * 31;
        String str = this.f133740b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
