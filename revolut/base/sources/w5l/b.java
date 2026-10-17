package w5l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295356b;

    public b(String imageUrl, String str) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f295355a = imageUrl;
        this.f295356b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f295355a, bVar.f295355a) && Intrinsics.f(this.f295356b, bVar.f295356b);
    }

    public final int hashCode() {
        int iHashCode = this.f295355a.hashCode() * 31;
        String str = this.f295356b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
