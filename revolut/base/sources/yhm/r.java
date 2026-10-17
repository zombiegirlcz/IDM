package yhm;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class r implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f314201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f314202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f314203c;

    public r(Object obj2, Object obj3, Object obj4) {
        this.f314201a = obj2;
        this.f314202b = obj3;
        this.f314203c = obj4;
    }

    public static r a(r rVar, Object obj2) {
        Object obj3 = rVar.f314201a;
        Object obj4 = rVar.f314202b;
        rVar.getClass();
        return new r(obj3, obj4, obj2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f314201a, rVar.f314201a) && Intrinsics.f(this.f314202b, rVar.f314202b) && Intrinsics.f(this.f314203c, rVar.f314203c);
    }

    public final int hashCode() {
        Object obj2 = this.f314201a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        Object obj3 = this.f314202b;
        int iHashCode2 = (iHashCode + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f314203c;
        return iHashCode2 + (obj4 != null ? obj4.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f314201a + ", " + this.f314202b + ", " + this.f314203c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
