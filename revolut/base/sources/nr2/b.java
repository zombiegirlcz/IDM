package nr2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f218524c;

    public b(String merchantBlockageId, String str, String str2) {
        Intrinsics.checkNotNullParameter(merchantBlockageId, "merchantBlockageId");
        this.f218522a = merchantBlockageId;
        this.f218523b = str;
        this.f218524c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f218522a, bVar.f218522a) && Intrinsics.f(this.f218523b, bVar.f218523b) && Intrinsics.f(this.f218524c, bVar.f218524c);
    }

    public final int hashCode() {
        int iHashCode = this.f218522a.hashCode() * 31;
        String str = this.f218523b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f218524c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
