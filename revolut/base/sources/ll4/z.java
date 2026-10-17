package ll4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class z implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f196565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f196566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f196567c;
    public final Long d;
    public final Long e;

    public z(Long l2, Long l3, Long l4, Long l5, Long l22) {
        this.f196565a = l2;
        this.f196566b = l3;
        this.f196567c = l4;
        this.d = l5;
        this.e = l22;
    }

    public final long a() {
        Long l2 = this.f196565a;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        Long l3 = this.f196566b;
        long jLongValue2 = jLongValue + (l3 != null ? l3.longValue() : 0L);
        Long l4 = this.f196567c;
        long jLongValue3 = jLongValue2 + (l4 != null ? l4.longValue() : 0L);
        Long l5 = this.d;
        long jLongValue4 = jLongValue3 + (l5 != null ? l5.longValue() : 0L);
        Long l22 = this.e;
        return jLongValue4 + (l22 != null ? l22.longValue() : 0L);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f196565a, zVar.f196565a) && Intrinsics.f(this.f196566b, zVar.f196566b) && Intrinsics.f(this.f196567c, zVar.f196567c) && Intrinsics.f(this.d, zVar.d) && Intrinsics.f(this.e, zVar.e);
    }

    public final int hashCode() {
        Long l2 = this.f196565a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.f196566b;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f196567c;
        int iHashCode3 = (iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.d;
        int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l22 = this.e;
        return iHashCode4 + (l22 != null ? l22.hashCode() : 0);
    }
}
