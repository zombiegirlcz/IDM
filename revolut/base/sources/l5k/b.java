package l5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f192306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f192307b;

    public b(dj0.d fee2, a feeType) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(feeType, "feeType");
        this.f192306a = fee2;
        this.f192307b = feeType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f192306a, bVar.f192306a) && this.f192307b == bVar.f192307b;
    }

    public final int hashCode() {
        return this.f192307b.hashCode() + j6.a.c(this.f192306a.hashCode() * 31, 31, true);
    }
}
