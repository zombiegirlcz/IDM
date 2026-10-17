package wp4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f299075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f299076b;

    public l(boolean z, String str) {
        this.f299075a = z;
        this.f299076b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f299075a == lVar.f299075a && Intrinsics.f(this.f299076b, lVar.f299076b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f299075a) * 31;
        String str = this.f299076b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
