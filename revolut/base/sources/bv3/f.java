package bv3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f18955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fu3.a f18956c;

    public f(long j2, Integer num, fu3.a aVar) {
        this.f18954a = j2;
        this.f18955b = num;
        this.f18956c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f18954a == fVar.f18954a && Intrinsics.f(this.f18955b, fVar.f18955b) && this.f18956c == fVar.f18956c;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f18954a) * 31;
        Integer num = this.f18955b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        fu3.a aVar = this.f18956c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}
