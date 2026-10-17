package o9a;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f223167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f223168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f223169c;
    public final Long d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f223170g;

    public s(String decodedQrCodeId, dj0.d amount, String creditorName, Long l2, String str, boolean z, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(decodedQrCodeId, "decodedQrCodeId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(creditorName, "creditorName");
        this.f223167a = decodedQrCodeId;
        this.f223168b = amount;
        this.f223169c = creditorName;
        this.d = l2;
        this.e = str;
        this.f = z;
        this.f223170g = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f223167a, sVar.f223167a) && Intrinsics.f(this.f223168b, sVar.f223168b) && Intrinsics.f(this.f223169c, sVar.f223169c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e) && this.f == sVar.f && Intrinsics.f(this.f223170g, sVar.f223170g);
    }

    public final int hashCode() {
        int iC = p.a.c(v7.c(this.f223167a.hashCode() * 31, 31, this.f223168b), 31, this.f223169c);
        Long l2 = this.d;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.e;
        int iC2 = j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        dj0.d dVar = this.f223170g;
        return iC2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
