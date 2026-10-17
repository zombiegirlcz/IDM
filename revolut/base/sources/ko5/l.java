package ko5;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f186238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f186239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f186240c;
    public final dj0.d d;
    public final dj0.d e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f186241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f186242h;

    public l(String token, long j2, j jVar, dj0.d billAmount, dj0.d recipientAmount, h charges, i iVar, boolean z) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(billAmount, "billAmount");
        Intrinsics.checkNotNullParameter(recipientAmount, "recipientAmount");
        Intrinsics.checkNotNullParameter(charges, "charges");
        this.f186238a = token;
        this.f186239b = j2;
        this.f186240c = jVar;
        this.d = billAmount;
        this.e = recipientAmount;
        this.f = charges;
        this.f186241g = iVar;
        this.f186242h = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f186238a, lVar.f186238a) && this.f186239b == lVar.f186239b && Intrinsics.f(this.f186240c, lVar.f186240c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f186241g, lVar.f186241g) && this.f186242h == lVar.f186242h;
    }

    public final int hashCode() {
        int iC = a0.d.c(this.f186238a.hashCode() * 31, 31, this.f186239b);
        j jVar = this.f186240c;
        int iHashCode = (this.f.hashCode() + v7.c(v7.c((iC + (jVar == null ? 0 : jVar.hashCode())) * 31, 31, this.d), 31, this.e)) * 31;
        i iVar = this.f186241g;
        return Boolean.hashCode(this.f186242h) + ((iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }
}
