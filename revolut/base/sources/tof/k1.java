package tof;

import java.io.Serializable;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f272874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1 f272875c;
    public final m3 d;
    public final l1 e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f272876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f272877h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj0.d f272878j;
    public final u0 k;

    public k1(String transactionId, dj0.d targetAmount, l1 l1Var, m3 m3Var, l1 l1Var2, dj0.d dVar, Instant instant, boolean z, String str, dj0.d dVar2, u0 u0Var) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(targetAmount, "targetAmount");
        this.f272873a = transactionId;
        this.f272874b = targetAmount;
        this.f272875c = l1Var;
        this.d = m3Var;
        this.e = l1Var2;
        this.f = dVar;
        this.f272876g = instant;
        this.f272877h = z;
        this.i = str;
        this.f272878j = dVar2;
        this.k = u0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return Intrinsics.f(this.f272873a, k1Var.f272873a) && Intrinsics.f(this.f272874b, k1Var.f272874b) && Intrinsics.f(this.f272875c, k1Var.f272875c) && Intrinsics.f(this.d, k1Var.d) && Intrinsics.f(this.e, k1Var.e) && Intrinsics.f(this.f, k1Var.f) && Intrinsics.f(this.f272876g, k1Var.f272876g) && this.f272877h == k1Var.f272877h && Intrinsics.f(this.i, k1Var.i) && Intrinsics.f(this.f272878j, k1Var.f272878j) && this.k == k1Var.k;
    }

    public final int hashCode() {
        int iC = ip0.v7.c(this.f272873a.hashCode() * 31, 31, this.f272874b);
        l1 l1Var = this.f272875c;
        int iHashCode = (iC + (l1Var == null ? 0 : l1Var.hashCode())) * 31;
        m3 m3Var = this.d;
        int iHashCode2 = (iHashCode + (m3Var == null ? 0 : m3Var.hashCode())) * 31;
        l1 l1Var2 = this.e;
        int iHashCode3 = (iHashCode2 + (l1Var2 == null ? 0 : l1Var2.hashCode())) * 31;
        dj0.d dVar = this.f;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Instant instant = this.f272876g;
        int iC2 = j6.a.c((iHashCode4 + (instant == null ? 0 : instant.hashCode())) * 31, 31, this.f272877h);
        String str = this.i;
        int iHashCode5 = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        dj0.d dVar2 = this.f272878j;
        int iHashCode6 = (iHashCode5 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        u0 u0Var = this.k;
        return iHashCode6 + (u0Var != null ? u0Var.hashCode() : 0);
    }
}
