package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f215949b;

    public n1(String id10, o1 o1Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f215948a = id10;
        this.f215949b = o1Var;
    }

    public final String a() {
        return this.f215948a;
    }

    public final o1 b() {
        return this.f215949b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj2;
        return Intrinsics.f(this.f215948a, n1Var.f215948a) && Intrinsics.f(this.f215949b, n1Var.f215949b);
    }

    public final int hashCode() {
        int iHashCode = this.f215948a.hashCode() * 31;
        o1 o1Var = this.f215949b;
        return iHashCode + (o1Var == null ? 0 : o1Var.hashCode());
    }
}
