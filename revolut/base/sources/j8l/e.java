package j8l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f172229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f172230b;

    public e(dj0.d sourceMoney, dj0.d targetMoney) {
        Intrinsics.checkNotNullParameter(sourceMoney, "sourceMoney");
        Intrinsics.checkNotNullParameter(targetMoney, "targetMoney");
        this.f172229a = sourceMoney;
        this.f172230b = targetMoney;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f172229a, eVar.f172229a) && Intrinsics.f(this.f172230b, eVar.f172230b);
    }

    public final int hashCode() {
        return this.f172230b.hashCode() + (this.f172229a.hashCode() * 31);
    }
}
