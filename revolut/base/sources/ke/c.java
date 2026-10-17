package ke;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f182927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f182928c;

    public c(String sessionId, long j2, Map additionalCustomKeys) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(additionalCustomKeys, "additionalCustomKeys");
        this.f182926a = sessionId;
        this.f182927b = j2;
        this.f182928c = additionalCustomKeys;
    }

    public final Map a() {
        return this.f182928c;
    }

    public final String b() {
        return this.f182926a;
    }

    public final long c() {
        return this.f182927b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f182926a, cVar.f182926a) && this.f182927b == cVar.f182927b && Intrinsics.f(this.f182928c, cVar.f182928c);
    }

    public final int hashCode() {
        return this.f182928c.hashCode() + a0.d.c(this.f182926a.hashCode() * 31, 31, this.f182927b);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f182926a + ", timestamp=" + this.f182927b + ", additionalCustomKeys=" + this.f182928c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
