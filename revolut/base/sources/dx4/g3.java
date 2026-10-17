package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120607c;
    public final String d;
    public final f3 e;

    public g3(String str, String title, String str2, String str3, f3 f3Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f120605a = str;
        this.f120606b = title;
        this.f120607c = str2;
        this.d = str3;
        this.e = f3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj2;
        return Intrinsics.f(this.f120605a, g3Var.f120605a) && Intrinsics.f(this.f120606b, g3Var.f120606b) && Intrinsics.f(this.f120607c, g3Var.f120607c) && Intrinsics.f(this.d, g3Var.d) && Intrinsics.f(this.e, g3Var.e);
    }

    public final int hashCode() {
        String str = this.f120605a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f120606b);
        String str2 = this.f120607c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        f3 f3Var = this.e;
        return iHashCode2 + (f3Var != null ? f3Var.hashCode() : 0);
    }
}
