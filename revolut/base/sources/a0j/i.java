package a0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f408a;

    public i(h rateType) {
        Intrinsics.checkNotNullParameter(rateType, "rateType");
        this.f408a = rateType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof i) {
            return Float.compare(2.35f, 2.35f) == 0 && this.f408a == ((i) obj2).f408a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f408a.hashCode() + (Float.hashCode(2.35f) * 31);
    }
}
