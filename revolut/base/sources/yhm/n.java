package yhm;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f314194a;

    public n(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f314194a = exception;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof n) {
            return Intrinsics.f(this.f314194a, ((n) obj2).f314194a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f314194a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f314194a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
