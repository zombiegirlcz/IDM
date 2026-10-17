package au3;

import dx4.a1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f9479c;
    public final h d;

    public i(String title, String description, a1 a1Var, h hVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f9477a = title;
        this.f9478b = description;
        this.f9479c = a1Var;
        this.d = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f9477a, iVar.f9477a) && Intrinsics.f(this.f9478b, iVar.f9478b) && this.f9479c == iVar.f9479c && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f9477a.hashCode() * 31, 31, this.f9478b);
        a1 a1Var = this.f9479c;
        int iHashCode = (iC + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        h hVar = this.d;
        return iHashCode + (hVar != null ? hVar.hashCode() : 0);
    }
}
