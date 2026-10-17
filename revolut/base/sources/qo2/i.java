package qo2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f247992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f247993b;

    public i(b payment, boolean z) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.f247992a = payment;
        this.f247993b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f247992a, iVar.f247992a) && this.f247993b == iVar.f247993b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f247993b) + (this.f247992a.hashCode() * 31);
    }
}
