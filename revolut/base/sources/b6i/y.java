package b6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f12837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12838b;

    public y(j inputPosition, long j2) {
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        this.f12837a = inputPosition;
        this.f12838b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f12837a == yVar.f12837a && this.f12838b == yVar.f12838b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12838b) + (this.f12837a.hashCode() * 31);
    }
}
