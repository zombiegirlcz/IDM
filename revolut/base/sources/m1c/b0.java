package m1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f201340c;

    public b0(String title, String str, a0 a0Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f201338a = title;
        this.f201339b = str;
        this.f201340c = a0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f201338a, b0Var.f201338a) && Intrinsics.f(this.f201339b, b0Var.f201339b) && this.f201340c == b0Var.f201340c;
    }

    public final int hashCode() {
        int iHashCode = this.f201338a.hashCode() * 31;
        String str = this.f201339b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        a0 a0Var = this.f201340c;
        return iHashCode2 + (a0Var != null ? a0Var.hashCode() : 0);
    }
}
