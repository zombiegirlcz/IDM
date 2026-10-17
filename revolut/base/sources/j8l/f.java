package j8l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f172231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f172232b;

    public f(dj0.d sourceMoney, dj0.d targetMoney) {
        Intrinsics.checkNotNullParameter(sourceMoney, "sourceMoney");
        Intrinsics.checkNotNullParameter(targetMoney, "targetMoney");
        this.f172231a = sourceMoney;
        this.f172232b = targetMoney;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f172231a, fVar.f172231a) && Intrinsics.f(this.f172232b, fVar.f172232b);
    }

    public final int hashCode() {
        return this.f172232b.hashCode() + (this.f172231a.hashCode() * 31);
    }
}
