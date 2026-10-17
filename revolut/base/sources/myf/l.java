package myf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f210479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f210480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f210481c;

    public l(String str, String str2, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f210479a = currency;
        this.f210480b = str;
        this.f210481c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f210479a, lVar.f210479a) && Intrinsics.f(this.f210480b, lVar.f210480b) && Intrinsics.f(this.f210481c, lVar.f210481c);
    }

    public final int hashCode() {
        int iHashCode = this.f210479a.hashCode() * 31;
        String str = this.f210480b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f210481c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
