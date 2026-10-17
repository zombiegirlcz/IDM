package s69;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f260171c;
    public final String d;

    public h(String str, String str2, String str3, String str4) {
        this.f260169a = str;
        this.f260170b = str2;
        this.f260171c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f260169a, hVar.f260169a) && Intrinsics.f(this.f260170b, hVar.f260170b) && Intrinsics.f(this.f260171c, hVar.f260171c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        String str = this.f260169a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f260170b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f260171c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
