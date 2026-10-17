package d0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110407b;

    public i(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f110406a = title;
        this.f110407b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f110406a, iVar.f110406a) && Intrinsics.f(this.f110407b, iVar.f110407b);
    }

    public final int hashCode() {
        int iHashCode = this.f110406a.hashCode() * 31;
        String str = this.f110407b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
