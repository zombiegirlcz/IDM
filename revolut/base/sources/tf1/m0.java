package tf1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf1.l f270182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f270183b;

    public m0(qf1.l id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f270182a = id10;
        this.f270183b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return this.f270182a == m0Var.f270182a && this.f270183b == m0Var.f270183b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f270183b) + (this.f270182a.hashCode() * 31);
    }
}
