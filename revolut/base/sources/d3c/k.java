package d3c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f111041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111043c;

    public k(l type, String str, String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f111041a = type;
        this.f111042b = str;
        this.f111043c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f111041a == kVar.f111041a && Intrinsics.f(this.f111042b, kVar.f111042b) && Intrinsics.f(this.f111043c, kVar.f111043c);
    }

    public final int hashCode() {
        int iHashCode = this.f111041a.hashCode() * 31;
        String str = this.f111042b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f111043c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
