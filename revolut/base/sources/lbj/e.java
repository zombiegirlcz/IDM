package lbj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f193697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f193698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f193699c;
    public final String d;
    public final jo3.b e;
    public final d f;

    public e(long j2, String addressId, String str, String str2, jo3.b bVar, d dVar) {
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        this.f193697a = j2;
        this.f193698b = addressId;
        this.f193699c = str;
        this.d = str2;
        this.e = bVar;
        this.f = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f193697a == eVar.f193697a && Intrinsics.f(this.f193698b, eVar.f193698b) && Intrinsics.f(this.f193699c, eVar.f193699c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(Long.hashCode(this.f193697a) * 31, 31, this.f193698b);
        String str = this.f193699c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        jo3.b bVar = this.e;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        d dVar = this.f;
        return iHashCode3 + (dVar != null ? dVar.f193696a.hashCode() : 0);
    }
}
