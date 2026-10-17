package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f216049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.b f216050b;

    public v0(u0 u0Var, jo3.b total) {
        Intrinsics.checkNotNullParameter(total, "total");
        this.f216049a = u0Var;
        this.f216050b = total;
    }

    public final u0 a() {
        return this.f216049a;
    }

    public final jo3.b b() {
        return this.f216050b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f216049a, v0Var.f216049a) && Intrinsics.f(this.f216050b, v0Var.f216050b);
    }

    public final int hashCode() {
        u0 u0Var = this.f216049a;
        return this.f216050b.hashCode() + ((u0Var == null ? 0 : u0Var.f216043a.hashCode()) * 31);
    }
}
