package j8l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f172243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f172244b;

    public m(dj0.d sourceMoney, dj0.d targetMoney) {
        Intrinsics.checkNotNullParameter(sourceMoney, "sourceMoney");
        Intrinsics.checkNotNullParameter(targetMoney, "targetMoney");
        this.f172243a = sourceMoney;
        this.f172244b = targetMoney;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f172243a, mVar.f172243a) && Intrinsics.f(this.f172244b, mVar.f172244b);
    }

    public final int hashCode() {
        return this.f172244b.hashCode() + (this.f172243a.hashCode() * 31);
    }
}
