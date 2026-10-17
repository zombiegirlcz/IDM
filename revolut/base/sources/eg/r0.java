package eg;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f125488c;
    public final long d;

    public r0(int i, String sessionId, String firstSessionId, long j2) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        this.f125486a = sessionId;
        this.f125487b = firstSessionId;
        this.f125488c = i;
        this.d = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f125486a, r0Var.f125486a) && Intrinsics.f(this.f125487b, r0Var.f125487b) && this.f125488c == r0Var.f125488c && this.d == r0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + j6.a.b(this.f125488c, p.a.c(this.f125486a.hashCode() * 31, 31, this.f125487b), 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("SessionDetails(sessionId=");
        sb6.append(this.f125486a);
        sb6.append(", firstSessionId=");
        sb6.append(this.f125487b);
        sb6.append(", sessionIndex=");
        sb6.append(this.f125488c);
        sb6.append(", sessionStartTimestampUs=");
        return a0.d.t(sb6, this.d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
