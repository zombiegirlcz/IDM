package m8c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7c.a f203471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f203472b;

    public j(r7c.a deferredPayment, boolean z) {
        Intrinsics.checkNotNullParameter(deferredPayment, "deferredPayment");
        this.f203471a = deferredPayment;
        this.f203472b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f203471a, jVar.f203471a) && this.f203472b == jVar.f203472b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f203472b) + (this.f203471a.hashCode() * 31);
    }
}
