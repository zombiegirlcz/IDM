package dx4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o5 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f120704c;
    public final String d;
    public final Long e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f120705g;

    public o5(String id10, String text, a1 a1Var, String str, Long l2, boolean z, l lVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f120702a = id10;
        this.f120703b = text;
        this.f120704c = a1Var;
        this.d = str;
        this.e = l2;
        this.f = z;
        this.f120705g = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o5)) {
            return false;
        }
        o5 o5Var = (o5) obj2;
        return Intrinsics.f(this.f120702a, o5Var.f120702a) && Intrinsics.f(this.f120703b, o5Var.f120703b) && this.f120704c == o5Var.f120704c && Intrinsics.f(this.d, o5Var.d) && Intrinsics.f(this.e, o5Var.e) && this.f == o5Var.f && Intrinsics.f(this.f120705g, o5Var.f120705g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f120702a.hashCode() * 31, 31, this.f120703b);
        a1 a1Var = this.f120704c;
        int iHashCode = (iC + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.e;
        int iC2 = j6.a.c((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f);
        l lVar = this.f120705g;
        return iC2 + (lVar != null ? lVar.hashCode() : 0);
    }
}
