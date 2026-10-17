package d0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends lk0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f110419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110420b;

    public l(m type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f110419a = type;
        this.f110420b = str;
    }

    @Override // lk0.f
    public final int a() {
        return 10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f110419a == lVar.f110419a && Intrinsics.f(this.f110420b, lVar.f110420b);
    }

    public final int hashCode() {
        int iHashCode = this.f110419a.hashCode() * 31;
        String str = this.f110420b;
        return Integer.hashCode(10) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
