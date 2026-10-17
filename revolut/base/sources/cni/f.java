package cni;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ymi.i f25434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ymi.d f25435b;

    public f(ymi.i consent, ymi.d account) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        Intrinsics.checkNotNullParameter(account, "account");
        this.f25434a = consent;
        this.f25435b = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f25434a, fVar.f25434a) && Intrinsics.f(this.f25435b, fVar.f25435b);
    }

    public final int hashCode() {
        return this.f25435b.hashCode() + (this.f25434a.hashCode() * 31);
    }
}
