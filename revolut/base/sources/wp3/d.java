package wp3;

import dx4.a1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f299017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f299018c;

    public d(String text, a1 a1Var, c cVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f299016a = text;
        this.f299017b = a1Var;
        this.f299018c = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f299016a, dVar.f299016a) && this.f299017b == dVar.f299017b && this.f299018c == dVar.f299018c;
    }

    public final int hashCode() {
        int iHashCode = this.f299016a.hashCode() * 31;
        a1 a1Var = this.f299017b;
        int iHashCode2 = (iHashCode + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        c cVar = this.f299018c;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }
}
