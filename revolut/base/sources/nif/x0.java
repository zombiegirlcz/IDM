package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3 f216066b;

    public x0(String id10, h3 h3Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f216065a = id10;
        this.f216066b = h3Var;
    }

    public final String a() {
        return this.f216065a;
    }

    public final h3 b() {
        return this.f216066b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f216065a, x0Var.f216065a) && Intrinsics.f(this.f216066b, x0Var.f216066b);
    }

    public final int hashCode() {
        int iHashCode = this.f216065a.hashCode() * 31;
        h3 h3Var = this.f216066b;
        return iHashCode + (h3Var == null ? 0 : h3Var.hashCode());
    }
}
