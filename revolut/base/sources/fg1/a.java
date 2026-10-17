package fg1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f134883c;
    public final String d;

    public a(String tokenUniqueReference, String lastFour, String str, int i) {
        String str2 = (i & 16) != 0 ? null : "REVIVAL_APPROVE";
        Intrinsics.checkNotNullParameter(tokenUniqueReference, "tokenUniqueReference");
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        this.f134881a = tokenUniqueReference;
        this.f134882b = lastFour;
        this.f134883c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f134881a, aVar.f134881a) && Intrinsics.f(this.f134882b, aVar.f134882b) && Intrinsics.f(this.f134883c, aVar.f134883c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f134881a.hashCode() * 31, 31, this.f134882b);
        String str = this.f134883c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 961;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
