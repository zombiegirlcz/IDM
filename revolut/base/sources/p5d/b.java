package p5d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f233095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f233096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f233097c;

    public b(String assetId, String str, String str2) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        this.f233095a = assetId;
        this.f233096b = str;
        this.f233097c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f233095a, bVar.f233095a) && Intrinsics.f(this.f233096b, bVar.f233096b) && Intrinsics.f(this.f233097c, bVar.f233097c);
    }

    public final int hashCode() {
        int iHashCode = this.f233095a.hashCode() * 31;
        String str = this.f233096b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f233097c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
