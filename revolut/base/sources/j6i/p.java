package j6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f171789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171790b;

    public p(dj0.d targetProductTopUpLimit, String bestIASProductName) {
        Intrinsics.checkNotNullParameter(targetProductTopUpLimit, "targetProductTopUpLimit");
        Intrinsics.checkNotNullParameter(bestIASProductName, "bestIASProductName");
        this.f171789a = targetProductTopUpLimit;
        this.f171790b = bestIASProductName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f171789a, pVar.f171789a) && Intrinsics.f(this.f171790b, pVar.f171790b);
    }

    public final int hashCode() {
        return this.f171790b.hashCode() + (this.f171789a.hashCode() * 31);
    }
}
