package ht3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f155255c;
    public final w d;

    public b0(String title, String str, a0 a0Var, w wVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f155253a = title;
        this.f155254b = str;
        this.f155255c = a0Var;
        this.d = wVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f155253a, b0Var.f155253a) && Intrinsics.f(this.f155254b, b0Var.f155254b) && Intrinsics.f(this.f155255c, b0Var.f155255c) && Intrinsics.f(this.d, b0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f155253a.hashCode() * 31;
        String str = this.f155254b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        a0 a0Var = this.f155255c;
        int iHashCode3 = (iHashCode2 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        w wVar = this.d;
        return iHashCode3 + (wVar != null ? wVar.hashCode() : 0);
    }
}
