package fvb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f138415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f138416c;
    public final String d;
    public final String e;

    public f(String productId, e status, d dVar, String str, String str2) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f138414a = productId;
        this.f138415b = status;
        this.f138416c = dVar;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f138414a, fVar.f138414a) && this.f138415b == fVar.f138415b && this.f138416c == fVar.f138416c && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f138415b.hashCode() + (this.f138414a.hashCode() * 31)) * 31;
        d dVar = this.f138416c;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
