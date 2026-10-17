package eej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f125215c;

    public d(String title, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f125213a = title;
        this.f125214b = str;
        this.f125215c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f125213a, dVar.f125213a) && Intrinsics.f(this.f125214b, dVar.f125214b) && Intrinsics.f(this.f125215c, dVar.f125215c);
    }

    public final int hashCode() {
        int iHashCode = this.f125213a.hashCode() * 31;
        String str = this.f125214b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f125215c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
