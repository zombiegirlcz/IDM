package zw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f325763c;
    public final k d;

    public c1(String name, String value, String str, k kVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f325761a = name;
        this.f325762b = value;
        this.f325763c = str;
        this.d = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj2;
        return Intrinsics.f(this.f325761a, c1Var.f325761a) && Intrinsics.f(this.f325762b, c1Var.f325762b) && Intrinsics.f(this.f325763c, c1Var.f325763c) && Intrinsics.f(this.d, c1Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f325761a.hashCode() * 31, 31, this.f325762b);
        String str = this.f325763c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        k kVar = this.d;
        return iHashCode + (kVar != null ? kVar.hashCode() : 0);
    }
}
