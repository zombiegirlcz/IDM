package g2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f139996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139997c;

    public i(String id10, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f139995a = id10;
        this.f139996b = str;
        this.f139997c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f139995a, iVar.f139995a) && Intrinsics.f(this.f139996b, iVar.f139996b) && Intrinsics.f(this.f139997c, iVar.f139997c);
    }

    public final int hashCode() {
        int iHashCode = this.f139995a.hashCode() * 31;
        String str = this.f139996b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f139997c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
