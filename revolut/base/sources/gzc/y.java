package gzc;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f148044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148046c;
    public final int d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f148047g;

    public y(int i, String totalTopUp, String defaultCurrency, int i2, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(totalTopUp, "totalTopUp");
        Intrinsics.checkNotNullParameter(defaultCurrency, "defaultCurrency");
        this.f148044a = i;
        this.f148045b = totalTopUp;
        this.f148046c = defaultCurrency;
        this.d = i2;
        this.e = z;
        this.f = z3;
        this.f148047g = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f148044a == yVar.f148044a && Intrinsics.f(this.f148045b, yVar.f148045b) && Intrinsics.f(this.f148046c, yVar.f148046c) && this.d == yVar.d && this.e == yVar.e && this.f == yVar.f && this.f148047g == yVar.f148047g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f148047g) + j6.a.c(j6.a.c(j6.a.b(this.d, p.a.c(p.a.c(Integer.hashCode(this.f148044a) * 31, 31, this.f148045b), 31, this.f148046c), 31), 31, this.e), 31, this.f);
    }
}
