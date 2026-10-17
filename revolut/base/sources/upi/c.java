package upi;

import kotlin.jvm.internal.Intrinsics;
import t80.m;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f282060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y80.d f282061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f282062c;

    public c(m reason, y80.d dVar, Integer num) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f282060a = reason;
        this.f282061b = dVar;
        this.f282062c = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f282060a, cVar.f282060a) && this.f282061b == cVar.f282061b && Intrinsics.f(this.f282062c, cVar.f282062c);
    }

    public final int hashCode() {
        int iHashCode = this.f282060a.hashCode() * 31;
        y80.d dVar = this.f282061b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Integer num = this.f282062c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
