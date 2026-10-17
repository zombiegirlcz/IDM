package kq2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f188300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f188301b;

    public e(c chargeBearer, dj0.d fee2) {
        Intrinsics.checkNotNullParameter(chargeBearer, "chargeBearer");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f188300a = chargeBearer;
        this.f188301b = fee2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f188300a == eVar.f188300a && Intrinsics.f(this.f188301b, eVar.f188301b);
    }

    public final int hashCode() {
        return this.f188301b.hashCode() + (this.f188300a.hashCode() * 31);
    }
}
