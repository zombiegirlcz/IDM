package m6f;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f203084b;

    public v(String ref2, BigDecimal allocation) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        this.f203083a = ref2;
        this.f203084b = allocation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f203083a, vVar.f203083a) && Intrinsics.f(this.f203084b, vVar.f203084b);
    }

    public final int hashCode() {
        return this.f203084b.hashCode() + (this.f203083a.hashCode() * 31);
    }
}
