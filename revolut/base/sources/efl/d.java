package efl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f125364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f125365b;

    public d(dj0.d brokerageNetCredit, boolean z) {
        Intrinsics.checkNotNullParameter(brokerageNetCredit, "brokerageNetCredit");
        this.f125364a = brokerageNetCredit;
        this.f125365b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f125364a, dVar.f125364a) && this.f125365b == dVar.f125365b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f125365b) + (this.f125364a.hashCode() * 31);
    }
}
