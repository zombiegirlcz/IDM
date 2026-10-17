package u1m;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2m.b f276472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f276473b;

    public h0(y2m.b processType, boolean z) {
        Intrinsics.checkNotNullParameter(processType, "processType");
        this.f276472a = processType;
        this.f276473b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return this.f276472a == h0Var.f276472a && this.f276473b == h0Var.f276473b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f276473b) + (this.f276472a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ValidProcessType(processType=");
        sb6.append(this.f276472a);
        sb6.append(", isRequired=");
        return j6.a.x(sb6, this.f276473b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
