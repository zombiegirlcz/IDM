package d2g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lyf.b f110819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110820b;

    public r(lyf.b category, String str) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.f110819a = category;
        this.f110820b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f110819a, rVar.f110819a) && Intrinsics.f(this.f110820b, rVar.f110820b);
    }

    public final int hashCode() {
        int iHashCode = this.f110819a.hashCode() * 31;
        String str = this.f110820b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
