package eg;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125499a;

    public x(String str) {
        this.f125499a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f125499a, ((x) obj2).f125499a);
    }

    public final int hashCode() {
        String str = this.f125499a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return j6.a.u(new StringBuilder("FirebaseSessionsData(sessionId="), this.f125499a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
