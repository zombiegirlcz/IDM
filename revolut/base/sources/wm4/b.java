package wm4;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f298612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f298613b;

    public b(d amount, String str) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f298612a = amount;
        this.f298613b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f298612a, bVar.f298612a) && Intrinsics.f(this.f298613b, bVar.f298613b);
    }

    public final int hashCode() {
        int iHashCode = this.f298612a.hashCode() * 31;
        String str = this.f298613b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
