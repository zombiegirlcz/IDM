package nob;

import kotlin.jvm.internal.Intrinsics;
import pcd.s;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f217964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final djb.a f217965b;

    public f(djb.a autoPaymentMethods, s vault) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        Intrinsics.checkNotNullParameter(autoPaymentMethods, "autoPaymentMethods");
        this.f217964a = vault;
        this.f217965b = autoPaymentMethods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f217964a, fVar.f217964a) && Intrinsics.f(this.f217965b, fVar.f217965b);
    }

    public final int hashCode() {
        return this.f217965b.hashCode() + (this.f217964a.hashCode() * 31);
    }
}
