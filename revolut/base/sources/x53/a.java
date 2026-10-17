package x53;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f302908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f302909c;

    public a(String number, String str, String str2) {
        Intrinsics.checkNotNullParameter(number, "number");
        this.f302907a = number;
        this.f302908b = str;
        this.f302909c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f302907a, aVar.f302907a) && Intrinsics.f(this.f302908b, aVar.f302908b) && Intrinsics.f(this.f302909c, aVar.f302909c);
    }

    public final int hashCode() {
        int iHashCode = this.f302907a.hashCode() * 31;
        String str = this.f302908b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f302909c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
