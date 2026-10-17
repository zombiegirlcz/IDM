package z19;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f318781c;
    public final String d;

    public j(String title, String subtitle, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f318779a = title;
        this.f318780b = subtitle;
        this.f318781c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f318779a, jVar.f318779a) && Intrinsics.f(this.f318780b, jVar.f318780b) && Intrinsics.f(this.f318781c, jVar.f318781c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f318779a.hashCode() * 31, 31, this.f318780b);
        String str = this.f318781c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
