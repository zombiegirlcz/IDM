package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3 f113591b;

    public l3(String id10, m3 m3Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f113590a = id10;
        this.f113591b = m3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj2;
        return Intrinsics.f(this.f113590a, l3Var.f113590a) && this.f113591b == l3Var.f113591b;
    }

    public final int hashCode() {
        int iHashCode = this.f113590a.hashCode() * 31;
        m3 m3Var = this.f113591b;
        return iHashCode + (m3Var == null ? 0 : m3Var.hashCode());
    }
}
