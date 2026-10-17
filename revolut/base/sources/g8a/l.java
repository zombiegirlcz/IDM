package g8a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f141323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f141324c;
    public final String d;

    public l(String name, o oVar, String str, String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f141322a = name;
        this.f141323b = oVar;
        this.f141324c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f141322a, lVar.f141322a) && Intrinsics.f(this.f141323b, lVar.f141323b) && Intrinsics.f(this.f141324c, lVar.f141324c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f141322a.hashCode() * 31;
        o oVar = this.f141323b;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str = this.f141324c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
