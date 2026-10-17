package l1l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f191587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f191588b;

    public l(dj0.d targetMoney, long j2) {
        Intrinsics.checkNotNullParameter(targetMoney, "targetMoney");
        this.f191587a = targetMoney;
        this.f191588b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f191587a, lVar.f191587a) && this.f191588b == lVar.f191588b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f191588b) + (this.f191587a.hashCode() * 31);
    }
}
