package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y6 f272977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f272978c;
    public final dj0.d d;
    public final dj0.d e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f272979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f272980h;
    public final d3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj0.d f272981j;

    public p2(String groupId, y6 type, dj0.d amount, dj0.d amountWithFee, dj0.d amountWithCharges, String pocketId, String str, String str2, d3 d3Var, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(amountWithFee, "amountWithFee");
        Intrinsics.checkNotNullParameter(amountWithCharges, "amountWithCharges");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f272976a = groupId;
        this.f272977b = type;
        this.f272978c = amount;
        this.d = amountWithFee;
        this.e = amountWithCharges;
        this.f = pocketId;
        this.f272979g = str;
        this.f272980h = str2;
        this.i = d3Var;
        this.f272981j = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj2;
        return Intrinsics.f(this.f272976a, p2Var.f272976a) && this.f272977b == p2Var.f272977b && Intrinsics.f(this.f272978c, p2Var.f272978c) && Intrinsics.f(this.d, p2Var.d) && Intrinsics.f(this.e, p2Var.e) && Intrinsics.f(this.f, p2Var.f) && Intrinsics.f(this.f272979g, p2Var.f272979g) && Intrinsics.f(this.f272980h, p2Var.f272980h) && Intrinsics.f(this.i, p2Var.i) && Intrinsics.f(this.f272981j, p2Var.f272981j);
    }

    public final int hashCode() {
        int iC = p.a.c(ip0.v7.c(ip0.v7.c(ip0.v7.c((this.f272977b.hashCode() + (this.f272976a.hashCode() * 31)) * 31, 31, this.f272978c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.f272979g;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f272980h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        d3 d3Var = this.i;
        int iHashCode3 = (iHashCode2 + (d3Var == null ? 0 : d3Var.hashCode())) * 31;
        dj0.d dVar = this.f272981j;
        return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
    }
}
