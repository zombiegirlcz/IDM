package whk;

import hha.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f297682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f297683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hha.g f297684c;

    public d(int i, i billingCode, hha.g billing) {
        Intrinsics.checkNotNullParameter(billingCode, "billingCode");
        Intrinsics.checkNotNullParameter(billing, "billing");
        this.f297682a = i;
        this.f297683b = billingCode;
        this.f297684c = billing;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f297682a == dVar.f297682a && this.f297683b == dVar.f297683b && Intrinsics.f(this.f297684c, dVar.f297684c);
    }

    public final int hashCode() {
        return this.f297684c.hashCode() + ((this.f297683b.hashCode() + (Integer.hashCode(this.f297682a) * 31)) * 31);
    }
}
