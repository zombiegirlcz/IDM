package xy3;

import dx4.a1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f309588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f309589c;
    public final String d;

    public o(a1 a1Var, String id10, String title, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f309587a = id10;
        this.f309588b = a1Var;
        this.f309589c = title;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f309587a, oVar.f309587a) && this.f309588b == oVar.f309588b && Intrinsics.f(this.f309589c, oVar.f309589c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f309587a.hashCode() * 31;
        a1 a1Var = this.f309588b;
        int iC = p.a.c((iHashCode + (a1Var == null ? 0 : a1Var.hashCode())) * 31, 31, this.f309589c);
        String str = this.d;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
