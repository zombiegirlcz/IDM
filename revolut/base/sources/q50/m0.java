package q50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m0 implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y50.b f242243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f242244b;

    public m0(y50.b config, String str) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f242243a = config;
        this.f242244b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f242243a, m0Var.f242243a) && Intrinsics.f(this.f242244b, m0Var.f242244b);
    }

    public final int hashCode() {
        int iHashCode = this.f242243a.hashCode() * 31;
        String str = this.f242244b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
