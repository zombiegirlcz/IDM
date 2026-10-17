package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b3 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f120557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120558c;
    public final String d;

    public b3(String name, c1 c1Var, String str, String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f120556a = name;
        this.f120557b = c1Var;
        this.f120558c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj2;
        return Intrinsics.f(this.f120556a, b3Var.f120556a) && Intrinsics.f(this.f120557b, b3Var.f120557b) && Intrinsics.f(this.f120558c, b3Var.f120558c) && Intrinsics.f(this.d, b3Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f120556a.hashCode() * 31;
        c1 c1Var = this.f120557b;
        int iHashCode2 = (iHashCode + (c1Var == null ? 0 : c1Var.hashCode())) * 31;
        String str = this.f120558c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
