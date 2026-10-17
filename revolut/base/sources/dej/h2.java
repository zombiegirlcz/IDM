package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m2 f113551c;
    public final g2 d;

    public h2(String title, String str, m2 m2Var, g2 target) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f113549a = title;
        this.f113550b = str;
        this.f113551c = m2Var;
        this.d = target;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj2;
        return Intrinsics.f(this.f113549a, h2Var.f113549a) && Intrinsics.f(this.f113550b, h2Var.f113550b) && this.f113551c == h2Var.f113551c && Intrinsics.f(this.d, h2Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f113549a.hashCode() * 31;
        String str = this.f113550b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        m2 m2Var = this.f113551c;
        return this.d.hashCode() + ((iHashCode2 + (m2Var != null ? m2Var.hashCode() : 0)) * 31);
    }
}
