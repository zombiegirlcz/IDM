package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173581c;
    public final g2 d;
    public final ej0.b e;

    public v2(String ref2, String fullName, String str, g2 g2Var, ej0.b bVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        this.f173579a = ref2;
        this.f173580b = fullName;
        this.f173581c = str;
        this.d = g2Var;
        this.e = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj2;
        return Intrinsics.f(this.f173579a, v2Var.f173579a) && Intrinsics.f(this.f173580b, v2Var.f173580b) && Intrinsics.f(this.f173581c, v2Var.f173581c) && Intrinsics.f(this.d, v2Var.d) && Intrinsics.f(this.e, v2Var.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f173579a.hashCode() * 31, 31, this.f173580b);
        String str = this.f173581c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        g2 g2Var = this.d;
        int iHashCode2 = (iHashCode + (g2Var == null ? 0 : g2Var.hashCode())) * 31;
        ej0.b bVar = this.e;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
