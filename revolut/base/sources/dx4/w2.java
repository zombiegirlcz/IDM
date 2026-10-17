package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class w2 implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f120816c;

    public w2(c1 c1Var, String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f120814a = title;
        this.f120815b = str;
        this.f120816c = c1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj2;
        return Intrinsics.f(this.f120814a, w2Var.f120814a) && Intrinsics.f(this.f120815b, w2Var.f120815b) && Intrinsics.f(this.f120816c, w2Var.f120816c);
    }

    public final int hashCode() {
        int iHashCode = this.f120814a.hashCode() * 31;
        String str = this.f120815b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        c1 c1Var = this.f120816c;
        return iHashCode2 + (c1Var != null ? c1Var.hashCode() : 0);
    }
}
