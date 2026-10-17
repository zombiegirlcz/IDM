package j8l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f172227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f172228b;

    public c(dj0.d sourceMoney, dj0.d targetMoney) {
        Intrinsics.checkNotNullParameter(sourceMoney, "sourceMoney");
        Intrinsics.checkNotNullParameter(targetMoney, "targetMoney");
        this.f172227a = sourceMoney;
        this.f172228b = targetMoney;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f172227a, cVar.f172227a) && Intrinsics.f(this.f172228b, cVar.f172228b);
    }

    public final int hashCode() {
        return this.f172228b.hashCode() + (this.f172227a.hashCode() * 31);
    }
}
