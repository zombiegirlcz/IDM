package c96;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22307b;

    public b(String companyName, String signDate) {
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        Intrinsics.checkNotNullParameter(signDate, "signDate");
        this.f22306a = companyName;
        this.f22307b = signDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f22306a, bVar.f22306a) && Intrinsics.f(this.f22307b, bVar.f22307b);
    }

    public final int hashCode() {
        return this.f22307b.hashCode() + (this.f22306a.hashCode() * 31);
    }
}
