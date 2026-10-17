package fg;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134863a;

    public e(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f134863a = sessionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f134863a, ((e) obj2).f134863a);
    }

    public final int hashCode() {
        return this.f134863a.hashCode();
    }

    public final String toString() {
        return j6.a.u(new StringBuilder("SessionDetails(sessionId="), this.f134863a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
