package w1m;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293897a;

    public l(String transactionToken) {
        Intrinsics.checkNotNullParameter(transactionToken, "transactionToken");
        this.f293897a = transactionToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f293897a, ((l) obj2).f293897a);
    }

    public final int hashCode() {
        return this.f293897a.hashCode();
    }

    public final String toString() {
        return "TransactionApiAuthParams(transactionToken=" + ((Object) m.a(this.f293897a)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
