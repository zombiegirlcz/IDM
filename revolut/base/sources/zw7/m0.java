package zw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f325819c;
    public final k d;

    public m0(String name, String value, String str, k kVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f325817a = name;
        this.f325818b = value;
        this.f325819c = str;
        this.d = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f325817a, m0Var.f325817a) && Intrinsics.f(this.f325818b, m0Var.f325818b) && Intrinsics.f(this.f325819c, m0Var.f325819c) && Intrinsics.f(this.d, m0Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f325817a.hashCode() * 31, 31, this.f325818b);
        String str = this.f325819c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        k kVar = this.d;
        return iHashCode + (kVar != null ? kVar.hashCode() : 0);
    }
}
