package svi;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f265909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f265910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f265911c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0 f265912g;

    public g0(dj0.d dVar, dj0.d finalPrice, String str, dj0.d dVar2, dj0.d passPrice, dj0.d dVar3, e0 e0Var) {
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        Intrinsics.checkNotNullParameter(passPrice, "passPrice");
        this.f265909a = dVar;
        this.f265910b = finalPrice;
        this.f265911c = str;
        this.d = dVar2;
        this.e = passPrice;
        this.f = dVar3;
        this.f265912g = e0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f265909a, g0Var.f265909a) && Intrinsics.f(this.f265910b, g0Var.f265910b) && Intrinsics.f(this.f265911c, g0Var.f265911c) && Intrinsics.f(this.d, g0Var.d) && Intrinsics.f(this.e, g0Var.e) && Intrinsics.f(this.f, g0Var.f) && Intrinsics.f(this.f265912g, g0Var.f265912g);
    }

    public final int hashCode() {
        dj0.d dVar = this.f265909a;
        int iC = v7.c((dVar == null ? 0 : dVar.hashCode()) * 31, 31, this.f265910b);
        String str = this.f265911c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        dj0.d dVar2 = this.d;
        int iC2 = v7.c((iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31, 31, this.e);
        dj0.d dVar3 = this.f;
        int iHashCode2 = (iC2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        e0 e0Var = this.f265912g;
        return iHashCode2 + (e0Var != null ? e0Var.hashCode() : 0);
    }
}
