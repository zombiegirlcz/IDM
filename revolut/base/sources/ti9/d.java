package ti9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f271454b;

    public d(String planId, int i) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f271453a = planId;
        this.f271454b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f271453a, dVar.f271453a) && this.f271454b == dVar.f271454b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f271454b) + (this.f271453a.hashCode() * 31);
    }
}
