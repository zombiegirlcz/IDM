package m2j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f202021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pcd.s f202022b;

    public d0(a0 profileWithExtra, pcd.s vault) {
        Intrinsics.checkNotNullParameter(profileWithExtra, "profileWithExtra");
        Intrinsics.checkNotNullParameter(vault, "vault");
        this.f202021a = profileWithExtra;
        this.f202022b = vault;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f202021a, d0Var.f202021a) && Intrinsics.f(this.f202022b, d0Var.f202022b);
    }

    public final int hashCode() {
        return this.f202022b.hashCode() + (this.f202021a.hashCode() * 31);
    }
}
