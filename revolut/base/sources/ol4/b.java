package ol4;

import dx4.a1;
import dx4.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f226329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f226330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f226331c;

    public b(String text, a1 a1Var, l lVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f226329a = text;
        this.f226330b = a1Var;
        this.f226331c = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f226329a, bVar.f226329a) && this.f226330b == bVar.f226330b && Intrinsics.f(this.f226331c, bVar.f226331c);
    }

    public final int hashCode() {
        int iHashCode = this.f226329a.hashCode() * 31;
        a1 a1Var = this.f226330b;
        int iHashCode2 = (iHashCode + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        l lVar = this.f226331c;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }
}
