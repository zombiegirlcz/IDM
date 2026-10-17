package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g1 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173450c;
    public final double d;

    public g1(String str, String str2, String holding, double d) {
        Intrinsics.checkNotNullParameter(holding, "holding");
        this.f173448a = str;
        this.f173449b = str2;
        this.f173450c = holding;
        this.d = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return Intrinsics.f(this.f173448a, g1Var.f173448a) && Intrinsics.f(this.f173449b, g1Var.f173449b) && Intrinsics.f(this.f173450c, g1Var.f173450c) && Double.compare(this.d, g1Var.d) == 0;
    }

    public final int hashCode() {
        String str = this.f173448a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f173449b;
        return Double.hashCode(this.d) + p.a.c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f173450c);
    }
}
