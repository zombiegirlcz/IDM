package m1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f201348c;
    public final b0 d;

    public c0(String title, String str, String icon, b0 b0Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f201346a = title;
        this.f201347b = str;
        this.f201348c = icon;
        this.d = b0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f201346a, c0Var.f201346a) && Intrinsics.f(this.f201347b, c0Var.f201347b) && Intrinsics.f(this.f201348c, c0Var.f201348c) && Intrinsics.f(this.d, c0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f201346a.hashCode() * 31;
        String str = this.f201347b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f201348c);
        b0 b0Var = this.d;
        return iC + (b0Var != null ? b0Var.hashCode() : 0);
    }
}
