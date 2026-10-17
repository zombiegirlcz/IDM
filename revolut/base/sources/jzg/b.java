package jzg;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f179810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f179811b;

    public b(d amount, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f179810a = amount;
        this.f179811b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f179810a, bVar.f179810a) && this.f179811b == bVar.f179811b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f179811b) + (this.f179810a.hashCode() * 31);
    }
}
