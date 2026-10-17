package tua;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f274544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f274545b;

    public b(a amountType, boolean z) {
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        this.f274544a = amountType;
        this.f274545b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f274544a == bVar.f274544a && this.f274545b == bVar.f274545b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f274545b) + (this.f274544a.hashCode() * 31);
    }
}
