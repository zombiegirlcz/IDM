package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class y1 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f154976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154977c;
    public final o d;

    public y1(String title, x1 subtype, String str, o oVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        this.f154975a = title;
        this.f154976b = subtype;
        this.f154977c = str;
        this.d = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj2;
        return Intrinsics.f(this.f154975a, y1Var.f154975a) && this.f154976b == y1Var.f154976b && Intrinsics.f(this.f154977c, y1Var.f154977c) && Intrinsics.f(this.d, y1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f154976b.hashCode() + (this.f154975a.hashCode() * 31)) * 31;
        String str = this.f154977c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        o oVar = this.d;
        return iHashCode2 + (oVar != null ? oVar.hashCode() : 0);
    }
}
