package m1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201332b;

    public a(String deeplink, String str) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f201331a = deeplink;
        this.f201332b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f201331a, aVar.f201331a) && Intrinsics.f(this.f201332b, aVar.f201332b);
    }

    public final int hashCode() {
        int iHashCode = this.f201331a.hashCode() * 31;
        String str = this.f201332b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
