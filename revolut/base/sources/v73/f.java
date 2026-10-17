package v73;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f286533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f286534b;

    public f(dj0.d amountToTopup, boolean z) {
        Intrinsics.checkNotNullParameter(amountToTopup, "amountToTopup");
        this.f286533a = amountToTopup;
        this.f286534b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f286533a, fVar.f286533a) && this.f286534b == fVar.f286534b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f286534b) + (this.f286533a.hashCode() * 31);
    }
}
