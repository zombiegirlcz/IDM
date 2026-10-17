package m79;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203355b;

    public d(String str, String str2) {
        this.f203354a = str;
        this.f203355b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f203354a, dVar.f203354a) && Intrinsics.f(this.f203355b, dVar.f203355b);
    }

    public final int hashCode() {
        String str = this.f203354a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f203355b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
