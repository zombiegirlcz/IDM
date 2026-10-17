package u2m;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f276725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f276726b;

    public f(int i, int i2) {
        this.f276725a = i;
        this.f276726b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f276725a == fVar.f276725a && this.f276726b == fVar.f276726b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f276726b) + (Integer.hashCode(this.f276725a) * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Ng(imageResId=");
        sb6.append(this.f276725a);
        sb6.append(", textResId=");
        return j6.a.t(sb6, this.f276726b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
