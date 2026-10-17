package qpb;

import kotlin.jvm.internal.Intrinsics;
import pcd.s;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final djb.a f248332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f248333b;

    public d(djb.a autoPaymentMethods, s vault) {
        Intrinsics.checkNotNullParameter(autoPaymentMethods, "autoPaymentMethods");
        Intrinsics.checkNotNullParameter(vault, "vault");
        this.f248332a = autoPaymentMethods;
        this.f248333b = vault;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f248332a, dVar.f248332a) && Intrinsics.f(this.f248333b, dVar.f248333b);
    }

    public final int hashCode() {
        return this.f248333b.hashCode() + (this.f248332a.hashCode() * 31);
    }
}
